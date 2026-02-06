package com.google.android.recaptcha.internal;

import Ug.K;
import Ug.L;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzbx extends l implements p {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbx(zzcj zzcj, List list, zzca zzca, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzcj;
        this.zzc = list;
        this.zzd = zzca;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        zzbx zzbx = new zzbx(this.zzb, this.zzc, this.zzd, dVar);
        zzbx.zze = obj;
        return zzbx;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 == 0) {
            K k10 = (K) this.zze;
            zzfh zzb2 = zzfh.zzb();
            while (true) {
                zzcj zzcj = this.zzb;
                if (zzcj.zza() < 0) {
                    break;
                }
                if (zzcj.zza() >= this.zzc.size() || !L.g(k10)) {
                    break;
                }
                try {
                    this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                } catch (Exception e10) {
                    zzca zzca = this.zzd;
                    zzcj zzcj2 = this.zzb;
                    this.zza = 1;
                    if (zzca.zzh(e10, zzcj2, this) == f10) {
                        return f10;
                    }
                }
            }
            zzb2.zzf();
            b.d(zzb2.zza(TimeUnit.MICROSECONDS));
            return C6514M.f71813a;
        }
        return C6514M.f71813a;
    }
}
