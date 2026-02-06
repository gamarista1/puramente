package V;

import B.j;
import J0.C1244j;
import c1.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import r0.C2544x0;
import x.C2845I;

/* renamed from: V.v0  reason: case insensitive filesystem */
final class C1411v0 implements C2845I {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8067a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8068b;

    /* renamed from: c  reason: collision with root package name */
    private final C2443E0 f8069c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final long f8070d;

    /* renamed from: V.v0$a */
    static final class a implements C2443E0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1411v0 f8071a;

        a(C1411v0 v0Var) {
            this.f8071a = v0Var;
        }

        public final long a() {
            return this.f8071a.f8070d;
        }
    }

    public /* synthetic */ C1411v0(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    public C1244j a(j jVar) {
        C2443E0 e02 = this.f8069c;
        if (e02 == null) {
            e02 = new a(this);
        }
        return new B(jVar, this.f8067a, this.f8068b, e02, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411v0)) {
            return false;
        }
        C1411v0 v0Var = (C1411v0) obj;
        if (this.f8067a == v0Var.f8067a && h.m(this.f8068b, v0Var.f8068b) && C6496s.c(this.f8069c, v0Var.f8069c)) {
            return C2544x0.q(this.f8070d, v0Var.f8070d);
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((Boolean.hashCode(this.f8067a) * 31) + h.o(this.f8068b)) * 31;
        C2443E0 e02 = this.f8069c;
        if (e02 != null) {
            i10 = e02.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + C2544x0.w(this.f8070d);
    }

    private C1411v0(boolean z10, float f10, C2443E0 e02, long j10) {
        this.f8067a = z10;
        this.f8068b = f10;
        this.f8069c = e02;
        this.f8070d = j10;
    }

    private C1411v0(boolean z10, float f10, long j10) {
        this(z10, f10, (C2443E0) null, j10);
    }
}
