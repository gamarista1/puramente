package com.swmansion.rnscreens;

import C7.d;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.H;
import m8.I;

@Q7.a(name = "RNSScreenStackHeaderConfig")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b1\u0010&J!\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0019H\u0017¢\u0006\u0004\b9\u0010)J!\u0010;\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u00105J!\u0010=\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b@\u0010>J\u001f\u0010B\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010A\u001a\u00020.H\u0017¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010D\u001a\u00020.H\u0017¢\u0006\u0004\bE\u0010CJ\u001f\u0010G\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010F\u001a\u00020.H\u0017¢\u0006\u0004\bG\u0010CJ!\u0010I\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bI\u0010>J\u001f\u0010K\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010J\u001a\u00020.H\u0017¢\u0006\u0004\bK\u0010CJ\u001f\u0010M\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010L\u001a\u00020.H\u0017¢\u0006\u0004\bM\u0010CJ\u001f\u0010O\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010N\u001a\u00020.H\u0017¢\u0006\u0004\bO\u0010CJ!\u0010Q\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bQ\u00105J\u001d\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020UH\u0014¢\u0006\u0004\bV\u0010WJ#\u0010Y\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u00105J#\u0010Z\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u00105J!\u0010[\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010)J!\u0010\\\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010CJ!\u0010]\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b]\u0010CJ#\u0010^\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b^\u00105J!\u0010_\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b_\u0010)J#\u0010`\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b`\u00105J#\u0010a\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\ba\u0010>J!\u0010b\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bb\u0010CJ#\u0010c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bc\u0010>J!\u0010d\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bd\u0010CJ#\u0010e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\be\u00105J#\u0010f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bf\u00105R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/H;", "Lm8/I;", "<init>", "()V", "", "propName", "Llf/M;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/swmansion/rnscreens/H;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/v;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/H;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/W;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/H;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/H;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/H;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/H;)I", "getChildAt", "(Lcom/swmansion/rnscreens/H;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "title", "setTitle", "(Lcom/swmansion/rnscreens/H;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/H;Ljava/lang/Integer;)V", "backgroundColor", "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/H;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<H> implements I {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final w0 delegate = new H(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("[RNScreens]", str + " prop is not available on Android");
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return d.e("topAttached", d.d("registrationName", "onAttached"), "topDetached", d.d("registrationName", "onDetached"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public C3428v createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "context");
        return new I(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public H createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new H(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(H h10) {
        C6496s.h(h10, "parent");
        super.onAfterUpdateTransaction(h10);
        h10.j();
    }

    public void onDropViewInstance(H h10) {
        C6496s.h(h10, "view");
        h10.f();
    }

    public void removeAllViews(H h10) {
        C6496s.h(h10, "parent");
        h10.k();
    }

    public void setBackButtonDisplayMode(H h10, String str) {
        logNotAvailable("backButtonDisplayMode");
    }

    @C3500a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setBackButtonInCustomView(z10);
    }

    public void setBackTitle(H h10, String str) {
        logNotAvailable("backTitle");
    }

    public void setBackTitleFontFamily(H h10, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    public void setBackTitleFontSize(H h10, int i10) {
        logNotAvailable("backTitleFontSize");
    }

    public void setBackTitleVisible(H h10, boolean z10) {
        logNotAvailable("backTitleVisible");
    }

    @C3500a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(H h10, Integer num) {
        C6496s.h(h10, "config");
        h10.setBackgroundColor(num);
    }

    public void setBlurEffect(H h10, String str) {
        logNotAvailable("blurEffect");
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(H h10, Integer num) {
        C6496s.h(h10, "config");
        h10.setTintColor(num != null ? num.intValue() : 0);
    }

    @C3500a(name = "direction")
    public void setDirection(H h10, String str) {
        C6496s.h(h10, "config");
        h10.setDirection(str);
    }

    public void setDisableBackButtonMenu(H h10, boolean z10) {
        logNotAvailable("disableBackButtonMenu");
    }

    @C3500a(name = "hidden")
    public void setHidden(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setHidden(z10);
    }

    @C3500a(name = "hideBackButton")
    public void setHideBackButton(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setHideBackButton(z10);
    }

    @C3500a(name = "hideShadow")
    public void setHideShadow(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setHideShadow(z10);
    }

    public void setLargeTitle(H h10, boolean z10) {
        logNotAvailable("largeTitle");
    }

    public void setLargeTitleBackgroundColor(H h10, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    public void setLargeTitleColor(H h10, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    public void setLargeTitleFontFamily(H h10, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    public void setLargeTitleFontSize(H h10, int i10) {
        logNotAvailable("largeTitleFontSize");
    }

    public void setLargeTitleFontWeight(H h10, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    public void setLargeTitleHideShadow(H h10, boolean z10) {
        logNotAvailable("largeTitleHideShadow");
    }

    @C3500a(name = "title")
    public void setTitle(H h10, String str) {
        C6496s.h(h10, "config");
        h10.setTitle(str);
    }

    @C3500a(customType = "Color", name = "titleColor")
    public void setTitleColor(H h10, Integer num) {
        C6496s.h(h10, "config");
        if (num != null) {
            h10.setTitleColor(num.intValue());
        }
    }

    @C3500a(name = "titleFontFamily")
    public void setTitleFontFamily(H h10, String str) {
        C6496s.h(h10, "config");
        h10.setTitleFontFamily(str);
    }

    @C3500a(name = "titleFontSize")
    public void setTitleFontSize(H h10, int i10) {
        C6496s.h(h10, "config");
        h10.setTitleFontSize((float) i10);
    }

    @C3500a(name = "titleFontWeight")
    public void setTitleFontWeight(H h10, String str) {
        C6496s.h(h10, "config");
        h10.setTitleFontWeight(str);
    }

    @C3500a(name = "topInsetEnabled")
    public void setTopInsetEnabled(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setTopInsetEnabled(z10);
    }

    @C3500a(name = "translucent")
    public void setTranslucent(H h10, boolean z10) {
        C6496s.h(h10, "config");
        h10.setTranslucent(z10);
    }

    public Object updateState(H h10, W w10, C3413g0 g0Var) {
        C6496s.h(h10, "view");
        h10.setStateWrapper(g0Var);
        return super.updateState(h10, w10, g0Var);
    }

    public void addView(H h10, View view, int i10) {
        C6496s.h(h10, "parent");
        C6496s.h(view, "child");
        if (view instanceof J) {
            h10.d((J) view, i10);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    public View getChildAt(H h10, int i10) {
        C6496s.h(h10, "parent");
        return h10.g(i10);
    }

    public int getChildCount(H h10) {
        C6496s.h(h10, "parent");
        return h10.getConfigSubviewsCount();
    }

    public void removeViewAt(H h10, int i10) {
        C6496s.h(h10, "parent");
        h10.l(i10);
    }
}
