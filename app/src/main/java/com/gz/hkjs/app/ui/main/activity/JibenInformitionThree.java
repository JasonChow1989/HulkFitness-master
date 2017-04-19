package com.gz.hkjs.app.ui.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.gz.hkjs.app.R;
import com.gz.hkjs.app.util.CacheActivity;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.StatusBarCompat;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/4/13.
 */

public class JibenInformitionThree extends BaseActivity {


    @Bind(R.id.id_jiben3_fra1)
    RadioButton idJiben3Fra1;
    @Bind(R.id.id_jiben3_fra2)
    RadioButton idJiben3Fra2;
    @Bind(R.id.jiben_rl)
    RadioGroup jibenRl;
    @Bind(R.id.button_jinen_3)
    Button buttonJinen3;

    /**
     * 入口
     *
     * @param activity
     */
    public static void startAction(Activity activity) {
        Intent intent = new Intent(activity, JibenInformitionThree.class);
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
    public int getLayoutId() {
        return R.layout.activity_jibenxinxi_three;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!CacheActivity.activityList.contains(JibenInformitionThree.this)) {
            CacheActivity.addActivity(JibenInformitionThree.this);
        }
    }

    @Override
    public void initView() {

        jibenRl.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.id_jiben3_fra1) {
                    Drawable myImage = getResources().getDrawable(R.drawable.me_btn_selected);
                    idJiben3Fra1.setCompoundDrawablesWithIntrinsicBounds(null, null, myImage, null);
                    idJiben3Fra2.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);

                } else if (checkedId == R.id.id_jiben3_fra2) {
                    Drawable myImage = getResources().getDrawable(R.drawable.me_btn_selected);
                    idJiben3Fra2.setCompoundDrawablesWithIntrinsicBounds(null, null, myImage, null);
                    idJiben3Fra1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                }
            }
        });

    }

    @OnClick(R.id.button_jinen_3)
    public void onViewClicked() {
        JibenInformitionFour.startAction(this);
    }
}
