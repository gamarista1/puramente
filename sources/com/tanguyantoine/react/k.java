package com.tanguyantoine.react;

import androidx.media.i;
import com.facebook.react.bridge.ReactApplicationContext;

public class k extends i {

    /* renamed from: g  reason: collision with root package name */
    private final ReactApplicationContext f59998g;

    /* renamed from: h  reason: collision with root package name */
    private final d f59999h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    k(com.facebook.react.bridge.ReactApplicationContext r1, com.tanguyantoine.react.d r2, boolean r3, int r4, int r5) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0004
            r3 = 2
            goto L_0x0005
        L_0x0004:
            r3 = 0
        L_0x0005:
            r0.<init>(r3, r4, r5)
            r0.f59998g = r1
            r0.f59999h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tanguyantoine.react.k.<init>(com.facebook.react.bridge.ReactApplicationContext, com.tanguyantoine.react.d, boolean, int, int):void");
    }

    public void e(int i10) {
        int b10 = b();
        int max = Math.max(Math.min(a() + (i10 * (b10 / 10)), b10), 0);
        g(max);
        this.f59999h.k(max);
    }

    public void f(int i10) {
        g(i10);
        this.f59999h.k(i10);
    }

    public k h(Boolean bool, Integer num, Integer num2) {
        if (num2 == null) {
            num2 = Integer.valueOf(a());
        } else {
            g(num2.intValue());
        }
        if (bool == null) {
            bool = Boolean.valueOf(i());
        }
        if (num == null) {
            num = Integer.valueOf(b());
        }
        if (bool.booleanValue() == i() && num.intValue() == b()) {
            return this;
        }
        return new k(this.f59998g, this.f59999h, bool.booleanValue(), num.intValue(), num2.intValue());
    }

    public boolean i() {
        if (c() != 0) {
            return true;
        }
        return false;
    }
}
