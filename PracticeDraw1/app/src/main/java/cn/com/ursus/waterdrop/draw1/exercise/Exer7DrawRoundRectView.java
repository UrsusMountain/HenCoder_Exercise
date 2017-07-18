package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画带圆角的矩形
 * <p>
 * ------ Canvas --------
 * drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint)
 * 画圆角矩形
 */

public class Exer7DrawRoundRectView extends View {

    public Exer7DrawRoundRectView(Context context) {
        super(context);
    }

    public Exer7DrawRoundRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer7DrawRoundRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        // 练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形

        paint.setStrokeWidth(5);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(50, 50, 450, 250, 30, 30, paint);

        paint.setStyle(Paint.Style.STROKE);
        RectF rectf = new RectF(50, 350, 450, 550);
        canvas.drawRoundRect(rectf, 30, 30, paint);
    }
}
