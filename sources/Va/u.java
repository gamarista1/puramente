package va;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zbb;
import com.google.android.gms.internal.p001authapi.zbc;

public abstract class u extends zbb implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                zbc.zbb(parcel);
                A((GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR), (Status) zbc.zba(parcel, Status.CREATOR));
                break;
            case 102:
                zbc.zbb(parcel);
                V0((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            case 103:
                zbc.zbb(parcel);
                Q0((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
