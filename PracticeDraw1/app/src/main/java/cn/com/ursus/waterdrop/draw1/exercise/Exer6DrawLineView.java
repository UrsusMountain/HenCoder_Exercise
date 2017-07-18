package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画线
 * <p>
 * ------ Canvas --------
 * drawLine(float startX, float startY, float stopX, float stopY, Paint paint) 画线
 * <p>
 * drawLines(float[] pts, int offset, int count, Paint paint) 画线（批量）
 * drawLines(float[] pts, Paint paint) 同上
 */

public class Exer6DrawLineView extends View {

    public Exer6DrawLineView(Context context) {
        super(context);
    }

    public Exer6DrawLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer6DrawLineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStrokeWidth(5);

        //练习内容：使用 canvas.drawLine() 方法画直线

        canvas.drawLine(550, 550, 1000, 1000, paint);

        float[] points = {20, 20, 120, 20
                , 70, 20, 70, 120
                , 20, 120, 120, 120
                , 150, 20, 250, 20
                , 150, 20, 150, 120
                , 250, 20, 250, 120
                , 150, 120, 250, 120};
        canvas.drawLines(points, paint);
    }
}
