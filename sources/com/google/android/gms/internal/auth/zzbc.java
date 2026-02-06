package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class zzbc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new zzbb(i10, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbb[i10];
    }
}
