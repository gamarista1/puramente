package la;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import la.d;

final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f46448a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f46449b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private final a f46450c;

    /* renamed from: d  reason: collision with root package name */
    private final float f46451d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f46452e;

    /* renamed from: f  reason: collision with root package name */
    private volatile float f46453f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f46450c = aVar;
        this.f46451d = f10;
        this.f46452e = new GestureDetector(context, this);
        this.f46453f = 3.1415927f;
    }

    public void a(float[] fArr, float f10) {
        this.f46453f = -f10;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f46448a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f46448a.x) / this.f46451d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f46448a;
        float f12 = (y10 - pointF.y) / this.f46451d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.f46453f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f46449b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f46450c.b(this.f46449b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f46450c.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f46452e.onTouchEvent(motionEvent);
    }
}
