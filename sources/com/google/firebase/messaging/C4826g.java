package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.g  reason: case insensitive filesystem */
public final /* synthetic */ class C4826g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4828i f57529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f57530b;

    public /* synthetic */ C4826g(C4828i iVar, Intent intent) {
        this.f57529a = iVar;
        this.f57530b = intent;
    }

    public final void onComplete(Task task) {
        this.f57529a.d(this.f57530b, task);
    }
}
