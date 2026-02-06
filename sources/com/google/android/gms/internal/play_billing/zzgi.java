package com.google.android.gms.internal.play_billing;

class zzgi extends zzgh {
    protected final byte[] zza;

    zzgi(byte[] bArr) {
        super((zzgj) null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return obj.equals(this);
        }
        zzgi zzgi = (zzgi) obj;
        int zzi = zzi();
        int zzi2 = zzgi.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzgi.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzgi.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgi.zza;
            zzgi.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzgi.zzd());
        }
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i10, int i11, int i12) {
        return zzhp.zzb(i10, this.zza, 0, i12);
    }

    public final zzgk zzf(int i10, int i11) {
        int zzh = zzgk.zzh(0, i11, zzd());
        if (zzh == 0) {
            return zzgk.zzb;
        }
        return new zzgf(this.zza, 0, zzh);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzgc zzgc) {
        ((zzgo) zzgc).zzc(this.zza, 0, zzd());
    }
}
