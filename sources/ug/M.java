package Ug;

import ah.C5730a;
import ah.b;
import lf.C6535s;
import qf.C6658d;
import qf.f;
import sf.C6714a;
import yf.C6798l;
import yf.p;

public enum M {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65327a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                Ug.M[] r0 = Ug.M.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ug.M r1 = Ug.M.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ug.M r1 = Ug.M.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ug.M r1 = Ug.M.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Ug.M r1 = Ug.M.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f65327a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ug.M.a.<clinit>():void");
        }
    }

    static {
        M[] a10;
        f65326f = C6714a.a(a10);
    }

    public final void b(p pVar, Object obj, C6658d dVar) {
        int i10 = a.f65327a[ordinal()];
        if (i10 == 1) {
            C5730a.d(pVar, obj, dVar, (C6798l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.b(pVar, obj, dVar);
        } else if (i10 == 3) {
            b.a(pVar, obj, dVar);
        } else if (i10 != 4) {
            throw new C6535s();
        }
    }

    public final boolean c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
