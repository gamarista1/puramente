package V;

import X.v;
import Y.C1500m;
import Y.C1506p;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;
import r0.C2544x0;
import r0.C2547y0;
import r0.i2;
import t0.C2605f;
import t0.C2606g;
import w.C2795g0;

/* renamed from: V.o0  reason: case insensitive filesystem */
public final class C1398o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1398o0 f7856a = new C1398o0();

    /* renamed from: b  reason: collision with root package name */
    private static final float f7857b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f7858c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f7859d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f7860e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f7861f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f7862g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f7863h;

    /* renamed from: i  reason: collision with root package name */
    private static final C2795g0 f7864i = new C2795g0(1.0f, 50.0f, Float.valueOf(0.001f));

    static {
        v vVar = v.f9514a;
        f7857b = vVar.f();
        i2.a aVar = i2.f25529a;
        f7858c = aVar.b();
        f7859d = aVar.b();
        f7860e = aVar.b();
        f7861f = vVar.d();
        f7862g = vVar.b();
        f7863h = vVar.b();
    }

    private C1398o0() {
    }

    public final void a(C2605f fVar, float f10, long j10, int i10) {
        float min = Math.min(fVar.t1(f10), C2427m.i(fVar.d()));
        float i11 = (C2427m.i(fVar.d()) - min) / ((float) 2);
        if (i2.e(i10, i2.f25529a.b())) {
            float f11 = min / 2.0f;
            C2605f.n0(fVar, j10, f11, C2422h.a((C2427m.k(fVar.d()) - f11) - i11, C2427m.i(fVar.d()) / 2.0f), 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
            return;
        }
        C2605f.c0(fVar, j10, C2422h.a((C2427m.k(fVar.d()) - min) - i11, (C2427m.i(fVar.d()) - min) / 2.0f), C2428n.a(min, min), 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
    }

    public final long b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long h10 = C1404s.h(v.f9514a.a(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public final int c() {
        return f7860e;
    }

    public final long d(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1947901123, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long g10 = C2544x0.f25560b.g();
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }

    public final float e() {
        return f7857b;
    }

    public final long f(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-914312983, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long h10 = C1404s.h(v.f9514a.a(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public final float g() {
        return f7862g;
    }

    public final int h() {
        return f7858c;
    }

    public final long i(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1677541593, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long h10 = C1404s.h(v.f9514a.e(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public final float j() {
        return f7861f;
    }
}
