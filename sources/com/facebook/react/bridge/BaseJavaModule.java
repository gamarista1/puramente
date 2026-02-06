package com.facebook.react.bridge;

import B7.a;
import java.util.Map;
import n7.C3863a;

public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    protected CxxCallbackImpl mEventEmitterCallback;
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this((ReactApplicationContext) null);
    }

    @a
    private final void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) C3863a.d(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    /* access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        String str = "React Native Instance has already disappeared: requested by " + getName();
        if (E7.a.f30669b) {
            U5.a.I("ReactNative", str);
            return null;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException(str));
        return null;
    }

    public void initialize() {
    }

    public void invalidate() {
    }

    public BaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
