package com.facebook.react.modules.debug;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DevSettingsModule f41013a;

    public /* synthetic */ c(DevSettingsModule devSettingsModule) {
        this.f41013a = devSettingsModule;
    }

    public final void run() {
        DevSettingsModule.reload$lambda$0(this.f41013a);
    }
}
