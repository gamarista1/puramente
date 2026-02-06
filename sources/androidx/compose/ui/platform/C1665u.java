package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.u  reason: case insensitive filesystem */
public final /* synthetic */ class C1665u implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1671x f13960a;

    public /* synthetic */ C1665u(C1671x xVar) {
        this.f13960a = xVar;
    }

    public final void onAccessibilityStateChanged(boolean z10) {
        C1671x.L(this.f13960a, z10);
    }
}
