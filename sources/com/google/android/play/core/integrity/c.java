package com.google.android.play.core.integrity;

import android.net.Network;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

final class c extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f56519a;

    /* renamed from: b  reason: collision with root package name */
    private Long f56520b;

    c() {
    }

    public final IntegrityTokenRequest build() {
        String str = this.f56519a;
        if (str != null) {
            return new e(str, this.f56520b, (Network) null, (d) null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f56520b = Long.valueOf(j10);
        return this;
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f56519a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
