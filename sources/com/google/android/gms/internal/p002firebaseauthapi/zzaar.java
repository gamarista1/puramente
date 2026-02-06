package com.google.android.gms.internal.p002firebaseauthapi;

import Db.I;
import Db.k0;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaar  reason: invalid package */
final class zzaar extends zzacz<C, k0> {
    private final String zzy;

    public zzaar(String str) {
        super(1);
        C4536s.g(str, "refresh token cannot be null");
        this.zzy = str;
    }

    public final String zza() {
        return "getAccessToken";
    }

    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((k0) this.zze).a(this.zzj, this.zzd);
        zzb(I.a(this.zzj.zzc()));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzb(this.zzy, this.zzb);
    }
}
