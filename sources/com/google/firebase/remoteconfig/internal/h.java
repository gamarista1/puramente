package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f57848a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f57849b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f57850c;

    public /* synthetic */ h(m mVar, long j10, Map map) {
        this.f57848a = mVar;
        this.f57849b = j10;
        this.f57850c = map;
    }

    public final Object then(Task task) {
        return this.f57848a.u(this.f57849b, this.f57850c, task);
    }
}
