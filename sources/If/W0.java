package If;

import Dg.C5357s;
import Dg.C5358t;
import Ff.d;
import Ff.l;
import Ff.q;
import Ff.s;
import Fg.S;
import If.a1;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.m0;
import Tf.f;
import gg.C5968r;
import gg.C5974x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.W;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import xf.C6781a;
import yf.C6787a;

public final class W0 implements q, Y {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ l[] f63613d = {O.i(new F(O.b(W0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final m0 f63614a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a f63615b = a1.c(new V0(this));

    /* renamed from: c  reason: collision with root package name */
    private final X0 f63616c;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63617a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Fg.N0[] r0 = Fg.N0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fg.N0 r1 = Fg.N0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Fg.N0 r1 = Fg.N0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Fg.N0 r1 = Fg.N0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63617a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: If.W0.a.<clinit>():void");
        }
    }

    public W0(X0 x02, m0 m0Var) {
        Object obj;
        X x10;
        C5358t tVar;
        C6496s.h(m0Var, "descriptor");
        this.f63614a = m0Var;
        if (x02 == null) {
            C5495m b10 = getDescriptor().b();
            C6496s.g(b10, "getContainingDeclaration(...)");
            if (b10 instanceof C5487e) {
                obj = d((C5487e) b10);
            } else if (b10 instanceof C5484b) {
                C5495m b11 = ((C5484b) b10).b();
                C6496s.g(b11, "getContainingDeclaration(...)");
                if (b11 instanceof C5487e) {
                    x10 = d((C5487e) b11);
                } else {
                    if (b10 instanceof C5358t) {
                        tVar = (C5358t) b10;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        d e10 = C6781a.e(b(tVar));
                        C6496s.f(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        x10 = (X) e10;
                    } else {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + b10);
                    }
                }
                obj = b10.U(new C5443j(x10), C6514M.f71813a);
            } else {
                throw new Y0("Unknown type parameter container: " + b10);
            }
            x02 = (X0) obj;
        }
        this.f63616c = x02;
    }

    private final Class b(C5358t tVar) {
        C5968r rVar;
        C5974x xVar;
        Class f10;
        C5357s L10 = tVar.L();
        f fVar = null;
        if (L10 instanceof C5968r) {
            rVar = (C5968r) L10;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            xVar = rVar.g();
        } else {
            xVar = null;
        }
        if (xVar instanceof f) {
            fVar = (f) xVar;
        }
        if (fVar != null && (f10 = fVar.f()) != null) {
            return f10;
        }
        throw new Y0("Container of deserialized member is not resolved: " + tVar);
    }

    private final X d(C5487e eVar) {
        d dVar;
        Class q10 = j1.q(eVar);
        if (q10 != null) {
            dVar = C6781a.e(q10);
        } else {
            dVar = null;
        }
        X x10 = (X) dVar;
        if (x10 != null) {
            return x10;
        }
        throw new Y0("Type parameter container is not resolved: " + eVar.b());
    }

    /* access modifiers changed from: private */
    public static final List e(W0 w02) {
        List upperBounds = w02.getDescriptor().getUpperBounds();
        C6496s.g(upperBounds, "getUpperBounds(...)");
        Iterable<S> iterable = upperBounds;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (S u02 : iterable) {
            arrayList.add(new U0(u02, (C6787a) null, 2, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* renamed from: c */
    public m0 getDescriptor() {
        return this.f63614a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof W0) {
            W0 w02 = (W0) obj;
            if (!C6496s.c(this.f63616c, w02.f63616c) || !C6496s.c(getName(), w02.getName())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getName() {
        String b10 = getDescriptor().getName().b();
        C6496s.g(b10, "asString(...)");
        return b10;
    }

    public List getUpperBounds() {
        Object b10 = this.f63615b.b(this, f63613d[0]);
        C6496s.g(b10, "getValue(...)");
        return (List) b10;
    }

    public int hashCode() {
        return (this.f63616c.hashCode() * 31) + getName().hashCode();
    }

    public s n() {
        int i10 = a.f63617a[getDescriptor().n().ordinal()];
        if (i10 == 1) {
            return s.INVARIANT;
        }
        if (i10 == 2) {
            return s.IN;
        }
        if (i10 == 3) {
            return s.OUT;
        }
        throw new C6535s();
    }

    public String toString() {
        return W.f71765a.a(this);
    }
}
