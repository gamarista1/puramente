package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class zzas extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbd zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzas(zzaw zzaw, C6658d dVar) {
        super(dVar);
        this.zzb = zzaw;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zze2 = this.zzb.zzk((RecaptchaAction) null, 0, this);
        return zze2 == C6680b.f() ? zze2 : v.a(zze2);
    }
}
