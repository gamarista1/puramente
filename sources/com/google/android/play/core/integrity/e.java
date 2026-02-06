package com.google.android.play.core.integrity;

import android.net.Network;

final class e extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f56521a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f56522b;

    /* synthetic */ e(String str, Long l10, Network network, d dVar) {
        this.f56521a = str;
        this.f56522b = l10;
    }

    public final Network a() {
        return null;
    }

    public final Long cloudProjectNumber() {
        return this.f56522b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f56521a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f56522b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f56521a.hashCode() ^ 1000003;
        Long l10 = this.f56522b;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return ((hashCode * 1000003) ^ i10) * 1000003;
    }

    public final String nonce() {
        return this.f56521a;
    }

    public final String toString() {
        String str = this.f56521a;
        Long l10 = this.f56522b;
        return "IntegrityTokenRequest{nonce=" + str + ", cloudProjectNumber=" + l10 + ", network=null}";
    }
}
