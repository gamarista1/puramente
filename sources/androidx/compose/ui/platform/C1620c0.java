package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.c0  reason: case insensitive filesystem */
public final class C1620c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1620c0 f13695a = new C1620c0();

    private C1620c0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
