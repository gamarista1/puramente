package J;

import M0.i;
import Y.C1500m;
import Y.C1506p;

public enum H {
    Cut(17039363),
    Copy(17039361),
    Paste(17039371),
    SelectAll(17039373);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f2868a;

    private H(int i10) {
        this.f2868a = i10;
    }

    public final String b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String a10 = i.a(this.f2868a, mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }
}
