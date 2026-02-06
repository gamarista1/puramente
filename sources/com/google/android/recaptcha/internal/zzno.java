package com.google.android.recaptcha.internal;

public final class zzno extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzno zzb;
    private int zzd;
    private zzib zze;
    private zzlj zzf;
    private zzib zzg;
    private zzlj zzh;

    static {
        zzno zzno = new zzno();
        zzb = zzno;
        zzit.zzD(zzno.class, zzno);
    }

    private zzno() {
    }

    static /* synthetic */ void zzH(zzno zzno, zzib zzib) {
        zzib.getClass();
        zzno.zzg = zzib;
        zzno.zzd |= 4;
    }

    public static zznn zzf() {
        return (zznn) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzno zzno, zzib zzib) {
        zzib.getClass();
        zzno.zze = zzib;
        zzno.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzno zzno, zzlj zzlj) {
        zzlj.getClass();
        zzno.zzh = zzlj;
        zzno.zzd |= 8;
    }

    static /* synthetic */ void zzk(zzno zzno, zzlj zzlj) {
        zzlj.getClass();
        zzno.zzf = zzlj;
        zzno.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzno();
        } else {
            if (i11 == 4) {
                return new zznn((zznm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
