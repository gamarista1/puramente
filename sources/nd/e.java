package nd;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.NetInfoModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class e implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new NetInfoModule(reactApplicationContext)});
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
