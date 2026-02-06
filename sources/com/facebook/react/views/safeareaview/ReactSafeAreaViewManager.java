package com.facebook.react.views.safeareaview;

import android.view.View;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.T0;

@Q7.a(name = "RCTSafeAreaView")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/safeareaview/b;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/safeareaview/b;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v;", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/v;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "Lcom/facebook/react/uimanager/W;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/safeareaview/b;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Ljava/lang/Object;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactSafeAreaViewManager extends ViewGroupManager<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RCTSafeAreaView";
    private final w0 delegate = new T0(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C3428v> getShadowNodeClass() {
        return c.class;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public C3428v createShadowNodeInstance() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public b createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new b(h0Var);
    }

    public Object updateState(b bVar, W w10, C3413g0 g0Var) {
        C6496s.h(bVar, "view");
        C6496s.h(w10, "props");
        C6496s.h(g0Var, "stateWrapper");
        bVar.setStateWrapper$ReactAndroid_release(g0Var);
        return null;
    }
}
