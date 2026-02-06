package w0;

import c1.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2421g;
import q0.C2423i;
import q0.C2424j;
import q0.C2427m;
import q0.C2428n;
import r0.C2468U;
import r0.C2520p0;
import r0.C2547y0;
import r0.Q1;
import t0.C2605f;
import yf.C6798l;

/* renamed from: w0.c  reason: case insensitive filesystem */
public abstract class C2817c {

    /* renamed from: a  reason: collision with root package name */
    private Q1 f27662a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27663b;

    /* renamed from: c  reason: collision with root package name */
    private C2547y0 f27664c;

    /* renamed from: d  reason: collision with root package name */
    private float f27665d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private t f27666e = t.Ltr;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f27667f = new a(this);

    /* renamed from: w0.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2817c f27668a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2817c cVar) {
            super(1);
            this.f27668a = cVar;
        }

        public final void a(C2605f fVar) {
            this.f27668a.m(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    private final void g(float f10) {
        if (this.f27665d != f10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    Q1 q12 = this.f27662a;
                    if (q12 != null) {
                        q12.c(f10);
                    }
                    this.f27663b = false;
                } else {
                    l().c(f10);
                    this.f27663b = true;
                }
            }
            this.f27665d = f10;
        }
    }

    private final void h(C2547y0 y0Var) {
        if (!C6496s.c(this.f27664c, y0Var)) {
            if (!e(y0Var)) {
                if (y0Var == null) {
                    Q1 q12 = this.f27662a;
                    if (q12 != null) {
                        q12.f((C2547y0) null);
                    }
                    this.f27663b = false;
                } else {
                    l().f(y0Var);
                    this.f27663b = true;
                }
            }
            this.f27664c = y0Var;
        }
    }

    private final void i(t tVar) {
        if (this.f27666e != tVar) {
            f(tVar);
            this.f27666e = tVar;
        }
    }

    private final Q1 l() {
        Q1 q12 = this.f27662a;
        if (q12 != null) {
            return q12;
        }
        Q1 a10 = C2468U.a();
        this.f27662a = a10;
        return a10;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(float f10);

    /* access modifiers changed from: protected */
    public abstract boolean e(C2547y0 y0Var);

    /* access modifiers changed from: protected */
    public boolean f(t tVar) {
        return false;
    }

    public final void j(C2605f fVar, long j10, float f10, C2547y0 y0Var) {
        C2520p0 f11;
        g(f10);
        h(y0Var);
        i(fVar.getLayoutDirection());
        float k10 = C2427m.k(fVar.d()) - C2427m.k(j10);
        float i10 = C2427m.i(fVar.d()) - C2427m.i(j10);
        fVar.w1().e().i(0.0f, 0.0f, k10, i10);
        if (f10 > 0.0f) {
            try {
                if (C2427m.k(j10) > 0.0f && C2427m.i(j10) > 0.0f) {
                    if (this.f27663b) {
                        C2423i b10 = C2424j.b(C2421g.f25320b.c(), C2428n.a(C2427m.k(j10), C2427m.i(j10)));
                        f11 = fVar.w1().f();
                        f11.g(b10, l());
                        m(fVar);
                        f11.h();
                    } else {
                        m(fVar);
                    }
                }
            } catch (Throwable th2) {
                fVar.w1().e().i(-0.0f, -0.0f, -k10, -i10);
                throw th2;
            }
        }
        fVar.w1().e().i(-0.0f, -0.0f, -k10, -i10);
    }

    public abstract long k();

    /* access modifiers changed from: protected */
    public abstract void m(C2605f fVar);
}
