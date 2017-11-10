package com.javahe.qqznav.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by zfc on 2017/11/10.
 *
 * 1.该View的占位是否是正方形
 */

public class MovedImageView extends android.support.v7.widget.AppCompatImageView {
    public MovedImageView(Context context) {
        super(context);
        init();
    }

    public MovedImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MovedImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {

    }
}
