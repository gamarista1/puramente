package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.location.H;

abstract class zzx extends H {
    public zzx(f fVar) {
        super(fVar);
    }

    public final /* bridge */ /* synthetic */ k createFailedResult(Status status) {
        return status;
    }
}
