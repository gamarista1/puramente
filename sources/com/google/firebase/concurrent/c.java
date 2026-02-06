package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57074b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f57075c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f57076d;

    public /* synthetic */ c(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f57073a = oVar;
        this.f57074b = runnable;
        this.f57075c = j10;
        this.f57076d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f57073a.o(this.f57074b, this.f57075c, this.f57076d, bVar);
    }
}
