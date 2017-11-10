package com.javahe.qqznav.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by zfc on 2017/11/10.
 * <p>
 * 1.该View的占位是否是正方形
 */

public class MovedImageView extends android.support.v7.widget.AppCompatImageView {
    /**
     * the max distance this MovedImageView can move
     */
    private int maxMoveDistance;
    private Position initPosition;
    boolean isFirstLayout = true;

    public MovedImageView(Context context) {
        super(context);
        init();
    }

    public MovedImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MovedImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }


    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (isFirstLayout) {
            isFirstLayout = false;
            initPosition = getCurrentPosion();
        }

    }

    /**
     * this MovedImageView changes its positions
     *
     * @param distance
     */
    public void move(Position detaP) {
        detaP.legalDistance();
        // position this view
        setLeft(getLeft() + detaP.x);
        setTop(getTop() + detaP.y);
        requestLayout();
    }




    /**
     * get this view currentPostion
     *
     * @return
     */
    public Position getCurrentPosion() {
        Position position = new Position();
        position.x = getLeft() + getWidth() / 2;
        position.y = getTop() + getHeight() / 2;
        return position;
    }


    public static class Position {
        public int x;
        public int y;
        public int maxMoveDistance = 1000;

        public void legalDistance() {
            if (getRealDistance() <= maxMoveDistance) {
                return ;
            }

            int tmpX = (int) (maxMoveDistance * 1d / getRealDistance() * x + 0.5);
            int tmpY = (int) (maxMoveDistance * 1d / getRealDistance() * y + 0.5);

            x = tmpX;
            y = tmpY;
        }

        public int getRealDistance() {
            return (int) (Math.sqrt(x * x + y * y));
        }
    }
}


