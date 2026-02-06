package com.reactnativeactionsshortcuts;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativeactionsshortcuts.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld.C5097a;
import mf.C6565s;
import n1.C2241b;
import n1.C2247h;
import n1.C2250k;
import n1.O;
import n1.T;
import org.json.JSONObject;

@Q7.a(name = "RNShortcuts")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010\u0010J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/reactnativeactionsshortcuts/ShortcutsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/content/Intent;", "intent", "Lcom/reactnativeactionsshortcuts/b;", "getShortcutItemFromIntent", "(Landroid/content/Intent;)Lcom/reactnativeactionsshortcuts/b;", "Llf/M;", "emitEvent", "(Landroid/content/Intent;)V", "onCatalystInstanceDestroy", "()V", "Landroid/app/Activity;", "activity", "", "requestCode", "resultCode", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "onNewIntent", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "items", "Lcom/facebook/react/bridge/Promise;", "promise", "setShortcuts", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "getShortcuts", "(Lcom/facebook/react/bridge/Promise;)V", "getInitialShortcut", "clearShortcuts", "", "isSupported", "()Z", "Companion", "a", "react-native-actions-shortcuts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShortcutsModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String EVENT_ON_SHORTCUT_ITEM_PRESSED = "onShortcutItemPressed";
    public static final String INTENT_ACTION_SHORTCUT = "com.react_native_shortcuts.action.SHORTCUT";
    public static final String MODULE_NAME = "RNShortcuts";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortcutsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        reactApplicationContext.addActivityEventListener(this);
    }

    private final void emitEvent(Intent intent) {
        b shortcutItemFromIntent = getShortcutItemFromIntent(intent);
        if (shortcutItemFromIntent != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(EVENT_ON_SHORTCUT_ITEM_PRESSED, shortcutItemFromIntent.f());
        }
    }

    private final b getShortcutItemFromIntent(Intent intent) {
        String str;
        PersistableBundle persistableBundle;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str == INTENT_ACTION_SHORTCUT && (persistableBundle = (PersistableBundle) intent.getParcelableExtra("shortcutItem")) != null) {
            return b.f59234f.a(persistableBundle);
        }
        return null;
    }

    @TargetApi(25)
    @ReactMethod
    public final void clearShortcuts() {
        ShortcutManager shortcutManager;
        if (isSupported()) {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                shortcutManager = T.a(currentActivity.getSystemService(O.a()));
            } else {
                shortcutManager = null;
            }
            if (shortcutManager != null) {
                shortcutManager.removeAllDynamicShortcuts();
            }
        }
    }

    @TargetApi(25)
    @ReactMethod
    public final void getInitialShortcut(Promise promise) {
        Intent intent;
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!isSupported()) {
            promise.reject((Throwable) C5097a.f61032a);
        }
        Activity currentActivity = getCurrentActivity();
        WritableMap writableMap = null;
        if (currentActivity != null) {
            intent = currentActivity.getIntent();
        } else {
            intent = null;
        }
        b shortcutItemFromIntent = getShortcutItemFromIntent(intent);
        if (shortcutItemFromIntent != null) {
            writableMap = shortcutItemFromIntent.f();
        }
        promise.resolve(writableMap);
    }

    public String getName() {
        return MODULE_NAME;
    }

    @TargetApi(25)
    @ReactMethod
    public final void getShortcuts(Promise promise) {
        ShortcutManager shortcutManager;
        List a10;
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!isSupported()) {
            promise.reject((Throwable) C5097a.f61032a);
        }
        Activity currentActivity = getCurrentActivity();
        ArrayList arrayList = null;
        if (currentActivity != null) {
            shortcutManager = T.a(currentActivity.getSystemService(O.a()));
        } else {
            shortcutManager = null;
        }
        if (!(shortcutManager == null || (a10 = shortcutManager.getDynamicShortcuts()) == null)) {
            Iterable<Object> iterable = a10;
            arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Object a11 : iterable) {
                ShortcutInfo a12 = C2247h.a(a11);
                String a13 = a12.getId();
                C6496s.g(a13, "getId(...)");
                arrayList.add(new b(a13, String.valueOf(a12.getLongLabel()), String.valueOf(a12.getShortLabel()), (String) null, (JSONObject) null));
            }
        }
        b.a aVar = b.f59234f;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        promise.resolve(aVar.c(arrayList));
    }

    public final boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }

    public void onCatalystInstanceDestroy() {
        getReactApplicationContext().removeActivityEventListener(this);
        super.onCatalystInstanceDestroy();
    }

    public void onNewIntent(Intent intent) {
        emitEvent(intent);
    }

    @TargetApi(25)
    @ReactMethod
    public final void setShortcuts(ReadableArray readableArray, Promise promise) {
        Activity currentActivity;
        C6496s.h(readableArray, "items");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (!isSupported()) {
            promise.reject((Throwable) C5097a.f61032a);
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && (currentActivity = getCurrentActivity()) != null) {
            ArrayList<Object> arrayList = readableArray.toArrayList();
            ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                ReadableMap map = readableArray.getMap(i10);
                if (map != null) {
                    arrayList2.add(b.f59234f.b(map));
                    i10 = i11;
                } else {
                    return;
                }
            }
            List l02 = C6565s.l0(arrayList2);
            Iterable<b> iterable = l02;
            ArrayList arrayList3 = new ArrayList(C6565s.y(iterable, 10));
            for (b bVar : iterable) {
                Intent intent = new Intent(getReactApplicationContext(), currentActivity.getClass());
                intent.setAction(INTENT_ACTION_SHORTCUT);
                intent.putExtra("shortcutItem", bVar.e());
                String a10 = bVar.a();
                String b10 = bVar.b();
                String c10 = bVar.c();
                String d10 = bVar.d();
                C2250k.a();
                ShortcutInfo.Builder a11 = C2241b.a(getReactApplicationContext(), a10).setLongLabel(b10).setShortLabel(c10).setIntent(intent);
                C6496s.g(a11, "setIntent(...)");
                if (d10 != null) {
                    ShortcutInfo.Builder unused = a11.setIcon(Icon.createWithResource(reactApplicationContext, reactApplicationContext.getResources().getIdentifier(d10, "drawable", reactApplicationContext.getPackageName())));
                }
                arrayList3.add(a11.build());
            }
            ShortcutManager a12 = T.a(currentActivity.getSystemService(O.a()));
            if (a12 != null) {
                boolean unused2 = a12.setDynamicShortcuts(arrayList3);
            }
            promise.resolve(b.f59234f.c(l02));
        }
    }
}
