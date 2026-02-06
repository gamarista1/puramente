package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.share.widget.b;
import e8.C3500a;
import v8.e;

public class FBSendButtonManager extends SimpleViewManager<b> {
    public static final String REACT_CLASS = "RCTFBSendButton";

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(name = "shareContent")
    public void setShareContent(b bVar, ReadableMap readableMap) {
        e e10 = f.e(readableMap);
        if (e10 != null) {
            bVar.setShareContent(e10);
        }
    }

    /* access modifiers changed from: protected */
    public b createViewInstance(C3415h0 h0Var) {
        return new b(h0Var);
    }
}
