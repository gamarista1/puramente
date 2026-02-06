package com.facebook.reactnative.androidsdk;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

public class b implements P {

    /* renamed from: a  reason: collision with root package name */
    private a f42379a = new a();

    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new FBAccessTokenModule(reactApplicationContext), new FBAppEventsLoggerModule(reactApplicationContext), new FBAppLinkModule(reactApplicationContext), new FBGameRequestDialogModule(reactApplicationContext, this.f42379a), new FBGraphRequestModule(reactApplicationContext), new FBLoginManagerModule(reactApplicationContext, this.f42379a), new FBMessageDialogModule(reactApplicationContext, this.f42379a), new FBProfileModule(reactApplicationContext), new FBSettingsModule(), new FBShareDialogModule(reactApplicationContext, this.f42379a)});
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new FBLoginButtonManager(reactApplicationContext), new FBSendButtonManager(), new FBShareButtonManager()});
    }
}
