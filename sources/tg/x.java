package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

public final class x extends g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        C6496s.h(str, "value");
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 W10 = h10.m().W();
        C6496s.g(W10, "getStringType(...)");
        return W10;
    }

    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}
