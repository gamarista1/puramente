package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57087b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f57088c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f57089d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f57090e;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f57086a = oVar;
        this.f57087b = runnable;
        this.f57088c = j10;
        this.f57089d = j11;
        this.f57090e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f57086a.x(this.f57087b, this.f57088c, this.f57089d, this.f57090e, bVar);
    }
}
