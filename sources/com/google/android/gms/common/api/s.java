package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class s extends BasePendingResult {
    public s(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public final k createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
