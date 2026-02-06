package com.google.android.recaptcha.internal;

import Ug.C5599w;
import Ug.C5600w0;
import Ug.C5603y;
import Ug.K;
import Ug.M;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

final class zzet extends l implements p {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzet(String str, zzez zzez, C6658d dVar) {
        super(2, dVar);
        this.zzb = str;
        this.zzc = zzez;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzet(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 == 0) {
            zzez zzez = this.zzc;
            String str = this.zzb;
            C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
            zzez.zzl.put(str, b10);
            String str2 = this.zzb;
            zzou zzf = zzov.zzf();
            zzf.zzd(str2);
            byte[] zzd = ((zzov) zzf.zzj()).zzd();
            C5600w0 unused = C5576k.d(this.zzc.zzq.zzb(), (g) null, (M) null, new zzes(this.zzc, zzfy.zzh().zzi(zzd, 0, zzd.length), (C6658d) null), 3, (Object) null);
            this.zza = 1;
            obj = b10.y(this);
            if (obj == f10) {
                return f10;
            }
        }
        return obj;
    }
}
