package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 4) {
                str = b.p(parcel, C10);
            } else if (v10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.o(parcel, C10, GoogleSignInAccount.CREATOR);
            } else if (v10 != 8) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
