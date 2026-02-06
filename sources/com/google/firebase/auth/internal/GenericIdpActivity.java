package com.google.firebase.auth.internal;

import Cb.b;
import Db.C4267o;
import Db.G;
import Db.L;
import Db.d0;
import Db.e0;
import Db.n0;
import Db.p0;
import Db.q0;
import Ea.C4278a;
import Ea.h;
import Ea.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1773v;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzack;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.internal.p002firebaseauthapi.zzacm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d2.C1926a;
import ic.C5027b;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;
import za.e;
import zb.C5300b;

@KeepName
public class GenericIdpActivity extends C1773v implements zzacm {

    /* renamed from: b  reason: collision with root package name */
    private static long f57033b;

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f57034c = d0.g();

    /* renamed from: a  reason: collision with root package name */
    private boolean f57035a = false;

    private final Uri.Builder C(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            str3 = null;
        } else {
            str3 = TextUtils.join(f.f37529a, stringArrayListExtra);
        }
        String E10 = E(intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza = zzacl.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str4 = stringExtra;
        String str5 = zza;
        String str6 = uuid;
        String str7 = E10;
        String str8 = str3;
        n0.a().e(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String b10 = p0.a(getApplicationContext(), C5230g.p(stringExtra4).s()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            F(C4267o.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (str5 == null) {
            return null;
        } else {
            builder2.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", str4).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str5).appendQueryParameter("eventId", str6).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
            if (!TextUtils.isEmpty(str8)) {
                builder2.appendQueryParameter("scopes", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                builder2.appendQueryParameter("customParameters", str7);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter("tid", stringExtra3);
            }
            return builder2;
        }
    }

    static /* synthetic */ Uri D(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            C5300b bVar = (C5300b) task.getResult();
            if (bVar.a() != null) {
                String valueOf = String.valueOf(bVar.a());
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            String b10 = bVar.b();
            buildUpon.fragment("fac=" + b10);
        } else {
            String message = task.getException().getMessage();
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + message);
        }
        return buildUpon.build();
    }

    private static String E(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : bundle.keySet()) {
                String string = bundle.getString(next);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(next, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    private final void F(Status status) {
        f57033b = 0;
        this.f57035a = false;
        Intent intent = new Intent();
        e0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!G(intent)) {
            L.c(getApplicationContext(), status);
        } else {
            f57034c.b(this);
        }
        finish();
    }

    private final boolean G(Intent intent) {
        return C1926a.b(this).d(intent);
    }

    private final void H() {
        f57033b = 0;
        this.f57035a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!G(intent)) {
            L.c(this, C4267o.a("WEB_CONTEXT_CANCELED"));
        } else {
            f57034c.b(this);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = h.c().currentTimeMillis();
            if (currentTimeMillis - f57033b < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f57033b = currentTimeMillis;
            if (bundle != null) {
                this.f57035a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
        H();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                F(e0.b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra(ActionType.LINK) || !intent.hasExtra("eventId")) {
                H();
            } else {
                String stringExtra = intent.getStringExtra(ActionType.LINK);
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                q0 b10 = n0.a().b(this, packageName, stringExtra2);
                if (b10 == null) {
                    H();
                }
                if (booleanExtra) {
                    stringExtra = p0.a(getApplicationContext(), C5230g.p(b10.a()).s()).c(stringExtra);
                }
                zzags zzags = new zzags(b10, stringExtra);
                String e10 = b10.e();
                String b11 = b10.b();
                zzags.zzb(e10);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b11) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b11) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b11)) {
                    f57033b = 0;
                    this.f57035a = false;
                    Intent intent2 = new Intent();
                    e.e(zzags, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b11);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!G(intent2)) {
                        L.d(getApplicationContext(), zzags, b11, e10);
                    } else {
                        f57034c.b(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: " + b11);
                H();
            }
        } else if (!this.f57035a) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = j.b(C4278a.a(this, packageName2)).toLowerCase(Locale.US);
                C5230g p10 = C5230g.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(p10);
                if (!zzaec.zza(p10)) {
                    new zzack(packageName2, lowerCase, getIntent(), p10, this).executeOnExecutor(instance.z0(), new Void[0]);
                } else {
                    zza(C(Uri.parse(zzaec.zza(p10.r().b())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, instance.u0());
                }
            } catch (PackageManager.NameNotFoundException e11) {
                String valueOf = String.valueOf(e11);
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + valueOf);
                zzacl.zzb(this, packageName2);
            }
            this.f57035a = true;
        } else {
            H();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f57035a);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return C(new Uri.Builder().scheme(Constants.SCHEME).appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zza(String str) {
        return zzaec.zzb(str);
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            H();
        } else {
            F(status);
        }
    }

    public final void zza(Uri uri, String str, C5027b bVar) {
        Task task;
        b bVar2 = (b) bVar.get();
        if (bVar2 != null) {
            task = bVar2.a(false).continueWith(new a(uri));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new G(this, str));
    }
}
