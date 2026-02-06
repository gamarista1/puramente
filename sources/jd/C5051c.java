package jd;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.performance.PerformanceModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jd.c  reason: case insensitive filesystem */
public class C5051c implements P {
    public C5051c() {
        PerformanceModule.setupListener();
    }

    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PerformanceModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
