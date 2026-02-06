package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.O;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ'\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lexpo/modules/kotlin/views/r;", "Lexpo/modules/kotlin/views/p;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/p;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Landroid/view/ViewGroup;", "viewToUpdate", "Lcom/facebook/react/uimanager/W;", "props", "Llf/M;", "updateProperties", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/W;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lexpo/modules/kotlin/views/p;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/p;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements r {
    public static final int $stable = 8;
    private final p viewWrapperDelegate;

    public GroupViewManagerWrapper(p pVar) {
        C6496s.h(pVar, "viewWrapperDelegate");
        this.viewWrapperDelegate = pVar;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> p10;
        Map<String, Object> c10 = getViewWrapperDelegate().c();
        if (c10 == null) {
            c10 = O.i();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null || (p10 = O.p(exportedCustomDirectEventTypeConstants, c10)) == null) {
            return c10;
        }
        return p10;
    }

    public String getName() {
        String e10 = getViewWrapperDelegate().e();
        return "ViewManagerAdapter_" + e10;
    }

    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry entry : getViewWrapperDelegate().f().entrySet()) {
            C6496s.e(nativeProps);
            nativeProps.put((String) entry.getKey(), String.valueOf(((a) entry.getValue()).b().f().b()));
        }
        C6496s.e(nativeProps);
        return nativeProps;
    }

    public p getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(ViewGroup viewGroup, View view) {
        C6496s.h(viewGroup, "parent");
        C6496s.h(view, "view");
        getViewWrapperDelegate().g();
        super.removeView(viewGroup, view);
        C6514M m10 = C6514M.f71813a;
    }

    public void addView(ViewGroup viewGroup, View view, int i10) {
        C6496s.h(viewGroup, "parent");
        C6496s.h(view, "child");
        getViewWrapperDelegate().g();
        super.addView(viewGroup, view, i10);
        C6514M m10 = C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        View a10 = getViewWrapperDelegate().a(h0Var);
        C6496s.f(a10, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a10;
    }

    public View getChildAt(ViewGroup viewGroup, int i10) {
        C6496s.h(viewGroup, "parent");
        getViewWrapperDelegate().g();
        return super.getChildAt(viewGroup, i10);
    }

    public int getChildCount(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "parent");
        getViewWrapperDelegate().g();
        return Integer.valueOf(super.getChildCount(viewGroup)).intValue();
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "view");
        super.onAfterUpdateTransaction(viewGroup);
        getViewWrapperDelegate().i(viewGroup);
    }

    public void onDropViewInstance(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "view");
        super.onDropViewInstance(viewGroup);
        getViewWrapperDelegate().h(viewGroup);
    }

    public void removeViewAt(ViewGroup viewGroup, int i10) {
        C6496s.h(viewGroup, "parent");
        getViewWrapperDelegate().g();
        super.removeViewAt(viewGroup, i10);
        C6514M m10 = C6514M.f71813a;
    }

    public void updateProperties(ViewGroup viewGroup, W w10) {
        C6496s.h(viewGroup, "viewToUpdate");
        C6496s.h(w10, "props");
        ReadableMap a10 = X.a(w10);
        super.updateProperties(viewGroup, new W(new i(a10, getViewWrapperDelegate().k(viewGroup, a10))));
    }
}
