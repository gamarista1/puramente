package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class zzd extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzg zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzd(zzg zzg, C6658d dVar) {
        super(dVar);
        this.zzb = zzg;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzb2 = this.zzb.zzb(0, (zzoe) null, this);
        return zzb2 == C6680b.f() ? zzb2 : v.a(zzb2);
    }
}
