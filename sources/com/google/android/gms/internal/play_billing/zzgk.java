package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk zzb = new zzgi(zzhp.zzb);
    private int zza = 0;

    static {
        int i10 = zzfy.zza;
    }

    zzgk() {
    }

    static int zzh(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static zzgk zzj(byte[] bArr, int i10, int i11) {
        zzh(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgi(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int zzd = zzd();
            i10 = zze(zzd, 0, zzd);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zza = i10;
        }
        return i10;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgd(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzjh.zza(this);
        } else {
            str = zzjh.zza(zzf(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract int zze(int i10, int i11, int i12);

    public abstract zzgk zzf(int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void zzg(zzgc zzgc);

    /* access modifiers changed from: protected */
    public final int zzi() {
        return this.zza;
    }
}
