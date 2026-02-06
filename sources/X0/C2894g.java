package x0;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import r0.C2471X;
import r0.C2472Y;
import r0.C2514n0;
import r0.C2547y0;
import r0.S1;
import r0.T1;
import r0.V1;
import t0.C2605f;
import t0.C2606g;
import t0.C2610k;
import yf.C6787a;

/* renamed from: x0.g  reason: case insensitive filesystem */
public final class C2894g extends l {

    /* renamed from: b  reason: collision with root package name */
    private String f28070b = "";

    /* renamed from: c  reason: collision with root package name */
    private C2514n0 f28071c;

    /* renamed from: d  reason: collision with root package name */
    private float f28072d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private List f28073e = o.d();

    /* renamed from: f  reason: collision with root package name */
    private int f28074f = o.a();

    /* renamed from: g  reason: collision with root package name */
    private float f28075g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f28076h;

    /* renamed from: i  reason: collision with root package name */
    private C2514n0 f28077i;

    /* renamed from: j  reason: collision with root package name */
    private int f28078j = o.b();

    /* renamed from: k  reason: collision with root package name */
    private int f28079k = o.c();

    /* renamed from: l  reason: collision with root package name */
    private float f28080l = 4.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f28081m;

    /* renamed from: n  reason: collision with root package name */
    private float f28082n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f28083o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f28084p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f28085q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f28086r;

    /* renamed from: s  reason: collision with root package name */
    private C2610k f28087s;

    /* renamed from: t  reason: collision with root package name */
    private final S1 f28088t;

    /* renamed from: u  reason: collision with root package name */
    private S1 f28089u;

    /* renamed from: v  reason: collision with root package name */
    private final Lazy f28090v;

    /* renamed from: x0.g$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28091a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final V1 invoke() {
            return C2471X.a();
        }
    }

    public C2894g() {
        super((DefaultConstructorMarker) null);
        S1 a10 = C2472Y.a();
        this.f28088t = a10;
        this.f28089u = a10;
        this.f28090v = C6531o.a(C6534r.NONE, a.f28091a);
    }

    private final V1 f() {
        return (V1) this.f28090v.getValue();
    }

    private final void v() {
        k.c(this.f28073e, this.f28088t);
        w();
    }

    private final void w() {
        if (this.f28081m == 0.0f && this.f28082n == 1.0f) {
            this.f28089u = this.f28088t;
            return;
        }
        if (C6496s.c(this.f28089u, this.f28088t)) {
            this.f28089u = C2472Y.a();
        } else {
            int n10 = this.f28089u.n();
            this.f28089u.o();
            this.f28089u.e(n10);
        }
        f().c(this.f28088t, false);
        float a10 = f().a();
        float f10 = this.f28081m;
        float f11 = this.f28083o;
        float f12 = ((f10 + f11) % 1.0f) * a10;
        float f13 = ((this.f28082n + f11) % 1.0f) * a10;
        if (f12 > f13) {
            f().b(f12, a10, this.f28089u, true);
            f().b(0.0f, f13, this.f28089u, true);
            return;
        }
        f().b(f12, f13, this.f28089u, true);
    }

    public void a(C2605f fVar) {
        if (this.f28084p) {
            v();
        } else if (this.f28086r) {
            w();
        }
        this.f28084p = false;
        this.f28086r = false;
        C2514n0 n0Var = this.f28071c;
        if (n0Var != null) {
            C2605f.Z(fVar, this.f28089u, n0Var, this.f28072d, (C2606g) null, (C2547y0) null, 0, 56, (Object) null);
        }
        C2514n0 n0Var2 = this.f28077i;
        if (n0Var2 != null) {
            C2610k kVar = this.f28087s;
            if (this.f28085q || kVar == null) {
                kVar = new C2610k(this.f28076h, this.f28080l, this.f28078j, this.f28079k, (T1) null, 16, (DefaultConstructorMarker) null);
                this.f28087s = kVar;
                this.f28085q = false;
            }
            C2605f.Z(fVar, this.f28089u, n0Var2, this.f28075g, kVar, (C2547y0) null, 0, 48, (Object) null);
        }
    }

    public final C2514n0 e() {
        return this.f28071c;
    }

    public final C2514n0 g() {
        return this.f28077i;
    }

    public final void h(C2514n0 n0Var) {
        this.f28071c = n0Var;
        c();
    }

    public final void i(float f10) {
        this.f28072d = f10;
        c();
    }

    public final void j(String str) {
        this.f28070b = str;
        c();
    }

    public final void k(List list) {
        this.f28073e = list;
        this.f28084p = true;
        c();
    }

    public final void l(int i10) {
        this.f28074f = i10;
        this.f28089u.e(i10);
        c();
    }

    public final void m(C2514n0 n0Var) {
        this.f28077i = n0Var;
        c();
    }

    public final void n(float f10) {
        this.f28075g = f10;
        c();
    }

    public final void o(int i10) {
        this.f28078j = i10;
        this.f28085q = true;
        c();
    }

    public final void p(int i10) {
        this.f28079k = i10;
        this.f28085q = true;
        c();
    }

    public final void q(float f10) {
        this.f28080l = f10;
        this.f28085q = true;
        c();
    }

    public final void r(float f10) {
        this.f28076h = f10;
        this.f28085q = true;
        c();
    }

    public final void s(float f10) {
        this.f28082n = f10;
        this.f28086r = true;
        c();
    }

    public final void t(float f10) {
        this.f28083o = f10;
        this.f28086r = true;
        c();
    }

    public String toString() {
        return this.f28088t.toString();
    }

    public final void u(float f10) {
        this.f28081m = f10;
        this.f28086r = true;
        c();
    }
}
