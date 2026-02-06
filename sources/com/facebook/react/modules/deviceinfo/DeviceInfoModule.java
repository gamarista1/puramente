package com.facebook.react.modules.deviceinfo;

import Q7.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3408e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@a(name = "DeviceInfo")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;", "Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "Llf/M;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "emitUpdateDimensionsEvent", "invalidate", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "fontScale", "F", "Lcom/facebook/react/bridge/ReadableMap;", "previousDisplayMetrics", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    private float fontScale;
    private ReadableMap previousDisplayMetrics;
    private ReactApplicationContext reactApplicationContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(ReactApplicationContext reactApplicationContext2) {
        super(reactApplicationContext2);
        C6496s.h(reactApplicationContext2, "reactContext");
        C3408e.g(reactApplicationContext2);
        this.fontScale = reactApplicationContext2.getResources().getConfiguration().fontScale;
        reactApplicationContext2.addLifecycleEventListener(this);
        this.reactApplicationContext = reactApplicationContext2;
    }

    public final void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext2 = this.reactApplicationContext;
        if (reactApplicationContext2 == null) {
            return;
        }
        if (reactApplicationContext2.hasActiveReactInstance()) {
            WritableMap a10 = C3408e.a((double) this.fontScale);
            ReadableMap readableMap = this.previousDisplayMetrics;
            if (readableMap == null) {
                this.previousDisplayMetrics = a10.copy();
            } else if (!C6496s.c(a10, readableMap)) {
                this.previousDisplayMetrics = a10.copy();
                reactApplicationContext2.emitDeviceEvent("didUpdateDimensions", a10);
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
        }
    }

    public Map<String, Object> getTypedExportedConstants() {
        WritableMap a10 = C3408e.a((double) this.fontScale);
        this.previousDisplayMetrics = a10.copy();
        return O.f(C6502A.a("Dimensions", a10.toHashMap()));
    }

    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContext2 = this.reactApplicationContext;
        if (reactApplicationContext2 != null) {
            reactApplicationContext2.removeLifecycleEventListener(this);
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        Float f10;
        Resources resources;
        Configuration configuration;
        ReactApplicationContext reactApplicationContext2 = this.reactApplicationContext;
        if (reactApplicationContext2 == null || (resources = reactApplicationContext2.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            f10 = null;
        } else {
            f10 = Float.valueOf(configuration.fontScale);
        }
        if (f10 != null && !C6496s.b(f10, this.fontScale)) {
            this.fontScale = f10.floatValue();
            emitUpdateDimensionsEvent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(Context context) {
        super((ReactApplicationContext) null);
        C6496s.h(context, "context");
        this.reactApplicationContext = null;
        C3408e.g(context);
        this.fontScale = context.getResources().getConfiguration().fontScale;
    }
}
