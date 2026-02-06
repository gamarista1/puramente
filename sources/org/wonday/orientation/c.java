package org.wonday.orientation;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

public class c implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new OrientationModule(reactApplicationContext)});
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[0]);
    }
}
