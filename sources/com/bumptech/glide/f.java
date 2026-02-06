package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f39050a;

    static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map f39051a = new HashMap();

        a() {
        }

        /* access modifiers changed from: package-private */
        public f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f39050a = Collections.unmodifiableMap(new HashMap(aVar.f39051a));
    }

    public boolean a(Class cls) {
        return this.f39050a.containsKey(cls);
    }
}
