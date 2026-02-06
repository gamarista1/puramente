package Y;

import lf.C6527k;
import yf.C6798l;

public final class J0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f9784i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1517v f9785a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9786b;

    /* renamed from: c  reason: collision with root package name */
    private final o1 f9787c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f9788d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f9789e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f9790f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f9791g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9792h = true;

    public J0(C1517v vVar, Object obj, boolean z10, o1 o1Var, C1510r0 r0Var, C6798l lVar, boolean z11) {
        this.f9785a = vVar;
        this.f9786b = z10;
        this.f9787c = o1Var;
        this.f9788d = r0Var;
        this.f9789e = lVar;
        this.f9790f = z11;
        this.f9791g = obj;
    }

    public final boolean a() {
        return this.f9792h;
    }

    public final C1517v b() {
        return this.f9785a;
    }

    public final C6798l c() {
        return this.f9789e;
    }

    public final Object d() {
        if (this.f9786b) {
            return null;
        }
        C1510r0 r0Var = this.f9788d;
        if (r0Var != null) {
            return r0Var.getValue();
        }
        Object obj = this.f9791g;
        if (obj != null) {
            return obj;
        }
        C1506p.s("Unexpected form of a provided value");
        throw new C6527k();
    }

    public final o1 e() {
        return this.f9787c;
    }

    public final C1510r0 f() {
        return this.f9788d;
    }

    public final Object g() {
        return this.f9791g;
    }

    public final J0 h() {
        this.f9792h = false;
        return this;
    }

    public final boolean i() {
        return this.f9790f;
    }

    public final boolean j() {
        if ((this.f9786b || g() != null) && !this.f9790f) {
            return true;
        }
        return false;
    }
}
