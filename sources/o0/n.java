package O0;

import H0.C1197s;
import H0.C1198t;
import H0.C1201w;
import J0.C1235c0;
import J0.C1239e0;
import J0.C1244j;
import J0.C1245k;
import J0.G;
import J0.w0;
import J0.x0;
import a0.C1538b;
import c1.r;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import q0.C2421g;
import q0.C2423i;
import yf.C6798l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final i.c f4587a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4588b;

    /* renamed from: c  reason: collision with root package name */
    private final G f4589c;

    /* renamed from: d  reason: collision with root package name */
    private final j f4590d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4591e;

    /* renamed from: f  reason: collision with root package name */
    private n f4592f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4593g;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f4594a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.f4594a = gVar;
        }

        public final void a(v vVar) {
            t.g0(vVar, this.f4594a.n());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4595a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f4595a = str;
        }

        public final void a(v vVar) {
            t.Y(vVar, this.f4595a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    public static final class c extends i.c implements w0 {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C6798l f4596n;

        c(C6798l lVar) {
            this.f4596n = lVar;
        }

        public void W(v vVar) {
            this.f4596n.invoke(vVar);
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f4597a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            j I10 = g10.I();
            boolean z10 = false;
            if (I10 != null && I10.z()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f4598a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            j I10 = g10.I();
            boolean z10 = false;
            if (I10 != null && I10.z()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f4599a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.j0().q(C1239e0.a(8)));
        }
    }

    public n(i.c cVar, boolean z10, G g10, j jVar) {
        this.f4587a = cVar;
        this.f4588b = z10;
        this.f4589c = g10;
        this.f4590d = jVar;
        this.f4593g = g10.p0();
    }

    private final void B(j jVar) {
        if (!this.f4590d.x()) {
            List D10 = D(this, false, false, 3, (Object) null);
            int size = D10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) D10.get(i10);
                if (!nVar.y()) {
                    jVar.A(nVar.f4590d);
                    nVar.B(jVar);
                }
            }
        }
    }

    public static /* synthetic */ List D(n nVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return nVar.C(z10, z11);
    }

    private final void b(List list) {
        String str;
        g c10 = o.h(this);
        if (c10 != null && this.f4590d.z() && !list.isEmpty()) {
            list.add(c(c10, new a(c10)));
        }
        j jVar = this.f4590d;
        q qVar = q.f4613a;
        if (jVar.g(qVar.d()) && !list.isEmpty() && this.f4590d.z()) {
            List list2 = (List) k.a(this.f4590d, qVar.d());
            if (list2 != null) {
                str = (String) C6565s.q0(list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, c((g) null, new b(str)));
            }
        }
    }

    private final n c(g gVar, C6798l lVar) {
        int i10;
        j jVar = new j();
        jVar.D(false);
        jVar.C(false);
        lVar.invoke(jVar);
        c cVar = new c(lVar);
        if (gVar != null) {
            i10 = o.i(this);
        } else {
            i10 = o.e(this);
        }
        n nVar = new n(cVar, false, new G(true, i10), jVar);
        nVar.f4591e = true;
        nVar.f4592f = this;
        return nVar;
    }

    private final void d(G g10, List list, boolean z10) {
        C1538b u02 = g10.u0();
        int q10 = u02.q();
        if (q10 > 0) {
            Object[] p10 = u02.p();
            int i10 = 0;
            do {
                G g11 = (G) p10[i10];
                if (g11.J0() && (z10 || !g11.K0())) {
                    if (g11.j0().q(C1239e0.a(8))) {
                        list.add(o.a(g11, this.f4588b));
                    } else {
                        d(g11, list, z10);
                    }
                }
                i10++;
            } while (i10 < q10);
        }
    }

    private final List f(List list) {
        List D10 = D(this, false, false, 3, (Object) null);
        int size = D10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) D10.get(i10);
            if (nVar.y()) {
                list.add(nVar);
            } else if (!nVar.f4590d.x()) {
                nVar.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ List g(n nVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return nVar.f(list);
    }

    public static /* synthetic */ List m(n nVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !nVar.f4588b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return nVar.l(z10, z11, z12);
    }

    private final boolean y() {
        if (!this.f4588b || !this.f4590d.z()) {
            return false;
        }
        return true;
    }

    public final boolean A() {
        if (this.f4591e || !t().isEmpty() || o.f(this.f4589c, d.f4597a) != null) {
            return false;
        }
        return true;
    }

    public final List C(boolean z10, boolean z11) {
        if (this.f4591e) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f4589c, arrayList, z11);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    public final n a() {
        return new n(this.f4587a, true, this.f4589c, this.f4590d);
    }

    public final C1235c0 e() {
        if (this.f4591e) {
            n r10 = r();
            if (r10 != null) {
                return r10.e();
            }
            return null;
        }
        C1244j g10 = o.g(this.f4589c);
        if (g10 == null) {
            g10 = this.f4587a;
        }
        return C1245k.h(g10, C1239e0.a(8));
    }

    public final C2423i h() {
        C1197s C12;
        n r10 = r();
        if (r10 == null) {
            return C2423i.f25325e.a();
        }
        C1235c0 e10 = e();
        if (e10 != null) {
            if (!e10.G()) {
                e10 = null;
            }
            if (!(e10 == null || (C12 = e10.C1()) == null)) {
                return C1197s.C0(C1245k.h(r10.f4587a, C1239e0.a(8)), C12, false, 2, (Object) null);
            }
        }
        return C2423i.f25325e.a();
    }

    public final C2423i i() {
        C2423i b10;
        C1235c0 e10 = e();
        if (e10 != null) {
            if (!e10.G()) {
                e10 = null;
            }
            if (!(e10 == null || (b10 = C1198t.b(e10)) == null)) {
                return b10;
            }
        }
        return C2423i.f25325e.a();
    }

    public final C2423i j() {
        C2423i c10;
        C1235c0 e10 = e();
        if (e10 != null) {
            if (!e10.G()) {
                e10 = null;
            }
            if (!(e10 == null || (c10 = C1198t.c(e10)) == null)) {
                return c10;
            }
        }
        return C2423i.f25325e.a();
    }

    public final List k() {
        return m(this, false, false, false, 7, (Object) null);
    }

    public final List l(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f4590d.x()) {
            return C6565s.n();
        }
        if (y()) {
            return g(this, (List) null, 1, (Object) null);
        }
        return C(z11, z12);
    }

    public final j n() {
        if (!y()) {
            return this.f4590d;
        }
        j n10 = this.f4590d.n();
        B(n10);
        return n10;
    }

    public final int o() {
        return this.f4593g;
    }

    public final C1201w p() {
        return this.f4589c;
    }

    public final G q() {
        return this.f4589c;
    }

    public final n r() {
        G g10;
        n nVar = this.f4592f;
        if (nVar != null) {
            return nVar;
        }
        if (this.f4588b) {
            g10 = o.f(this.f4589c, e.f4598a);
        } else {
            g10 = null;
        }
        if (g10 == null) {
            g10 = o.f(this.f4589c, f.f4599a);
        }
        if (g10 == null) {
            return null;
        }
        return o.a(g10, this.f4588b);
    }

    public final long s() {
        C1235c0 e10 = e();
        if (e10 != null) {
            if (!e10.G()) {
                e10 = null;
            }
            if (e10 != null) {
                return C1198t.e(e10);
            }
        }
        return C2421g.f25320b.c();
    }

    public final List t() {
        return m(this, false, true, false, 4, (Object) null);
    }

    public final long u() {
        C1235c0 e10 = e();
        if (e10 != null) {
            return e10.b();
        }
        return r.f19235b.a();
    }

    public final C2423i v() {
        C1244j jVar;
        if (this.f4590d.z()) {
            jVar = o.g(this.f4589c);
            if (jVar == null) {
                jVar = this.f4587a;
            }
        } else {
            jVar = this.f4587a;
        }
        return x0.c(jVar.v0(), x0.a(this.f4590d));
    }

    public final j w() {
        return this.f4590d;
    }

    public final boolean x() {
        return this.f4591e;
    }

    public final boolean z() {
        C1235c0 e10 = e();
        if (e10 != null) {
            return e10.Q2();
        }
        return false;
    }
}
