package com.google.android.recaptcha.internal;

import Ug.K;
import java.util.Timer;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzbk extends l implements p {
    final /* synthetic */ zzbm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbk(zzbm zzbm, C6658d dVar) {
        super(2, dVar);
        this.zza = zzbm;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzbk(this.zza, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbk) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        zzbm zzbm = this.zza;
        synchronized (zzbh.class) {
            try {
                zzaz zzb = zzbm.zze;
                if (zzb != null && zzb.zzb() == 0) {
                    Timer zzc = zzbm.zzb;
                    if (zzc != null) {
                        zzc.cancel();
                    }
                    zzbm.zzb = null;
                }
                zzbm.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return C6514M.f71813a;
    }
}
