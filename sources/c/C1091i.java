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

/* renamed from: C.i  reason: case insensitive filesystem */
public final class C1091i implements F, T {

    /* renamed from: a  reason: collision with root package name */
    private final C1085c.m f962a;

    /* renamed from: b  reason: collision with root package name */
    private final c.b f963b;

    /* renamed from: C.i$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U[] f964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1091i f965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f966c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f967d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H f968e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int[] f969f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U[] uArr, C1091i iVar, int i10, int i11, H h10, int[] iArr) {
            super(1);
            this.f964a = uArr;
            this.f965b = iVar;
            this.f966c = i10;
            this.f967d = i11;
            this.f968e = h10;
            this.f969f = iArr;
        }

        public final void a(U.a aVar) {
            U[] uArr = this.f964a;
            C1091i iVar = this.f965b;
            int i10 = this.f966c;
            int i11 = this.f967d;
            H h10 = this.f968e;
            int[] iArr = this.f969f;
            int length = uArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                U u10 = uArr[i12];
                C6496s.e(u10);
                U.a.h(aVar, u10, iVar.r(u10, S.d(u10), i10, i11, h10.getLayoutDirection()), iArr[i13], 0.0f, 4, (Object) null);
                i12++;
                i13++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public C1091i(C1085c.m mVar, c.b bVar) {
        this.f962a = mVar;
        this.f963b = bVar;
    }

    /* access modifiers changed from: private */
    public final int r(U u10, V v10, int i10, int i11, t tVar) {
        C1095m mVar;
        if (v10 != null) {
            mVar = v10.a();
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar.a(i10 - u10.X0(), tVar, u10, i11);
        }
        return this.f963b.a(0, i10 - u10.X0(), tVar);
    }

    public int a(C1194o oVar, List list, int i10) {
        return H.f845a.g(list, i10, oVar.E0(this.f962a.m6getSpacingD9Ej5fM()));
    }

    public int b(C1194o oVar, List list, int i10) {
        return H.f845a.f(list, i10, oVar.E0(this.f962a.m6getSpacingD9Ej5fM()));
    }

    public void c(int i10, int[] iArr, int[] iArr2, H h10) {
        this.f962a.arrange(h10, i10, iArr, iArr2);
    }

    public int d(U u10) {
        return u10.R0();
    }

    public long e(int i10, int i11, int i12, int i13, boolean z10) {
        return C1090h.b(z10, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1091i)) {
            return false;
        }
        C1091i iVar = (C1091i) obj;
        if (C6496s.c(this.f962a, iVar.f962a) && C6496s.c(this.f963b, iVar.f963b)) {
            return true;
        }
        return false;
    }

    public G f(U[] uArr, H h10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return H.N(h10, i12, i11, (Map) null, new a(uArr, this, i12, i10, h10, iArr), 4, (Object) null);
    }

    public int g(C1194o oVar, List list, int i10) {
        return H.f845a.e(list, i10, oVar.E0(this.f962a.m6getSpacingD9Ej5fM()));
    }

    public int h(C1194o oVar, List list, int i10) {
        return H.f845a.h(list, i10, oVar.E0(this.f962a.m6getSpacingD9Ej5fM()));
    }

    public int hashCode() {
        return (this.f962a.hashCode() * 31) + this.f963b.hashCode();
    }

    public int i(U u10) {
        return u10.X0();
    }

    public G j(H h10, List list, long j10) {
        H h11 = h10;
        return U.b(this, b.m(j10), b.n(j10), b.k(j10), b.l(j10), h11.E0(this.f962a.m6getSpacingD9Ej5fM()), h11, list, new U[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f962a + ", horizontalAlignment=" + this.f963b + ')';
    }
}
