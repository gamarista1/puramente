package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40503i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f40504j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        int[] iArr;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40503i = oVar;
        ReadableArray array = readableMap.getArray(MetricTracker.Object.INPUT);
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr2[i10] = array.getInt(i10);
            }
            iArr = iArr2;
        }
        this.f40504j = iArr;
    }

    public String e() {
        int i10 = this.f40448d;
        int[] iArr = this.f40504j;
        String e10 = super.e();
        return "MultiplicationAnimatedNode[" + i10 + "]: input nodes: " + iArr + " - super: " + e10;
    }

    public void h() {
        this.f40562f = 1.0d;
        for (int k10 : this.f40504j) {
            b k11 = this.f40503i.k(k10);
            if (k11 == null || !(k11 instanceof w)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
            }
            this.f40562f *= ((w) k11).l();
        }
    }
}
