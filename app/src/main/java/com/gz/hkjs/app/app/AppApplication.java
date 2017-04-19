package com.gz.hkjs.app.app;

import android.content.Context;
import android.content.SharedPreferences;

import com.gz.hkjs.app.BuildConfig;
import com.jaydenxiao.common.baseapp.BaseApplication;
import com.jaydenxiao.common.commonutils.LogUtils;
import com.jaydenxiao.common.commonutils.TimeUtil;

/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {
    private static SharedPreferences mPreferences;
    private static Context mContext;
    public static synchronized SharedPreferences getPreferences() {
        return mPreferences;
    }
    public static Context getContext() {
        return mContext;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化logger
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
        mContext = getApplicationContext();
        mPreferences = getSharedPreferences("config", Context.MODE_PRIVATE);
        addDefaultCache(mPreferences);
    }

    private void addDefaultCache(SharedPreferences mPreferences) {
        String defaultCache = mPreferences.getString("cache", "-1");
        SharedPreferences.Editor editor = mPreferences.edit();
        if (defaultCache.equals("-1")) {
            editor.putString("cache", "0");
            String str = TimeUtil.getSystemTime("yyyyMMdd");
            editor.putString("date", str);
        }
        editor.commit();
    }
}
