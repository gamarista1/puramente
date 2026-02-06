package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzr extends zzal {
    /* access modifiers changed from: private */
    public final zzv zzk;

    public zzr(zzv zzv) {
        super("internal.logger");
        this.zzk = zzv;
        this.zzb.put("log", new zzu(this, false, true));
        this.zzb.put("silent", new zzq(this, "silent"));
        ((zzal) this.zzb.get("silent")).zza("log", (zzaq) new zzu(this, true, true));
        this.zzb.put("unmonitored", new zzt(this, "unmonitored"));
        ((zzal) this.zzb.get("unmonitored")).zza("log", (zzaq) new zzu(this, false, false));
    }

    public final zzaq zza(zzh zzh, List<zzaq> list) {
        return zzaq.zzc;
    }
}
