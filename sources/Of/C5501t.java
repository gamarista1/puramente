package Of;

import Fg.E;
import Fg.S;
import Mg.l;
import Of.w0;
import Rf.Q;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import mf.Y;
import rg.C6691i;
import zg.C6840g;
import zg.C6841h;

/* renamed from: Of.t  reason: case insensitive filesystem */
public abstract class C5501t {

    /* renamed from: a  reason: collision with root package name */
    public static final C5502u f64505a;

    /* renamed from: b  reason: collision with root package name */
    public static final C5502u f64506b;

    /* renamed from: c  reason: collision with root package name */
    public static final C5502u f64507c;

    /* renamed from: d  reason: collision with root package name */
    public static final C5502u f64508d;

    /* renamed from: e  reason: collision with root package name */
    public static final C5502u f64509e;

    /* renamed from: f  reason: collision with root package name */
    public static final C5502u f64510f;

    /* renamed from: g  reason: collision with root package name */
    public static final C5502u f64511g;

    /* renamed from: h  reason: collision with root package name */
    public static final C5502u f64512h;

    /* renamed from: i  reason: collision with root package name */
    public static final C5502u f64513i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set f64514j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map f64515k;

    /* renamed from: l  reason: collision with root package name */
    public static final C5502u f64516l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C6840g f64517m = new a();

    /* renamed from: n  reason: collision with root package name */
    public static final C6840g f64518n = new b();

    /* renamed from: o  reason: collision with root package name */
    public static final C6840g f64519o = new c();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final Mg.l f64520p;

    /* renamed from: q  reason: collision with root package name */
    private static final Map f64521q = new HashMap();

    /* renamed from: Of.t$a */
    static class a implements C6840g {
        a() {
        }

        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Of.t$b */
    static class b implements C6840g {
        b() {
        }

        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Of.t$c */
    static class c implements C6840g {
        c() {
        }

        public S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Of.t$d */
    static class d extends r {
        d(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(C5495m mVar) {
            if (mVar == null) {
                g(0);
            }
            if (C6691i.j(mVar) != i0.f64498a) {
                return true;
            }
            return false;
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            C5495m mVar2;
            if (qVar == null) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (C6691i.J(qVar) && h(mVar)) {
                return C5501t.f(qVar, mVar);
            }
            if (qVar instanceof C5494l) {
                C5491i b10 = ((C5494l) qVar).b();
                if (z10 && C6691i.G(b10) && C6691i.J(b10) && (mVar instanceof C5494l) && C6691i.J(mVar.b()) && C5501t.f(qVar, mVar)) {
                    return true;
                }
            }
            C5495m mVar3 = qVar;
            while (mVar3 != null) {
                C5495m b11 = mVar3.b();
                if ((b11 instanceof C5487e) && !C6691i.x(b11)) {
                    mVar2 = b11;
                    break;
                }
                boolean z11 = b11 instanceof N;
                mVar3 = b11;
                if (z11) {
                    mVar2 = b11;
                    break;
                }
            }
            mVar2 = mVar3;
            if (mVar2 == null) {
                return false;
            }
            while (mVar != null) {
                if (mVar2 == mVar) {
                    return true;
                }
                if (!(mVar instanceof N)) {
                    mVar = mVar.b();
                } else if (!(mVar2 instanceof N) || !((N) mVar2).f().equals(((N) mVar).f()) || !C6691i.b(mVar, mVar2)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: Of.t$e */
    static class e extends r {
        e(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            C5495m q10;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (C5501t.f64505a.e(gVar, qVar, mVar, z10)) {
                if (gVar == C5501t.f64518n) {
                    return true;
                }
                if (!(gVar == C5501t.f64517m || (q10 = C6691i.q(qVar, C5487e.class)) == null || !(gVar instanceof C6841h))) {
                    return ((C6841h) gVar).u().a().equals(q10.a());
                }
            }
            return false;
        }
    }

    /* renamed from: Of.t$f */
    static class f extends r {
        f(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(C6840g gVar, C5499q qVar, C5487e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (gVar == C5501t.f64519o) {
                return false;
            }
            if (!(qVar instanceof C5484b) || (qVar instanceof C5494l) || gVar == C5501t.f64518n) {
                return true;
            }
            if (gVar == C5501t.f64517m || gVar == null) {
                return false;
            }
            S type = gVar.getType();
            if (C6691i.I(type, eVar) || E.a(type)) {
                return true;
            }
            return false;
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            C5487e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            Class<C5487e> cls = C5487e.class;
            C5487e eVar2 = (C5487e) C6691i.q(qVar, cls);
            C5487e eVar3 = (C5487e) C6691i.r(mVar, cls, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && C6691i.x(eVar2) && (eVar = (C5487e) C6691i.q(eVar2, cls)) != null && C6691i.H(eVar3, eVar)) {
                return true;
            }
            C5499q M10 = C6691i.M(qVar);
            C5487e eVar4 = (C5487e) C6691i.q(M10, cls);
            if (eVar4 == null) {
                return false;
            }
            if (!C6691i.H(eVar3, eVar4) || !h(gVar, M10, eVar3)) {
                return e(gVar, qVar, eVar3.b(), z10);
            }
            return true;
        }
    }

    /* renamed from: Of.t$g */
    static class g extends r {
        g(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (!C6691i.g(mVar).J(C6691i.g(qVar))) {
                return false;
            }
            return C5501t.f64520p.a(qVar, mVar);
        }
    }

    /* renamed from: Of.t$h */
    static class h extends r {
        h(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* renamed from: Of.t$i */
    static class i extends r {
        i(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: Of.t$j */
    static class j extends r {
        j(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: Of.t$k */
    static class k extends r {
        k(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* renamed from: Of.t$l */
    static class l extends r {
        l(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        Mg.l lVar;
        d dVar = new d(w0.e.f64530c);
        f64505a = dVar;
        e eVar = new e(w0.f.f64531c);
        f64506b = eVar;
        f fVar = new f(w0.g.f64532c);
        f64507c = fVar;
        g gVar = new g(w0.b.f64527c);
        f64508d = gVar;
        h hVar = new h(w0.h.f64533c);
        f64509e = hVar;
        i iVar = new i(w0.d.f64529c);
        f64510f = iVar;
        j jVar = new j(w0.a.f64526c);
        f64511g = jVar;
        k kVar = new k(w0.c.f64528c);
        f64512h = kVar;
        l lVar2 = new l(w0.i.f64534c);
        f64513i = lVar2;
        f64514j = Collections.unmodifiableSet(Y.j(dVar, eVar, gVar, iVar));
        HashMap e10 = Pg.a.e(4);
        e10.put(eVar, 0);
        e10.put(dVar, 0);
        e10.put(gVar, 1);
        e10.put(fVar, 1);
        e10.put(hVar, 2);
        f64515k = Collections.unmodifiableMap(e10);
        f64516l = hVar;
        Class<Mg.l> cls = Mg.l.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        if (it.hasNext()) {
            lVar = (Mg.l) it.next();
        } else {
            lVar = l.a.f64163a;
        }
        f64520p = lVar;
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar2);
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 16) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (!(i10 == 1 || i10 == 3 || i10 == 5 || i10 == 7)) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case StdKeyDeserializer.TYPE_URL:
                case StdKeyDeserializer.TYPE_CLASS:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "isPrivate";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 16) {
            th2 = new IllegalArgumentException(format);
        } else {
            th2 = new IllegalStateException(format);
        }
        throw th2;
    }

    public static Integer d(C5502u uVar, C5502u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer a10 = uVar.a(uVar2);
        if (a10 != null) {
            return a10;
        }
        Integer a11 = uVar2.a(uVar);
        if (a11 != null) {
            return Integer.valueOf(-a11.intValue());
        }
        return null;
    }

    public static C5499q e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
        C5499q e10;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        C5499q qVar2 = (C5499q) qVar.a();
        while (qVar2 != null && qVar2.getVisibility() != f64510f) {
            if (!qVar2.getVisibility().e(gVar, qVar2, mVar, z10)) {
                return qVar2;
            }
            qVar2 = (C5499q) C6691i.q(qVar2, C5499q.class);
        }
        if (!(qVar instanceof Q) || (e10 = e(gVar, ((Q) qVar).S(), mVar, z10)) == null) {
            return null;
        }
        return e10;
    }

    public static boolean f(C5495m mVar, C5495m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        i0 j10 = C6691i.j(mVar2);
        if (j10 != i0.f64498a) {
            return j10.equals(C6691i.j(mVar));
        }
        return false;
    }

    public static boolean g(C5502u uVar) {
        if (uVar == null) {
            a(14);
        }
        if (uVar == f64505a || uVar == f64506b) {
            return true;
        }
        return false;
    }

    public static boolean h(C5499q qVar, C5495m mVar, boolean z10) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        if (e(f64518n, qVar, mVar, z10) == null) {
            return true;
        }
        return false;
    }

    private static void i(C5502u uVar) {
        f64521q.put(uVar.b(), uVar);
    }

    public static C5502u j(x0 x0Var) {
        if (x0Var == null) {
            a(15);
        }
        C5502u uVar = (C5502u) f64521q.get(x0Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x0Var);
    }
}
