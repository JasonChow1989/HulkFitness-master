package com.gz.hkjs.app.ui.detail.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.universaladapter.ViewHolderHelper;
import com.aspsine.irecyclerview.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.gz.hkjs.app.R;
import com.gz.hkjs.app.api.ApiConstants;
import com.gz.hkjs.app.app.AppConstant;
import com.gz.hkjs.app.bean.TrainVedioDetail;
import com.gz.hkjs.app.ui.detail.contract.TrainingVedioDetailContract;
import com.gz.hkjs.app.ui.detail.model.TrainVedioDetailModel;
import com.gz.hkjs.app.ui.detail.presenter.TrainVedioDetailPresenter;
import com.gz.hkjs.app.util.JMClassDetail;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.StatusBarCompat;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/4/14.
 */

public class TrainingVideoDetailActivity extends BaseActivity<TrainVedioDetailPresenter, TrainVedioDetailModel> implements TrainingVedioDetailContract.View {


    @Bind(R.id.id_train_detail_vedio_list)
    IRecyclerView idTrainDetailVedioList;
    @Bind(R.id.id_train_detail_starttraining)
    Button idTrainDetailStarttraining;
    private String postId;
    private CommonRecycleViewAdapter<TrainVedioDetail.DataBean.StepBean> adapter;

    /**
     * 入口
     *
     * @param mContext
     * @param postId
     */
    public static void startAction(Context mContext, View view, String postId, String imgUrl) {
        Intent intent = new Intent(mContext, TrainingVideoDetailActivity.class);
        intent.putExtra("postid", postId);
        intent.putExtra("imgview", imgUrl);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions
                    .makeSceneTransitionAnimation((Activity) mContext, view, AppConstant.TRANSITION_ANIMATION_NEWS_PHOTOS);
            mContext.startActivity(intent, options.toBundle());
        } else {
            //让新的Activity从一个小的范围扩大到全屏
            ActivityOptionsCompat options = ActivityOptionsCompat
                    .makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
            ActivityCompat.startActivity((Activity) mContext, intent, options.toBundle());
        }
    }


    /**
     * 着色状态栏（4.4以上系统有效）
     */
    protected void SetStatusBarColor() {
        StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.alpha_50_white ));
    }

    /**
     * 着色状态栏（4.4以上系统有效）
     */
    protected void SetStatusBarColor(int color) {
        StatusBarCompat.setStatusBarColor(this, color);
    }

    /**
     * 沉浸状态栏（4.4以上系统有效）
     */
    protected void SetTranslanteBar() {
        StatusBarCompat.translucentStatusBar(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_training_vediodetail;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {
        postId = getIntent().getStringExtra("postid");
        System.out.println("---------postid---------:" + postId);

        adapter = new CommonRecycleViewAdapter<TrainVedioDetail.DataBean.StepBean>(this, R.layout.item_train_vedio_detail) {
            @Override
            public void convert(ViewHolderHelper helper, TrainVedioDetail.DataBean.StepBean stepBean) {

                ImageView imageView = helper.getView(R.id.id_item_trainvedio_detail_pic);

                Glide.with(mContext).load(stepBean.getLogo_url())
                        .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                        .placeholder(com.jaydenxiao.common.R.drawable.ic_image_loading)
                        .error(com.jaydenxiao.common.R.drawable.ic_empty_picture)
                        .centerCrop().override(1090, 1090 * 3 / 4)
                        .crossFade().into(imageView);
            }
        };


        if (adapter.getSize() <= 0) {
            mPresenter.getTrainVedioDetailDataRequest(JMClassDetail.MyJMClass(postId, AppConstant.OS, AppConstant.VERSION_NUM, ApiConstants.API_RECIPES_DETAIL));
        }


        idTrainDetailVedioList.setAdapter(adapter);
        idTrainDetailVedioList.setLayoutManager(new LinearLayoutManager(this));
        View headView = LayoutInflater.from(this).inflate(R.layout.header_trainingdetail, null);
        idTrainDetailVedioList.addHeaderView(headView);

    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }

    @Override
    public void returnTrainVedioDetailData(List<TrainVedioDetail.DataBean.StepBean> trainDetail) {
        if (trainDetail != null) {
            System.out.println("trainDetail----------------------------:" + trainDetail.size());
            if (trainDetail.size() > 0) {
                adapter.addAll(trainDetail);
            }
        }
    }
}
