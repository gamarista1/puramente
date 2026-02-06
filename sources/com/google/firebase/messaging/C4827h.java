package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.h  reason: case insensitive filesystem */
public final /* synthetic */ class C4827h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4828i f57535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f57536b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f57537c;

    public /* synthetic */ C4827h(C4828i iVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f57535a = iVar;
        this.f57536b = intent;
        this.f57537c = taskCompletionSource;
    }

    public final void run() {
        this.f57535a.e(this.f57536b, this.f57537c);
    }
}
