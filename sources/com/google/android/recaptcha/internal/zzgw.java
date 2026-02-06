package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgw implements Iterable, Serializable {
    private static final Comparator zza = new zzgo();
    public static final zzgw zzb = new zzgt(zzjc.zzd);
    private static final zzgv zzd = new zzgv((zzgu) null);
    private int zzc = 0;

    static {
        int i10 = zzgi.zza;
    }

    zzgw() {
    }

    static int zzk(int i10, int i11, int i12) {
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

    public static zzgw zzm(byte[] bArr, int i10, int i11) {
        zzk(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgt(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgn(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzlg.zza(this);
        } else {
            str = zzlg.zza(zzg(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzgw zzg(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zzh(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zzi(zzgm zzgm);

    public abstract boolean zzj();

    /* access modifiers changed from: protected */
    public final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public final byte[] zzo() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzjc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
