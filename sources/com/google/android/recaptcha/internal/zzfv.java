package com.google.android.recaptcha.internal;

final class zzfv extends zzfx {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfv(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzft r0 = new com.google.android.recaptcha.internal.zzft
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.recaptcha.internal.zzff.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfv.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                int i12 = i11 + 1;
                int zzb = (this.zzb.zzb(zze.charAt(i10)) << 18) | (this.zzb.zzb(zze.charAt(i10 + 1)) << 12);
                bArr[i11] = (byte) (zzb >>> 16);
                int i13 = i10 + 2;
                if (i13 < zze.length()) {
                    int i14 = i10 + 3;
                    int zzb2 = zzb | (this.zzb.zzb(zze.charAt(i13)) << 6);
                    int i15 = i11 + 2;
                    bArr[i12] = (byte) ((zzb2 >>> 8) & 255);
                    if (i14 < zze.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((zzb2 | this.zzb.zzb(zze.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i10 = i13;
                    i11 = i12;
                }
            }
            return i11;
        }
        throw new zzfw("Invalid input length " + zze.length());
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzff.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            byte b10 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.zzb.zza(b10 >>> 18));
            appendable.append(this.zzb.zza((b10 >>> 12) & 63));
            appendable.append(this.zzb.zza((b10 >>> 6) & 63));
            appendable.append(this.zzb.zza(b10 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
