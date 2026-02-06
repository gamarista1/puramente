package ze;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import fr.greweb.reactnativeviewshot.NativeRNViewShotSpec;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNViewShotSpec.NAME, new ReactModuleInfo(NativeRNViewShotSpec.NAME, NativeRNViewShotSpec.NAME, false, false, false, true));
        return hashMap;
    }

    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNViewShotModule(reactApplicationContext));
        return arrayList;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNViewShotSpec.NAME)) {
            return new RNViewShotModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new b();
    }
}
