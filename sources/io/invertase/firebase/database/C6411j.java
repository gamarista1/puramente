package io.invertase.firebase.database;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.invertase.firebase.database.j  reason: case insensitive filesystem */
public class C6411j implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseDatabaseModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseDatabaseReferenceModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseDatabaseQueryModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseDatabaseOnDisconnectModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseDatabaseTransactionModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
