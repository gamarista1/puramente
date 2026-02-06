package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final S f54226a = new O();

    public interface a {
        Object a(k kVar);
    }

    public static Task a(h hVar, a aVar) {
        S s10 = f54226a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.addStatusListener(new P(hVar, taskCompletionSource, aVar, s10));
        return taskCompletionSource.getTask();
    }

    public static Task b(h hVar) {
        return a(hVar, new Q());
    }
}
