package com.google.firebase.auth.internal;

import Cb.b;
import Db.C4267o;
import Db.L;
import Db.d0;
import Db.e0;
import Db.n0;
import Db.p0;
import Ea.C4278a;
import Ea.h;
import Ea.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1773v;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzack;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.internal.p002firebaseauthapi.zzacm;
import com.google.android.gms.internal.p002firebaseauthapi.zzacy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
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
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import s.C2576d;
import ub.C5230g;
import zb.C5300b;

public class RecaptchaActivity extends C1773v implements zzacm {

    /* renamed from: b  reason: collision with root package name */
    private static final String f57036b = "RecaptchaActivity";

    /* renamed from: c  reason: collision with root package name */
    private static long f57037c;

    /* renamed from: d  reason: collision with root package name */
    private static final d0 f57038d = d0.g();

    /* renamed from: a  reason: collision with root package name */
    private boolean f57039a = false;

    private final Uri.Builder C(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C5230g p10 = C5230g.p(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(p10);
        n0.a().d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String b10 = p0.a(getApplicationContext(), p10.s()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e(f57036b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            E(C4267o.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(instance.n())) {
            str3 = instance.n();
        } else {
            str3 = zzacy.zza();
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid);
        appendQueryParameter.appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
        return builder;
    }

    static /* synthetic */ Uri D(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            C5300b bVar = (C5300b) task.getResult();
            if (bVar.a() != null) {
                String str = f57036b;
                String valueOf = String.valueOf(bVar.a());
                Log.w(str, "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            String b10 = bVar.b();
            buildUpon.fragment("fac=" + b10);
        } else {
            String str2 = f57036b;
            String message = task.getException().getMessage();
            Log.e(str2, "Unexpected error getting App Check token: " + message);
        }
        return buildUpon.build();
    }

    private final void E(Status status) {
        f57037c = 0;
        this.f57039a = false;
        Intent intent = new Intent();
        e0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        G(intent);
        f57038d.b(this);
        finish();
    }

    private final boolean G(Intent intent) {
        return C1926a.b(this).d(intent);
    }

    private final void H() {
        f57037c = 0;
        this.f57039a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        G(intent);
        f57038d.b(this);
        finish();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void F(String str, Task task) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            C2576d a10 = new C2576d.a().a();
            a10.f25762a.addFlags(1073741824);
            a10.f25762a.addFlags(268435456);
            a10.a(this, (Uri) task.getResult());
            return;
        }
        Log.e(f57036b, "Device cannot resolve intent for: android.intent.action.VIEW");
        zzacl.zzb(this, str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = h.c().currentTimeMillis();
            if (currentTimeMillis - f57037c < 30000) {
                Log.e(f57036b, "Could not start operation - already in progress");
                return;
            }
            f57037c = currentTimeMillis;
            if (bundle != null) {
                this.f57039a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        String str = f57036b;
        Log.e(str, "Could not do operation - unknown action: " + action);
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
                E(e0.b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra(ActionType.LINK) || !intent.hasExtra("eventId")) {
                H();
            } else {
                String stringExtra = intent.getStringExtra(ActionType.LINK);
                String g10 = n0.a().g(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(g10)) {
                    Log.e(f57036b, "Failed to find registration for this event - failing to prevent session injection.");
                    E(C4267o.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = p0.a(getApplicationContext(), C5230g.p(g10).s()).c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f57037c = 0;
                this.f57039a = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!G(intent2)) {
                    L.g(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                } else {
                    f57038d.b(this);
                }
                finish();
            }
        } else if (!this.f57039a) {
            Intent intent3 = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = j.b(C4278a.a(this, packageName)).toLowerCase(Locale.US);
                C5230g p10 = C5230g.p(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(p10);
                if (!zzaec.zza(p10)) {
                    new zzack(packageName, lowerCase, intent3, p10, this).executeOnExecutor(instance.z0(), new Void[0]);
                } else {
                    zza(C(Uri.parse(zzaec.zza(p10.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, instance.u0());
                }
            } catch (PackageManager.NameNotFoundException e10) {
                String str = f57036b;
                String valueOf = String.valueOf(e10);
                Log.e(str, "Could not get package signature: " + packageName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + valueOf);
                zzacl.zzb(this, packageName);
            }
            this.f57039a = true;
        } else {
            H();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f57039a);
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
            zzacm.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            H();
        } else {
            E(status);
        }
    }

    public final void zza(Uri uri, String str, C5027b bVar) {
        Task task;
        b bVar2 = (b) bVar.get();
        if (bVar2 != null) {
            task = bVar2.a(false).continueWith(new c(uri));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new b(this, str));
    }
}
