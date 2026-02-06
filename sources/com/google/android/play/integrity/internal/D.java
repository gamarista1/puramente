package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f56552a;

    D() {
        this.f56552a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f56552a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource c() {
        return this.f56552a;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public D(TaskCompletionSource taskCompletionSource) {
        this.f56552a = taskCompletionSource;
    }
}
