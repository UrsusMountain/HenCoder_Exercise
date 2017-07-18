package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/11
 * Function: 练习画矩形
 * <p>
 * ------ Canvas --------
 * drawRect(float left, float top, float right, float bottom, Paint paint) 画矩形
 * drawRect(Rect rect, Paint paint) 同上
 * drawRect(RectF rect, Paint paint) 同上
 * <p>
 */

public class Exer3DrawRectView extends View{

    public Exer3DrawRectView(Context context) {
        super(context);
    }

    public Exer3DrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer3DrawRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        // 练习内容：使用 canvas.drawRect() 方法画矩形
        canvas.drawRect(100,100,200,200,paint);

        Rect rect = new Rect(300,100,400,200);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect,paint);

        RectF rectF = new RectF(100.5f,300.5f,400.5f,600.5f);
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawRect(rectF,paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(10);
        canvas.drawRect(500,100,1000,800,paint);
    }
}
