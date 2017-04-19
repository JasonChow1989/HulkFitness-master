package com.gz.hkjs.app.ui.main.contract;

import com.gz.hkjs.app.bean.VideoData;
import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import java.util.HashMap;
import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/3/16.
 */

public interface TraningListContract {

    /**
     * des:视频列表contract
     */
    interface Model extends BaseModel {
        //请求获取视频
        Observable<List<VideoData.DataBean>> getVideosListData(HashMap<String, String> map);
    }

    interface View extends BaseView {
        //返回获取的视频
        void returnVideosListData(List<VideoData.DataBean> videoSummaries);

        //返回顶部
        void scrolltoTop();
    }

    abstract static class Presenter extends BasePresenter<View, Model> {
        //发起获取视频请求
        public abstract void getVideosListDataRequest(HashMap<String, String> map);
    }
}
