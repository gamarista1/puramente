package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import e8.C3500a;
import java.util.List;
import java.util.Locale;
import y7.C4199e;
import y7.C4213t;

public class FBLoginButtonManager extends SimpleViewManager<c> {
    public static final String REACT_CLASS = "RCTFBLoginButton";
    private final a mActivityEventListener;

    public FBLoginButtonManager(ReactApplicationContext reactApplicationContext) {
        a aVar = new a();
        this.mActivityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(name = "defaultAudience")
    public void setDefaultAudience(c cVar, String str) {
        C4199e eVar = C4199e.FRIENDS;
        if (str != null) {
            eVar = C4199e.valueOf(str.toUpperCase(Locale.ROOT));
        }
        cVar.setDefaultAudience(eVar);
    }

    @C3500a(name = "loginBehaviorAndroid")
    public void setLoginBehavior(c cVar, String str) {
        C4213t tVar = C4213t.NATIVE_WITH_FALLBACK;
        if (str != null) {
            tVar = C4213t.valueOf(str.toUpperCase(Locale.ROOT));
        }
        cVar.setLoginBehavior(tVar);
    }

    @C3500a(name = "permissions")
    public void setPermissions(c cVar, ReadableArray readableArray) {
        cVar.setPermissions((List<String>) f.p(readableArray));
    }

    public c createViewInstance(C3415h0 h0Var) {
        return new c(h0Var, this.mActivityEventListener.a());
    }
}
