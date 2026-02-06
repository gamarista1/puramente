package com.facebook.react.animated;

import com.amazon.device.iap.internal.c.b;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class w extends b {

    /* renamed from: f  reason: collision with root package name */
    public double f40562f;

    /* renamed from: g  reason: collision with root package name */
    public double f40563g;

    /* renamed from: h  reason: collision with root package name */
    private c f40564h;

    public w(ReadableMap readableMap) {
        this.f40562f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f40563g = readableMap != null ? readableMap.getDouble(b.as) : 0.0d;
    }

    public String e() {
        int i10 = this.f40448d;
        double d10 = this.f40562f;
        double d11 = this.f40563g;
        return "ValueAnimatedNode[" + i10 + "]: value: " + d10 + " offset: " + d11;
    }

    public final void i() {
        this.f40563g += this.f40562f;
        this.f40562f = 0.0d;
    }

    public final void j() {
        this.f40562f += this.f40563g;
        this.f40563g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f40563g + this.f40562f)) {
            h();
        }
        return this.f40563g + this.f40562f;
    }

    public final void m() {
        c cVar = this.f40564h;
        if (cVar != null) {
            cVar.a(l());
        }
    }

    public final void n(c cVar) {
        this.f40564h = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }
}
