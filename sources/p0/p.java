package p0;

import J0.C1235c0;
import J0.C1245k;
import J0.G;
import J0.m0;
import androidx.compose.ui.focus.FocusTargetNode;

public abstract class p {
    /* access modifiers changed from: private */
    public static final q b(FocusTargetNode focusTargetNode) {
        G A12;
        m0 m02;
        g focusOwner;
        C1235c0 K12 = focusTargetNode.v0().K1();
        if (K12 == null || (A12 = K12.A1()) == null || (m02 = A12.m0()) == null || (focusOwner = m02.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.d();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        C1245k.n(focusTargetNode).getFocusOwner().i(focusTargetNode);
    }

    public static final q d(FocusTargetNode focusTargetNode) {
        return C1245k.n(focusTargetNode).getFocusOwner().d();
    }
}
