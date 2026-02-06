package com.swmansion.reanimated.keyboard;

import androidx.core.view.D0;
import com.facebook.react.uimanager.G;

public class Keyboard {
    private static final int CONTENT_TYPE_MASK = D0.n.c();
    private static final int SYSTEM_BAR_TYPE_MASK = D0.n.h();
    private int mActiveTransitionCounter = 0;
    private int mHeight = 0;
    private KeyboardState mState = KeyboardState.UNKNOWN;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        KeyboardState keyboardState;
        int i10 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i10;
        if (i10 == 0) {
            if (this.mHeight <= 0) {
                keyboardState = KeyboardState.CLOSED;
            } else {
                keyboardState = KeyboardState.OPEN;
            }
            this.mState = keyboardState;
        }
    }

    public void onAnimationStart() {
        KeyboardState keyboardState;
        int i10 = this.mActiveTransitionCounter;
        if (i10 > 0) {
            KeyboardState keyboardState2 = this.mState;
            KeyboardState keyboardState3 = KeyboardState.OPENING;
            if (keyboardState2 == keyboardState3) {
                keyboardState3 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState3;
        } else {
            if (this.mHeight <= 0) {
                keyboardState = KeyboardState.OPENING;
            } else {
                keyboardState = KeyboardState.CLOSING;
            }
            this.mState = keyboardState;
        }
        this.mActiveTransitionCounter = i10 + 1;
    }

    public void updateHeight(D0 d02, boolean z10) {
        int i10;
        int i11 = d02.f(CONTENT_TYPE_MASK).f25153d;
        if (z10) {
            i10 = 0;
        } else {
            i10 = d02.f(SYSTEM_BAR_TYPE_MASK).f25153d;
        }
        int f10 = (int) G.f((float) Math.max(0, i11 - i10));
        if (f10 > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = f10;
        }
    }
}
