package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class g extends RecyclerView.A {

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f18338i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f18339j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    protected PointF f18340k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f18341l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18342m = false;

    /* renamed from: n  reason: collision with root package name */
    private float f18343n;

    /* renamed from: o  reason: collision with root package name */
    protected int f18344o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f18345p = 0;

    public g(Context context) {
        this.f18341l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f18342m) {
            this.f18343n = v(this.f18341l);
            this.f18342m = true;
        }
        return this.f18343n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.f18340k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void C(RecyclerView.A.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a10);
        this.f18340k = a10;
        this.f18344o = (int) (a10.x * 10000.0f);
        this.f18345p = (int) (a10.y * 10000.0f);
        aVar.d((int) (((float) this.f18344o) * 1.2f), (int) (((float) this.f18345p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f18338i);
    }

    /* access modifiers changed from: protected */
    public void l(int i10, int i11, RecyclerView.B b10, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f18344o = y(this.f18344o, i10);
        int y10 = y(this.f18345p, i11);
        this.f18345p = y10;
        if (this.f18344o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.f18345p = 0;
        this.f18344o = 0;
        this.f18340k = null;
    }

    /* access modifiers changed from: protected */
    public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((double) ((t10 * t10) + (u10 * u10))));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f18339j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 == null || !e10.k()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e10.Q(view) - qVar.leftMargin, e10.T(view) + qVar.rightMargin, e10.e0(), e10.o0() - e10.f0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 == null || !e10.l()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e10.U(view) - qVar.topMargin, e10.O(view) + qVar.bottomMargin, e10.g0(), e10.W() - e10.d0(), i10);
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i10) {
        return (int) Math.ceil((double) (((float) Math.abs(i10)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.f18340k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
}
