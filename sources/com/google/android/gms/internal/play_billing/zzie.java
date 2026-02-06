package com.google.android.gms.internal.play_billing;

final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zza2 = zzhf.zza();
        int i10 = zziu.zza;
        zzid zzid = new zzid(zza2, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzid;
    }

    public final zzix zza(Class cls) {
        zzgx zzgx;
        int i10 = zziz.zza;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i11 = zziu.zza;
        }
        zzij zzb2 = this.zzb.zzb(cls);
        if (!zzb2.zzb()) {
            int i12 = zziu.zza;
            zzir zza2 = zzis.zza();
            zzhz zza3 = zzia.zza();
            zzjj zzm = zziz.zzm();
            if (zzb2.zzc() - 1 != 1) {
                zzgx = zzgz.zza();
            } else {
                zzgx = null;
            }
            return zzip.zzl(cls, zzb2, zza2, zza3, zzm, zzgx, zzii.zza());
        }
        int i13 = zziu.zza;
        return zziq.zzc(zziz.zzm(), zzgz.zza(), zzb2.zza());
    }
}
