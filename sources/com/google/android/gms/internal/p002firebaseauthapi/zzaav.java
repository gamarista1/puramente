package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.j0;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.C4791i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav  reason: invalid package */
final class zzaav extends zzacz<C4791i, k0> {
    private final zzags zzy;

    public zzaav(C4789h hVar) {
        super(2);
        C4536s.m(hVar, "credential cannot be null");
        this.zzy = j0.a(hVar, (String) null);
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzd.zze(), this.zzy, (zzacg) this.zzb);
    }
}
