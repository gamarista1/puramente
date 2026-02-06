package com.facebook.react.modules.devtoolsruntimesettings;

import com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "ReactDevToolsRuntimeSettingsModule")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;", "Lcom/facebook/fbreact/specs/NativeReactDevToolsRuntimeSettingsModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "Llf/M;", "setReloadAndProfileConfig", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/WritableMap;", "getReloadAndProfileConfig", "()Lcom/facebook/react/bridge/WritableMap;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStripAny
public final class ReactDevToolsRuntimeSettingsModule extends NativeReactDevToolsRuntimeSettingsModuleSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "ReactDevToolsRuntimeSettingsModule";
    private static final a settings = new a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReactDevToolsRuntimeSettingsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public WritableMap getReloadAndProfileConfig() {
        WritableMap createMap = Arguments.createMap();
        a aVar = settings;
        createMap.putBoolean("shouldReloadAndProfile", aVar.b());
        createMap.putBoolean("recordChangeDescriptions", aVar.a());
        C6496s.e(createMap);
        return createMap;
    }

    public void setReloadAndProfileConfig(ReadableMap readableMap) {
        C6496s.h(readableMap, "map");
        if (readableMap.hasKey("shouldReloadAndProfile")) {
            settings.d(readableMap.getBoolean("shouldReloadAndProfile"));
        }
        if (readableMap.hasKey("recordChangeDescriptions")) {
            settings.c(readableMap.getBoolean("recordChangeDescriptions"));
        }
    }
}
