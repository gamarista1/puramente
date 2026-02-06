package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import Db.C4267o;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.FirebaseAuth;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import ub.C5230g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
public final class zzack extends AsyncTask<Void, Void, zzacj> {
    private static final C4246a zza = new C4246a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzacm> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final C5230g zzg;

    public zzack(String str, String str2, Intent intent, C5230g gVar, zzacm zzacm) {
        this.zzb = C4536s.f(str);
        this.zzg = (C5230g) C4536s.l(gVar);
        C4536s.f(str2);
        C4536s.l(intent);
        String f10 = C4536s.f(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzacm.zza(f10)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(SubscriberAttributeKt.JSON_NAME_KEY, f10).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) C4536s.l(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzacm);
        this.zze = zzacm.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final zzacj doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzacm zzacm = this.zzd.get();
            HttpURLConnection zza2 = zzacm.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzacv(zzacm.zza(), this.zzg, zzact.zza().zzb()).zza((URLConnection) zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c(String.format("Error getting project config. Failed with %s %s", new Object[]{zza3, Integer.valueOf(responseCode)}), new Object[0]);
                return zzacj.zzb(zza3);
            }
            zzafl zzafl = new zzafl();
            zzafl.zza(new String(zza(zza2.getInputStream(), 128)));
            if (TextUtils.isEmpty(this.zzf)) {
                for (String next : zzafl.zza()) {
                    if (zza(next)) {
                        return zzacj.zza(next);
                    }
                }
                return null;
            } else if (!zzafl.zza().contains(this.zzf)) {
                return zzacj.zzb("UNAUTHORIZED_DOMAIN");
            } else {
                return zzacj.zza(this.zzf);
            }
        } catch (IOException e10) {
            C4246a aVar = zza;
            String message = e10.getMessage();
            aVar.c("IOException occurred: " + message, new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            C4246a aVar2 = zza;
            String message2 = e11.getMessage();
            aVar2.c("Null pointer encountered: " + message2, new Object[0]);
            return null;
        } catch (zzaah e12) {
            C4246a aVar3 = zza;
            String message3 = e12.getMessage();
            aVar3.c("ConversionException encountered: " + message3, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onCancelled(Object obj) {
        zzacj zzacj = (zzacj) obj;
        onPostExecute((zzacj) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzacs.zza(new String(zza(errorStream, 128)), String.class);
            }
            return "WEB_INTERNAL_ERROR:" + "Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e10) {
            C4246a aVar = zza;
            String valueOf = String.valueOf(e10);
            aVar.h("Error parsing error message from response body in getErrorMessageFromBody. " + valueOf, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final void onPostExecute(zzacj zzacj) {
        String str;
        String str2;
        Uri.Builder builder;
        zzacm zzacm = this.zzd.get();
        if (zzacj != null) {
            str2 = zzacj.zza();
            str = zzacj.zzb();
        } else {
            str2 = null;
            str = null;
        }
        if (zzacm == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzacm.zza(this.zzb, C4267o.a(str));
        } else {
            builder.authority(str2);
            zzacm.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).u0());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host == null || (!host.endsWith("firebaseapp.com") && !host.endsWith("web.app"))) {
                return false;
            }
            return true;
        } catch (URISyntaxException e10) {
            C4246a aVar = zza;
            String message = e10.getMessage();
            aVar.c("Error parsing URL for auth domain check: " + str + ". " + message, new Object[0]);
        }
    }

    private static byte[] zza(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            byteArrayOutputStream.close();
            throw th2;
        }
    }
}
