package com.google.android.recaptcha.internal;

public final class zzml extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzml zzb;
    private int zzd;
    private zzib zze;
    private int zzf;

    static {
        zzml zzml = new zzml();
        zzb = zzml;
        zzit.zzD(zzml.class, zzml);
    }

    private zzml() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzml();
        } else {
            if (i11 == 4) {
                return new zzmk((zzmj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
