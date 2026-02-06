package com.google.android.recaptcha.internal;

import java.io.InputStream;

public final class zzoz extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzoz zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzoz zzoz = new zzoz();
        zzb = zzoz;
        zzit.zzD(zzoz.class, zzoz);
    }

    private zzoz() {
    }

    public static zzoz zzg(InputStream inputStream) {
        return (zzoz) zzit.zzt(zzb, inputStream);
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzoz();
        } else {
            if (i11 == 4) {
                return new zzoy((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzpb zzi() {
        zzpb zzb2 = zzpb.zzb(this.zzf);
        if (zzb2 == null) {
            return zzpb.UNRECOGNIZED;
        }
        return zzb2;
    }
}
