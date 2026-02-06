package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import Db.r;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.W;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq  reason: invalid package */
final class zzaaq extends zzacz<W, k0> {
    private final String zzy;
    private final String zzz;

    public zzaaq(String str, String str2) {
        super(3);
        C4536s.g(str, "email cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzb() {
        List list;
        if (this.zzl.zza() == null) {
            list = zzaq.zzh();
        } else {
            list = (List) C4536s.l(this.zzl.zza());
        }
        zzb(new r(list));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zze(this.zzy, this.zzz, this.zzb);
    }
}
