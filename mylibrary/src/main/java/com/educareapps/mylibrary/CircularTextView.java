package com.educareapps.mylibrary;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Probook 440 on 8/21/2016.
 * <p/>
 * <p/>
 * custom circular textview
 * setStrokWidth() for Stork Width
 * setSolidColor() for fill background color
 */
public class CircularTextView extends TextView {

    private float strokeWidth = 1;
    int strokeColor = Color.parseColor("#ffffff"), solidColor = Color.parseColor("#000000");

    public CircularTextView(Context context) {
        super(context);

    }

    public CircularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CircularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    public void draw(Canvas canvas) {

        Paint circlePaint = new Paint();
        circlePaint.setColor(solidColor);
        circlePaint.setFlags(Paint.ANTI_ALIAS_FLAG);

        Paint strokePaint = new Paint();
        strokePaint.setColor(strokeColor);
        strokePaint.setFlags(Paint.ANTI_ALIAS_FLAG);

        int h = this.getHeight();
        int w = this.getWidth();

        int diameter = ((h > w) ? h : w);
        int radius = diameter / 2;

        this.setHeight(diameter);
        this.setWidth(diameter);

        canvas.drawCircle(diameter / 2, diameter / 2, radius, strokePaint);

        canvas.drawCircle(diameter / 2, diameter / 2, radius - strokeWidth, circlePaint);

        super.draw(canvas);
    }

    public void setStrokeWidth(int dp) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        strokeWidth = dp * scale;

    }


    public void setSolidColor(int color) {
        solidColor = color;
    }
    public  int getSolidColor(){
    return solidColor;
}

}