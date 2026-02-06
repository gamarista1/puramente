package androidx.compose.ui.graphics;

import c1.f;
import c1.t;
import kotlin.jvm.internal.C6496s;
import q0.C2427m;
import r0.C2544x0;
import r0.G1;
import r0.O1;
import r0.a2;
import r0.b2;
import r0.g2;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private int f13390a;

    /* renamed from: b  reason: collision with root package name */
    private float f13391b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f13392c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f13393d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f13394e;

    /* renamed from: f  reason: collision with root package name */
    private float f13395f;

    /* renamed from: g  reason: collision with root package name */
    private float f13396g;

    /* renamed from: h  reason: collision with root package name */
    private long f13397h = G1.a();

    /* renamed from: i  reason: collision with root package name */
    private long f13398i = G1.a();

    /* renamed from: j  reason: collision with root package name */
    private float f13399j;

    /* renamed from: k  reason: collision with root package name */
    private float f13400k;

    /* renamed from: l  reason: collision with root package name */
    private float f13401l;

    /* renamed from: m  reason: collision with root package name */
    private float f13402m = 8.0f;

    /* renamed from: n  reason: collision with root package name */
    private long f13403n = f.f13431b.a();

    /* renamed from: o  reason: collision with root package name */
    private g2 f13404o = a2.a();

    /* renamed from: p  reason: collision with root package name */
    private boolean f13405p;

    /* renamed from: q  reason: collision with root package name */
    private int f13406q = a.f13386a.a();

    /* renamed from: r  reason: collision with root package name */
    private long f13407r = C2427m.f25341b.a();

    /* renamed from: s  reason: collision with root package name */
    private c1.d f13408s = f.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: t  reason: collision with root package name */
    private t f13409t = t.Ltr;

    /* renamed from: u  reason: collision with root package name */
    private O1 f13410u;

    public float A() {
        return this.f13391b;
    }

    public final O1 B() {
        return this.f13410u;
    }

    public long B0() {
        return this.f13403n;
    }

    public void C(float f10) {
        if (this.f13396g != f10) {
            this.f13390a |= 32;
            this.f13396g = f10;
        }
    }

    public b2 D() {
        return null;
    }

    public float F() {
        return this.f13395f;
    }

    public void F0(long j10) {
        if (!f.e(this.f13403n, j10)) {
            this.f13390a |= 4096;
            this.f13403n = j10;
        }
    }

    public float G() {
        return this.f13396g;
    }

    public float H() {
        return this.f13394e;
    }

    public float I() {
        return this.f13399j;
    }

    public float J() {
        return this.f13392c;
    }

    public g2 L() {
        return this.f13404o;
    }

    public long O() {
        return this.f13398i;
    }

    public void O0(g2 g2Var) {
        if (!C6496s.c(this.f13404o, g2Var)) {
            this.f13390a |= 8192;
            this.f13404o = g2Var;
        }
    }

    public final void T() {
        h(1.0f);
        m(1.0f);
        c(1.0f);
        n(0.0f);
        f(0.0f);
        C(0.0f);
        v(G1.a());
        z(G1.a());
        j(0.0f);
        k(0.0f);
        l(0.0f);
        i(8.0f);
        F0(f.f13431b.a());
        O0(a2.a());
        y(false);
        g((b2) null);
        q(a.f13386a.a());
        e0(C2427m.f25341b.a());
        this.f13410u = null;
        this.f13390a = 0;
    }

    public final void W(c1.d dVar) {
        this.f13408s = dVar;
    }

    public float a() {
        return this.f13393d;
    }

    public final void b0(t tVar) {
        this.f13409t = tVar;
    }

    public void c(float f10) {
        if (this.f13393d != f10) {
            this.f13390a |= 4;
            this.f13393d = f10;
        }
    }

    public long d() {
        return this.f13407r;
    }

    public long e() {
        return this.f13397h;
    }

    public void e0(long j10) {
        this.f13407r = j10;
    }

    public void f(float f10) {
        if (this.f13395f != f10) {
            this.f13390a |= 16;
            this.f13395f = f10;
        }
    }

    public void g(b2 b2Var) {
        if (!C6496s.c((Object) null, b2Var)) {
            this.f13390a |= 131072;
        }
    }

    public float getDensity() {
        return this.f13408s.getDensity();
    }

    public void h(float f10) {
        if (this.f13391b != f10) {
            this.f13390a |= 1;
            this.f13391b = f10;
        }
    }

    public void i(float f10) {
        if (this.f13402m != f10) {
            this.f13390a |= 2048;
            this.f13402m = f10;
        }
    }

    public void j(float f10) {
        if (this.f13399j != f10) {
            this.f13390a |= 256;
            this.f13399j = f10;
        }
    }

    public void k(float f10) {
        if (this.f13400k != f10) {
            this.f13390a |= 512;
            this.f13400k = f10;
        }
    }

    public final void k0() {
        this.f13410u = L().m12createOutlinePq9zytI(d(), this.f13409t, this.f13408s);
    }

    public void l(float f10) {
        if (this.f13401l != f10) {
            this.f13390a |= 1024;
            this.f13401l = f10;
        }
    }

    public void m(float f10) {
        if (this.f13392c != f10) {
            this.f13390a |= 2;
            this.f13392c = f10;
        }
    }

    public void n(float f10) {
        if (this.f13394e != f10) {
            this.f13390a |= 8;
            this.f13394e = f10;
        }
    }

    public boolean o() {
        return this.f13405p;
    }

    public int p() {
        return this.f13406q;
    }

    public void q(int i10) {
        if (!a.e(this.f13406q, i10)) {
            this.f13390a |= 32768;
            this.f13406q = i10;
        }
    }

    public float r() {
        return this.f13400k;
    }

    public float r1() {
        return this.f13408s.r1();
    }

    public final c1.d s() {
        return this.f13408s;
    }

    public float t() {
        return this.f13401l;
    }

    public final t u() {
        return this.f13409t;
    }

    public void v(long j10) {
        if (!C2544x0.q(this.f13397h, j10)) {
            this.f13390a |= 64;
            this.f13397h = j10;
        }
    }

    public float w() {
        return this.f13402m;
    }

    public final int x() {
        return this.f13390a;
    }

    public void y(boolean z10) {
        if (this.f13405p != z10) {
            this.f13390a |= 16384;
            this.f13405p = z10;
        }
    }

    public void z(long j10) {
        if (!C2544x0.q(this.f13398i, j10)) {
            this.f13390a |= 128;
            this.f13398i = j10;
        }
    }
}
