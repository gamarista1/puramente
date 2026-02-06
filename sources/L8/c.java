package l8;

import U5.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f46145a = new c();

    private c() {
    }

    public static final void a(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        a.m("ReactNative", str);
    }

    private final String b(int i10) {
        if (i10 == 2 || i10 == 3) {
            return "log";
        }
        if (i10 == 4 || i10 == 5) {
            return "warn";
        }
        if (i10 != 6) {
            return "none";
        }
        return RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR;
    }

    private final void c(ReactContext reactContext, String str, int i10) {
        if (i10 >= 5 && reactContext != null && reactContext.hasActiveReactInstance() && str != null) {
            ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i10), str);
        }
    }

    public static final void d(ReactContext reactContext, String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        f46145a.c(reactContext, str, 5);
        a.I("ReactNative", str);
    }
}
