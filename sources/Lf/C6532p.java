package lf;

import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

/* renamed from: lf.p  reason: case insensitive filesystem */
abstract class C6532p {

    /* renamed from: lf.p$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lf.r[] r0 = lf.C6534r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lf.r r1 = lf.C6534r.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lf.r r1 = lf.C6534r.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lf.r r1 = lf.C6534r.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f71835a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.C6532p.a.<clinit>():void");
        }
    }

    public static Lazy a(C6534r rVar, C6787a aVar) {
        C6496s.h(rVar, "mode");
        C6496s.h(aVar, "initializer");
        int i10 = a.f71835a[rVar.ordinal()];
        if (i10 == 1) {
            return new y(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i10 == 2) {
            return new x(aVar);
        }
        if (i10 == 3) {
            return new C6515N(aVar);
        }
        throw new C6535s();
    }

    public static Lazy b(C6787a aVar) {
        C6496s.h(aVar, "initializer");
        return new y(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
