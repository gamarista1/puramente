package com.google.android.recaptcha.internal;

import Ug.K;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzex extends l implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzex(zzez zzez, String str, C6658d dVar) {
        super(2, dVar);
        this.zza = zzez;
        this.zzb = str;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzex(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        zzez.zzm(this.zza, this.zzb);
        return C6514M.f71813a;
    }
}
