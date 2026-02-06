package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.O;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay  reason: invalid package */
final class zzaay extends zzacz<C4791i, k0> {
    private final O zzy;

    public zzaay(O o10) {
        super(2);
        this.zzy = (O) C4536s.m(o10, "credential cannot be null");
    }

    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(new zzyc(this.zzd.zze(), this.zzy), (zzacg) this.zzb);
    }
}
