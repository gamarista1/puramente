package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.e;
import e8.C3500a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/e;", "T", "Lcom/facebook/react/uimanager/ViewGroupManager;", "<init>", "()V", "view", "", "removeClippedSubviews", "Llf/M;", "setRemoveClippedSubviews", "(Lcom/facebook/react/views/view/e;Z)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/facebook/react/views/view/e;Landroid/view/View;I)V", "getChildCount", "(Lcom/facebook/react/views/view/e;)I", "getChildAt", "(Lcom/facebook/react/views/view/e;I)Landroid/view/View;", "removeViewAt", "(Lcom/facebook/react/views/view/e;I)V", "removeAllViews", "(Lcom/facebook/react/views/view/e;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReactClippingViewManager<T extends e> extends ViewGroupManager<T> {
    @C3500a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t10, boolean z10) {
        C6496s.h(t10, "view");
        UiThreadUtil.assertOnUiThread();
        t10.setRemoveClippedSubviews(z10);
    }

    public void removeAllViews(T t10) {
        C6496s.h(t10, "parent");
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            t10.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t10.removeAllViews();
        }
    }

    public void addView(T t10, View view, int i10) {
        C6496s.h(t10, "parent");
        C6496s.h(view, "child");
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            t10.addViewWithSubviewClippingEnabled(view, i10);
        } else {
            t10.addView(view, i10);
        }
    }

    public View getChildAt(T t10, int i10) {
        C6496s.h(t10, "parent");
        if (t10.getRemoveClippedSubviews()) {
            return t10.getChildAtWithSubviewClippingEnabled(i10);
        }
        return t10.getChildAt(i10);
    }

    public int getChildCount(T t10) {
        C6496s.h(t10, "parent");
        if (t10.getRemoveClippedSubviews()) {
            return t10.getAllChildrenCount();
        }
        return t10.getChildCount();
    }

    public void removeViewAt(T t10, int i10) {
        C6496s.h(t10, "parent");
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            View childAt = getChildAt(t10, i10);
            if (childAt != null) {
                t10.removeViewWithSubviewClippingEnabled(childAt);
                return;
            }
            return;
        }
        t10.removeViewAt(i10);
    }
}
