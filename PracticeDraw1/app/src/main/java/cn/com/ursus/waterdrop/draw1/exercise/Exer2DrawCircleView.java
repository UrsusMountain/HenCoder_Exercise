package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/11
 * Function: 练习画圆 Canvas.drawCircle(float centerX, float centerY, float radius, Paint paint)
 * <p>
 * ------ Canvas --------
 * drawCircle(float centerX, float centerY, float radius, Paint paint) 画圆
 * <p>
 * ------- Paint --------
 * <p>
 * setStyle(Paint.Style style) 绘图模式
 * Style 具体来说有三种，默认是FILL
 * FILL             ：填充模式
 * STROKE           ：画线模式
 * FILL_AND_STROK   ：既画线又填充
 * <p>
 * setStrokeWidth(float width) 设置现款
 * <p>
 * setAntiAlias(boolean b) 设置抗锯齿
 * Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG) 同上
 * <p>
 * setColor(int color) 设置颜色
 */

public class Exer2DrawCircleView extends View {

    public Exer2DrawCircleView(Context context) {
        super(context);
    }

    public Exer2DrawCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer2DrawCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 练习内容：使用 canvas.drawCircle() 方法画圆
        // 一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 200, 200, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 200, 200, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 800, 200, paint);

        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800, 800, 200, paint);
    }
}
