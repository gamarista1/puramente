package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f57807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f57808b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f57809c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f57810d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f57811e;

    public /* synthetic */ a(b bVar, Task task, Task task2, long j10, int i10) {
        this.f57807a = bVar;
        this.f57808b = task;
        this.f57809c = task2;
        this.f57810d = j10;
        this.f57811e = i10;
    }

    public final Object then(Task task) {
        return this.f57807a.h(this.f57808b, this.f57809c, this.f57810d, this.f57811e, task);
    }
}
