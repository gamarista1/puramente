package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.C6496s;

final class F implements ViewTranslationCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final F f13515a = new F();

    private F() {
    }

    public boolean onClearTranslation(View view) {
        C6496s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().p();
        return true;
    }

    public boolean onHideTranslation(View view) {
        C6496s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().r();
        return true;
    }

    public boolean onShowTranslation(View view) {
        C6496s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().u();
        return true;
    }
}
