package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.O;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabg  reason: invalid package */
final class zzabg extends zzacz<Void, k0> {
    private final zzyi zzy;

    public zzabg(O o10, String str) {
        super(2);
        C4536s.m(o10, "credential cannot be null");
        o10.t0(false);
        this.zzy = new zzyi(o10, str);
    }

    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
