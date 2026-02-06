package va;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import za.b;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.o(parcel, C10, GoogleSignInOptions.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
