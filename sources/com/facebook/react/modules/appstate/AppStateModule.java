package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;

@Q7.a(name = "AppState")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\b\u0001\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u0013R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/modules/appstate/AppStateModule;", "Lcom/facebook/fbreact/specs/NativeAppStateSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/WindowFocusChangeListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/WritableMap;", "createAppStateEventMap", "()Lcom/facebook/react/bridge/WritableMap;", "", "eventName", "", "data", "Llf/M;", "sendEvent", "(Ljava/lang/String;Ljava/lang/Object;)V", "sendAppStateChangeEvent", "()V", "", "getTypedExportedConstants", "()Ljava/util/Map;", "Lcom/facebook/react/bridge/Callback;", "success", "error", "getCurrentAppState", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "onHostResume", "onHostPause", "onHostDestroy", "", "hasFocus", "onWindowFocusChange", "(Z)V", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "invalidate", "appState", "Ljava/lang/String;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    private String appState;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        String str;
        C6496s.h(reactApplicationContext, "reactContext");
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.addWindowFocusChangeListener(this);
        if (reactApplicationContext.getLifecycleState() == LifecycleState.RESUMED) {
            str = APP_STATE_ACTIVE;
        } else {
            str = APP_STATE_BACKGROUND;
        }
        this.appState = str;
    }

    private final WritableMap createAppStateEventMap() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("app_state", this.appState);
        C6496s.g(createMap, "apply(...)");
        return createMap;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String str, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, obj);
        }
    }

    public void addListener(String str) {
    }

    public void getCurrentAppState(Callback callback, Callback callback2) {
        C6496s.h(callback, com.amazon.device.simplesignin.a.a.a.f38020s);
        callback.invoke(createAppStateEventMap());
    }

    public Map<String, Object> getTypedExportedConstants() {
        return O.f(C6502A.a(INITIAL_STATE, this.appState));
    }

    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    public void onWindowFocusChange(boolean z10) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z10));
    }

    public void removeListeners(double d10) {
    }
}
