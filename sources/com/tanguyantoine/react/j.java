package com.tanguyantoine.react;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class j extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final MusicControlModule f59995a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59996b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactApplicationContext f59997c;

    public j(MusicControlModule musicControlModule, ReactApplicationContext reactApplicationContext) {
        this.f59995a = musicControlModule;
        this.f59996b = reactApplicationContext.getPackageName();
        this.f59997c = reactApplicationContext;
    }

    private boolean a(Intent intent) {
        if (!intent.hasExtra("music_control_package_name")) {
            return true;
        }
        if (!this.f59996b.equals(intent.getStringExtra("music_control_package_name"))) {
            return false;
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        MusicControlModule musicControlModule = this.f59995a;
        if (musicControlModule.session != null && musicControlModule.notification != null) {
            String action = intent.getAction();
            if ("music_control_remove_notification".equals(action)) {
                if (a(intent)) {
                    this.f59995a.notification.b();
                    this.f59995a.session.g(false);
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("name", "closeNotification");
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f59997c.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNMusicControlEvent", createMap);
                }
            } else if ("music_control_media_button".equals(action) || "android.intent.action.MEDIA_BUTTON".equals(action)) {
                if (intent.hasExtra("android.intent.extra.KEY_EVENT") && a(intent)) {
                    this.f59995a.session.b().a((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
                }
            } else if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                this.f59995a.session.b().c().a();
            }
        }
    }
}
