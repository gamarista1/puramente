package com.google.android.recaptcha.internal;

public final class zzhw extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzhw zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private byte zzg = 2;

    static {
        zzhw zzhw = new zzhw();
        zzb = zzhw;
        zzit.zzD(zzhw.class, zzhw);
    }

    private zzhw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        byte b10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return new zzkp(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzhw();
        } else {
            if (i11 == 4) {
                return new zzhv((zzhj) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            } else {
                b10 = 1;
            }
            this.zzg = b10;
            return null;
        }
    }
}
