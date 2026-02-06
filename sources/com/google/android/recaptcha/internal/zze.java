package com.google.android.recaptcha.internal;

import Ug.K;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zze extends l implements p {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zze(zza zza2, long j10, zzoe zzoe, C6658d dVar) {
        super(2, dVar);
        this.zzb = zza2;
        this.zzc = j10;
        this.zzd = zzoe;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zze(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 != 0) {
            obj2 = ((v) obj).j();
        } else {
            zza zza2 = this.zzb;
            long j10 = this.zzc;
            zzoe zzoe = this.zzd;
            this.zza = 1;
            obj2 = zza2.zzb(j10, zzoe, this);
            if (obj2 == f10) {
                return f10;
            }
        }
        return v.a(obj2);
    }
}
