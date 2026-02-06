package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class k extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f56527a;

    /* synthetic */ k(String str, j jVar) {
        this.f56527a = str;
    }

    public final String a() {
        return this.f56527a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f56527a;
        if (str != null) {
            return str.equals(standardIntegrityTokenRequest.a());
        }
        if (standardIntegrityTokenRequest.a() != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        String str = this.f56527a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return i10 ^ 1000003;
    }

    public final String toString() {
        String str = this.f56527a;
        return "StandardIntegrityTokenRequest{requestHash=" + str + "}";
    }
}
