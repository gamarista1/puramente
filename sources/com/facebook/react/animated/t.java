package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class t extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40547i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f40548j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        int[] iArr;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40547i = oVar;
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
        this.f40548j = iArr;
    }

    public String e() {
        int i10 = this.f40448d;
        int[] iArr = this.f40548j;
        String e10 = super.e();
        return "SubtractionAnimatedNode[" + i10 + "]: input nodes: " + iArr + " - super: " + e10;
    }

    public void h() {
        int length = this.f40548j.length;
        for (int i10 = 0; i10 < length; i10++) {
            b k10 = this.f40547i.k(this.f40548j[i10]);
            if (k10 == null || !(k10 instanceof w)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
            }
            double l10 = ((w) k10).l();
            if (i10 == 0) {
                this.f40562f = l10;
            } else {
                this.f40562f -= l10;
            }
        }
    }
}
