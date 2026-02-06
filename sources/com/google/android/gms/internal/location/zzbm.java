package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzbm {
    public static int zza(int i10, int i11, @NullableDecl String str) {
        String str2;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str2 = zzbn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("negative size: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            str2 = zzbn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i10, int i11, @NullableDecl String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(zzd(i10, i11, "index"));
    }

    public static void zzc(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = zzd(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = zzd(i11, i12, "end index");
            } else {
                str = zzbn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zzd(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return zzbn.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzbn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
