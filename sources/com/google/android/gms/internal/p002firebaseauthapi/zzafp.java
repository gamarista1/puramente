package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafp  reason: invalid package */
public final class zzafp implements Parcelable.Creator<zzafm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C10);
            } else if (v10 == 4) {
                l10 = b.H(parcel, C10);
            } else if (v10 == 5) {
                str3 = b.p(parcel, C10);
            } else if (v10 != 6) {
                b.K(parcel, C10);
            } else {
                l11 = b.H(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new zzafm(str, str2, l10, str3, l11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzafm[i10];
    }
}
