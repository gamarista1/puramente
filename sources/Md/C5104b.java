package md;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: md.b  reason: case insensitive filesystem */
public class C5104b implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClipboardModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
