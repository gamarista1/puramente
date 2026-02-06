package com.google.android.recaptcha.internal;

public final class zzht extends zzip implements zzkf {
    /* access modifiers changed from: private */
    public static final zzht zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzht zzht = new zzht();
        zzd = zzht;
        zzit.zzD(zzht.class, zzht);
    }

    private zzht() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        byte b10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzkp(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzho.zza, "zzg", zzhn.zza, "zzh", zzhr.zza, "zzi", zzhs.zza, "zzj", zzhq.zza, "zzk", zzhp.zza});
        } else if (i11 == 3) {
            return new zzht();
        } else {
            if (i11 == 4) {
                return new zzhm((zzhj) null);
            }
            if (i11 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            } else {
                b10 = 1;
            }
            this.zzl = b10;
            return null;
        }
    }
}
