package com.amazon.device.drm.a.b;

import com.amazon.device.drm.a.b;
import com.amazon.device.drm.a.c;
import java.util.HashMap;
import java.util.Map;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Class> f37786a;

    static {
        HashMap hashMap = new HashMap();
        f37786a = hashMap;
        hashMap.put(c.class, c.class);
    }

    public <T> Class<T> a(Class<T> cls) {
        return f37786a.get(cls);
    }
}
