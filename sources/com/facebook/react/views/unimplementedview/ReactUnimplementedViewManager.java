package com.facebook.react.views.unimplementedview;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.U0;
import m8.V0;

@Q7.a(name = "UnimplementedNativeView")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/unimplementedview/a;", "Lm8/V0;", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/unimplementedview/a;", "", "getName", "()Ljava/lang/String;", "view", "name", "Llf/M;", "setName", "(Lcom/facebook/react/views/unimplementedview/a;Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactUnimplementedViewManager extends ViewGroupManager<a> implements V0 {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "UnimplementedNativeView";
    private final w0 delegate = new U0(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w0 getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new a(h0Var);
    }

    @C3500a(name = "name")
    public void setName(a aVar, String str) {
        C6496s.h(aVar, "view");
        if (str == null) {
            str = "<null component name>";
        }
        aVar.setName$ReactAndroid_release(str);
    }
}
