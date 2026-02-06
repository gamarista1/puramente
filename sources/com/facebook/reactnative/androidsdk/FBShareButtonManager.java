package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.share.widget.c;
import e8.C3500a;
import v8.e;

public class FBShareButtonManager extends SimpleViewManager<c> {
    public static final String REACT_CLASS = "RCTFBShareButton";

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(name = "shareContent")
    public void setShareContent(c cVar, ReadableMap readableMap) {
        e e10 = f.e(readableMap);
        if (e10 != null) {
            cVar.setShareContent(e10);
        }
    }

    /* access modifiers changed from: protected */
    public c createViewInstance(C3415h0 h0Var) {
        return new c(h0Var);
    }
}
