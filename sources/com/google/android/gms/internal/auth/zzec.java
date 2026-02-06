package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

class zzec extends zzeb {
    protected final byte[] zza;

    zzec(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzef) || zzd() != ((zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzec)) {
            return obj.equals(this);
        }
        zzec zzec = (zzec) obj;
        int zzj = zzj();
        int zzj2 = zzec.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzec.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzec.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzec.zza;
            zzec.zzc();
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
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzec.zzd());
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
        return zzfa.zzb(i10, this.zza, 0, i12);
    }

    public final zzef zzf(int i10, int i11) {
        int zzi = zzef.zzi(0, i11, zzd());
        if (zzi == 0) {
            return zzef.zzb;
        }
        return new zzdz(this.zza, 0, zzi);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final boolean zzh() {
        return zzhn.zzc(this.zza, 0, zzd());
    }
}
