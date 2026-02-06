package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C4493e;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.location.C4556m;

final class zzay extends zzan {
    private C4493e zza;

    public zzay(C4493e eVar) {
        boolean z10;
        if (eVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "listener can't be null.");
        this.zza = eVar;
    }

    public final void zzb(C4556m mVar) {
        this.zza.setResult(mVar);
        this.zza = null;
    }
}
