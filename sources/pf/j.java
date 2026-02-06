package Pf;

import kotlin.jvm.internal.C6496s;

public abstract class j {
    public static final h a(h hVar, h hVar2) {
        C6496s.h(hVar, "first");
        C6496s.h(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (hVar2.isEmpty()) {
            return hVar;
        }
        return new o(hVar, hVar2);
    }
}
