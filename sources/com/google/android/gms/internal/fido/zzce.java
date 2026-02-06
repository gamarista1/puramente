package com.google.android.gms.internal.fido;

final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcd) {
        super(zzcd, (Character) null);
        this.zza = new char[512];
        zzap.zzc(zzcd.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzcd.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzcd.zza(i10 & 15);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzch zza(zzcd zzcd, Character ch2) {
        return new zzce(zzcd);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzap.zze(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            byte b10 = bArr[i12] & 255;
            appendable.append(this.zza[b10]);
            appendable.append(this.zza[b10 | 256]);
        }
    }

    zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
