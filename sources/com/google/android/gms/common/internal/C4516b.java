package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.j;

/* renamed from: com.google.android.gms.common.internal.b  reason: case insensitive filesystem */
public abstract class C4516b {
    public static b a(Status status) {
        if (status.r0()) {
            return new j(status);
        }
        return new b(status);
    }
}
