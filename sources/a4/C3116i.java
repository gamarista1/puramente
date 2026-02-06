package a4;

import Ef.m;
import k4.C3666h;
import lf.C6535s;

/* renamed from: a4.i  reason: case insensitive filesystem */
public final class C3116i {

    /* renamed from: a  reason: collision with root package name */
    public static final C3116i f36055a = new C3116i();

    /* renamed from: a4.i$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36056a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                k4.h[] r0 = k4.C3666h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                k4.h r1 = k4.C3666h.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                k4.h r1 = k4.C3666h.FIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f36056a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.C3116i.a.<clinit>():void");
        }
    }

    private C3116i() {
    }

    public static final int a(int i10, int i11, int i12, int i13, C3666h hVar) {
        int i14;
        int highestOneBit = Integer.highestOneBit(i10 / i12);
        int highestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i15 = a.f36056a[hVar.ordinal()];
        if (i15 == 1) {
            i14 = Math.min(highestOneBit, highestOneBit2);
        } else if (i15 == 2) {
            i14 = Math.max(highestOneBit, highestOneBit2);
        } else {
            throw new C6535s();
        }
        return m.d(i14, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, C3666h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f36056a[hVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new C6535s();
    }

    public static final double c(int i10, int i11, int i12, int i13, C3666h hVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f36056a[hVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new C6535s();
    }
}
