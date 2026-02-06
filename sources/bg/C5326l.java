package Bg;

import Dg.C5352m;
import Dg.C5357s;
import Lf.o;
import Of.C5487e;
import Of.N;
import Of.T;
import Of.h0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ig.t;
import ig.w;
import java.util.Iterator;
import java.util.Set;
import kg.C6434a;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;
import ng.b;
import ng.c;
import yf.C6798l;

/* renamed from: Bg.l  reason: case insensitive filesystem */
public final class C5326l {

    /* renamed from: c  reason: collision with root package name */
    public static final b f62536c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Set f62537d;

    /* renamed from: a  reason: collision with root package name */
    private final C5328n f62538a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f62539b;

    /* renamed from: Bg.l$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ng.b f62540a;

        /* renamed from: b  reason: collision with root package name */
        private final C5323i f62541b;

        public a(ng.b bVar, C5323i iVar) {
            C6496s.h(bVar, "classId");
            this.f62540a = bVar;
            this.f62541b = iVar;
        }

        public final C5323i a() {
            return this.f62541b;
        }

        public final ng.b b() {
            return this.f62540a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || !C6496s.c(this.f62540a, ((a) obj).f62540a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f62540a.hashCode();
        }
    }

    /* renamed from: Bg.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C5326l.f62537d;
        }

        private b() {
        }
    }

    static {
        b.a aVar = ng.b.f72283d;
        c l10 = o.a.f64001d.l();
        C6496s.g(l10, "toSafe(...)");
        f62537d = Y.d(aVar.c(l10));
    }

    public C5326l(C5328n nVar) {
        C6496s.h(nVar, "components");
        this.f62538a = nVar;
        this.f62539b = nVar.u().c(new C5325k(this));
    }

    /* access modifiers changed from: private */
    public static final C5487e c(C5326l lVar, a aVar) {
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return lVar.d(aVar);
    }

    private final C5487e d(a aVar) {
        Object obj;
        C5330p a10;
        C5352m mVar;
        ng.b b10 = aVar.b();
        for (Qf.b a11 : this.f62538a.l()) {
            C5487e a12 = a11.a(b10);
            if (a12 != null) {
                return a12;
            }
        }
        if (f62537d.contains(b10)) {
            return null;
        }
        C5323i a13 = aVar.a();
        if (a13 == null && (a13 = this.f62538a.e().a(b10)) == null) {
            return null;
        }
        C6436c a14 = a13.a();
        ig.c b11 = a13.b();
        C6434a c10 = a13.c();
        h0 d10 = a13.d();
        ng.b e10 = b10.e();
        if (e10 != null) {
            C5487e f10 = f(this, e10, (C5323i) null, 2, (Object) null);
            if (f10 instanceof C5352m) {
                mVar = (C5352m) f10;
            } else {
                mVar = null;
            }
            if (mVar == null || !mVar.k1(b10.h())) {
                return null;
            }
            a10 = mVar.d1();
        } else {
            Iterator it = T.c(this.f62538a.s(), b10.f()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                N n10 = (N) obj;
                if (n10 instanceof r) {
                    if (((r) n10).K0(b10.h())) {
                        break;
                    }
                } else {
                    break;
                }
            }
            N n11 = (N) obj;
            if (n11 == null) {
                return null;
            }
            C5328n nVar = this.f62538a;
            t i12 = b11.i1();
            C6496s.g(i12, "getTypeTable(...)");
            g gVar = new g(i12);
            h.a aVar2 = h.f71575b;
            w k12 = b11.k1();
            C6496s.g(k12, "getVersionRequirementTable(...)");
            a10 = nVar.a(n11, a14, gVar, aVar2.a(k12), c10, (C5357s) null);
        }
        return new C5352m(a10, b11, a14, c10, d10);
    }

    public static /* synthetic */ C5487e f(C5326l lVar, ng.b bVar, C5323i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = null;
        }
        return lVar.e(bVar, iVar);
    }

    public final C5487e e(ng.b bVar, C5323i iVar) {
        C6496s.h(bVar, "classId");
        return (C5487e) this.f62539b.invoke(new a(bVar, iVar));
    }
}
