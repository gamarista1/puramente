package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class r extends BasePendingResult {

    /* renamed from: a  reason: collision with root package name */
    private final k f54099a;

    public r(f fVar, k kVar) {
        super(fVar);
        this.f54099a = kVar;
    }

    /* access modifiers changed from: protected */
    public final k createFailedResult(Status status) {
        return this.f54099a;
    }
}
