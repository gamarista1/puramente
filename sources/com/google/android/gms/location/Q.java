package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class Q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = "";
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.r(parcel, C10);
            } else if (v10 == 2) {
                pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new P(arrayList, pendingIntent, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new P[i10];
    }
}
