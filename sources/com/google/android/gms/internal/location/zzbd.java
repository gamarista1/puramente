package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class zzbd implements Parcelable.Creator<zzbc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 1;
        zzba zzba = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel, C10);
                    break;
                case 2:
                    zzba = (zzba) b.o(parcel, C10, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = b.D(parcel, C10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.D(parcel, C10);
                    break;
                case 6:
                    iBinder3 = b.D(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new zzbc(i10, zzba, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzbc[i10];
    }
}
