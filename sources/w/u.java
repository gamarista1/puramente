package W;

import Q0.T;
import V.A;
import V.T0;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.M0;
import Y.Y0;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2544x0;
import yf.p;

public abstract class u {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f8394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f8395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, T t10, p pVar, int i10) {
            super(2);
            this.f8393a = j10;
            this.f8394b = t10;
            this.f8395c = pVar;
            this.f8396d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            u.a(this.f8393a, this.f8394b, this.f8395c, mVar, M0.a(this.f8396d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(long j10, T t10, p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-716124955);
        if ((i10 & 6) == 0) {
            if (h10.e(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.S(t10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-716124955, i11, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            C1521x.b(new J0[]{A.a().d(C2544x0.k(j10)), T0.d().d(((T) h10.m(T0.d())).J(t10))}, pVar, h10, ((i11 >> 3) & 112) | J0.f9784i);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(j10, t10, pVar, i10));
        }
    }
}
