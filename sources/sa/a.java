package Sa;

import Ra.e;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.T;
import com.google.android.gms.common.internal.V;
import va.C5244c;

public class a extends C4526h implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f52356e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f52357a = true;

    /* renamed from: b  reason: collision with root package name */
    private final C4522e f52358b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f52359c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f52360d;

    public a(Context context, Looper looper, boolean z10, C4522e eVar, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f52358b = eVar;
        this.f52359c = bundle;
        this.f52360d = eVar.j();
    }

    public static Bundle e(C4522e eVar) {
        eVar.i();
        Integer j10 = eVar.j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.b());
        if (j10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final void a(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        C4536s.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d10 = this.f52358b.d();
            if (C4518c.DEFAULT_ACCOUNT.equals(d10.name)) {
                googleSignInAccount = C5244c.b(getContext()).c();
            } else {
                googleSignInAccount = null;
            }
            ((g) getService()).a(new j(1, new T(d10, ((Integer) C4536s.l(this.f52360d)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.X0(new l(1, new ConnectionResult(8, (PendingIntent) null), (V) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    public final void b() {
        connect(new C4518c.d());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f52358b.g())) {
            this.f52359c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f52358b.g());
        }
        return this.f52359c;
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f52357a;
    }
}
