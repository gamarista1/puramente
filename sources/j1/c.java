package j1;

import i1.C2062d;
import i1.C2063e;
import i1.C2064f;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList f22617k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private int f22618l;

    public c(C2063e eVar, int i10) {
        super(eVar);
        this.f22685f = i10;
        q();
    }

    private void q() {
        C2063e eVar;
        int i10;
        C2063e eVar2 = this.f22681b;
        C2063e N10 = eVar2.N(this.f22685f);
        while (true) {
            C2063e eVar3 = N10;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            N10 = eVar2.N(this.f22685f);
        }
        this.f22681b = eVar;
        this.f22617k.add(eVar.P(this.f22685f));
        C2063e L10 = eVar.L(this.f22685f);
        while (L10 != null) {
            this.f22617k.add(L10.P(this.f22685f));
            L10 = L10.L(this.f22685f);
        }
        Iterator it = this.f22617k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i11 = this.f22685f;
            if (i11 == 0) {
                pVar.f22681b.f21914c = this;
            } else if (i11 == 1) {
                pVar.f22681b.f21916d = this;
            }
        }
        if (this.f22685f == 0 && ((C2064f) this.f22681b.M()).V1() && this.f22617k.size() > 1) {
            ArrayList arrayList = this.f22617k;
            this.f22681b = ((p) arrayList.get(arrayList.size() - 1)).f22681b;
        }
        if (this.f22685f == 0) {
            i10 = this.f22681b.B();
        } else {
            i10 = this.f22681b.U();
        }
        this.f22618l = i10;
    }

    private C2063e r() {
        for (int i10 = 0; i10 < this.f22617k.size(); i10++) {
            p pVar = (p) this.f22617k.get(i10);
            if (pVar.f22681b.X() != 8) {
                return pVar.f22681b;
            }
        }
        return null;
    }

    private C2063e s() {
        for (int size = this.f22617k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f22617k.get(size);
            if (pVar.f22681b.X() != 8) {
                return pVar.f22681b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(j1.d r27) {
        /*
            r26 = this;
            r0 = r26
            j1.f r1 = r0.f22687h
            boolean r1 = r1.f22637j
            if (r1 == 0) goto L_0x0425
            j1.f r1 = r0.f22688i
            boolean r1 = r1.f22637j
            if (r1 != 0) goto L_0x0010
            goto L_0x0425
        L_0x0010:
            i1.e r1 = r0.f22681b
            i1.e r1 = r1.M()
            boolean r2 = r1 instanceof i1.C2064f
            if (r2 == 0) goto L_0x0021
            i1.f r1 = (i1.C2064f) r1
            boolean r1 = r1.V1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            j1.f r2 = r0.f22688i
            int r2 = r2.f22634g
            j1.f r4 = r0.f22687h
            int r4 = r4.f22634g
            int r2 = r2 - r4
            java.util.ArrayList r4 = r0.f22617k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList r8 = r0.f22617k
            java.lang.Object r8 = r8.get(r5)
            j1.p r8 = (j1.p) r8
            i1.e r8 = r8.f22681b
            int r8 = r8.X()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList r10 = r0.f22617k
            java.lang.Object r10 = r10.get(r9)
            j1.p r10 = (j1.p) r10
            i1.e r10 = r10.f22681b
            int r10 = r10.X()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList r3 = r0.f22617k
            java.lang.Object r3 = r3.get(r13)
            j1.p r3 = (j1.p) r3
            i1.e r11 = r3.f22681b
            int r11 = r11.X()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            j1.f r11 = r3.f22687h
            int r11 = r11.f22633f
            int r14 = r14 + r11
        L_0x008e:
            j1.g r11 = r3.f22684e
            int r7 = r11.f22634g
            i1.e$b r10 = r3.f22683d
            i1.e$b r12 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f22685f
            if (r11 != 0) goto L_0x00ac
            i1.e r12 = r3.f22681b
            j1.l r12 = r12.f21918e
            j1.g r12 = r12.f22684e
            boolean r12 = r12.f22637j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            i1.e r11 = r3.f22681b
            j1.n r11 = r11.f21920f
            j1.g r11 = r11.f22684e
            boolean r11 = r11.f22637j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f22680a
            if (r7 != r12) goto L_0x00cc
            if (r9 != 0) goto L_0x00cc
            int r7 = r11.f22649m
            int r15 = r15 + 1
        L_0x00ca:
            r10 = 1
            goto L_0x00d5
        L_0x00cc:
            boolean r7 = r11.f22637j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
            goto L_0x00ca
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            i1.e r7 = r3.f22681b
            float[] r7 = r7.f21891N0
            int r10 = r0.f22685f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            j1.f r3 = r3.f22688i
            int r3 = r3.f22633f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            j1.f r7 = r0.f22687h
            int r7 = r7.f22634g
            if (r1 == 0) goto L_0x0118
            j1.f r7 = r0.f22688i
            int r7 = r7.f22634g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0223
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d7
            java.util.ArrayList r9 = r0.f22617k
            java.lang.Object r9 = r9.get(r12)
            j1.p r9 = (j1.p) r9
            r19 = r11
            i1.e r11 = r9.f22681b
            int r11 = r11.X()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x015d
        L_0x0153:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
            goto L_0x01c5
        L_0x015d:
            i1.e$b r11 = r9.f22683d
            i1.e$b r14 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x0153
            j1.g r11 = r9.f22684e
            boolean r14 = r11.f22637j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0180
            i1.e r14 = r9.f22681b
            float[] r14 = r14.f21891N0
            r21 = r7
            int r7 = r0.f22685f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0184
        L_0x0180:
            r21 = r7
            r7 = r19
        L_0x0184:
            int r14 = r0.f22685f
            if (r14 != 0) goto L_0x0193
            i1.e r14 = r9.f22681b
            r22 = r10
            int r10 = r14.f21864A
            int r14 = r14.f21960z
            r23 = r1
            goto L_0x01a2
        L_0x0193:
            r22 = r10
            i1.e r10 = r9.f22681b
            int r14 = r10.f21870D
            int r10 = r10.f21868C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x01a2:
            int r1 = r9.f22680a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01b0
            int r1 = r11.f22649m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01b1
        L_0x01b0:
            r1 = r7
        L_0x01b1:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01bb
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01bb:
            if (r1 == r7) goto L_0x01c0
            int r13 = r13 + 1
            r7 = r1
        L_0x01c0:
            j1.g r1 = r9.f22684e
            r1.d(r7)
        L_0x01c5:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d7:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0214
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01e4:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList r3 = r0.f22617k
            java.lang.Object r3 = r3.get(r1)
            j1.p r3 = (j1.p) r3
            i1.e r7 = r3.f22681b
            int r7 = r7.X()
            r9 = 8
            if (r7 != r9) goto L_0x01f9
            goto L_0x0211
        L_0x01f9:
            if (r1 <= 0) goto L_0x0202
            if (r1 < r5) goto L_0x0202
            j1.f r7 = r3.f22687h
            int r7 = r7.f22633f
            int r14 = r14 + r7
        L_0x0202:
            j1.g r7 = r3.f22684e
            int r7 = r7.f22634g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x0211
            if (r1 >= r6) goto L_0x0211
            j1.f r3 = r3.f22688i
            int r3 = r3.f22633f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x0211:
            int r1 = r1 + 1
            goto L_0x01e4
        L_0x0214:
            r14 = r20
        L_0x0216:
            int r1 = r0.f22618l
            r3 = 2
            if (r1 != r3) goto L_0x0221
            if (r13 != 0) goto L_0x0221
            r1 = 0
            r0.f22618l = r1
            goto L_0x022d
        L_0x0221:
            r1 = 0
            goto L_0x022d
        L_0x0223:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x022d:
            if (r14 <= r2) goto L_0x0231
            r0.f22618l = r3
        L_0x0231:
            if (r24 <= 0) goto L_0x0239
            if (r15 != 0) goto L_0x0239
            if (r5 != r6) goto L_0x0239
            r0.f22618l = r3
        L_0x0239:
            int r3 = r0.f22618l
            r7 = 1
            if (r3 != r7) goto L_0x02de
            r9 = r24
            if (r9 <= r7) goto L_0x0247
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x024e
        L_0x0247:
            if (r9 != r7) goto L_0x024d
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x024e
        L_0x024d:
            r2 = r1
        L_0x024e:
            if (r15 <= 0) goto L_0x0251
            r2 = r1
        L_0x0251:
            r3 = r1
            r7 = r21
        L_0x0254:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x025d
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x025e
        L_0x025d:
            r1 = r3
        L_0x025e:
            java.util.ArrayList r9 = r0.f22617k
            java.lang.Object r1 = r9.get(r1)
            j1.p r1 = (j1.p) r1
            i1.e r9 = r1.f22681b
            int r9 = r9.X()
            r10 = 8
            if (r9 != r10) goto L_0x027b
            j1.f r9 = r1.f22687h
            r9.d(r7)
            j1.f r1 = r1.f22688i
            r1.d(r7)
            goto L_0x02da
        L_0x027b:
            if (r3 <= 0) goto L_0x0282
            if (r23 == 0) goto L_0x0281
            int r7 = r7 - r2
            goto L_0x0282
        L_0x0281:
            int r7 = r7 + r2
        L_0x0282:
            if (r3 <= 0) goto L_0x0293
            if (r3 < r5) goto L_0x0293
            if (r23 == 0) goto L_0x028e
            j1.f r9 = r1.f22687h
            int r9 = r9.f22633f
            int r7 = r7 - r9
            goto L_0x0293
        L_0x028e:
            j1.f r9 = r1.f22687h
            int r9 = r9.f22633f
            int r7 = r7 + r9
        L_0x0293:
            if (r23 == 0) goto L_0x029b
            j1.f r9 = r1.f22688i
            r9.d(r7)
            goto L_0x02a0
        L_0x029b:
            j1.f r9 = r1.f22687h
            r9.d(r7)
        L_0x02a0:
            j1.g r9 = r1.f22684e
            int r10 = r9.f22634g
            i1.e$b r11 = r1.f22683d
            i1.e$b r12 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b1
            int r11 = r1.f22680a
            r12 = 1
            if (r11 != r12) goto L_0x02b1
            int r10 = r9.f22649m
        L_0x02b1:
            if (r23 == 0) goto L_0x02b5
            int r7 = r7 - r10
            goto L_0x02b6
        L_0x02b5:
            int r7 = r7 + r10
        L_0x02b6:
            if (r23 == 0) goto L_0x02bf
            j1.f r9 = r1.f22687h
            r9.d(r7)
        L_0x02bd:
            r9 = 1
            goto L_0x02c5
        L_0x02bf:
            j1.f r9 = r1.f22688i
            r9.d(r7)
            goto L_0x02bd
        L_0x02c5:
            r1.f22686g = r9
            if (r3 >= r8) goto L_0x02da
            if (r3 >= r6) goto L_0x02da
            if (r23 == 0) goto L_0x02d4
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02da
        L_0x02d4:
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02da:
            int r3 = r3 + 1
            goto L_0x0254
        L_0x02de:
            r9 = r24
            if (r3 != 0) goto L_0x0375
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ea
            r2 = r1
        L_0x02ea:
            r3 = r1
            r7 = r21
        L_0x02ed:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x02f6
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f7
        L_0x02f6:
            r1 = r3
        L_0x02f7:
            java.util.ArrayList r9 = r0.f22617k
            java.lang.Object r1 = r9.get(r1)
            j1.p r1 = (j1.p) r1
            i1.e r9 = r1.f22681b
            int r9 = r9.X()
            r10 = 8
            if (r9 != r10) goto L_0x0314
            j1.f r9 = r1.f22687h
            r9.d(r7)
            j1.f r1 = r1.f22688i
            r1.d(r7)
            goto L_0x0371
        L_0x0314:
            if (r23 == 0) goto L_0x0318
            int r7 = r7 - r2
            goto L_0x0319
        L_0x0318:
            int r7 = r7 + r2
        L_0x0319:
            if (r3 <= 0) goto L_0x032a
            if (r3 < r5) goto L_0x032a
            if (r23 == 0) goto L_0x0325
            j1.f r9 = r1.f22687h
            int r9 = r9.f22633f
            int r7 = r7 - r9
            goto L_0x032a
        L_0x0325:
            j1.f r9 = r1.f22687h
            int r9 = r9.f22633f
            int r7 = r7 + r9
        L_0x032a:
            if (r23 == 0) goto L_0x0332
            j1.f r9 = r1.f22688i
            r9.d(r7)
            goto L_0x0337
        L_0x0332:
            j1.f r9 = r1.f22687h
            r9.d(r7)
        L_0x0337:
            j1.g r9 = r1.f22684e
            int r10 = r9.f22634g
            i1.e$b r11 = r1.f22683d
            i1.e$b r12 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034c
            int r11 = r1.f22680a
            r12 = 1
            if (r11 != r12) goto L_0x034c
            int r9 = r9.f22649m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034c:
            if (r23 == 0) goto L_0x0350
            int r7 = r7 - r10
            goto L_0x0351
        L_0x0350:
            int r7 = r7 + r10
        L_0x0351:
            if (r23 == 0) goto L_0x0359
            j1.f r9 = r1.f22687h
            r9.d(r7)
            goto L_0x035e
        L_0x0359:
            j1.f r9 = r1.f22688i
            r9.d(r7)
        L_0x035e:
            if (r3 >= r8) goto L_0x0371
            if (r3 >= r6) goto L_0x0371
            if (r23 == 0) goto L_0x036b
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0371
        L_0x036b:
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0371:
            int r3 = r3 + 1
            goto L_0x02ed
        L_0x0375:
            r7 = 2
            if (r3 != r7) goto L_0x0425
            int r3 = r0.f22685f
            if (r3 != 0) goto L_0x0383
            i1.e r3 = r0.f22681b
            float r3 = r3.A()
            goto L_0x0389
        L_0x0383:
            i1.e r3 = r0.f22681b
            float r3 = r3.T()
        L_0x0389:
            if (r23 == 0) goto L_0x038f
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x038f:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039a
            if (r15 <= 0) goto L_0x039b
        L_0x039a:
            r2 = r1
        L_0x039b:
            if (r23 == 0) goto L_0x03a0
            int r7 = r21 - r2
            goto L_0x03a2
        L_0x03a0:
            int r7 = r21 + r2
        L_0x03a2:
            r3 = r1
        L_0x03a3:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x03ac
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03ad
        L_0x03ac:
            r1 = r3
        L_0x03ad:
            java.util.ArrayList r2 = r0.f22617k
            java.lang.Object r1 = r2.get(r1)
            j1.p r1 = (j1.p) r1
            i1.e r2 = r1.f22681b
            int r2 = r2.X()
            r9 = 8
            if (r2 != r9) goto L_0x03cb
            j1.f r2 = r1.f22687h
            r2.d(r7)
            j1.f r1 = r1.f22688i
            r1.d(r7)
            r12 = 1
            goto L_0x0421
        L_0x03cb:
            if (r3 <= 0) goto L_0x03dc
            if (r3 < r5) goto L_0x03dc
            if (r23 == 0) goto L_0x03d7
            j1.f r2 = r1.f22687h
            int r2 = r2.f22633f
            int r7 = r7 - r2
            goto L_0x03dc
        L_0x03d7:
            j1.f r2 = r1.f22687h
            int r2 = r2.f22633f
            int r7 = r7 + r2
        L_0x03dc:
            if (r23 == 0) goto L_0x03e4
            j1.f r2 = r1.f22688i
            r2.d(r7)
            goto L_0x03e9
        L_0x03e4:
            j1.f r2 = r1.f22687h
            r2.d(r7)
        L_0x03e9:
            j1.g r2 = r1.f22684e
            int r10 = r2.f22634g
            i1.e$b r11 = r1.f22683d
            i1.e$b r12 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fb
            int r11 = r1.f22680a
            r12 = 1
            if (r11 != r12) goto L_0x03fc
            int r10 = r2.f22649m
            goto L_0x03fc
        L_0x03fb:
            r12 = 1
        L_0x03fc:
            if (r23 == 0) goto L_0x0400
            int r7 = r7 - r10
            goto L_0x0401
        L_0x0400:
            int r7 = r7 + r10
        L_0x0401:
            if (r23 == 0) goto L_0x0409
            j1.f r2 = r1.f22687h
            r2.d(r7)
            goto L_0x040e
        L_0x0409:
            j1.f r2 = r1.f22688i
            r2.d(r7)
        L_0x040e:
            if (r3 >= r8) goto L_0x0421
            if (r3 >= r6) goto L_0x0421
            if (r23 == 0) goto L_0x041b
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0421
        L_0x041b:
            j1.f r1 = r1.f22688i
            int r1 = r1.f22633f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0421:
            int r3 = r3 + 1
            goto L_0x03a3
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.a(j1.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Iterator it = this.f22617k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f22617k.size();
        if (size >= 1) {
            C2063e eVar = ((p) this.f22617k.get(0)).f22681b;
            C2063e eVar2 = ((p) this.f22617k.get(size - 1)).f22681b;
            if (this.f22685f == 0) {
                C2062d dVar = eVar.f21896Q;
                C2062d dVar2 = eVar2.f21900S;
                f i10 = i(dVar, 0);
                int f10 = dVar.f();
                C2063e r10 = r();
                if (r10 != null) {
                    f10 = r10.f21896Q.f();
                }
                if (i10 != null) {
                    b(this.f22687h, i10, f10);
                }
                f i11 = i(dVar2, 0);
                int f11 = dVar2.f();
                C2063e s10 = s();
                if (s10 != null) {
                    f11 = s10.f21900S.f();
                }
                if (i11 != null) {
                    b(this.f22688i, i11, -f11);
                }
            } else {
                C2062d dVar3 = eVar.f21898R;
                C2062d dVar4 = eVar2.f21902T;
                f i12 = i(dVar3, 1);
                int f12 = dVar3.f();
                C2063e r11 = r();
                if (r11 != null) {
                    f12 = r11.f21898R.f();
                }
                if (i12 != null) {
                    b(this.f22687h, i12, f12);
                }
                f i13 = i(dVar4, 1);
                int f13 = dVar4.f();
                C2063e s11 = s();
                if (s11 != null) {
                    f13 = s11.f21902T.f();
                }
                if (i13 != null) {
                    b(this.f22688i, i13, -f13);
                }
            }
            this.f22687h.f22628a = this;
            this.f22688i.f22628a = this;
        }
    }

    public void e() {
        for (int i10 = 0; i10 < this.f22617k.size(); i10++) {
            ((p) this.f22617k.get(i10)).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f22682c = null;
        Iterator it = this.f22617k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    public long j() {
        int size = this.f22617k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f22617k.get(i10);
            j10 = j10 + ((long) pVar.f22687h.f22633f) + pVar.j() + ((long) pVar.f22688i.f22633f);
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f22617k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f22617k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f22685f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator it = this.f22617k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append((p) it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
