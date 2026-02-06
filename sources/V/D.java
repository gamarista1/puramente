package V;

import Y.C1500m;
import Y.M0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2422h;
import q0.C2427m;
import r0.C2547y0;
import r0.T1;
import t0.C2605f;
import yf.C6798l;
import yf.p;

public abstract class D {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f6464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f6465b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, long j10) {
            super(1);
            this.f6464a = f10;
            this.f6465b = j10;
        }

        public final void a(C2605f fVar) {
            C2605f fVar2 = fVar;
            float t12 = fVar2.t1(this.f6464a);
            float f10 = (float) 2;
            C2605f.M(fVar2, this.f6465b, C2422h.a(0.0f, fVar2.t1(this.f6464a) / f10), C2422h.a(C2427m.k(fVar.d()), fVar2.t1(this.f6464a) / f10), t12, 0, (T1) null, 0.0f, (C2547y0) null, 0, 496, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f6467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f6468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6469d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6470e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f6466a = iVar;
            this.f6467b = f10;
            this.f6468c = j10;
            this.f6469d = i10;
            this.f6470e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            D.a(this.f6466a, this.f6467b, this.f6468c, mVar, M0.a(this.f6469d | 1), this.f6470e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f6471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f6472b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(float f10, long j10) {
            super(1);
            this.f6471a = f10;
            this.f6472b = j10;
        }

        public final void a(C2605f fVar) {
            C2605f fVar2 = fVar;
            float t12 = fVar2.t1(this.f6471a);
            float f10 = (float) 2;
            C2605f.M(fVar2, this.f6472b, C2422h.a(fVar2.t1(this.f6471a) / f10, 0.0f), C2422h.a(fVar2.t1(this.f6471a) / f10, C2427m.i(fVar.d())), t12, 0, (T1) null, 0.0f, (C2547y0) null, 0, 496, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f6474b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f6475c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6476d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6477e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f6473a = iVar;
            this.f6474b = f10;
            this.f6475c = j10;
            this.f6476d = i10;
            this.f6477e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            D.b(this.f6473a, this.f6474b, this.f6475c, mVar, M0.a(this.f6476d | 1), this.f6477e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        if ((r14 & 4) != 0) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k0.i r8, float r9, long r10, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = 75144485(0x47a9d25, float:2.9459516E-36)
            Y.m r12 = r12.h(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x000e
            r2 = r13 | 6
            goto L_0x001e
        L_0x000e:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x001d
            boolean r2 = r12.S(r8)
            if (r2 == 0) goto L_0x001a
            r2 = 4
            goto L_0x001b
        L_0x001a:
            r2 = 2
        L_0x001b:
            r2 = r2 | r13
            goto L_0x001e
        L_0x001d:
            r2 = r13
        L_0x001e:
            r3 = r14 & 2
            r4 = 32
            if (r3 == 0) goto L_0x0027
            r2 = r2 | 48
            goto L_0x0036
        L_0x0027:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0036
            boolean r5 = r12.c(r9)
            if (r5 == 0) goto L_0x0033
            r5 = r4
            goto L_0x0035
        L_0x0033:
            r5 = 16
        L_0x0035:
            r2 = r2 | r5
        L_0x0036:
            r5 = r13 & 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r14 & 4
            if (r5 != 0) goto L_0x0048
            boolean r5 = r12.e(r10)
            if (r5 == 0) goto L_0x0048
            r5 = r6
            goto L_0x004a
        L_0x0048:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0060
            boolean r5 = r12.i()
            if (r5 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            r12.I()
        L_0x005b:
            r2 = r8
            r3 = r9
            r4 = r10
            goto L_0x00eb
        L_0x0060:
            r12.D()
            r5 = r13 & 1
            if (r5 == 0) goto L_0x0078
            boolean r5 = r12.L()
            if (r5 == 0) goto L_0x006e
            goto L_0x0078
        L_0x006e:
            r12.I()
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0090
        L_0x0075:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0090
        L_0x0078:
            if (r1 == 0) goto L_0x007c
            k0.i$a r8 = k0.i.f23074a
        L_0x007c:
            if (r3 == 0) goto L_0x0084
            V.C r9 = V.C.f6459a
            float r9 = r9.b()
        L_0x0084:
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0090
            V.C r10 = V.C.f6459a
            r11 = 6
            long r10 = r10.a(r12, r11)
            goto L_0x0075
        L_0x0090:
            r12.v()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x009f
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.HorizontalDivider (Divider.kt:54)"
            Y.C1506p.Q(r0, r2, r1, r3)
        L_0x009f:
            r0 = 0
            r1 = 0
            r3 = 1
            k0.i r0 = androidx.compose.foundation.layout.q.h(r8, r0, r3, r1)
            k0.i r0 = androidx.compose.foundation.layout.q.i(r0, r9)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r5 = 0
            if (r1 != r4) goto L_0x00b1
            r1 = r3
            goto L_0x00b2
        L_0x00b1:
            r1 = r5
        L_0x00b2:
            r4 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 ^ 384(0x180, float:5.38E-43)
            if (r4 <= r6) goto L_0x00be
            boolean r4 = r12.e(r10)
            if (r4 != 0) goto L_0x00c4
        L_0x00be:
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != r6) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r5
        L_0x00c4:
            r1 = r1 | r3
            java.lang.Object r2 = r12.A()
            if (r1 != 0) goto L_0x00d3
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00db
        L_0x00d3:
            V.D$a r2 = new V.D$a
            r2.<init>(r9, r10)
            r12.r(r2)
        L_0x00db:
            yf.l r2 = (yf.C6798l) r2
            x.C2870i.a(r0, r2, r12, r5)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x005b
            Y.C1506p.P()
            goto L_0x005b
        L_0x00eb:
            Y.Y0 r8 = r12.k()
            if (r8 == 0) goto L_0x00fc
            V.D$b r9 = new V.D$b
            r1 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.D.a(k0.i, float, long, Y.m, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        if ((r14 & 4) != 0) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(k0.i r8, float r9, long r10, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = -1534852205(0xffffffffa4840393, float:-5.725193E-17)
            Y.m r12 = r12.h(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x000e
            r2 = r13 | 6
            goto L_0x001e
        L_0x000e:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x001d
            boolean r2 = r12.S(r8)
            if (r2 == 0) goto L_0x001a
            r2 = 4
            goto L_0x001b
        L_0x001a:
            r2 = 2
        L_0x001b:
            r2 = r2 | r13
            goto L_0x001e
        L_0x001d:
            r2 = r13
        L_0x001e:
            r3 = r14 & 2
            r4 = 32
            if (r3 == 0) goto L_0x0027
            r2 = r2 | 48
            goto L_0x0036
        L_0x0027:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0036
            boolean r5 = r12.c(r9)
            if (r5 == 0) goto L_0x0033
            r5 = r4
            goto L_0x0035
        L_0x0033:
            r5 = 16
        L_0x0035:
            r2 = r2 | r5
        L_0x0036:
            r5 = r13 & 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r14 & 4
            if (r5 != 0) goto L_0x0048
            boolean r5 = r12.e(r10)
            if (r5 == 0) goto L_0x0048
            r5 = r6
            goto L_0x004a
        L_0x0048:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0060
            boolean r5 = r12.i()
            if (r5 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            r12.I()
        L_0x005b:
            r2 = r8
            r3 = r9
            r4 = r10
            goto L_0x00eb
        L_0x0060:
            r12.D()
            r5 = r13 & 1
            if (r5 == 0) goto L_0x0078
            boolean r5 = r12.L()
            if (r5 == 0) goto L_0x006e
            goto L_0x0078
        L_0x006e:
            r12.I()
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0090
        L_0x0075:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0090
        L_0x0078:
            if (r1 == 0) goto L_0x007c
            k0.i$a r8 = k0.i.f23074a
        L_0x007c:
            if (r3 == 0) goto L_0x0084
            V.C r9 = V.C.f6459a
            float r9 = r9.b()
        L_0x0084:
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0090
            V.C r10 = V.C.f6459a
            r11 = 6
            long r10 = r10.a(r12, r11)
            goto L_0x0075
        L_0x0090:
            r12.v()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x009f
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.VerticalDivider (Divider.kt:83)"
            Y.C1506p.Q(r0, r2, r1, r3)
        L_0x009f:
            r0 = 0
            r1 = 0
            r3 = 1
            k0.i r0 = androidx.compose.foundation.layout.q.d(r8, r0, r3, r1)
            k0.i r0 = androidx.compose.foundation.layout.q.r(r0, r9)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r5 = 0
            if (r1 != r4) goto L_0x00b1
            r1 = r3
            goto L_0x00b2
        L_0x00b1:
            r1 = r5
        L_0x00b2:
            r4 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 ^ 384(0x180, float:5.38E-43)
            if (r4 <= r6) goto L_0x00be
            boolean r4 = r12.e(r10)
            if (r4 != 0) goto L_0x00c4
        L_0x00be:
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != r6) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r5
        L_0x00c4:
            r1 = r1 | r3
            java.lang.Object r2 = r12.A()
            if (r1 != 0) goto L_0x00d3
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00db
        L_0x00d3:
            V.D$c r2 = new V.D$c
            r2.<init>(r9, r10)
            r12.r(r2)
        L_0x00db:
            yf.l r2 = (yf.C6798l) r2
            x.C2870i.a(r0, r2, r12, r5)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x005b
            Y.C1506p.P()
            goto L_0x005b
        L_0x00eb:
            Y.Y0 r8 = r12.k()
            if (r8 == 0) goto L_0x00fc
            V.D$d r9 = new V.D$d
            r1 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.D.b(k0.i, float, long, Y.m, int, int):void");
    }
}
