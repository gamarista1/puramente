package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.c;
import io.intercom.android.sdk.models.AttributeType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

public class g extends h implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final long f37235b = 31536000;

    /* renamed from: e  reason: collision with root package name */
    private static final c f37236e = new c("ShutdownPrompt");

    /* renamed from: f  reason: collision with root package name */
    private static final String f37237f = "https://www.amazon.com/appstore-error-help";

    /* renamed from: g  reason: collision with root package name */
    private static final String f37238g = "badcert";

    /* renamed from: h  reason: collision with root package name */
    private static final String f37239h = "1.1";
    @com.amazon.a.a.k.a

    /* renamed from: i  reason: collision with root package name */
    private com.amazon.a.a.a.a f37240i;
    @com.amazon.a.a.k.a

    /* renamed from: j  reason: collision with root package name */
    private com.amazon.a.a.m.c f37241j;

    private static class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final com.amazon.a.a.a.a f37242a;

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        private a(com.amazon.a.a.a.a aVar) {
            this.f37242a = aVar;
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            g.b(this.f37242a);
        }
    }

    private static class b extends AsyncTask<Intent, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f37243a;

        /* renamed from: b  reason: collision with root package name */
        private final com.amazon.a.a.a.a f37244b;

        /* renamed from: a */
        public Void doInBackground(Intent... intentArr) {
            this.f37243a.startActivity(intentArr[0]);
            return null;
        }

        private b(Context context, com.amazon.a.a.a.a aVar) {
            this.f37243a = context;
            this.f37244b = aVar;
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            g.b(this.f37244b);
        }
    }

    public g(c cVar) {
        super(cVar, h.a.EXTENDED);
        f37236e.a("new ShutdownPrompt called!");
    }

    private String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    public void b() {
        this.f37240i.g();
    }

    /* access modifiers changed from: protected */
    public long h() {
        return f37235b;
    }

    /* access modifiers changed from: protected */
    public void i() {
        a(0);
    }

    /* access modifiers changed from: protected */
    public void m() {
        c cVar = f37236e;
        cVar.a("Store contains " + this.f37241j.toString());
        if (!this.f37247c.i()) {
            cVar.a("Should not show fixup");
            new a(this.f37240i).execute(new Void[0]);
            return;
        }
        cVar.a("Should show fixup");
        Activity a10 = this.f37240i.a();
        a((Context) a10, a((Context) a10));
        cVar.a("Attempted to start browser.");
    }

    public String toString() {
        return "ShutdownPrompt";
    }

    /* access modifiers changed from: private */
    public static void b(com.amazon.a.a.a.a aVar) {
        c cVar = f37236e;
        cVar.a("doShutdown()");
        cVar.c("Killing application");
        System.exit(0);
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        c cVar = f37236e;
        cVar.a("doAction(" + i10 + ")");
        c.a[] c10 = this.f37247c.c();
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = i10 < c10.length ? c10[i10] : aVar;
        if (aVar2 == c.a.HELP) {
            cVar.a("doAction() help");
            m();
        } else if (aVar2 == c.a.DEEPLINK) {
            cVar.a("doAction() deeplink");
            a(f37238g);
        } else if (aVar2 == aVar) {
            b(this.f37240i);
        }
    }

    private String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE);
        if (telephonyManager == null) {
            f37236e.a("tm was null!");
            return null;
        }
        com.amazon.a.a.o.c cVar = f37236e;
        cVar.a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState == 5) {
            return telephonyManager.getSimOperator();
        }
        cVar.a("SIM not ready, returning null.  State was " + simState);
        return null;
    }

    private boolean b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final Intent a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(f37237f);
        PackageManager packageManager = context.getPackageManager();
        a(sb2, "?k=", f37239h);
        a(sb2, "&m=", this.f37247c.e());
        a(sb2, "&ec=", String.valueOf(this.f37247c.g()));
        String str = (String) this.f37241j.a(com.amazon.a.a.m.c.f37301f);
        if (str != null) {
            a(sb2, "&t=", str);
            a(sb2, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f37241j.a(com.amazon.a.a.m.c.f37302g);
        if (str2 != null) {
            a(sb2, "&c=", str2);
        }
        String str3 = (String) this.f37241j.a(com.amazon.a.a.m.c.f37299d);
        if (str3 != null) {
            a(sb2, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            a(sb2, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            a(sb2, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            a(sb2, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            a(sb2, "&bn=", str7);
        }
        a(sb2, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        a(sb2, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        a(sb2, "&p=", packageName);
        a(sb2, "&pv=", packageName, packageManager);
        a(sb2, "&l=", n());
        String b10 = b(context);
        if (!TextUtils.isEmpty(b10)) {
            a(sb2, "&mc=", b10);
        }
        String sb3 = sb2.toString();
        com.amazon.a.a.o.c cVar = f37236e;
        cVar.a("Starting browser for uri " + sb3);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb3));
    }

    private final void a(StringBuilder sb2, String str, String str2, PackageManager packageManager) {
        try {
            a(sb2, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            com.amazon.a.a.o.c cVar = f37236e;
            cVar.b("Could not find information for package " + str2);
        }
    }

    private final void a(StringBuilder sb2, String str, String str2) {
        try {
            String encode = URLEncoder.encode(str2, Constants.ENCODING);
            sb2.append(str);
            sb2.append(encode);
        } catch (UnsupportedEncodingException e10) {
            f37236e.b("Failed to URL-encode argument", e10);
        }
    }

    private void a(String str) {
        f37236e.a("Attempting to deep link to appstore.");
        Activity a10 = this.f37240i.a();
        a((Context) a10, a((Context) a10, str));
    }

    private Intent a(Context context, String str) {
        String packageName = context.getPackageName();
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + packageName + "&ref=" + str));
    }

    private void a(Context context, Intent intent) {
        if (!b(context, intent)) {
            f37236e.b("Could not start activity, nothing resolves for the given data.");
            b(this.f37240i);
            return;
        }
        new b(context, this.f37240i).execute(new Intent[]{intent});
    }

    /* access modifiers changed from: protected */
    public boolean a(c.a aVar) {
        Intent intent;
        if (aVar == c.a.DEFAULT) {
            return true;
        }
        Activity a10 = this.f37240i.a();
        if (aVar == c.a.DEEPLINK) {
            intent = a((Context) a10, f37238g);
        } else {
            intent = aVar == c.a.HELP ? a((Context) a10) : null;
        }
        if (intent != null) {
            return b(a10, intent);
        }
        com.amazon.a.a.o.c cVar = f37236e;
        cVar.b("Unexpected action " + aVar + ", could not create intent.");
        return false;
    }
}
