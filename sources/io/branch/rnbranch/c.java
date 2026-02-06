package io.branch.rnbranch;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNBranchModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
