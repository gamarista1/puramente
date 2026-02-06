package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagt  reason: invalid package */
public final class zzagt implements Parcelable.Creator<zzagq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            b.v(C10);
            b.K(parcel, C10);
        }
        b.u(parcel, L10);
        return new zzagq();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzagq[i10];
    }
}
