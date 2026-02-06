package expo.modules.adapters.react;

import Md.b;
import ae.C4466c;
import ae.g;
import ae.j;
import ae.k;
import ae.o;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NativeModulesProxy extends ReactContextBaseJavaModule {
    private static final String EXPORTED_METHODS_KEY = "exportedMethods";
    private static final String MODULES_CONSTANTS_KEY = "modulesConstants";
    private static final String NAME = "NativeUnimoduleProxy";
    private static final String UNDEFINED_METHOD_ERROR = "E_UNDEFINED_METHOD";
    private static final String VIEW_MANAGERS_METADATA_KEY = "viewManagersMetadata";
    private Map<String, Object> cachedConstants;
    private k mKotlinInteropModuleRegistry;
    private b mModuleRegistry;

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        this.mModuleRegistry = bVar;
        o a10 = g.f53619a.a();
        Objects.requireNonNull(a10);
        this.mKotlinInteropModuleRegistry = new k(a10, bVar, new WeakReference(reactApplicationContext));
    }

    @ReactMethod
    public void callMethod(String str, String str2, ReadableArray readableArray, Promise promise) {
        if (this.mKotlinInteropModuleRegistry.h(str)) {
            this.mKotlinInteropModuleRegistry.b(str, str2, readableArray, new j(promise));
            return;
        }
        promise.reject(UNDEFINED_METHOD_ERROR, "Method " + str2 + " of Java module " + str + " is undefined.");
    }

    public Map<String, Object> getConstants() {
        Map<String, Object> map = this.cachedConstants;
        if (map != null) {
            return map;
        }
        this.mModuleRegistry.a();
        k kotlinInteropModuleRegistry = getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.i();
        kotlinInteropModuleRegistry.c();
        HashMap hashMap = new HashMap(3);
        hashMap.put(MODULES_CONSTANTS_KEY, new HashMap());
        hashMap.put(EXPORTED_METHODS_KEY, new HashMap());
        hashMap.put(VIEW_MANAGERS_METADATA_KEY, this.mKotlinInteropModuleRegistry.m());
        C4466c.a().c("✅ Constants were exported");
        this.cachedConstants = hashMap;
        return hashMap;
    }

    public k getKotlinInteropModuleRegistry() {
        return this.mKotlinInteropModuleRegistry;
    }

    /* access modifiers changed from: package-private */
    public b getModuleRegistry() {
        return this.mModuleRegistry;
    }

    public String getName() {
        return NAME;
    }

    /* access modifiers changed from: package-private */
    public ReactApplicationContext getReactContext() {
        return getReactApplicationContext();
    }

    public void invalidate() {
        super.invalidate();
        this.mModuleRegistry.d();
        this.mKotlinInteropModuleRegistry.j();
    }

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, b bVar, o oVar) {
        super(reactApplicationContext);
        this.mModuleRegistry = bVar;
        Objects.requireNonNull(oVar);
        this.mKotlinInteropModuleRegistry = new k(oVar, bVar, new WeakReference(reactApplicationContext));
    }
}
