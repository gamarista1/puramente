package gg;

import gg.C5941A;
import ig.n;
import kg.C6436c;
import kg.e;
import kg.g;
import kotlin.jvm.internal.C6496s;
import lg.C6536a;
import mg.C6576d;
import mg.C6581i;
import pg.C6647i;

/* renamed from: gg.f  reason: case insensitive filesystem */
public abstract class C5956f {
    public static final C5941A a(n nVar, C6436c cVar, g gVar, boolean z10, boolean z11, boolean z12) {
        C6496s.h(nVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6647i.f fVar = C6536a.f71858d;
        C6496s.g(fVar, "propertySignature");
        C6536a.d dVar = (C6536a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            C6576d.a c10 = C6581i.f72110a.c(nVar, cVar, gVar, z12);
            if (c10 == null) {
                return null;
            }
            return C5941A.f67712b.b(c10);
        } else if (!z11 || !dVar.I()) {
            return null;
        } else {
            C5941A.a aVar = C5941A.f67712b;
            C6536a.c D10 = dVar.D();
            C6496s.g(D10, "getSyntheticMethod(...)");
            return aVar.c(cVar, D10);
        }
    }

    public static /* synthetic */ C5941A b(n nVar, C6436c cVar, g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13;
        boolean z14;
        if ((i10 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z10;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(nVar, cVar, gVar, z13, z14, z12);
    }
}
