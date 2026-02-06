package com.intercom.reactnative;

import Q7.a;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.HashMap;
import java.util.Map;

@a(name = "IntercomEventEmitter")
public class IntercomEventEmitter extends ReactContextBaseJavaModule {
    public static final String NAME = "IntercomEventEmitter";
    private static final String UNREAD_COUNT_CHANGE_NOTIFICATION = "IntercomUnreadConversationCountDidChangeNotification";
    private int activeListenersCount = 0;
    private final UnreadConversationCountListener unreadConversationCountListener = new UnreadConversationCountListener() {
        public void onCountUpdate(int i10) {
            IntercomEventEmitter.this.updateUnreadCount();
        }
    };

    public IntercomEventEmitter(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void sendEvent(String str, WritableMap writableMap) {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception unused) {
                Log.e(NAME, "sendEvent called before bundle loaded");
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateUnreadCount() {
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("count", Intercom.client().getUnreadConversationCount());
            Log.d(NAME, "handleUpdateUnreadCount");
            sendEvent(UNREAD_COUNT_CHANGE_NOTIFICATION, createMap);
        } catch (Exception unused) {
            Log.e(NAME, "client called before Intercom initialization");
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("UNREAD_COUNT_CHANGE_NOTIFICATION", UNREAD_COUNT_CHANGE_NOTIFICATION);
        return hashMap;
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void removeEventListener() {
        try {
            int i10 = this.activeListenersCount - 1;
            this.activeListenersCount = i10;
            if (i10 == 0) {
                Intercom.client().removeUnreadConversationCountListener(this.unreadConversationCountListener);
            }
        } catch (Exception e10) {
            Log.e(NAME, "removeEventListener error:");
            Log.e(NAME, e10.toString());
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void startEventListener() {
        try {
            if (this.activeListenersCount == 0) {
                Intercom.client().addUnreadConversationCountListener(this.unreadConversationCountListener);
            }
            this.activeListenersCount++;
        } catch (Exception e10) {
            Log.e(NAME, "startEventListener error:");
            Log.e(NAME, e10.toString());
        }
    }
}
