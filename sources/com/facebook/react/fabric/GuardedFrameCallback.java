package com.facebook.react.fabric;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/fabric/GuardedFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "frameTimeNanos", "Llf/M;", "doFrame", "(J)V", "doFrameGuarded", "Lcom/facebook/react/bridge/JSExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GuardedFrameCallback implements Choreographer.FrameCallback {
    private final JSExceptionHandler exceptionHandler;

    protected GuardedFrameCallback(JSExceptionHandler jSExceptionHandler) {
        C6496s.h(jSExceptionHandler, "exceptionHandler");
        this.exceptionHandler = jSExceptionHandler;
    }

    public void doFrame(long j10) {
        try {
            doFrameGuarded(j10);
        } catch (RuntimeException e10) {
            this.exceptionHandler.handleException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void doFrameGuarded(long j10);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GuardedFrameCallback(com.facebook.react.bridge.ReactContext r2) {
        /*
            r1 = this;
            java.lang.String r0 = "reactContext"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            com.facebook.react.bridge.JSExceptionHandler r2 = r2.getExceptionHandler()
            java.lang.String r0 = "getExceptionHandler(...)"
            kotlin.jvm.internal.C6496s.g(r2, r0)
            r1.<init>((com.facebook.react.bridge.JSExceptionHandler) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.GuardedFrameCallback.<init>(com.facebook.react.bridge.ReactContext):void");
    }
}
