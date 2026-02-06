package com.swmansion.reanimated.keyboard;

import androidx.core.view.C1710q0;
import androidx.core.view.D0;
import java.util.Iterator;
import java.util.List;

public class KeyboardAnimationCallback extends C1710q0.b {
    private static final int CONTENT_TYPE_MASK = D0.n.c();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z10) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z10;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(C1710q0 q0Var) {
        if ((q0Var.c() & CONTENT_TYPE_MASK) != 0) {
            return true;
        }
        return false;
    }

    public void onEnd(C1710q0 q0Var) {
        if (isKeyboardAnimation(q0Var)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    public D0 onProgress(D0 d02, List<C1710q0> list) {
        Iterator<C1710q0> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (isKeyboardAnimation(it.next())) {
                    this.mKeyboard.updateHeight(d02, this.mIsNavigationBarTranslucent);
                    this.mNotifyAboutKeyboardChange.call();
                    break;
                }
            } else {
                break;
            }
        }
        return d02;
    }

    public C1710q0.a onStart(C1710q0 q0Var, C1710q0.a aVar) {
        if (!isKeyboardAnimation(q0Var)) {
            return aVar;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(q0Var, aVar);
    }
}
