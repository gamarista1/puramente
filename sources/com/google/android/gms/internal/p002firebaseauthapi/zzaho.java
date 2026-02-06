package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaho  reason: invalid package */
public abstract class zzaho implements Serializable, Iterable<Byte> {
    public static final zzaho zza = new zzaib(zzajh.zzb);
    private static final zzahv zzb = new zzaia();
    private static final Comparator<zzaho> zzc = new zzahq();
    private int zzd = 0;

    zzaho() {
    }

    static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    static zzaho zzb(byte[] bArr) {
        return new zzaib(bArr);
    }

    static zzahx zzc(int i10) {
        return new zzahx(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzd = i10;
        }
        return i10;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzahr(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzaly.zza(this);
        } else {
            str = zzaly.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract byte zza(int i10);

    public abstract zzaho zza(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzahp zzahp);

    /* access modifiers changed from: protected */
    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzb();

    /* access modifiers changed from: protected */
    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaic zzc();

    public final String zzd() {
        Charset charset = zzajh.zza;
        if (zzb() == 0) {
            return "";
        }
        return zza(charset);
    }

    public abstract boolean zze();

    public final byte[] zzf() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzajh.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

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
        return this.zzd;
    }

    public static zzaho zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaho zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzaib(zzb.zza(bArr, i10, i11));
    }

    public static zzaho zza(String str) {
        return new zzaib(str.getBytes(zzajh.zza));
    }
}
