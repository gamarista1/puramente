package com.android.billingclient.api;

import android.app.Activity;
import java.util.concurrent.Callable;

public final /* synthetic */ class C implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f38098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f38099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C3197d f38100c;

    public /* synthetic */ C(L l10, Activity activity, C3197d dVar) {
        this.f38098a = l10;
        this.f38099b = activity;
        this.f38100c = dVar;
    }

    public final Object call() {
        return this.f38098a.r1(this.f38099b, this.f38100c);
    }
}
