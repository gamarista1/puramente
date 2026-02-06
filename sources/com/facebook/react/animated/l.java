package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40500i;

    /* renamed from: j  reason: collision with root package name */
    private final int f40501j;

    /* renamed from: k  reason: collision with root package name */
    private final double f40502k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40500i = oVar;
        this.f40501j = readableMap.getInt(MetricTracker.Object.INPUT);
        this.f40502k = readableMap.getDouble("modulus");
    }

    public String e() {
        int i10 = this.f40448d;
        int i11 = this.f40501j;
        double d10 = this.f40502k;
        String e10 = super.e();
        return "NativeAnimatedNodesManager[" + i10 + "] inputNode: " + i11 + " modulus: " + d10 + " super: " + e10;
    }

    public void h() {
        b k10 = this.f40500i.k(this.f40501j);
        if (k10 instanceof w) {
            double l10 = ((w) k10).l();
            double d10 = this.f40502k;
            this.f40562f = ((l10 % d10) + d10) % d10;
            return;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
    }
}
