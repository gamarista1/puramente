package com.google.android.recaptcha.internal;

public final class zzhx extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzhx zzb;
    private int zzd;
    private zzjb zze = zzko.zze();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private double zzi;
    private zzgw zzj = zzgw.zzb;
    private String zzk = "";
    private byte zzl = 2;

    static {
        zzhx zzhx = new zzhx();
        zzb = zzhx;
        zzit.zzD(zzhx.class, zzhx);
    }

    private zzhx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        byte b10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzkp(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzhx();
        } else {
            if (i11 == 4) {
                return new zzhu((zzhj) null);
            }
            if (i11 == 5) {
                return zzb;
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
