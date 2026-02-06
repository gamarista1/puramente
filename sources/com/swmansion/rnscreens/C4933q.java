package com.swmansion.rnscreens;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: com.swmansion.rnscreens.q  reason: case insensitive filesystem */
public final class C4933q extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f59832b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private ScreenDummyLayoutHelper f59833a;

    /* renamed from: com.swmansion.rnscreens.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final Map d() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
        return hashMap;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        this.f59833a = new ScreenDummyLayoutHelper(reactApplicationContext);
        C4925i.f59797a.e(reactApplicationContext);
        return C6565s.q(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager());
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        C6496s.h(str, "s");
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        if (C6496s.c(str, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    public R7.a getReactModuleInfoProvider() {
        return new C4932p();
    }
}
