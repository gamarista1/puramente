package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class h implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f57091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f57092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f57093c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f57094d;

    public /* synthetic */ h(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f57091a = oVar;
        this.f57092b = callable;
        this.f57093c = j10;
        this.f57094d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f57091a.r(this.f57092b, this.f57093c, this.f57094d, bVar);
    }
}
