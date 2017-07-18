package cn.com.ursus.waterdrop.draw1.exercise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:  ursus
 * Date:    17/7/11
 * Function: 练习填充颜色
 * <p>
 * ------- Canvas --------
 * drawColor(@ColorInt int color) 填充颜色
 * drawRGB(int r, int g, int b) 同上
 * drawARGB(int a, int r, int g, int b) 同上
 */

public class Exer1DrawColorView extends View {

    public Exer1DrawColorView(Context context) {
        super(context);
    }

    public Exer1DrawColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Exer1DrawColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW

        canvas.drawColor(Color.YELLOW);

    }
}
