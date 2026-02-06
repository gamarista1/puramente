package y;

import Y.C1500m;
import Y.M0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: y.a  reason: case insensitive filesystem */
public abstract class C2916a {

    /* renamed from: y.a$a  reason: collision with other inner class name */
    static final class C0474a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2924i f28431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f28432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f28433c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f28434d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f28435e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f28436f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0474a(C2924i iVar, C6787a aVar, i iVar2, C6798l lVar, int i10, int i11) {
            super(2);
            this.f28431a = iVar;
            this.f28432b = aVar;
            this.f28433c = iVar2;
            this.f28434d = lVar;
            this.f28435e = i10;
            this.f28436f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2916a.a(this.f28431a, this.f28432b, this.f28433c, this.f28434d, mVar, M0.a(this.f28435e | 1), this.f28436f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: y.a$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2924i f28437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f28438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f28439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f28440d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f28441e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f28442f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2924i iVar, C6787a aVar, i iVar2, C6798l lVar, int i10, int i11) {
            super(2);
            this.f28437a = iVar;
            this.f28438b = aVar;
            this.f28439c = iVar2;
            this.f28440d = lVar;
            this.f28441e = i10;
            this.f28442f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2916a.a(this.f28437a, this.f28438b, this.f28439c, this.f28440d, mVar, M0.a(this.f28441e | 1), this.f28442f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: y.a$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2924i f28443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f28444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f28445c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f28446d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f28447e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f28448f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f28449g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f28450h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2924i iVar, C6787a aVar, C6798l lVar, i iVar2, boolean z10, p pVar, int i10, int i11) {
            super(2);
            this.f28443a = iVar;
            this.f28444b = aVar;
            this.f28445c = lVar;
            this.f28446d = iVar2;
            this.f28447e = z10;
            this.f28448f = pVar;
            this.f28449g = i10;
            this.f28450h = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2916a.b(this.f28443a, this.f28444b, this.f28445c, this.f28446d, this.f28447e, this.f28448f, mVar, M0.a(this.f28449g | 1), this.f28450h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: y.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(y.C2924i r9, yf.C6787a r10, k0.i r11, yf.C6798l r12, Y.C1500m r13, int r14, int r15) {
        /*
            r0 = 645832757(0x267ea035, float:8.8341074E-16)
            Y.m r13 = r13.h(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r14 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r13.S(r9)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r14
            goto L_0x001e
        L_0x001d:
            r1 = r14
        L_0x001e:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0025
            r1 = r1 | 48
            goto L_0x0035
        L_0x0025:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x0035
            boolean r2 = r13.C(r10)
            if (r2 == 0) goto L_0x0032
            r2 = 32
            goto L_0x0034
        L_0x0032:
            r2 = 16
        L_0x0034:
            r1 = r1 | r2
        L_0x0035:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004c
        L_0x003c:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r13.S(r11)
            if (r3 == 0) goto L_0x0049
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0063
        L_0x0053:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0063
            boolean r3 = r13.C(r12)
            if (r3 == 0) goto L_0x0060
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0062
        L_0x0060:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0062:
            r1 = r1 | r3
        L_0x0063:
            r3 = r1 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 != r4) goto L_0x0076
            boolean r3 = r13.i()
            if (r3 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r13.I()
        L_0x0073:
            r4 = r11
            goto L_0x00ea
        L_0x0076:
            if (r2 == 0) goto L_0x007a
            k0.i$a r11 = k0.i.f23074a
        L_0x007a:
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0086
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:63)"
            Y.C1506p.Q(r0, r1, r2, r3)
        L_0x0086:
            y.i$a r0 = r9.a()
            boolean r2 = r0 instanceof y.C2924i.a.b
            if (r2 != 0) goto L_0x00ad
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0097
            Y.C1506p.P()
        L_0x0097:
            Y.Y0 r13 = r13.k()
            if (r13 == 0) goto L_0x00ac
            y.a$a r0 = new y.a$a
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.a(r0)
        L_0x00ac:
            return
        L_0x00ad:
            boolean r2 = r13.S(r0)
            java.lang.Object r3 = r13.A()
            if (r2 != 0) goto L_0x00bf
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00d2
        L_0x00bf:
            y.e r3 = new y.e
            y.i$a$b r0 = (y.C2924i.a.b) r0
            long r4 = r0.a()
            long r4 = c1.o.d(r4)
            r0 = 0
            r3.<init>(r4, r0)
            r13.r(r3)
        L_0x00d2:
            r0 = r3
            y.e r0 = (y.C2920e) r0
            r6 = r1 & 8176(0x1ff0, float:1.1457E-41)
            r7 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            y.C2926k.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0073
            Y.C1506p.P()
            goto L_0x0073
        L_0x00ea:
            Y.Y0 r11 = r13.k()
            if (r11 == 0) goto L_0x00fe
            y.a$b r13 = new y.a$b
            r1 = r13
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r13)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2916a.a(y.i, yf.a, k0.i, yf.l, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(y.C2924i r16, yf.C6787a r17, yf.C6798l r18, k0.i r19, boolean r20, yf.p r21, Y.C1500m r22, int r23, int r24) {
        /*
            r7 = r16
            r8 = r21
            r9 = r23
            r0 = 16
            r1 = 32
            r2 = 2
            r3 = 4
            r4 = -84584070(0xfffffffffaf5597a, float:-6.3696377E35)
            r5 = r22
            Y.m r10 = r5.h(r4)
            r5 = 1
            r6 = r24 & 1
            if (r6 == 0) goto L_0x001d
            r6 = r9 | 6
            goto L_0x002d
        L_0x001d:
            r6 = r9 & 6
            if (r6 != 0) goto L_0x002c
            boolean r6 = r10.S(r7)
            if (r6 == 0) goto L_0x0029
            r6 = r3
            goto L_0x002a
        L_0x0029:
            r6 = r2
        L_0x002a:
            r6 = r6 | r9
            goto L_0x002d
        L_0x002c:
            r6 = r9
        L_0x002d:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0036
            r6 = r6 | 48
            r11 = r17
            goto L_0x0046
        L_0x0036:
            r2 = r9 & 48
            r11 = r17
            if (r2 != 0) goto L_0x0046
            boolean r2 = r10.C(r11)
            if (r2 == 0) goto L_0x0044
            r2 = r1
            goto L_0x0045
        L_0x0044:
            r2 = r0
        L_0x0045:
            r6 = r6 | r2
        L_0x0046:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
            r12 = r18
            goto L_0x0061
        L_0x004f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r12 = r18
            if (r2 != 0) goto L_0x0061
            boolean r2 = r10.C(r12)
            if (r2 == 0) goto L_0x005e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r2
        L_0x0061:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r3 = r19
            goto L_0x007c
        L_0x006a:
            r3 = r9 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r19
            boolean r13 = r10.S(r3)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r13
        L_0x007c:
            r0 = r24 & 16
            if (r0 == 0) goto L_0x0085
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r20
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r20
            boolean r14 = r10.b(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r6 = r6 | r14
        L_0x0097:
            r1 = r24 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x009f
            r6 = r6 | r14
            goto L_0x00af
        L_0x009f:
            r1 = r9 & r14
            if (r1 != 0) goto L_0x00af
            boolean r1 = r10.C(r8)
            if (r1 == 0) goto L_0x00ac
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r6 = r6 | r1
        L_0x00af:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r6
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r14) goto L_0x00c6
            boolean r1 = r10.i()
            if (r1 != 0) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r10.I()
            r4 = r3
            r5 = r13
            goto L_0x0188
        L_0x00c6:
            if (r2 == 0) goto L_0x00cc
            k0.i$a r1 = k0.i.f23074a
            r14 = r1
            goto L_0x00cd
        L_0x00cc:
            r14 = r3
        L_0x00cd:
            if (r0 == 0) goto L_0x00d0
            r13 = r5
        L_0x00d0:
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00dc
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)"
            Y.C1506p.Q(r4, r6, r0, r1)
        L_0x00dc:
            if (r13 == 0) goto L_0x00e3
            k0.i r0 = y.C2918c.c(r14, r7)
            goto L_0x00e4
        L_0x00e3:
            r0 = r14
        L_0x00e4:
            k0.c$a r1 = k0.c.f23044a
            k0.c r1 = r1.o()
            H0.F r1 = androidx.compose.foundation.layout.d.h(r1, r5)
            r2 = 0
            int r2 = Y.C1494j.a(r10, r2)
            Y.y r3 = r10.p()
            k0.i r0 = k0.h.e(r10, r0)
            J0.g$a r4 = J0.C1241g.f3853J
            yf.a r5 = r4.a()
            Y.f r15 = r10.j()
            if (r15 != 0) goto L_0x010a
            Y.C1494j.c()
        L_0x010a:
            r10.F()
            boolean r15 = r10.f()
            if (r15 == 0) goto L_0x0117
            r10.U(r5)
            goto L_0x011a
        L_0x0117:
            r10.q()
        L_0x011a:
            Y.m r5 = Y.F1.a(r10)
            yf.p r15 = r4.c()
            Y.F1.b(r5, r1, r15)
            yf.p r1 = r4.e()
            Y.F1.b(r5, r3, r1)
            yf.p r1 = r4.b()
            boolean r3 = r5.f()
            if (r3 != 0) goto L_0x0144
            java.lang.Object r3 = r5.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r15)
            if (r3 != 0) goto L_0x0152
        L_0x0144:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.r(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.V(r2, r1)
        L_0x0152:
            yf.p r1 = r4.d()
            Y.F1.b(r5, r0, r1)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            int r0 = r6 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r10, r0)
            r0 = r6 & 126(0x7e, float:1.77E-43)
            int r1 = r6 << 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r6 = 4
            r2 = 0
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r10
            a(r0, r1, r2, r3, r4, r5, r6)
            r10.u()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0186
            Y.C1506p.P()
        L_0x0186:
            r5 = r13
            r4 = r14
        L_0x0188:
            Y.Y0 r10 = r10.k()
            if (r10 == 0) goto L_0x01a3
            y.a$c r13 = new y.a$c
            r0 = r13
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r13)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2916a.b(y.i, yf.a, yf.l, k0.i, boolean, yf.p, Y.m, int, int):void");
    }
}
