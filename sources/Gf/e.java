package Gf;

import Ff.d;
import Ff.f;
import Ff.g;
import Ff.n;
import Ff.p;
import If.A;
import If.C5442i0;
import If.X;
import Of.C5494l;
import Of.C5507z;
import Pg.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.O;
import mf.C6565s;

public abstract class e {

    /* synthetic */ class a extends E {

        /* renamed from: b  reason: collision with root package name */
        public static final a f63174b = new a();

        /* synthetic */ a() {
        }

        public Object get(Object obj) {
            return e.g((d) obj);
        }

        public String getName() {
            return "superclasses";
        }

        public f getOwner() {
            return O.d(e.class, "kotlin-reflection");
        }

        public String getSignature() {
            return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: Ff.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(Ff.d r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.util.Collection r0 = r7.j()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = r1
        L_0x0012:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r0.next()
            r5 = r4
            Ff.g r5 = (Ff.g) r5
            java.util.List r5 = r5.getParameters()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0033
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.util.Iterator r5 = r5.iterator()
        L_0x0037:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r5.next()
            Ff.k r6 = (Ff.k) r6
            boolean r6 = r6.o()
            if (r6 != 0) goto L_0x0037
            goto L_0x0012
        L_0x004a:
            if (r2 == 0) goto L_0x004d
            goto L_0x0054
        L_0x004d:
            r2 = 1
            r3 = r4
            goto L_0x0012
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = r3
        L_0x0054:
            Ff.g r1 = (Ff.g) r1
            if (r1 == 0) goto L_0x0061
            java.util.Map r7 = mf.O.i()
            java.lang.Object r7 = r1.callBy(r7)
            return r7
        L_0x0061:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class should have a single no-arg constructor: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.c(Ff.d):java.lang.Object");
    }

    public static final Collection d(d dVar) {
        C6496s.h(dVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : ((X.a) ((X) dVar).a0().getValue()).L()) {
            A a10 = (A) next;
            if (i(a10) && (a10 instanceof n)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection e(d dVar) {
        C6496s.h(dVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : ((X.a) ((X) dVar).a0().getValue()).H()) {
            A a10 = (A) next;
            if (i(a10) && (a10 instanceof n)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final g f(d dVar) {
        Object obj;
        C6496s.h(dVar, "<this>");
        Iterator it = ((X) dVar).j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            g gVar = (g) obj;
            C6496s.f(gVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            C5507z l02 = ((C5442i0) gVar).V();
            C6496s.f(l02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((C5494l) l02).d0()) {
                break;
            }
        }
        return (g) obj;
    }

    public static final List g(d dVar) {
        d dVar2;
        C6496s.h(dVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (p b10 : dVar.l()) {
            Ff.e b11 = b10.b();
            if (b11 instanceof d) {
                dVar2 = (d) b11;
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    private static final boolean h(A a10) {
        if (a10.V().P() != null) {
            return true;
        }
        return false;
    }

    private static final boolean i(A a10) {
        return !h(a10);
    }

    public static final boolean j(d dVar, d dVar2) {
        C6496s.h(dVar, "<this>");
        C6496s.h(dVar2, "base");
        if (C6496s.c(dVar, dVar2) || b.e(C6565s.e(dVar), new c(a.f63174b), new d(dVar2)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Iterable k(n nVar, d dVar) {
        return (Iterable) nVar.invoke(dVar);
    }

    /* access modifiers changed from: private */
    public static final Boolean l(d dVar, d dVar2) {
        return Boolean.valueOf(C6496s.c(dVar2, dVar));
    }

    public static final boolean m(d dVar, d dVar2) {
        C6496s.h(dVar, "<this>");
        C6496s.h(dVar2, "derived");
        return j(dVar2, dVar);
    }
}
