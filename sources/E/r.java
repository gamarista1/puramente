package E;

import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.P;
import g0.c;
import h0.C2020d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C2020d f1670a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f1671b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f1672c = new LinkedHashMap();

    private final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f1673a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f1674b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f1675c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public p f1676d;

        /* renamed from: E.r$a$a  reason: collision with other inner class name */
        static final class C0025a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f1678a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f1679b;

            /* renamed from: E.r$a$a$a  reason: collision with other inner class name */
            static final class C0026a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f1680a;

                /* renamed from: E.r$a$a$a$a  reason: collision with other inner class name */
                public static final class C0027a implements L {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f1681a;

                    public C0027a(a aVar) {
                        this.f1681a = aVar;
                    }

                    public void dispose() {
                        this.f1681a.f1676d = null;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0026a(a aVar) {
                    super(1);
                    this.f1680a = aVar;
                }

                /* renamed from: a */
                public final L invoke(M m10) {
                    return new C0027a(this.f1680a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0025a(r rVar, a aVar) {
                super(2);
                this.f1678a = rVar;
                this.f1679b = aVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                    }
                    C1150t tVar = (C1150t) this.f1678a.d().invoke();
                    int f10 = this.f1679b.f();
                    if ((f10 >= tVar.a() || !C6496s.c(tVar.d(f10), this.f1679b.g())) && (f10 = tVar.c(this.f1679b.g())) != -1) {
                        this.f1679b.f1675c = f10;
                    }
                    int i11 = f10;
                    if (i11 != -1) {
                        mVar.T(-660479623);
                        C1149s.a(tVar, T.a(this.f1678a.f1670a), i11, T.a(this.f1679b.g()), mVar, 0);
                        mVar.M();
                    } else {
                        mVar.T(-660272047);
                        mVar.M();
                    }
                    Object g10 = this.f1679b.g();
                    boolean C10 = mVar.C(this.f1679b);
                    a aVar = this.f1679b;
                    Object A10 = mVar.A();
                    if (C10 || A10 == C1500m.f10026a.a()) {
                        A10 = new C0026a(aVar);
                        mVar.r(A10);
                    }
                    P.c(g10, (C6798l) A10, mVar, 0);
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

        public a(int i10, Object obj, Object obj2) {
            this.f1673a = obj;
            this.f1674b = obj2;
            this.f1675c = i10;
        }

        private final p c() {
            return c.c(1403994769, true, new C0025a(r.this, this));
        }

        public final p d() {
            p pVar = this.f1676d;
            if (pVar != null) {
                return pVar;
            }
            p c10 = c();
            this.f1676d = c10;
            return c10;
        }

        public final Object e() {
            return this.f1674b;
        }

        public final int f() {
            return this.f1675c;
        }

        public final Object g() {
            return this.f1673a;
        }
    }

    public r(C2020d dVar, C6787a aVar) {
        this.f1670a = dVar;
        this.f1671b = aVar;
    }

    public final p b(int i10, Object obj, Object obj2) {
        a aVar = (a) this.f1672c.get(obj);
        if (aVar != null && aVar.f() == i10 && C6496s.c(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i10, obj, obj2);
        this.f1672c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f1672c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        C1150t tVar = (C1150t) this.f1671b.invoke();
        int c10 = tVar.c(obj);
        if (c10 != -1) {
            return tVar.f(c10);
        }
        return null;
    }

    public final C6787a d() {
        return this.f1671b;
    }
}
