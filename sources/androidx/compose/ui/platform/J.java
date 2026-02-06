package androidx.compose.ui.platform;

import android.view.View;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f13579a = new J();

    private J() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(G.a(F.f13515a));
    }
}
