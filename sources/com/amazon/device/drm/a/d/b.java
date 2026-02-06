package com.amazon.device.drm.a.d;

import com.amazon.device.drm.a.c;
import java.util.HashMap;
import java.util.Map;

public final class b implements com.amazon.device.drm.a.b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Class> f37808a;

    static {
        HashMap hashMap = new HashMap();
        f37808a = hashMap;
        hashMap.put(c.class, c.class);
    }

    public <T> Class<T> a(Class<T> cls) {
        return f37808a.get(cls);
    }
}
