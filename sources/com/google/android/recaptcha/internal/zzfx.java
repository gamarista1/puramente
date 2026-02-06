package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

class zzfx extends zzfy {
    final zzft zzb;
    final Character zzc;

    zzfx(zzft zzft, Character ch2) {
        this.zzb = zzft;
        if (ch2 == null || !zzft.zzd('=')) {
            this.zzc = ch2;
            return;
        }
        throw new IllegalArgumentException(zzfi.zza("Padding character %s was already in alphabet", ch2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfx) {
            zzfx zzfx = (zzfx) obj;
            if (this.zzb.equals(zzfx.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzfx.zzc;
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
        Character ch2 = this.zzc;
        int hashCode = this.zzb.hashCode();
        if (ch2 == null) {
            i10 = 0;
        } else {
            i10 = ch2.hashCode();
        }
        return i10 ^ hashCode;
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
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzft zzft;
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzft = this.zzb;
                    if (i12 >= zzft.zzc) {
                        break;
                    }
                    j10 <<= zzft.zzb;
                    if (i10 + i12 < zze.length()) {
                        j10 |= (long) this.zzb.zzb(zze.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzft.zzd;
                int i15 = i13 * zzft.zzb;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((int) ((j10 >>> i16) & 255));
                    i16 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzfw("Invalid input length " + zze.length());
    }

    /* access modifiers changed from: package-private */
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzff.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        return (int) (((((long) this.zzb.zzb) * ((long) i10)) + 7) / 8);
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i10) {
        zzft zzft = this.zzb;
        return zzft.zzc * zzga.zza(i10, zzft.zzd, RoundingMode.CEILING);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        boolean z10;
        zzff.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zzb.zzd) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzff.zza(z10);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzft zzft = this.zzb;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzft.zzb) - i12);
            zzft zzft2 = this.zzb;
            appendable.append(zzft2.zza(((int) j11) & zzft2.zza));
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

    zzfx(String str, String str2, Character ch2) {
        this(new zzft(str, str2.toCharArray()), ch2);
    }
}
