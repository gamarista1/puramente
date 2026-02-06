package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static final e f37897b = new e();

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f37898a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (!f.a(str)) {
            return this.f37898a.remove(str);
        }
        return false;
    }

    public void b(String str) {
        if (!f.a(str)) {
            this.f37898a.add(str);
        }
    }

    public static e a() {
        return f37897b;
    }
}
