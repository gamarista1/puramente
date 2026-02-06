package com.dieam.reactnativepushnotification.modules;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.r;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r5.C3975a;
import s5.s;

public class RNPushNotification extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static ArrayList<Object> IntentHandlers = new ArrayList<>();
    public static final String KEY_TEXT_REPLY = "key_text_reply";
    public static final String LOG_TAG = "RNPushNotification";
    private a mJsDelivery;
    private s mRNPushNotificationHelper;
    private final SecureRandom mRandomNumberGenerator = new SecureRandom();

    class a implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f39223a;

        a(a aVar) {
            this.f39223a = aVar;
        }

        public void onComplete(Task task) {
            if (!task.isSuccessful()) {
                Log.e(RNPushNotification.LOG_TAG, "exception", task.getException());
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("deviceToken", (String) task.getResult());
            this.f39223a.e("remoteNotificationsRegistered", createMap);
        }
    }

    public RNPushNotification(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.mRNPushNotificationHelper = new s((Application) reactApplicationContext.getApplicationContext());
        this.mJsDelivery = new a(reactApplicationContext);
    }

    private Bundle getBundleFromIntent(Intent intent) {
        Bundle bundle;
        if (intent.hasExtra("notification")) {
            bundle = intent.getBundleExtra("notification");
        } else if (intent.hasExtra("google.message_id")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("data", intent.getExtras());
            bundle = bundle2;
        } else {
            bundle = null;
        }
        if (bundle == null) {
            Iterator<Object> it = IntentHandlers.iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
        }
        if (bundle != null && !bundle.getBoolean("foreground", false) && !bundle.containsKey("userInteraction")) {
            bundle.putBoolean("userInteraction", true);
        }
        return bundle;
    }

    @ReactMethod
    public void abandonPermissions() {
        FirebaseMessaging.u().q();
        Log.i(LOG_TAG, "InstanceID deleted");
    }

    @ReactMethod
    public void cancelAllLocalNotifications() {
        this.mRNPushNotificationHelper.a();
        this.mRNPushNotificationHelper.h();
    }

    @ReactMethod
    public void cancelLocalNotification(String str) {
        this.mRNPushNotificationHelper.b(str);
    }

    @ReactMethod
    public void channelBlocked(String str, Callback callback) {
        boolean c10 = this.mRNPushNotificationHelper.c(str);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(c10));
        }
    }

    @ReactMethod
    public void channelExists(String str, Callback callback) {
        boolean d10 = this.mRNPushNotificationHelper.d(str);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(d10));
        }
    }

    @ReactMethod
    public void checkPermissions(Promise promise) {
        promise.resolve(Boolean.valueOf(r.f(getReactApplicationContext()).a()));
    }

    @ReactMethod
    public void clearLocalNotification(String str, int i10) {
        this.mRNPushNotificationHelper.g(str, i10);
    }

    @ReactMethod
    public void createChannel(ReadableMap readableMap, Callback callback) {
        boolean i10 = this.mRNPushNotificationHelper.i(readableMap);
        if (callback != null) {
            callback.invoke(Boolean.valueOf(i10));
        }
    }

    @ReactMethod
    public void deleteChannel(String str) {
        this.mRNPushNotificationHelper.j(str);
    }

    @ReactMethod
    public void getChannels(Callback callback) {
        WritableArray fromList = Arguments.fromList(this.mRNPushNotificationHelper.s());
        if (callback != null) {
            callback.invoke(fromList);
        }
    }

    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @ReactMethod
    public void getDeliveredNotifications(Callback callback) {
        callback.invoke(this.mRNPushNotificationHelper.l());
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        Bundle bundleFromIntent;
        WritableMap createMap = Arguments.createMap();
        Activity currentActivity = getCurrentActivity();
        if (!(currentActivity == null || (bundleFromIntent = getBundleFromIntent(currentActivity.getIntent())) == null)) {
            bundleFromIntent.putBoolean("foreground", false);
            createMap.putString("dataJSON", this.mJsDelivery.a(bundleFromIntent));
        }
        promise.resolve(createMap);
    }

    public String getName() {
        return "ReactNativePushNotification";
    }

    @ReactMethod
    public void getScheduledLocalNotifications(Callback callback) {
        callback.invoke(this.mRNPushNotificationHelper.o());
    }

    @ReactMethod
    public void invokeApp(ReadableMap readableMap) {
        Bundle bundle;
        if (readableMap != null) {
            bundle = Arguments.toBundle(readableMap);
        } else {
            bundle = null;
        }
        this.mRNPushNotificationHelper.q(bundle);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onNewIntent(Intent intent) {
        Iterator<Object> it = IntentHandlers.iterator();
        if (!it.hasNext()) {
            Bundle bundleFromIntent = getBundleFromIntent(intent);
            if (bundleFromIntent != null) {
                this.mJsDelivery.c(bundleFromIntent);
                return;
            }
            return;
        }
        c.a(it.next());
        throw null;
    }

    @ReactMethod
    public void presentLocalNotification(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.x(bundle);
    }

    @ReactMethod
    public void removeAllDeliveredNotifications() {
        this.mRNPushNotificationHelper.h();
    }

    @ReactMethod
    public void removeDeliveredNotifications(ReadableArray readableArray) {
        this.mRNPushNotificationHelper.f(readableArray);
    }

    @ReactMethod
    public void requestPermissions() {
        FirebaseMessaging.u().x().addOnCompleteListener(new a(this.mJsDelivery));
    }

    @ReactMethod
    public void scheduleLocalNotification(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.v(bundle);
    }

    @ReactMethod
    public void setApplicationIconBadgeNumber(int i10) {
        C3975a.f47939c.a(getReactApplicationContext(), i10);
    }

    @ReactMethod
    public void subscribeToTopic(String str) {
        FirebaseMessaging.u().Z(str);
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str) {
        FirebaseMessaging.u().c0(str);
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        onActivityResult(i10, i11, intent);
    }
}
