package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4520d;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Y;
import java.util.Collections;
import java.util.List;
import za.C5298a;
import za.c;

public final class zzj extends C5298a {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @VisibleForTesting
    static final List<C4520d> zza = Collections.emptyList();
    static final Y zzb = new Y();
    final Y zzc;
    final List<C4520d> zzd;
    final String zze;

    zzj(Y y10, List<C4520d> list, String str) {
        this.zzc = y10;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!C4535q.b(this.zzc, zzj.zzc) || !C4535q.b(this.zzd, zzj.zzd) || !C4535q.b(this.zze, zzj.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zzc, i10, false);
        c.H(parcel, 2, this.zzd, false);
        c.D(parcel, 3, this.zze, false);
        c.b(parcel, a10);
    }
}
