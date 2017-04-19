package com.gz.hkjs.app.ui.main.presenter;

import com.gz.hkjs.app.R;
import com.gz.hkjs.app.app.AppConstant;
import com.gz.hkjs.app.bean.VideoData;
import com.gz.hkjs.app.ui.main.contract.TraningListContract;
import com.jaydenxiao.common.baserx.RxSubscriber;

import java.util.HashMap;
import java.util.List;

import rx.functions.Action1;

/**
 * Created by Administrator on 2017/3/16.
 */

public class TrainingListPresenter extends TraningListContract.Presenter {

    @Override
    public void onStart() {
        super.onStart();
        //监听返回顶部动作
        mRxManage.on(AppConstant.NEWS_LIST_TO_TOP, new Action1<Object>() {
            @Override
            public void call(Object o) {
                mView.scrolltoTop();
            }
        });
    }

    @Override
    public void getVideosListDataRequest(HashMap<String, String> map) {
        mRxManage.add(mModel.getVideosListData(map).subscribe(new RxSubscriber<List<VideoData.DataBean>>(mContext, false) {
            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }

            @Override
            protected void _onNext(List<VideoData.DataBean> videoDatas) {
                mView.returnVideosListData(videoDatas);
                mView.stopLoading();
            }

            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));
    }
}
