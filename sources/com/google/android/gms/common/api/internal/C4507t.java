package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4496h;

/* renamed from: com.google.android.gms.common.api.internal.t  reason: case insensitive filesystem */
public class C4507t extends C4496h.a {

    /* renamed from: a  reason: collision with root package name */
    private final C4493e f54070a;

    public C4507t(C4493e eVar) {
        this.f54070a = eVar;
    }

    public void onResult(Status status) {
        this.f54070a.setResult(status);
    }
}
