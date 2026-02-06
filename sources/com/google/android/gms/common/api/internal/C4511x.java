package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4516b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x  reason: case insensitive filesystem */
public abstract class C4511x {
    public static void a(Status status, TaskCompletionSource taskCompletionSource) {
        b(status, (Object) null, taskCompletionSource);
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.s0()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C4516b.a(status));
        }
    }

    public static boolean c(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.s0()) {
            return taskCompletionSource.trySetResult(obj);
        }
        return taskCompletionSource.trySetException(C4516b.a(status));
    }
}
