package W0;

import M.C1266g;
import android.view.inputmethod.CursorAnchorInfo;
import q0.C2423i;
import r0.Z1;

/* renamed from: W0.b  reason: case insensitive filesystem */
final class C1434b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1434b f8549a = new C1434b();

    private C1434b() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C2423i iVar) {
        return builder.setEditorBoundsInfo(C1266g.a().setEditorBounds(Z1.c(iVar)).setHandwritingBounds(Z1.c(iVar)).build());
    }
}
