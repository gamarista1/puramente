package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.C4793j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaax  reason: invalid package */
final class zzaax extends zzacz<C4791i, k0> {
    private final C4793j zzy;

    public zzaax(C4793j jVar) {
        super(2);
        this.zzy = (C4793j) C4536s.m(jVar, "credential cannot be null");
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(new zzyf(this.zzy.r0(this.zzd), (String) null), (zzacg) this.zzb);
    }
}
