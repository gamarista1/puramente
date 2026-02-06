package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class zzev extends d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;
    int zzd;
    zzez zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzev(zzez zzez, C6658d dVar) {
        super(dVar);
        this.zzc = zzez;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zzb2 = this.zzc.zzb(0, (zzoe) null, this);
        return zzb2 == C6680b.f() ? zzb2 : v.a(zzb2);
    }
}
