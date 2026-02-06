package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class a0 extends OutputStream implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39419a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f39420b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private M f39421c;

    /* renamed from: d  reason: collision with root package name */
    private d0 f39422d;

    /* renamed from: e  reason: collision with root package name */
    private int f39423e;

    public a0(Handler handler) {
        this.f39419a = handler;
    }

    public void a(M m10) {
        d0 d0Var;
        this.f39421c = m10;
        if (m10 != null) {
            d0Var = (d0) this.f39420b.get(m10);
        } else {
            d0Var = null;
        }
        this.f39422d = d0Var;
    }

    public final void b(long j10) {
        M m10 = this.f39421c;
        if (m10 != null) {
            if (this.f39422d == null) {
                d0 d0Var = new d0(this.f39419a, m10);
                this.f39422d = d0Var;
                this.f39420b.put(m10, d0Var);
            }
            d0 d0Var2 = this.f39422d;
            if (d0Var2 != null) {
                d0Var2.b(j10);
            }
            this.f39423e += (int) j10;
        }
    }

    public final int f() {
        return this.f39423e;
    }

    public final Map n() {
        return this.f39420b;
    }

    public void write(byte[] bArr) {
        C6496s.h(bArr, "buffer");
        b((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "buffer");
        b((long) i11);
    }

    public void write(int i10) {
        b(1);
    }
}
