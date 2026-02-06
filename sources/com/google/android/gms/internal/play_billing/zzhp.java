package com.google.android.gms.internal.play_billing;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzhp {
    static final Charset zza = Charset.forName(Constants.ENCODING);
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = zzgn.zza;
        try {
            new zzgl(bArr, 0, 0, false, (zzgm) null).zza(0);
        } catch (zzhr e10) {
            throw new IllegalArgumentException(e10);
        }
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
}
