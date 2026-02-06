package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import za.b;

public final class L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Status status = null;
        C4557n nVar = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                status = (Status) b.o(parcel, C10, Status.CREATOR);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                nVar = (C4557n) b.o(parcel, C10, C4557n.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4556m(status, nVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4556m[i10];
    }
}
