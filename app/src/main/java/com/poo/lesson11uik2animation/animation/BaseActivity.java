package com.poo.lesson11uik2animation.animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.poo.lesson11uik2animation.R;

public abstract class BaseActivity extends AppCompatActivity implements Animation.AnimationListener, View.OnClickListener {
    private Animation mAnim;
    private int mId;
    private boolean isAnimStart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(findByID());
        initView();
        mAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAnim.setAnimationListener(this);
    }

    protected abstract void initView();

    protected abstract int findByID();

    @Override
    public final void onAnimationStart(Animation animation) {

    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        isAnimStart=false;
        clickView(mId);
    }

    protected void clickView(int mAnim) {

    }

    @Override
    public final void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onClick(View v) {
        if(!isAnimStart){
            isAnimStart=true;
            mId = v.getId();
            v.startAnimation(mAnim);
        }


    }
}
