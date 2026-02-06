package kd;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactcommunity.rnlocalize.RNLocalizeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: kd.a  reason: case insensitive filesystem */
public class C5067a implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new RNLocalizeModule(reactApplicationContext)});
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
