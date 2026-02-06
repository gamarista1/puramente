package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3415h0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "RCTVirtualText")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/views/text/ReactVirtualTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Landroid/view/View;", "Lcom/facebook/react/views/text/n;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Landroid/view/View;", "view", "", "extraData", "Llf/M;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/n;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactVirtualTextViewManager extends BaseViewManager<View, n> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RCTVirtualText";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public View createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<n> getShadowNodeClass() {
        return n.class;
    }

    public void updateExtraData(View view, Object obj) {
        C6496s.h(view, "view");
        C6496s.h(obj, "extraData");
    }

    public n createShadowNodeInstance() {
        return new n();
    }
}
