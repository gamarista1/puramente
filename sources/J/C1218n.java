package J;

import Q0.T;
import Q0.U;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.C1676z0;
import c1.d;
import c1.r;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.q;

/* renamed from: J.n  reason: case insensitive filesystem */
public abstract class C1218n {

    /* renamed from: J.n$a */
    public static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3395b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f3396c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, T t10) {
            super(1);
            this.f3394a = i10;
            this.f3395b = i11;
            this.f3396c = t10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.n$b */
    static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f3399c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, T t10) {
            super(3);
            this.f3397a = i10;
            this.f3398b = i11;
            this.f3399c = t10;
        }

        private static final Object b(A1 a12) {
            return a12.getValue();
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            Integer num;
            float f10;
            float f11;
            int i11;
            int i12;
            mVar.T(408240218);
            if (C1506p.H()) {
                C1506p.Q(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            C1218n.b(this.f3397a, this.f3398b);
            if (this.f3397a == 1 && this.f3398b == Integer.MAX_VALUE) {
                i.a aVar = i.f23074a;
                if (C1506p.H()) {
                    C1506p.P();
                }
                mVar.M();
                return aVar;
            }
            d dVar = (d) mVar.m(C1644k0.e());
            h.b bVar = (h.b) mVar.m(C1644k0.g());
            t tVar = (t) mVar.m(C1644k0.k());
            boolean S10 = mVar.S(this.f3399c) | mVar.S(tVar);
            T t10 = this.f3399c;
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = U.d(t10, tVar);
                mVar.r(A10);
            }
            T t11 = (T) A10;
            boolean S11 = mVar.S(bVar) | mVar.S(t11);
            Object A11 = mVar.A();
            if (S11 || A11 == C1500m.f10026a.a()) {
                h j10 = t11.j();
                p o10 = t11.o();
                if (o10 == null) {
                    o10 = p.f8210b.c();
                }
                n m10 = t11.m();
                if (m10 != null) {
                    i11 = m10.i();
                } else {
                    i11 = n.f8200b.b();
                }
                o n10 = t11.n();
                if (n10 != null) {
                    i12 = n10.k();
                } else {
                    i12 = o.f8204b.a();
                }
                A11 = bVar.b(j10, o10, i11, i12);
                mVar.r(A11);
            }
            A1 a12 = (A1) A11;
            boolean S12 = mVar.S(b(a12)) | mVar.S(dVar) | mVar.S(bVar) | mVar.S(this.f3399c) | mVar.S(tVar);
            Object A12 = mVar.A();
            if (S12 || A12 == C1500m.f10026a.a()) {
                A12 = Integer.valueOf(r.f(N.a(t11, dVar, bVar, N.c(), 1)));
                mVar.r(A12);
            }
            int intValue = ((Number) A12).intValue();
            boolean S13 = mVar.S(tVar) | mVar.S(dVar) | mVar.S(bVar) | mVar.S(this.f3399c) | mVar.S(b(a12));
            Object A13 = mVar.A();
            if (S13 || A13 == C1500m.f10026a.a()) {
                A13 = Integer.valueOf(r.f(N.a(t11, dVar, bVar, N.c() + 10 + N.c(), 2)));
                mVar.r(A13);
            }
            int intValue2 = ((Number) A13).intValue() - intValue;
            int i13 = this.f3397a;
            Integer num2 = null;
            if (i13 == 1) {
                num = null;
            } else {
                num = Integer.valueOf(((i13 - 1) * intValue2) + intValue);
            }
            int i14 = this.f3398b;
            if (i14 != Integer.MAX_VALUE) {
                num2 = Integer.valueOf(intValue + (intValue2 * (i14 - 1)));
            }
            i.a aVar2 = i.f23074a;
            if (num != null) {
                f10 = dVar.E(num.intValue());
            } else {
                f10 = c1.h.f19213b.c();
            }
            if (num2 != null) {
                f11 = dVar.E(num2.intValue());
            } else {
                f11 = c1.h.f19213b.c();
            }
            i j11 = androidx.compose.foundation.layout.q.j(aVar2, f10, f11);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return j11;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, T t10, int i10, int i11) {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new a(i10, i11, t10);
        } else {
            lVar = C1676z0.a();
        }
        return k0.h.b(iVar, lVar, new b(i10, i11, t10));
    }

    public static final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        } else if (i10 > i11) {
            throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
        }
    }
}
