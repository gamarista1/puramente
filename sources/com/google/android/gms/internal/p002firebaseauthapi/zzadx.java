package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import Ga.C4293e;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.auth.O;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sa.C5193a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadx  reason: invalid package */
final class zzadx {
    /* access modifiers changed from: private */
    public static final C4246a zza = new C4246a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap<String, zzaea> zzd = new HashMap<>();

    zzadx(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public final void zze(String str) {
        zzaea zzaea = this.zzd.get(str);
        if (zzaea != null && !zzaea.zzh && !zzah.zzc(zzaea.zzd)) {
            zza.h("Timed out waiting for SMS.", new Object[0]);
            for (zzacf zza2 : zzaea.zzb) {
                zza2.zza(zzaea.zzd);
            }
            zzaea.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzf */
    public final void zzb(String str) {
        zzaea zzaea = this.zzd.get(str);
        if (zzaea != null) {
            if (!zzaea.zzi) {
                zze(str);
            }
            zzc(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        if (this.zzd.get(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = C4293e.a(this.zzb).e(packageName, 64).signatures;
            } else {
                signatureArr = C4293e.a(this.zzb).e(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, signatureArr[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzaea zzaea = this.zzd.get(str);
        if (zzaea != null) {
            ScheduledFuture<?> scheduledFuture = zzaea.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzaea.zzf.cancel(false);
            }
            zzaea.zzb.clear();
            this.zzd.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzacf zza(zzacf zzacf, String str) {
        return new zzady(this, zzacf, str);
    }

    static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str3.getBytes(zzq.zza));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.c("NoSuchAlgorithm: " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzacf zzacf, String str) {
        zzaea zzaea = this.zzd.get(str);
        if (zzaea != null) {
            zzaea.zzb.add(zzacf);
            if (zzaea.zzg) {
                zzacf.zzb(zzaea.zzd);
            }
            if (zzaea.zzh) {
                zzacf.zza(O.s0(zzaea.zzd, zzaea.zze));
            }
            if (zzaea.zzi) {
                zzacf.zza(zzaea.zzd);
            }
        }
    }

    static /* synthetic */ void zza(zzadx zzadx, String str) {
        zzaea zzaea = zzadx.zzd.get(str);
        if (zzaea != null && !zzah.zzc(zzaea.zzd) && !zzah.zzc(zzaea.zze) && !zzaea.zzb.isEmpty()) {
            for (zzacf zza2 : zzaea.zzb) {
                zza2.zza(O.s0(zzaea.zzd, zzaea.zze));
            }
            zzaea.zzh = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzacf zzacf, long j10, boolean z10) {
        this.zzd.put(str, new zzaea(j10, z10));
        zzb(zzacf, str);
        zzaea zzaea = this.zzd.get(str);
        if (zzaea.zza <= 0) {
            zza.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaea.zzf = this.zzc.schedule(new zzadw(this, str), zzaea.zza, TimeUnit.SECONDS);
        if (!zzaea.zzc) {
            zza.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeb zzaeb = new zzaeb(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzaeb, intentFilter);
        C5193a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzadz(this));
    }
}
