package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;

/* renamed from: com.google.android.gms.common.api.internal.v  reason: case insensitive filesystem */
public class C4509v extends BasePendingResult {
    public C4509v(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ k createFailedResult(Status status) {
        return status;
    }
}
