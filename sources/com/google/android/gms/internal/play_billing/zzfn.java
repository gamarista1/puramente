package com.google.android.gms.internal.play_billing;

public final class zzfn extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzfn zzb;
    private zzho zzd = zzhk.zzs();

    static {
        zzfn zzfn = new zzfn();
        zzb = zzfn;
        zzhk.zzx(zzfn.class, zzfn);
    }

    private zzfn() {
    }

    public static zzfm zza() {
        return (zzfm) zzb.zzm();
    }

    static /* synthetic */ void zzc(zzfn zzfn, Iterable iterable) {
        zzho zzho = zzfn.zzd;
        if (!zzho.zzc()) {
            int size = zzho.size();
            zzfn.zzd = zzho.zzd(size + size);
        }
        zzfv.zzg(iterable, zzfn.zzd);
    }

    /* access modifiers changed from: protected */
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfl.class});
        } else if (i11 == 3) {
            return new zzfn();
        } else {
            if (i11 == 4) {
                return new zzfm((zzfo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
