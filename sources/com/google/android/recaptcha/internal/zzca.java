package com.google.android.recaptcha.internal;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;

public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv((DefaultConstructorMarker) null);
    private final K zzb;
    private final zzcl zzc;
    /* access modifiers changed from: private */
    public final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(K k10, zzcl zzcl, zzee zzee, Map map) {
        this.zzb = k10;
        this.zzc = zzcl;
        this.zzd = zzee;
        this.zze = map;
        this.zzf = zzcl.zzb().zzc();
    }

    /* access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcj, C6658d dVar) {
        Object e10 = L.e(new zzbx(zzcj, list, this, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcj, C6658d dVar) {
        Object e10 = L.e(new zzby(exc, zzcj, this, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void zzi(zzpr zzpr, zzcj zzcj) {
        zzfh zzb2 = zzfh.zzb();
        int zza2 = zzcj.zza();
        zzdd zzdd = (zzdd) this.zze.get(Integer.valueOf(zzpr.zzf()));
        if (zzdd != null) {
            int zzg = zzpr.zzg();
            zzpq[] zzpqArr = (zzpq[]) zzpr.zzj().toArray(new zzpq[0]);
            zzdd.zza(zzg, zzcj, (zzpq[]) Arrays.copyOf(zzpqArr, zzpqArr.length));
            if (zza2 == zzcj.zza()) {
                zzcj.zzg(zzcj.zza() + 1);
            }
            zzb2.zzf();
            long zza3 = zzb2.zza(TimeUnit.MICROSECONDS);
            zzv zzv = zzv.zza;
            int zzk = zzpr.zzk();
            if (zzk != 1) {
                zzv.zza(zzk - 2, zza3);
                zzpr.zzk();
                zzpr.zzg();
                C6565s.x0(zzpr.zzj(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new zzbw(this), 31, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzae(5, 2, (Throwable) null);
    }

    public final void zza(String str) {
        C5600w0 unused = C5576k.d(this.zzb, (g) null, (M) null, new zzbz(new zzcj(this.zzc), this, str, (C6658d) null), 3, (Object) null);
    }
}
