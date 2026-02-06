package com.google.android.recaptcha.internal;

import Ug.K;
import Ug.L;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzby extends l implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzby(Exception exc, zzcj zzcj, zzca zzca, C6658d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzcj;
        this.zzc = zzca;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        zzby zzby = new zzby(this.zza, this.zzb, this.zzc, dVar);
        zzby.zzd = obj;
        return zzby;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        zzpg zzpg;
        C6680b.f();
        w.b(obj);
        K k10 = (K) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzpg = ((zzae) exc).zza();
            zzpg.zzd(this.zzb.zza());
        } else {
            zzcj zzcj = this.zzb;
            zzpg zzf = zzph.zzf();
            zzf.zzd(zzcj.zza());
            zzf.zzp(2);
            zzf.zze(2);
            zzpg = zzf;
        }
        zzph zzph = (zzph) zzpg.zzj();
        zzph.zzk();
        zzph.zzj();
        O.b(this.zza.getClass()).w();
        this.zza.getMessage();
        zzcj zzcj2 = this.zzb;
        zzz zzb2 = zzcj2.zzb();
        zzz zzz = zzcj2.zza;
        if (zzz == null) {
            zzz = null;
        }
        zzno zza2 = zzbp.zza(zzb2, zzz);
        String zzd2 = this.zzb.zzd();
        if (zzd2.length() == 0) {
            zzd2 = "recaptcha.m.Main.rge";
        }
        if (L.g(k10)) {
            zzca zzca = this.zzc;
            zzfy zzh = zzfy.zzh();
            byte[] zzd3 = zzph.zzd();
            String zzi = zzh.zzi(zzd3, 0, zzd3.length);
            zzfy zzh2 = zzfy.zzh();
            byte[] zzd4 = zza2.zzd();
            zzca.zzc.zze().zzb(zzd2, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd4, 0, zzd4.length)}, 2));
        }
        return C6514M.f71813a;
    }
}
