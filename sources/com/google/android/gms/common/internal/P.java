package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class P implements h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f54124a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f54125b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r.a f54126c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ S f54127d;

    P(h hVar, TaskCompletionSource taskCompletionSource, r.a aVar, S s10) {
        this.f54124a = hVar;
        this.f54125b = taskCompletionSource;
        this.f54126c = aVar;
        this.f54127d = s10;
    }

    public final void a(Status status) {
        if (status.s0()) {
            this.f54125b.setResult(this.f54126c.a(this.f54124a.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f54125b.setException(C4516b.a(status));
    }
}
