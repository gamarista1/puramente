package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C1773v;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import va.r;
import va.z;

@KeepName
public class SignInHubActivity extends C1773v {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f53882f = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f53883a = false;

    /* renamed from: b  reason: collision with root package name */
    private SignInConfiguration f53884b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53885c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f53886d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Intent f53887e;

    private final void E() {
        getSupportLoaderManager().c(0, (Bundle) null, new a(this, (z) null));
        f53882f = false;
    }

    private final void F(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f53882f = false;
    }

    private final void G(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f53884b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f53883a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            F(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f53883a) {
            setResult(0);
            if (i10 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.o0() != null) {
                        GoogleSignInAccount o02 = signInAccount.o0();
                        if (o02 == null) {
                            Log.e("AuthSignInClient", "Google account is null");
                            F(12500);
                            return;
                        }
                        r.c(this).e(this.f53884b.o0(), o02);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", o02);
                        this.f53885c = true;
                        this.f53886d = i11;
                        this.f53887e = intent;
                        E();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        F(intExtra);
                        return;
                    }
                }
                F(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            F(12500);
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            F(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            if (bundleExtra == null) {
                Log.e("AuthSignInClient", "Activity started with no configuration.");
                setResult(0);
                finish();
                return;
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f53884b = signInConfiguration;
            if (bundle != null) {
                boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
                this.f53885c = z10;
                if (z10) {
                    this.f53886d = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    if (intent2 == null) {
                        Log.e("AuthSignInClient", "Sign in result data cannot be null");
                        setResult(0);
                        finish();
                        return;
                    }
                    this.f53887e = intent2;
                    E();
                }
            } else if (f53882f) {
                setResult(0);
                F(12502);
            } else {
                f53882f = true;
                G(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f53882f = false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f53885c);
        if (this.f53885c) {
            bundle.putInt("signInResultCode", this.f53886d);
            bundle.putParcelable("signInResultData", this.f53887e);
        }
    }
}
