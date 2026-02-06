package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Locale;

public class StandardIntegrityException extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f56457a;

    StandardIntegrityException(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", new Object[]{Integer.valueOf(i10), com.google.android.play.core.integrity.model.b.a(i10)})));
        if (i10 != 0) {
            this.f56457a = th2;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    public final synchronized Throwable getCause() {
        return this.f56457a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
