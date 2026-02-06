package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

public final /* synthetic */ class k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f57858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Date f57859b;

    public /* synthetic */ k(m mVar, Date date) {
        this.f57858a = mVar;
        this.f57859b = date;
    }

    public final Object then(Task task) {
        return this.f57858a.x(this.f57859b, task);
    }
}
