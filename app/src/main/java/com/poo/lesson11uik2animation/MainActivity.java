package com.poo.lesson11uik2animation;

import android.os.Bundle;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    private Animation mAnim;
    private ImageView ivHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    protected void initView() {
        mAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAnim.setAnimationListener(this);

        TextView tvSos = findViewById(R.id.tv_sos);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.set_anim);
        tvSos.startAnimation(anim);

        TextView tvEnd = findViewById(R.id.tv_end);
        TextView tvStart = findViewById(R.id.tv_start);

        tvEnd.startAnimation(AnimationUtils.loadAnimation(this, R.anim.silde_from_left));
        tvStart.startAnimation(AnimationUtils.loadAnimation(this, R.anim.silde_from_right));

        ivHome = findViewById(R.id.iv_home);
//        ivHome.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha_anim));
        ivHome.setOnClickListener(this);

    }

    @Override
    protected int findByID() {
        return R.layout.activity_main;
    }


    @Override
    protected void clickView(int mId) {
        if (mId == R.id.iv_home) {
            new myToast(this, "HOME", R.drawable.ic_launcher, Gravity.CENTER).show();

        }
    }

}
