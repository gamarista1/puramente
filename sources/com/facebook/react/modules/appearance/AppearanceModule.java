package com.facebook.react.modules.appearance;

import android.content.Context;
import androidx.appcompat.app.g;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "Appearance")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule;", "Lcom/facebook/fbreact/specs/NativeAppearanceSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/modules/appearance/AppearanceModule$b;", "overrideColorScheme", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$b;)V", "Landroid/content/Context;", "context", "", "colorSchemeForCurrentConfiguration", "(Landroid/content/Context;)Ljava/lang/String;", "getColorScheme", "()Ljava/lang/String;", "style", "Llf/M;", "setColorScheme", "(Ljava/lang/String;)V", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "currentContext", "onConfigurationChanged", "(Landroid/content/Context;)V", "colorScheme", "emitAppearanceChanged", "Lcom/facebook/react/modules/appearance/AppearanceModule$b;", "lastEmittedColorScheme", "Ljava/lang/String;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "Appearance";
    private String lastEmittedColorScheme;
    private final b overrideColorScheme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, (b) null, 2, (DefaultConstructorMarker) null);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        if (i10 == 16 || i10 != 32) {
            return "light";
        }
        return "dark";
    }

    public void addListener(String str) {
        C6496s.h(str, "eventName");
    }

    public final void emitAppearanceChanged(String str) {
        C6496s.h(str, "colorScheme");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }

    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        C6496s.e(currentActivity);
        return colorSchemeForCurrentConfiguration(currentActivity);
    }

    public final void onConfigurationChanged(Context context) {
        C6496s.h(context, "currentContext");
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!C6496s.c(this.lastEmittedColorScheme, colorSchemeForCurrentConfiguration)) {
            this.lastEmittedColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    public void removeListeners(double d10) {
    }

    public void setColorScheme(String str) {
        C6496s.h(str, "style");
        int hashCode = str.hashCode();
        if (hashCode != -1626174665) {
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && str.equals("light")) {
                    g.N(1);
                }
            } else if (str.equals("dark")) {
                g.N(2);
            }
        } else if (str.equals("unspecified")) {
            g.N(-1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? null : bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }
}
