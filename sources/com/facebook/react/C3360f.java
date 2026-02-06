package com.facebook.react;

import R7.a;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.facebook.react.f  reason: case insensitive filesystem */
public class C3360f extends C3328a implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private Map f40890a;

    private static void d(Map map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    private a e() {
        HashMap hashMap = new HashMap();
        Class cls = new Class[]{JSCHeapCapture.class}[0];
        Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
        hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        return new C3333d(hashMap);
    }

    private Map f() {
        if (this.f40890a == null) {
            HashMap hashMap = new HashMap();
            d(hashMap, DebuggingOverlayManager.REACT_CLASS, new C3359e());
            this.f40890a = hashMap;
        }
        return this.f40890a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map g(Map map) {
        return map;
    }

    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = (ModuleSpec) f().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (!str.equals(NativeJSCHeapCaptureSpec.NAME)) {
            return null;
        }
        return new JSCHeapCapture(reactApplicationContext);
    }

    public a getReactModuleInfoProvider() {
        if (!C7.a.a()) {
            return e();
        }
        try {
            return (a) C7.a.b("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return e();
        } catch (InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e11);
        }
    }

    public Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return f().keySet();
    }

    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(f().values());
    }
}
