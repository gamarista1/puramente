package com.google.firebase.functions;

import Cb.b;
import Db.C4253b;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C;
import hc.C5010a;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5121a;
import zb.C5300b;

class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f57199a = "FirebaseContextProvider";

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f57200b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f57201c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f57202d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f57203e;

    h(C5027b bVar, C5027b bVar2, C5026a aVar, Executor executor) {
        this.f57200b = bVar;
        this.f57201c = bVar2;
        this.f57203e = executor;
        aVar.a(new c(this));
    }

    private Task g(boolean z10) {
        Task task;
        b bVar = (b) this.f57202d.get();
        if (bVar == null) {
            return Tasks.forResult(null);
        }
        if (z10) {
            task = bVar.c();
        } else {
            task = bVar.a(false);
        }
        return task.onSuccessTask(this.f57203e, new g(this));
    }

    private Task h() {
        C4253b bVar = (C4253b) this.f57200b.get();
        if (bVar == null) {
            return Tasks.forResult(null);
        }
        return bVar.b(false).continueWith(this.f57203e, new f());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task i(C5300b bVar) {
        if (bVar.a() == null) {
            return Tasks.forResult(bVar.b());
        }
        Log.w("FirebaseContextProvider", "Error getting App Check token. Error: " + bVar.a());
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String j(Task task) {
        if (task.isSuccessful()) {
            return ((C) task.getResult()).f();
        }
        Exception exception = task.getException();
        if (exception instanceof C5121a) {
            return null;
        }
        throw exception;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task k(Task task, Task task2, Void voidR) {
        return Tasks.forResult(new w((String) task.getResult(), ((C5010a) this.f57201c.get()).a(), (String) task2.getResult()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(C5027b bVar) {
        b bVar2 = (b) bVar.get();
        this.f57202d.set(bVar2);
        bVar2.b(new d());
    }

    public Task a(boolean z10) {
        Task h10 = h();
        Task g10 = g(z10);
        return Tasks.whenAll((Task<?>[]) new Task[]{h10, g10}).onSuccessTask(this.f57203e, new e(this, h10, g10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(C5300b bVar) {
    }
}
