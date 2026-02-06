package M;

import android.view.inputmethod.CursorAnchorInfo;
import q0.C2423i;
import r0.Z1;

/* renamed from: M.l  reason: case insensitive filesystem */
public final class C1271l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1271l f4216a = new C1271l();

    private C1271l() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C2423i iVar) {
        return builder.setEditorBoundsInfo(C1266g.a().setEditorBounds(Z1.c(iVar)).setHandwritingBounds(Z1.c(iVar)).build());
    }
}
