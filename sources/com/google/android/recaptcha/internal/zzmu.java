package com.google.android.recaptcha.internal;

public final class zzmu extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzmu zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzmu zzmu = new zzmu();
        zzb = zzmu;
        zzit.zzD(zzmu.class, zzmu);
    }

    private zzmu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzmu();
        } else {
            if (i11 == 4) {
                return new zzmt((zzms) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
