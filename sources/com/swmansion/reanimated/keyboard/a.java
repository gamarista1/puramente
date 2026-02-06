package com.swmansion.reanimated.keyboard;

public final /* synthetic */ class a implements NotifyAboutKeyboardChangeFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardAnimationManager f59628a;

    public /* synthetic */ a(KeyboardAnimationManager keyboardAnimationManager) {
        this.f59628a = keyboardAnimationManager;
    }

    public final void call() {
        this.f59628a.notifyAboutKeyboardChange();
    }
}
