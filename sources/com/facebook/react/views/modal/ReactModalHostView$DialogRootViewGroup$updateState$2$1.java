package com.facebook.react.views.modal;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.modal.ReactModalHostView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$updateState$2$1", "Lcom/facebook/react/bridge/GuardedRunnable;", "Llf/M;", "runGuarded", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactModalHostView$DialogRootViewGroup$updateState$2$1 extends GuardedRunnable {
    final /* synthetic */ ReactModalHostView.DialogRootViewGroup $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReactModalHostView$DialogRootViewGroup$updateState$2$1(ReactModalHostView.DialogRootViewGroup dialogRootViewGroup, C3415h0 h0Var) {
        super((ReactContext) h0Var);
        this.$this_run = dialogRootViewGroup;
    }

    public void runGuarded() {
        UIManagerModule uIManagerModule = (UIManagerModule) this.$this_run.getReactContext().b().getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(this.$this_run.getId(), this.$this_run.viewWidth, this.$this_run.viewHeight);
        }
    }
}
