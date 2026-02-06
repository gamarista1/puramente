package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzie {
    static final zzie zza = new zzie(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzie() {
        this.zzd = new HashMap();
    }

    public final zzir zza(zzke zzke, int i10) {
        return (zzir) this.zzd.get(new zzid(zzke, i10));
    }

    zzie(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
