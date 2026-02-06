package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        PendingIntent pendingIntent = null;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 3) {
                pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new ConnectionResult(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
