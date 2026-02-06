package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.C6496s;

public final class u extends b {

    /* renamed from: f  reason: collision with root package name */
    private final o f40549f;

    /* renamed from: g  reason: collision with root package name */
    private final JavaOnlyMap f40550g;

    /* renamed from: h  reason: collision with root package name */
    private final int f40551h;

    /* renamed from: i  reason: collision with root package name */
    private final int f40552i;

    /* renamed from: j  reason: collision with root package name */
    private final int f40553j;

    public u(ReadableMap readableMap, o oVar) {
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40549f = oVar;
        this.f40550g = JavaOnlyMap.Companion.deepClone(readableMap.getMap("animationConfig"));
        this.f40551h = readableMap.getInt("animationId");
        this.f40552i = readableMap.getInt("toValue");
        this.f40553j = readableMap.getInt("value");
    }

    public String e() {
        int i10 = this.f40448d;
        int i11 = this.f40551h;
        int i12 = this.f40552i;
        int i13 = this.f40553j;
        JavaOnlyMap javaOnlyMap = this.f40550g;
        return "TrackingAnimatedNode[" + i10 + "]: animationID: " + i11 + " toValueNode: " + i12 + " valueNode: " + i13 + " animationConfig: " + javaOnlyMap;
    }

    public void h() {
        w wVar;
        b k10 = this.f40549f.k(this.f40552i);
        if (k10 instanceof w) {
            wVar = (w) k10;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            this.f40550g.putDouble("toValue", wVar.l());
        } else {
            this.f40550g.putNull("toValue");
        }
        this.f40549f.w(this.f40551h, this.f40553j, this.f40550g, (Callback) null);
    }
}
