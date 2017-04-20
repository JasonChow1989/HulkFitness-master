package com.gz.hkjs.app.ui.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

import com.gz.hkjs.app.R;
import com.gz.hkjs.app.util.CacheActivity;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.StatusBarCompat;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/4/13.
 */

public class JibenInformitionOne extends BaseActivity {


    @Bind(R.id.button_jinen_1)
    Button button1;
    @Bind(R.id.id_jiben1_cb1)
    CheckBox idJiben1Cb1;
    @Bind(R.id.id_jiben1_rl1)
    RelativeLayout idJiben1Rl1;
    @Bind(R.id.id_jiben1_cb2)
    CheckBox idJiben1Cb2;
    @Bind(R.id.id_jiben1_rl2)
    RelativeLayout idJiben1Rl2;
    @Bind(R.id.id_jiben1_cb3)
    CheckBox idJiben1Cb3;
    @Bind(R.id.id_jiben1_rl3)
    RelativeLayout idJiben1Rl3;

    /**
     * 入口
     *
     * @param activity
     */
    public static void startAction(Activity activity) {
        Intent intent = new Intent(activity, JibenInformitionOne.class);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.fade_in,
                com.jaydenxiao.common.R.anim.fade_out);
    }

    /**
     * 着色状态栏（4.4以上系统有效）
     */
    protected void SetStatusBarColor() {
        StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.start_color));
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!CacheActivity.activityList.contains(JibenInformitionOne.this)) {
            CacheActivity.addActivity(JibenInformitionOne.this);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_jibenxinxi_one;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JibenInformitionTwo.startAction(JibenInformitionOne.this);
            }
        });

    }

    @OnClick({R.id.id_jiben1_rl1, R.id.id_jiben1_rl2, R.id.id_jiben1_rl3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.id_jiben1_rl1:
                idJiben1Cb1.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben1Cb2.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben1Cb3.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
            case R.id.id_jiben1_rl2:
                idJiben1Cb2.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben1Cb1.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben1Cb3.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
            case R.id.id_jiben1_rl3:
                idJiben1Cb3.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben1Cb2.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben1Cb1.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
        }
    }
}
