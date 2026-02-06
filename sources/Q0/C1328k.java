package Q0;

import Ef.m;
import Q0.Q;
import b1.i;
import b1.k;
import c1.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.L;
import lf.C6514M;
import mf.C6565s;
import q0.C2421g;
import q0.C2423i;
import r0.C2472Y;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2544x0;
import r0.S1;
import r0.e2;
import t0.C2605f;
import t0.C2606g;
import yf.C6798l;

/* renamed from: Q0.k  reason: case insensitive filesystem */
public final class C1328k {

    /* renamed from: a  reason: collision with root package name */
    private final C1329l f5351a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5352b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5353c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5354d;

    /* renamed from: e  reason: collision with root package name */
    private final float f5355e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5356f;

    /* renamed from: g  reason: collision with root package name */
    private final List f5357g;

    /* renamed from: h  reason: collision with root package name */
    private final List f5358h;

    /* renamed from: Q0.k$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f5359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float[] f5360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f5361c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f5362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, L l10, K k10) {
            super(1);
            this.f5359a = j10;
            this.f5360b = fArr;
            this.f5361c = l10;
            this.f5362d = k10;
        }

        public final void a(C1334q qVar) {
            int i10;
            int i11;
            long j10 = this.f5359a;
            float[] fArr = this.f5360b;
            L l10 = this.f5361c;
            K k10 = this.f5362d;
            if (qVar.f() > Q.l(j10)) {
                i10 = qVar.f();
            } else {
                i10 = Q.l(j10);
            }
            if (qVar.b() < Q.k(j10)) {
                i11 = qVar.b();
            } else {
                i11 = Q.k(j10);
            }
            long b10 = S.b(qVar.r(i10), qVar.r(i11));
            qVar.e().w(b10, fArr, l10.f71757a);
            int j11 = l10.f71757a + (Q.j(b10) * 4);
            for (int i12 = l10.f71757a; i12 < j11; i12 += 4) {
                int i13 = i12 + 1;
                float f10 = fArr[i13];
                float f11 = k10.f71756a;
                fArr[i13] = f10 + f11;
                int i14 = i12 + 3;
                fArr[i14] = fArr[i14] + f11;
            }
            l10.f71757a = j11;
            k10.f71756a += qVar.e().d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1334q) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Q0.k$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ S1 f5363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5364b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5365c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(S1 s12, int i10, int i11) {
            super(1);
            this.f5363a = s12;
            this.f5364b = i10;
            this.f5365c = i11;
        }

        public final void a(C1334q qVar) {
            S1.j(this.f5363a, qVar.j(qVar.e().s(qVar.r(this.f5364b), qVar.r(this.f5365c))), 0, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1334q) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ C1328k(C1329l lVar, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, j10, i10, z10);
    }

    public static /* synthetic */ void D(C1328k kVar, C2520p0 p0Var, long j10, e2 e2Var, k kVar2, C2606g gVar, int i10, int i11, Object obj) {
        long j11;
        e2 e2Var2;
        k kVar3;
        int i12;
        if ((i11 & 2) != 0) {
            j11 = C2544x0.f25560b.h();
        } else {
            j11 = j10;
        }
        C2606g gVar2 = null;
        if ((i11 & 4) != 0) {
            e2Var2 = null;
        } else {
            e2Var2 = e2Var;
        }
        if ((i11 & 8) != 0) {
            kVar3 = null;
        } else {
            kVar3 = kVar2;
        }
        if ((i11 & 16) == 0) {
            gVar2 = gVar;
        }
        if ((i11 & 32) != 0) {
            i12 = C2605f.f25940d0.a();
        } else {
            i12 = i10;
        }
        kVar.C(p0Var, j11, e2Var2, kVar3, gVar2, i12);
    }

    public static /* synthetic */ void F(C1328k kVar, C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar2, C2606g gVar, int i10, int i11, Object obj) {
        float f11;
        e2 e2Var2;
        k kVar3;
        C2606g gVar2;
        int i12;
        if ((i11 & 4) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            e2Var2 = null;
        } else {
            e2Var2 = e2Var;
        }
        if ((i11 & 16) != 0) {
            kVar3 = null;
        } else {
            kVar3 = kVar2;
        }
        if ((i11 & 32) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 64) != 0) {
            i12 = C2605f.f25940d0.a();
        } else {
            i12 = i10;
        }
        kVar.E(p0Var, n0Var, f11, e2Var2, kVar3, gVar2, i12);
    }

    private final void G(int i10) {
        if (i10 < 0 || i10 >= b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void H(int i10) {
        if (i10 < 0 || i10 > b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void I(int i10) {
        if (i10 < 0 || i10 >= this.f5356f) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + this.f5356f + ')').toString());
        }
    }

    private final C1321d b() {
        return this.f5351a.e();
    }

    public final float A() {
        return this.f5354d;
    }

    public final long B(int i10) {
        int i11;
        H(i10);
        if (i10 == b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.k(qVar.e().i(qVar.r(i10)), false);
    }

    public final void C(C2520p0 p0Var, long j10, e2 e2Var, k kVar, C2606g gVar, int i10) {
        p0Var.q();
        List list = this.f5358h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1334q qVar = (C1334q) list.get(i11);
            qVar.e().c(p0Var, j10, e2Var, kVar, gVar, i10);
            p0Var.d(0.0f, qVar.e().d());
        }
        C2520p0 p0Var2 = p0Var;
        p0Var.h();
    }

    public final void E(C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar, C2606g gVar, int i10) {
        Y0.b.a(this, p0Var, n0Var, f10, e2Var, kVar, gVar, i10);
    }

    public final float[] a(long j10, float[] fArr, int i10) {
        G(Q.l(j10));
        H(Q.k(j10));
        L l10 = new L();
        l10.f71757a = i10;
        C1331n.d(this.f5358h, j10, new a(j10, fArr, l10, new K()));
        return fArr;
    }

    public final i c(int i10) {
        int i11;
        H(i10);
        if (i10 == b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.e().z(qVar.r(i10));
    }

    public final C2423i d(int i10) {
        G(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.a(this.f5358h, i10));
        return qVar.i(qVar.e().D(qVar.r(i10)));
    }

    public final C2423i e(int i10) {
        int i11;
        H(i10);
        if (i10 == b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.i(qVar.e().h(qVar.r(i10)));
    }

    public final boolean f() {
        return this.f5353c;
    }

    public final float g() {
        if (this.f5358h.isEmpty()) {
            return 0.0f;
        }
        return ((C1334q) this.f5358h.get(0)).e().j();
    }

    public final float h() {
        return this.f5355e;
    }

    public final float i(int i10, boolean z10) {
        int i11;
        H(i10);
        if (i10 == b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.e().t(qVar.r(i10), z10);
    }

    public final C1329l j() {
        return this.f5351a;
    }

    public final float k() {
        if (this.f5358h.isEmpty()) {
            return 0.0f;
        }
        C1334q qVar = (C1334q) C6565s.z0(this.f5358h);
        return qVar.o(qVar.e().x());
    }

    public final float l(int i10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.o(qVar.e().A(qVar.s(i10)));
    }

    public final int m() {
        return this.f5356f;
    }

    public final int n(int i10, boolean z10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.m(qVar.e().m(qVar.s(i10), z10));
    }

    public final int o(int i10) {
        int i11;
        if (i10 >= b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else if (i10 < 0) {
            i11 = 0;
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.n(qVar.e().y(qVar.r(i10)));
    }

    public final int p(float f10) {
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.c(this.f5358h, f10));
        if (qVar.d() == 0) {
            return qVar.g();
        }
        return qVar.n(qVar.e().r(qVar.t(f10)));
    }

    public final float q(int i10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.e().v(qVar.s(i10));
    }

    public final float r(int i10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.e().o(qVar.s(i10));
    }

    public final int s(int i10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.m(qVar.e().l(qVar.s(i10)));
    }

    public final float t(int i10) {
        I(i10);
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.b(this.f5358h, i10));
        return qVar.o(qVar.e().g(qVar.s(i10)));
    }

    public final int u(long j10) {
        C1334q qVar = (C1334q) this.f5358h.get(C1331n.c(this.f5358h, C2421g.n(j10)));
        if (qVar.d() == 0) {
            return qVar.f();
        }
        return qVar.m(qVar.e().k(qVar.q(j10)));
    }

    public final i v(int i10) {
        int i11;
        H(i10);
        if (i10 == b().length()) {
            i11 = C6565s.p(this.f5358h);
        } else {
            i11 = C1331n.a(this.f5358h, i10);
        }
        C1334q qVar = (C1334q) this.f5358h.get(i11);
        return qVar.e().f(qVar.r(i10));
    }

    public final List w() {
        return this.f5358h;
    }

    public final S1 x(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > b().j().length()) {
            throw new IllegalArgumentException(("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + b().j().length() + "), or start > end!").toString());
        } else if (i10 == i11) {
            return C2472Y.a();
        } else {
            S1 a10 = C2472Y.a();
            C1331n.d(this.f5358h, S.b(i10, i11), new b(a10, i10, i11));
            return a10;
        }
    }

    public final List y() {
        return this.f5357g;
    }

    public final long z(C2423i iVar, int i10, I i11) {
        Q.a aVar;
        Q.a aVar2;
        int c10 = C1331n.c(this.f5358h, iVar.l());
        if (((C1334q) this.f5358h.get(c10)).a() >= iVar.e() || c10 == C6565s.p(this.f5358h)) {
            C1334q qVar = (C1334q) this.f5358h.get(c10);
            return C1334q.l(qVar, qVar.e().u(qVar.p(iVar), i10, i11), false, 1, (Object) null);
        }
        int c11 = C1331n.c(this.f5358h, iVar.e());
        long a10 = Q.f5291b.a();
        while (true) {
            aVar = Q.f5291b;
            if (Q.g(a10, aVar.a()) && c10 <= c11) {
                C1334q qVar2 = (C1334q) this.f5358h.get(c10);
                a10 = C1334q.l(qVar2, qVar2.e().u(qVar2.p(iVar), i10, i11), false, 1, (Object) null);
                c10++;
            }
        }
        if (Q.g(a10, aVar.a())) {
            return aVar.a();
        }
        long a11 = aVar.a();
        while (true) {
            aVar2 = Q.f5291b;
            if (Q.g(a11, aVar2.a()) && c10 <= c11) {
                C1334q qVar3 = (C1334q) this.f5358h.get(c11);
                a11 = C1334q.l(qVar3, qVar3.e().u(qVar3.p(iVar), i10, i11), false, 1, (Object) null);
                c11--;
            }
        }
        if (Q.g(a11, aVar2.a())) {
            return a10;
        }
        return S.b(Q.n(a10), Q.i(a11));
    }

    private C1328k(C1329l lVar, long j10, int i10, boolean z10) {
        boolean z11;
        int k10;
        float d10;
        int i11;
        this.f5351a = lVar;
        this.f5352b = i10;
        if (c1.b.n(j10) == 0 && c1.b.m(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List f10 = lVar.f();
            int size = f10.size();
            int i12 = 0;
            int i13 = 0;
            float f11 = 0.0f;
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z11 = false;
                    break;
                }
                r rVar = (r) f10.get(i14);
                C1335s b10 = rVar.b();
                int l10 = c1.b.l(j10);
                if (c1.b.g(j10)) {
                    k10 = m.d(c1.b.k(j10) - C1337u.d(f11), i12);
                } else {
                    k10 = c1.b.k(j10);
                }
                C1333p c10 = C1337u.c(b10, c.b(0, l10, 0, k10, 5, (Object) null), this.f5352b - i13, z10);
                d10 = f11 + c10.d();
                int n10 = i13 + c10.n();
                C1334q qVar = r6;
                List list = f10;
                i11 = n10;
                C1334q qVar2 = new C1334q(c10, rVar.c(), rVar.a(), i13, n10, f11, d10);
                arrayList.add(qVar);
                if (c10.q() || (i11 == this.f5352b && i14 != C6565s.p(this.f5351a.f()))) {
                    z11 = true;
                    i13 = i11;
                    f11 = d10;
                } else {
                    i14++;
                    i13 = i11;
                    f11 = d10;
                    i12 = 0;
                    f10 = list;
                }
            }
            z11 = true;
            i13 = i11;
            f11 = d10;
            this.f5355e = f11;
            this.f5356f = i13;
            this.f5353c = z11;
            this.f5358h = arrayList;
            this.f5354d = (float) c1.b.l(j10);
            List arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                C1334q qVar3 = (C1334q) arrayList.get(i15);
                List E10 = qVar3.e().E();
                ArrayList arrayList3 = new ArrayList(E10.size());
                int size3 = E10.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    C2423i iVar = (C2423i) E10.get(i16);
                    arrayList3.add(iVar != null ? qVar3.i(iVar) : null);
                }
                C6565s.D(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f5351a.g().size()) {
                int size4 = this.f5351a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i17 = 0; i17 < size4; i17++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = C6565s.K0(arrayList2, arrayList4);
            }
            this.f5357g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }
}
