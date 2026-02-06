package va;

import android.os.Parcel;
import com.google.android.gms.internal.p001authapi.zbb;

public abstract class s extends zbb implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            q();
        } else if (i10 != 2) {
            return false;
        } else {
            p();
        }
        return true;
    }
}
