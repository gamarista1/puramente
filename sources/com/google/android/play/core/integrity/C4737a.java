package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C;

/* renamed from: com.google.android.play.core.integrity.a  reason: case insensitive filesystem */
final class C4737a extends ag {

    /* renamed from: a  reason: collision with root package name */
    private String f56458a;

    /* renamed from: b  reason: collision with root package name */
    private C f56459b;

    /* renamed from: c  reason: collision with root package name */
    private PendingIntent f56460c;

    C4737a() {
    }

    /* access modifiers changed from: package-private */
    public final ag a(PendingIntent pendingIntent) {
        this.f56460c = pendingIntent;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ag b(C c10) {
        if (c10 != null) {
            this.f56459b = c10;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    /* access modifiers changed from: package-private */
    public final ag c(String str) {
        this.f56458a = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ah d() {
        C c10;
        String str = this.f56458a;
        if (str != null && (c10 = this.f56459b) != null) {
            return new ah(str, c10, this.f56460c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f56458a == null) {
            sb2.append(" token");
        }
        if (this.f56459b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
