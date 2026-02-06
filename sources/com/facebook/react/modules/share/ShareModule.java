package com.facebook.react.modules.share;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.o.b;
import com.facebook.fbreact.specs.NativeShareModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "ShareModule")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/modules/share/ShareModule;", "Lcom/facebook/fbreact/specs/NativeShareModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", "content", "", "dialogTitle", "Lcom/facebook/react/bridge/Promise;", "promise", "Llf/M;", "share", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareModule extends NativeShareModuleSpec {
    private static final String ACTION_SHARED = "sharedAction";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String ERROR_INVALID_CONTENT = "E_INVALID_CONTENT";
    private static final String ERROR_UNABLE_TO_OPEN_DIALOG = "E_UNABLE_TO_OPEN_DIALOG";
    public static final String NAME = "ShareModule";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    public void share(ReadableMap readableMap, String str, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (readableMap == null) {
            promise.reject(ERROR_INVALID_CONTENT, "Content cannot be null");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setTypeAndNormalize("text/plain");
            if (readableMap.hasKey(b.f37461S)) {
                intent.putExtra("android.intent.extra.SUBJECT", readableMap.getString(b.f37461S));
            }
            if (readableMap.hasKey(MetricTracker.Object.MESSAGE)) {
                intent.putExtra("android.intent.extra.TEXT", readableMap.getString(MetricTracker.Object.MESSAGE));
            }
            Intent createChooser = Intent.createChooser(intent, str);
            createChooser.addCategory("android.intent.category.DEFAULT");
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(createChooser);
            } else {
                getReactApplicationContext().startActivity(createChooser);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("action", ACTION_SHARED);
            promise.resolve(createMap);
        } catch (Exception unused) {
            promise.reject(ERROR_UNABLE_TO_OPEN_DIALOG, "Failed to open share dialog");
        }
    }
}
