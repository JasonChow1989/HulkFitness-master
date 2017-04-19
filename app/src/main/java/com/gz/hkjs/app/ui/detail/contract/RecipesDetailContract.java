package com.gz.hkjs.app.ui.detail.contract;

import com.gz.hkjs.app.bean.FindSummary;
import com.gz.hkjs.app.bean.RecipesDetail;
import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import java.util.HashMap;
import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/3/16.
 */

public interface RecipesDetailContract {

    interface Model extends BaseModel {
        //请求获取发现
        Observable<RecipesDetail.DataBean> getRecipesDetailData(HashMap<String,String> map);
    }

    interface View extends BaseView {
        void returnRecipesDetailData(RecipesDetail.DataBean recipesDetail);
    }

    abstract static class Presenter extends BasePresenter<View, Model> {

        //发起发现请求
        public abstract void getRecipesDetailDataRequest(HashMap<String,String> map);
    }
}
