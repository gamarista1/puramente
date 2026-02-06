package ae;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3415h0;
import expo.modules.adapters.react.NativeModulesProxy;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;

public abstract class r {
    public static final NativeModulesProxy a(ReactContext reactContext) {
        NativeModule nativeModule;
        Object obj;
        NativeModule nativeModule2;
        C6496s.h(reactContext, "<this>");
        if (!reactContext.isBridgeless()) {
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            if (catalystInstance != null) {
                nativeModule2 = catalystInstance.getNativeModule("NativeUnimoduleProxy");
            } else {
                nativeModule2 = null;
            }
            if (nativeModule2 instanceof NativeModulesProxy) {
                return (NativeModulesProxy) nativeModule2;
            }
            return null;
        }
        Iterable nativeModules = ((C3415h0) reactContext).b().getNativeModules();
        if (nativeModules != null) {
            Iterator it = nativeModules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((NativeModule) obj) instanceof NativeModulesProxy) {
                    break;
                }
            }
            nativeModule = (NativeModule) obj;
        } else {
            nativeModule = null;
        }
        if (nativeModule instanceof NativeModulesProxy) {
            return (NativeModulesProxy) nativeModule;
        }
        return null;
    }
}
