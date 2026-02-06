package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import za.C5298a;
import za.c;

public final class zzaa extends C5298a implements k {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
    public static final zzaa zza = new zzaa(Status.f53907f);
    private final Status zzb;

    public zzaa(Status status) {
        this.zzb = status;
    }

    public final Status getStatus() {
        return this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zzb, i10, false);
        c.b(parcel, a10);
    }
}
