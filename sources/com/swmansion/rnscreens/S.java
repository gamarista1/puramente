package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.C6496s;

public final class S extends C3428v {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f59740a;

    public S(ReactContext reactContext) {
        C6496s.h(reactContext, "context");
        this.f59740a = reactContext;
    }

    /* access modifiers changed from: private */
    public static final void h(S s10, C c10) {
        C6496s.h(c10, "nativeViewHierarchyManager");
        View resolveView = c10.resolveView(s10.getReactTag());
        if (resolveView instanceof C4935t) {
            ((C4935t) resolveView).u();
        }
    }

    public void onBeforeLayout(D d10) {
        C6496s.h(d10, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(d10);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f59740a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new Q(this));
        }
    }
}
