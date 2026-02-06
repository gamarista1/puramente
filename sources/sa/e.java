package Sa;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class e extends zab implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) zac.zaa(parcel, ConnectionResult.CREATOR);
                b bVar = (b) zac.zaa(parcel, b.CREATOR);
                zac.zab(parcel);
                break;
            case 4:
                Status status = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 6:
                Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 7:
                Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                zac.zab(parcel);
                break;
            case 8:
                zac.zab(parcel);
                X0((l) zac.zaa(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                zac.zab(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
