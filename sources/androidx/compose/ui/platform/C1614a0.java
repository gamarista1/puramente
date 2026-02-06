package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* renamed from: androidx.compose.ui.platform.a0  reason: case insensitive filesystem */
final class C1614a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1614a0 f13686a = new C1614a0();

    private C1614a0() {
    }

    public final float a(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingSlop();
    }
}
