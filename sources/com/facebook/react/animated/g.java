package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.C6496s;

public final class g extends e {

    /* renamed from: e  reason: collision with root package name */
    private double f40462e;

    /* renamed from: f  reason: collision with root package name */
    private double f40463f;

    /* renamed from: g  reason: collision with root package name */
    private long f40464g = -1;

    /* renamed from: h  reason: collision with root package name */
    private double f40465h;

    /* renamed from: i  reason: collision with root package name */
    private double f40466i;

    /* renamed from: j  reason: collision with root package name */
    private int f40467j = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f40468k = 1;

    public g(ReadableMap readableMap) {
        C6496s.h(readableMap, "config");
        a(readableMap);
    }

    public void a(ReadableMap readableMap) {
        int i10;
        C6496s.h(readableMap, "config");
        this.f40462e = readableMap.getDouble("velocity");
        this.f40463f = readableMap.getDouble("deceleration");
        this.f40464g = -1;
        this.f40465h = 0.0d;
        this.f40466i = 0.0d;
        boolean z10 = true;
        if (readableMap.hasKey("iterations")) {
            i10 = readableMap.getInt("iterations");
        } else {
            i10 = 1;
        }
        this.f40467j = i10;
        this.f40468k = 1;
        if (i10 != 0) {
            z10 = false;
        }
        this.f40449a = z10;
    }

    public void b(long j10) {
        w wVar = this.f40450b;
        if (wVar != null) {
            long j11 = j10 / ((long) UtilsKt.MICROS_MULTIPLIER);
            if (this.f40464g == -1) {
                this.f40464g = j11 - ((long) 16);
                double d10 = this.f40465h;
                if (d10 == this.f40466i) {
                    this.f40465h = wVar.f40562f;
                } else {
                    wVar.f40562f = d10;
                }
                this.f40466i = wVar.f40562f;
            }
            double d11 = this.f40465h;
            double d12 = this.f40462e;
            double d13 = (double) 1;
            double d14 = this.f40463f;
            double exp = d11 + ((d12 / (d13 - d14)) * (d13 - Math.exp((-(d13 - d14)) * ((double) (j11 - this.f40464g)))));
            if (Math.abs(this.f40466i - exp) < 0.1d) {
                int i10 = this.f40467j;
                if (i10 == -1 || this.f40468k < i10) {
                    this.f40464g = -1;
                    this.f40468k++;
                } else {
                    this.f40449a = true;
                    return;
                }
            }
            this.f40466i = exp;
            wVar.f40562f = exp;
            return;
        }
        throw new IllegalArgumentException("Animated value should not be null");
    }
}
