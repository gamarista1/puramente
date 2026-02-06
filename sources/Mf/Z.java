package mf;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import nf.C6618j;

abstract class Z {
    public static Set a(Set set) {
        C6496s.h(set, "builder");
        return ((C6618j) set).b();
    }

    public static Set b() {
        return new C6618j();
    }

    public static Set c(int i10) {
        return new C6618j(i10);
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        C6496s.g(singleton, "singleton(...)");
        return singleton;
    }
}
