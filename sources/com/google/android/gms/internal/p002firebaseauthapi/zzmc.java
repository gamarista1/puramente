package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmc  reason: invalid package */
public final class zzmc implements zzcd {
    private static final Object zza = new Object();
    private static final String zzb = "zzmc";
    private final String zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmc$zza */
    public static final class zza {
        private String zza = null;

        public zza() {
            zzmc.zza();
        }
    }

    public zzmc() {
        this(new zza());
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    private static KeyStore zzb() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    static boolean zzc(String str) {
        new zzmc();
        synchronized (zza) {
            try {
                if (zzd(str)) {
                    return false;
                }
                String zza2 = zzxq.zza("android-keystore://", str);
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                instance.generateKey();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean zzd(String str) {
        boolean containsAlias;
        String zza2 = zzxq.zza("android-keystore://", str);
        try {
            synchronized (zza) {
                containsAlias = zzb().containsAlias(zza2);
            }
            return containsAlias;
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                Thread.sleep((long) ((int) (Math.random() * 40.0d)));
            } catch (InterruptedException unused2) {
            }
            synchronized (zza) {
                return zzb().containsAlias(zza2);
            }
        }
    }

    private zzmc(zza zza2) {
        this.zzc = null;
    }

    public final zzbh zza(String str) {
        zzma zzma;
        try {
            synchronized (zza) {
                zzma = new zzma(zzxq.zza("android-keystore://", str));
                byte[] zza2 = zzow.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zzma.zza(zzma.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzma;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
