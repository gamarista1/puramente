package va;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import ua.C5219b;

final class j extends e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f61732a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f61733b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f61734c;

    j(k kVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f61732a = context;
        this.f61733b = googleSignInOptions;
        this.f61734c = kVar;
    }

    public final void A(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            Context context = this.f61732a;
            r.c(context).e(this.f61733b, googleSignInAccount);
        }
        this.f61734c.setResult(new C5219b(googleSignInAccount, status));
    }
}
