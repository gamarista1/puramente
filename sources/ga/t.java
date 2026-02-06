package ga;

import N9.C3070t;
import N9.T;
import N9.V;
import android.util.Pair;
import ja.M;
import java.util.Arrays;
import k9.b1;
import k9.c1;
import k9.n1;

public abstract class t extends A {

    /* renamed from: c  reason: collision with root package name */
    private a f43907c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f43908a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f43909b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f43910c;

        /* renamed from: d  reason: collision with root package name */
        private final V[] f43911d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f43912e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f43913f;

        /* renamed from: g  reason: collision with root package name */
        private final V f43914g;

        a(String[] strArr, int[] iArr, V[] vArr, int[] iArr2, int[][][] iArr3, V v10) {
            this.f43909b = strArr;
            this.f43910c = iArr;
            this.f43911d = vArr;
            this.f43913f = iArr3;
            this.f43912e = iArr2;
            this.f43914g = v10;
            this.f43908a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f43911d[i10].b(i11).f33189a;
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
                String str2 = this.f43911d[i10].b(i11).b(iArr[i12]).f45770l;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !M.c(str, str2);
                }
                i13 = Math.min(i13, b1.n(this.f43913f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            if (z10) {
                return Math.min(i13, this.f43912e[i10]);
            }
            return i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f43913f[i10][i11][i12];
        }

        public int d() {
            return this.f43908a;
        }

        public int e(int i10) {
            return this.f43910c[i10];
        }

        public V f(int i10) {
            return this.f43911d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return b1.B(c(i10, i11, i12));
        }

        public V h() {
            return this.f43914g;
        }
    }

    private static int i(b1[] b1VarArr, T t10, int[] iArr, boolean z10) {
        boolean z11;
        int length = b1VarArr.length;
        int i10 = 0;
        boolean z12 = true;
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < t10.f33189a; i13++) {
                i12 = Math.max(i12, b1.B(b1Var.a(t10.b(i13))));
            }
            if (iArr[i11] == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i12 > i10 || (i12 == i10 && z10 && !z12 && z11)) {
                length = i11;
                z12 = z11;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(b1 b1Var, T t10) {
        int[] iArr = new int[t10.f33189a];
        for (int i10 = 0; i10 < t10.f33189a; i10++) {
            iArr[i10] = b1Var.a(t10.b(i10));
        }
        return iArr;
    }

    private static int[] k(b1[] b1VarArr) {
        int length = b1VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = b1VarArr[i10].w();
        }
        return iArr;
    }

    public final void e(Object obj) {
        this.f43907c = (a) obj;
    }

    public final B g(b1[] b1VarArr, V v10, C3070t.b bVar, n1 n1Var) {
        boolean z10;
        int[] iArr;
        b1[] b1VarArr2 = b1VarArr;
        V v11 = v10;
        int[] iArr2 = new int[(b1VarArr2.length + 1)];
        int length = b1VarArr2.length + 1;
        T[][] tArr = new T[length][];
        int[][][] iArr3 = new int[(b1VarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = v11.f33196a;
            tArr[i10] = new T[i11];
            iArr3[i10] = new int[i11][];
        }
        int[] k10 = k(b1VarArr);
        for (int i12 = 0; i12 < v11.f33196a; i12++) {
            T b10 = v11.b(i12);
            if (b10.f33191c == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = i(b1VarArr, b10, iArr2, z10);
            if (i13 == b1VarArr2.length) {
                iArr = new int[b10.f33189a];
            } else {
                iArr = j(b1VarArr2[i13], b10);
            }
            int i14 = iArr2[i13];
            tArr[i13][i14] = b10;
            iArr3[i13][i14] = iArr;
            iArr2[i13] = i14 + 1;
        }
        V[] vArr = new V[b1VarArr2.length];
        String[] strArr = new String[b1VarArr2.length];
        int[] iArr4 = new int[b1VarArr2.length];
        for (int i15 = 0; i15 < b1VarArr2.length; i15++) {
            int i16 = iArr2[i15];
            vArr[i15] = new V((T[]) M.H0(tArr[i15], i16));
            iArr3[i15] = (int[][]) M.H0(iArr3[i15], i16);
            strArr[i15] = b1VarArr2[i15].getName();
            iArr4[i15] = b1VarArr2[i15].e();
        }
        a aVar = new a(strArr, iArr4, vArr, k10, iArr3, new V((T[]) M.H0(tArr[b1VarArr2.length], iArr2[b1VarArr2.length])));
        Pair l10 = l(aVar, iArr3, k10, bVar, n1Var);
        return new B((c1[]) l10.first, (r[]) l10.second, z.a(aVar, (u[]) l10.second), aVar);
    }

    /* access modifiers changed from: protected */
    public abstract Pair l(a aVar, int[][][] iArr, int[] iArr2, C3070t.b bVar, n1 n1Var);
}
