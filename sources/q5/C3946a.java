package q5;

import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* renamed from: q5.a  reason: case insensitive filesystem */
public class C3946a implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNPushNotification(reactApplicationContext));
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
