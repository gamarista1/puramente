package J0;

import H0.C1194o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class U {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3744a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                J0.G$e[] r0 = J0.G.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                J0.G$e r1 = J0.G.e.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                J0.G$e r1 = J0.G.e.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                J0.G$e r1 = J0.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                J0.G$e r1 = J0.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                J0.G$e r1 = J0.G.e.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f3744a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: J0.U.a.<clinit>():void");
        }
    }

    public static final List a(C1194o oVar) {
        List list;
        C6496s.f(oVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        G A12 = ((T) oVar).A1();
        boolean b10 = b(A12);
        List M10 = A12.M();
        ArrayList arrayList = new ArrayList(M10.size());
        int size = M10.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g10 = (G) M10.get(i10);
            if (b10) {
                list = g10.F();
            } else {
                list = g10.G();
            }
            arrayList.add(list);
        }
        return arrayList;
    }

    private static final boolean b(G g10) {
        int i10 = a.f3744a[g10.W().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 == 5) {
            G n02 = g10.n0();
            if (n02 != null) {
                return b(n02);
            }
            throw new IllegalArgumentException("no parent for idle node");
        }
        throw new C6535s();
    }
}
