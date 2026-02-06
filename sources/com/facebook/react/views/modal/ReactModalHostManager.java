package com.facebook.react.views.modal;

import Q7.a;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import m8.C3821o;
import m8.C3823p;
import mf.O;

@a(name = "RCTModalHostView")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001f\u0010\u0017J!\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0014H\u0017¢\u0006\u0004\b\"\u0010\u0017J!\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b/\u0010\u0010J)\u00104\u001a\u0004\u0018\u00010,2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0016¢\u0006\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/modal/ReactModalHostView;", "Lm8/p;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/modal/ReactModalHostView;", "view", "Llf/M;", "onDropViewInstance", "(Lcom/facebook/react/views/modal/ReactModalHostView;)V", "animationType", "setAnimationType", "(Lcom/facebook/react/views/modal/ReactModalHostView;Ljava/lang/String;)V", "", "transparent", "setTransparent", "(Lcom/facebook/react/views/modal/ReactModalHostView;Z)V", "statusBarTranslucent", "setStatusBarTranslucent", "navigationBarTranslucent", "setNavigationBarTranslucent", "hardwareAccelerated", "setHardwareAccelerated", "visible", "setVisible", "value", "setPresentationStyle", "setAnimated", "Lcom/facebook/react/bridge/ReadableArray;", "setSupportedOrientations", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setIdentifier", "(Lcom/facebook/react/views/modal/ReactModalHostView;I)V", "addEventEmitters", "(Lcom/facebook/react/uimanager/h0;Lcom/facebook/react/views/modal/ReactModalHostView;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/W;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements C3823p {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RCTModalHostView";
    private final w0 delegate = new C3821o(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager$Companion;", "", "<init>", "()V", "REACT_CLASS", "", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, C3415h0 h0Var, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.h(new RequestCloseEvent(n0.e(h0Var), reactModalHostView.getId()));
    }

    /* access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, C3415h0 h0Var, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.h(new ShowEvent(n0.e(h0Var), reactModalHostView.getId()));
    }

    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put(RequestCloseEvent.EVENT_NAME, O.f(C6502A.a("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put(ShowEvent.EVENT_NAME, O.f(C6502A.a("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", O.f(C6502A.a("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", O.f(C6502A.a("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3500a(name = "animated")
    public void setAnimated(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
    }

    @C3500a(name = "identifier")
    public void setIdentifier(ReactModalHostView reactModalHostView, int i10) {
        C6496s.h(reactModalHostView, "view");
    }

    @C3500a(name = "presentationStyle")
    public void setPresentationStyle(ReactModalHostView reactModalHostView, String str) {
        C6496s.h(reactModalHostView, "view");
    }

    @C3500a(name = "supportedOrientations")
    public void setSupportedOrientations(ReactModalHostView reactModalHostView, ReadableArray readableArray) {
        C6496s.h(reactModalHostView, "view");
    }

    @C3500a(name = "visible")
    public void setVisible(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, ReactModalHostView reactModalHostView) {
        C6496s.h(h0Var, "reactContext");
        C6496s.h(reactModalHostView, "view");
        EventDispatcher c10 = n0.c(h0Var, reactModalHostView.getId());
        if (c10 != null) {
            reactModalHostView.setOnRequestCloseListener(new a(c10, h0Var, reactModalHostView));
            reactModalHostView.setOnShowListener(new b(c10, h0Var, reactModalHostView));
            reactModalHostView.setEventDispatcher(c10);
        }
    }

    /* access modifiers changed from: protected */
    public ReactModalHostView createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new ReactModalHostView(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ReactModalHostView reactModalHostView) {
        C6496s.h(reactModalHostView, "view");
        super.onAfterUpdateTransaction(reactModalHostView);
        reactModalHostView.showOrUpdate();
    }

    public void onDropViewInstance(ReactModalHostView reactModalHostView) {
        C6496s.h(reactModalHostView, "view");
        super.onDropViewInstance(reactModalHostView);
        reactModalHostView.onDropInstance();
    }

    @C3500a(name = "animationType")
    public void setAnimationType(ReactModalHostView reactModalHostView, String str) {
        C6496s.h(reactModalHostView, "view");
        if (str != null) {
            reactModalHostView.setAnimationType(str);
        }
    }

    @C3500a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
        reactModalHostView.setHardwareAccelerated(z10);
    }

    @C3500a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
        reactModalHostView.setNavigationBarTranslucent(z10);
    }

    @C3500a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
        reactModalHostView.setStatusBarTranslucent(z10);
    }

    @C3500a(name = "transparent")
    public void setTransparent(ReactModalHostView reactModalHostView, boolean z10) {
        C6496s.h(reactModalHostView, "view");
        reactModalHostView.setTransparent(z10);
    }

    public Object updateState(ReactModalHostView reactModalHostView, W w10, C3413g0 g0Var) {
        C6496s.h(reactModalHostView, "view");
        C6496s.h(w10, "props");
        C6496s.h(g0Var, "stateWrapper");
        reactModalHostView.setStateWrapper(g0Var);
        return null;
    }
}
