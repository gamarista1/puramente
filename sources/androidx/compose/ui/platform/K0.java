package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.C6496s;
import q0.C2415a;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2425k;
import q0.C2426l;
import q0.C2427m;
import q0.C2428n;
import r0.C2469V;
import r0.C2472Y;
import r0.O1;
import r0.S1;

public final class K0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13596a = true;

    /* renamed from: b  reason: collision with root package name */
    private final Outline f13597b;

    /* renamed from: c  reason: collision with root package name */
    private O1 f13598c;

    /* renamed from: d  reason: collision with root package name */
    private S1 f13599d;

    /* renamed from: e  reason: collision with root package name */
    private S1 f13600e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13601f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13602g;

    /* renamed from: h  reason: collision with root package name */
    private S1 f13603h;

    /* renamed from: i  reason: collision with root package name */
    private C2425k f13604i;

    /* renamed from: j  reason: collision with root package name */
    private float f13605j;

    /* renamed from: k  reason: collision with root package name */
    private long f13606k;

    /* renamed from: l  reason: collision with root package name */
    private long f13607l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13608m;

    /* renamed from: n  reason: collision with root package name */
    private S1 f13609n;

    /* renamed from: o  reason: collision with root package name */
    private S1 f13610o;

    public K0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f13597b = outline;
        this.f13606k = C2421g.f25320b.c();
        this.f13607l = C2427m.f25341b.b();
    }

    private final boolean g(C2425k kVar, long j10, long j11, float f10) {
        if (kVar != null && C2426l.e(kVar) && kVar.e() == C2421g.m(j10) && kVar.g() == C2421g.n(j10) && kVar.f() == C2421g.m(j10) + C2427m.k(j11) && kVar.a() == C2421g.n(j10) + C2427m.i(j11) && C2415a.d(kVar.h()) == f10) {
            return true;
        }
        return false;
    }

    private final void i() {
        if (this.f13601f) {
            this.f13606k = C2421g.f25320b.c();
            this.f13605j = 0.0f;
            this.f13600e = null;
            this.f13601f = false;
            this.f13602g = false;
            O1 o12 = this.f13598c;
            if (o12 == null || !this.f13608m || C2427m.k(this.f13607l) <= 0.0f || C2427m.i(this.f13607l) <= 0.0f) {
                this.f13597b.setEmpty();
                return;
            }
            this.f13596a = true;
            if (o12 instanceof O1.b) {
                k(((O1.b) o12).b());
            } else if (o12 instanceof O1.c) {
                l(((O1.c) o12).b());
            } else if (o12 instanceof O1.a) {
                j(((O1.a) o12).b());
            }
        }
    }

    private final void j(S1 s12) {
        if (Build.VERSION.SDK_INT > 28 || s12.b()) {
            Outline outline = this.f13597b;
            if (s12 instanceof C2469V) {
                outline.setConvexPath(((C2469V) s12).u());
                this.f13602g = !this.f13597b.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f13596a = false;
            this.f13597b.setEmpty();
            this.f13602g = true;
        }
        this.f13600e = s12;
    }

    private final void k(C2423i iVar) {
        this.f13606k = C2422h.a(iVar.i(), iVar.l());
        this.f13607l = C2428n.a(iVar.n(), iVar.h());
        this.f13597b.setRect(Math.round(iVar.i()), Math.round(iVar.l()), Math.round(iVar.j()), Math.round(iVar.e()));
    }

    private final void l(C2425k kVar) {
        float d10 = C2415a.d(kVar.h());
        this.f13606k = C2422h.a(kVar.e(), kVar.g());
        this.f13607l = C2428n.a(kVar.j(), kVar.d());
        if (C2426l.e(kVar)) {
            this.f13597b.setRoundRect(Math.round(kVar.e()), Math.round(kVar.g()), Math.round(kVar.f()), Math.round(kVar.a()), d10);
            this.f13605j = d10;
            return;
        }
        S1 s12 = this.f13599d;
        if (s12 == null) {
            s12 = C2472Y.a();
            this.f13599d = s12;
        }
        s12.reset();
        S1.a(s12, kVar, (S1.b) null, 2, (Object) null);
        j(s12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (g(r1, r7.f13606k, r7.f13607l, r6) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r0.C2520p0 r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r0.S1 r0 = r20.d()
            r9 = 0
            r10 = 2
            r11 = 0
            if (r0 == 0) goto L_0x0012
            r0.C2520p0.p(r8, r0, r9, r10, r11)
            goto L_0x00a3
        L_0x0012:
            float r6 = r7.f13605j
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            r0.S1 r13 = r7.f13603h
            q0.k r1 = r7.f13604i
            if (r13 == 0) goto L_0x002b
            long r2 = r7.f13606k
            long r4 = r7.f13607l
            r0 = r20
            boolean r0 = r0.g(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x006e
        L_0x002b:
            long r0 = r7.f13606k
            float r14 = q0.C2421g.m(r0)
            long r0 = r7.f13606k
            float r15 = q0.C2421g.n(r0)
            long r0 = r7.f13606k
            float r0 = q0.C2421g.m(r0)
            long r1 = r7.f13607l
            float r1 = q0.C2427m.k(r1)
            float r16 = r0 + r1
            long r0 = r7.f13606k
            float r0 = q0.C2421g.n(r0)
            long r1 = r7.f13607l
            float r1 = q0.C2427m.i(r1)
            float r17 = r0 + r1
            float r0 = r7.f13605j
            long r18 = q0.C2416b.b(r0, r12, r10, r11)
            q0.k r0 = q0.C2426l.c(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x0064
            r0.S1 r13 = r0.C2472Y.a()
            goto L_0x0067
        L_0x0064:
            r13.reset()
        L_0x0067:
            r0.S1.a(r13, r0, r11, r10, r11)
            r7.f13604i = r0
            r7.f13603h = r13
        L_0x006e:
            r0.C2520p0.p(r8, r13, r9, r10, r11)
            goto L_0x00a3
        L_0x0072:
            long r0 = r7.f13606k
            float r9 = q0.C2421g.m(r0)
            long r0 = r7.f13606k
            float r10 = q0.C2421g.n(r0)
            long r0 = r7.f13606k
            float r0 = q0.C2421g.m(r0)
            long r1 = r7.f13607l
            float r1 = q0.C2427m.k(r1)
            float r11 = r0 + r1
            long r0 = r7.f13606k
            float r0 = q0.C2421g.n(r0)
            long r1 = r7.f13607l
            float r1 = q0.C2427m.i(r1)
            float r12 = r0 + r1
            r14 = 16
            r15 = 0
            r13 = 0
            r8 = r21
            r0.C2520p0.w(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.K0.a(r0.p0):void");
    }

    public final Outline b() {
        i();
        if (!this.f13608m || !this.f13596a) {
            return null;
        }
        return this.f13597b;
    }

    public final boolean c() {
        return this.f13601f;
    }

    public final S1 d() {
        i();
        return this.f13600e;
    }

    public final boolean e() {
        return !this.f13602g;
    }

    public final boolean f(long j10) {
        O1 o12;
        if (this.f13608m && (o12 = this.f13598c) != null) {
            return C1648l1.b(o12, C2421g.m(j10), C2421g.n(j10), this.f13609n, this.f13610o);
        }
        return true;
    }

    public final boolean h(O1 o12, float f10, boolean z10, float f11, long j10) {
        boolean z11;
        this.f13597b.setAlpha(f10);
        boolean c10 = C6496s.c(this.f13598c, o12);
        boolean z12 = !c10;
        if (!c10) {
            this.f13598c = o12;
            this.f13601f = true;
        }
        this.f13607l = j10;
        if (o12 == null || (!z10 && f11 <= 0.0f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f13608m != z11) {
            this.f13608m = z11;
            this.f13601f = true;
        }
        return z12;
    }
}
