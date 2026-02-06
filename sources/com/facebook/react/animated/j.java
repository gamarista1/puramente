package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final a f40476l = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private long f40477e = -1;

    /* renamed from: f  reason: collision with root package name */
    private double[] f40478f = new double[0];

    /* renamed from: g  reason: collision with root package name */
    private double f40479g;

    /* renamed from: h  reason: collision with root package name */
    private double f40480h;

    /* renamed from: i  reason: collision with root package name */
    private int f40481i = 1;

    /* renamed from: j  reason: collision with root package name */
    private int f40482j = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f40483k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReadableMap readableMap) {
        C6496s.h(readableMap, "config");
        a(readableMap);
    }

    public void a(ReadableMap readableMap) {
        double d10;
        int i10;
        int size;
        C6496s.h(readableMap, "config");
        ReadableArray array = readableMap.getArray("frames");
        boolean z10 = false;
        if (!(array == null || this.f40478f.length == (size = array.size()))) {
            double[] dArr = new double[size];
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = array.getDouble(i11);
            }
            this.f40478f = dArr;
        }
        if (!readableMap.hasKey("toValue") || readableMap.getType("toValue") != ReadableType.Number) {
            d10 = 0.0d;
        } else {
            d10 = readableMap.getDouble("toValue");
        }
        this.f40479g = d10;
        if (!readableMap.hasKey("iterations") || readableMap.getType("iterations") != ReadableType.Number) {
            i10 = 1;
        } else {
            i10 = readableMap.getInt("iterations");
        }
        this.f40481i = i10;
        this.f40482j = 1;
        if (i10 == 0) {
            z10 = true;
        }
        this.f40449a = z10;
        this.f40477e = -1;
    }

    public void b(long j10) {
        double d10;
        w wVar = this.f40450b;
        if (wVar != null) {
            if (this.f40477e < 0) {
                this.f40477e = j10;
                if (this.f40482j == 1) {
                    this.f40480h = wVar.f40562f;
                }
            }
            int round = (int) Math.round(((double) ((j10 - this.f40477e) / ((long) UtilsKt.MICROS_MULTIPLIER))) / 16.666666666666668d);
            if (round < 0) {
                String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j10 + " and mStartFrameTimeNanos " + this.f40477e;
                if (E7.a.f30669b) {
                    throw new IllegalStateException(str.toString());
                } else if (this.f40483k < 100) {
                    U5.a.I("ReactNative", str);
                    this.f40483k++;
                }
            } else if (!this.f40449a) {
                double[] dArr = this.f40478f;
                if (round >= dArr.length - 1) {
                    int i10 = this.f40481i;
                    if (i10 == -1 || this.f40482j < i10) {
                        double d11 = this.f40480h;
                        d10 = d11 + (dArr[dArr.length - 1] * (this.f40479g - d11));
                        this.f40477e = -1;
                        this.f40482j++;
                    } else {
                        d10 = this.f40479g;
                        this.f40449a = true;
                    }
                } else {
                    double d12 = this.f40480h;
                    d10 = d12 + (dArr[round] * (this.f40479g - d12));
                }
                wVar.f40562f = d10;
            }
        } else {
            throw new IllegalArgumentException("Animated value should not be null");
        }
    }
}
