package tg;

import Fg.C5366d0;
import Fg.D0;
import Fg.F0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Gg.g;
import Lf.i;
import Of.C5490h;
import Of.H;
import com.amazon.a.a.o.b.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6535s;
import mf.C6565s;
import sf.C6714a;

public final class q implements v0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f73565f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f73566a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final H f73567b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f73568c;

    /* renamed from: d  reason: collision with root package name */
    private final C5366d0 f73569d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f73570e;

    public static final class a {

        /* renamed from: tg.q$a$a  reason: collision with other inner class name */
        private enum C1069a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            static {
                C1069a[] a10;
                f73574d = C6714a.a(a10);
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f73575a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    tg.q$a$a[] r0 = tg.q.a.C1069a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tg.q$a$a r1 = tg.q.a.C1069a.COMMON_SUPER_TYPE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tg.q$a$a r1 = tg.q.a.C1069a.INTERSECTION_TYPE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f73575a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tg.q.a.b.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C5366d0 a(Collection collection, C1069a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    a aVar2 = q.f73565f;
                    next = aVar2.c((C5366d0) next, (C5366d0) it.next(), aVar);
                }
                return (C5366d0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final C5366d0 c(C5366d0 d0Var, C5366d0 d0Var2, C1069a aVar) {
            if (d0Var == null || d0Var2 == null) {
                return null;
            }
            v0 N02 = d0Var.N0();
            v0 N03 = d0Var2.N0();
            boolean z10 = N02 instanceof q;
            if (z10 && (N03 instanceof q)) {
                return e((q) N02, (q) N03, aVar);
            }
            if (z10) {
                return d((q) N02, d0Var2);
            }
            if (N03 instanceof q) {
                return d((q) N03, d0Var);
            }
            return null;
        }

        private final C5366d0 d(q qVar, C5366d0 d0Var) {
            if (qVar.f().contains(d0Var)) {
                return d0Var;
            }
            return null;
        }

        private final C5366d0 e(q qVar, q qVar2, C1069a aVar) {
            Set t02;
            int i10 = b.f73575a[aVar.ordinal()];
            if (i10 == 1) {
                t02 = C6565s.t0(qVar.f(), qVar2.f());
            } else if (i10 == 2) {
                t02 = C6565s.k1(qVar.f(), qVar2.f());
            } else {
                throw new C6535s();
            }
            return V.f(r0.f63046b.j(), new q(qVar.f73566a, qVar.f73567b, t02, (DefaultConstructorMarker) null), false);
        }

        public final C5366d0 b(Collection collection) {
            C6496s.h(collection, "types");
            return a(collection, C1069a.INTERSECTION_TYPE);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, H h10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, h10, set);
    }

    private final List g() {
        return (List) this.f73570e.getValue();
    }

    private final boolean h() {
        Iterable<S> a10 = v.a(this.f73567b);
        if ((a10 instanceof Collection) && ((Collection) a10).isEmpty()) {
            return true;
        }
        for (S contains : a10) {
            if (this.f73568c.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final List i(q qVar) {
        C5366d0 p10 = qVar.m().x().p();
        C6496s.g(p10, "getDefaultType(...)");
        List t10 = C6565s.t(F0.f(p10, C6565s.e(new D0(N0.IN_VARIANCE, qVar.f73569d)), (r0) null, 2, (Object) null));
        if (!qVar.h()) {
            t10.add(qVar.m().L());
        }
        return t10;
    }

    private final String j() {
        return '[' + C6565s.x0(this.f73568c, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, p.f73564a, 30, (Object) null) + ']';
    }

    /* access modifiers changed from: private */
    public static final CharSequence k(S s10) {
        C6496s.h(s10, "it");
        return s10.toString();
    }

    public final Set f() {
        return this.f73568c;
    }

    public List getParameters() {
        return C6565s.n();
    }

    public Collection l() {
        return g();
    }

    public i m() {
        return this.f73567b.m();
    }

    public v0 n(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this;
    }

    public C5490h o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + j();
    }

    private q(long j10, H h10, Set set) {
        this.f73569d = V.f(r0.f63046b.j(), this, false);
        this.f73570e = C6531o.b(new o(this));
        this.f73566a = j10;
        this.f73567b = h10;
        this.f73568c = set;
    }
}
