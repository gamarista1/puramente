package Jg;

import Fg.N0;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class p {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63841a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Fg.N0[] r0 = Fg.N0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fg.N0 r1 = Fg.N0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Fg.N0 r1 = Fg.N0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Fg.N0 r1 = Fg.N0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63841a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jg.p.a.<clinit>():void");
        }
    }

    public static final s a(N0 n02) {
        C6496s.h(n02, "<this>");
        int i10 = a.f63841a[n02.ordinal()];
        if (i10 == 1) {
            return s.INV;
        }
        if (i10 == 2) {
            return s.IN;
        }
        if (i10 == 3) {
            return s.OUT;
        }
        throw new C6535s();
    }
}
