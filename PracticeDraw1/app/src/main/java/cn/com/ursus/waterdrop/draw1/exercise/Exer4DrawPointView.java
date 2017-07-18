package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画点
 * <p>
 * ------ Canvas --------
 * drawPoint(float x, float y, Paint paint)  画一个点
 * <p>
 * drawPoints(float[] pts, Paint paint) 画多个点
 * drawPoints(float[] pts, int offset, int count, Paint paint) 画多个点
 * pts：     点的坐标的集合（一个点有 x 和 y 两个坐标）
 * offset ： 从集合中的第几个坐标开始画（从0开始数）
 * count：   画几个坐标（两个坐标一个点）
 * <p>
 * ------- Paint --------
 * setStrokeCap(Cap cap) 设置点的样式
 * Paint.Cap.ROUND:     圆头
 * Paint.Cap.BUTT:      平头
 * Paint.Cap.SQUARE:    方头
 */

public class Exer4DrawPointView extends View {

    public Exer4DrawPointView(Context context) {
        super(context);
    }

    public Exer4DrawPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer4DrawPointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 练习内容：使用 canvas.drawPoint() 方法画点
        // 一个圆点，一个方点
        // 圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(100);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(100, 100, paint);

        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(300, 100, paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(500, 100, paint);

        paint.setStrokeCap(Paint.Cap.ROUND);
        float[] points = {100, 350, 300, 350, 500, 350, 700, 350, 900, 350};
        canvas.drawPoints(points, 2, 6, paint);
    }
}
