package V;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.N;
import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import O0.m;
import O0.t;
import O0.v;
import W.u;
import W.v;
import W.w;
import X.C1462e;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.J0;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: V.b  reason: case insensitive filesystem */
public abstract class C1371b {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7187a = c1.h.j((float) 280);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7188b = c1.h.j((float) 560);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f7189c = c1.h.j((float) 8);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f7190d = c1.h.j((float) 12);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final N f7191e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final N f7192f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final N f7193g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final N f7194h;

    /* renamed from: V.b$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7196b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7198d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7199e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7200f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7201g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f7202h;

        /* renamed from: V.b$a$a  reason: collision with other inner class name */
        static final class C0160a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1092j f7203a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f7204b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0160a(C1092j jVar, p pVar) {
                super(2);
                this.f7203a = jVar;
                this.f7204b = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(934657765, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                    }
                    C1092j jVar = this.f7203a;
                    i h10 = n.h(i.f23074a, C1371b.f7192f);
                    c.a aVar = k0.c.f23044a;
                    i b10 = jVar.b(h10, aVar.g());
                    p pVar = this.f7204b;
                    F h11 = androidx.compose.foundation.layout.d.h(aVar.o(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar, b10);
                    C1241g.a aVar2 = C1241g.f3853J;
                    C6787a a11 = aVar2.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h11, aVar2.c());
                    F1.b(a12, p10, aVar2.e());
                    p b11 = aVar2.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar2.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.b$a$b  reason: collision with other inner class name */
        static final class C0161b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1092j f7205a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f7206b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p f7207c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0161b(C1092j jVar, p pVar, p pVar2) {
                super(2);
                this.f7205a = jVar;
                this.f7206b = pVar;
                this.f7207c = pVar2;
            }

            public final void a(C1500m mVar, int i10) {
                c.b bVar;
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(434448772, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                    }
                    C1092j jVar = this.f7205a;
                    i h10 = n.h(i.f23074a, C1371b.f7193g);
                    if (this.f7206b == null) {
                        bVar = k0.c.f23044a.k();
                    } else {
                        bVar = k0.c.f23044a.g();
                    }
                    i b10 = jVar.b(h10, bVar);
                    p pVar = this.f7207c;
                    F h11 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar, b10);
                    C1241g.a aVar = C1241g.f3853J;
                    C6787a a11 = aVar.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h11, aVar.c());
                    F1.b(a12, p10, aVar.e());
                    p b11 = aVar.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.b$a$c */
        static final class c extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1092j f7208a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f7209b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C1092j jVar, p pVar) {
                super(2);
                this.f7208a = jVar;
                this.f7209b = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-796843771, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                    }
                    C1092j jVar = this.f7208a;
                    i h10 = n.h(jVar.a(i.f23074a, 1.0f, false), C1371b.f7194h);
                    c.a aVar = k0.c.f23044a;
                    i b10 = jVar.b(h10, aVar.k());
                    p pVar = this.f7209b;
                    F h11 = androidx.compose.foundation.layout.d.h(aVar.o(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar, b10);
                    C1241g.a aVar2 = C1241g.f3853J;
                    C6787a a11 = aVar2.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h11, aVar2.c());
                    F1.b(a12, p10, aVar2.e());
                    p b11 = aVar2.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar2.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, p pVar2, p pVar3, long j10, long j11, long j12, long j13, p pVar4) {
            super(2);
            this.f7195a = pVar;
            this.f7196b = pVar2;
            this.f7197c = pVar3;
            this.f7198d = j10;
            this.f7199e = j11;
            this.f7200f = j12;
            this.f7201g = j13;
            this.f7202h = pVar4;
        }

        public final void a(C1500m mVar, int i10) {
            p pVar;
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-2126308228, i11, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                }
                i.a aVar = i.f23074a;
                i h10 = n.h(aVar, C1371b.f7191e);
                p pVar2 = this.f7195a;
                p pVar3 = this.f7196b;
                p pVar4 = this.f7197c;
                long j10 = this.f7198d;
                long j11 = this.f7199e;
                long j12 = this.f7200f;
                long j13 = this.f7201g;
                p pVar5 = this.f7202h;
                C1085c.m g10 = C1085c.f882a.g();
                c.a aVar2 = k0.c.f23044a;
                p pVar6 = pVar5;
                long j14 = j13;
                F a10 = C1090h.a(g10, aVar2.k(), mVar2, 0);
                int a11 = C1494j.a(mVar2, 0);
                C1523y p10 = mVar.p();
                i e10 = k0.h.e(mVar2, h10);
                C1241g.a aVar3 = C1241g.f3853J;
                C6787a a12 = aVar3.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar2.U(a12);
                } else {
                    mVar.q();
                }
                C1500m a13 = F1.a(mVar);
                i.a aVar4 = aVar;
                F1.b(a13, a10, aVar3.c());
                F1.b(a13, p10, aVar3.e());
                p b10 = aVar3.b();
                if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                    a13.r(Integer.valueOf(a11));
                    a13.V(Integer.valueOf(a11), b10);
                }
                F1.b(a13, e10, aVar3.d());
                C1093k kVar = C1093k.f978a;
                mVar2.T(-1924971291);
                if (pVar2 != null) {
                    C1521x.a(A.a().d(C2544x0.k(j10)), g0.c.e(934657765, true, new C0160a(kVar, pVar2), mVar2, 54), mVar2, J0.f9784i | 48);
                }
                mVar.M();
                mVar2.T(-1924961479);
                if (pVar3 == null) {
                    pVar = pVar6;
                } else {
                    pVar = pVar6;
                    u.a(j11, Z0.c(C1462e.f9041a.f(), mVar2, 6), g0.c.e(434448772, true, new C0161b(kVar, pVar2, pVar3), mVar2, 54), mVar, 384);
                }
                mVar.M();
                mVar2.T(-1924936431);
                if (pVar4 != null) {
                    u.a(j12, Z0.c(C1462e.f9041a.i(), mVar2, 6), g0.c.e(-796843771, true, new c(kVar, pVar4), mVar2, 54), mVar, 384);
                }
                mVar.M();
                i b11 = kVar.b(aVar4, aVar2.j());
                F h11 = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
                int a14 = C1494j.a(mVar2, 0);
                C1523y p11 = mVar.p();
                i e11 = k0.h.e(mVar2, b11);
                C6787a a15 = aVar3.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar2.U(a15);
                } else {
                    mVar.q();
                }
                C1500m a16 = F1.a(mVar);
                F1.b(a16, h11, aVar3.c());
                F1.b(a16, p11, aVar3.e());
                p b12 = aVar3.b();
                if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                    a16.r(Integer.valueOf(a14));
                    a16.V(Integer.valueOf(a14), b12);
                }
                F1.b(a16, e11, aVar3.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                u.a(j14, Z0.c(C1462e.f9041a.b(), mVar2, 6), pVar, mVar, 0);
                mVar.u();
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$b  reason: collision with other inner class name */
    static final class C0162b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f7211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7214e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g2 f7215f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7216g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7217h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7218i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7219j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f7220k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f7221l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f7222m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7223n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7224o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0162b(p pVar, i iVar, p pVar2, p pVar3, p pVar4, g2 g2Var, long j10, float f10, long j11, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f7210a = pVar;
            this.f7211b = iVar;
            this.f7212c = pVar2;
            this.f7213d = pVar3;
            this.f7214e = pVar4;
            this.f7215f = g2Var;
            this.f7216g = j10;
            this.f7217h = f10;
            this.f7218i = j11;
            this.f7219j = j12;
            this.f7220k = j13;
            this.f7221l = j14;
            this.f7222m = i10;
            this.f7223n = i11;
            this.f7224o = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            p pVar = this.f7210a;
            p pVar2 = pVar;
            C1371b.a(pVar2, this.f7211b, this.f7212c, this.f7213d, this.f7214e, this.f7215f, this.f7216g, this.f7217h, this.f7218i, this.f7219j, this.f7220k, this.f7221l, mVar2, M0.a(this.f7222m | 1), M0.a(this.f7223n), this.f7224o);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$c */
    static final class c implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f7225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7226b;

        /* renamed from: V.b$c$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f7227a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ H f7228b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7229c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f7230d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f7231e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, H h10, float f10, int i10, List list2) {
                super(1);
                this.f7227a = list;
                this.f7228b = h10;
                this.f7229c = f10;
                this.f7230d = i10;
                this.f7231e = list2;
            }

            public final void a(U.a aVar) {
                int i10;
                List list = this.f7227a;
                H h10 = this.f7228b;
                float f10 = this.f7229c;
                int i11 = this.f7230d;
                List list2 = this.f7231e;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    List list3 = (List) list.get(i12);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    for (int i13 = 0; i13 < size2; i13++) {
                        int X02 = ((U) list3.get(i13)).X0();
                        if (i13 < C6565s.p(list3)) {
                            i10 = h10.E0(f10);
                        } else {
                            i10 = 0;
                        }
                        iArr[i13] = X02 + i10;
                    }
                    C1085c.e c10 = C1085c.f882a.c();
                    int[] iArr2 = new int[size2];
                    for (int i14 = 0; i14 < size2; i14++) {
                        iArr2[i14] = 0;
                    }
                    int[] iArr3 = iArr2;
                    c10.a(h10, i11, iArr, h10.getLayoutDirection(), iArr2);
                    int size3 = list3.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        U.a.h(aVar, (U) list3.get(i15), iArr3[i15], ((Number) list2.get(i12)).intValue(), 0.0f, 4, (Object) null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        c(float f10, float f11) {
            this.f7225a = f10;
            this.f7226b = f11;
        }

        private static final boolean c(List list, L l10, H h10, float f10, long j10, U u10) {
            if (list.isEmpty() || l10.f71757a + h10.E0(f10) + u10.X0() <= b.l(j10)) {
                return true;
            }
            return false;
        }

        private static final void d(List list, L l10, H h10, float f10, List list2, List list3, L l11, List list4, L l12, L l13) {
            if (!list.isEmpty()) {
                l10.f71757a += h10.E0(f10);
            }
            list.add(0, C6565s.e1(list2));
            list3.add(Integer.valueOf(l11.f71757a));
            list4.add(Integer.valueOf(l10.f71757a));
            l10.f71757a += l11.f71757a;
            l12.f71757a = Math.max(l12.f71757a, l13.f71757a);
            list2.clear();
            l13.f71757a = 0;
            l11.f71757a = 0;
        }

        public final G j(H h10, List list, long j10) {
            ArrayList arrayList;
            L l10;
            L l11;
            L l12;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            L l13 = new L();
            L l14 = new L();
            ArrayList arrayList5 = new ArrayList();
            L l15 = new L();
            L l16 = new L();
            float f10 = this.f7225a;
            float f11 = this.f7226b;
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList6 = arrayList4;
                L l17 = l13;
                U v02 = ((E) list.get(i10)).v0(j10);
                int i11 = i10;
                float f12 = f11;
                int i12 = size;
                float f13 = f10;
                if (!c(arrayList5, l15, h10, f10, j10, v02)) {
                    l11 = l16;
                    l10 = l15;
                    arrayList = arrayList5;
                    d(arrayList2, l14, h10, f12, arrayList5, arrayList3, l16, arrayList6, l17, l10);
                } else {
                    l11 = l16;
                    l10 = l15;
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    l12 = l10;
                    l12.f71757a += h10.E0(f13);
                } else {
                    H h11 = h10;
                    l12 = l10;
                }
                U u10 = v02;
                ArrayList arrayList7 = arrayList;
                arrayList7.add(u10);
                l12.f71757a += u10.X0();
                l11.f71757a = Math.max(l11.f71757a, u10.R0());
                i10 = i11 + 1;
                l15 = l12;
                f10 = f13;
                l16 = l11;
                arrayList4 = arrayList6;
                l13 = l17;
                size = i12;
                arrayList5 = arrayList7;
                f11 = f12;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            L l18 = l13;
            L l19 = l16;
            L l20 = l15;
            H h12 = h10;
            if (!arrayList8.isEmpty()) {
                d(arrayList2, l14, h10, this.f7226b, arrayList8, arrayList3, l19, arrayList9, l18, l20);
            }
            int max = Math.max(l18.f71757a, b.n(j10));
            return H.N(h10, max, Math.max(l14.f71757a, b.m(j10)), (Map) null, new a(arrayList2, h10, this.f7225a, max, arrayList9), 4, (Object) null);
        }
    }

    /* renamed from: V.b$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f7232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, float f11, p pVar, int i10) {
            super(2);
            this.f7232a = f10;
            this.f7233b = f11;
            this.f7234c = pVar;
            this.f7235d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1371b.b(this.f7232a, this.f7233b, this.f7234c, mVar, M0.a(this.f7235d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$e */
    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7238c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g2 f7239d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7240e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f7241f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7242g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7243h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7244i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f7245j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f7246k;

        /* renamed from: V.b$e$a */
        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f7247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f7248b;

            /* renamed from: V.b$e$a$a  reason: collision with other inner class name */
            static final class C0163a extends C6498u implements p {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f7249a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p f7250b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0163a(p pVar, p pVar2) {
                    super(2);
                    this.f7249a = pVar;
                    this.f7250b = pVar2;
                }

                public final void a(C1500m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.i()) {
                        if (C1506p.H()) {
                            C1506p.Q(1887135077, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                        }
                        p pVar = this.f7249a;
                        mVar.T(1497073862);
                        if (pVar != null) {
                            pVar.invoke(mVar, 0);
                            C6514M m10 = C6514M.f71813a;
                        }
                        mVar.M();
                        this.f7250b.invoke(mVar, 0);
                        if (C1506p.H()) {
                            C1506p.P();
                            return;
                        }
                        return;
                    }
                    mVar.I();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p pVar, p pVar2) {
                super(2);
                this.f7247a = pVar;
                this.f7248b = pVar2;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(1163543932, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                    }
                    C1371b.b(C1371b.f7189c, C1371b.f7190d, g0.c.e(1887135077, true, new C0163a(this.f7247a, this.f7248b), mVar, 54), mVar, 438);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p pVar, p pVar2, p pVar3, g2 g2Var, long j10, float f10, long j11, long j12, long j13, p pVar4, p pVar5) {
            super(2);
            this.f7236a = pVar;
            this.f7237b = pVar2;
            this.f7238c = pVar3;
            this.f7239d = g2Var;
            this.f7240e = j10;
            this.f7241f = f10;
            this.f7242g = j11;
            this.f7243h = j12;
            this.f7244i = j13;
            this.f7245j = pVar4;
            this.f7246k = pVar5;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1852840226, i11, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                }
                C1371b.a(g0.c.e(1163543932, true, new a(this.f7245j, this.f7246k), mVar2, 54), (i) null, this.f7236a, this.f7237b, this.f7238c, this.f7239d, this.f7240e, this.f7241f, C1404s.h(C1462e.f9041a.a(), mVar2, 6), this.f7242g, this.f7243h, this.f7244i, mVar, 6, 0, 2);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$f */
    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7253c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7254d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7255e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f7256f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f7257g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g2 f7258h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7259i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7260j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f7261k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f7262l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f7263m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f7264n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7265o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7266p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C6787a aVar, p pVar, i iVar, p pVar2, p pVar3, p pVar4, p pVar5, g2 g2Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.i iVar2, int i10, int i11) {
            super(2);
            this.f7251a = aVar;
            this.f7252b = pVar;
            this.f7253c = iVar;
            this.f7254d = pVar2;
            this.f7255e = pVar3;
            this.f7256f = pVar4;
            this.f7257g = pVar5;
            this.f7258h = g2Var;
            this.f7259i = j10;
            this.f7260j = j11;
            this.f7261k = j12;
            this.f7262l = j13;
            this.f7263m = f10;
            this.f7264n = iVar2;
            this.f7265o = i10;
            this.f7266p = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            C6787a aVar = this.f7251a;
            C6787a aVar2 = aVar;
            C1371b.c(aVar2, this.f7252b, this.f7253c, this.f7254d, this.f7255e, this.f7256f, this.f7257g, this.f7258h, this.f7259i, this.f7260j, this.f7261k, this.f7262l, this.f7263m, this.f7264n, mVar2, M0.a(this.f7265o | 1), M0.a(this.f7266p));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$g */
    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7268b;

        /* renamed from: V.b$g$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f7269a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f7269a = str;
            }

            public final void a(v vVar) {
                t.e0(vVar, this.f7269a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, p pVar) {
            super(2);
            this.f7267a = iVar;
            this.f7268b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(905289008, i10, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                }
                v.a aVar = W.v.f8397a;
                String a10 = w.a(W.v.a(C1402q0.f7957f), mVar, 0);
                i q10 = q.q(this.f7267a, C1371b.l(), 0.0f, C1371b.k(), 0.0f, 10, (Object) null);
                i.a aVar2 = i.f23074a;
                boolean S10 = mVar.S(a10);
                Object A10 = mVar.A();
                if (S10 || A10 == C1500m.f10026a.a()) {
                    A10 = new a(a10);
                    mVar.r(A10);
                }
                i h10 = q10.h(m.d(aVar2, false, (C6798l) A10, 1, (Object) null));
                p pVar = this.f7268b;
                F h11 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
                int a11 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                i e10 = k0.h.e(mVar, h10);
                C1241g.a aVar3 = C1241g.f3853J;
                C6787a a12 = aVar3.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a12);
                } else {
                    mVar.q();
                }
                C1500m a13 = F1.a(mVar);
                F1.b(a13, h11, aVar3.c());
                F1.b(a13, p10, aVar3.e());
                p b10 = aVar3.b();
                if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                    a13.r(Integer.valueOf(a11));
                    a13.V(Integer.valueOf(a11), b10);
                }
                F1.b(a13, e10, aVar3.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                pVar.invoke(mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.b$h */
    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f7271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.i f7272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7273d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7274e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7275f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C6787a aVar, i iVar, androidx.compose.ui.window.i iVar2, p pVar, int i10, int i11) {
            super(2);
            this.f7270a = aVar;
            this.f7271b = iVar;
            this.f7272c = iVar2;
            this.f7273d = pVar;
            this.f7274e = i10;
            this.f7275f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1371b.d(this.f7270a, this.f7271b, this.f7272c, this.f7273d, mVar, M0.a(this.f7274e | 1), this.f7275f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static {
        float f10 = (float) 24;
        f7191e = n.a(c1.h.j(f10));
        float f11 = (float) 16;
        f7192f = n.e(0.0f, 0.0f, 0.0f, c1.h.j(f11), 7, (Object) null);
        f7193g = n.e(0.0f, 0.0f, 0.0f, c1.h.j(f11), 7, (Object) null);
        f7194h = n.e(0.0f, 0.0f, 0.0f, c1.h.j(f10), 7, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(yf.p r33, k0.i r34, yf.p r35, yf.p r36, yf.p r37, r0.g2 r38, long r39, float r41, long r42, long r44, long r46, long r48, Y.C1500m r50, int r51, int r52, int r53) {
        /*
            r14 = r51
            r15 = r53
            r0 = 1522575799(0x5ac0a9b7, float:2.71148995E16)
            r1 = r50
            Y.m r13 = r1.h(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            r12 = r33
            goto L_0x0028
        L_0x0016:
            r1 = r14 & 6
            r12 = r33
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.C(r12)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r15 & 2
            r6 = 32
            if (r4 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r7 = r34
            goto L_0x0044
        L_0x0033:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0030
            r7 = r34
            boolean r8 = r13.S(r7)
            if (r8 == 0) goto L_0x0041
            r8 = r6
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r1 = r1 | r8
        L_0x0044:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r35
            goto L_0x005f
        L_0x004d:
            r8 = r14 & 384(0x180, float:5.38E-43)
            r11 = r35
            if (r8 != 0) goto L_0x005f
            boolean r8 = r13.C(r11)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r8
        L_0x005f:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r36
            goto L_0x007a
        L_0x0068:
            r8 = r14 & 3072(0xc00, float:4.305E-42)
            r10 = r36
            if (r8 != 0) goto L_0x007a
            boolean r8 = r13.C(r10)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
        L_0x007a:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r9 = r37
            goto L_0x0095
        L_0x0083:
            r8 = r14 & 24576(0x6000, float:3.4438E-41)
            r9 = r37
            if (r8 != 0) goto L_0x0095
            boolean r8 = r13.C(r9)
            if (r8 == 0) goto L_0x0092
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r8
        L_0x0095:
            r8 = r15 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a0
            r1 = r1 | r16
        L_0x009d:
            r8 = r38
            goto L_0x00b3
        L_0x00a0:
            r8 = r14 & r16
            if (r8 != 0) goto L_0x009d
            r8 = r38
            boolean r16 = r13.S(r8)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r1 = r1 | r16
        L_0x00b3:
            r16 = r15 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r1 = r1 | r17
            r9 = r39
            goto L_0x00d1
        L_0x00be:
            r16 = r14 & r17
            r9 = r39
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r13.e(r9)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r16
        L_0x00d1:
            r2 = r15 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00dc
            r1 = r1 | r29
        L_0x00d9:
            r2 = r41
            goto L_0x00ef
        L_0x00dc:
            r2 = r14 & r29
            if (r2 != 0) goto L_0x00d9
            r2 = r41
            boolean r16 = r13.c(r2)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r1 = r1 | r16
        L_0x00ef:
            r3 = r15 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00fa
            r1 = r1 | r17
            r9 = r42
            goto L_0x010c
        L_0x00fa:
            r3 = r14 & r17
            r9 = r42
            if (r3 != 0) goto L_0x010c
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0109
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r1 = r1 | r3
        L_0x010c:
            r3 = r15 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0117
            r1 = r1 | r17
            r9 = r44
            goto L_0x0129
        L_0x0117:
            r3 = r14 & r17
            r9 = r44
            if (r3 != 0) goto L_0x0129
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0126
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r1 = r1 | r3
        L_0x0129:
            r3 = r15 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0132
            r3 = r52 | 6
            r9 = r46
            goto L_0x0148
        L_0x0132:
            r3 = r52 & 6
            r9 = r46
            if (r3 != 0) goto L_0x0146
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0141
            r16 = 4
            goto L_0x0143
        L_0x0141:
            r16 = 2
        L_0x0143:
            r3 = r52 | r16
            goto L_0x0148
        L_0x0146:
            r3 = r52
        L_0x0148:
            r5 = r15 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0151
            r3 = r3 | 48
            r9 = r48
            goto L_0x0162
        L_0x0151:
            r5 = r52 & 48
            r9 = r48
            if (r5 != 0) goto L_0x0162
            boolean r5 = r13.e(r9)
            if (r5 == 0) goto L_0x015f
            r5 = r6
            goto L_0x0161
        L_0x015f:
            r5 = 16
        L_0x0161:
            r3 = r3 | r5
        L_0x0162:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x017f
            r5 = r3 & 19
            r6 = 18
            if (r5 != r6) goto L_0x017f
            boolean r5 = r13.i()
            if (r5 != 0) goto L_0x0178
            goto L_0x017f
        L_0x0178:
            r13.I()
            r2 = r7
            r0 = r13
            goto L_0x01f3
        L_0x017f:
            if (r4 == 0) goto L_0x0186
            k0.i$a r4 = k0.i.f23074a
            r30 = r4
            goto L_0x0188
        L_0x0186:
            r30 = r7
        L_0x0188:
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x0193
            java.lang.String r4 = "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)"
            Y.C1506p.Q(r0, r1, r3, r4)
        L_0x0193:
            V.b$a r0 = new V.b$a
            r16 = r0
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r44
            r22 = r46
            r24 = r48
            r26 = r42
            r28 = r33
            r16.<init>(r17, r18, r19, r20, r22, r24, r26, r28)
            r3 = 54
            r4 = -2126308228(0xffffffff81431c7c, float:-3.583628E-38)
            r5 = 1
            g0.a r0 = g0.c.e(r4, r5, r0, r13, r3)
            int r3 = r1 >> 3
            r3 = r3 & 14
            r3 = r3 | r29
            int r4 = r1 >> 12
            r5 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r1 = r1 >> 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r16 = r3 | r1
            r17 = 104(0x68, float:1.46E-43)
            r5 = 0
            r18 = 0
            r19 = 0
            r1 = r30
            r2 = r38
            r3 = r39
            r7 = r41
            r8 = r18
            r9 = r19
            r10 = r0
            r11 = r13
            r12 = r16
            r0 = r13
            r13 = r17
            V.O0.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x01f1
            Y.C1506p.P()
        L_0x01f1:
            r2 = r30
        L_0x01f3:
            Y.Y0 r12 = r0.k()
            if (r12 == 0) goto L_0x0226
            V.b$b r13 = new V.b$b
            r0 = r13
            r1 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r9 = r41
            r10 = r42
            r31 = r12
            r32 = r13
            r12 = r44
            r14 = r46
            r16 = r48
            r18 = r51
            r19 = r52
            r20 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r12, r14, r16, r18, r19, r20)
            r0 = r31
            r1 = r32
            r0.a(r1)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1371b.a(yf.p, k0.i, yf.p, yf.p, yf.p, r0.g2, long, float, long, long, long, long, Y.m, int, int, int):void");
    }

    public static final void b(float f10, float f11, p pVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(586821353);
        if ((i10 & 6) == 0) {
            if (h10.c(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.c(f11)) {
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
                C1506p.Q(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z11 = true;
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new c(f10, f11);
                h10.r(A10);
            }
            F f12 = (F) A10;
            i.a aVar = i.f23074a;
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            int i15 = ((((i11 >> 6) & 14) << 6) & 896) | 6;
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, f12, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar2.d());
            pVar.invoke(h10, Integer.valueOf((i15 >> 6) & 14));
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(f10, f11, pVar, i10));
        }
    }

    public static final void c(C6787a aVar, p pVar, i iVar, p pVar2, p pVar3, p pVar4, p pVar5, g2 g2Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.i iVar2, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C1500m h10 = mVar.h(-919826268);
        C6787a aVar2 = aVar;
        if ((i14 & 6) == 0) {
            i12 = (h10.C(aVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        int i16 = 16;
        p pVar6 = pVar;
        if ((i14 & 48) == 0) {
            i12 |= h10.C(pVar6) ? 32 : 16;
        }
        i iVar3 = iVar;
        if ((i14 & 384) == 0) {
            i12 |= h10.S(iVar3) ? 256 : 128;
        }
        int i17 = 2048;
        if ((i14 & 3072) == 0) {
            i12 |= h10.C(pVar2) ? 2048 : 1024;
        } else {
            p pVar7 = pVar2;
        }
        if ((i14 & 24576) == 0) {
            i12 |= h10.C(pVar3) ? 16384 : 8192;
        } else {
            p pVar8 = pVar3;
        }
        p pVar9 = pVar4;
        if ((i14 & 196608) == 0) {
            i12 |= h10.C(pVar9) ? 131072 : 65536;
        }
        p pVar10 = pVar5;
        if ((i14 & 1572864) == 0) {
            i12 |= h10.C(pVar10) ? 1048576 : 524288;
        }
        g2 g2Var2 = g2Var;
        if ((i14 & 12582912) == 0) {
            i12 |= h10.S(g2Var2) ? 8388608 : 4194304;
        }
        int i18 = i12;
        long j14 = j10;
        if ((i14 & 100663296) == 0) {
            i18 |= h10.e(j14) ? 67108864 : 33554432;
        }
        long j15 = j11;
        if ((i14 & 805306368) == 0) {
            i18 |= h10.e(j15) ? 536870912 : 268435456;
        }
        int i19 = i18;
        long j16 = j12;
        if ((i15 & 6) == 0) {
            i13 = i15 | (h10.e(j16) ? 4 : 2);
        } else {
            i13 = i15;
        }
        long j17 = j13;
        if ((i15 & 48) == 0) {
            if (h10.e(j17)) {
                i16 = 32;
            }
            i13 |= i16;
        }
        float f11 = f10;
        if ((i15 & 384) == 0) {
            i13 |= h10.c(f11) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if (!h10.S(iVar2)) {
                i17 = 1024;
            }
            i13 |= i17;
        } else {
            androidx.compose.ui.window.i iVar4 = iVar2;
        }
        int i20 = i13;
        if ((306783379 & i19) == 306783378 && (i20 & 1171) == 1170 && h10.i()) {
            h10.I();
        } else {
            if (C1506p.H()) {
                C1506p.Q(-919826268, i19, i20, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            d(aVar, iVar, iVar2, g0.c.e(-1852840226, true, new e(pVar3, pVar4, pVar5, g2Var, j10, f10, j11, j12, j13, pVar2, pVar), h10, 54), h10, ((i20 >> 3) & 896) | (i19 & 14) | 3072 | ((i19 >> 3) & 112), 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            f fVar = r0;
            f fVar2 = new f(aVar, pVar, iVar, pVar2, pVar3, pVar4, pVar5, g2Var, j10, j11, j12, j13, f10, iVar2, i10, i11);
            k10.a(fVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(yf.C6787a r19, k0.i r20, androidx.compose.ui.window.i r21, yf.p r22, Y.C1500m r23, int r24, int r25) {
        /*
            r4 = r22
            r5 = r24
            r0 = -1922902937(0xffffffff8d62d467, float:-6.9897297E-31)
            r1 = r23
            Y.m r1 = r1.h(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r5 | 6
            r3 = r2
            r2 = r19
            goto L_0x002b
        L_0x0017:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r19
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r5
            goto L_0x002b
        L_0x0028:
            r2 = r19
            r3 = r5
        L_0x002b:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r7 = r20
            goto L_0x0046
        L_0x0034:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r20
            boolean r8 = r1.S(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r3 = r3 | r8
        L_0x0046:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r21
            goto L_0x0061
        L_0x004f:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r21
            boolean r10 = r1.S(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r10
        L_0x0061:
            r10 = r25 & 8
            if (r10 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0068:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0078
            boolean r10 = r1.C(r4)
            if (r10 == 0) goto L_0x0075
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r3 = r3 | r10
        L_0x0078:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008b
            boolean r10 = r1.i()
            if (r10 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            r1.I()
            r12 = r7
            r3 = r9
            goto L_0x00db
        L_0x008b:
            if (r6 == 0) goto L_0x0091
            k0.i$a r6 = k0.i.f23074a
            r12 = r6
            goto L_0x0092
        L_0x0091:
            r12 = r7
        L_0x0092:
            if (r8 == 0) goto L_0x00a3
            androidx.compose.ui.window.i r6 = new androidx.compose.ui.window.i
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r6
            r13.<init>((boolean) r14, (boolean) r15, (boolean) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)
            goto L_0x00a4
        L_0x00a3:
            r13 = r9
        L_0x00a4:
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x00b0
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)"
            Y.C1506p.Q(r0, r3, r6, r7)
        L_0x00b0:
            V.b$g r0 = new V.b$g
            r0.<init>(r12, r4)
            r6 = 54
            r7 = 905289008(0x35f59d30, float:1.829967E-6)
            r8 = 1
            g0.a r8 = g0.c.e(r7, r8, r0, r1, r6)
            r0 = r3 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r10 = r0 | r3
            r11 = 0
            r6 = r19
            r7 = r13
            r9 = r1
            androidx.compose.ui.window.a.a(r6, r7, r8, r9, r10, r11)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00da
            Y.C1506p.P()
        L_0x00da:
            r3 = r13
        L_0x00db:
            Y.Y0 r7 = r1.k()
            if (r7 == 0) goto L_0x00f3
            V.b$h r8 = new V.b$h
            r0 = r8
            r1 = r19
            r2 = r12
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1371b.d(yf.a, k0.i, androidx.compose.ui.window.i, yf.p, Y.m, int, int):void");
    }

    public static final float k() {
        return f7188b;
    }

    public static final float l() {
        return f7187a;
    }
}
