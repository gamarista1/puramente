package io.invertase.firebase.app;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (a.a() == null) {
            a.b(reactApplicationContext.getApplicationContext());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAppModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseUtilsModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
