package com.google.firebase.storage;

import Kc.c;
import Lc.a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.c  reason: case insensitive filesystem */
class C4847c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private o f58044a;

    /* renamed from: b  reason: collision with root package name */
    private TaskCompletionSource f58045b;

    /* renamed from: c  reason: collision with root package name */
    private c f58046c;

    public C4847c(o oVar, TaskCompletionSource taskCompletionSource) {
        C4536s.l(oVar);
        C4536s.l(taskCompletionSource);
        this.f58044a = oVar;
        this.f58045b = taskCompletionSource;
        C4849e t10 = oVar.t();
        this.f58046c = new c(t10.a().m(), t10.c(), t10.b(), t10.k());
    }

    public void run() {
        a aVar = new a(this.f58044a.u(), this.f58044a.f());
        this.f58046c.d(aVar);
        aVar.a(this.f58045b, (Object) null);
    }
}
