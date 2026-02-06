package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzane  reason: invalid package */
public final class zzane {
    private static final zzamd zza = ((zzamd) ((zzaje) zzamd.zzc().zza(-62135596800L).zza(0).zzf()));
    private static final zzamd zzb = ((zzamd) ((zzaje) zzamd.zzc().zza(253402300799L).zza(999999999).zzf()));
    private static final zzamd zzc = ((zzamd) ((zzaje) zzamd.zzc().zza(0).zza(0).zzf()));
    private static final ThreadLocal<SimpleDateFormat> zzd = new zzang();
    private static final Method zze = zzc("now");
    private static final Method zzf = zzc("getEpochSecond");
    private static final Method zzg = zzc("getNano");

    private static boolean zza(long j10) {
        return j10 >= -62135596800L && j10 <= 253402300799L;
    }

    private static long zzb(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
            } catch (NumberFormatException e10) {
                ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
                parseException.initCause(e10);
                throw parseException;
            }
        } else {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, (Class[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long zza(zzamd zzamd) {
        return zzb(zzamd).zzb();
    }

    public static zzamd zza(String str) {
        String str2;
        int i10;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = "";
                }
                long time = zzd.get().parse(substring).getTime() / 1000;
                if (str2.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    for (int i11 = 0; i11 < 9; i11++) {
                        i10 *= 10;
                        if (i11 < str2.length()) {
                            if (str2.charAt(i11) < '0' || str2.charAt(i11) > '9') {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                            i10 += str2.charAt(i11) - '0';
                        }
                    }
                }
                if (str.charAt(indexOf2) != 'Z') {
                    long zzb2 = zzb(str.substring(indexOf2 + 1));
                    time = str.charAt(indexOf2) == '+' ? time - zzb2 : time + zzb2;
                } else if (str.length() != indexOf2 + 1) {
                    throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
                }
                try {
                    if (zza(time)) {
                        if (i10 <= -1000000000 || i10 >= 1000000000) {
                            time = zzbf.zza(time, (long) (i10 / 1000000000));
                            i10 %= 1000000000;
                        }
                        if (i10 < 0) {
                            i10 += 1000000000;
                            time = zzbf.zzb(time, 1);
                        }
                        return zzb((zzamd) ((zzaje) zzamd.zzc().zza(time).zza(i10).zzf()));
                    }
                    throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[]{Long.valueOf(time)}));
                } catch (IllegalArgumentException e10) {
                    ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                    parseException.initCause(e10);
                    throw parseException;
                }
            } else {
                throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
            }
        } else {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
    }

    private static zzamd zzb(zzamd zzamd) {
        long zzb2 = zzamd.zzb();
        int zza2 = zzamd.zza();
        if (zza(zzb2) && zza2 >= 0 && zza2 < 1000000000) {
            return zzamd;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(zzb2), Integer.valueOf(zza2)}));
    }

    static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
