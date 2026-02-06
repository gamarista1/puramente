package com.google.protobuf;

import com.amazon.device.simplesignin.a.a.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class W {

    /* renamed from: c  reason: collision with root package name */
    private static final W f58417c = new W();

    /* renamed from: a  reason: collision with root package name */
    private final a0 f58418a = new C();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f58419b = new ConcurrentHashMap();

    private W() {
    }

    public static W a() {
        return f58417c;
    }

    public Z b(Class cls, Z z10) {
        C4881t.b(cls, "messageType");
        C4881t.b(z10, a.f37994E);
        return (Z) this.f58419b.putIfAbsent(cls, z10);
    }

    public Z c(Class cls) {
        C4881t.b(cls, "messageType");
        Z z10 = (Z) this.f58419b.get(cls);
        if (z10 != null) {
            return z10;
        }
        Z a10 = this.f58418a.a(cls);
        Z b10 = b(cls, a10);
        if (b10 != null) {
            return b10;
        }
        return a10;
    }

    public Z d(Object obj) {
        return c(obj.getClass());
    }
}
