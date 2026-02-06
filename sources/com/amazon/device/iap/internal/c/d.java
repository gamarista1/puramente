package com.amazon.device.iap.internal.c;

import com.amazon.device.iap.internal.c;
import com.amazon.device.iap.internal.e;
import java.util.HashMap;
import java.util.Map;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Class> f37961a;

    static {
        HashMap hashMap = new HashMap();
        f37961a = hashMap;
        hashMap.put(e.class, e.class);
    }

    public <T> Class<T> a(Class<T> cls) {
        return f37961a.get(cls);
    }
}
