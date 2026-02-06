package com.google.android.recaptcha.internal;

public final class zzpd extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzpd zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzpd zzpd = new zzpd();
        zzb = zzpd;
        zzit.zzD(zzpd.class, zzpd);
    }

    private zzpd() {
    }

    static /* synthetic */ void zzH(zzpd zzpd, zznf zznf) {
        zznf.getClass();
        zzpd.zze = zznf;
        zzpd.zzd = 1;
    }

    static /* synthetic */ void zzI(zzpd zzpd, zznu zznu) {
        zznu.getClass();
        zzpd.zze = zznu;
        zzpd.zzd = 2;
    }

    public static zzpc zzi() {
        return (zzpc) zzb.zzp();
    }

    public static zzpd zzk(byte[] bArr) {
        return (zzpd) zzit.zzu(zzb, bArr);
    }

    public final int zzJ() {
        int i10 = this.zzd;
        if (i10 == 0) {
            return 3;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    public final zznf zzf() {
        if (this.zzd == 1) {
            return (zznf) this.zze;
        }
        return zznf.zzH();
    }

    public final zznu zzg() {
        if (this.zzd == 2) {
            return (zznu) this.zze;
        }
        return zznu.zzg();
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zznf.class, zznu.class});
        } else if (i11 == 3) {
            return new zzpd();
        } else {
            if (i11 == 4) {
                return new zzpc((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
