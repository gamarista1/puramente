package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.i  reason: case insensitive filesystem */
public final class C2423i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25325e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C2423i f25326f = new C2423i(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f25327a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25328b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25329c;

    /* renamed from: d  reason: collision with root package name */
    private final float f25330d;

    /* renamed from: q0.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2423i a() {
            return C2423i.f25326f;
        }

        private a() {
        }
    }

    public C2423i(float f10, float f11, float f12, float f13) {
        this.f25327a = f10;
        this.f25328b = f11;
        this.f25329c = f12;
        this.f25330d = f13;
    }

    public static /* synthetic */ C2423i d(C2423i iVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = iVar.f25327a;
        }
        if ((i10 & 2) != 0) {
            f11 = iVar.f25328b;
        }
        if ((i10 & 4) != 0) {
            f12 = iVar.f25329c;
        }
        if ((i10 & 8) != 0) {
            f13 = iVar.f25330d;
        }
        return iVar.c(f10, f11, f12, f13);
    }

    public final boolean b(long j10) {
        if (C2421g.m(j10) < this.f25327a || C2421g.m(j10) >= this.f25329c || C2421g.n(j10) < this.f25328b || C2421g.n(j10) >= this.f25330d) {
            return false;
        }
        return true;
    }

    public final C2423i c(float f10, float f11, float f12, float f13) {
        return new C2423i(f10, f11, f12, f13);
    }

    public final float e() {
        return this.f25330d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2423i)) {
            return false;
        }
        C2423i iVar = (C2423i) obj;
        if (Float.compare(this.f25327a, iVar.f25327a) == 0 && Float.compare(this.f25328b, iVar.f25328b) == 0 && Float.compare(this.f25329c, iVar.f25329c) == 0 && Float.compare(this.f25330d, iVar.f25330d) == 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        return C2422h.a(this.f25329c, this.f25330d);
    }

    public final long g() {
        return C2422h.a(this.f25327a + (n() / 2.0f), this.f25328b + (h() / 2.0f));
    }

    public final float h() {
        return this.f25330d - this.f25328b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25327a) * 31) + Float.hashCode(this.f25328b)) * 31) + Float.hashCode(this.f25329c)) * 31) + Float.hashCode(this.f25330d);
    }

    public final float i() {
        return this.f25327a;
    }

    public final float j() {
        return this.f25329c;
    }

    public final long k() {
        return C2428n.a(n(), h());
    }

    public final float l() {
        return this.f25328b;
    }

    public final long m() {
        return C2422h.a(this.f25327a, this.f25328b);
    }

    public final float n() {
        return this.f25329c - this.f25327a;
    }

    public final C2423i o(float f10, float f11, float f12, float f13) {
        return new C2423i(Math.max(this.f25327a, f10), Math.max(this.f25328b, f11), Math.min(this.f25329c, f12), Math.min(this.f25330d, f13));
    }

    public final C2423i p(C2423i iVar) {
        return new C2423i(Math.max(this.f25327a, iVar.f25327a), Math.max(this.f25328b, iVar.f25328b), Math.min(this.f25329c, iVar.f25329c), Math.min(this.f25330d, iVar.f25330d));
    }

    public final boolean q() {
        if (this.f25327a >= this.f25329c || this.f25328b >= this.f25330d) {
            return true;
        }
        return false;
    }

    public final boolean r(C2423i iVar) {
        if (this.f25329c <= iVar.f25327a || iVar.f25329c <= this.f25327a || this.f25330d <= iVar.f25328b || iVar.f25330d <= this.f25328b) {
            return false;
        }
        return true;
    }

    public final C2423i s(float f10, float f11) {
        return new C2423i(this.f25327a + f10, this.f25328b + f11, this.f25329c + f10, this.f25330d + f11);
    }

    public final C2423i t(long j10) {
        return new C2423i(this.f25327a + C2421g.m(j10), this.f25328b + C2421g.n(j10), this.f25329c + C2421g.m(j10), this.f25330d + C2421g.n(j10));
    }

    public String toString() {
        return "Rect.fromLTRB(" + C2417c.a(this.f25327a, 1) + ", " + C2417c.a(this.f25328b, 1) + ", " + C2417c.a(this.f25329c, 1) + ", " + C2417c.a(this.f25330d, 1) + ')';
    }
}
