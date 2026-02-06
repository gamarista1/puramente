package com.google.firebase.perf.session.gauges;

import Ac.k;
import Ac.o;
import android.app.ActivityManager;
import android.content.Context;
import uc.C5233a;

class i {

    /* renamed from: e  reason: collision with root package name */
    private static final C5233a f57754e = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f57755a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityManager f57756b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f57757c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f57758d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(k.BYTES.b(this.f57757c.totalMem));
    }

    public int b() {
        return o.c(k.BYTES.b(this.f57755a.maxMemory()));
    }

    public int c() {
        return o.c(k.MEGABYTES.b((long) this.f57756b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f57755a = runtime;
        this.f57758d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f57756b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f57757c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
