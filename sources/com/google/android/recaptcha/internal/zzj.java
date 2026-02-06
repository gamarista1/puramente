package com.google.android.recaptcha.internal;

import Ug.S;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzj {
    public static final Task zza(S s10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        s10.P0(new zzi(taskCompletionSource, s10));
        return taskCompletionSource.getTask();
    }
}
