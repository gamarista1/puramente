package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class zzap extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzap(zzaw zzaw, C6658d dVar) {
        super(dVar);
        this.zzb = zzaw;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r42 = this.zzb.m23execute0E7RQCE((RecaptchaAction) null, 0, this);
        return r42 == C6680b.f() ? r42 : v.a(r42);
    }
}
