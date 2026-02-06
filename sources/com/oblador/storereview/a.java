package com.oblador.storereview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kb.c;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f59173a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f59174b;

    public /* synthetic */ a(ReactApplicationContext reactApplicationContext, c cVar) {
        this.f59173a = reactApplicationContext;
        this.f59174b = cVar;
    }

    public final void onComplete(Task task) {
        b.b(this.f59173a, this.f59174b, task);
    }
}
