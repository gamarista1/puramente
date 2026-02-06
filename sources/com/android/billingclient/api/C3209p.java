package com.android.billingclient.api;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.p  reason: case insensitive filesystem */
public final /* synthetic */ class C3209p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3195b f38330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f38331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f38332c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f38333d;

    public /* synthetic */ C3209p(C3195b bVar, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.f38330a = bVar;
        this.f38331b = bundle;
        this.f38332c = activity;
        this.f38333d = resultReceiver;
    }

    public final Object call() {
        this.f38330a.V0(this.f38331b, this.f38332c, this.f38333d);
        return null;
    }
}
