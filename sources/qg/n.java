package qg;

import Fg.B0;
import Fg.S;
import Lf.i;
import Of.C5487e;
import Of.C5491i;
import Of.C5495m;
import Of.l0;
import Of.t0;
import Pf.c;
import Pf.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.Y;
import ng.d;
import ng.f;
import qg.C6661b;
import yf.C6798l;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72692a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f72693b;

    /* renamed from: c  reason: collision with root package name */
    public static final n f72694c;

    /* renamed from: d  reason: collision with root package name */
    public static final n f72695d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f72696e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f72697f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f72698g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f72699h;

    /* renamed from: i  reason: collision with root package name */
    public static final n f72700i;

    /* renamed from: j  reason: collision with root package name */
    public static final n f72701j;

    /* renamed from: k  reason: collision with root package name */
    public static final n f72702k;

    /* renamed from: l  reason: collision with root package name */
    public static final n f72703l;

    public static final class a {

        /* renamed from: qg.n$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1054a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f72704a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Of.f[] r0 = Of.C5488f.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Of.f r1 = Of.C5488f.CLASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Of.f r1 = Of.C5488f.INTERFACE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Of.f r1 = Of.C5488f.ENUM_CLASS     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Of.f r1 = Of.C5488f.OBJECT     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Of.f r1 = Of.C5488f.ANNOTATION_CLASS     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Of.f r1 = Of.C5488f.ENUM_ENTRY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f72704a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qg.n.a.C1054a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(C5491i iVar) {
            C6496s.h(iVar, "classifier");
            if (iVar instanceof l0) {
                return "typealias";
            }
            if (iVar instanceof C5487e) {
                C5487e eVar = (C5487e) iVar;
                if (eVar.b0()) {
                    return "companion object";
                }
                switch (C1054a.f72704a[eVar.h().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new C6535s();
                }
            } else {
                throw new AssertionError("Unexpected classifier: " + iVar);
            }
        }

        public final n b(C6798l lVar) {
            C6496s.h(lVar, "changeOptions");
            z zVar = new z();
            lVar.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f72705a = new a();

            private a() {
            }

            public void a(int i10, StringBuilder sb2) {
                C6496s.h(sb2, "builder");
                sb2.append("(");
            }

            public void b(t0 t0Var, int i10, int i11, StringBuilder sb2) {
                C6496s.h(t0Var, "parameter");
                C6496s.h(sb2, "builder");
            }

            public void c(t0 t0Var, int i10, int i11, StringBuilder sb2) {
                C6496s.h(t0Var, "parameter");
                C6496s.h(sb2, "builder");
                if (i10 != i11 - 1) {
                    sb2.append(", ");
                }
            }

            public void d(int i10, StringBuilder sb2) {
                C6496s.h(sb2, "builder");
                sb2.append(")");
            }
        }

        void a(int i10, StringBuilder sb2);

        void b(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void c(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f72692a = aVar;
        f72693b = aVar.b(C6662c.f72681a);
        f72694c = aVar.b(C6664e.f72683a);
        f72695d = aVar.b(C6665f.f72684a);
        f72696e = aVar.b(C6666g.f72685a);
        f72697f = aVar.b(h.f72686a);
        f72698g = aVar.b(i.f72687a);
        f72699h = aVar.b(j.f72688a);
        f72700i = aVar.b(k.f72689a);
        f72701j = aVar.b(l.f72690a);
        f72702k = aVar.b(m.f72691a);
        f72703l = aVar.b(C6663d.f72682a);
    }

    /* access modifiers changed from: private */
    public static final C6514M A(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(Y.e());
        wVar.p(C6661b.C1053b.f72679a);
        wVar.r(true);
        wVar.q(D.NONE);
        wVar.g(true);
        wVar.n(true);
        wVar.f(true);
        wVar.b(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M B(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.p(C6661b.C1053b.f72679a);
        wVar.q(D.ONLY_NON_SYNTHESIZED);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M C(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.l(Y.e());
        return C6514M.f71813a;
    }

    public static /* synthetic */ String Q(n nVar, c cVar, e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                eVar = null;
            }
            return nVar.P(cVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }

    /* access modifiers changed from: private */
    public static final C6514M s(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(Y.e());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M t(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(Y.e());
        wVar.f(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M u(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.c(false);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M v(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.l(Y.e());
        wVar.p(C6661b.C1053b.f72679a);
        wVar.q(D.ONLY_NON_SYNTHESIZED);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M w(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.m(true);
        wVar.p(C6661b.a.f72678a);
        wVar.l(v.f72720d);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M x(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.l(v.f72719c);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M y(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.l(v.f72720d);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M z(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.e(F.f72668b);
        wVar.l(v.f72720d);
        return C6514M.f71813a;
    }

    public abstract String O(C5495m mVar);

    public abstract String P(c cVar, e eVar);

    public abstract String R(String str, String str2, i iVar);

    public abstract String S(d dVar);

    public abstract String T(f fVar, boolean z10);

    public abstract String U(S s10);

    public abstract String V(B0 b02);

    public final n W(C6798l lVar) {
        C6496s.h(lVar, "changeOptions");
        C6496s.f(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z u10 = ((u) this).K0().u();
        lVar.invoke(u10);
        u10.q0();
        return new u(u10);
    }
}
