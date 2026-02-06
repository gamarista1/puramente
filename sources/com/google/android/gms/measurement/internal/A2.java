package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import java.lang.Thread;

final class A2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f54434a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4734z2 f54435b;

    public A2(C4734z2 z2Var, String str) {
        this.f54435b = z2Var;
        C4536s.l(str);
        this.f54434a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f54435b.zzj().B().b(this.f54434a, th2);
    }
}
