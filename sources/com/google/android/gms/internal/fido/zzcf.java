package com.google.android.gms.internal.fido;

final class zzcf extends zzcg {
    private zzcf(zzcd zzcd, Character ch2) {
        super(zzcd, ch2);
        zzap.zzc(zzcd.zzf.length == 64);
    }

    /* access modifiers changed from: package-private */
    public final zzch zza(zzcd zzcd, Character ch2) {
        return new zzcf(zzcd, ch2);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzap.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            byte b10 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.zzb.zza(b10 >>> 18));
            appendable.append(this.zzb.zza((b10 >>> 12) & 63));
            appendable.append(this.zzb.zza((b10 >>> 6) & 63));
            appendable.append(this.zzb.zza(b10 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    zzcf(String str, String str2, Character ch2) {
        this(new zzcd(str, str2.toCharArray()), ch2);
    }
}
