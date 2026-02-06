package Xf;

import Of.C5495m;
import Of.C5499q;
import Of.C5501t;
import Of.C5502u;
import Of.N;
import Of.r;
import Of.x0;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.HashMap;
import java.util.Map;
import rg.C6691i;
import zg.C6840g;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final C5502u f66405a;

    /* renamed from: b  reason: collision with root package name */
    public static final C5502u f66406b;

    /* renamed from: c  reason: collision with root package name */
    public static final C5502u f66407c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f66408d = new HashMap();

    static class a extends r {
        a(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.d(qVar, mVar);
        }
    }

    static class b extends r {
        b(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
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
            return y.e(gVar, qVar, mVar);
        }
    }

    static class c extends r {
        c(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
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
            return y.e(gVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(Sf.a.f65025c);
        f66405a = aVar;
        b bVar = new b(Sf.c.f65027c);
        f66406b = bVar;
        c cVar = new c(Sf.b.f65026c);
        f66407c = cVar;
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 5 || i10 == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 5 || i10 == 6) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = TicketDetailDestinationKt.LAUNCHED_FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i10 == 5 || i10 == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 6) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* access modifiers changed from: private */
    public static boolean d(C5495m mVar, C5495m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        Class<N> cls = N.class;
        N n10 = (N) C6691i.r(mVar, cls, false);
        N n11 = (N) C6691i.r(mVar2, cls, false);
        if (n11 == null || n10 == null || !n10.f().equals(n11.f())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean e(C6840g gVar, C5499q qVar, C5495m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(C6691i.M(qVar), mVar)) {
            return true;
        }
        return C5501t.f64507c.e(gVar, qVar, mVar, false);
    }

    private static void f(C5502u uVar) {
        f66408d.put(uVar.b(), uVar);
    }

    public static C5502u g(x0 x0Var) {
        if (x0Var == null) {
            a(4);
        }
        C5502u uVar = (C5502u) f66408d.get(x0Var);
        if (uVar != null) {
            return uVar;
        }
        C5502u j10 = C5501t.j(x0Var);
        if (j10 == null) {
            a(5);
        }
        return j10;
    }
}
