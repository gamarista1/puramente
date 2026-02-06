package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f57082b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f57083c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f57084d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f57085e;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f57081a = oVar;
        this.f57082b = runnable;
        this.f57083c = j10;
        this.f57084d = j11;
        this.f57085e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f57081a.v(this.f57082b, this.f57083c, this.f57084d, this.f57085e, bVar);
    }
}
