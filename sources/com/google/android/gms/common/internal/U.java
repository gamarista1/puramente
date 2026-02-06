package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import za.b;

public final class U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                account = (Account) b.o(parcel, C10, Account.CREATOR);
            } else if (v10 == 3) {
                i11 = b.E(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.o(parcel, C10, GoogleSignInAccount.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new T(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new T[i10];
    }
}
