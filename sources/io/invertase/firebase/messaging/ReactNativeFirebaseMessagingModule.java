package io.invertase.firebase.messaging;

import Ue.g;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.r;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification = null;
    private HashMap<String, Boolean> initialNotificationMap = new HashMap<>();

    ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        reactApplicationContext.addActivityEventListener(this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteToken$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$getToken$2(FirebaseMessaging firebaseMessaging) {
        return (String) Tasks.await(firebaseMessaging.x());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPermission$6() {
        return Boolean.valueOf(r.f(getReactApplicationContext()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasPermission$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Integer.valueOf(((Boolean) task.getResult()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMessage$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAutoInitEnabled$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.u().D()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.u().r()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribeToTopic$10(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$unsubscribeFromTopic$11(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        r b10 = s.a().b();
        WritableMap b11 = b10.b(str);
        b10.a(str);
        return b11;
    }

    @ReactMethod
    public void deleteToken(String str, String str2, Promise promise) {
        Tasks.call(getExecutor(), new c((FirebaseMessaging) C5230g.p(str).k(FirebaseMessaging.class))).addOnCompleteListener(new d(promise));
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.u().D()));
        hashMap.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(FirebaseMessaging.u().r()));
        return hashMap;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        WritableMap writableMap;
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null) {
                    W w10 = (W) ReactNativeFirebaseMessagingReceiver.f71422a.get(string);
                    if (w10 == null) {
                        writableMap = popRemoteMessageMapFromMessagingStore(string);
                    } else {
                        writableMap = q.i(w10);
                    }
                    if (writableMap != null) {
                        promise.resolve(writableMap);
                        this.initialNotificationMap.put(string, Boolean.TRUE);
                        return;
                    }
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void getToken(String str, String str2, Promise promise) {
        Tasks.call(getExecutor(), new h((FirebaseMessaging) C5230g.p(str).k(FirebaseMessaging.class))).addOnCompleteListener(new i(promise));
    }

    @ReactMethod
    public void hasPermission(Promise promise) {
        Tasks.call(getExecutor(), new b(this)).addOnCompleteListener(new g(promise));
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }

    public void onNewIntent(Intent intent) {
        WritableMap writableMap;
        if (intent != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString("google.message_id");
            if (string == null) {
                string = intent.getExtras().getString("message_id");
            }
            if (string != null) {
                W w10 = (W) ReactNativeFirebaseMessagingReceiver.f71422a.get(string);
                if (w10 == null) {
                    writableMap = popRemoteMessageMapFromMessagingStore(string);
                } else {
                    writableMap = q.i(w10);
                }
                if (writableMap != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.merge(writableMap);
                    this.initialNotification = writableNativeMap;
                    ReactNativeFirebaseMessagingReceiver.f71422a.remove(string);
                    g.i().o(q.f(writableMap, Boolean.TRUE));
                }
            }
        }
    }

    @ReactMethod
    public void sendMessage(ReadableMap readableMap, Promise promise) {
        Tasks.call(getExecutor(), new j(readableMap)).addOnCompleteListener(new k(promise));
    }

    @ReactMethod
    public void setAutoInitEnabled(Boolean bool, Promise promise) {
        Tasks.call(getExecutor(), new e(bool)).addOnCompleteListener(new f(promise));
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(Boolean bool, Promise promise) {
        Tasks.call(getExecutor(), new m(bool)).addOnCompleteListener(new n(promise));
    }

    @ReactMethod
    public void subscribeToTopic(String str, Promise promise) {
        FirebaseMessaging.u().Z(str).addOnCompleteListener(new o(promise));
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, Promise promise) {
        FirebaseMessaging.u().c0(str).addOnCompleteListener(new l(promise));
    }
}
