package com.example.user.graphicalprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Line extends View {
    public Paint paint;

    public Line(Context context) {
        super(context);
        paint=new Paint();
        paint.setColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        canvas.drawLine(100,100,150,150,paint);
        canvas.drawLine(150,100,100,150,paint);
    }
}
