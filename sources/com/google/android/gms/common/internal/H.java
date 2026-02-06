package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C4498j;

final class H extends I {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f54118a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C4498j f54119b;

    H(Intent intent, C4498j jVar, int i10) {
        this.f54118a = intent;
        this.f54119b = jVar;
    }

    public final void a() {
        Intent intent = this.f54118a;
        if (intent != null) {
            this.f54119b.startActivityForResult(intent, 2);
        }
    }
}
