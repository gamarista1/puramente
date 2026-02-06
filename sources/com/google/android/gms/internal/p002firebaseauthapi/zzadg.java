package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadg  reason: invalid package */
public final class zzadg<ResultT, CallbackT> implements zzacx<ResultT> {
    private final zzacz<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzadg(zzacz<ResultT, CallbackT> zzacz, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacz;
        this.zzb = taskCompletionSource;
    }

    public final void zza(ResultT resultt, Status status) {
        A a10;
        C4536s.m(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzacz<ResultT, CallbackT> zzacz = this.zza;
            if (zzacz.zzs != null) {
                TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzacz.zzc);
                zzacz<ResultT, CallbackT> zzacz2 = this.zza;
                zzym zzym = zzacz2.zzs;
                if ("reauthenticateWithCredential".equals(zzacz2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    a10 = this.zza.zzd;
                } else {
                    a10 = null;
                }
                taskCompletionSource.setException(zzach.zza(instance, zzym, a10));
                return;
            }
            C4789h hVar = zzacz.zzp;
            if (hVar != null) {
                this.zzb.setException(zzach.zza(status, hVar, zzacz.zzq, zzacz.zzr));
            } else {
                this.zzb.setException(zzach.zza(status));
            }
        } else {
            this.zzb.setResult(resultt);
        }
    }
}
