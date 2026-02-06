package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.I;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
final class zzaas extends zzacz<C4791i, k0> {
    private final String zzaa;
    private final I zzy;
    private final String zzz;

    public zzaas(I i10, String str, String str2) {
        super(2);
        this.zzy = (I) C4536s.l(i10);
        this.zzz = C4536s.f(str);
        this.zzaa = str2;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        A a10 = this.zzd;
        if (a10 == null || a10.a().equalsIgnoreCase(zza.a())) {
            ((k0) this.zze).a(this.zzj, zza);
            zzb(new y0(zza));
            return;
        }
        zza(new Status(17024));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzz, this.zzy, this.zzaa, (zzacg) this.zzb);
    }
}
