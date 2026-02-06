package com.google.android.recaptcha;

import android.app.Application;
import kotlin.coroutines.jvm.internal.d;
import lf.v;
import qf.C6658d;
import rf.C6680b;

final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, C6658d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r72 = this.zzb.m20getClientBWLJW6A((Application) null, (String) null, 0, this);
        return r72 == C6680b.f() ? r72 : v.a(r72);
    }
}
