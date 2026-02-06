package com.facebook.react.uimanager;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/v;", "<init>", "()V", "createShadowNodeInstance", "()Lcom/facebook/react/uimanager/v;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "Llf/M;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, C3428v> {
    public Class<C3428v> getShadowNodeClass() {
        return C3428v.class;
    }

    public void updateExtraData(T t10, Object obj) {
        C6496s.h(t10, "root");
    }

    public C3428v createShadowNodeInstance() {
        return new C3428v();
    }
}
