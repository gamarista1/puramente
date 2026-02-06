package com.facebook;

import com.facebook.Q;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class b0 extends FilterOutputStream implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Q f39430a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f39431b;

    /* renamed from: c  reason: collision with root package name */
    private final long f39432c;

    /* renamed from: d  reason: collision with root package name */
    private final long f39433d = I.A();

    /* renamed from: e  reason: collision with root package name */
    private long f39434e;

    /* renamed from: f  reason: collision with root package name */
    private long f39435f;

    /* renamed from: g  reason: collision with root package name */
    private d0 f39436g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(OutputStream outputStream, Q q10, Map map, long j10) {
        super(outputStream);
        C6496s.h(outputStream, "out");
        C6496s.h(q10, "requests");
        C6496s.h(map, "progressMap");
        this.f39430a = q10;
        this.f39431b = map;
        this.f39432c = j10;
    }

    private final void b(long j10) {
        d0 d0Var = this.f39436g;
        if (d0Var != null) {
            d0Var.a(j10);
        }
        long j11 = this.f39434e + j10;
        this.f39434e = j11;
        if (j11 >= this.f39435f + this.f39433d || j11 >= this.f39432c) {
            f();
        }
    }

    private final void f() {
        if (this.f39434e > this.f39435f) {
            for (Q.a aVar : this.f39430a.x()) {
            }
            this.f39435f = this.f39434e;
        }
    }

    public void a(M m10) {
        d0 d0Var;
        if (m10 != null) {
            d0Var = (d0) this.f39431b.get(m10);
        } else {
            d0Var = null;
        }
        this.f39436g = d0Var;
    }

    public void close() {
        super.close();
        for (d0 c10 : this.f39431b.values()) {
            c10.c();
        }
        f();
    }

    public void write(byte[] bArr) {
        C6496s.h(bArr, "buffer");
        this.out.write(bArr);
        b((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "buffer");
        this.out.write(bArr, i10, i11);
        b((long) i11);
    }

    public void write(int i10) {
        this.out.write(i10);
        b(1);
    }
}
