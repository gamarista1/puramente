package Of;

import Ff.f;
import Rg.k;
import Wf.d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.b;
import rg.C6701s;
import yg.C6812k;

/* renamed from: Of.y  reason: case insensitive filesystem */
public abstract class C5506y {

    /* renamed from: Of.y$a */
    /* synthetic */ class a extends E {

        /* renamed from: b  reason: collision with root package name */
        public static final a f64538b = new a();

        /* synthetic */ a() {
        }

        public Object get(Object obj) {
            return ((b) obj).e();
        }

        public String getName() {
            return "outerClassId";
        }

        public f getOwner() {
            return O.b(b.class);
        }

        public String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public static final C5487e b(H h10, b bVar) {
        C6496s.h(h10, "<this>");
        C6496s.h(bVar, "classId");
        C5490h c10 = c(h10, bVar);
        if (c10 instanceof C5487e) {
            return (C5487e) c10;
        }
        return null;
    }

    public static final C5490h c(H h10, b bVar) {
        C5490h hVar;
        C6496s.h(h10, "<this>");
        C6496s.h(bVar, "classId");
        H a10 = C6701s.a(h10);
        if (a10 == null) {
            V l02 = h10.l0(bVar.f());
            List f10 = bVar.g().f();
            C6496s.g(f10, "pathSegments(...)");
            C6812k o10 = l02.o();
            Object o02 = C6565s.o0(f10);
            C6496s.g(o02, "first(...)");
            hVar = o10.e((ng.f) o02, d.FROM_DESERIALIZATION);
            if (hVar == null) {
                return null;
            }
            for (ng.f fVar : f10.subList(1, f10.size())) {
                if (!(hVar instanceof C5487e)) {
                    return null;
                }
                C6812k V10 = ((C5487e) hVar).V();
                C6496s.e(fVar);
                C5490h e10 = V10.e(fVar, d.FROM_DESERIALIZATION);
                if (e10 instanceof C5487e) {
                    hVar = (C5487e) e10;
                    continue;
                } else {
                    hVar = null;
                    continue;
                }
                if (hVar == null) {
                    return null;
                }
            }
        } else {
            V l03 = a10.l0(bVar.f());
            List f11 = bVar.g().f();
            C6496s.g(f11, "pathSegments(...)");
            C6812k o11 = l03.o();
            Object o03 = C6565s.o0(f11);
            C6496s.g(o03, "first(...)");
            C5490h e11 = o11.e((ng.f) o03, d.FROM_DESERIALIZATION);
            if (e11 != null) {
                Iterator it = f11.subList(1, f11.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ng.f fVar2 = (ng.f) it.next();
                    if (e11 instanceof C5487e) {
                        C6812k V11 = ((C5487e) e11).V();
                        C6496s.e(fVar2);
                        C5490h e12 = V11.e(fVar2, d.FROM_DESERIALIZATION);
                        if (e12 instanceof C5487e) {
                            e11 = (C5487e) e12;
                            continue;
                        } else {
                            e11 = null;
                            continue;
                        }
                        if (e11 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            e11 = null;
            if (e11 != null) {
                return e11;
            }
            V l04 = h10.l0(bVar.f());
            List f12 = bVar.g().f();
            C6496s.g(f12, "pathSegments(...)");
            C6812k o12 = l04.o();
            Object o04 = C6565s.o0(f12);
            C6496s.g(o04, "first(...)");
            C5490h e13 = o12.e((ng.f) o04, d.FROM_DESERIALIZATION);
            if (e13 == null) {
                return null;
            }
            for (ng.f fVar3 : f12.subList(1, f12.size())) {
                if (!(hVar instanceof C5487e)) {
                    return null;
                }
                C6812k V12 = ((C5487e) hVar).V();
                C6496s.e(fVar3);
                C5490h e14 = V12.e(fVar3, d.FROM_DESERIALIZATION);
                if (e14 instanceof C5487e) {
                    e13 = (C5487e) e14;
                    continue;
                } else {
                    e13 = null;
                    continue;
                }
                if (e13 == null) {
                    return null;
                }
            }
        }
        return hVar;
    }

    public static final C5487e d(H h10, b bVar, M m10) {
        C6496s.h(h10, "<this>");
        C6496s.h(bVar, "classId");
        C6496s.h(m10, "notFoundClasses");
        C5487e b10 = b(h10, bVar);
        if (b10 != null) {
            return b10;
        }
        return m10.d(bVar, k.G(k.x(k.h(bVar, a.f64538b), C5505x.f64535a)));
    }

    /* access modifiers changed from: private */
    public static final int e(b bVar) {
        C6496s.h(bVar, "it");
        return 0;
    }

    public static final l0 f(H h10, b bVar) {
        C6496s.h(h10, "<this>");
        C6496s.h(bVar, "classId");
        C5490h c10 = c(h10, bVar);
        if (c10 instanceof l0) {
            return (l0) c10;
        }
        return null;
    }
}
