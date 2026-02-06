package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.C;

final class bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a  reason: collision with root package name */
    private final String f56512a;

    /* renamed from: b  reason: collision with root package name */
    private final u f56513b;

    bb(String str, C c10, PendingIntent pendingIntent) {
        this.f56512a = str;
        this.f56513b = new u(c10, pendingIntent);
    }

    public final String token() {
        return this.f56512a;
    }
}
