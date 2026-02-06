package C;

import C.C1085c;
import H0.G;
import H0.H;
import H0.U;
import c1.t;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

/* renamed from: C.w  reason: case insensitive filesystem */
public interface C1104w extends T {

    /* renamed from: C.w$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int[] f1070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1071b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1072c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1073d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ U[] f1074e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1104w f1075f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f1076g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ H f1077h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f1078i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int[] f1079j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i10, int i11, int i12, U[] uArr, C1104w wVar, int i13, H h10, int i14, int[] iArr2) {
            super(1);
            this.f1070a = iArr;
            this.f1071b = i10;
            this.f1072c = i11;
            this.f1073d = i12;
            this.f1074e = uArr;
            this.f1075f = wVar;
            this.f1076g = i13;
            this.f1077h = h10;
            this.f1078i = i14;
            this.f1079j = iArr2;
        }

        public final void a(U.a aVar) {
            int i10;
            int[] iArr = this.f1070a;
            if (iArr != null) {
                i10 = iArr[this.f1071b];
            } else {
                i10 = 0;
            }
            for (int i11 = this.f1072c; i11 < this.f1073d; i11++) {
                U u10 = this.f1074e[i11];
                C6496s.e(u10);
                int m10 = this.f1075f.m(u10, S.d(u10), this.f1076g, this.f1077h.getLayoutDirection(), this.f1078i) + i10;
                if (this.f1075f.l()) {
                    U.a.h(aVar, u10, this.f1079j[i11 - this.f1072c], m10, 0.0f, 4, (Object) null);
                } else {
                    U.a.h(aVar, u10, m10, this.f1079j[i11 - this.f1072c], 0.0f, 4, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    void c(int i10, int[] iArr, int[] iArr2, H h10) {
        if (l()) {
            n().a(h10, i10, iArr, h10.getLayoutDirection(), iArr2);
            return;
        }
        p().arrange(h10, i10, iArr, iArr2);
    }

    int d(U u10) {
        if (l()) {
            return u10.U0();
        }
        return u10.S0();
    }

    long e(int i10, int i11, int i12, int i13, boolean z10) {
        if (l()) {
            return W.a(z10, i10, i11, i12, i13);
        }
        return C1090h.b(z10, i10, i11, i12, i13);
    }

    G f(U[] uArr, H h10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        int i16;
        int i17;
        if (l()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        return H.N(h10, i17, i16, (Map) null, new a(iArr2, i13, i14, i15, uArr, this, i12, h10, i10, iArr), 4, (Object) null);
    }

    int i(U u10) {
        if (l()) {
            return u10.S0();
        }
        return u10.U0();
    }

    C1095m k();

    boolean l();

    int m(U u10, V v10, int i10, t tVar, int i11) {
        C1095m mVar;
        if (v10 == null || (mVar = v10.a()) == null) {
            mVar = k();
        }
        int i12 = i10 - i(u10);
        if (l()) {
            tVar = t.Ltr;
        }
        return mVar.a(i12, tVar, u10, i11);
    }

    C1085c.e n();

    C1085c.m p();
}
