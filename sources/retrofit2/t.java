package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Class f72916a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f72917b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f72918c;

    /* renamed from: d  reason: collision with root package name */
    private final List f72919d;

    t(Class cls, Object obj, Method method, List list) {
        this.f72916a = cls;
        this.f72917b = obj;
        this.f72918c = method;
        this.f72919d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f72918c;
    }

    public Class b() {
        return this.f72916a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f72916a.getName(), this.f72918c.getName(), this.f72919d});
    }
}
