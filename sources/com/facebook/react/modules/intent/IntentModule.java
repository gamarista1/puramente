package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Q7.a(name = "IntentAndroid")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\nJ+\u0010\u001d\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/modules/intent/IntentModule;", "Lcom/facebook/fbreact/specs/NativeIntentAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", "promise", "Llf/M;", "waitForActivityAndGetInitialURL", "(Lcom/facebook/react/bridge/Promise;)V", "Landroid/content/Intent;", "intent", "", "useNewTaskFlag", "sendOSIntent", "(Landroid/content/Intent;Z)V", "invalidate", "()V", "getInitialURL", "", "url", "openURL", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "canOpenURL", "openSettings", "action", "Lcom/facebook/react/bridge/ReadableArray;", "extras", "sendIntent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/LifecycleEventListener;", "initialURLListener", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "pendingOpenURLPromises", "Ljava/util/List;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class IntentModule extends NativeIntentAndroidSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    public static final String NAME = "IntentAndroid";
    /* access modifiers changed from: private */
    public LifecycleEventListener initialURLListener;
    /* access modifiers changed from: private */
    public final List<Promise> pendingOpenURLPromises = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41066a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41066a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.intent.IntentModule.b.<clinit>():void");
        }
    }

    public static final class c implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IntentModule f41067a;

        c(IntentModule intentModule) {
            this.f41067a = intentModule;
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            this.f41067a.getReactApplicationContext().removeLifecycleEventListener(this);
            IntentModule intentModule = this.f41067a;
            synchronized (intentModule) {
                try {
                    for (Promise initialURL : intentModule.pendingOpenURLPromises) {
                        intentModule.getInitialURL(initialURL);
                    }
                    intentModule.initialURLListener = null;
                    intentModule.pendingOpenURLPromises.clear();
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    private final void sendOSIntent(Intent intent, boolean z10) {
        ComponentName componentName;
        String str;
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        if (packageManager == null) {
            componentName = intent.getComponent();
        } else {
            componentName = intent.resolveActivity(packageManager);
        }
        if (componentName == null || (str = componentName.getPackageName()) == null) {
            str = "";
        }
        if (z10 || currentActivity == null || !C6496s.c(packageName, str)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private final synchronized void waitForActivityAndGetInitialURL(Promise promise) {
        this.pendingOpenURLPromises.add(promise);
        if (this.initialURLListener == null) {
            this.initialURLListener = new c(this);
            getReactApplicationContext().addLifecycleEventListener(this.initialURLListener);
        }
    }

    public void canOpenURL(String str, Promise promise) {
        boolean z10;
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            PackageManager packageManager = getReactApplicationContext().getPackageManager();
            if (packageManager == null || intent.resolveActivity(packageManager) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            String message = e10.getMessage();
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + message));
        }
    }

    public void getInitialURL(Promise promise) {
        String str;
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null || (!C6496s.c("android.intent.action.VIEW", action) && !C6496s.c("android.nfc.action.NDEF_DISCOVERED", action))) {
                str = null;
            } else {
                str = data.toString();
            }
            promise.resolve(str);
        } catch (Exception e10) {
            String message = e10.getMessage();
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not get the initial URL : " + message));
        }
    }

    public void invalidate() {
        synchronized (this) {
            try {
                this.pendingOpenURLPromises.clear();
                LifecycleEventListener lifecycleEventListener = this.initialURLListener;
                if (lifecycleEventListener != null) {
                    getReactApplicationContext().removeLifecycleEventListener(lifecycleEventListener);
                    C6514M m10 = C6514M.f71813a;
                }
                this.initialURLListener = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.invalidate();
    }

    public void openSettings(Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                String packageName = getReactApplicationContext().getPackageName();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse("package:" + packageName));
                intent.addFlags(268435456);
                intent.addFlags(1073741824);
                intent.addFlags(8388608);
                currentActivity.startActivity(intent);
                promise.resolve(Boolean.TRUE);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e10) {
            String message = e10.getMessage();
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not open the Settings: " + message));
        }
    }

    public void openURL(String str, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), false);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            String message = e10.getMessage();
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + message));
        }
    }

    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
            return;
        }
        Intent intent = new Intent(str);
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            promise.reject((Throwable) new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
            return;
        }
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map != null) {
                    String string = map.getString(SubscriberAttributeKt.JSON_NAME_KEY);
                    int i11 = b.f41066a[map.getType("value").ordinal()];
                    if (i11 == 1) {
                        intent.putExtra(string, map.getString("value"));
                    } else if (i11 == 2) {
                        intent.putExtra(string, map.getDouble("value"));
                    } else if (i11 != 3) {
                        promise.reject((Throwable) new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                        return;
                    } else {
                        intent.putExtra(string, map.getBoolean("value"));
                    }
                }
            }
        }
        sendOSIntent(intent, true);
    }
}
