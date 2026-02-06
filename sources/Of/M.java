package Of;

import Ef.i;
import Ef.m;
import Eg.g;
import Eg.n;
import Fg.C5393u;
import Fg.N0;
import Pf.h;
import Rf.C5521j;
import Rf.C5527p;
import Rf.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.L;
import mf.Y;
import ng.c;
import ng.f;
import vg.C6755e;
import yg.C6812k;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final n f64456a;

    /* renamed from: b  reason: collision with root package name */
    private final H f64457b;

    /* renamed from: c  reason: collision with root package name */
    private final g f64458c;

    /* renamed from: d  reason: collision with root package name */
    private final g f64459d;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ng.b f64460a;

        /* renamed from: b  reason: collision with root package name */
        private final List f64461b;

        public a(ng.b bVar, List list) {
            C6496s.h(bVar, "classId");
            C6496s.h(list, "typeParametersCount");
            this.f64460a = bVar;
            this.f64461b = list;
        }

        public final ng.b a() {
            return this.f64460a;
        }

        public final List b() {
            return this.f64461b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f64460a, aVar.f64460a) && C6496s.c(this.f64461b, aVar.f64461b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f64460a.hashCode() * 31) + this.f64461b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f64460a + ", typeParametersCount=" + this.f64461b + ')';
        }
    }

    public static final class b extends C5521j {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f64462i;

        /* renamed from: j  reason: collision with root package name */
        private final List f64463j;

        /* renamed from: k  reason: collision with root package name */
        private final C5393u f64464k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, C5495m mVar, f fVar, boolean z10, int i10) {
            super(nVar, mVar, fVar, h0.f64497a, false);
            C6496s.h(nVar, "storageManager");
            C6496s.h(mVar, "container");
            C6496s.h(fVar, "name");
            this.f64462i = z10;
            i u10 = m.u(0, i10);
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                int a10 = ((L) it).a();
                h b10 = h.f64602L.b();
                N0 n02 = N0.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(a10);
                arrayList.add(U.R0(this, b10, false, n02, f.i(sb2.toString()), a10, nVar));
            }
            this.f64463j = arrayList;
            this.f64464k = new C5393u(this, q0.g(this), Y.d(C6755e.s(this).m().i()), nVar);
        }

        public boolean A() {
            return this.f64462i;
        }

        public C5486d E() {
            return null;
        }

        public boolean I0() {
            return false;
        }

        /* renamed from: K0 */
        public C6812k.b n0() {
            return C6812k.b.f73949b;
        }

        /* renamed from: L0 */
        public C5393u l() {
            return this.f64464k;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M0 */
        public C6812k.b m0(Gg.g gVar) {
            C6496s.h(gVar, "kotlinTypeRefiner");
            return C6812k.b.f73949b;
        }

        public r0 W() {
            return null;
        }

        public boolean Z() {
            return false;
        }

        public boolean b0() {
            return false;
        }

        public boolean f0() {
            return false;
        }

        public h getAnnotations() {
            return h.f64602L.b();
        }

        public C5502u getVisibility() {
            C5502u uVar = C5501t.f64509e;
            C6496s.g(uVar, "PUBLIC");
            return uVar;
        }

        public C5488f h() {
            return C5488f.CLASS;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public Collection j() {
            return Y.e();
        }

        public boolean k0() {
            return false;
        }

        public C5487e o0() {
            return null;
        }

        public List q() {
            return this.f64463j;
        }

        public E r() {
            return E.FINAL;
        }

        public boolean t() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        public Collection y() {
            return C6565s.n();
        }
    }

    public M(n nVar, H h10) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "module");
        this.f64456a = nVar;
        this.f64457b = h10;
        this.f64458c = nVar.h(new K(this));
        this.f64459d = nVar.h(new L(this));
    }

    /* access modifiers changed from: private */
    public static final C5487e c(M m10, a aVar) {
        C5495m mVar;
        int i10;
        C6496s.h(aVar, "<destruct>");
        ng.b a10 = aVar.a();
        List b10 = aVar.b();
        if (!a10.i()) {
            ng.b e10 = a10.e();
            if (e10 == null || (mVar = m10.d(e10, C6565s.g0(b10, 1))) == null) {
                mVar = (C5489g) m10.f64458c.invoke(a10.f());
            }
            C5495m mVar2 = mVar;
            boolean j10 = a10.j();
            n nVar = m10.f64456a;
            f h10 = a10.h();
            Integer num = (Integer) C6565s.q0(b10);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            return new b(nVar, mVar2, h10, j10, i10);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + a10);
    }

    /* access modifiers changed from: private */
    public static final N e(M m10, c cVar) {
        C6496s.h(cVar, "fqName");
        return new C5527p(m10.f64457b, cVar);
    }

    public final C5487e d(ng.b bVar, List list) {
        C6496s.h(bVar, "classId");
        C6496s.h(list, "typeParametersCount");
        return (C5487e) this.f64459d.invoke(new a(bVar, list));
    }
}
