package com.google.android.recaptcha.internal;

import Ug.S;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

final class zzi extends C6498u implements C6798l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ S zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(TaskCompletionSource taskCompletionSource, S s10) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = s10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Throwable F10 = this.zzb.F();
            if (F10 == null) {
                this.zza.setResult(this.zzb.v());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                if (F10 instanceof Exception) {
                    exc = (Exception) F10;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    exc = new RuntimeExecutionException(F10);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C6514M.f71813a;
    }
}
