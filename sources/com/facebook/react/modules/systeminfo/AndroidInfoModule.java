package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"HardwareIds"})
@Q7.a(name = "PlatformConstants")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;", "Lcom/facebook/fbreact/specs/NativePlatformConstantsAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "uiMode", "()Ljava/lang/String;", "", "isRunningScreenshotTest", "()Z", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "getAndroidID", "Llf/M;", "invalidate", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidInfoModule extends NativePlatformConstantsAndroidSpec {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";
    private static final String IS_TESTING = "IS_TESTING";

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    private final boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final String uiMode() {
        Object systemService = getReactApplicationContext().getSystemService("uimode");
        C6496s.f(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int currentModeType = ((UiModeManager) systemService).getCurrentModeType();
        if (currentModeType == 1) {
            return Constants.NORMAL;
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType == 6) {
            return "watch";
        }
        if (currentModeType != 7) {
            return "unknown";
        }
        return "vrheadset";
    }

    public String getAndroidID() {
        String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
        C6496s.g(string, "getString(...)");
        return string;
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getTypedExportedConstants() {
        boolean z10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("Release", Build.VERSION.RELEASE);
        linkedHashMap.put("Serial", Build.SERIAL);
        linkedHashMap.put("Fingerprint", Build.FINGERPRINT);
        linkedHashMap.put("Model", Build.MODEL);
        linkedHashMap.put("Manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("Brand", Build.BRAND);
        if (E7.a.f30669b) {
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            C6496s.g(applicationContext, "getApplicationContext(...)");
            linkedHashMap.put("ServerHost", a.h(applicationContext));
        }
        if (C6496s.c(b.f37475af, System.getProperty(IS_TESTING)) || isRunningScreenshotTest()) {
            z10 = true;
        } else {
            z10 = false;
        }
        linkedHashMap.put("isTesting", Boolean.valueOf(z10));
        String property = System.getProperty(IS_DISABLE_ANIMATIONS);
        if (property != null) {
            linkedHashMap.put("isDisableAnimations", Boolean.valueOf(C6496s.c(b.f37475af, property)));
        }
        linkedHashMap.put("reactNativeVersion", b.f41127a);
        linkedHashMap.put("uiMode", uiMode());
        return linkedHashMap;
    }

    public void invalidate() {
    }
}
