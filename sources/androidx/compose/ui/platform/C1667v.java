package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.v  reason: case insensitive filesystem */
public final /* synthetic */ class C1667v implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1671x f13983a;

    public /* synthetic */ C1667v(C1671x xVar) {
        this.f13983a = xVar;
    }

    public final void onTouchExplorationStateChanged(boolean z10) {
        C1671x.R0(this.f13983a, z10);
    }
}
