package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzff;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class M5 {

    /* renamed from: a  reason: collision with root package name */
    String f54783a;

    /* renamed from: b  reason: collision with root package name */
    int f54784b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f54785c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f54786d;

    /* renamed from: e  reason: collision with root package name */
    Long f54787e;

    /* renamed from: f  reason: collision with root package name */
    Long f54788f;

    M5(String str, int i10) {
        this.f54783a = str;
        this.f54784b = i10;
    }

    static Boolean b(double d10, zzff.zzd zzd) {
        try {
            return h(new BigDecimal(d10), zzd, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, zzff.zzd zzd) {
        try {
            return h(new BigDecimal(j10), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    static Boolean e(String str, zzff.zzd zzd) {
        if (!x5.c0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, zzff.zzf.zza zza, boolean z10, String str2, List list, String str3, V1 v12) {
        int i10;
        if (str == null) {
            return null;
        }
        if (zza == zzff.zzf.zza.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && zza != zzff.zzf.zza.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (I5.f54725a[zza.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i10).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (v12 != null) {
                        v12.G().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean g(String str, zzff.zzf zzf, V1 v12) {
        String zze;
        List<String> list;
        String str2;
        C4536s.l(zzf);
        if (str == null || !zzf.zzj() || zzf.zzb() == zzff.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzff.zzf.zza zzb = zzf.zzb();
        zzff.zzf.zza zza = zzff.zzf.zza.IN_LIST;
        if (zzb == zza) {
            if (zzf.zza() == 0) {
                return null;
            }
        } else if (!zzf.zzi()) {
            return null;
        }
        zzff.zzf.zza zzb2 = zzf.zzb();
        boolean zzg = zzf.zzg();
        if (zzg || zzb2 == zzff.zzf.zza.REGEXP || zzb2 == zza) {
            zze = zzf.zze();
        } else {
            zze = zzf.zze().toUpperCase(Locale.ENGLISH);
        }
        String str3 = zze;
        if (zzf.zza() == 0) {
            list = null;
        } else {
            List<String> zzf2 = zzf.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf2.size());
                for (String upperCase : zzf2) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                zzf2 = Collections.unmodifiableList(arrayList);
            }
            list = zzf2;
        }
        if (zzb2 == zzff.zzf.zza.REGEXP) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return f(str, zzb2, zzg, str3, list, str2, v12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzff.zzd r9, double r10) {
        /*
            com.google.android.gms.common.internal.C4536s.l(r9)
            boolean r0 = r9.zzh()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.zzff$zzd$zza r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzff$zzd$zza r2 = com.google.android.gms.internal.measurement.zzff.zzd.zza.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0114
        L_0x0014:
            com.google.android.gms.internal.measurement.zzff$zzd$zza r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzff$zzd$zza r2 = com.google.android.gms.internal.measurement.zzff.zzd.zza.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r9.zzl()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r9.zzk()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r9.zzi()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.zzff$zzd$zza r0 = r9.zza()
            com.google.android.gms.internal.measurement.zzff$zzd$zza r3 = r9.zza()
            if (r3 != r2) goto L_0x0065
            java.lang.String r3 = r9.zzf()
            boolean r3 = com.google.android.gms.measurement.internal.x5.c0(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r9.zze()
            boolean r3 = com.google.android.gms.measurement.internal.x5.c0(r3)
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r4 = r9.zzf()     // Catch:{ NumberFormatException -> 0x0064 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r9 = r9.zze()     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0064 }
            r9 = r3
            r3 = r1
            goto L_0x007b
        L_0x0064:
            return r1
        L_0x0065:
            java.lang.String r3 = r9.zzd()
            boolean r3 = com.google.android.gms.measurement.internal.x5.c0(r3)
            if (r3 != 0) goto L_0x0070
            return r1
        L_0x0070:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r9 = r9.zzd()     // Catch:{ NumberFormatException -> 0x0114 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0114 }
            r9 = r1
            r4 = r9
        L_0x007b:
            if (r0 != r2) goto L_0x0080
            if (r9 != 0) goto L_0x0082
            return r1
        L_0x0080:
            if (r3 == 0) goto L_0x0114
        L_0x0082:
            int[] r2 = com.google.android.gms.measurement.internal.I5.f54726b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0106
            r6 = 2
            if (r0 == r6) goto L_0x00f8
            r7 = 3
            if (r0 == r7) goto L_0x00ae
            r10 = 4
            if (r0 == r10) goto L_0x0099
            goto L_0x0114
        L_0x0099:
            if (r9 != 0) goto L_0x009c
            return r1
        L_0x009c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a9
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00a9
            r2 = r5
        L_0x00a9:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ae:
            if (r3 == 0) goto L_0x0114
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e7
            r2 = r5
        L_0x00e7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ec:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00f3
            r2 = r5
        L_0x00f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f8:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x0101
            r2 = r5
        L_0x0101:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0106:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010f
            r2 = r5
        L_0x010f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M5.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzff$zzd, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
