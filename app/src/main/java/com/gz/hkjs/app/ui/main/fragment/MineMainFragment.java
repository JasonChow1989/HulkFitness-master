package com.gz.hkjs.app.ui.main.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gz.hkjs.app.R;
import com.gz.hkjs.app.util.CacheDataManager;
import com.jaydenxiao.common.base.BaseFragment;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/3/15.
 */

public class MineMainFragment extends BaseFragment {

    @Bind(R.id.ntb)
    NormalTitleBar ntb;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        ntb.setTvLeftVisiable(false);
        ntb.setTitleText(getString(R.string.mine));

        //new Thread(new clearCache()).start();
    }

    class clearCache implements Runnable {
        @Override
        public void run() {
            try {
                CacheDataManager.clearAllCache(getContext());
                Thread.sleep(3000);
                if (CacheDataManager.getTotalCacheSize(getContext()).startsWith("0")) {
                    handler.sendEmptyMessage(0);
                }
            } catch (Exception e) {
                return;
            }
        }
    }

    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case 0:
                    Toast.makeText(getContext(), "清理完成", Toast.LENGTH_SHORT).show();
                    try {
                        //txtCacheSize.setText(CacheDataManager.getTotalCacheSize(SettingsActivity.this));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    };
}
