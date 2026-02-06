package mh;

import kotlin.jvm.internal.C6496s;
import lh.C6538b;

/* renamed from: mh.w  reason: case insensitive filesystem */
public abstract class C6605w {
    public static final C6596m a(C6608z zVar, C6538b bVar) {
        C6496s.h(zVar, "sb");
        C6496s.h(bVar, "json");
        if (bVar.f().l()) {
            return new C6604v(zVar, bVar);
        }
        return new C6596m(zVar);
    }
}
