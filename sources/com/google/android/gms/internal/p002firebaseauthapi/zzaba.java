package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.j0;
import Db.k0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4789h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaba  reason: invalid package */
final class zzaba extends zzacz<Void, k0> {
    private final zzags zzy;

    public zzaba(C4789h hVar, String str) {
        super(2);
        C4536s.m(hVar, "credential cannot be null");
        this.zzy = j0.a(hVar, str).zza(false);
    }

    public final String zza() {
        return "reauthenticateWithCredential";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        if (this.zzd.a().equalsIgnoreCase(zza.a())) {
            ((k0) this.zze).a(this.zzj, zza);
            zzb(null);
            return;
        }
        zza(new Status(17024));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
