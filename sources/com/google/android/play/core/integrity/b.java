package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C;

final class b extends ba {

    /* renamed from: a  reason: collision with root package name */
    private String f56509a;

    /* renamed from: b  reason: collision with root package name */
    private C f56510b;

    /* renamed from: c  reason: collision with root package name */
    private PendingIntent f56511c;

    b() {
    }

    /* access modifiers changed from: package-private */
    public final ba a(PendingIntent pendingIntent) {
        this.f56511c = pendingIntent;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ba b(C c10) {
        if (c10 != null) {
            this.f56510b = c10;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    /* access modifiers changed from: package-private */
    public final ba c(String str) {
        if (str != null) {
            this.f56509a = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    /* access modifiers changed from: package-private */
    public final bb d() {
        C c10;
        String str = this.f56509a;
        if (str != null && (c10 = this.f56510b) != null) {
            return new bb(str, c10, this.f56511c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f56509a == null) {
            sb2.append(" token");
        }
        if (this.f56510b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
