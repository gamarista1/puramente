package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.k  reason: case insensitive filesystem */
public final /* synthetic */ class C4830k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57559a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f57560b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f57561c;

    public /* synthetic */ C4830k(Context context, Intent intent, boolean z10) {
        this.f57559a = context;
        this.f57560b = intent;
        this.f57561c = z10;
    }

    public final Object then(Task task) {
        return C4833n.j(this.f57559a, this.f57560b, this.f57561c, task);
    }
}
