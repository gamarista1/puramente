package Xf;

import java.util.EnumMap;
import kotlin.jvm.internal.C6496s;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f66250a;

    public E(EnumMap enumMap) {
        C6496s.h(enumMap, "defaultQualifiers");
        this.f66250a = enumMap;
    }

    public final w a(C5670c cVar) {
        return (w) this.f66250a.get(cVar);
    }

    public final EnumMap b() {
        return this.f66250a;
    }
}
