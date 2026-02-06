package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.I;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaap  reason: invalid package */
final class zzaap extends zzacz<Void, k0> {
    private final String zzaa;
    private final String zzab;
    private final I zzy;
    private final String zzz;

    public zzaap(I i10, String str, String str2, String str3) {
        super(2);
        this.zzy = (I) C4536s.l(i10);
        this.zzz = C4536s.f(str);
        this.zzaa = str2;
        this.zzab = str3;
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, this.zzz, this.zzaa, this.zzab, (zzacg) this.zzb);
    }
}
