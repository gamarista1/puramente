package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.C1680b0;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.h;
import f8.C3519a;

public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f41708a = "com.facebook.react.uimanager.n0";

    public static float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{G.f((float) C1680b0.F(editText)), G.f((float) C1680b0.E(editText)), G.f((float) editText.getPaddingTop()), G.f((float) editText.getPaddingBottom())};
    }

    public static EventDispatcher b(ReactContext reactContext, int i10) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof C3415h0) {
                reactContext = ((C3415h0) reactContext).b();
            }
            return ((h) reactContext).getEventDispatcher();
        }
        UIManager h10 = h(reactContext, i10, false);
        if (h10 == null) {
            String str = f41708a;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i10));
            return null;
        }
        EventDispatcher eventDispatcher = h10.getEventDispatcher();
        if (eventDispatcher == null) {
            String str2 = f41708a;
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i10));
        }
        return eventDispatcher;
    }

    public static EventDispatcher c(ReactContext reactContext, int i10) {
        EventDispatcher b10 = b(reactContext, C3519a.a(i10));
        if (b10 == null) {
            String str = f41708a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i10));
        }
        return b10;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof C3415h0) {
            return ((C3415h0) context).c();
        }
        return -1;
    }

    public static int f(View view) {
        if (view instanceof S) {
            S s10 = (S) view;
            if (s10.getUIManagerType() == 2) {
                return s10.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (C3519a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof C3415h0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int e10 = e(context);
        if (e10 == -1) {
            String str = f41708a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return e10;
    }

    public static UIManager g(ReactContext reactContext, int i10) {
        return h(reactContext, i10, true);
    }

    private static UIManager h(ReactContext reactContext, int i10, boolean z10) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException(f41708a, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        } else if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(f41708a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        } else {
            if (!reactContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(f41708a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                if (z10) {
                    return null;
                }
            }
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            Class cls = UIManagerModule.class;
            if (i10 != 2) {
                return (UIManager) catalystInstance.getNativeModule(cls);
            }
            try {
                return reactContext.getFabricUIManager();
            } catch (IllegalArgumentException unused) {
                String str = f41708a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i10));
                return (UIManager) catalystInstance.getNativeModule(cls);
            }
        }
    }

    public static UIManager i(ReactContext reactContext, int i10) {
        return g(reactContext, C3519a.a(i10));
    }
}
