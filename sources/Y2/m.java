package y2;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import y2.d;

final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f28715a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f28716b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private final a f28717c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28718d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f28719e;

    /* renamed from: f  reason: collision with root package name */
    private volatile float f28720f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f28717c = aVar;
        this.f28718d = f10;
        this.f28719e = new GestureDetector(context, this);
        this.f28720f = 3.1415927f;
    }

    public void a(float[] fArr, float f10) {
        this.f28720f = -f10;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f28715a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f28715a.x) / this.f28718d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f28715a;
        float f12 = (y10 - pointF.y) / this.f28718d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.f28720f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f28716b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f28717c.b(this.f28716b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f28717c.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f28719e.onTouchEvent(motionEvent);
    }
}
