package Xf;

import Lf.i;
import Of.C5484b;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import vg.C6755e;

/* renamed from: Xf.m  reason: case insensitive filesystem */
public final class C5680m {

    /* renamed from: a  reason: collision with root package name */
    public static final C5680m f66386a = new C5680m();

    private C5680m() {
    }

    /* access modifiers changed from: private */
    public static final boolean c(C5484b bVar) {
        C6496s.h(bVar, "it");
        return f66386a.d(bVar);
    }

    private final boolean e(C5484b bVar) {
        if (C6565s.e0(C5677j.f66379a.c(), C6755e.k(bVar)) && bVar.k().isEmpty()) {
            return true;
        }
        if (!i.g0(bVar)) {
            return false;
        }
        Collection e10 = bVar.e();
        C6496s.g(e10, "getOverriddenDescriptors(...)");
        Iterable<C5484b> iterable = e10;
        if (!((Collection) iterable).isEmpty()) {
            for (C5484b bVar2 : iterable) {
                C5680m mVar = f66386a;
                C6496s.e(bVar2);
                if (mVar.d(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b(C5484b bVar) {
        f fVar;
        C6496s.h(bVar, "<this>");
        i.g0(bVar);
        C5484b i10 = C6755e.i(C6755e.w(bVar), false, C5679l.f66385a, 1, (Object) null);
        if (i10 == null || (fVar = (f) C5677j.f66379a.a().get(C6755e.o(i10))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean d(C5484b bVar) {
        C6496s.h(bVar, "callableMemberDescriptor");
        if (!C5677j.f66379a.d().contains(bVar.getName())) {
            return false;
        }
        return e(bVar);
    }
}
