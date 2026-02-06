package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f57851a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f57852b;

    public /* synthetic */ i(m mVar, Map map) {
        this.f57851a = mVar;
        this.f57852b = map;
    }

    public final Object then(Task task) {
        return this.f57851a.y(this.f57852b, task);
    }
}
