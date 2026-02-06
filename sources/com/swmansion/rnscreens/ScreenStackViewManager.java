package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import m8.L;
import mf.O;

@Q7.a(name = "RNSScreenStack")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/B;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/r;", "screen", "Llf/M;", "prepareOutTransition", "(Lcom/swmansion/rnscreens/r;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/B;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/B;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/B;I)V", "invalidate", "getChildCount", "(Lcom/swmansion/rnscreens/B;)I", "getChildAt", "(Lcom/swmansion/rnscreens/B;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/v;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;", "", "needsCustomLayoutForChildren", "()Z", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackViewManager extends ViewGroupManager<B> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final w0 delegate = new L(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void prepareOutTransition(r rVar) {
        if (rVar != null) {
            rVar.r();
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return O.n(C6502A.a("topFinishTransitioning", O.n(C6502A.a("registrationName", "onFinishTransitioning"))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void invalidate() {
        super.invalidate();
        NativeProxy.f59724a.b();
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public C3428v createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "context");
        return new S(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public B createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new B(h0Var);
    }

    public void addView(B b10, View view, int i10) {
        C6496s.h(b10, "parent");
        C6496s.h(view, "child");
        if (view instanceof r) {
            r rVar = (r) view;
            NativeProxy.f59724a.a(rVar.getId(), rVar);
            b10.d(rVar, i10);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
    }

    public View getChildAt(B b10, int i10) {
        C6496s.h(b10, "parent");
        return b10.l(i10);
    }

    public int getChildCount(B b10) {
        C6496s.h(b10, "parent");
        return b10.getScreenCount();
    }

    public void removeViewAt(B b10, int i10) {
        C6496s.h(b10, "parent");
        r l10 = b10.l(i10);
        prepareOutTransition(l10);
        b10.y(i10);
        NativeProxy.f59724a.c(l10.getId());
    }
}
