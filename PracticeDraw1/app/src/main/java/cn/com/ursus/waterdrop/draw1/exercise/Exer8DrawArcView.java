package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画弧形
 * <p>
 * ------ Canvas --------
 * drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle,
 * boolean useCenter, Paint paint) 绘制弧形或扇形
 * left,top,right,bottom :  这四个参数可以理解为画了一个椭圆
 * startAngle :             弧形的开始角度，已椭圆最右边的点开始，顺时针度数为正，逆时针为负
 * sweepAngle :             弧形划过的角度
 * useCenter :              是否将弧线的两端跟原点连起来
 */

public class Exer8DrawArcView extends View {

    public Exer8DrawArcView(Context context) {
        super(context);
    }

    public Exer8DrawArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer8DrawArcView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        // 练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 800, 600, 0, 120, true, paint);
        canvas.drawArc(200, 100, 800, 600, 120, 120, false, paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 600, 240, 120, true, paint);
    }
}
