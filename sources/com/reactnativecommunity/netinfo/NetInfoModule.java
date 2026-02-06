package com.reactnativecommunity.netinfo;

import Q7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.reactnativecommunity.netinfo.a;
import nd.d;
import nd.h;

@a(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule implements a.C0874a {
    public static final String NAME = "RNCNetInfo";
    private final a mAmazonConnectivityChecker;
    private final d mConnectivityReceiver;
    private int numberOfListeners = 0;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityReceiver = new h(reactApplicationContext);
        this.mAmazonConnectivityChecker = new a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f61128e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.d(str, promise);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        this.mConnectivityReceiver.g();
        this.mAmazonConnectivityChecker.g();
    }

    public void invalidate() {
        this.mAmazonConnectivityChecker.k();
        this.mConnectivityReceiver.j();
        this.mConnectivityReceiver.f61128e = false;
    }

    public void onAmazonFireDeviceConnectivityChanged(boolean z10) {
        this.mConnectivityReceiver.i(z10);
    }

    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = intValue;
        if (intValue == 0) {
            this.mConnectivityReceiver.f61128e = false;
        }
    }
}
