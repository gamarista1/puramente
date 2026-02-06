package com.facebook.react.views.modal;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.ReactModalHostView;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/facebook/react/views/modal/ReactModalHostView$showOrUpdate$1", "Landroid/content/DialogInterface$OnKeyListener;", "onKey", "", "dialog", "Landroid/content/DialogInterface;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactModalHostView$showOrUpdate$1 implements DialogInterface.OnKeyListener {
    final /* synthetic */ ReactModalHostView this$0;

    ReactModalHostView$showOrUpdate$1(ReactModalHostView reactModalHostView) {
        this.this$0 = reactModalHostView;
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        C6496s.h(dialogInterface, "dialog");
        C6496s.h(keyEvent, "event");
        if (keyEvent.getAction() != 1) {
            return false;
        }
        if (i10 == 4 || i10 == 111) {
            ReactModalHostView.OnRequestCloseListener onRequestCloseListener = this.this$0.getOnRequestCloseListener();
            if (onRequestCloseListener != null) {
                onRequestCloseListener.onRequestClose(dialogInterface);
                return true;
            }
            throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
        }
        Context context = this.this$0.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity.onKeyUp(i10, keyEvent);
        }
        return false;
    }
}
