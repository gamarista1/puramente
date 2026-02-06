package com.reactnativepagerview;

import Q7.a;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@a(name = "LEGACY_RNCViewPager")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/reactnativepagerview/LEGACY_PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/widget/FrameLayout;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Landroid/widget/FrameLayout;", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LEGACY_PagerViewViewManager extends ViewGroupManager<FrameLayout> {
    public String getName() {
        return "LEGACY_RNCViewPager";
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public FrameLayout createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        throw new Error("LEGACY_RNCViewPager is an iOS-only feature");
    }
}
