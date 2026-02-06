package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import za.b;

public final class u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                connectionResult = (ConnectionResult) b.o(parcel, C10, ConnectionResult.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new Status(i10, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
