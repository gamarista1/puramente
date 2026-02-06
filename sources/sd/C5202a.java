package sd;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.sayem.keepawake.KCKeepAwake;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sd.a  reason: case insensitive filesystem */
public class C5202a implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KCKeepAwake(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
