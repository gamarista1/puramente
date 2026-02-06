package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import za.b;

public final class zzab implements Parcelable.Creator<zzaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Status status = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                status = (Status) b.o(parcel, C10, Status.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new zzaa(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzaa[i10];
    }
}
