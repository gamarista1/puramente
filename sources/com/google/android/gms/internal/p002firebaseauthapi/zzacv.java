package com.google.android.gms.internal.p002firebaseauthapi;

import Cb.b;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import gc.i;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import ub.C5230g;
import zb.C5300b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacv  reason: invalid package */
public final class zzacv {
    private Context zza;
    private zzado zzb;
    private String zzc;
    private final C5230g zzd;
    private boolean zze;
    private String zzf;

    public zzacv(C5230g gVar, String str) {
        this(gVar.m(), gVar, str);
    }

    private static String zza(C5230g gVar) {
        b bVar = (b) FirebaseAuth.getInstance(gVar).u0().get();
        if (bVar == null) {
            return null;
        }
        try {
            C5300b bVar2 = (C5300b) Tasks.await(bVar.a(false));
            if (bVar2.a() != null) {
                String valueOf = String.valueOf(bVar2.a());
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + valueOf);
            }
            return bVar2.b();
        } catch (ExecutionException e10) {
            e = e10;
            String message = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message);
            return null;
        } catch (InterruptedException e11) {
            e = e11;
            String message2 = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message2);
            return null;
        }
    }

    private static String zzb(C5230g gVar) {
        i iVar = (i) FirebaseAuth.getInstance(gVar).x0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                String message = e10.getMessage();
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + message);
            }
        }
        return null;
    }

    public zzacv(Context context, C5230g gVar, String str) {
        this.zze = false;
        this.zza = (Context) C4536s.l(context);
        this.zzd = (C5230g) C4536s.l(gVar);
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzado(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacy.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.r().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza2 = zza(this.zzd);
        if (!TextUtils.isEmpty(zza2)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza2);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
