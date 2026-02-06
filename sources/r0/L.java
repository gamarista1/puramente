package R0;

import Ef.m;
import Sg.p;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    private final Layout f5510a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5511b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5512c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f5513d;

    /* renamed from: e  reason: collision with root package name */
    private char[] f5514e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5515f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5516a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5517b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5518c;

        public a(int i10, int i11, boolean z10) {
            this.f5516a = i10;
            this.f5517b = i11;
            this.f5518c = z10;
        }

        public final int a() {
            return this.f5517b;
        }

        public final int b() {
            return this.f5516a;
        }

        public final boolean c() {
            return this.f5518c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5516a == aVar.f5516a && this.f5517b == aVar.f5517b && this.f5518c == aVar.f5518c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f5516a) * 31) + Integer.hashCode(this.f5517b)) * 31) + Boolean.hashCode(this.f5518c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f5516a + ", end=" + this.f5517b + ", isRtl=" + this.f5518c + ')';
        }
    }

    public L(Layout layout) {
        int i10;
        this.f5510a = layout;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            int a02 = p.a0(this.f5510a.getText(), 10, i11, false, 4, (Object) null);
            if (a02 < 0) {
                i10 = this.f5510a.getText().length();
            } else {
                i10 = a02 + 1;
            }
            i11 = i10;
            arrayList.add(Integer.valueOf(i11));
        } while (i11 < this.f5510a.getText().length());
        this.f5511b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add((Object) null);
        }
        this.f5512c = arrayList2;
        this.f5513d = new boolean[this.f5511b.size()];
        this.f5515f = this.f5511b.size();
    }

    private final float b(int i10, boolean z10) {
        int h10 = m.h(i10, this.f5510a.getLineEnd(this.f5510a.getLineForOffset(i10)));
        if (z10) {
            return this.f5510a.getPrimaryHorizontal(h10);
        }
        return this.f5510a.getSecondaryHorizontal(h10);
    }

    public static /* synthetic */ int g(L l10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return l10.f(i10, z10);
    }

    private final int k(int i10, int i11) {
        while (i10 > i11 && i(this.f5510a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r3.getRunCount() == 1) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f5513d
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r11.f5512c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0022
        L_0x0014:
            java.util.List r1 = r11.f5511b
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List r2 = r11.f5511b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f5514e
            if (r3 == 0) goto L_0x003a
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r10 = r3
            goto L_0x003d
        L_0x003a:
            char[] r3 = new char[r8]
            goto L_0x0038
        L_0x003d:
            android.text.Layout r3 = r11.f5510a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            boolean r9 = r11.j(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            java.util.List r3 = r11.f5512c
            r3.set(r12, r0)
            boolean[] r3 = r11.f5513d
            r3[r12] = r2
            if (r0 == 0) goto L_0x0075
            char[] r12 = r11.f5514e
            if (r10 != r12) goto L_0x0074
            r10 = r1
            goto L_0x0075
        L_0x0074:
            r10 = r12
        L_0x0075:
            r11.f5514e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.L.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        Bidi bidi;
        boolean z12;
        int i11 = i10;
        boolean z13 = z11;
        if (!z13) {
            return b(i10, z10);
        }
        int a10 = K.a(this.f5510a, i11, z13);
        int lineStart = this.f5510a.getLineStart(a10);
        int lineEnd = this.f5510a.getLineEnd(a10);
        if (i11 != lineStart && i11 != lineEnd) {
            return b(i10, z10);
        }
        if (i11 == 0 || i11 == this.f5510a.getText().length()) {
            return b(i10, z10);
        }
        int f10 = f(i11, z13);
        boolean j10 = j(f10);
        int k10 = k(lineEnd, lineStart);
        int h10 = h(f10);
        int i12 = lineStart - h10;
        int i13 = k10 - h10;
        Bidi a11 = a(f10);
        if (a11 != null) {
            bidi = a11.createLineBidi(i12, i13);
        } else {
            bidi = null;
        }
        boolean z14 = false;
        if (bidi == null || bidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.f5510a.isRtlCharAt(lineStart);
            if (z10 || j10 == isRtlCharAt) {
                if (!j10) {
                    j10 = true;
                } else {
                    j10 = false;
                }
            }
            if (i11 == lineStart) {
                z14 = j10;
            } else if (!j10) {
                z14 = true;
            }
            Layout layout = this.f5510a;
            if (z14) {
                return layout.getLineLeft(a10);
            }
            return layout.getLineRight(a10);
        }
        int runCount = bidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            int runStart = bidi.getRunStart(i14) + lineStart;
            int runLimit = bidi.getRunLimit(i14) + lineStart;
            if (bidi.getRunLevel(i14) % 2 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            aVarArr[i14] = new a(runStart, runLimit, z12);
        }
        int runCount2 = bidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) bidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i16 = -1;
        if (i11 == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    break;
                } else if (aVarArr[i17].b() == i11) {
                    i16 = i17;
                    break;
                } else {
                    i17++;
                }
            }
            a aVar = aVarArr[i16];
            if (z10 || j10 == aVar.c()) {
                if (!j10) {
                    j10 = true;
                } else {
                    j10 = false;
                }
            }
            if (i16 == 0 && j10) {
                return this.f5510a.getLineLeft(a10);
            }
            if (i16 == C6559l.j0(aVarArr) && !j10) {
                return this.f5510a.getLineRight(a10);
            }
            if (j10) {
                return this.f5510a.getPrimaryHorizontal(aVarArr[i16 - 1].b());
            }
            return this.f5510a.getPrimaryHorizontal(aVarArr[i16 + 1].b());
        }
        if (i11 > k10) {
            i11 = k(i11, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                break;
            } else if (aVarArr[i18].a() == i11) {
                i16 = i18;
                break;
            } else {
                i18++;
            }
        }
        a aVar2 = aVarArr[i16];
        if (!z10 && j10 != aVar2.c()) {
            j10 = !j10;
        }
        if (i16 == 0 && j10) {
            return this.f5510a.getLineLeft(a10);
        }
        if (i16 == C6559l.j0(aVarArr) && !j10) {
            return this.f5510a.getLineRight(a10);
        }
        if (j10) {
            return this.f5510a.getPrimaryHorizontal(aVarArr[i16 - 1].a());
        }
        return this.f5510a.getPrimaryHorizontal(aVarArr[i16 + 1].a());
    }

    public final a[] d(int i10) {
        Bidi createLineBidi;
        int lineStart = this.f5510a.getLineStart(i10);
        int lineEnd = this.f5510a.getLineEnd(i10);
        int g10 = g(this, lineStart, false, 2, (Object) null);
        int h10 = h(g10);
        int i11 = lineStart - h10;
        int i12 = lineEnd - h10;
        Bidi a10 = a(g10);
        if (a10 == null || (createLineBidi = a10.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f5510a.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = createLineBidi.getRunStart(i13) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (createLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    public final int e(int i10) {
        return k(this.f5510a.getLineEnd(i10), this.f5510a.getLineStart(i10));
    }

    public final int f(int i10, boolean z10) {
        int i11;
        int m10 = C6565s.m(this.f5511b, Integer.valueOf(i10), 0, 0, 6, (Object) null);
        if (m10 < 0) {
            i11 = -(m10 + 1);
        } else {
            i11 = m10 + 1;
        }
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) this.f5511b.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f5511b.get(i10 - 1)).intValue();
    }

    public final boolean i(char c10) {
        if (c10 == ' ' || c10 == 10 || c10 == 5760 || ((C6496s.i(c10, 8192) >= 0 && C6496s.i(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288)) {
            return true;
        }
        return false;
    }

    public final boolean j(int i10) {
        if (this.f5510a.getParagraphDirection(this.f5510a.getLineForOffset(h(i10))) == -1) {
            return true;
        }
        return false;
    }
}
