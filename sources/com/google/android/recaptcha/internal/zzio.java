package com.google.android.recaptcha.internal;

public class zzio extends zzin implements zzkf {
    protected zzio(zzip zzip) {
        super(zzip);
    }

    /* renamed from: zzd */
    public final zzip zzk() {
        if (!((zzip) this.zza).zzG()) {
            return (zzip) this.zza;
        }
        ((zzip) this.zza).zzb.zzg();
        return (zzip) super.zzk();
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        super.zzn();
        if (((zzip) this.zza).zzb != zzij.zzd()) {
            zzip zzip = (zzip) this.zza;
            zzip.zzb = zzip.zzb.clone();
        }
    }
}
