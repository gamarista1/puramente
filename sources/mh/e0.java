package mh;

import ih.b;
import ih.d;
import ih.e;
import ih.f;
import ih.j;
import ih.k;
import kotlin.jvm.internal.C6496s;
import lh.C6538b;
import nh.C6624e;

public abstract class e0 {
    public static final f a(f fVar, C6624e eVar) {
        f a10;
        C6496s.h(fVar, "<this>");
        C6496s.h(eVar, "module");
        if (C6496s.c(fVar.h(), j.a.f68504a)) {
            f b10 = b.b(eVar, fVar);
            if (b10 == null || (a10 = a(b10, eVar)) == null) {
                return fVar;
            }
            return a10;
        } else if (fVar.isInline()) {
            return a(fVar.g(0), eVar);
        } else {
            return fVar;
        }
    }

    public static final d0 b(C6538b bVar, f fVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(fVar, "desc");
        j h10 = fVar.h();
        if (h10 instanceof d) {
            return d0.POLY_OBJ;
        }
        if (C6496s.c(h10, k.b.f68507a)) {
            return d0.LIST;
        }
        if (!C6496s.c(h10, k.c.f68508a)) {
            return d0.OBJ;
        }
        f a10 = a(fVar.g(0), bVar.a());
        j h11 = a10.h();
        if ((h11 instanceof e) || C6496s.c(h11, j.b.f68505a)) {
            return d0.MAP;
        }
        if (bVar.f().b()) {
            return d0.LIST;
        }
        throw F.d(a10);
    }
}
