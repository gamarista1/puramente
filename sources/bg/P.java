package Bg;

import Of.C5484b;
import Of.C5501t;
import Of.C5502u;
import ig.j;
import ig.x;
import kotlin.jvm.internal.C6496s;

public abstract class P {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62494a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f62495b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f62496c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
        static {
            /*
                ig.j[] r0 = ig.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ig.j r2 = ig.j.DECLARATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ig.j r3 = ig.j.FAKE_OVERRIDE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ig.j r4 = ig.j.DELEGATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ig.j r5 = ig.j.SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f62494a = r0
                Of.b$a[] r0 = Of.C5484b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Of.b$a r5 = Of.C5484b.a.DECLARATION     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                Of.b$a r5 = Of.C5484b.a.FAKE_OVERRIDE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                Of.b$a r5 = Of.C5484b.a.DELEGATION     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                Of.b$a r5 = Of.C5484b.a.SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f62495b = r0
                ig.x[] r0 = ig.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ig.x r5 = ig.x.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                ig.x r1 = ig.x.PRIVATE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                ig.x r1 = ig.x.PRIVATE_TO_THIS     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                ig.x r1 = ig.x.PROTECTED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                ig.x r1 = ig.x.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                ig.x r1 = ig.x.LOCAL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                f62496c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bg.P.a.<clinit>():void");
        }
    }

    public static final C5502u a(O o10, x xVar) {
        int i10;
        C6496s.h(o10, "<this>");
        if (xVar == null) {
            i10 = -1;
        } else {
            i10 = a.f62496c[xVar.ordinal()];
        }
        switch (i10) {
            case 1:
                C5502u uVar = C5501t.f64508d;
                C6496s.g(uVar, "INTERNAL");
                return uVar;
            case 2:
                C5502u uVar2 = C5501t.f64505a;
                C6496s.g(uVar2, "PRIVATE");
                return uVar2;
            case 3:
                C5502u uVar3 = C5501t.f64506b;
                C6496s.g(uVar3, "PRIVATE_TO_THIS");
                return uVar3;
            case 4:
                C5502u uVar4 = C5501t.f64507c;
                C6496s.g(uVar4, "PROTECTED");
                return uVar4;
            case 5:
                C5502u uVar5 = C5501t.f64509e;
                C6496s.g(uVar5, "PUBLIC");
                return uVar5;
            case 6:
                C5502u uVar6 = C5501t.f64510f;
                C6496s.g(uVar6, "LOCAL");
                return uVar6;
            default:
                C5502u uVar7 = C5501t.f64505a;
                C6496s.g(uVar7, "PRIVATE");
                return uVar7;
        }
    }

    public static final C5484b.a b(O o10, j jVar) {
        int i10;
        C6496s.h(o10, "<this>");
        if (jVar == null) {
            i10 = -1;
        } else {
            i10 = a.f62494a[jVar.ordinal()];
        }
        if (i10 == 1) {
            return C5484b.a.DECLARATION;
        }
        if (i10 == 2) {
            return C5484b.a.FAKE_OVERRIDE;
        }
        if (i10 == 3) {
            return C5484b.a.DELEGATION;
        }
        if (i10 != 4) {
            return C5484b.a.DECLARATION;
        }
        return C5484b.a.SYNTHESIZED;
    }
}
