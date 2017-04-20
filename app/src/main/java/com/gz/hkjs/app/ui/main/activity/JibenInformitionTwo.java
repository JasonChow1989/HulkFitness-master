package com.gz.hkjs.app.ui.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

public class JibenInformitionTwo extends BaseActivity {


    @Bind(R.id.button_jinen_2)
    Button buttonJinen2;
    @Bind(R.id.id_jiben2_cb1)
    CheckBox idJiben2Cb1;
    @Bind(R.id.id_jiben2_rl1)
    RelativeLayout idJiben2Rl1;
    @Bind(R.id.id_jiben2_cb2)
    CheckBox idJiben2Cb2;
    @Bind(R.id.id_jiben2_rl2)
    RelativeLayout idJiben2Rl2;
    @Bind(R.id.id_jiben2_cb3)
    CheckBox idJiben2Cb3;
    @Bind(R.id.id_jiben2_rl3)
    RelativeLayout idJiben2Rl3;

    /**
     * 入口
     *
     * @param activity
     */
    public static void startAction(Activity activity) {
        Intent intent = new Intent(activity, JibenInformitionTwo.class);
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
        if (!CacheActivity.activityList.contains(JibenInformitionTwo.this)) {
            CacheActivity.addActivity(JibenInformitionTwo.this);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_jibenxinxi_two;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        buttonJinen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JibenInformitionThree.startAction(JibenInformitionTwo.this);
            }
        });
    }

    @OnClick({R.id.id_jiben2_rl1, R.id.id_jiben2_rl2, R.id.id_jiben2_rl3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.id_jiben2_rl1:
                idJiben2Cb1.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben2Cb2.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben2Cb3.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
            case R.id.id_jiben2_rl2:
                idJiben2Cb2.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben2Cb1.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben2Cb3.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
            case R.id.id_jiben2_rl3:
                idJiben2Cb3.setBackgroundResource(R.mipmap.me_information_btn_selected);
                idJiben2Cb2.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                idJiben2Cb1.setBackgroundResource(R.mipmap.me_information_btn_unselected);
                break;
        }
    }
}
