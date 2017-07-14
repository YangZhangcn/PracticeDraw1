package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

public class Practice10HistogramView extends View {

    private List<HistogramData> datas;

    private Paint linePaint,rectPaint,textPaint;

    private int mBackgroundColor,mLineColor,mRectColor;
    
    private int mWidth,mHeight,mPaddingLeft,mPaddingTop,mPaddingRight,mPaddingBottom;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST){
            setMeasuredDimension(widthSize,heightSize);
        }else if (widthMode == MeasureSpec.AT_MOST){
            setMeasuredDimension(200,heightSize);
        }else if (heightMode == MeasureSpec.AT_MOST){
            setMeasuredDimension(widthSize,200);
        }
        mWidth = getWidth();
        mHeight = getHeight();
        mPaddingLeft = mWidth/20 + getPaddingLeft();
        mPaddingTop = mHeight/20 + getPaddingTop();
        mPaddingRight = mWidth/20 + getPaddingRight();
        mPaddingBottom = mHeight/20 + getPaddingBottom();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }


    /**
     * 图标数据类接口
     */
    public interface HistogramData{

        String getName(int position);

        String getValue(int position);

        String getDesc(int position);

    }
}
