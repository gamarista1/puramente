package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

public final class zzax extends C5298a {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    zzax(int i10, String str) {
        this.zza = 1;
        this.zzb = (String) C4536s.l(str);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.D(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public zzax(String str) {
        this(1, str);
    }
}
