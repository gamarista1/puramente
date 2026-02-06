package ld;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativeactionsshortcuts.ShortcutsModule;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class d implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        List asList = Arrays.asList(new NativeModule[]{new ShortcutsModule(reactApplicationContext)});
        C6496s.g(asList, "asList(...)");
        return asList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.n();
    }
}
