package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlz  reason: invalid package */
public final class zzlz {
    /* access modifiers changed from: private */
    public static final Object zza = new Object();
    /* access modifiers changed from: private */
    public static final String zzb = "zzlz";
    private final zzce zzc;
    private final zzbh zzd;
    private zzcc zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlz$zza */
    public static final class zza {
        /* access modifiers changed from: private */
        public Context zza = null;
        /* access modifiers changed from: private */
        public String zzb = null;
        /* access modifiers changed from: private */
        public String zzc = null;
        private String zzd = null;
        /* access modifiers changed from: private */
        public zzbh zze = null;
        private boolean zzf = true;
        private zzbv zzg = null;
        private zzvc zzh = null;
        /* access modifiers changed from: private */
        public zzcc zzi;

        private static zzcc zza(byte[] bArr) {
            return zzcc.zza(zzbm.zza(zzbk.zza(bArr)));
        }

        private final zzbh zzb() {
            zzlz.zzd();
            zzmc zzmc = new zzmc();
            try {
                boolean zzc2 = zzmc.zzc(this.zzd);
                try {
                    return zzmc.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (zzc2) {
                        Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.zzd}), e10);
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final zza zza(zzvc zzvc) {
            this.zzh = zzvc;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.zzf) {
                this.zzd = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        private final zzcc zzb(byte[] bArr) {
            try {
                this.zze = new zzmc().zza(this.zzd);
                try {
                    return zzcc.zza(zzby.zza(zzbk.zza(bArr), this.zze));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzcc zza2 = zza(bArr);
                    Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zza2;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzlz zza() {
            zzlz zzlz;
            try {
                if (this.zzb != null) {
                    zzvc zzvc = this.zzh;
                    if (zzvc != null && this.zzg == null) {
                        this.zzg = zzbv.zza(zzcp.zza(zzvc.a_()));
                    }
                    synchronized (zzlz.zza) {
                        byte[] zzb2 = zzb(this.zza, this.zzb, this.zzc);
                        if (zzb2 == null) {
                            if (this.zzd != null) {
                                this.zze = zzb();
                            }
                            if (this.zzg != null) {
                                zzcc zza2 = zzcc.zzb().zza(this.zzg);
                                zzcc zza3 = zza2.zza(zza2.zza().zzc().zza(0).zza());
                                zzlz.zza(zza3.zza(), new zzme(this.zza, this.zzb, this.zzc), this.zze);
                                this.zzi = zza3;
                            } else {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                        } else if (this.zzd != null) {
                            zzlz.zzd();
                            this.zzi = zzb(zzb2);
                        } else {
                            this.zzi = zza(zzb2);
                        }
                        zzlz = new zzlz(this);
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
                while (true) {
                }
            }
            return zzlz;
        }

        private static byte[] zzb(Context context, String str, String str2) {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    return zzxl.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{str}));
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        }
    }

    static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzby zza() {
        return this.zze.zza();
    }

    private zzlz(zza zza2) {
        this.zzc = new zzme(zza2.zza, zza2.zzb, zza2.zzc);
        this.zzd = zza2.zze;
        this.zze = zza2.zzi;
    }

    static /* synthetic */ void zza(zzby zzby, zzce zzce, zzbh zzbh) {
        if (zzbh != null) {
            try {
                zzby.zza(zzce, zzbh);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        } else {
            zzbm.zza(zzby, zzce);
        }
    }
}
