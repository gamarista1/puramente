package F4;

import G4.c;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30726a = c.a.a("x", "y");

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30727a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                G4.c$b[] r0 = G4.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30727a = r0
                G4.c$b r1 = G4.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30727a     // Catch:{ NoSuchFieldError -> 0x001d }
                G4.c$b r1 = G4.c.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30727a     // Catch:{ NoSuchFieldError -> 0x0028 }
                G4.c$b r1 = G4.c.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: F4.s.a.<clinit>():void");
        }
    }

    private static PointF a(c cVar, float f10) {
        cVar.b();
        float v10 = (float) cVar.v();
        float v11 = (float) cVar.v();
        while (cVar.M() != c.b.END_ARRAY) {
            cVar.V();
        }
        cVar.n();
        return new PointF(v10 * f10, v11 * f10);
    }

    private static PointF b(c cVar, float f10) {
        float v10 = (float) cVar.v();
        float v11 = (float) cVar.v();
        while (cVar.q()) {
            cVar.V();
        }
        return new PointF(v10 * f10, v11 * f10);
    }

    private static PointF c(c cVar, float f10) {
        cVar.f();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.q()) {
            int T10 = cVar.T(f30726a);
            if (T10 == 0) {
                f11 = g(cVar);
            } else if (T10 != 1) {
                cVar.U();
                cVar.V();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.o();
        return new PointF(f11 * f10, f12 * f10);
    }

    static int d(c cVar) {
        cVar.b();
        int v10 = (int) (cVar.v() * 255.0d);
        int v11 = (int) (cVar.v() * 255.0d);
        int v12 = (int) (cVar.v() * 255.0d);
        while (cVar.q()) {
            cVar.V();
        }
        cVar.n();
        return Color.argb(255, v10, v11, v12);
    }

    static PointF e(c cVar, float f10) {
        int i10 = a.f30727a[cVar.M().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.M());
    }

    static List f(c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.n();
        }
        cVar.n();
        return arrayList;
    }

    static float g(c cVar) {
        c.b M10 = cVar.M();
        int i10 = a.f30727a[M10.ordinal()];
        if (i10 == 1) {
            return (float) cVar.v();
        }
        if (i10 == 2) {
            cVar.b();
            float v10 = (float) cVar.v();
            while (cVar.q()) {
                cVar.V();
            }
            cVar.n();
            return v10;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + M10);
    }
}
