package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;

@Q7.a(name = "RNCSafeAreaContext")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;", "Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getInitialWindowMetrics", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getTypedExportedConstants", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "RNCSafeAreaContext";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        View view;
        View findViewById;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            view = null;
        } else {
            view = window.getDecorView();
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(16908290)) == null) {
            return null;
        }
        a e10 = h.e(viewGroup);
        c a10 = h.a(viewGroup, findViewById);
        if (e10 == null || a10 == null) {
            return null;
        }
        return O.l(C6502A.a("insets", q.a(e10)), C6502A.a("frame", q.c(a10)));
    }

    public String getName() {
        return "RNCSafeAreaContext";
    }

    public Map<String, Object> getTypedExportedConstants() {
        return O.f(C6502A.a("initialWindowMetrics", getInitialWindowMetrics()));
    }
}
