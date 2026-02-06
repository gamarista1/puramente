package va;

import Ea.q;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;

public final class x extends s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f61744a;

    public x(Context context) {
        this.f61744a = context;
    }

    private final void r1() {
        if (!q.a(this.f61744a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    public final void p() {
        r1();
        r.c(this.f61744a).d();
    }

    public final void q() {
        r1();
        C5244c b10 = C5244c.b(this.f61744a);
        GoogleSignInAccount c10 = b10.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f53847l;
        if (c10 != null) {
            googleSignInOptions = b10.d();
        }
        b a10 = a.a(this.f61744a, googleSignInOptions);
        if (c10 != null) {
            a10.e();
        } else {
            a10.signOut();
        }
    }
}
