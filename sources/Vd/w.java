package vd;

import android.view.MotionEvent;
import kotlin.jvm.internal.C6496s;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final a f61991a;

    /* renamed from: b  reason: collision with root package name */
    private long f61992b;

    /* renamed from: c  reason: collision with root package name */
    private long f61993c;

    /* renamed from: d  reason: collision with root package name */
    private double f61994d;

    /* renamed from: e  reason: collision with root package name */
    private double f61995e;

    /* renamed from: f  reason: collision with root package name */
    private float f61996f;

    /* renamed from: g  reason: collision with root package name */
    private float f61997g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f61998h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f61999i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private boolean f62000j;

    public interface a {
        boolean a(w wVar);

        boolean b(w wVar);

        void c(w wVar);
    }

    public w(a aVar) {
        this.f61991a = aVar;
    }

    private final void a() {
        if (this.f61998h) {
            this.f62000j = false;
            this.f61998h = false;
            a aVar = this.f61991a;
            if (aVar != null) {
                aVar.c(this);
            }
        }
    }

    private final void g() {
        if (!this.f62000j) {
            this.f62000j = true;
        }
    }

    private final void h(double d10) {
        if (this.f62000j) {
            this.f61994d = d10;
            this.f62000j = false;
        }
    }

    private final void i(MotionEvent motionEvent) {
        double d10;
        this.f61993c = this.f61992b;
        this.f61992b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f61999i[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f61999i[1]);
        if (findPointerIndex != -1 && findPointerIndex2 != -1) {
            float x10 = motionEvent.getX(findPointerIndex);
            float y10 = motionEvent.getY(findPointerIndex);
            float x11 = motionEvent.getX(findPointerIndex2);
            float y11 = motionEvent.getY(findPointerIndex2);
            float f10 = y11 - y10;
            this.f61996f = (x10 + x11) * 0.5f;
            this.f61997g = (y10 + y11) * 0.5f;
            double d11 = -Math.atan2((double) f10, (double) (x11 - x10));
            h(d11);
            if (Double.isNaN(this.f61994d)) {
                d10 = 0.0d;
            } else {
                d10 = this.f61994d - d11;
            }
            this.f61995e = d10;
            this.f61994d = d11;
            if (d10 > 3.141592653589793d) {
                this.f61995e = d10 - 3.141592653589793d;
            } else if (d10 < -3.141592653589793d) {
                this.f61995e = d10 + 3.141592653589793d;
            }
            double d12 = this.f61995e;
            if (d12 > 1.5707963267948966d) {
                this.f61995e = d12 - 3.141592653589793d;
            } else if (d12 < -1.5707963267948966d) {
                this.f61995e = d12 + 3.141592653589793d;
            }
        }
    }

    public final float b() {
        return this.f61996f;
    }

    public final float c() {
        return this.f61997g;
    }

    public final double d() {
        return this.f61995e;
    }

    public final long e() {
        return this.f61992b - this.f61993c;
    }

    public final boolean f(MotionEvent motionEvent) {
        a aVar;
        C6496s.h(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f61998h = false;
            this.f61999i[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f61999i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.f61998h || this.f62000j) {
                    this.f61999i[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i(motionEvent);
                }
                if (!this.f61998h) {
                    this.f61998h = true;
                    this.f61993c = motionEvent.getEventTime();
                    this.f61994d = Double.NaN;
                    a aVar2 = this.f61991a;
                    if (aVar2 != null) {
                        aVar2.b(this);
                    }
                }
            } else if (actionMasked == 6 && this.f61998h) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.f61999i;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.f61998h) {
            i(motionEvent);
            if (!this.f62000j && (aVar = this.f61991a) != null) {
                aVar.a(this);
            }
        }
        return true;
    }
}
