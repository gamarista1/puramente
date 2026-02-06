package oa;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        Account account = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                account = (Account) b.o(parcel, C10, Account.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new b(i10, i11, str, account);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
