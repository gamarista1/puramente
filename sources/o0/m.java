package O0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import k0.i;
import yf.C6798l;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f4586a = new AtomicInteger(0);

    public static final i a(i iVar, C6798l lVar) {
        return iVar.h(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int b() {
        return f4586a.addAndGet(1);
    }

    public static final i c(i iVar, boolean z10, C6798l lVar) {
        return iVar.h(new AppendedSemanticsElement(z10, lVar));
    }

    public static /* synthetic */ i d(i iVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(iVar, z10, lVar);
    }
}
