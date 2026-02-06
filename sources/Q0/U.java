package Q0;

import b1.l;
import c1.t;
import lf.C6535s;

public abstract class U {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5299a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f5299a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.U.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final A b(z zVar, y yVar) {
        if (zVar == null && yVar == null) {
            return null;
        }
        return C1320c.a(zVar, yVar);
    }

    public static final T c(T t10, T t11, float f10) {
        return new T(D.c(t10.N(), t11.N(), f10), C1339w.b(t10.M(), t11.M(), f10));
    }

    public static final T d(T t10, t tVar) {
        return new T(D.h(t10.y()), C1339w.e(t10.v(), tVar), t10.w());
    }

    public static final int e(t tVar, int i10) {
        l.a aVar = l.f19124b;
        if (l.j(i10, aVar.a())) {
            int i11 = a.f5299a[tVar.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new C6535s();
        } else if (!l.j(i10, aVar.f())) {
            return i10;
        } else {
            int i12 = a.f5299a[tVar.ordinal()];
            if (i12 == 1) {
                return aVar.d();
            }
            if (i12 == 2) {
                return aVar.e();
            }
            throw new C6535s();
        }
    }
}
