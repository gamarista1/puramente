package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* renamed from: com.google.android.gms.common.api.internal.z  reason: case insensitive filesystem */
final class C4513z implements h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f54092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ B f54093b;

    C4513z(B b10, BasePendingResult basePendingResult) {
        this.f54093b = b10;
        this.f54092a = basePendingResult;
    }

    public final void a(Status status) {
        this.f54093b.f53946a.remove(this.f54092a);
    }
}
