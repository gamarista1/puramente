package androidx.compose.ui.platform;

import J0.E0;
import J0.G;
import Y.C1508q;
import Y.C1515u;
import Y.V0;
import Y.r;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import k0.m;
import kotlin.jvm.internal.C6496s;
import yf.p;

public abstract class M1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f13612a = new ViewGroup.LayoutParams(-2, -2);

    public static final V0 a(G g10, r rVar) {
        return C1515u.b(new E0(g10), rVar);
    }

    private static final C1508q b(r rVar, r rVar2, p pVar) {
        J1 j12;
        if (C1676z0.b() && rVar.getTag(m.f23102K) == null) {
            rVar.setTag(m.f23102K, Collections.newSetFromMap(new WeakHashMap()));
        }
        C1508q a10 = C1515u.a(new E0(rVar.getRoot()), rVar2);
        Object tag = rVar.getView().getTag(m.f23103L);
        if (tag instanceof J1) {
            j12 = (J1) tag;
        } else {
            j12 = null;
        }
        if (j12 == null) {
            j12 = new J1(rVar, a10);
            rVar.getView().setTag(m.f23103L, j12);
        }
        j12.d(pVar);
        if (!C6496s.c(rVar.getCoroutineContext(), rVar2.h())) {
            rVar.setCoroutineContext(rVar2.h());
        }
        return j12;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.C1508q c(androidx.compose.ui.platform.C1613a r3, Y.r r4, yf.p r5) {
        /*
            androidx.compose.ui.platform.t0 r0 = androidx.compose.ui.platform.C1664t0.f13944a
            r0.b()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0019
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.r
            if (r2 == 0) goto L_0x001c
            r1 = r0
            androidx.compose.ui.platform.r r1 = (androidx.compose.ui.platform.r) r1
            goto L_0x001c
        L_0x0019:
            r3.removeAllViews()
        L_0x001c:
            if (r1 != 0) goto L_0x0034
            androidx.compose.ui.platform.r r1 = new androidx.compose.ui.platform.r
            android.content.Context r0 = r3.getContext()
            qf.g r2 = r4.h()
            r1.<init>(r0, r2)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f13612a
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0034:
            Y.q r3 = b(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.M1.c(androidx.compose.ui.platform.a, Y.r, yf.p):Y.q");
    }
}
