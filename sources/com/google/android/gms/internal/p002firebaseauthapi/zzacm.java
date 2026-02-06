package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import ic.C5027b;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacm  reason: invalid package */
public interface zzacm {
    public static final C4246a zza = new C4246a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, C5027b bVar);

    void zza(String str, Status status);
}
