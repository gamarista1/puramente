package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import za.b;

public final class F implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        List list = LocationResult.f54355b;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                list = b.t(parcel, C10, Location.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new LocationResult(list);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
