package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m0 implements C2788d {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f27471a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f27472b;

    /* renamed from: c  reason: collision with root package name */
    private Object f27473c;

    /* renamed from: d  reason: collision with root package name */
    private Object f27474d;

    /* renamed from: e  reason: collision with root package name */
    private C2805q f27475e;

    /* renamed from: f  reason: collision with root package name */
    private C2805q f27476f;

    /* renamed from: g  reason: collision with root package name */
    private final C2805q f27477g;

    /* renamed from: h  reason: collision with root package name */
    private long f27478h;

    /* renamed from: i  reason: collision with root package name */
    private C2805q f27479i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
        r1 = w.C2806r.e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(w.u0 r1, w.r0 r2, java.lang.Object r3, java.lang.Object r4, w.C2805q r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f27471a = r1
            r0.f27472b = r2
            r0.f27473c = r4
            r0.f27474d = r3
            w.r0 r1 = r0.e()
            yf.l r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r3)
            w.q r1 = (w.C2805q) r1
            r0.f27475e = r1
            w.r0 r1 = r0.e()
            yf.l r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r4)
            w.q r1 = (w.C2805q) r1
            r0.f27476f = r1
            if (r5 == 0) goto L_0x0033
            w.q r1 = w.C2806r.e(r5)
            if (r1 != 0) goto L_0x0045
        L_0x0033:
            w.r0 r1 = r0.e()
            yf.l r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r3)
            w.q r1 = (w.C2805q) r1
            w.q r1 = w.C2806r.g(r1)
        L_0x0045:
            r0.f27477g = r1
            r1 = -1
            r0.f27478h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.m0.<init>(w.u0, w.r0, java.lang.Object, java.lang.Object, w.q):void");
    }

    private final C2805q h() {
        C2805q qVar = this.f27479i;
        if (qVar != null) {
            return qVar;
        }
        C2805q g10 = this.f27471a.g(this.f27475e, this.f27476f, this.f27477g);
        this.f27479i = g10;
        return g10;
    }

    public boolean a() {
        return this.f27471a.a();
    }

    public C2805q b(long j10) {
        if (c(j10)) {
            return h();
        }
        return this.f27471a.d(j10, this.f27475e, this.f27476f, this.f27477g);
    }

    public long d() {
        if (this.f27478h < 0) {
            this.f27478h = this.f27471a.b(this.f27475e, this.f27476f, this.f27477g);
        }
        return this.f27478h;
    }

    public r0 e() {
        return this.f27472b;
    }

    public Object f(long j10) {
        if (c(j10)) {
            return g();
        }
        C2805q c10 = this.f27471a.c(j10, this.f27475e, this.f27476f, this.f27477g);
        int b10 = c10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (Float.isNaN(c10.a(i10))) {
                C2783a0.b("AnimationVector cannot contain a NaN. " + c10 + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return e().b().invoke(c10);
    }

    public Object g() {
        return this.f27473c;
    }

    public final Object i() {
        return this.f27474d;
    }

    public final void j(Object obj) {
        if (!C6496s.c(obj, this.f27474d)) {
            this.f27474d = obj;
            this.f27475e = (C2805q) e().a().invoke(obj);
            this.f27479i = null;
            this.f27478h = -1;
        }
    }

    public final void k(Object obj) {
        if (!C6496s.c(this.f27473c, obj)) {
            this.f27473c = obj;
            this.f27476f = (C2805q) e().a().invoke(obj);
            this.f27479i = null;
            this.f27478h = -1;
        }
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f27477g + ", duration: " + C2792f.b(this) + " ms,animationSpec: " + this.f27471a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(C2797i iVar, r0 r0Var, Object obj, Object obj2, C2805q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, r0Var, obj, obj2, (i10 & 16) != 0 ? null : qVar);
    }

    public m0(C2797i iVar, r0 r0Var, Object obj, Object obj2, C2805q qVar) {
        this(iVar.a(r0Var), r0Var, obj, obj2, qVar);
    }
}
