package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class i0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f57544b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f57545c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ M f57546d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ H f57547e;

    public /* synthetic */ i0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, M m10, H h10) {
        this.f57543a = context;
        this.f57544b = scheduledExecutorService;
        this.f57545c = firebaseMessaging;
        this.f57546d = m10;
        this.f57547e = h10;
    }

    public final Object call() {
        return j0.j(this.f57543a, this.f57544b, this.f57545c, this.f57546d, this.f57547e);
    }
}
