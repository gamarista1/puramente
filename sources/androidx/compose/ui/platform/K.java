package androidx.compose.ui.platform;

import D0.C1110a;
import D0.C1130v;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.C6496s;

final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final K f13595a = new K();

    private K() {
    }

    public final void a(View view, C1130v vVar) {
        PointerIcon pointerIcon;
        if (vVar instanceof C1110a) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((C1110a) vVar).a());
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!C6496s.c(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
