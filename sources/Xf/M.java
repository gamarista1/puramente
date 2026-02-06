package Xf;

import Eg.f;
import Eg.h;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import ng.c;
import ng.e;

public final class M implements K {

    /* renamed from: b  reason: collision with root package name */
    private final Map f66314b;

    /* renamed from: c  reason: collision with root package name */
    private final f f66315c;

    /* renamed from: d  reason: collision with root package name */
    private final h f66316d;

    public M(Map map) {
        C6496s.h(map, "states");
        this.f66314b = map;
        f fVar = new f("Java nullability annotation states");
        this.f66315c = fVar;
        h c10 = fVar.c(new L(this));
        C6496s.g(c10, "createMemoizedFunctionWithNullableValues(...)");
        this.f66316d = c10;
    }

    /* access modifiers changed from: private */
    public static final Object c(M m10, c cVar) {
        C6496s.e(cVar);
        return e.a(cVar, m10.f66314b);
    }

    public Object a(c cVar) {
        C6496s.h(cVar, "fqName");
        return this.f66316d.invoke(cVar);
    }
}
