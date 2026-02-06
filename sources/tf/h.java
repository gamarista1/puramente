package Tf;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import ng.b;

public abstract class h {
    /* access modifiers changed from: private */
    public static final String b(b bVar) {
        String b10 = bVar.g().b();
        C6496s.g(b10, "asString(...)");
        String C10 = p.C(b10, '.', '$', false, 4, (Object) null);
        if (bVar.f().d()) {
            return C10;
        }
        return bVar.f() + '.' + C10;
    }
}
