package com.facebook.react.views.scroll;

import android.view.View;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.W;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.e;
import f8.C3519a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "AndroidHorizontalScrollContentView")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "reactTag", "Lcom/facebook/react/uimanager/h0;", "context", "Lcom/facebook/react/uimanager/W;", "initialProps", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "Lcom/facebook/react/views/view/e;", "createViewInstance", "(ILcom/facebook/react/uimanager/h0;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/g0;)Lcom/facebook/react/views/view/e;", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/view/e;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactHorizontalScrollContainerViewManager extends ReactViewManager {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";
    private static Integer uiManagerType;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public e createViewInstance(int i10, C3415h0 h0Var, W w10, C3413g0 g0Var) {
        C6496s.h(h0Var, "context");
        if (uiManagerType == null) {
            uiManagerType = Integer.valueOf(C3519a.a(i10));
            View createViewInstance = super.createViewInstance(i10, h0Var, w10, g0Var);
            C6496s.g(createViewInstance, "createViewInstance(...)");
            e eVar = (e) createViewInstance;
            uiManagerType = null;
            return eVar;
        }
        throw new IllegalStateException("Check failed.");
    }

    public e createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        Integer num = uiManagerType;
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (num.intValue() == 2) {
            return new e(h0Var);
        } else {
            return new d(h0Var);
        }
    }
}
