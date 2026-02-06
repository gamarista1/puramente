package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class h extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final long f56525a;

    /* synthetic */ h(long j10, g gVar) {
        this.f56525a = j10;
    }

    public final long a() {
        return this.f56525a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) || this.f56525a != ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj).a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f56525a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        long j10 = this.f56525a;
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + j10 + "}";
    }
}
