package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/17
 * Function: 画自定义图形
 * <p>
 * ------ Canvas --------
 * drawPath(Path path, Paint paint) 画自定义图形
 * <p>
 * ------ Path --------
 * addXxx() ——添加子图形
 * eg ：
 * addCircle(float x, float y, float radius, Direction dir) 添加圆
 * Direction
 * - CW    顺时针 (CW clockwise)
 * - CWW   逆时针 (CCW counter-clockwise)
 * ...
 * <p>
 * xxxTo() ——画线（直线或曲线）
 * eg :
 * 1. moveTo(float x, float y) / rMoveTo(float x, float y) 移动到目标位置
 * 2. lineTo(float x, float y) / rLineTo(float x, float y) 画直线
 * 3. quadTo(float x1, float y1, float x2, float y2) 画二次贝塞尔曲线
 * 4. rQuadTo(float dx1, float dy1, float dx2, float dy2) 画二次贝塞尔曲线
 * 5. cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) 画三次贝塞尔曲线
 * 6. rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3) 画三次贝塞尔曲线
 * 7. arcTo(RectF oval, float startAngle, float sweepAngle, boolean forceMoveTo) 画弧形
 * 8. arcTo(float left, float top, float right, float bottom, float startAngle, float sweepAngle,
 * boolean forceMoveTo) 画弧形
 * 9. arcTo(RectF oval, float startAngle, float sweepAngle) 画弧形
 * <p>
 * setFillType(Path.FillType ft) 设置填充方式
 * FillType
 * - EVEN_ODD  奇偶原则
 * - WINDING   非零环绕数原则（默认值）
 * - INVERSE_EVEN_ODD
 * - INVERSE_WINDING
 */

public class Exer9DrawPathView extends View {

    public Exer9DrawPathView(Context context) {
        super(context);
    }

    public Exer9DrawPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer9DrawPathView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);

        Path path1 = new Path();
        path1.moveTo(50, 50);
        path1.lineTo(200, 200);
//        path.rLineTo(200,0);
        path1.arcTo(200, 200, 400, 400, 270, 270, false);
        path1.close();
        canvas.drawPath(path1, paint);

//        Path path2 = new Path();
//        path2.moveTo(400,400);
//        path2.quadTo(100,800,600,800);
//        canvas.drawPath(path2,paint);


        //绘制 心形
        Path path3 = new Path();
        path3.arcTo(500, 100, 600, 200, 180, 180, true);
        path3.arcTo(600, 100, 700, 200, 180, 180, true);
        path3.quadTo(700, 200, 600, 300);
        path3.quadTo(500, 200, 500, 150);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path3, paint);

        //setFillType
        Path path4 = new Path();
        path4.addCircle(600, 800, 200, Path.Direction.CW);
        path4.addCircle(600, 1100, 200, Path.Direction.CW);
        paint.setStyle(Paint.Style.FILL);
        path4.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path4, paint);


    }
}
