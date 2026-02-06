package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40474i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f40475j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        int[] iArr;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40474i = oVar;
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
        this.f40475j = iArr;
    }

    public String e() {
        int i10 = this.f40448d;
        int[] iArr = this.f40475j;
        String e10 = super.e();
        return "DivisionAnimatedNode[" + i10 + "]: input nodes: " + iArr + " - super: " + e10;
    }

    public void h() {
        int[] iArr = this.f40475j;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            b k10 = this.f40474i.k(iArr[i10]);
            if (k10 == null || !(k10 instanceof w)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f40448d);
            }
            double d10 = ((w) k10).f40562f;
            if (i11 == 0) {
                this.f40562f = d10;
            } else if (d10 != 0.0d) {
                this.f40562f /= d10;
            } else {
                throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f40448d);
            }
            i10++;
            i11 = i12;
        }
    }
}
