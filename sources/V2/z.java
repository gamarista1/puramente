package v2;

import android.util.Pair;
import androidx.media3.exoplayer.r0;
import f2.H;
import f2.I;
import i2.L;
import java.util.Arrays;
import t2.C2615C;
import t2.j0;

public abstract class z extends C {

    /* renamed from: c  reason: collision with root package name */
    private a f27137c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f27138a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f27139b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f27140c;

        /* renamed from: d  reason: collision with root package name */
        private final j0[] f27141d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f27142e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f27143f;

        /* renamed from: g  reason: collision with root package name */
        private final j0 f27144g;

        a(String[] strArr, int[] iArr, j0[] j0VarArr, int[] iArr2, int[][][] iArr3, j0 j0Var) {
            this.f27139b = strArr;
            this.f27140c = iArr;
            this.f27141d = j0VarArr;
            this.f27143f = iArr3;
            this.f27142e = iArr2;
            this.f27144g = j0Var;
            this.f27138a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f27141d[i10].b(i11).f19785a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f27141d[i10].b(i11).a(iArr[i12]).f20083n;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !L.c(str, str2);
                }
                i13 = Math.min(i13, r0.n(this.f27143f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            if (z10) {
                return Math.min(i13, this.f27142e[i10]);
            }
            return i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f27143f[i10][i11][i12];
        }

        public int d() {
            return this.f27138a;
        }

        public int e(int i10) {
            return this.f27140c[i10];
        }

        public j0 f(int i10) {
            return this.f27141d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return r0.B(c(i10, i11, i12));
        }

        public j0 h() {
            return this.f27144g;
        }
    }

    private static int n(r0[] r0VarArr, I i10, int[] iArr, boolean z10) {
        boolean z11;
        int length = r0VarArr.length;
        int i11 = 0;
        boolean z12 = true;
        for (int i12 = 0; i12 < r0VarArr.length; i12++) {
            r0 r0Var = r0VarArr[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i10.f19785a; i14++) {
                i13 = Math.max(i13, r0.B(r0Var.a(i10.a(i14))));
            }
            if (iArr[i12] == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i13 > i11 || (i13 == i11 && z10 && !z12 && z11)) {
                length = i12;
                z12 = z11;
                i11 = i13;
            }
        }
        return length;
    }

    private static int[] o(r0 r0Var, I i10) {
        int[] iArr = new int[i10.f19785a];
        for (int i11 = 0; i11 < i10.f19785a; i11++) {
            iArr[i11] = r0Var.a(i10.a(i11));
        }
        return iArr;
    }

    private static int[] p(r0[] r0VarArr) {
        int length = r0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = r0VarArr[i10].w();
        }
        return iArr;
    }

    public final void i(Object obj) {
        this.f27137c = (a) obj;
    }

    public final D k(r0[] r0VarArr, j0 j0Var, C2615C.b bVar, H h10) {
        boolean z10;
        int[] iArr;
        r0[] r0VarArr2 = r0VarArr;
        j0 j0Var2 = j0Var;
        int[] iArr2 = new int[(r0VarArr2.length + 1)];
        int length = r0VarArr2.length + 1;
        I[][] iArr3 = new I[length][];
        int[][][] iArr4 = new int[(r0VarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = j0Var2.f26271a;
            iArr3[i10] = new I[i11];
            iArr4[i10] = new int[i11][];
        }
        int[] p10 = p(r0VarArr);
        for (int i12 = 0; i12 < j0Var2.f26271a; i12++) {
            I b10 = j0Var2.b(i12);
            if (b10.f19787c == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            int n10 = n(r0VarArr, b10, iArr2, z10);
            if (n10 == r0VarArr2.length) {
                iArr = new int[b10.f19785a];
            } else {
                iArr = o(r0VarArr2[n10], b10);
            }
            int i13 = iArr2[n10];
            iArr3[n10][i13] = b10;
            iArr4[n10][i13] = iArr;
            iArr2[n10] = i13 + 1;
        }
        j0[] j0VarArr = new j0[r0VarArr2.length];
        String[] strArr = new String[r0VarArr2.length];
        int[] iArr5 = new int[r0VarArr2.length];
        for (int i14 = 0; i14 < r0VarArr2.length; i14++) {
            int i15 = iArr2[i14];
            j0VarArr[i14] = new j0((I[]) L.P0(iArr3[i14], i15));
            iArr4[i14] = (int[][]) L.P0(iArr4[i14], i15);
            strArr[i14] = r0VarArr2[i14].getName();
            iArr5[i14] = r0VarArr2[i14].e();
        }
        a aVar = new a(strArr, iArr5, j0VarArr, p10, iArr4, new j0((I[]) L.P0(iArr3[r0VarArr2.length], iArr2[r0VarArr2.length])));
        Pair q10 = q(aVar, iArr4, p10, bVar, h10);
        return new D((m2.z[]) q10.first, (x[]) q10.second, B.b(aVar, (C2750A[]) q10.second), aVar);
    }

    /* access modifiers changed from: protected */
    public abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, C2615C.b bVar, H h10);
}
