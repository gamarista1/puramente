package com.facebook.react.views.text.frescosupport;

import Q7.a;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3415h0;
import j6.d;
import n6.b;

@a(name = "RCTTextInlineImage")
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this((b) null, (Object) null);
    }

    public View createViewInstance(C3415h0 h0Var) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<a> getShadowNodeClass() {
        return a.class;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(b bVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mCallerContext = obj;
    }

    public a createShadowNodeInstance() {
        b bVar = this.mDraweeControllerBuilder;
        if (bVar == null) {
            bVar = d.h();
        }
        return new a(bVar, this.mCallerContext);
    }
}
