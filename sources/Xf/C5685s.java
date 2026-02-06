package Xf;

import Of.C5483a;
import Of.C5487e;
import Of.Z;
import bg.C5763d;
import kotlin.jvm.internal.C6496s;
import rg.C6692j;

/* renamed from: Xf.s  reason: case insensitive filesystem */
public final class C5685s implements C6692j {
    public C6692j.b a(C5483a aVar, C5483a aVar2, C5487e eVar) {
        C6496s.h(aVar, "superDescriptor");
        C6496s.h(aVar2, "subDescriptor");
        if (!(aVar2 instanceof Z) || !(aVar instanceof Z)) {
            return C6692j.b.UNKNOWN;
        }
        Z z10 = (Z) aVar2;
        Z z11 = (Z) aVar;
        if (!C6496s.c(z10.getName(), z11.getName())) {
            return C6692j.b.UNKNOWN;
        }
        if (C5763d.a(z10) && C5763d.a(z11)) {
            return C6692j.b.OVERRIDABLE;
        }
        if (C5763d.a(z10) || C5763d.a(z11)) {
            return C6692j.b.INCOMPATIBLE;
        }
        return C6692j.b.UNKNOWN;
    }

    public C6692j.a b() {
        return C6692j.a.BOTH;
    }
}
