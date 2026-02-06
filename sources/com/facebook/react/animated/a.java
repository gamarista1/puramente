package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import yf.C6798l;

public final class a extends w {

    /* renamed from: i  reason: collision with root package name */
    private final o f40442i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f40443j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ReadableMap readableMap, o oVar) {
        super((ReadableMap) null, 1, (DefaultConstructorMarker) null);
        int[] iArr;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40442i = oVar;
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
        this.f40443j = iArr;
    }

    public String e() {
        int i10 = this.f40448d;
        String K02 = C6559l.K0(this.f40443j, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null);
        String e10 = super.e();
        return "AdditionAnimatedNode[" + i10 + "]: input nodes: " + K02 + " - super: " + e10;
    }

    public void h() {
        this.f40562f = 0.0d;
        int[] iArr = this.f40443j;
        int length = iArr.length;
        int i10 = 0;
        double d10 = 0.0d;
        while (i10 < length) {
            b k10 = this.f40442i.k(iArr[i10]);
            if (k10 instanceof w) {
                d10 += ((w) k10).l();
                i10++;
            } else {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
            }
        }
        this.f40562f = 0.0d + d10;
    }
}
