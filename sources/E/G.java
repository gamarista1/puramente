package E;

import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import h0.C2020d;
import h0.C2023g;
import h0.C2025i;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

final class G implements C2023g, C2020d {

    /* renamed from: d  reason: collision with root package name */
    public static final b f1557d = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C2023g f1558a;

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f1559b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Set f1560c;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2023g f1561a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2023g gVar) {
            super(1);
            this.f1561a = gVar;
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            boolean z10;
            C2023g gVar = this.f1561a;
            if (gVar != null) {
                z10 = gVar.a(obj);
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class b {

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            public static final a f1562a = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final Map invoke(C2028l lVar, G g10) {
                Map e10 = g10.e();
                if (e10.isEmpty()) {
                    return null;
                }
                return e10;
            }
        }

        /* renamed from: E.G$b$b  reason: collision with other inner class name */
        static final class C0021b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2023g f1563a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0021b(C2023g gVar) {
                super(1);
                this.f1563a = gVar;
            }

            /* renamed from: a */
            public final G invoke(Map map) {
                return new G(this.f1563a, map);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a(C2023g gVar) {
            return C2027k.a(a.f1562a, new C0021b(gVar));
        }

        private b() {
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f1564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1565b;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f1566a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f1567b;

            public a(G g10, Object obj) {
                this.f1566a = g10;
                this.f1567b = obj;
            }

            public void dispose() {
                this.f1566a.f1560c.add(this.f1567b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G g10, Object obj) {
            super(1);
            this.f1564a = g10;
            this.f1565b = obj;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f1564a.f1560c.remove(this.f1565b);
            return new a(this.f1564a, this.f1565b);
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f1568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f1570c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(G g10, Object obj, p pVar, int i10) {
            super(2);
            this.f1568a = g10;
            this.f1569b = obj;
            this.f1570c = pVar;
            this.f1571d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f1568a.c(this.f1569b, this.f1570c, mVar, M0.a(this.f1571d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public G(C2023g gVar) {
        this.f1558a = gVar;
        this.f1559b = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f1560c = new LinkedHashSet();
    }

    public boolean a(Object obj) {
        return this.f1558a.a(obj);
    }

    public C2023g.a b(String str, C6787a aVar) {
        return this.f1558a.b(str, aVar);
    }

    public void c(Object obj, p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-697180401);
        if ((i10 & 6) == 0) {
            if (h10.C(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-697180401, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            C2020d h11 = h();
            if (h11 != null) {
                int i15 = i11 & 14;
                h11.c(obj, pVar, h10, i11 & 126);
                boolean C10 = h10.C(this) | h10.C(obj);
                Object A10 = h10.A();
                if (C10 || A10 == C1500m.f10026a.a()) {
                    A10 = new c(this, obj);
                    h10.r(A10);
                }
                P.c(obj, (C6798l) A10, h10, i15);
                if (C1506p.H()) {
                    C1506p.P();
                }
            } else {
                throw new IllegalArgumentException("null wrappedHolder");
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(this, obj, pVar, i10));
        }
    }

    public void d(Object obj) {
        C2020d h10 = h();
        if (h10 != null) {
            h10.d(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder");
    }

    public Map e() {
        C2020d h10 = h();
        if (h10 != null) {
            for (Object d10 : this.f1560c) {
                h10.d(d10);
            }
        }
        return this.f1558a.e();
    }

    public Object f(String str) {
        return this.f1558a.f(str);
    }

    public final C2020d h() {
        return (C2020d) this.f1559b.getValue();
    }

    public final void i(C2020d dVar) {
        this.f1559b.setValue(dVar);
    }

    public G(C2023g gVar, Map map) {
        this(C2025i.a(map, new a(gVar)));
    }
}
