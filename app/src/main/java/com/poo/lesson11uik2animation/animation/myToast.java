package com.poo.lesson11uik2animation.animation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.poo.lesson11uik2animation.R;

public class myToast {
    private Toast mToast;

    public myToast(Context context, String text, int gravity) {
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        mToast.setGravity(gravity, 0, 0);
    }
    public myToast(Context context, String text, int photo, int gravity) {
        mToast = new Toast(context);
        mToast.setGravity(gravity, 0, 0);
        mToast.setDuration(Toast.LENGTH_SHORT);

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_view, null);

        TextView tvText = view.findViewById(R.id.tv_text);
        ImageView ivPhoto = view.findViewById(R.id.iv_photo);

        tvText.setText(text);
        ivPhoto.setImageResource(photo);

        mToast.setView(view);
    }

    public myToast(Context context) {


    }

    public  void show(){
        if(mToast!=null){
            mToast.show();
        }
    }

}
