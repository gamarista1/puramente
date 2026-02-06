package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;

/* renamed from: com.facebook.react.uimanager.b0  reason: case insensitive filesystem */
public class C3403b0 extends m0 {
    public C3403b0(ReactApplicationContext reactApplicationContext, B0 b02, EventDispatcher eventDispatcher, int i10) {
        super(reactApplicationContext, b02, new s0(reactApplicationContext, new ReanimatedNativeHierarchyManager(b02, reactApplicationContext), i10), eventDispatcher);
    }

    public void u(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}
