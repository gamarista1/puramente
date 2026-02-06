package com.google.android.recaptcha.internal;

import Sg.p;
import pf.C6632a;

public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String n02 = p.n0(String.valueOf(this.zzb / ((long) this.zza)), 10, 0, 2, (Object) null);
        String n03 = p.n0(String.valueOf(this.zzc), 10, 0, 2, (Object) null);
        String n04 = p.n0(String.valueOf(this.zzb), 10, 0, 2, (Object) null);
        String n05 = p.n0(String.valueOf(this.zza), 5, 0, 2, (Object) null);
        return "avgExecutionTime: " + n02 + " us| maxExecutionTime: " + n03 + " us| totalTime: " + n04 + " us| #Usages: " + n05;
    }

    /* renamed from: zza */
    public final int compareTo(zzu zzu) {
        return C6632a.d(Long.valueOf(this.zzb), Long.valueOf(zzu.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
