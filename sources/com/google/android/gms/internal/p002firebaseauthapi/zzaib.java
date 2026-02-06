package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaib  reason: invalid package */
class zzaib extends zzahz {
    protected final byte[] zzb;

    zzaib(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaho) || zzb() != ((zzaho) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzaib)) {
            return obj.equals(this);
        }
        zzaib zzaib = (zzaib) obj;
        int zza = zza();
        int zza2 = zzaib.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzaib, 0, zzb());
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

    public final zzaic zzc() {
        return zzaic.zza(this.zzb, zzg(), zzb(), true);
    }

    public final boolean zze() {
        int zzg = zzg();
        return zzamn.zzc(this.zzb, zzg, zzb() + zzg);
    }

    /* access modifiers changed from: protected */
    public int zzg() {
        return 0;
    }

    public final zzaho zza(int i10, int i11) {
        int zza = zzaho.zza(0, i11, zzb());
        if (zza == 0) {
            return zzaho.zza;
        }
        return new zzahs(this.zzb, zzg(), zza);
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i10, int i11, int i12) {
        return zzajh.zza(i10, this.zzb, zzg(), i12);
    }

    public int zzb() {
        return this.zzb.length;
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzb, zzg(), zzb(), charset);
    }

    /* access modifiers changed from: protected */
    public void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzahp zzahp) {
        zzahp.zza(this.zzb, zzg(), zzb());
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzaho zzaho, int i10, int i11) {
        if (i11 > zzaho.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i11 + zzb2);
        } else if (i11 > zzaho.zzb()) {
            int zzb3 = zzaho.zzb();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + zzb3);
        } else if (!(zzaho instanceof zzaib)) {
            return zzaho.zza(0, i11).equals(zza(0, i11));
        } else {
            zzaib zzaib = (zzaib) zzaho;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzaib.zzb;
            int zzg = zzg() + i11;
            int zzg2 = zzg();
            int zzg3 = zzaib.zzg();
            while (zzg2 < zzg) {
                if (bArr[zzg2] != bArr2[zzg3]) {
                    return false;
                }
                zzg2++;
                zzg3++;
            }
            return true;
        }
    }
}
