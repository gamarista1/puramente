package com.google.android.recaptcha.internal;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzjc {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(Constants.ENCODING);
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzhc zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzhc.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
