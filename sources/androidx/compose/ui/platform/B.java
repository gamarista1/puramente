package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;

final class B {

    /* renamed from: a  reason: collision with root package name */
    public static final B f13493a = new B();

    private B() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
