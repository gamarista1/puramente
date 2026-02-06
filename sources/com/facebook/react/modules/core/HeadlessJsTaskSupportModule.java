package com.facebook.react.modules.core;

import P7.c;
import Q7.a;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@a(name = "HeadlessJsTaskSupport")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;", "Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "taskIdDouble", "Lcom/facebook/react/bridge/Promise;", "promise", "Llf/M;", "notifyTaskRetry", "(DLcom/facebook/react/bridge/Promise;)V", "notifyTaskFinished", "(D)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void notifyTaskFinished(double d10) {
        int i10 = (int) d10;
        c f10 = c.f(getReactApplicationContext());
        if (f10.h(i10)) {
            f10.i(i10);
            return;
        }
        U5.a.G(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i10));
    }

    public void notifyTaskRetry(double d10, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        int i10 = (int) d10;
        c f10 = c.f(getReactApplicationContext());
        if (f10.h(i10)) {
            promise.resolve(Boolean.valueOf(f10.l(i10)));
            return;
        }
        U5.a.G(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i10));
        promise.resolve(Boolean.FALSE);
    }
}
