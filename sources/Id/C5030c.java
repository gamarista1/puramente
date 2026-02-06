package id;

import R7.a;
import com.facebook.react.C3328a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.margelo.nitro.NitroModules;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: id.c  reason: case insensitive filesystem */
public final class C5030c extends C3328a {
    /* access modifiers changed from: private */
    public static final Map d() {
        HashMap hashMap = new HashMap();
        hashMap.put("NitroModules", new ReactModuleInfo("NitroModules", "NitroModules", false, false, false, true));
        return hashMap;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        C6496s.h(str, "name");
        C6496s.h(reactApplicationContext, "reactContext");
        if (C6496s.c(str, "NitroModules")) {
            return new NitroModules(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new C5029b();
    }
}
