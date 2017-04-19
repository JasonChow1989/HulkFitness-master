package com.gz.hkjs.app.ui.main.model;

import com.gz.hkjs.app.api.Api;
import com.gz.hkjs.app.api.HostType;
import com.gz.hkjs.app.bean.VideoData;
import com.gz.hkjs.app.ui.main.contract.TraningListContract;
import com.jaydenxiao.common.baserx.RxSchedulers;
import com.jaydenxiao.common.commonutils.TimeUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by Administrator on 2017/3/16.
 */

public class TrainingListModel implements TraningListContract.Model {

    @Override
    public Observable<List<VideoData.DataBean>> getVideosListData(HashMap<String, String> map) {
        return Api.getDefault(HostType.NORMAL_HOSTTYPE).getVideoList(Api.getCacheControl(), map)
                .map(new Func1<VideoData, List<VideoData.DataBean>>() {
                    @Override
                    public List<VideoData.DataBean> call(VideoData videoData) {
                        return videoData.getData();
                    }
                })
                .compose(RxSchedulers.<List<VideoData.DataBean>>io_main());
    }
}
