package com.google.android.recaptcha.internal;

import Ug.K;
import android.content.ContentValues;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzbl extends l implements p {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbl(zzbm zzbm, zzpd zzpd, C6658d dVar) {
        super(2, dVar);
        this.zza = zzbm;
        this.zzb = zzpd;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzbl(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        zzbm zzbm = this.zza;
        zzpd zzpd = this.zzb;
        synchronized (zzbh.class) {
            try {
                if (zzbm.zze != null) {
                    byte[] zzd = zzpd.zzd();
                    zzba zzba = new zzba(zzfy.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzaz zzb2 = zzbm.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzba.zzc());
                    contentValues.put("ts", Long.valueOf(zzba.zzb()));
                    zzb2.getWritableDatabase().insert("ce", (String) null, contentValues);
                    int zzb3 = zzbm.zze.zzb() - 500;
                    if (zzb3 > 0) {
                        zzbm.zze.zza(C6565s.V0(zzbm.zze.zzd(), zzb3));
                    }
                    if (zzbm.zze.zzb() >= 20) {
                        zzbm.zzg();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return C6514M.f71813a;
    }
}
