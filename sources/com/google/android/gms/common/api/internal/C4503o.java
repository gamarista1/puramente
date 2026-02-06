package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.o  reason: case insensitive filesystem */
public final class C4503o extends g {

    /* renamed from: a  reason: collision with root package name */
    private final BasePendingResult f54061a;

    public C4503o(h hVar) {
        this.f54061a = (BasePendingResult) hVar;
    }

    public final void addStatusListener(h.a aVar) {
        this.f54061a.addStatusListener(aVar);
    }

    public final k await(long j10, TimeUnit timeUnit) {
        return this.f54061a.await(j10, timeUnit);
    }
}
