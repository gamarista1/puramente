package M;

import Q0.L;
import android.view.inputmethod.CursorAnchorInfo;
import q0.C2423i;

/* renamed from: M.n  reason: case insensitive filesystem */
public final class C1273n {

    /* renamed from: a  reason: collision with root package name */
    public static final C1273n f4221a = new C1273n();

    private C1273n() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, L l10, C2423i iVar) {
        int r10;
        int r11;
        if (!iVar.q() && (r10 = l10.r(iVar.l())) <= (r11 = l10.r(iVar.e()))) {
            while (true) {
                CursorAnchorInfo.Builder unused = builder.addVisibleLineBounds(l10.s(r10), l10.v(r10), l10.t(r10), l10.m(r10));
                if (r10 == r11) {
                    break;
                }
                r10++;
            }
        }
        return builder;
    }
}
