package org.reactnative.maskedview;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;

public class RNCMaskedViewManager extends ViewGroupManager<a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        return new a(h0Var);
    }
}
