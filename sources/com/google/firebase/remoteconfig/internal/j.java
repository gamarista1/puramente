package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;

public final /* synthetic */ class j implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f57853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f57854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f57855c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f57856d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f57857e;

    public /* synthetic */ j(m mVar, Task task, Task task2, Date date, Map map) {
        this.f57853a = mVar;
        this.f57854b = task;
        this.f57855c = task2;
        this.f57856d = date;
        this.f57857e = map;
    }

    public final Object then(Task task) {
        return this.f57853a.w(this.f57854b, this.f57855c, this.f57856d, this.f57857e, task);
    }
}
