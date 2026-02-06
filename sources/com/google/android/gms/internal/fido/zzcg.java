package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    zzcg(zzcd zzcd, Character ch2) {
        this.zzb = zzcd;
        if (ch2 == null || !zzcd.zzc('=')) {
            this.zzc = ch2;
            return;
        }
        throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcg = (zzcg) obj;
            if (this.zzb.equals(zzcg.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzcg.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 == null || !ch2.equals(ch3)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        if (ch2 == null) {
            i10 = 0;
        } else {
            i10 = ch2.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public zzch zza(zzcd zzcd, Character ch2) {
        return new zzcg(zzcd, ch2);
    }

    /* access modifiers changed from: package-private */
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzap.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zze(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        zzcd zzcd = this.zzb;
        return zzcd.zzc * zzcj.zza(i10, zzcd.zzd, RoundingMode.CEILING);
    }

    public final zzch zzd() {
        zzch zzch = this.zza;
        if (zzch == null) {
            zzcd zzb2 = this.zzb.zzb();
            if (zzb2 == this.zzb) {
                zzch = this;
            } else {
                zzch = zza(zzb2, this.zzc);
            }
            this.zza = zzch;
        }
        return zzch;
    }

    /* access modifiers changed from: package-private */
    public final void zze(Appendable appendable, byte[] bArr, int i10, int i11) {
        boolean z10;
        zzap.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zzb.zzd) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzap.zzc(z10);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzcd zzcd = this.zzb;
            appendable.append(zzcd.zza(zzcd.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    zzcg(String str, String str2, Character ch2) {
        this(new zzcd(str, str2.toCharArray()), ch2);
    }
}
