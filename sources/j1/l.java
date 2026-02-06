package j1;

import i1.C2062d;
import i1.C2063e;
import i1.C2067i;
import j1.f;
import j1.p;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f22653k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22654a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j1.p$b[] r0 = j1.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22654a = r0
                j1.p$b r1 = j1.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22654a     // Catch:{ NoSuchFieldError -> 0x001d }
                j1.p$b r1 = j1.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22654a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j1.p$b r1 = j1.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.a.<clinit>():void");
        }
    }

    public l(C2063e eVar) {
        super(eVar);
        this.f22687h.f22632e = f.a.LEFT;
        this.f22688i.f22632e = f.a.RIGHT;
        this.f22685f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        if (r14 != 1) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(j1.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = j1.l.a.f22654a
            j1.p$b r1 = r8.f22689j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            i1.e r0 = r8.f22681b
            i1.d r1 = r0.f21896Q
            i1.d r0 = r0.f21900S
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            j1.g r0 = r8.f22684e
            boolean r0 = r0.f22637j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031f
            i1.e$b r0 = r8.f22683d
            i1.e$b r3 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031f
            i1.e r0 = r8.f22681b
            int r3 = r0.f21954w
            if (r3 == r1) goto L_0x0302
            if (r3 == r2) goto L_0x0046
            goto L_0x031f
        L_0x0046:
            int r1 = r0.f21956x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.y()
            if (r0 == r3) goto L_0x007a
            if (r0 == 0) goto L_0x006b
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0088
        L_0x005a:
            i1.e r0 = r8.f22681b
            j1.n r1 = r0.f21920f
            j1.g r1 = r1.f22684e
            int r1 = r1.f22634g
            float r1 = (float) r1
            float r0 = r0.x()
        L_0x0067:
            float r1 = r1 * r0
        L_0x0068:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x0088
        L_0x006b:
            i1.e r0 = r8.f22681b
            j1.n r1 = r0.f21920f
            j1.g r1 = r1.f22684e
            int r1 = r1.f22634g
            float r1 = (float) r1
            float r0 = r0.x()
            float r1 = r1 / r0
            goto L_0x0068
        L_0x007a:
            i1.e r0 = r8.f22681b
            j1.n r1 = r0.f21920f
            j1.g r1 = r1.f22684e
            int r1 = r1.f22634g
            float r1 = (float) r1
            float r0 = r0.x()
            goto L_0x0067
        L_0x0088:
            j1.g r1 = r8.f22684e
            r1.d(r0)
            goto L_0x031f
        L_0x008f:
            j1.n r1 = r0.f21920f
            j1.f r12 = r1.f22687h
            j1.f r13 = r1.f22688i
            i1.d r1 = r0.f21896Q
            i1.d r1 = r1.f21849f
            if (r1 == 0) goto L_0x009d
            r1 = r9
            goto L_0x009e
        L_0x009d:
            r1 = r10
        L_0x009e:
            i1.d r2 = r0.f21898R
            i1.d r2 = r2.f21849f
            if (r2 == 0) goto L_0x00a6
            r2 = r9
            goto L_0x00a7
        L_0x00a6:
            r2 = r10
        L_0x00a7:
            i1.d r4 = r0.f21900S
            i1.d r4 = r4.f21849f
            if (r4 == 0) goto L_0x00af
            r4 = r9
            goto L_0x00b0
        L_0x00af:
            r4 = r10
        L_0x00b0:
            i1.d r5 = r0.f21902T
            i1.d r5 = r5.f21849f
            if (r5 == 0) goto L_0x00b8
            r5 = r9
            goto L_0x00b9
        L_0x00b8:
            r5 = r10
        L_0x00b9:
            int r14 = r0.y()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            i1.e r0 = r8.f22681b
            float r15 = r0.x()
            boolean r0 = r12.f22637j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f22637j
            if (r0 == 0) goto L_0x012e
            j1.f r0 = r8.f22687h
            boolean r1 = r0.f22630c
            if (r1 == 0) goto L_0x012d
            j1.f r1 = r8.f22688i
            boolean r1 = r1.f22630c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            j1.f r1 = r8.f22687h
            int r1 = r1.f22633f
            int r2 = r0 + r1
            j1.f r0 = r8.f22688i
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            j1.f r1 = r8.f22688i
            int r1 = r1.f22633f
            int r3 = r0 - r1
            int r0 = r12.f22634g
            int r1 = r12.f22633f
            int r4 = r0 + r1
            int r0 = r13.f22634g
            int r1 = r13.f22633f
            int r5 = r0 - r1
            int[] r1 = f22653k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            j1.g r0 = r8.f22684e
            int[] r1 = f22653k
            r1 = r1[r10]
            r0.d(r1)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            int[] r1 = f22653k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            j1.f r0 = r8.f22687h
            boolean r1 = r0.f22637j
            if (r1 == 0) goto L_0x018b
            j1.f r1 = r8.f22688i
            boolean r2 = r1.f22637j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f22630c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f22630c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f22634g
            int r0 = r0.f22633f
            int r2 = r2 + r0
            int r0 = r1.f22634g
            int r1 = r1.f22633f
            int r3 = r0 - r1
            java.util.List r0 = r12.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            int r1 = r12.f22633f
            int r4 = r0 + r1
            java.util.List r0 = r13.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            int r1 = r13.f22633f
            int r5 = r0 - r1
            int[] r1 = f22653k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            j1.g r0 = r8.f22684e
            int[] r1 = f22653k
            r1 = r1[r10]
            r0.d(r1)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            int[] r1 = f22653k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            j1.f r0 = r8.f22687h
            boolean r1 = r0.f22630c
            if (r1 == 0) goto L_0x01ff
            j1.f r1 = r8.f22688i
            boolean r1 = r1.f22630c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f22630c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f22630c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            j1.f r1 = r8.f22687h
            int r1 = r1.f22633f
            int r2 = r0 + r1
            j1.f r0 = r8.f22688i
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            j1.f r1 = r8.f22688i
            int r1 = r1.f22633f
            int r3 = r0 - r1
            java.util.List r0 = r12.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            int r1 = r12.f22633f
            int r4 = r0 + r1
            java.util.List r0 = r13.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            int r0 = r0.f22634g
            int r1 = r13.f22633f
            int r5 = r0 - r1
            int[] r1 = f22653k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            j1.g r0 = r8.f22684e
            int[] r1 = f22653k
            r1 = r1[r10]
            r0.d(r1)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            int[] r1 = f22653k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x031f
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x0289
            if (r4 == 0) goto L_0x0289
            j1.f r0 = r8.f22687h
            boolean r0 = r0.f22630c
            if (r0 == 0) goto L_0x0288
            j1.f r0 = r8.f22688i
            boolean r0 = r0.f22630c
            if (r0 != 0) goto L_0x0212
            goto L_0x0288
        L_0x0212:
            i1.e r0 = r8.f22681b
            float r0 = r0.x()
            j1.f r1 = r8.f22687h
            java.util.List r1 = r1.f22639l
            java.lang.Object r1 = r1.get(r10)
            j1.f r1 = (j1.f) r1
            int r1 = r1.f22634g
            j1.f r2 = r8.f22687h
            int r2 = r2.f22633f
            int r1 = r1 + r2
            j1.f r2 = r8.f22688i
            java.util.List r2 = r2.f22639l
            java.lang.Object r2 = r2.get(r10)
            j1.f r2 = (j1.f) r2
            int r2 = r2.f22634g
            j1.f r4 = r8.f22688i
            int r4 = r4.f22633f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0265
            if (r14 == 0) goto L_0x0265
            if (r14 == r9) goto L_0x0242
            goto L_0x031f
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0255
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0255:
            j1.g r0 = r8.f22684e
            r0.d(r1)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            r0.d(r3)
            goto L_0x031f
        L_0x0265:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0278
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0278:
            j1.g r0 = r8.f22684e
            r0.d(r1)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            r0.d(r3)
            goto L_0x031f
        L_0x0288:
            return
        L_0x0289:
            if (r2 == 0) goto L_0x031f
            if (r5 == 0) goto L_0x031f
            boolean r0 = r12.f22630c
            if (r0 == 0) goto L_0x0301
            boolean r0 = r13.f22630c
            if (r0 != 0) goto L_0x0296
            goto L_0x0301
        L_0x0296:
            i1.e r0 = r8.f22681b
            float r0 = r0.x()
            java.util.List r1 = r12.f22639l
            java.lang.Object r1 = r1.get(r10)
            j1.f r1 = (j1.f) r1
            int r1 = r1.f22634g
            int r2 = r12.f22633f
            int r1 = r1 + r2
            java.util.List r2 = r13.f22639l
            java.lang.Object r2 = r2.get(r10)
            j1.f r2 = (j1.f) r2
            int r2 = r2.f22634g
            int r4 = r13.f22633f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02df
            if (r14 == 0) goto L_0x02bd
            if (r14 == r9) goto L_0x02df
            goto L_0x031f
        L_0x02bd:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d0
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d0:
            j1.g r0 = r8.f22684e
            r0.d(r3)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            r0.d(r1)
            goto L_0x031f
        L_0x02df:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f2
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f2:
            j1.g r0 = r8.f22684e
            r0.d(r3)
            i1.e r0 = r8.f22681b
            j1.n r0 = r0.f21920f
            j1.g r0 = r0.f22684e
            r0.d(r1)
            goto L_0x031f
        L_0x0301:
            return
        L_0x0302:
            i1.e r0 = r0.M()
            if (r0 == 0) goto L_0x031f
            j1.l r0 = r0.f21918e
            j1.g r0 = r0.f22684e
            boolean r1 = r0.f22637j
            if (r1 == 0) goto L_0x031f
            i1.e r1 = r8.f22681b
            float r1 = r1.f21866B
            int r0 = r0.f22634g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            j1.g r1 = r8.f22684e
            r1.d(r0)
        L_0x031f:
            j1.f r0 = r8.f22687h
            boolean r1 = r0.f22630c
            if (r1 == 0) goto L_0x043f
            j1.f r1 = r8.f22688i
            boolean r2 = r1.f22630c
            if (r2 != 0) goto L_0x032d
            goto L_0x043f
        L_0x032d:
            boolean r0 = r0.f22637j
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1.f22637j
            if (r0 == 0) goto L_0x033c
            j1.g r0 = r8.f22684e
            boolean r0 = r0.f22637j
            if (r0 == 0) goto L_0x033c
            return
        L_0x033c:
            j1.g r0 = r8.f22684e
            boolean r0 = r0.f22637j
            if (r0 != 0) goto L_0x0386
            i1.e$b r0 = r8.f22683d
            i1.e$b r1 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0386
            i1.e r0 = r8.f22681b
            int r1 = r0.f21954w
            if (r1 != 0) goto L_0x0386
            boolean r0 = r0.k0()
            if (r0 != 0) goto L_0x0386
            j1.f r0 = r8.f22687h
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            j1.f r1 = r8.f22688i
            java.util.List r1 = r1.f22639l
            java.lang.Object r1 = r1.get(r10)
            j1.f r1 = (j1.f) r1
            int r0 = r0.f22634g
            j1.f r2 = r8.f22687h
            int r3 = r2.f22633f
            int r0 = r0 + r3
            int r1 = r1.f22634g
            j1.f r3 = r8.f22688i
            int r3 = r3.f22633f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            j1.f r0 = r8.f22688i
            r0.d(r1)
            j1.g r0 = r8.f22684e
            r0.d(r3)
            return
        L_0x0386:
            j1.g r0 = r8.f22684e
            boolean r0 = r0.f22637j
            if (r0 != 0) goto L_0x03ea
            i1.e$b r0 = r8.f22683d
            i1.e$b r1 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ea
            int r0 = r8.f22680a
            if (r0 != r9) goto L_0x03ea
            j1.f r0 = r8.f22687h
            java.util.List r0 = r0.f22639l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            j1.f r0 = r8.f22688i
            java.util.List r0 = r0.f22639l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            j1.f r0 = r8.f22687h
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            j1.f r1 = r8.f22688i
            java.util.List r1 = r1.f22639l
            java.lang.Object r1 = r1.get(r10)
            j1.f r1 = (j1.f) r1
            int r0 = r0.f22634g
            j1.f r2 = r8.f22687h
            int r2 = r2.f22633f
            int r0 = r0 + r2
            int r1 = r1.f22634g
            j1.f r2 = r8.f22688i
            int r2 = r2.f22633f
            int r1 = r1 + r2
            int r1 = r1 - r0
            j1.g r0 = r8.f22684e
            int r0 = r0.f22649m
            int r0 = java.lang.Math.min(r1, r0)
            i1.e r1 = r8.f22681b
            int r2 = r1.f21864A
            int r1 = r1.f21960z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e5
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e5:
            j1.g r1 = r8.f22684e
            r1.d(r0)
        L_0x03ea:
            j1.g r0 = r8.f22684e
            boolean r0 = r0.f22637j
            if (r0 != 0) goto L_0x03f1
            return
        L_0x03f1:
            j1.f r0 = r8.f22687h
            java.util.List r0 = r0.f22639l
            java.lang.Object r0 = r0.get(r10)
            j1.f r0 = (j1.f) r0
            j1.f r1 = r8.f22688i
            java.util.List r1 = r1.f22639l
            java.lang.Object r1 = r1.get(r10)
            j1.f r1 = (j1.f) r1
            int r2 = r0.f22634g
            j1.f r3 = r8.f22687h
            int r3 = r3.f22633f
            int r2 = r2 + r3
            int r3 = r1.f22634g
            j1.f r4 = r8.f22688i
            int r4 = r4.f22633f
            int r3 = r3 + r4
            i1.e r4 = r8.f22681b
            float r4 = r4.A()
            if (r0 != r1) goto L_0x0420
            int r2 = r0.f22634g
            int r3 = r1.f22634g
            r4 = r11
        L_0x0420:
            int r3 = r3 - r2
            j1.g r0 = r8.f22684e
            int r0 = r0.f22634g
            int r3 = r3 - r0
            j1.f r0 = r8.f22687h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            j1.f r0 = r8.f22688i
            j1.f r1 = r8.f22687h
            int r1 = r1.f22634g
            j1.g r2 = r8.f22684e
            int r2 = r2.f22634g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x043f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.l.a(j1.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        C2063e M10;
        C2063e M11;
        C2063e eVar = this.f22681b;
        if (eVar.f21910a) {
            this.f22684e.d(eVar.Y());
        }
        if (!this.f22684e.f22637j) {
            C2063e.b C10 = this.f22681b.C();
            this.f22683d = C10;
            if (C10 != C2063e.b.MATCH_CONSTRAINT) {
                C2063e.b bVar = C2063e.b.MATCH_PARENT;
                if (C10 == bVar && (M11 = this.f22681b.M()) != null && (M11.C() == C2063e.b.FIXED || M11.C() == bVar)) {
                    int Y10 = (M11.Y() - this.f22681b.f21896Q.f()) - this.f22681b.f21900S.f();
                    b(this.f22687h, M11.f21918e.f22687h, this.f22681b.f21896Q.f());
                    b(this.f22688i, M11.f21918e.f22688i, -this.f22681b.f21900S.f());
                    this.f22684e.d(Y10);
                    return;
                } else if (this.f22683d == C2063e.b.FIXED) {
                    this.f22684e.d(this.f22681b.Y());
                }
            }
        } else {
            C2063e.b bVar2 = this.f22683d;
            C2063e.b bVar3 = C2063e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (M10 = this.f22681b.M()) != null && (M10.C() == C2063e.b.FIXED || M10.C() == bVar3)) {
                b(this.f22687h, M10.f21918e.f22687h, this.f22681b.f21896Q.f());
                b(this.f22688i, M10.f21918e.f22688i, -this.f22681b.f21900S.f());
                return;
            }
        }
        g gVar = this.f22684e;
        if (gVar.f22637j) {
            C2063e eVar2 = this.f22681b;
            if (eVar2.f21910a) {
                C2062d[] dVarArr = eVar2.f21908Y;
                C2062d dVar = dVarArr[0];
                C2062d dVar2 = dVar.f21849f;
                if (dVar2 == null || dVarArr[1].f21849f == null) {
                    if (dVar2 != null) {
                        f h10 = h(dVar);
                        if (h10 != null) {
                            b(this.f22687h, h10, this.f22681b.f21908Y[0].f());
                            b(this.f22688i, this.f22687h, this.f22684e.f22634g);
                            return;
                        }
                        return;
                    }
                    C2062d dVar3 = dVarArr[1];
                    if (dVar3.f21849f != null) {
                        f h11 = h(dVar3);
                        if (h11 != null) {
                            b(this.f22688i, h11, -this.f22681b.f21908Y[1].f());
                            b(this.f22687h, this.f22688i, -this.f22684e.f22634g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C2067i) && eVar2.M() != null && this.f22681b.q(C2062d.a.CENTER).f21849f == null) {
                        b(this.f22687h, this.f22681b.M().f21918e.f22687h, this.f22681b.Z());
                        b(this.f22688i, this.f22687h, this.f22684e.f22634g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.k0()) {
                    this.f22687h.f22633f = this.f22681b.f21908Y[0].f();
                    this.f22688i.f22633f = -this.f22681b.f21908Y[1].f();
                    return;
                } else {
                    f h12 = h(this.f22681b.f21908Y[0]);
                    if (h12 != null) {
                        b(this.f22687h, h12, this.f22681b.f21908Y[0].f());
                    }
                    f h13 = h(this.f22681b.f21908Y[1]);
                    if (h13 != null) {
                        b(this.f22688i, h13, -this.f22681b.f21908Y[1].f());
                    }
                    this.f22687h.f22629b = true;
                    this.f22688i.f22629b = true;
                    return;
                }
            }
        }
        if (this.f22683d == C2063e.b.MATCH_CONSTRAINT) {
            C2063e eVar3 = this.f22681b;
            int i10 = eVar3.f21954w;
            if (i10 == 2) {
                C2063e M12 = eVar3.M();
                if (M12 != null) {
                    g gVar2 = M12.f21920f.f22684e;
                    this.f22684e.f22639l.add(gVar2);
                    gVar2.f22638k.add(this.f22684e);
                    g gVar3 = this.f22684e;
                    gVar3.f22629b = true;
                    gVar3.f22638k.add(this.f22687h);
                    this.f22684e.f22638k.add(this.f22688i);
                }
            } else if (i10 == 3) {
                if (eVar3.f21956x == 3) {
                    this.f22687h.f22628a = this;
                    this.f22688i.f22628a = this;
                    n nVar = eVar3.f21920f;
                    nVar.f22687h.f22628a = this;
                    nVar.f22688i.f22628a = this;
                    gVar.f22628a = this;
                    if (eVar3.m0()) {
                        this.f22684e.f22639l.add(this.f22681b.f21920f.f22684e);
                        this.f22681b.f21920f.f22684e.f22638k.add(this.f22684e);
                        n nVar2 = this.f22681b.f21920f;
                        nVar2.f22684e.f22628a = this;
                        this.f22684e.f22639l.add(nVar2.f22687h);
                        this.f22684e.f22639l.add(this.f22681b.f21920f.f22688i);
                        this.f22681b.f21920f.f22687h.f22638k.add(this.f22684e);
                        this.f22681b.f21920f.f22688i.f22638k.add(this.f22684e);
                    } else if (this.f22681b.k0()) {
                        this.f22681b.f21920f.f22684e.f22639l.add(this.f22684e);
                        this.f22684e.f22638k.add(this.f22681b.f21920f.f22684e);
                    } else {
                        this.f22681b.f21920f.f22684e.f22639l.add(this.f22684e);
                    }
                } else {
                    g gVar4 = eVar3.f21920f.f22684e;
                    gVar.f22639l.add(gVar4);
                    gVar4.f22638k.add(this.f22684e);
                    this.f22681b.f21920f.f22687h.f22638k.add(this.f22684e);
                    this.f22681b.f21920f.f22688i.f22638k.add(this.f22684e);
                    g gVar5 = this.f22684e;
                    gVar5.f22629b = true;
                    gVar5.f22638k.add(this.f22687h);
                    this.f22684e.f22638k.add(this.f22688i);
                    this.f22687h.f22639l.add(this.f22684e);
                    this.f22688i.f22639l.add(this.f22684e);
                }
            }
        }
        C2063e eVar4 = this.f22681b;
        C2062d[] dVarArr2 = eVar4.f21908Y;
        C2062d dVar4 = dVarArr2[0];
        C2062d dVar5 = dVar4.f21849f;
        if (dVar5 == null || dVarArr2[1].f21849f == null) {
            if (dVar5 != null) {
                f h14 = h(dVar4);
                if (h14 != null) {
                    b(this.f22687h, h14, this.f22681b.f21908Y[0].f());
                    c(this.f22688i, this.f22687h, 1, this.f22684e);
                    return;
                }
                return;
            }
            C2062d dVar6 = dVarArr2[1];
            if (dVar6.f21849f != null) {
                f h15 = h(dVar6);
                if (h15 != null) {
                    b(this.f22688i, h15, -this.f22681b.f21908Y[1].f());
                    c(this.f22687h, this.f22688i, -1, this.f22684e);
                }
            } else if (!(eVar4 instanceof C2067i) && eVar4.M() != null) {
                b(this.f22687h, this.f22681b.M().f21918e.f22687h, this.f22681b.Z());
                c(this.f22688i, this.f22687h, 1, this.f22684e);
            }
        } else if (eVar4.k0()) {
            this.f22687h.f22633f = this.f22681b.f21908Y[0].f();
            this.f22688i.f22633f = -this.f22681b.f21908Y[1].f();
        } else {
            f h16 = h(this.f22681b.f21908Y[0]);
            f h17 = h(this.f22681b.f21908Y[1]);
            if (h16 != null) {
                h16.b(this);
            }
            if (h17 != null) {
                h17.b(this);
            }
            this.f22689j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f22687h;
        if (fVar.f22637j) {
            this.f22681b.r1(fVar.f22634g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f22682c = null;
        this.f22687h.c();
        this.f22688i.c();
        this.f22684e.c();
        this.f22686g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f22683d != C2063e.b.MATCH_CONSTRAINT || this.f22681b.f21954w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f22686g = false;
        this.f22687h.c();
        this.f22687h.f22637j = false;
        this.f22688i.c();
        this.f22688i.f22637j = false;
        this.f22684e.f22637j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f22681b.v();
    }
}
