package va;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import com.google.android.gms.internal.p001authapi.zbas;

public final class i extends C4526h {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleSignInOptions f61731a;

    public i(Context context, Looper looper, C4522e eVar, GoogleSignInOptions googleSignInOptions, f.b bVar, f.c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        GoogleSignInOptions.a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.a();
        }
        aVar.i(zbas.zba());
        if (!eVar.e().isEmpty()) {
            for (Scope e10 : eVar.e()) {
                aVar.e(e10, new Scope[0]);
            }
        }
        this.f61731a = aVar.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof w) {
            return (w) queryLocalInterface;
        }
        return new w(iBinder);
    }

    public final GoogleSignInOptions e() {
        return this.f61731a;
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return q.c(getContext(), this.f61731a);
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}
