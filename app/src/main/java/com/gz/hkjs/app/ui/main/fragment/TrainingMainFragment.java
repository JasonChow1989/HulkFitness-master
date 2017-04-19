package com.gz.hkjs.app.ui.main.fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.aspsine.irecyclerview.universaladapter.ViewHolderHelper;
import com.aspsine.irecyclerview.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.aspsine.irecyclerview.widget.LoadMoreFooterView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.gz.hkjs.app.R;
import com.gz.hkjs.app.api.ApiConstants;
import com.gz.hkjs.app.app.AppConstant;
import com.gz.hkjs.app.bean.VideoData;
import com.gz.hkjs.app.ui.main.activity.AddTraningPlanActivity;
import com.gz.hkjs.app.ui.main.activity.TrainDataChartViewActivity;
import com.gz.hkjs.app.ui.main.contract.TraningListContract;
import com.gz.hkjs.app.ui.main.model.TrainingListModel;
import com.gz.hkjs.app.ui.main.presenter.TrainingListPresenter;
import com.gz.hkjs.app.util.JMClassVedio;
import com.jaydenxiao.common.base.BaseFragment;
import com.jaydenxiao.common.commonwidget.LoadingTip;

import java.util.List;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/3/15.
 */

public class TrainingMainFragment extends BaseFragment<TrainingListPresenter, TrainingListModel> implements TraningListContract.View, OnRefreshListener, OnLoadMoreListener {

    @Bind(R.id.irc_traning)
    IRecyclerView ircTraning;
    @Bind(R.id.loadedTip)
    LoadingTip loadedTip;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    CommonRecycleViewAdapter<VideoData.DataBean> traningListAdapter;

    @Bind(R.id.id_back)
    ImageView idBack;
    @Bind(R.id.id_training_toolbar_title)
    ImageView idTrainingToolbarTitle;
    @Bind(R.id.id_training_right_tv)
    ImageView idTrainingRightTv;
    private int mStartPage = 1;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_traning;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    protected void initView() {

        traningListAdapter = new CommonRecycleViewAdapter<VideoData.DataBean>(getContext(), R.layout.item_train_all_vedio) {
            @Override
            public void convert(ViewHolderHelper helper, VideoData.DataBean dataBean) {
                ImageView img = helper.getView(R.id.item_train_all_img);
                TextView title = helper.getView(R.id.item_train_all_title);
                TextView time = helper.getView(R.id.item_train_all_time);
                TextView energy = helper.getView(R.id.item_train_all_energy);

                title.setText(dataBean.getName());
                time.setText(String.valueOf(Double.valueOf(dataBean.getWtime()) / 60).substring(0, String.valueOf(Double.valueOf(dataBean.getWtime()) / 60).indexOf(".")) + "分钟");
                energy.setText(dataBean.getEnergy() + "千卡");


                System.out.println("----------------time-------------" + dataBean.getWtime());
                Glide.with(mContext).load(dataBean.getLogo_url())
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .placeholder(com.jaydenxiao.common.R.drawable.ic_image_loading)
                        .error(com.jaydenxiao.common.R.drawable.ic_empty_picture)
                        .centerCrop().override(1090, 1090 * 3 / 4)
                        .fitCenter()
                        .crossFade().into(img);

            }
        };

        ircTraning.setAdapter(traningListAdapter);
        ircTraning.setLayoutManager(new LinearLayoutManager(getContext()));
        View head = LayoutInflater.from(getContext()).inflate(R.layout.layout_headerview_train, null);
        View foot = LayoutInflater.from(getContext()).inflate(R.layout.layout_footbutton_train, null);
        ircTraning.addHeaderView(head);
        ircTraning.addFooterView(foot);
        ircTraning.setOnRefreshListener(this);
        ircTraning.setOnLoadMoreListener(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRxManager.post(AppConstant.NEWS_LIST_TO_TOP, "");
            }
        });

        Button add = (Button) foot.findViewById(R.id.id_add_vedio_bt);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddTraningPlanActivity.startAction(getContext());
            }
        });

        //数据为空才重新发起请求
        if (traningListAdapter.getSize() <= 0) {
            //发起请求
            mStartPage = 1;
            mPresenter.getVideosListDataRequest(JMClassVedio.MyJMClass(AppConstant.OS, String.valueOf(mStartPage), AppConstant.VERSION_NUM, "1", ApiConstants.API_VEDIO_LIST));
        }

        idBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TrainDataChartViewActivity.startAction(getContext());
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onRefresh() {
        mStartPage = 1;
        //发起请求
        ircTraning.setRefreshing(true);
        mPresenter.getVideosListDataRequest(JMClassVedio.MyJMClass(AppConstant.OS, String.valueOf(mStartPage), AppConstant.VERSION_NUM, "1", ApiConstants.API_VEDIO_LIST));
    }

    @Override
    public void onLoadMore(View loadMoreView) {
        traningListAdapter.getPageBean().setRefresh(false);
        //发起请求
        ircTraning.setLoadMoreStatus(LoadMoreFooterView.Status.LOADING);
        mPresenter.getVideosListDataRequest(JMClassVedio.MyJMClass(AppConstant.OS, String.valueOf(mStartPage), AppConstant.VERSION_NUM, "1", ApiConstants.API_VEDIO_LIST));
    }

    @Override
    public void showLoading(String title) {
        if (traningListAdapter.getPageBean().isRefresh()) {
            loadedTip.setLoadingTip(LoadingTip.LoadStatus.loading);
        }
    }

    @Override
    public void stopLoading() {
        loadedTip.setLoadingTip(LoadingTip.LoadStatus.finish);
    }

    @Override
    public void showErrorTip(String msg) {
        if (traningListAdapter.getPageBean().isRefresh()) {
            loadedTip.setLoadingTip(LoadingTip.LoadStatus.loading);
        }
    }

    @Override
    public void returnVideosListData(List<VideoData.DataBean> videoDatas) {
        if (videoDatas != null) {
            mStartPage += 1;
            if (traningListAdapter.getPageBean().isRefresh()) {
                ircTraning.setRefreshing(false);
                traningListAdapter.replaceAll(videoDatas);
            } else {
                if (videoDatas.size() > 0) {
                    ircTraning.setLoadMoreStatus(LoadMoreFooterView.Status.GONE);
                    traningListAdapter.addAll(videoDatas);
                } else {
                    ircTraning.setLoadMoreStatus(LoadMoreFooterView.Status.THE_END);
                }
            }
        }
    }

    @Override
    public void scrolltoTop() {
        ircTraning.smoothScrollToPosition(0);
    }

}
