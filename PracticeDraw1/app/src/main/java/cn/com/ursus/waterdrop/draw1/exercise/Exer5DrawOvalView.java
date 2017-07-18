package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画椭圆
 * <p>
 * ------ Canvas --------
 * drawOval(float left, float top, float right, float bottom, Paint paint) 画椭圆
 */

public class Exer5DrawOvalView extends View {

    public Exer5DrawOvalView(Context context) {
        super(context);
    }

    public Exer5DrawOvalView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer5DrawOvalView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 练习内容：使用 canvas.drawOval() 方法画椭圆
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(100, 100, 400, 300, paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(500, 100, 800, 300, paint);
    }
}
