package E;

import Ef.m;
import c1.d;
import c1.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import w.C2796h;
import w.C2799k;
import yf.C6798l;
import yf.p;
import z.v;

/* renamed from: E.g  reason: case insensitive filesystem */
public abstract class C1138g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f1616a = h.j((float) 2500);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f1617b = h.j((float) 1500);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f1618c = h.j((float) 50);

    /* renamed from: E.g$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f1619a;

        /* renamed from: b  reason: collision with root package name */
        Object f1620b;

        /* renamed from: c  reason: collision with root package name */
        Object f1621c;

        /* renamed from: d  reason: collision with root package name */
        float f1622d;

        /* renamed from: e  reason: collision with root package name */
        float f1623e;

        /* renamed from: f  reason: collision with root package name */
        float f1624f;

        /* renamed from: g  reason: collision with root package name */
        int f1625g;

        /* renamed from: h  reason: collision with root package name */
        int f1626h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f1627i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f1628j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f1629k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C1139h f1630l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f1631m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f1632n;

        /* renamed from: E.g$a$a  reason: collision with other inner class name */
        static final class C0023a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1139h f1633a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1634b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f1635c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f1636d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ v f1637e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ J f1638f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ boolean f1639g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ float f1640h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ L f1641i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f1642j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f1643k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ N f1644l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0023a(C1139h hVar, int i10, float f10, K k10, v vVar, J j10, boolean z10, float f11, L l10, int i11, int i12, N n10) {
                super(1);
                this.f1633a = hVar;
                this.f1634b = i10;
                this.f1635c = f10;
                this.f1636d = k10;
                this.f1637e = vVar;
                this.f1638f = j10;
                this.f1639g = z10;
                this.f1640h = f11;
                this.f1641i = l10;
                this.f1642j = i11;
                this.f1643k = i12;
                this.f1644l = n10;
            }

            public final void a(C2796h hVar) {
                float f10;
                int i10;
                int i11;
                int i12;
                if (!C1138g.e(this.f1633a, this.f1634b)) {
                    if (this.f1635c > 0.0f) {
                        f10 = m.g(((Number) hVar.e()).floatValue(), this.f1635c);
                    } else {
                        f10 = m.c(((Number) hVar.e()).floatValue(), this.f1635c);
                    }
                    float f11 = f10 - this.f1636d.f71756a;
                    float a10 = this.f1637e.a(f11);
                    if (!C1138g.e(this.f1633a, this.f1634b) && !a.l(this.f1639g, this.f1633a, this.f1634b, this.f1643k)) {
                        if (f11 == a10) {
                            this.f1636d.f71756a += f11;
                            if (this.f1639g) {
                                if (((Number) hVar.e()).floatValue() > this.f1640h) {
                                    hVar.a();
                                }
                            } else if (((Number) hVar.e()).floatValue() < (-this.f1640h)) {
                                hVar.a();
                            }
                            if (this.f1639g) {
                                if (this.f1641i.f71757a >= 2 && this.f1634b - this.f1633a.b() > (i12 = this.f1642j)) {
                                    this.f1633a.d(this.f1637e, this.f1634b - i12, 0);
                                }
                            } else if (this.f1641i.f71757a >= 2 && this.f1633a.g() - (i10 = this.f1634b) > (i11 = this.f1642j)) {
                                this.f1633a.d(this.f1637e, i10 + i11, 0);
                            }
                        } else {
                            hVar.a();
                            this.f1638f.f71755a = false;
                            return;
                        }
                    }
                }
                if (a.l(this.f1639g, this.f1633a, this.f1634b, this.f1643k)) {
                    this.f1633a.d(this.f1637e, this.f1634b, this.f1643k);
                    this.f1638f.f71755a = false;
                    hVar.a();
                } else if (C1138g.e(this.f1633a, this.f1634b)) {
                    throw new C1137f(Af.a.d(this.f1633a.c(this.f1634b)), (C2799k) this.f1644l.f71759a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2796h) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: E.g$a$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f1645a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f1646b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f1647c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(float f10, K k10, v vVar) {
                super(1);
                this.f1645a = f10;
                this.f1646b = k10;
                this.f1647c = vVar;
            }

            public final void a(C2796h hVar) {
                float f10 = this.f1645a;
                float f11 = 0.0f;
                if (f10 > 0.0f) {
                    f11 = m.g(((Number) hVar.e()).floatValue(), this.f1645a);
                } else if (f10 < 0.0f) {
                    f11 = m.c(((Number) hVar.e()).floatValue(), this.f1645a);
                }
                float f12 = f11 - this.f1646b.f71756a;
                if (!(f12 == this.f1647c.a(f12) && f11 == ((Number) hVar.e()).floatValue())) {
                    hVar.a();
                }
                this.f1646b.f71756a += f12;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2796h) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, d dVar, C1139h hVar, int i11, int i12, C6658d dVar2) {
            super(2, dVar2);
            this.f1628j = i10;
            this.f1629k = dVar;
            this.f1630l = hVar;
            this.f1631m = i11;
            this.f1632n = i12;
        }

        /* access modifiers changed from: private */
        public static final boolean l(boolean z10, C1139h hVar, int i10, int i11) {
            if (z10) {
                if (hVar.g() <= i10 && (hVar.g() != i10 || hVar.f() <= i11)) {
                    return false;
                }
            } else if (hVar.g() >= i10 && (hVar.g() != i10 || hVar.f() >= i11)) {
                return false;
            }
            return true;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f1628j, this.f1629k, this.f1630l, this.f1631m, this.f1632n, dVar);
            aVar.f1627i = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: z.v} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea A[SYNTHETIC, Splitter:B:36:0x00ea] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x013e A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0140 A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0149 A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x014c A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x023a A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                r34 = this;
                r9 = r34
                java.lang.Object r10 = rf.C6680b.f()
                int r0 = r9.f1626h
                r11 = 2
                r12 = 0
                r14 = 1
                if (r0 == 0) goto L_0x0052
                if (r0 == r14) goto L_0x0022
                if (r0 != r11) goto L_0x001a
                java.lang.Object r0 = r9.f1627i
                z.v r0 = (z.v) r0
                lf.w.b(r35)
                goto L_0x023b
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0022:
                int r0 = r9.f1625g
                float r1 = r9.f1624f
                float r2 = r9.f1623e
                float r3 = r9.f1622d
                java.lang.Object r4 = r9.f1621c
                kotlin.jvm.internal.L r4 = (kotlin.jvm.internal.L) r4
                java.lang.Object r5 = r9.f1620b
                kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
                java.lang.Object r6 = r9.f1619a
                kotlin.jvm.internal.J r6 = (kotlin.jvm.internal.J) r6
                java.lang.Object r7 = r9.f1627i
                z.v r7 = (z.v) r7
                lf.w.b(r35)     // Catch:{ f -> 0x004c }
                r15 = r1
                r8 = r2
                r12 = r10
                r32 = r7
                r7 = r3
                r3 = r32
                r33 = r6
                r6 = r4
                r4 = r33
                goto L_0x01a2
            L_0x004c:
                r0 = move-exception
                r1 = r0
                r0 = r7
            L_0x004f:
                r12 = r10
                goto L_0x01e0
            L_0x0052:
                lf.w.b(r35)
                java.lang.Object r0 = r9.f1627i
                r1 = r0
                z.v r1 = (z.v) r1
                int r0 = r9.f1628j
                float r2 = (float) r0
                int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r2 < 0) goto L_0x0063
                r2 = r14
                goto L_0x0064
            L_0x0063:
                r2 = 0
            L_0x0064:
                if (r2 == 0) goto L_0x0247
                c1.d r0 = r9.f1629k     // Catch:{ f -> 0x01bf }
                float r2 = E.C1138g.f1616a     // Catch:{ f -> 0x01bf }
                float r0 = r0.t1(r2)     // Catch:{ f -> 0x01bf }
                c1.d r2 = r9.f1629k     // Catch:{ f -> 0x01bf }
                float r3 = E.C1138g.f1617b     // Catch:{ f -> 0x01bf }
                float r2 = r2.t1(r3)     // Catch:{ f -> 0x01bf }
                c1.d r3 = r9.f1629k     // Catch:{ f -> 0x01bf }
                float r4 = E.C1138g.f1618c     // Catch:{ f -> 0x01bf }
                float r3 = r3.t1(r4)     // Catch:{ f -> 0x01bf }
                kotlin.jvm.internal.J r4 = new kotlin.jvm.internal.J     // Catch:{ f -> 0x01bf }
                r4.<init>()     // Catch:{ f -> 0x01bf }
                r4.f71755a = r14     // Catch:{ f -> 0x01bf }
                kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N     // Catch:{ f -> 0x01bf }
                r5.<init>()     // Catch:{ f -> 0x01bf }
                r22 = 30
                r23 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 0
                r21 = 0
                w.k r6 = w.C2800l.c(r15, r16, r17, r19, r21, r22, r23)     // Catch:{ f -> 0x01bf }
                r5.f71759a = r6     // Catch:{ f -> 0x01bf }
                E.h r6 = r9.f1630l     // Catch:{ f -> 0x01bf }
                int r7 = r9.f1628j     // Catch:{ f -> 0x01bf }
                boolean r6 = E.C1138g.e(r6, r7)     // Catch:{ f -> 0x01bf }
                if (r6 != 0) goto L_0x01c7
                int r6 = r9.f1628j     // Catch:{ f -> 0x01bf }
                E.h r7 = r9.f1630l     // Catch:{ f -> 0x01bf }
                int r7 = r7.g()     // Catch:{ f -> 0x01bf }
                if (r6 <= r7) goto L_0x00b9
                r6 = r14
                goto L_0x00ba
            L_0x00b9:
                r6 = 0
            L_0x00ba:
                kotlin.jvm.internal.L r7 = new kotlin.jvm.internal.L     // Catch:{ f -> 0x01bf }
                r7.<init>()     // Catch:{ f -> 0x01bf }
                r7.f71757a = r14     // Catch:{ f -> 0x01bf }
                r8 = r2
                r15 = r3
                r3 = r1
                r32 = r7
                r7 = r0
                r0 = r6
                r6 = r32
            L_0x00ca:
                boolean r1 = r4.f71755a     // Catch:{ f -> 0x01bb }
                if (r1 == 0) goto L_0x0244
                E.h r1 = r9.f1630l     // Catch:{ f -> 0x01bb }
                int r1 = r1.a()     // Catch:{ f -> 0x01bb }
                if (r1 <= 0) goto L_0x0244
                E.h r1 = r9.f1630l     // Catch:{ f -> 0x01bb }
                int r2 = r9.f1628j     // Catch:{ f -> 0x01bb }
                float r1 = r1.c(r2)     // Catch:{ f -> 0x01bb }
                int r2 = r9.f1631m     // Catch:{ f -> 0x01bb }
                float r2 = (float) r2     // Catch:{ f -> 0x01bb }
                float r1 = r1 + r2
                float r2 = java.lang.Math.abs(r1)     // Catch:{ f -> 0x01bb }
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 >= 0) goto L_0x00fe
                float r1 = java.lang.Math.abs(r1)     // Catch:{ f -> 0x00f9 }
                float r1 = java.lang.Math.max(r1, r15)     // Catch:{ f -> 0x00f9 }
                if (r0 == 0) goto L_0x00f7
            L_0x00f4:
                r19 = r1
                goto L_0x0105
            L_0x00f7:
                float r1 = -r1
                goto L_0x00f4
            L_0x00f9:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x004f
            L_0x00fe:
                if (r0 == 0) goto L_0x0103
                r19 = r7
                goto L_0x0105
            L_0x0103:
                float r1 = -r7
                goto L_0x00f4
            L_0x0105:
                java.lang.Object r1 = r5.f71759a     // Catch:{ f -> 0x01bb }
                r20 = r1
                w.k r20 = (w.C2799k) r20     // Catch:{ f -> 0x01bb }
                r28 = 30
                r29 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r25 = 0
                r27 = 0
                w.k r1 = w.C2800l.g(r20, r21, r22, r23, r25, r27, r28, r29)     // Catch:{ f -> 0x01bb }
                r5.f71759a = r1     // Catch:{ f -> 0x01bb }
                kotlin.jvm.internal.K r20 = new kotlin.jvm.internal.K     // Catch:{ f -> 0x01bb }
                r20.<init>()     // Catch:{ f -> 0x01bb }
                java.lang.Object r1 = r5.f71759a     // Catch:{ f -> 0x01bb }
                w.k r1 = (w.C2799k) r1     // Catch:{ f -> 0x01bb }
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.b(r19)     // Catch:{ f -> 0x01bb }
                java.lang.Object r13 = r5.f71759a     // Catch:{ f -> 0x01bb }
                w.k r13 = (w.C2799k) r13     // Catch:{ f -> 0x01bb }
                java.lang.Object r13 = r13.n()     // Catch:{ f -> 0x01bb }
                java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ f -> 0x01bb }
                float r13 = r13.floatValue()     // Catch:{ f -> 0x01bb }
                int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r13 != 0) goto L_0x0140
                r13 = 0
                goto L_0x0141
            L_0x0140:
                r13 = r14
            L_0x0141:
                E.g$a$a r30 = new E.g$a$a     // Catch:{ f -> 0x01bb }
                E.h r11 = r9.f1630l     // Catch:{ f -> 0x01bb }
                int r12 = r9.f1628j     // Catch:{ f -> 0x01bb }
                if (r0 == 0) goto L_0x014c
                r23 = r14
                goto L_0x014e
            L_0x014c:
                r23 = 0
            L_0x014e:
                int r14 = r9.f1632n     // Catch:{ f -> 0x01bb }
                r31 = r10
                int r10 = r9.f1631m     // Catch:{ f -> 0x01b8 }
                r16 = r30
                r17 = r11
                r18 = r12
                r21 = r3
                r22 = r4
                r24 = r8
                r25 = r6
                r26 = r14
                r27 = r10
                r28 = r5
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ f -> 0x01b8 }
                r9.f1627i = r3     // Catch:{ f -> 0x01b8 }
                r9.f1619a = r4     // Catch:{ f -> 0x01b8 }
                r9.f1620b = r5     // Catch:{ f -> 0x01b8 }
                r9.f1621c = r6     // Catch:{ f -> 0x01b8 }
                r9.f1622d = r7     // Catch:{ f -> 0x01b8 }
                r9.f1623e = r8     // Catch:{ f -> 0x01b8 }
                r9.f1624f = r15     // Catch:{ f -> 0x01b8 }
                r9.f1625g = r0     // Catch:{ f -> 0x01b8 }
                r10 = 1
                r9.f1626h = r10     // Catch:{ f -> 0x01b8 }
                r10 = 0
                r11 = 2
                r12 = 0
                r14 = r3
                r3 = r10
                r10 = r4
                r4 = r13
                r13 = r5
                r5 = r30
                r16 = r6
                r6 = r34
                r17 = r7
                r7 = r11
                r11 = r8
                r8 = r12
                java.lang.Object r1 = w.l0.j(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ f -> 0x01b2 }
                r12 = r31
                if (r1 != r12) goto L_0x019a
                return r12
            L_0x019a:
                r4 = r10
                r8 = r11
                r5 = r13
                r3 = r14
                r6 = r16
                r7 = r17
            L_0x01a2:
                int r1 = r6.f71757a     // Catch:{ f -> 0x01ae }
                r2 = 1
                int r1 = r1 + r2
                r6.f71757a = r1     // Catch:{ f -> 0x01ae }
                r10 = r12
                r11 = 2
                r12 = 0
                r14 = 1
                goto L_0x00ca
            L_0x01ae:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x01e0
            L_0x01b2:
                r0 = move-exception
            L_0x01b3:
                r12 = r31
            L_0x01b5:
                r1 = r0
                r0 = r14
                goto L_0x01e0
            L_0x01b8:
                r0 = move-exception
                r14 = r3
                goto L_0x01b3
            L_0x01bb:
                r0 = move-exception
                r14 = r3
                r12 = r10
                goto L_0x01b5
            L_0x01bf:
                r0 = move-exception
                r12 = r10
            L_0x01c1:
                r32 = r1
                r1 = r0
                r0 = r32
                goto L_0x01e0
            L_0x01c7:
                r12 = r10
                E.h r0 = r9.f1630l     // Catch:{ f -> 0x01de }
                int r2 = r9.f1628j     // Catch:{ f -> 0x01de }
                float r0 = r0.c(r2)     // Catch:{ f -> 0x01de }
                int r0 = Af.a.d(r0)     // Catch:{ f -> 0x01de }
                E.f r2 = new E.f     // Catch:{ f -> 0x01de }
                java.lang.Object r3 = r5.f71759a     // Catch:{ f -> 0x01de }
                w.k r3 = (w.C2799k) r3     // Catch:{ f -> 0x01de }
                r2.<init>(r0, r3)     // Catch:{ f -> 0x01de }
                throw r2     // Catch:{ f -> 0x01de }
            L_0x01de:
                r0 = move-exception
                goto L_0x01c1
            L_0x01e0:
                w.k r13 = r1.b()
                r21 = 30
                r22 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r18 = 0
                r20 = 0
                w.k r2 = w.C2800l.g(r13, r14, r15, r16, r18, r20, r21, r22)
                int r1 = r1.a()
                int r3 = r9.f1631m
                int r1 = r1 + r3
                float r1 = (float) r1
                kotlin.jvm.internal.K r3 = new kotlin.jvm.internal.K
                r3.<init>()
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.b(r1)
                java.lang.Object r5 = r2.n()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x0217
                r5 = 1
                r13 = 1
                goto L_0x0219
            L_0x0217:
                r5 = 1
                r13 = 0
            L_0x0219:
                r5 = r5 ^ r13
                E.g$a$b r6 = new E.g$a$b
                r6.<init>(r1, r3, r0)
                r9.f1627i = r0
                r1 = 0
                r9.f1619a = r1
                r9.f1620b = r1
                r9.f1621c = r1
                r1 = 2
                r9.f1626h = r1
                r3 = 0
                r7 = 2
                r8 = 0
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r34
                java.lang.Object r1 = w.l0.j(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r1 != r12) goto L_0x023b
                return r12
            L_0x023b:
                E.h r1 = r9.f1630l
                int r2 = r9.f1628j
                int r3 = r9.f1631m
                r1.d(r0, r2, r3)
            L_0x0244:
                lf.M r0 = lf.C6514M.f71813a
                return r0
            L_0x0247:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Index should be non-negative ("
                r1.append(r2)
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: E.C1138g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: j */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((a) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }
    }

    public static final Object d(C1139h hVar, int i10, int i11, int i12, d dVar, C6658d dVar2) {
        Object e10 = hVar.e(new a(i10, dVar, hVar, i11, i12, (C6658d) null), dVar2);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public static final boolean e(C1139h hVar, int i10) {
        int g10 = hVar.g();
        if (i10 > hVar.b() || g10 > i10) {
            return false;
        }
        return true;
    }
}
