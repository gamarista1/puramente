package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.k;
import k0.i;

final class h extends i.c implements p0.h {
    public void b1(k kVar) {
        boolean z10;
        if (!v0().S1() || !f.g(this).hasFocusable()) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar.h(z10);
    }
}
