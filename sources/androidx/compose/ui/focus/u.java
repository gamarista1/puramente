package androidx.compose.ui.focus;

import J0.C1245k;
import J0.G;
import a0.C1538b;
import java.util.Comparator;
import kotlin.jvm.internal.C6496s;

final class u implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final u f13358a = new u();

    private u() {
    }

    private final C1538b b(G g10) {
        C1538b bVar = new C1538b(new G[16], 0);
        while (g10 != null) {
            bVar.a(0, g10);
            g10 = g10.n0();
        }
        return bVar;
    }

    /* renamed from: a */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i10 = 0;
        if (t.g(focusTargetNode) && t.g(focusTargetNode2)) {
            G m10 = C1245k.m(focusTargetNode);
            G m11 = C1245k.m(focusTargetNode2);
            if (C6496s.c(m10, m11)) {
                return 0;
            }
            C1538b b10 = b(m10);
            C1538b b11 = b(m11);
            int min = Math.min(b10.q() - 1, b11.q() - 1);
            if (min >= 0) {
                while (C6496s.c(b10.p()[i10], b11.p()[i10])) {
                    if (i10 != min) {
                        i10++;
                    }
                }
                return C6496s.i(((G) b10.p()[i10]).o0(), ((G) b11.p()[i10]).o0());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        } else if (t.g(focusTargetNode)) {
            return -1;
        } else {
            if (t.g(focusTargetNode2)) {
                return 1;
            }
            return 0;
        }
    }
}
