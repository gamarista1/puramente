package com.google.android.gms.internal.play_billing;

final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    zzt(zzu zzu) {
        this.zzg = zzu;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzr zzr = (zzr) this.zzg.zza.get();
        if (zzr == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        String valueOf = String.valueOf(zzr.zza);
        return "tag=[" + valueOf + "]";
    }
}
