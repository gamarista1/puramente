package C;

import C.C1085c;
import H0.C1194o;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import c1.b;
import c1.t;
import java.util.List;
import java.util.Map;
import k0.c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class X implements F, T {

    /* renamed from: a  reason: collision with root package name */
    private final C1085c.e f866a;

    /* renamed from: b  reason: collision with root package name */
    private final c.C0368c f867b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U[] f868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ X f869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f871d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int[] f872e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U[] uArr, X x10, int i10, int i11, int[] iArr) {
            super(1);
            this.f868a = uArr;
            this.f869b = x10;
            this.f870c = i10;
            this.f871d = i11;
            this.f872e = iArr;
        }

        public final void a(U.a aVar) {
            U[] uArr = this.f868a;
            X x10 = this.f869b;
            int i10 = this.f870c;
            int i11 = this.f871d;
            int[] iArr = this.f872e;
            int length = uArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                U u10 = uArr[i12];
                C6496s.e(u10);
                U.a.h(aVar, u10, iArr[i13], x10.r(u10, S.d(u10), i10, i11), 0.0f, 4, (Object) null);
                i12++;
                i13++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public X(C1085c.e eVar, c.C0368c cVar) {
        this.f866a = eVar;
        this.f867b = cVar;
    }

    /* access modifiers changed from: private */
    public final int r(U u10, V v10, int i10, int i11) {
        C1095m mVar;
        if (v10 != null) {
            mVar = v10.a();
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar.a(i10 - u10.R0(), t.Ltr, u10, i11);
        }
        return this.f867b.a(0, i10 - u10.R0());
    }

    public int a(C1194o oVar, List list, int i10) {
        return H.f845a.c(list, i10, oVar.E0(this.f866a.m1getSpacingD9Ej5fM()));
    }

    public int b(C1194o oVar, List list, int i10) {
        return H.f845a.b(list, i10, oVar.E0(this.f866a.m1getSpacingD9Ej5fM()));
    }

    public void c(int i10, int[] iArr, int[] iArr2, H h10) {
        this.f866a.a(h10, i10, iArr, h10.getLayoutDirection(), iArr2);
    }

    public int d(U u10) {
        return u10.X0();
    }

    public long e(int i10, int i11, int i12, int i13, boolean z10) {
        return W.a(z10, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        if (C6496s.c(this.f866a, x10.f866a) && C6496s.c(this.f867b, x10.f867b)) {
            return true;
        }
        return false;
    }

    public G f(U[] uArr, H h10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return H.N(h10, i11, i12, (Map) null, new a(uArr, this, i12, i10, iArr), 4, (Object) null);
    }

    public int g(C1194o oVar, List list, int i10) {
        return H.f845a.a(list, i10, oVar.E0(this.f866a.m1getSpacingD9Ej5fM()));
    }

    public int h(C1194o oVar, List list, int i10) {
        return H.f845a.d(list, i10, oVar.E0(this.f866a.m1getSpacingD9Ej5fM()));
    }

    public int hashCode() {
        return (this.f866a.hashCode() * 31) + this.f867b.hashCode();
    }

    public int i(U u10) {
        return u10.R0();
    }

    public G j(H h10, List list, long j10) {
        H h11 = h10;
        return U.b(this, b.n(j10), b.m(j10), b.l(j10), b.k(j10), h11.E0(this.f866a.m1getSpacingD9Ej5fM()), h11, list, new U[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f866a + ", verticalAlignment=" + this.f867b + ')';
    }
}
