package com.google.android.recaptcha.internal;

import Ug.K;
import android.app.Application;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzak extends l implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzak(Application application, String str, long j10, C6658d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzak(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 == 0) {
            zzam zzam = zzam.zza;
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj = zzam.zzc(application, str, j10, (zzbq) null, this);
            if (obj == f10) {
                return f10;
            }
        }
        return obj;
    }
}
