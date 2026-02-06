package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4520d;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import za.C5298a;
import za.c;

public final class zzba extends C5298a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    static final List<C4520d> zza = Collections.emptyList();
    final LocationRequest zzb;
    final List<C4520d> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;

    zzba(LocationRequest locationRequest, List<C4520d> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = str2;
        this.zzi = z13;
        this.zzj = z14;
        this.zzk = str3;
        this.zzl = j10;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, (String) null, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzba = (zzba) obj;
            if (!C4535q.b(this.zzb, zzba.zzb) || !C4535q.b(this.zzc, zzba.zzc) || !C4535q.b(this.zzd, zzba.zzd) || this.zze != zzba.zze || this.zzf != zzba.zzf || this.zzg != zzba.zzg || !C4535q.b(this.zzh, zzba.zzh) || this.zzi != zzba.zzi || this.zzj != zzba.zzj || !C4535q.b(this.zzk, zzba.zzk)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zzb, i10, false);
        c.H(parcel, 5, this.zzc, false);
        c.D(parcel, 6, this.zzd, false);
        c.g(parcel, 7, this.zze);
        c.g(parcel, 8, this.zzf);
        c.g(parcel, 9, this.zzg);
        c.D(parcel, 10, this.zzh, false);
        c.g(parcel, 11, this.zzi);
        c.g(parcel, 12, this.zzj);
        c.D(parcel, 13, this.zzk, false);
        c.w(parcel, 14, this.zzl);
        c.b(parcel, a10);
    }

    public final zzba zzb(long j10) {
        if (this.zzb.p0() <= this.zzb.o0()) {
            this.zzl = 10000;
            return this;
        }
        long o02 = this.zzb.o0();
        long p02 = this.zzb.p0();
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(o02);
        sb2.append("maxWaitTime=");
        sb2.append(p02);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z10) {
        this.zzj = true;
        return this;
    }
}
