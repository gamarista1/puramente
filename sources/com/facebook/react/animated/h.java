package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40469i;

    /* renamed from: j  reason: collision with root package name */
    private final int f40470j;

    /* renamed from: k  reason: collision with root package name */
    private final double f40471k;

    /* renamed from: l  reason: collision with root package name */
    private final double f40472l;

    /* renamed from: m  reason: collision with root package name */
    private double f40473m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40469i = oVar;
        this.f40470j = readableMap.getInt(MetricTracker.Object.INPUT);
        this.f40471k = readableMap.getDouble("min");
        this.f40472l = readableMap.getDouble("max");
        this.f40562f = this.f40473m;
    }

    private final double o() {
        b k10 = this.f40469i.k(this.f40470j);
        if (k10 != null && (k10 instanceof w)) {
            return ((w) k10).l();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    public String e() {
        int i10 = this.f40448d;
        int i11 = this.f40470j;
        double d10 = this.f40471k;
        double d11 = this.f40472l;
        double d12 = this.f40473m;
        String e10 = super.e();
        return "DiffClampAnimatedNode[" + i10 + "]: InputNodeTag: " + i11 + " min: " + d10 + " max: " + d11 + " lastValue: " + d12 + " super: " + e10;
    }

    public void h() {
        double o10 = o();
        double d10 = o10 - this.f40473m;
        this.f40473m = o10;
        this.f40562f = Math.min(Math.max(this.f40562f + d10, this.f40471k), this.f40472l);
    }
}
