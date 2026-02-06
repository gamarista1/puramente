package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.C4549f;
import java.util.Locale;
import za.C5298a;
import za.c;

@VisibleForTesting
public final class zzbe extends C5298a implements C4549f {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f10 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("invalid radius: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("invalid latitude: ");
            sb3.append(d10);
            throw new IllegalArgumentException(sb3.toString());
        } else if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(43);
            sb4.append("invalid longitude: ");
            sb4.append(d11);
            throw new IllegalArgumentException(sb4.toString());
        } else {
            int i13 = i10 & 7;
            if (i13 != 0) {
                this.zzc = s10;
                this.zza = str;
                this.zzd = d10;
                this.zze = d11;
                this.zzf = f10;
                this.zzb = j10;
                this.zzg = i13;
                this.zzh = i11;
                this.zzi = i12;
                return;
            }
            StringBuilder sb5 = new StringBuilder(46);
            sb5.append("No supported transition specified: ");
            sb5.append(i10);
            throw new IllegalArgumentException(sb5.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            if (this.zzf == zzbe.zzf && this.zzd == zzbe.zzd && this.zze == zzbe.zze && this.zzc == zzbe.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s10 = this.zzc;
        if (s10 == -1) {
            str = "INVALID";
        } else if (s10 != 1) {
            str = "UNKNOWN";
        } else {
            str = "CIRCLE";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb)});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.w(parcel, 2, this.zzb);
        c.C(parcel, 3, this.zzc);
        c.m(parcel, 4, this.zzd);
        c.m(parcel, 5, this.zze);
        c.p(parcel, 6, this.zzf);
        c.t(parcel, 7, this.zzg);
        c.t(parcel, 8, this.zzh);
        c.t(parcel, 9, this.zzi);
        c.b(parcel, a10);
    }
}
