package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafs  reason: invalid package */
public final class zzafs implements Parcelable.Creator<zzaft> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str3 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new zzaft(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaft[i10];
    }
}
