package Vc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    static final String[] f53440b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c  reason: collision with root package name */
    static final int[][] f53441c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f53442d;

    /* renamed from: e  reason: collision with root package name */
    static final int[][] f53443e;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f53444a;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[1] = 256;
        iArr[0] = 5;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        f53442d = iArr2;
        iArr2[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f53442d[0][i10] = i10 - 63;
        }
        f53442d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f53442d[1][i11] = i11 - 95;
        }
        f53442d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f53442d[2][i12] = i12 - 46;
        }
        int[] iArr3 = f53442d[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f53442d[3][iArr4[i13]] = i13;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr5[i14];
            if (i15 > 0) {
                f53442d[4][i15] = i14;
            }
        }
        int[] iArr6 = new int[2];
        iArr6[1] = 6;
        iArr6[0] = 6;
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, iArr6);
        f53443e = iArr7;
        for (int[] fill : iArr7) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr8 = f53443e;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public d(byte[] bArr) {
        this.f53444a = bArr;
    }

    private static Collection b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(fVar);
                    break;
                }
                f fVar2 = (f) it2.next();
                if (fVar2.f(fVar)) {
                    break;
                } else if (fVar.f(fVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i10, Collection collection) {
        boolean z10;
        char c10 = (char) (this.f53444a[i10] & 255);
        if (f53442d[fVar.e()][c10] > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f53442d[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i10);
                }
                if (!z10 || i11 == fVar.e() || i11 == 2) {
                    collection.add(fVar2.g(i11, i12));
                }
                if (!z10 && f53443e[fVar.e()][i11] >= 0) {
                    collection.add(fVar2.h(i11, i12));
                }
            }
        }
        if (fVar.c() > 0 || f53442d[fVar.e()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(f fVar, int i10, int i11, Collection collection) {
        f b10 = fVar.b(i10);
        collection.add(b10.g(4, i11));
        if (fVar.e() != 4) {
            collection.add(b10.h(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(b10.g(2, 16 - i11).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection e(Iterable iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((f) it.next(), i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection f(Iterable iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((f) it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Wc.a a() {
        /*
            r8 = this;
            Vc.f r0 = Vc.f.f53448e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0008:
            byte[] r3 = r8.f53444a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            Vc.d$a r1 = new Vc.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            Vc.f r0 = (Vc.f) r0
            byte[] r1 = r8.f53444a
            Wc.a r0 = r0.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vc.d.a():Wc.a");
    }
}
