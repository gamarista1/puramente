package va;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import ua.C5219b;

final class k extends p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f61735a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f61736b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(f fVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(fVar);
        this.f61735a = context;
        this.f61736b = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ com.google.android.gms.common.api.k createFailedResult(Status status) {
        return new C5219b((GoogleSignInAccount) null, status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((w) ((i) bVar).getService()).c(new j(this, this.f61735a, this.f61736b), this.f61736b);
    }
}
