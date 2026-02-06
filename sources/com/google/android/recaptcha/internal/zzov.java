package com.google.android.recaptcha.internal;

public final class zzov extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzov zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzov zzov = new zzov();
        zzb = zzov;
        zzit.zzD(zzov.class, zzov);
    }

    private zzov() {
    }

    public static zzou zzf() {
        return (zzou) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzov zzov, String str) {
        str.getClass();
        zzov.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzov();
        } else {
            if (i11 == 4) {
                return new zzou((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
