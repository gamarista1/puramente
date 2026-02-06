package Jf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

class d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Class f63796a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f63797b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f63798c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f63799d;

    /* renamed from: e  reason: collision with root package name */
    private final List f63800e;

    public d(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f63796a = cls;
        this.f63797b = map;
        this.f63798c = lazy;
        this.f63799d = lazy2;
        this.f63800e = list;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f63796a, this.f63797b, this.f63798c, this.f63799d, this.f63800e, obj, method, objArr);
    }
}
