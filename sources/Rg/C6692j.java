package rg;

import Of.C5483a;
import Of.C5487e;

/* renamed from: rg.j  reason: case insensitive filesystem */
public interface C6692j {

    /* renamed from: rg.j$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: rg.j$b */
    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(C5483a aVar, C5483a aVar2, C5487e eVar);

    a b();
}
