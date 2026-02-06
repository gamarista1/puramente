package ud;

import Q7.a;
import com.facebook.react.C3328a;
import com.facebook.react.b0;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6531o;
import mf.C6565s;
import mf.O;

/* renamed from: ud.e  reason: case insensitive filesystem */
public final class C5238e extends C3328a implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f61715a = C6531o.b(new C5234a());

    /* access modifiers changed from: private */
    public static final Map g() {
        Class<RNGestureHandlerModule> cls = RNGestureHandlerModule.class;
        Annotation annotation = cls.getAnnotation(a.class);
        C6496s.e(annotation);
        a aVar = (a) annotation;
        String name = aVar.name();
        String name2 = cls.getName();
        C6496s.g(name2, "getName(...)");
        return O.n(C6502A.a("RNGestureHandlerModule", new ReactModuleInfo(name, name2, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), true)));
    }

    private final Map h() {
        return (Map) this.f61715a.getValue();
    }

    /* access modifiers changed from: private */
    public static final Map i() {
        return O.l(C6502A.a(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5236c())), C6502A.a(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5237d())));
    }

    /* access modifiers changed from: private */
    public static final NativeModule j() {
        return new RNGestureHandlerRootViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule k() {
        return new RNGestureHandlerButtonViewManager();
    }

    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        NativeModule nativeModule;
        Provider provider;
        C6496s.h(reactApplicationContext, "reactContext");
        C6496s.h(str, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) h().get(str);
        if (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) {
            nativeModule = null;
        } else {
            nativeModule = (NativeModule) provider.get();
        }
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.q(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        C6496s.h(str, "name");
        C6496s.h(reactApplicationContext, "reactContext");
        if (C6496s.c(str, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    public R7.a getReactModuleInfoProvider() {
        try {
            Object newInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C6496s.f(newInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (R7.a) newInstance;
        } catch (ClassNotFoundException unused) {
            return new C5235b();
        } catch (InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        }
    }

    /* access modifiers changed from: protected */
    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.h1(h().values());
    }

    public List getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.e1(h().keySet());
    }
}
