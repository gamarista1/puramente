package com.google.android.recaptcha.internal;

import Ug.C5599w;
import Ug.K;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzew extends l implements p {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzew(zzez zzez, zzoe zzoe, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzez;
        this.zzc = zzoe;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzew(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 == 0) {
            zzez zzez = this.zzb;
            zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzez.zzl(this.zzb, this.zzc);
            b.c(this.zzb.zzk().hashCode());
            C5599w zzk = this.zzb.zzk();
            this.zza = 1;
            if (zzk.y(this) == f10) {
                return f10;
            }
        }
        return v.a(v.b(C6514M.f71813a));
    }
}
