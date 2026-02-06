package F4;

import B4.b;
import B4.d;
import B4.k;
import B4.l;
import B4.m;
import C4.u;
import G4.c;
import I4.a;
import java.util.Collections;
import u4.C4071k;

/* renamed from: F4.b  reason: case insensitive filesystem */
public abstract class C2999b {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30691a = c.a.a("s", "a");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30692b = c.a.a("s", "e", "o", "r");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30693c = c.a.a("fc", "sc", "sw", "t", "o");

    public static k a(c cVar, C4071k kVar) {
        cVar.f();
        m mVar = null;
        l lVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30691a);
            if (T10 == 0) {
                lVar = b(cVar, kVar);
            } else if (T10 != 1) {
                cVar.U();
                cVar.V();
            } else {
                mVar = c(cVar, kVar);
            }
        }
        cVar.o();
        return new k(mVar, lVar);
    }

    private static l b(c cVar, C4071k kVar) {
        cVar.f();
        d dVar = null;
        d dVar2 = null;
        d dVar3 = null;
        u uVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30692b);
            if (T10 == 0) {
                dVar = C3001d.h(cVar, kVar);
            } else if (T10 == 1) {
                dVar2 = C3001d.h(cVar, kVar);
            } else if (T10 == 2) {
                dVar3 = C3001d.h(cVar, kVar);
            } else if (T10 != 3) {
                cVar.U();
                cVar.V();
            } else {
                int y10 = cVar.y();
                if (y10 != 1 && y10 != 2) {
                    kVar.a("Unsupported text range units: " + y10);
                    uVar = u.INDEX;
                } else if (y10 == 1) {
                    uVar = u.PERCENT;
                } else {
                    uVar = u.INDEX;
                }
            }
        }
        cVar.o();
        if (dVar == null && dVar2 != null) {
            dVar = new d(Collections.singletonList(new a(0)));
        }
        return new l(dVar, dVar2, dVar3, uVar);
    }

    private static m c(c cVar, C4071k kVar) {
        cVar.f();
        B4.a aVar = null;
        B4.a aVar2 = null;
        b bVar = null;
        b bVar2 = null;
        d dVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30693c);
            if (T10 == 0) {
                aVar = C3001d.c(cVar, kVar);
            } else if (T10 == 1) {
                aVar2 = C3001d.c(cVar, kVar);
            } else if (T10 == 2) {
                bVar = C3001d.e(cVar, kVar);
            } else if (T10 == 3) {
                bVar2 = C3001d.e(cVar, kVar);
            } else if (T10 != 4) {
                cVar.U();
                cVar.V();
            } else {
                dVar = C3001d.h(cVar, kVar);
            }
        }
        cVar.o();
        return new m(aVar, aVar2, bVar, bVar2, dVar);
    }
}
