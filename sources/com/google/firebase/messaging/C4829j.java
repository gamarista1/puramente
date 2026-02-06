package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.j  reason: case insensitive filesystem */
public final /* synthetic */ class C4829j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57548a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f57549b;

    public /* synthetic */ C4829j(Context context, Intent intent) {
        this.f57548a = context;
        this.f57549b = intent;
    }

    public final Object call() {
        return Integer.valueOf(b0.b().g(this.f57548a, this.f57549b));
    }
}
