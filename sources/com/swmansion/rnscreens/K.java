package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReadableArray;
import yf.C6798l;

public final /* synthetic */ class K implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReadableArray f59717a;

    public /* synthetic */ K(ReadableArray readableArray) {
        this.f59717a = readableArray;
    }

    public final Object invoke(Object obj) {
        return Double.valueOf(ScreenViewManager.setSheetAllowedDetents$lambda$0(this.f59717a, ((Integer) obj).intValue()));
    }
}
