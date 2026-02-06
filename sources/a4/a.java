package A4;

import android.graphics.PointF;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f29335a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f29336b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f29337c;

    public a() {
        this.f29335a = new PointF();
        this.f29336b = new PointF();
        this.f29337c = new PointF();
    }

    public PointF a() {
        return this.f29335a;
    }

    public PointF b() {
        return this.f29336b;
    }

    public PointF c() {
        return this.f29337c;
    }

    public void d(float f10, float f11) {
        this.f29335a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f29336b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f29337c.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(this.f29337c.x), Float.valueOf(this.f29337c.y), Float.valueOf(this.f29335a.x), Float.valueOf(this.f29335a.y), Float.valueOf(this.f29336b.x), Float.valueOf(this.f29336b.y)});
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f29335a = pointF;
        this.f29336b = pointF2;
        this.f29337c = pointF3;
    }
}
