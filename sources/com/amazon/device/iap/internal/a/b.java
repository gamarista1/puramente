package com.amazon.device.iap.internal.a;

import com.amazon.device.iap.internal.c;
import com.amazon.device.iap.internal.e;
import java.util.HashMap;
import java.util.Map;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Class> f37828a;

    static {
        HashMap hashMap = new HashMap();
        f37828a = hashMap;
        hashMap.put(e.class, d.class);
    }

    public <T> Class<T> a(Class<T> cls) {
        return f37828a.get(cls);
    }
}
