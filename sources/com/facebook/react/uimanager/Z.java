package com.facebook.react.uimanager;

import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.facebook.yoga.k;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f41561a = new Z();

    /* renamed from: b  reason: collision with root package name */
    private static final Lazy f41562b = C6531o.a(C6534r.NONE, new Y());

    private Z() {
    }

    public static final c b() {
        return f41561a.c();
    }

    private final c c() {
        Object value = f41562b.getValue();
        C6496s.g(value, "getValue(...)");
        return (c) value;
    }

    /* access modifiers changed from: private */
    public static final c d() {
        c a10 = d.a();
        a10.b(0.0f);
        a10.a(k.ALL);
        return a10;
    }
}
