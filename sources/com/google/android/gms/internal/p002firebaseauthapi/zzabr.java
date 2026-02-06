package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4265m;
import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabr  reason: invalid package */
final class zzabr extends zzacz<Void, k0> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabr(C4265m mVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        C4536s.l(mVar);
        C4536s.f(str);
        this.zzy = C4536s.f(mVar.q0());
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j10;
        this.zzac = z10;
        this.zzad = z11;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z12;
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }
}
