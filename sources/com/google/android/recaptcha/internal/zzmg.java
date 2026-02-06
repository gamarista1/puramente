package com.google.android.recaptcha.internal;

import com.revenuecat.purchases.common.UtilsKt;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzmg {
    public static final zzlj zza;
    public static final zzlj zzb;
    public static final zzlj zzc;
    private static final ThreadLocal zzd = new zzmf();
    private static final Method zze = zzd("now");
    private static final Method zzf = zzd("getEpochSecond");
    private static final Method zzg = zzd("getNano");

    static {
        zzli zzi = zzlj.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zza = (zzlj) zzi.zzj();
        zzli zzi2 = zzlj.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzb = (zzlj) zzi2.zzj();
        zzli zzi3 = zzlj.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzlj) zzi3.zzj();
    }

    public static zzlj zza(zzlj zzlj) {
        long zzg2 = zzlj.zzg();
        int i10 = (zzg2 > -62135596800L ? 1 : (zzg2 == -62135596800L ? 0 : -1));
        int zzf2 = zzlj.zzf();
        if (i10 >= 0 && zzg2 <= 253402300799L && zzf2 >= 0 && zzf2 < 1000000000) {
            return zzlj;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(zzg2), Integer.valueOf(zzf2)}));
    }

    public static zzlj zzb(long j10) {
        int i10 = (int) ((j10 % 1000) * 1000000);
        long j11 = j10 / 1000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j11 = zzgb.zza(j11, (long) (i10 / 1000000000));
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            j11 = zzgb.zzb(j11, 1);
        }
        zzli zzi = zzlj.zzi();
        zzi.zze(j11);
        zzi.zzd(i10);
        zzlj zzlj = (zzlj) zzi.zzj();
        zza(zzlj);
        return zzlj;
    }

    public static String zzc(zzlj zzlj) {
        String str;
        zza(zzlj);
        long zzg2 = zzlj.zzg();
        int zzf2 = zzlj.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zzd.get()).format(new Date(zzg2 * 1000)));
        if (zzf2 != 0) {
            sb2.append(".");
            if (zzf2 % UtilsKt.MICROS_MULTIPLIER == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(zzf2 / UtilsKt.MICROS_MULTIPLIER)});
            } else if (zzf2 % 1000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(zzf2 / 1000)});
            } else {
                str = String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(zzf2)});
            }
            sb2.append(str);
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, (Class[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
