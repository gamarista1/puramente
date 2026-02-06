package com.google.android.gms.internal.p002firebaseauthapi;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajh  reason: invalid package */
public final class zzajh {
    static final Charset zza = Charset.forName(Constants.ENCODING);
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("US-ASCII");
    private static final Charset zzd = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zze;
    private static final zzaic zzf;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzaic.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzc(byte[] bArr) {
        return zzamn.zza(bArr);
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    static int zza(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static <T> T zza(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T zza(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static boolean zza(zzakp zzakp) {
        boolean z10 = zzakp instanceof zzahg;
        return false;
    }
}
