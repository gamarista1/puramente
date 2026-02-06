package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C3789C;

@Q7.a(name = "RNSScreenContainer")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/t;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/t;", "parent", "Landroid/view/View;", "child", "", "index", "Llf/M;", "addView", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/t;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/t;)V", "getChildCount", "(Lcom/swmansion/rnscreens/t;)I", "getChildAt", "(Lcom/swmansion/rnscreens/t;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/v;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;", "", "needsCustomLayoutForChildren", "()Z", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenContainerViewManager extends ViewGroupManager<C4935t> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final w0 delegate = new C3789C(this);

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

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public C3428v createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "context");
        return new S(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public C4935t createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new C4935t(h0Var);
    }

    public void removeAllViews(C4935t tVar) {
        C6496s.h(tVar, "parent");
        tVar.w();
    }

    public void addView(C4935t tVar, View view, int i10) {
        C6496s.h(tVar, "parent");
        C6496s.h(view, "child");
        if (view instanceof r) {
            tVar.d((r) view, i10);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
    }

    public View getChildAt(C4935t tVar, int i10) {
        C6496s.h(tVar, "parent");
        return tVar.l(i10);
    }

    public int getChildCount(C4935t tVar) {
        C6496s.h(tVar, "parent");
        return tVar.getScreenCount();
    }

    public void removeViewAt(C4935t tVar, int i10) {
        C6496s.h(tVar, "parent");
        tVar.y(i10);
    }
}
