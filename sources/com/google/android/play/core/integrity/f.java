package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class f extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private long f56523a;

    /* renamed from: b  reason: collision with root package name */
    private byte f56524b;

    f() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f56524b == 1) {
            return new h(this.f56523a, (g) null);
        }
        throw new IllegalStateException("Missing required properties: cloudProjectNumber");
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f56523a = j10;
        this.f56524b = 1;
        return this;
    }
}
