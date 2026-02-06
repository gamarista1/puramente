package com.google.android.gms.internal.measurement;

class zzij extends zzih {
    protected final byte[] zzb;

    zzij(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzia) || zzb() != ((zzia) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzij)) {
            return obj.equals(this);
        }
        zzij zzij = (zzij) obj;
        int zza = zza();
        int zza2 = zzij.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzij, 0, zzb());
        }
        return false;
    }

    public byte zza(int i10) {
        return this.zzb[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public final zzia zza(int i10, int i11) {
        int zza = zzia.zza(0, i11, zzb());
        if (zza == 0) {
            return zzia.zza;
        }
        return new zzie(this.zzb, zzc(), zza);
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i10, int i11, int i12) {
        return zzjm.zza(i10, this.zzb, zzc(), i12);
    }

    public int zzb() {
        return this.zzb.length;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzhx zzhx) {
        zzhx.zza(this.zzb, zzc(), zzb());
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzia zzia, int i10, int i11) {
        if (i11 > zzia.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i11 + zzb2);
        } else if (i11 > zzia.zzb()) {
            int zzb3 = zzia.zzb();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + zzb3);
        } else if (!(zzia instanceof zzij)) {
            return zzia.zza(0, i11).equals(zza(0, i11));
        } else {
            zzij zzij = (zzij) zzia;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzij.zzb;
            int zzc = zzc() + i11;
            int zzc2 = zzc();
            int zzc3 = zzij.zzc();
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        }
    }
}
