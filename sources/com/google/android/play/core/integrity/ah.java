package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C;

final class ah extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f56476a;

    /* renamed from: b  reason: collision with root package name */
    private final u f56477b;

    ah(String str, C c10, PendingIntent pendingIntent) {
        this.f56476a = str;
        this.f56477b = new u(c10, pendingIntent);
    }

    public final String token() {
        return this.f56476a;
    }
}
