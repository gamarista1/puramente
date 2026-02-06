package com.facebook.react.uimanager;

import C7.b;
import kotlin.Lazy;
import lf.C6531o;
import lf.C6534r;

public final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f41423a = new H0();

    /* renamed from: b  reason: collision with root package name */
    private static final Lazy f41424b = C6531o.a(C6534r.SYNCHRONIZED, new G0());

    private H0() {
    }

    public static final b b() {
        return f41423a.c();
    }

    private final b c() {
        return (b) f41424b.getValue();
    }

    /* access modifiers changed from: private */
    public static final b d() {
        return new b(1024);
    }
}
