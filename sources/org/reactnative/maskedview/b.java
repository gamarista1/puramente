package org.reactnative.maskedview;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new RNCMaskedViewManager()});
    }
}
