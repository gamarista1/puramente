package Fd;

import Pd.c;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Collections;
import java.util.List;

public class a implements Qd.a, c {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f50802a;

    public a(ReactContext reactContext) {
        this.f50802a = reactContext;
    }

    public void a(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f50802a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    public List o() {
        return Collections.singletonList(Qd.a.class);
    }
}
