package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzia implements Serializable, Iterable<Byte> {
    public static final zzia zza = new zzij(zzjm.zzb);
    private static final zzid zzb = new zzim();
    private int zzc = 0;

    static {
        new zzic();
    }

    zzia() {
    }

    static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    static zzia zzb(byte[] bArr) {
        return new zzij(bArr);
    }

    static zzif zzc(int i10) {
        return new zzif(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzhz(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzmb.zza(this);
        } else {
            str = zzmb.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract byte zza(int i10);

    public abstract zzia zza(int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzhx zzhx);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzb();

    /* access modifiers changed from: protected */
    public abstract int zzb(int i10, int i11, int i12);

    static int zza(int i10, int i11, int i12) {
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

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    public static zzia zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzia zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzij(zzb.zza(bArr, i10, i11));
    }

    public static zzia zza(String str) {
        return new zzij(str.getBytes(zzjm.zza));
    }
}
