package com.google.android.recaptcha.internal;

public final class zzpk extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzpk zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzpk zzpk = new zzpk();
        zzb = zzpk;
        zzit.zzD(zzpk.class, zzpk);
    }

    private zzpk() {
    }

    static /* synthetic */ void zzH(zzpk zzpk, double d10) {
        zzpk.zzd = 10;
        zzpk.zze = Double.valueOf(d10);
    }

    static /* synthetic */ void zzI(zzpk zzpk, String str) {
        str.getClass();
        zzpk.zzd = 11;
        zzpk.zze = str;
    }

    static /* synthetic */ void zzJ(zzpk zzpk, boolean z10) {
        zzpk.zzd = 1;
        zzpk.zze = Boolean.valueOf(z10);
    }

    static /* synthetic */ void zzK(zzpk zzpk, zzgw zzgw) {
        zzpk.zzd = 2;
        zzpk.zze = zzgw;
    }

    static /* synthetic */ void zzL(zzpk zzpk, String str) {
        str.getClass();
        zzpk.zzd = 3;
        zzpk.zze = str;
    }

    static /* synthetic */ void zzM(zzpk zzpk, int i10) {
        zzpk.zzd = 4;
        zzpk.zze = Integer.valueOf(i10);
    }

    public static zzpj zzf() {
        return (zzpj) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzpk zzpk, int i10) {
        zzpk.zzd = 5;
        zzpk.zze = Integer.valueOf(i10);
    }

    static /* synthetic */ void zzj(zzpk zzpk, long j10) {
        zzpk.zzd = 7;
        zzpk.zze = Long.valueOf(j10);
    }

    static /* synthetic */ void zzk(zzpk zzpk, float f10) {
        zzpk.zzd = 9;
        zzpk.zze = Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zze", "zzd"});
        } else if (i11 == 3) {
            return new zzpk();
        } else {
            if (i11 == 4) {
                return new zzpj((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
