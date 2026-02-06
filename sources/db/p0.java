package Db;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.p002firebaseauthapi.zzbj;
import com.google.android.gms.internal.p002firebaseauthapi.zzbp;
import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzlz;
import com.google.android.gms.internal.p002firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class p0 {

    /* renamed from: c  reason: collision with root package name */
    private static p0 f50538c;

    /* renamed from: a  reason: collision with root package name */
    private final String f50539a;

    /* renamed from: b  reason: collision with root package name */
    private final zzlz f50540b;

    private p0(Context context, String str, boolean z10) {
        zzlz zzlz;
        this.f50539a = str;
        try {
            zzkh.zza();
            zzlz.zza zza = new zzlz.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str})).zza(zzkq.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            zzlz = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            zzlz = null;
        }
        this.f50540b = zzlz;
    }

    public static p0 a(Context context, String str) {
        p0 p0Var = f50538c;
        if (p0Var == null || !zzw.zza(p0Var.f50539a, str)) {
            f50538c = new p0(context, str, true);
        }
        return f50538c;
    }

    public final String b() {
        if (this.f50540b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zza = zzbj.zza((OutputStream) byteArrayOutputStream);
        try {
            synchronized (this.f50540b) {
                this.f50540b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzlz zzlz = this.f50540b;
        if (zzlz == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzlz) {
                str2 = new String(((zzbp) this.f50540b.zza().zza(zzbp.class)).zza(Base64.decode(str, 8), (byte[]) null), Constants.ENCODING);
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }
}
