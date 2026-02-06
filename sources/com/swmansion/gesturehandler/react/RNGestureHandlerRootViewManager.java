package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import m8.C3788B;
import mf.O;

@Q7.a(name = "RNGestureHandlerRootView")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00140\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/l;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/gesturehandler/react/l;", "view", "Llf/M;", "onDropViewInstance", "(Lcom/swmansion/gesturehandler/react/l;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<l> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final w0 mDelegate = new C3788B(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return O.n(C6502A.a("onGestureHandlerEvent", O.n(C6502A.a("registrationName", "onGestureHandlerEvent"))), C6502A.a("onGestureHandlerStateChange", O.n(C6502A.a("registrationName", "onGestureHandlerStateChange"))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public l createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new l(h0Var);
    }

    public void onDropViewInstance(l lVar) {
        C6496s.h(lVar, "view");
        lVar.m();
    }
}
