package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import rh.C6703A;
import rh.C6706c;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static C6703A f41092a;

    public static C6703A a() {
        return c().c();
    }

    public static C6703A b(Context context) {
        return d(context).c();
    }

    public static C6703A.a c() {
        C6703A.a aVar = new C6703A.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.f(0, timeUnit).S(0, timeUnit).W(0, timeUnit).h(new n());
    }

    public static C6703A.a d(Context context) {
        return e(context, 10485760);
    }

    public static C6703A.a e(Context context, int i10) {
        C6703A.a c10 = c();
        if (i10 == 0) {
            return c10;
        }
        return c10.d(new C6706c(new File(context.getCacheDir(), "http-cache"), (long) i10));
    }

    public static C6703A f() {
        if (f41092a == null) {
            f41092a = a();
        }
        return f41092a;
    }
}
