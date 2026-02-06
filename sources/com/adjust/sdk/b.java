package com.adjust.sdk;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f36972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f36973b;

    public /* synthetic */ b(ActivityHandler activityHandler, boolean z10) {
        this.f36972a = activityHandler;
        this.f36973b = z10;
    }

    public final void run() {
        this.f36972a.lambda$onActivityLifecycle$0(this.f36973b);
    }
}
