package rg;

import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.E;
import Of.N;
import Of.l0;
import Wf.d;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import pf.C6632a;
import vg.C6755e;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;
import yg.C6815n;

/* renamed from: rg.a  reason: case insensitive filesystem */
public final class C6683a extends C6702t {

    /* renamed from: a  reason: collision with root package name */
    public static final C6683a f73010a = new C6683a();

    /* renamed from: rg.a$a  reason: collision with other inner class name */
    public static final class C1059a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(C6755e.o((C5487e) obj).b(), C6755e.o((C5487e) obj2).b());
        }
    }

    private C6683a() {
    }

    private static final void b(C5487e eVar, LinkedHashSet linkedHashSet, C6812k kVar, boolean z10) {
        for (C5495m mVar : C6815n.a.a(kVar, C6805d.f73925t, (C6798l) null, 2, (Object) null)) {
            if (mVar instanceof C5487e) {
                C5487e eVar2 = (C5487e) mVar;
                if (eVar2.k0()) {
                    f name = eVar2.getName();
                    C6496s.g(name, "getName(...)");
                    C5490h e10 = kVar.e(name, d.WHEN_GET_ALL_DESCRIPTORS);
                    if (e10 instanceof C5487e) {
                        eVar2 = (C5487e) e10;
                    } else if (e10 instanceof l0) {
                        eVar2 = ((l0) e10).u();
                    } else {
                        eVar2 = null;
                    }
                }
                if (eVar2 != null) {
                    if (C6691i.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z10) {
                        C6812k V10 = eVar2.V();
                        C6496s.g(V10, "getUnsubstitutedInnerClassesScope(...)");
                        b(eVar, linkedHashSet, V10, z10);
                    }
                }
            }
        }
    }

    public Collection a(C5487e eVar, boolean z10) {
        C5495m mVar;
        Object obj;
        C6496s.h(eVar, "sealedClass");
        if (eVar.r() != E.SEALED) {
            return C6565s.n();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z10) {
            mVar = eVar.b();
        } else {
            Iterator it = C6755e.u(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C5495m) obj) instanceof N) {
                    break;
                }
            }
            mVar = (C5495m) obj;
        }
        if (mVar instanceof N) {
            b(eVar, linkedHashSet, ((N) mVar).o(), z10);
        }
        C6812k V10 = eVar.V();
        C6496s.g(V10, "getUnsubstitutedInnerClassesScope(...)");
        b(eVar, linkedHashSet, V10, true);
        return C6565s.U0(linkedHashSet, new C1059a());
    }
}
