package N9;

import java.util.Arrays;
import java.util.Random;

public interface O {

    public static class a implements O {

        /* renamed from: a  reason: collision with root package name */
        private final Random f33167a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f33168b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f33169c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        public int a() {
            return this.f33168b.length;
        }

        public O b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f33168b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f33168b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f33167a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public int c(int i10) {
            int i11 = this.f33169c[i10] - 1;
            if (i11 >= 0) {
                return this.f33168b[i11];
            }
            return -1;
        }

        public int d(int i10) {
            int i11 = this.f33169c[i10] + 1;
            int[] iArr = this.f33168b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public int e() {
            int[] iArr = this.f33168b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public O f() {
            return new a(0, new Random(this.f33167a.nextLong()));
        }

        public int g() {
            int[] iArr = this.f33168b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public O h(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f33167a.nextInt(this.f33168b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f33167a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f33168b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f33168b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f33167a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        private a(int i10, Random random) {
            this(i(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f33168b = iArr;
            this.f33167a = random;
            this.f33169c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f33169c[iArr[i10]] = i10;
            }
        }
    }

    int a();

    O b(int i10, int i11);

    int c(int i10);

    int d(int i10);

    int e();

    O f();

    int g();

    O h(int i10, int i11);
}
