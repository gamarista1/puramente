package com.facebook.react.modules.core;

import I7.e;
import U7.d;
import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "Timing")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/react/modules/core/TimingModule;", "Lcom/facebook/fbreact/specs/NativeTimingSpec;", "LU7/d;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LI7/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LI7/e;)V", "", "callbackIDDouble", "durationDouble", "jsSchedulingTime", "", "repeat", "Llf/M;", "createTimer", "(DDDZ)V", "timerIdDouble", "deleteTimer", "(D)V", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "Lcom/facebook/react/bridge/WritableArray;", "timerIDs", "callTimers", "(Lcom/facebook/react/bridge/WritableArray;)V", "frameTime", "callIdleCallbacks", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "invalidate", "()V", "", "rangeMs", "hasActiveTimersInRange", "(J)Z", "Lcom/facebook/react/modules/core/JavaTimerManager;", "javaTimerManager", "Lcom/facebook/react/modules/core/JavaTimerManager;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimingModule extends NativeTimingSpec implements d {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "Timing";
    private final JavaTimerManager javaTimerManager;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimingModule(ReactApplicationContext reactApplicationContext, e eVar) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        C6496s.h(eVar, "devSupportManager");
        this.javaTimerManager = new JavaTimerManager(reactApplicationContext, this, b.f40995f.a(), eVar);
    }

    public void callIdleCallbacks(double d10) {
        JSTimers jSTimers;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) != null) {
            jSTimers.callIdleCallbacks(d10);
        }
    }

    public void callTimers(WritableArray writableArray) {
        JSTimers jSTimers;
        C6496s.h(writableArray, "timerIDs");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) != null) {
            jSTimers.callTimers(writableArray);
        }
    }

    public void createTimer(double d10, double d11, double d12, boolean z10) {
        this.javaTimerManager.t((int) d10, (int) d11, d12, z10);
    }

    public void deleteTimer(double d10) {
        this.javaTimerManager.deleteTimer((int) d10);
    }

    public void emitTimeDriftWarning(String str) {
        JSTimers jSTimers;
        C6496s.h(str, "warningMessage");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) != null) {
            jSTimers.emitTimeDriftWarning(str);
        }
    }

    public final boolean hasActiveTimersInRange(long j10) {
        return this.javaTimerManager.u(j10);
    }

    public void invalidate() {
        this.javaTimerManager.x();
    }

    public void setSendIdleEvents(boolean z10) {
        this.javaTimerManager.setSendIdleEvents(z10);
    }
}
