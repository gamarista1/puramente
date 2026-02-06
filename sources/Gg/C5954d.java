package gg;

import Bg.C5318d;
import Bg.C5319e;
import Bg.N;
import Eg.g;
import Eg.n;
import Fg.S;
import Of.h0;
import gg.C5941A;
import gg.C5974x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.f;

/* renamed from: gg.d  reason: case insensitive filesystem */
public abstract class C5954d extends C5955e implements C5319e {

    /* renamed from: c  reason: collision with root package name */
    private final g f67742c;

    /* renamed from: gg.d$a */
    public static final class a implements C5974x.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5954d f67743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f67744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5974x f67745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HashMap f67746d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f67747e;

        /* renamed from: gg.d$a$a  reason: collision with other inner class name */
        public final class C0998a extends b implements C5974x.e {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f67748d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0998a(a aVar, C5941A a10) {
                super(aVar, a10);
                C6496s.h(a10, "signature");
                this.f67748d = aVar;
            }

            public C5974x.a c(int i10, ng.b bVar, h0 h0Var) {
                C6496s.h(bVar, "classId");
                C6496s.h(h0Var, "source");
                C5941A e10 = C5941A.f67712b.e(d(), i10);
                List list = (List) this.f67748d.f67744b.get(e10);
                if (list == null) {
                    list = new ArrayList();
                    this.f67748d.f67744b.put(e10, list);
                }
                return this.f67748d.f67743a.y(bVar, h0Var, list);
            }
        }

        /* renamed from: gg.d$a$b */
        public class b implements C5974x.c {

            /* renamed from: a  reason: collision with root package name */
            private final C5941A f67749a;

            /* renamed from: b  reason: collision with root package name */
            private final ArrayList f67750b = new ArrayList();

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f67751c;

            public b(a aVar, C5941A a10) {
                C6496s.h(a10, "signature");
                this.f67751c = aVar;
                this.f67749a = a10;
            }

            public void a() {
                if (!this.f67750b.isEmpty()) {
                    this.f67751c.f67744b.put(this.f67749a, this.f67750b);
                }
            }

            public C5974x.a b(ng.b bVar, h0 h0Var) {
                C6496s.h(bVar, "classId");
                C6496s.h(h0Var, "source");
                return this.f67751c.f67743a.y(bVar, h0Var, this.f67750b);
            }

            /* access modifiers changed from: protected */
            public final C5941A d() {
                return this.f67749a;
            }
        }

        a(C5954d dVar, HashMap hashMap, C5974x xVar, HashMap hashMap2, HashMap hashMap3) {
            this.f67743a = dVar;
            this.f67744b = hashMap;
            this.f67745c = xVar;
            this.f67746d = hashMap2;
            this.f67747e = hashMap3;
        }

        public C5974x.c a(f fVar, String str, Object obj) {
            Object I10;
            C6496s.h(fVar, "name");
            C6496s.h(str, "desc");
            C5941A.a aVar = C5941A.f67712b;
            String b10 = fVar.b();
            C6496s.g(b10, "asString(...)");
            C5941A a10 = aVar.a(b10, str);
            if (!(obj == null || (I10 = this.f67743a.I(str, obj)) == null)) {
                this.f67747e.put(a10, I10);
            }
            return new b(this, a10);
        }

        public C5974x.e b(f fVar, String str) {
            C6496s.h(fVar, "name");
            C6496s.h(str, "desc");
            C5941A.a aVar = C5941A.f67712b;
            String b10 = fVar.b();
            C6496s.g(b10, "asString(...)");
            return new C0998a(this, aVar.d(b10, str));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5954d(n nVar, C5972v vVar) {
        super(vVar);
        C6496s.h(nVar, "storageManager");
        C6496s.h(vVar, "kotlinClassFinder");
        this.f67742c = nVar.h(new C5951a(this));
    }

    /* access modifiers changed from: private */
    public static final Object G(C5957g gVar, C5941A a10) {
        C6496s.h(gVar, "$this$loadConstantFromProperty");
        C6496s.h(a10, "it");
        return gVar.b().get(a10);
    }

    private final C5957g H(C5974x xVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        xVar.c(new a(this, hashMap, xVar, hashMap3, hashMap2), r(xVar));
        return new C5957g(hashMap, hashMap2, hashMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        r4 = r10;
        r5 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object J(Bg.N r11, ig.n r12, Bg.C5318d r13, Fg.S r14, yf.p r15) {
        /*
            r10 = this;
            gg.e$b r0 = gg.C5955e.f67752b
            kg.b$b r1 = kg.C6435b.f71527B
            int r2 = r12.a0()
            java.lang.Boolean r4 = r1.d(r2)
            boolean r5 = mg.C6581i.f(r12)
            gg.v r6 = r10.v()
            mg.e r7 = r10.u()
            r2 = 1
            r3 = 1
            r1 = r11
            gg.x r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            gg.x r0 = r10.p(r11, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            hg.a r2 = r0.e()
            mg.e r2 = r2.d()
            gg.n$a r3 = gg.C5964n.f67794b
            mg.e r3 = r3.a()
            boolean r9 = r2.d(r3)
            kg.c r6 = r11.b()
            kg.g r7 = r11.d()
            r4 = r10
            r5 = r12
            r8 = r13
            gg.A r11 = r4.s(r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x004b
            return r1
        L_0x004b:
            Eg.g r12 = r10.f67742c
            java.lang.Object r12 = r12.invoke(r0)
            java.lang.Object r11 = r15.invoke(r12, r11)
            if (r11 != 0) goto L_0x0058
            return r1
        L_0x0058:
            boolean r12 = Lf.s.d(r14)
            if (r12 == 0) goto L_0x0062
            java.lang.Object r11 = r10.M(r11)
        L_0x0062:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.C5954d.J(Bg.N, ig.n, Bg.d, Fg.S, yf.p):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object K(C5957g gVar, C5941A a10) {
        C6496s.h(gVar, "$this$loadConstantFromProperty");
        C6496s.h(a10, "it");
        return gVar.c().get(a10);
    }

    /* access modifiers changed from: private */
    public static final C5957g L(C5954d dVar, C5974x xVar) {
        C6496s.h(xVar, "kotlinClass");
        return dVar.H(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C5957g q(C5974x xVar) {
        C6496s.h(xVar, "binaryClass");
        return (C5957g) this.f67742c.invoke(xVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: tg.s$b$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(ng.b r3, java.util.Map r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            Kf.a r0 = Kf.a.f63853a
            ng.b r0 = r0.a()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r0)
            r0 = 0
            if (r3 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.String r3 = "value"
            ng.f r3 = ng.f.i(r3)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r3 instanceof tg.s
            r1 = 0
            if (r4 == 0) goto L_0x002a
            tg.s r3 = (tg.s) r3
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.Object r3 = r3.b()
            boolean r4 = r3 instanceof tg.s.b.C1070b
            if (r4 == 0) goto L_0x0039
            r1 = r3
            tg.s$b$b r1 = (tg.s.b.C1070b) r1
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            ng.b r3 = r1.b()
            boolean r3 = r2.w(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.C5954d.F(ng.b, java.util.Map):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract Object I(String str, Object obj);

    /* access modifiers changed from: protected */
    public abstract Object M(Object obj);

    public Object d(N n10, ig.n nVar, S s10) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6496s.h(s10, "expectedType");
        return J(n10, nVar, C5318d.PROPERTY, s10, C5953c.f67741a);
    }

    public Object e(N n10, ig.n nVar, S s10) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6496s.h(s10, "expectedType");
        return J(n10, nVar, C5318d.PROPERTY_GETTER, s10, C5952b.f67740a);
    }
}
