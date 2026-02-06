package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.e;

public final class Q extends E {

    /* renamed from: c  reason: collision with root package name */
    private final e f53983c;

    public Q(e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f53983c = eVar;
    }

    public final C4492d a(C4492d dVar) {
        return this.f53983c.doRead(dVar);
    }

    public final C4492d b(C4492d dVar) {
        return this.f53983c.doWrite(dVar);
    }

    public final Context e() {
        return this.f53983c.getApplicationContext();
    }

    public final Looper f() {
        return this.f53983c.getLooper();
    }
}
