package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class zzer extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzer(zzez zzez, C6658d dVar) {
        super(dVar);
        this.zzb = zzez;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zza2 = this.zzb.zza((String) null, 0, this);
        return zza2 == C6680b.f() ? zza2 : v.a(zza2);
    }
}
