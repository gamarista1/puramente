package com.facebook;

import android.os.Handler;
import kotlin.jvm.internal.C6496s;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39444a;

    /* renamed from: b  reason: collision with root package name */
    private final M f39445b;

    /* renamed from: c  reason: collision with root package name */
    private final long f39446c = I.A();

    /* renamed from: d  reason: collision with root package name */
    private long f39447d;

    /* renamed from: e  reason: collision with root package name */
    private long f39448e;

    /* renamed from: f  reason: collision with root package name */
    private long f39449f;

    public d0(Handler handler, M m10) {
        C6496s.h(m10, "request");
        this.f39444a = handler;
        this.f39445b = m10;
    }

    public final void a(long j10) {
        long j11 = this.f39447d + j10;
        this.f39447d = j11;
        if (j11 >= this.f39448e + this.f39446c || j11 >= this.f39449f) {
            c();
        }
    }

    public final void b(long j10) {
        this.f39449f += j10;
    }

    public final void c() {
        if (this.f39447d > this.f39448e) {
            this.f39445b.o();
        }
    }
}
