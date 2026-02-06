package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabw  reason: invalid package */
final class zzabw extends zzacz<Void, k0> {
    private final String zzaa;
    private final String zzy;
    private final String zzz;

    public zzabw(String str, String str2, String str3) {
        super(2);
        this.zzy = C4536s.f(str);
        this.zzz = C4536s.f(str2);
        this.zzaa = str3;
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, this.zzz, this.zzaa, (zzacg) this.zzb);
    }
}
