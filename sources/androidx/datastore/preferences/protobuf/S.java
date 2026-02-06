package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1751y;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class S implements e0 {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f16282r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f16283s = p0.B();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f16284a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f16285b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16286c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16287d;

    /* renamed from: e  reason: collision with root package name */
    private final O f16288e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16289f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16290g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f16291h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f16292i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f16293j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16294k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16295l;

    /* renamed from: m  reason: collision with root package name */
    private final U f16296m;

    /* renamed from: n  reason: collision with root package name */
    private final E f16297n;

    /* renamed from: o  reason: collision with root package name */
    private final l0 f16298o;

    /* renamed from: p  reason: collision with root package name */
    private final C1743p f16299p;

    /* renamed from: q  reason: collision with root package name */
    private final J f16300q;

    private S(int[] iArr, Object[] objArr, int i10, int i11, O o10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, U u10, E e10, l0 l0Var, C1743p pVar, J j10) {
        boolean z12;
        this.f16284a = iArr;
        this.f16285b = objArr;
        this.f16286c = i10;
        this.f16287d = i11;
        this.f16290g = o10 instanceof C1749w;
        this.f16291h = z10;
        if (pVar == null || !pVar.e(o10)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f16289f = z12;
        this.f16292i = z11;
        this.f16293j = iArr2;
        this.f16294k = i12;
        this.f16295l = i13;
        this.f16296m = u10;
        this.f16297n = e10;
        this.f16298o = l0Var;
        this.f16299p = pVar;
        this.f16288e = o10;
        this.f16300q = j10;
    }

    private boolean A(Object obj, int i10, int i11) {
        List list = (List) p0.A(obj, Q(i10));
        if (list.isEmpty()) {
            return true;
        }
        e0 r10 = r(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!r10.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(Object obj, int i10, int i11) {
        Map c10 = this.f16300q.c(p0.A(obj, Q(i10)));
        if (c10.isEmpty()) {
            return true;
        }
        if (this.f16300q.b(q(i11)).f16276c.a() != r0.c.MESSAGE) {
            return true;
        }
        e0 e0Var = null;
        for (Object next : c10.values()) {
            if (e0Var == null) {
                e0Var = a0.a().c(next.getClass());
            }
            if (!e0Var.f(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i10) {
        long X10 = (long) (X(i10) & 1048575);
        if (p0.x(obj, X10) == p0.x(obj2, X10)) {
            return true;
        }
        return false;
    }

    private boolean D(Object obj, int i10, int i11) {
        if (p0.x(obj, (long) (X(i11) & 1048575)) == i10) {
            return true;
        }
        return false;
    }

    private static boolean E(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List F(Object obj, long j10) {
        return (List) p0.A(obj, j10);
    }

    private static long G(Object obj, long j10) {
        return p0.y(obj, j10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x05aa */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x05b0 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x05cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void H(androidx.datastore.preferences.protobuf.l0 r17, androidx.datastore.preferences.protobuf.C1743p r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.d0 r20, androidx.datastore.preferences.protobuf.C1742o r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.E()     // Catch:{ all -> 0x004e }
            int r3 = r8.W(r1)     // Catch:{ all -> 0x004e }
            if (r3 >= 0) goto L_0x0092
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f16294k
        L_0x001e:
            int r1 = r8.f16295l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f16293j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f16289f     // Catch:{ all -> 0x004e }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            androidx.datastore.preferences.protobuf.O r2 = r8.f16288e     // Catch:{ all -> 0x004e }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x004e }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x0060
            if (r14 != 0) goto L_0x0051
            androidx.datastore.preferences.protobuf.s r1 = r18.d(r19)     // Catch:{ all -> 0x004e }
            r14 = r1
            goto L_0x0051
        L_0x004e:
            r0 = move-exception
            goto L_0x05f1
        L_0x0051:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            goto L_0x000d
        L_0x0060:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x006d
            boolean r1 = r20.I()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x007b
            goto L_0x000d
        L_0x006d:
            if (r13 != 0) goto L_0x0074
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x004e }
            r13 = r1
        L_0x0074:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x007b
            goto L_0x000d
        L_0x007b:
            int r0 = r8.f16294k
        L_0x007d:
            int r1 = r8.f16295l
            if (r0 >= r1) goto L_0x008c
            int[] r1 = r8.f16293j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x007d
        L_0x008c:
            if (r13 == 0) goto L_0x0091
            r9.o(r10, r13)
        L_0x0091:
            return
        L_0x0092:
            r15 = r18
            int r4 = r8.h0(r3)     // Catch:{ all -> 0x004e }
            int r2 = g0(r4)     // Catch:{ a -> 0x05aa }
            switch(r2) {
                case 0: goto L_0x059a;
                case 1: goto L_0x058a;
                case 2: goto L_0x057a;
                case 3: goto L_0x056a;
                case 4: goto L_0x055a;
                case 5: goto L_0x054a;
                case 6: goto L_0x053a;
                case 7: goto L_0x052a;
                case 8: goto L_0x0522;
                case 9: goto L_0x04eb;
                case 10: goto L_0x04db;
                case 11: goto L_0x04cb;
                case 12: goto L_0x04b8;
                case 13: goto L_0x04a8;
                case 14: goto L_0x0498;
                case 15: goto L_0x0488;
                case 16: goto L_0x0478;
                case 17: goto L_0x0441;
                case 18: goto L_0x0432;
                case 19: goto L_0x0423;
                case 20: goto L_0x0414;
                case 21: goto L_0x0405;
                case 22: goto L_0x03f6;
                case 23: goto L_0x03e7;
                case 24: goto L_0x03d8;
                case 25: goto L_0x03c9;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b2;
                case 28: goto L_0x03a3;
                case 29: goto L_0x0394;
                case 30: goto L_0x037e;
                case 31: goto L_0x036f;
                case 32: goto L_0x0360;
                case 33: goto L_0x0351;
                case 34: goto L_0x0342;
                case 35: goto L_0x0333;
                case 36: goto L_0x0324;
                case 37: goto L_0x0315;
                case 38: goto L_0x0306;
                case 39: goto L_0x02f7;
                case 40: goto L_0x02e8;
                case 41: goto L_0x02d9;
                case 42: goto L_0x02ca;
                case 43: goto L_0x02bb;
                case 44: goto L_0x02a5;
                case 45: goto L_0x0296;
                case 46: goto L_0x0287;
                case 47: goto L_0x0278;
                case 48: goto L_0x0269;
                case 49: goto L_0x0253;
                case 50: goto L_0x0242;
                case 51: goto L_0x022e;
                case 52: goto L_0x021a;
                case 53: goto L_0x0206;
                case 54: goto L_0x01f2;
                case 55: goto L_0x01de;
                case 56: goto L_0x01ca;
                case 57: goto L_0x01b6;
                case 58: goto L_0x01a2;
                case 59: goto L_0x019a;
                case 60: goto L_0x0161;
                case 61: goto L_0x0151;
                case 62: goto L_0x013d;
                case 63: goto L_0x0126;
                case 64: goto L_0x0112;
                case 65: goto L_0x00fe;
                case 66: goto L_0x00ea;
                case 67: goto L_0x00d6;
                case 68: goto L_0x00c2;
                default: goto L_0x009f;
            }     // Catch:{ a -> 0x05aa }
        L_0x009f:
            if (r13 != 0) goto L_0x00a5
            java.lang.Object r13 = r17.n()     // Catch:{ a -> 0x05aa }
        L_0x00a5:
            boolean r1 = r9.m(r13, r0)     // Catch:{ a -> 0x05aa }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f16294k
        L_0x00ad:
            int r1 = r8.f16295l
            if (r0 >= r1) goto L_0x00bc
            int[] r1 = r8.f16293j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x00ad
        L_0x00bc:
            if (r13 == 0) goto L_0x00c1
            r9.o(r10, r13)
        L_0x00c1:
            return
        L_0x00c2:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r2 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = r0.t(r2, r11)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x00d6:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r6 = r20.C()     // Catch:{ a -> 0x05aa }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x00ea:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r2 = r20.l()     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x00fe:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r6 = r20.f()     // Catch:{ a -> 0x05aa }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0112:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r2 = r20.J()     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0126:
            int r2 = r20.k()     // Catch:{ a -> 0x05aa }
            r8.p(r3)     // Catch:{ a -> 0x05aa }
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x013d:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r2 = r20.h()     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0151:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.g r2 = r20.p()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0161:
            boolean r2 = r8.D(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            if (r2 == 0) goto L_0x0183
            long r5 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.p0.A(r10, r5)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r5 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r5 = r0.a(r5, r11)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.C1751y.h(r2, r5)     // Catch:{ a -> 0x05aa }
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            goto L_0x0195
        L_0x0183:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r2 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
        L_0x0195:
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x019a:
            r8.a0(r10, r4, r0)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x01a2:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            boolean r2 = r20.e()     // Catch:{ a -> 0x05aa }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x01b6:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r2 = r20.x()     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x01ca:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r6 = r20.b()     // Catch:{ a -> 0x05aa }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x01de:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r2 = r20.q()     // Catch:{ a -> 0x05aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x01f2:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r6 = r20.v()     // Catch:{ a -> 0x05aa }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0206:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r6 = r20.M()     // Catch:{ a -> 0x05aa }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x021a:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x05aa }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x022e:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x05aa }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r4, r2)     // Catch:{ a -> 0x05aa }
            r8.e0(r10, r1, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0242:
            java.lang.Object r4 = r8.q(r3)     // Catch:{ a -> 0x05aa }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.I(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0253:
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r6 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.Y(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0269:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.d(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0278:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.u(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0287:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.y(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0296:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.c(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02a5:
            androidx.datastore.preferences.protobuf.E r2 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x05aa }
            r0.j(r2)     // Catch:{ a -> 0x05aa }
            r8.p(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.g0.z(r1, r2, r12, r13, r9)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02bb:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.w(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02ca:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.n(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02d9:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.B(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02e8:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.s(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x02f7:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.z(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0306:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.g(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0315:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.i(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0324:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.G(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0333:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.L(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0342:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.d(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0351:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.u(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0360:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.y(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x036f:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.c(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x037e:
            androidx.datastore.preferences.protobuf.E r2 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x05aa }
            r0.j(r2)     // Catch:{ a -> 0x05aa }
            r8.p(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.g0.z(r1, r2, r12, r13, r9)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0394:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.w(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03a3:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.K(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03b2:
            androidx.datastore.preferences.protobuf.e0 r5 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.Z(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03c4:
            r8.b0(r10, r4, r0)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03c9:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.n(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03d8:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.B(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03e7:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.s(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x03f6:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.z(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0405:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.g(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0414:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.i(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0423:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.G(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0432:
            androidx.datastore.preferences.protobuf.E r1 = r8.f16297n     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x05aa }
            r0.L(r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0441:
            boolean r1 = r8.x(r10, r3)     // Catch:{ a -> 0x05aa }
            if (r1 == 0) goto L_0x0464
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.p0.A(r10, r1)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r2 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = r0.t(r2, r11)     // Catch:{ a -> 0x05aa }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C1751y.h(r1, r2)     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r2, r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0464:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r4 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r4 = r0.t(r4, r11)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0478:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r4 = r20.C()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.N(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0488:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r4 = r20.l()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0498:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r4 = r20.f()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.N(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x04a8:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r4 = r20.J()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x04b8:
            int r1 = r20.k()     // Catch:{ a -> 0x05aa }
            r8.p(r3)     // Catch:{ a -> 0x05aa }
            long r4 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r4, r1)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x04cb:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r4 = r20.h()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x04db:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.g r4 = r20.p()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x04eb:
            boolean r1 = r8.x(r10, r3)     // Catch:{ a -> 0x05aa }
            if (r1 == 0) goto L_0x050e
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.p0.A(r10, r1)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r2 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ a -> 0x05aa }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C1751y.h(r1, r2)     // Catch:{ a -> 0x05aa }
            long r2 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r2, r1)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x050e:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.e0 r4 = r8.r(r3)     // Catch:{ a -> 0x05aa }
            java.lang.Object r4 = r0.a(r4, r11)     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.O(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x0522:
            r8.a0(r10, r4, r0)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x052a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            boolean r4 = r20.e()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.E(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x053a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r4 = r20.x()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x054a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r4 = r20.b()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.N(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x055a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            int r4 = r20.q()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.M(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x056a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r4 = r20.v()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.N(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x057a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            long r4 = r20.M()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.N(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x058a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.L(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x059a:
            long r1 = Q(r4)     // Catch:{ a -> 0x05aa }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x05aa }
            androidx.datastore.preferences.protobuf.p0.K(r10, r1, r4)     // Catch:{ a -> 0x05aa }
            r8.d0(r10, r3)     // Catch:{ a -> 0x05aa }
            goto L_0x000d
        L_0x05aa:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x05cd
            boolean r1 = r20.I()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f16294k
        L_0x05b8:
            int r1 = r8.f16295l
            if (r0 >= r1) goto L_0x05c7
            int[] r1 = r8.f16293j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b8
        L_0x05c7:
            if (r13 == 0) goto L_0x05cc
            r9.o(r10, r13)
        L_0x05cc:
            return
        L_0x05cd:
            if (r13 != 0) goto L_0x05d4
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x004e }
            r13 = r1
        L_0x05d4:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f16294k
        L_0x05dc:
            int r1 = r8.f16295l
            if (r0 >= r1) goto L_0x05eb
            int[] r1 = r8.f16293j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05dc
        L_0x05eb:
            if (r13 == 0) goto L_0x05f0
            r9.o(r10, r13)
        L_0x05f0:
            return
        L_0x05f1:
            int r1 = r8.f16294k
        L_0x05f3:
            int r2 = r8.f16295l
            if (r1 >= r2) goto L_0x0602
            int[] r2 = r8.f16293j
            r2 = r2[r1]
            java.lang.Object r13 = r8.n(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x05f3
        L_0x0602:
            if (r13 == 0) goto L_0x0607
            r9.o(r10, r13)
        L_0x0607:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.H(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o):void");
    }

    private final void I(Object obj, int i10, Object obj2, C1742o oVar, d0 d0Var) {
        long Q10 = Q(h0(i10));
        Object A10 = p0.A(obj, Q10);
        if (A10 == null) {
            A10 = this.f16300q.g(obj2);
            p0.O(obj, Q10, A10);
        } else if (this.f16300q.h(A10)) {
            Object g10 = this.f16300q.g(obj2);
            this.f16300q.a(g10, A10);
            p0.O(obj, Q10, g10);
            A10 = g10;
        }
        d0Var.A(this.f16300q.f(A10), this.f16300q.b(obj2), oVar);
    }

    private void J(Object obj, Object obj2, int i10) {
        long Q10 = Q(h0(i10));
        if (x(obj2, i10)) {
            Object A10 = p0.A(obj, Q10);
            Object A11 = p0.A(obj2, Q10);
            if (A10 != null && A11 != null) {
                p0.O(obj, Q10, C1751y.h(A10, A11));
                d0(obj, i10);
            } else if (A11 != null) {
                p0.O(obj, Q10, A11);
                d0(obj, i10);
            }
        }
    }

    private void K(Object obj, Object obj2, int i10) {
        int h02 = h0(i10);
        int P10 = P(i10);
        long Q10 = Q(h02);
        if (D(obj2, P10, i10)) {
            Object A10 = p0.A(obj, Q10);
            Object A11 = p0.A(obj2, Q10);
            if (A10 != null && A11 != null) {
                p0.O(obj, Q10, C1751y.h(A10, A11));
                e0(obj, P10, i10);
            } else if (A11 != null) {
                p0.O(obj, Q10, A11);
                e0(obj, P10, i10);
            }
        }
    }

    private void L(Object obj, Object obj2, int i10) {
        int h02 = h0(i10);
        long Q10 = Q(h02);
        int P10 = P(i10);
        switch (g0(h02)) {
            case 0:
                if (x(obj2, i10)) {
                    p0.K(obj, Q10, p0.v(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 1:
                if (x(obj2, i10)) {
                    p0.L(obj, Q10, p0.w(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 2:
                if (x(obj2, i10)) {
                    p0.N(obj, Q10, p0.y(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 3:
                if (x(obj2, i10)) {
                    p0.N(obj, Q10, p0.y(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 4:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 5:
                if (x(obj2, i10)) {
                    p0.N(obj, Q10, p0.y(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 6:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 7:
                if (x(obj2, i10)) {
                    p0.E(obj, Q10, p0.p(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 8:
                if (x(obj2, i10)) {
                    p0.O(obj, Q10, p0.A(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 9:
                J(obj, obj2, i10);
                return;
            case 10:
                if (x(obj2, i10)) {
                    p0.O(obj, Q10, p0.A(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 11:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 12:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 13:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                if (x(obj2, i10)) {
                    p0.N(obj, Q10, p0.y(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                if (x(obj2, i10)) {
                    p0.M(obj, Q10, p0.x(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 16:
                if (x(obj2, i10)) {
                    p0.N(obj, Q10, p0.y(obj2, Q10));
                    d0(obj, i10);
                    return;
                }
                return;
            case 17:
                J(obj, obj2, i10);
                return;
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case c.f37660h /*32*/:
            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f16297n.d(obj, obj2, Q10);
                return;
            case 50:
                g0.E(this.f16300q, obj, obj2, Q10);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, P10, i10)) {
                    p0.O(obj, Q10, p0.A(obj2, Q10));
                    e0(obj, P10, i10);
                    return;
                }
                return;
            case 60:
                K(obj, obj2, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, P10, i10)) {
                    p0.O(obj, Q10, p0.A(obj2, Q10));
                    e0(obj, P10, i10);
                    return;
                }
                return;
            case 68:
                K(obj, obj2, i10);
                return;
            default:
                return;
        }
    }

    static S M(Class cls, M m10, U u10, E e10, l0 l0Var, C1743p pVar, J j10) {
        if (m10 instanceof c0) {
            return O((c0) m10, u10, e10, l0Var, pVar, j10);
        }
        android.support.v4.media.session.c.a(m10);
        return N((i0) null, u10, e10, l0Var, pVar, j10);
    }

    static S N(i0 i0Var, U u10, E e10, l0 l0Var, C1743p pVar, J j10) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.datastore.preferences.protobuf.S O(androidx.datastore.preferences.protobuf.c0 r35, androidx.datastore.preferences.protobuf.U r36, androidx.datastore.preferences.protobuf.E r37, androidx.datastore.preferences.protobuf.l0 r38, androidx.datastore.preferences.protobuf.C1743p r39, androidx.datastore.preferences.protobuf.J r40) {
        /*
            androidx.datastore.preferences.protobuf.Z r0 = r35.c()
            androidx.datastore.preferences.protobuf.Z r1 = androidx.datastore.preferences.protobuf.Z.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r35.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f16282r
            r9 = r2
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r8
            r8 = r15
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r34 = r13
            r13 = r2
            r2 = r9
            r9 = r34
        L_0x0177:
            sun.misc.Unsafe r5 = f16283s
            java.lang.Object[] r18 = r35.d()
            androidx.datastore.preferences.protobuf.O r19 = r35.b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03f2
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b6
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x0226:
            int r33 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r15 = r15 | r9
            int r32 = r32 + 13
            r11 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r32
            r15 = r15 | r9
            r11 = r33
        L_0x0240:
            int r9 = r10 + -51
            r32 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0263
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0263
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x0270
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x0270
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x0261:
            r14 = r11
            goto L_0x0270
        L_0x0263:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x0261
        L_0x0270:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x027a:
            r11 = r6
            r33 = r7
            goto L_0x0287
        L_0x027e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = c0(r3, r9)
            r18[r15] = r9
            goto L_0x027a
        L_0x0287:
            long r6 = r5.objectFieldOffset(r9)
            int r6 = (int) r6
            int r15 = r15 + 1
            r7 = r18[r15]
            boolean r9 = r7 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0298
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
        L_0x0296:
            r9 = r6
            goto L_0x02a1
        L_0x0298:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = c0(r3, r7)
            r18[r15] = r7
            goto L_0x0296
        L_0x02a1:
            long r6 = r5.objectFieldOffset(r7)
            int r6 = (int) r6
            r27 = r2
            r19 = r4
            r4 = r6
            r6 = r9
            r2 = r14
            r7 = r32
            r14 = 0
            r9 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03bb
        L_0x02b6:
            r11 = r6
            r33 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = c0(r3, r7)
            r9 = 9
            if (r10 == r9) goto L_0x02cb
            r9 = 17
            if (r10 != r9) goto L_0x02d0
        L_0x02cb:
            r27 = r2
            r2 = 1
            goto L_0x0339
        L_0x02d0:
            r9 = 27
            if (r10 == r9) goto L_0x02d8
            r9 = 49
            if (r10 != r9) goto L_0x02dc
        L_0x02d8:
            r27 = r2
            r2 = 1
            goto L_0x032d
        L_0x02dc:
            r9 = 12
            if (r10 == r9) goto L_0x0318
            r9 = 30
            if (r10 == r9) goto L_0x0318
            r9 = 44
            if (r10 != r9) goto L_0x02e9
            goto L_0x0318
        L_0x02e9:
            r9 = 50
            if (r10 != r9) goto L_0x0314
            int r9 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r14 + 2
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x030d
            int r23 = r23 + 1
            int r6 = r14 + 3
            r14 = r18[r27]
            r12[r23] = r14
            r27 = r2
            r23 = r9
        L_0x030b:
            r9 = r3
            goto L_0x0345
        L_0x030d:
            r23 = r9
            r6 = r27
            r27 = r2
            goto L_0x030b
        L_0x0314:
            r27 = r2
            r2 = 1
            goto L_0x030b
        L_0x0318:
            r9 = r4 & 1
            r27 = r2
            r2 = 1
            if (r9 != r2) goto L_0x030b
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            int r14 = r14 + 2
            r6 = r18[r6]
            r12[r9] = r6
        L_0x032a:
            r9 = r3
            r6 = r14
            goto L_0x0345
        L_0x032d:
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            int r14 = r14 + 2
            r6 = r18[r6]
            r12[r9] = r6
            goto L_0x032a
        L_0x0339:
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            java.lang.Class r14 = r7.getType()
            r12[r9] = r14
            goto L_0x030b
        L_0x0345:
            long r2 = r5.objectFieldOffset(r7)
            int r2 = (int) r2
            r3 = r4 & 1
            r7 = 1
            if (r3 != r7) goto L_0x03a0
            r3 = 17
            if (r10 > r3) goto L_0x03a0
            int r3 = r15 + 1
            char r14 = r0.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r15) goto L_0x0379
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0362:
            int r20 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r15) goto L_0x0374
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r19
            r14 = r14 | r3
            int r19 = r19 + 13
            r3 = r20
            goto L_0x0362
        L_0x0374:
            int r3 = r3 << r19
            r14 = r14 | r3
            r3 = r20
        L_0x0379:
            int r19 = r8 * 2
            int r20 = r14 / 32
            int r19 = r19 + r20
            r7 = r18[r19]
            boolean r15 = r7 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x038b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
        L_0x0387:
            r15 = r3
            r19 = r4
            goto L_0x0394
        L_0x038b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = c0(r9, r7)
            r18[r19] = r7
            goto L_0x0387
        L_0x0394:
            long r3 = r5.objectFieldOffset(r7)
            int r3 = (int) r3
            int r14 = r14 % 32
            r4 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a7
        L_0x03a0:
            r19 = r4
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 0
            r14 = 0
        L_0x03a7:
            r7 = 18
            if (r10 < r7) goto L_0x03b5
            r7 = 49
            if (r10 > r7) goto L_0x03b5
            int r7 = r24 + 1
            r13[r24] = r2
            r24 = r7
        L_0x03b5:
            r7 = r15
            r34 = r6
            r6 = r2
            r2 = r34
        L_0x03bb:
            int r15 = r22 + 1
            r11[r22] = r33
            int r30 = r22 + 2
            r3 = r1 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03c8
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c9
        L_0x03c8:
            r3 = 0
        L_0x03c9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03d0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d1
        L_0x03d0:
            r1 = 0
        L_0x03d1:
            r1 = r1 | r3
            int r3 = r10 << 20
            r1 = r1 | r3
            r1 = r1 | r6
            r11[r15] = r1
            int r22 = r22 + 3
            int r1 = r14 << 20
            r1 = r1 | r4
            r11[r30] = r1
            r14 = r2
            r3 = r9
            r6 = r11
            r4 = r19
            r11 = r25
            r1 = r26
            r2 = r27
            r15 = r28
            r10 = r29
            r9 = r31
            goto L_0x0196
        L_0x03f2:
            r27 = r2
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            androidx.datastore.preferences.protobuf.S r0 = new androidx.datastore.preferences.protobuf.S
            androidx.datastore.preferences.protobuf.O r9 = r35.b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r27
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.O(androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.E, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.S");
    }

    private int P(int i10) {
        return this.f16284a[i10];
    }

    private static long Q(int i10) {
        return (long) (i10 & 1048575);
    }

    private static boolean R(Object obj, long j10) {
        return ((Boolean) p0.A(obj, j10)).booleanValue();
    }

    private static double S(Object obj, long j10) {
        return ((Double) p0.A(obj, j10)).doubleValue();
    }

    private static float T(Object obj, long j10) {
        return ((Float) p0.A(obj, j10)).floatValue();
    }

    private static int U(Object obj, long j10) {
        return ((Integer) p0.A(obj, j10)).intValue();
    }

    private static long V(Object obj, long j10) {
        return ((Long) p0.A(obj, j10)).longValue();
    }

    private int W(int i10) {
        if (i10 < this.f16286c || i10 > this.f16287d) {
            return -1;
        }
        return f0(i10, 0);
    }

    private int X(int i10) {
        return this.f16284a[i10 + 2];
    }

    private void Y(Object obj, long j10, d0 d0Var, e0 e0Var, C1742o oVar) {
        d0Var.H(this.f16297n.e(obj, j10), e0Var, oVar);
    }

    private void Z(Object obj, int i10, d0 d0Var, e0 e0Var, C1742o oVar) {
        d0Var.r(this.f16297n.e(obj, Q(i10)), e0Var, oVar);
    }

    private void a0(Object obj, int i10, d0 d0Var) {
        if (w(i10)) {
            p0.O(obj, Q(i10), d0Var.N());
        } else if (this.f16290g) {
            p0.O(obj, Q(i10), d0Var.D());
        } else {
            p0.O(obj, Q(i10), d0Var.p());
        }
    }

    private void b0(Object obj, int i10, d0 d0Var) {
        if (w(i10)) {
            d0Var.o(this.f16297n.e(obj, Q(i10)));
        } else {
            d0Var.F(this.f16297n.e(obj, Q(i10)));
        }
    }

    private static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void d0(Object obj, int i10) {
        if (!this.f16291h) {
            int X10 = X(i10);
            long j10 = (long) (X10 & 1048575);
            p0.M(obj, j10, p0.x(obj, j10) | (1 << (X10 >>> 20)));
        }
    }

    private void e0(Object obj, int i10, int i11) {
        p0.M(obj, (long) (X(i11) & 1048575), i10);
    }

    private int f0(int i10, int i11) {
        int length = (this.f16284a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int P10 = P(i13);
            if (i10 == P10) {
                return i13;
            }
            if (i10 < P10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int g0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int h0(int i10) {
        return this.f16284a[i10 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.s0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f16289f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.p r3 = r0.f16299p
            androidx.datastore.preferences.protobuf.s r3 = r3.c(r1)
            boolean r5 = r3.j()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.n()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f16284a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f16283s
            r9 = -1
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r6) goto L_0x049a
            int r12 = r0.h0(r10)
            int r13 = r0.P(r10)
            int r14 = g0(r12)
            boolean r15 = r0.f16291h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f16284a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15 & r16
            r16 = r5
            if (r8 == r9) goto L_0x0056
            long r4 = (long) r8
            int r11 = r7.getInt(r1, r4)
            r9 = r8
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            androidx.datastore.preferences.protobuf.p r8 = r0.f16299p
            int r8 = r8.a(r5)
            if (r8 > r13) goto L_0x0081
            androidx.datastore.preferences.protobuf.p r8 = r0.f16299p
            r8.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r8 = r6
            long r5 = Q(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.e0 r5 = r0.r(r10)
            r2.N(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = V(r1, r5)
            r2.m(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.H(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = V(r1, r5)
            r2.i(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.w(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.E(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.o(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C1734g) r4
            r2.K(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.e0 r5 = r0.r(r10)
            r2.L(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.m0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = R(r1, r5)
            r2.v(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.c(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = V(r1, r5)
            r2.s(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = U(r1, r5)
            r2.h(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = V(r1, r5)
            r2.f(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = V(r1, r5)
            r2.u(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = T(r1, r5)
            r2.B(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.D(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = S(r1, r5)
            r2.p(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.l0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.e0 r6 = r0.r(r10)
            androidx.datastore.preferences.protobuf.g0.T(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            androidx.datastore.preferences.protobuf.g0.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.X(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.c0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.M(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.U(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.O(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.g0.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.X(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.c0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.N(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.e0 r6 = r0.r(r10)
            androidx.datastore.preferences.protobuf.g0.W(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.b0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.g0.M(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.U(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.P(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g0.O(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.e0 r5 = r0.r(r10)
            r2.N(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.m(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.H(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.i(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.w(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.E(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.o(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C1734g) r4
            r2.K(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.e0 r5 = r0.r(r10)
            r2.L(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.m0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = k(r1, r5)
            r2.v(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.c(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.s(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.h(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.f(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.u(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = o(r1, r5)
            r2.B(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = l(r1, r5)
            r2.p(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r8
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            androidx.datastore.preferences.protobuf.p r4 = r0.f16299p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            androidx.datastore.preferences.protobuf.l0 r3 = r0.f16298o
            r0.n0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.i0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private boolean j(Object obj, Object obj2, int i10) {
        if (x(obj, i10) == x(obj2, i10)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.s0 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f16289f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            androidx.datastore.preferences.protobuf.p r0 = r12.f16299p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r13)
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.n()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f16284a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.h0(r5)
            int r7 = r12.P(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            androidx.datastore.preferences.protobuf.p r8 = r12.f16299p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            androidx.datastore.preferences.protobuf.p r8 = r12.f16299p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = g0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = V(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = V(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            r14.K(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            r14.L(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            r12.m0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            boolean r6 = R(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = V(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = U(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = V(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = V(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            float r6 = T(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.D(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            double r8 = S(r13, r8)
            r14.p(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            r12.l0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            androidx.datastore.preferences.protobuf.g0.T(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.X(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.c0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.M(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.U(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.P(r5)
            long r10 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.O(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.X(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.c0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.N(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            androidx.datastore.preferences.protobuf.g0.W(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.b0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.M(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.U(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.P(r5)
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.O(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = G(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = G(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            r14.K(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            androidx.datastore.preferences.protobuf.e0 r8 = r12.r(r5)
            r14.L(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r13, r8)
            r12.m0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            boolean r6 = k(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = G(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            int r6 = v(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = G(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            long r8 = G(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            float r6 = o(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.x(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Q(r6)
            double r8 = l(r13, r8)
            r14.p(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            androidx.datastore.preferences.protobuf.p r3 = r12.f16299p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            androidx.datastore.preferences.protobuf.l0 r0 = r12.f16298o
            r12.n0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.j0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private static boolean k(Object obj, long j10) {
        return p0.p(obj, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.l0 r0 = r10.f16298o
            r10.n0(r0, r11, r12)
            boolean r0 = r10.f16289f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.p r0 = r10.f16299p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r11)
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.e()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f16284a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.h0(r3)
            int r5 = r10.P(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.p r6 = r10.f16299p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.p r6 = r10.f16299p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = g0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = V(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = V(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C1734g) r4
            r12.K(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            r12.L(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            r10.m0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            boolean r4 = R(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = V(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = U(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = V(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = V(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            float r4 = T(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            double r6 = S(r11, r6)
            r12.p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            r10.l0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            androidx.datastore.preferences.protobuf.g0.T(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.N(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            androidx.datastore.preferences.protobuf.g0.W(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.P(r3)
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.b0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.P(r3)
            long r8 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g0.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = G(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = G(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C1734g) r4
            r12.K(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            androidx.datastore.preferences.protobuf.e0 r6 = r10.r(r3)
            r12.L(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.A(r11, r6)
            r10.m0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            boolean r4 = k(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = G(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            int r4 = v(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = G(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            long r6 = G(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            float r4 = o(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Q(r4)
            double r6 = l(r11, r6)
            r12.p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.p r11 = r10.f16299p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.k0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private static double l(Object obj, long j10) {
        return p0.v(obj, j10);
    }

    private void l0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.M(i10, this.f16300q.b(q(i11)), this.f16300q.c(obj));
        }
    }

    private boolean m(Object obj, Object obj2, int i10) {
        int h02 = h0(i10);
        long Q10 = Q(h02);
        switch (g0(h02)) {
            case 0:
                if (!j(obj, obj2, i10) || Double.doubleToLongBits(p0.v(obj, Q10)) != Double.doubleToLongBits(p0.v(obj2, Q10))) {
                    return false;
                }
                return true;
            case 1:
                if (!j(obj, obj2, i10) || Float.floatToIntBits(p0.w(obj, Q10)) != Float.floatToIntBits(p0.w(obj2, Q10))) {
                    return false;
                }
                return true;
            case 2:
                if (!j(obj, obj2, i10) || p0.y(obj, Q10) != p0.y(obj2, Q10)) {
                    return false;
                }
                return true;
            case 3:
                if (!j(obj, obj2, i10) || p0.y(obj, Q10) != p0.y(obj2, Q10)) {
                    return false;
                }
                return true;
            case 4:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case 5:
                if (!j(obj, obj2, i10) || p0.y(obj, Q10) != p0.y(obj2, Q10)) {
                    return false;
                }
                return true;
            case 6:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case 7:
                if (!j(obj, obj2, i10) || p0.p(obj, Q10) != p0.p(obj2, Q10)) {
                    return false;
                }
                return true;
            case 8:
                if (!j(obj, obj2, i10) || !g0.J(p0.A(obj, Q10), p0.A(obj2, Q10))) {
                    return false;
                }
                return true;
            case 9:
                if (!j(obj, obj2, i10) || !g0.J(p0.A(obj, Q10), p0.A(obj2, Q10))) {
                    return false;
                }
                return true;
            case 10:
                if (!j(obj, obj2, i10) || !g0.J(p0.A(obj, Q10), p0.A(obj2, Q10))) {
                    return false;
                }
                return true;
            case 11:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case 12:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case 13:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                if (!j(obj, obj2, i10) || p0.y(obj, Q10) != p0.y(obj2, Q10)) {
                    return false;
                }
                return true;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                if (!j(obj, obj2, i10) || p0.x(obj, Q10) != p0.x(obj2, Q10)) {
                    return false;
                }
                return true;
            case 16:
                if (!j(obj, obj2, i10) || p0.y(obj, Q10) != p0.y(obj2, Q10)) {
                    return false;
                }
                return true;
            case 17:
                if (!j(obj, obj2, i10) || !g0.J(p0.A(obj, Q10), p0.A(obj2, Q10))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case c.f37660h /*32*/:
            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return g0.J(p0.A(obj, Q10), p0.A(obj2, Q10));
            case 50:
                return g0.J(p0.A(obj, Q10), p0.A(obj2, Q10));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!C(obj, obj2, i10) || !g0.J(p0.A(obj, Q10), p0.A(obj2, Q10))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private void m0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.e(i10, (String) obj);
        } else {
            s0Var.K(i10, (C1734g) obj);
        }
    }

    private final Object n(Object obj, int i10, Object obj2, l0 l0Var) {
        P(i10);
        if (p0.A(obj, Q(h0(i10))) == null) {
            return obj2;
        }
        p(i10);
        return obj2;
    }

    private void n0(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    private static float o(Object obj, long j10) {
        return p0.w(obj, j10);
    }

    private C1751y.a p(int i10) {
        android.support.v4.media.session.c.a(this.f16285b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i10) {
        return this.f16285b[(i10 / 3) * 2];
    }

    private e0 r(int i10) {
        int i11 = (i10 / 3) * 2;
        e0 e0Var = (e0) this.f16285b[i11];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c10 = a0.a().c((Class) this.f16285b[i11 + 1]);
        this.f16285b[i11] = c10;
        return c10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034e, code lost:
        r6 = r6 + r3;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x051d, code lost:
        r5 = r5 + 3;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bd, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int s(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f16283s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f16284a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0522
            int r8 = r0.h0(r5)
            int r9 = r0.P(r5)
            int r10 = g0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f16284a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0058
        L_0x0039:
            boolean r11 = r0.f16292i
            if (r11 == 0) goto L_0x0056
            androidx.datastore.preferences.protobuf.t r11 = androidx.datastore.preferences.protobuf.C1746t.DOUBLE_LIST_PACKED
            int r11 = r11.a()
            if (r10 < r11) goto L_0x0056
            androidx.datastore.preferences.protobuf.t r11 = androidx.datastore.preferences.protobuf.C1746t.SINT64_LIST_PACKED
            int r11 = r11.a()
            if (r10 > r11) goto L_0x0056
            int[] r11 = r0.f16284a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
        L_0x0054:
            r14 = 0
            goto L_0x0058
        L_0x0056:
            r11 = 0
            goto L_0x0054
        L_0x0058:
            long r12 = Q(r8)
            r15 = r4
            r8 = 0
            r3 = 0
            switch(r10) {
                case 0: goto L_0x0511;
                case 1: goto L_0x0507;
                case 2: goto L_0x04f9;
                case 3: goto L_0x04eb;
                case 4: goto L_0x04dd;
                case 5: goto L_0x04d3;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04bd;
                case 8: goto L_0x04a1;
                case 9: goto L_0x048f;
                case 10: goto L_0x047f;
                case 11: goto L_0x0471;
                case 12: goto L_0x0463;
                case 13: goto L_0x0458;
                case 14: goto L_0x044e;
                case 15: goto L_0x0440;
                case 16: goto L_0x0432;
                case 17: goto L_0x041e;
                case 18: goto L_0x0411;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dd;
                case 23: goto L_0x03d0;
                case 24: goto L_0x03c3;
                case 25: goto L_0x03b7;
                case 26: goto L_0x03ab;
                case 27: goto L_0x039b;
                case 28: goto L_0x038f;
                case 29: goto L_0x0382;
                case 30: goto L_0x0376;
                case 31: goto L_0x036a;
                case 32: goto L_0x035e;
                case 33: goto L_0x0352;
                case 34: goto L_0x0343;
                case 35: goto L_0x0325;
                case 36: goto L_0x0307;
                case 37: goto L_0x02e9;
                case 38: goto L_0x02cb;
                case 39: goto L_0x02ad;
                case 40: goto L_0x028f;
                case 41: goto L_0x0271;
                case 42: goto L_0x0253;
                case 43: goto L_0x0235;
                case 44: goto L_0x0218;
                case 45: goto L_0x01fb;
                case 46: goto L_0x01de;
                case 47: goto L_0x01c1;
                case 48: goto L_0x01a1;
                case 49: goto L_0x0191;
                case 50: goto L_0x0181;
                case 51: goto L_0x0173;
                case 52: goto L_0x0167;
                case 53: goto L_0x0157;
                case 54: goto L_0x0147;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x011f;
                case 58: goto L_0x0112;
                case 59: goto L_0x00f4;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b2;
                case 64: goto L_0x00a5;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.O r3 = (androidx.datastore.preferences.protobuf.O) r3
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.r(r9, r3, r4)
        L_0x0078:
            int r6 = r6 + r3
        L_0x0079:
            r10 = 0
            goto L_0x051d
        L_0x007c:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = V(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.L(r9, r3)
            goto L_0x0078
        L_0x008b:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = U(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.J(r9, r3)
            goto L_0x0078
        L_0x009a:
            boolean r8 = r0.D(r1, r9, r5)
            if (r8 == 0) goto L_0x0079
            int r3 = androidx.datastore.preferences.protobuf.C1737j.H(r9, r3)
            goto L_0x0078
        L_0x00a5:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.C1737j.F(r9, r3)
        L_0x00b0:
            int r6 = r6 + r4
            goto L_0x0079
        L_0x00b2:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = U(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.j(r9, r3)
            goto L_0x0078
        L_0x00c1:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = U(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.Q(r9, r3)
            goto L_0x0078
        L_0x00d0:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.g r3 = (androidx.datastore.preferences.protobuf.C1734g) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.f(r9, r3)
            goto L_0x0078
        L_0x00e1:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.o(r9, r3, r4)
            goto L_0x0078
        L_0x00f4:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.C1734g
            if (r4 == 0) goto L_0x010a
            androidx.datastore.preferences.protobuf.g r3 = (androidx.datastore.preferences.protobuf.C1734g) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.f(r9, r3)
            goto L_0x0078
        L_0x010a:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.N(r9, r3)
            goto L_0x0078
        L_0x0112:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.C1737j.c(r9, r3)
            goto L_0x0078
        L_0x011f:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.C1737j.l(r9, r3)
            goto L_0x00b0
        L_0x012b:
            boolean r8 = r0.D(r1, r9, r5)
            if (r8 == 0) goto L_0x0079
            int r3 = androidx.datastore.preferences.protobuf.C1737j.n(r9, r3)
            goto L_0x0078
        L_0x0137:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = U(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.u(r9, r3)
            goto L_0x0078
        L_0x0147:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = V(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.S(r9, r3)
            goto L_0x0078
        L_0x0157:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = V(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.w(r9, r3)
            goto L_0x0078
        L_0x0167:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = androidx.datastore.preferences.protobuf.C1737j.p(r9, r8)
            goto L_0x0078
        L_0x0173:
            boolean r3 = r0.D(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.C1737j.h(r9, r3)
            goto L_0x0078
        L_0x0181:
            androidx.datastore.preferences.protobuf.J r3 = r0.f16300q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.q(r5)
            int r3 = r3.e(r9, r4, r8)
            goto L_0x0078
        L_0x0191:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.j(r9, r3, r4)
            goto L_0x0078
        L_0x01a1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.t(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x01b5
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x01b5:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
        L_0x01bd:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x00b0
        L_0x01c1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.r(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x01d5
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x01d5:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x01de:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x01f2
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x01f2:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x01fb:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x020f
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x020f:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0218:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.e(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x022c
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x022c:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0235:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.w(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x0249
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x0249:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0253:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.b(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x0267
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x0267:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0271:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x0285
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x0285:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x02a3
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x02a3:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x02ad:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.l(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x02c1
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x02c1:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x02cb:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.y(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x02df
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x02df:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x02e9:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.n(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x02fd
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x02fd:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0307:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x031b
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x031b:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0325:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f16292i
            if (r4 == 0) goto L_0x0339
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x0339:
            int r4 = androidx.datastore.preferences.protobuf.C1737j.P(r9)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r3)
            goto L_0x01bd
        L_0x0343:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.g0.s(r9, r3, r4)
        L_0x034e:
            int r6 = r6 + r3
            r10 = r4
            goto L_0x051d
        L_0x0352:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.q(r9, r3, r4)
            goto L_0x034e
        L_0x035e:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r9, r3, r4)
            goto L_0x034e
        L_0x036a:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r9, r3, r4)
            goto L_0x034e
        L_0x0376:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.d(r9, r3, r4)
            goto L_0x034e
        L_0x0382:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.v(r9, r3, r4)
            goto L_0x0078
        L_0x038f:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.c(r9, r3)
            goto L_0x0078
        L_0x039b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.p(r9, r3, r4)
            goto L_0x0078
        L_0x03ab:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.u(r9, r3)
            goto L_0x0078
        L_0x03b7:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.g0.a(r9, r3, r4)
            goto L_0x034e
        L_0x03c3:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r9, r3, r4)
            goto L_0x034e
        L_0x03d0:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r9, r3, r4)
            goto L_0x034e
        L_0x03dd:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.k(r9, r3, r4)
            goto L_0x034e
        L_0x03ea:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.x(r9, r3, r4)
            goto L_0x034e
        L_0x03f7:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.m(r9, r3, r4)
            goto L_0x034e
        L_0x0404:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r9, r3, r4)
            goto L_0x034e
        L_0x0411:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r9, r3, r4)
            goto L_0x0078
        L_0x041e:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.O r3 = (androidx.datastore.preferences.protobuf.O) r3
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.r(r9, r3, r4)
            goto L_0x0078
        L_0x0432:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.L(r9, r3)
            goto L_0x0078
        L_0x0440:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.J(r9, r3)
            goto L_0x0078
        L_0x044e:
            r10 = r7 & r14
            if (r10 == 0) goto L_0x0079
            int r3 = androidx.datastore.preferences.protobuf.C1737j.H(r9, r3)
            goto L_0x0078
        L_0x0458:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.C1737j.F(r9, r3)
            goto L_0x00b0
        L_0x0463:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.j(r9, r3)
            goto L_0x0078
        L_0x0471:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.Q(r9, r3)
            goto L_0x0078
        L_0x047f:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.g r3 = (androidx.datastore.preferences.protobuf.C1734g) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.f(r9, r3)
            goto L_0x0078
        L_0x048f:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.e0 r4 = r0.r(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.o(r9, r3, r4)
            goto L_0x0078
        L_0x04a1:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.C1734g
            if (r4 == 0) goto L_0x04b5
            androidx.datastore.preferences.protobuf.g r3 = (androidx.datastore.preferences.protobuf.C1734g) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.f(r9, r3)
            goto L_0x0078
        L_0x04b5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.C1737j.N(r9, r3)
            goto L_0x0078
        L_0x04bd:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.C1737j.c(r9, r3)
            goto L_0x0078
        L_0x04c8:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            r10 = 0
            int r3 = androidx.datastore.preferences.protobuf.C1737j.l(r9, r10)
        L_0x04d1:
            int r6 = r6 + r3
            goto L_0x051d
        L_0x04d3:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x051d
            int r3 = androidx.datastore.preferences.protobuf.C1737j.n(r9, r3)
            goto L_0x04d1
        L_0x04dd:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051d
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.u(r9, r3)
            goto L_0x04d1
        L_0x04eb:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051d
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.S(r9, r3)
            goto L_0x04d1
        L_0x04f9:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051d
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.C1737j.w(r9, r3)
            goto L_0x04d1
        L_0x0507:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051d
            int r3 = androidx.datastore.preferences.protobuf.C1737j.p(r9, r8)
            goto L_0x04d1
        L_0x0511:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051d
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.C1737j.h(r9, r3)
            goto L_0x04d1
        L_0x051d:
            int r5 = r5 + 3
            r4 = r15
            goto L_0x000a
        L_0x0522:
            androidx.datastore.preferences.protobuf.l0 r2 = r0.f16298o
            int r2 = r0.u(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f16289f
            if (r2 == 0) goto L_0x0538
            androidx.datastore.preferences.protobuf.p r2 = r0.f16299p
            androidx.datastore.preferences.protobuf.s r1 = r2.c(r1)
            int r1 = r1.h()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.s(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int t(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f16283s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f16284a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04ed
            int r6 = r15.h0(r4)
            int r7 = g0(r6)
            int r8 = r15.P(r4)
            long r9 = Q(r6)
            androidx.datastore.preferences.protobuf.t r6 = androidx.datastore.preferences.protobuf.C1746t.DOUBLE_LIST_PACKED
            int r6 = r6.a()
            if (r7 < r6) goto L_0x0038
            androidx.datastore.preferences.protobuf.t r6 = androidx.datastore.preferences.protobuf.C1746t.SINT64_LIST_PACKED
            int r6 = r6.a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f16284a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r13 = 0
            r14 = 1
            r11 = 0
            switch(r7) {
                case 0: goto L_0x04db;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04bf;
                case 3: goto L_0x04af;
                case 4: goto L_0x049f;
                case 5: goto L_0x0493;
                case 6: goto L_0x0487;
                case 7: goto L_0x047b;
                case 8: goto L_0x045d;
                case 9: goto L_0x0449;
                case 10: goto L_0x0437;
                case 11: goto L_0x0427;
                case 12: goto L_0x0417;
                case 13: goto L_0x040b;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03df;
                case 17: goto L_0x03c9;
                case 18: goto L_0x03bf;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0397;
                case 23: goto L_0x038d;
                case 24: goto L_0x0383;
                case 25: goto L_0x0379;
                case 26: goto L_0x036f;
                case 27: goto L_0x0361;
                case 28: goto L_0x0357;
                case 29: goto L_0x034d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0339;
                case 32: goto L_0x032f;
                case 33: goto L_0x0325;
                case 34: goto L_0x031b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02df;
                case 37: goto L_0x02c1;
                case 38: goto L_0x02a3;
                case 39: goto L_0x0285;
                case 40: goto L_0x0267;
                case 41: goto L_0x0249;
                case 42: goto L_0x022b;
                case 43: goto L_0x020d;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01d3;
                case 46: goto L_0x01b6;
                case 47: goto L_0x0199;
                case 48: goto L_0x0179;
                case 49: goto L_0x016b;
                case 50: goto L_0x015b;
                case 51: goto L_0x014d;
                case 52: goto L_0x0141;
                case 53: goto L_0x0131;
                case 54: goto L_0x0121;
                case 55: goto L_0x0111;
                case 56: goto L_0x0105;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00ed;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009c;
                case 63: goto L_0x008d;
                case 64: goto L_0x0082;
                case 65: goto L_0x0077;
                case 66: goto L_0x0068;
                case 67: goto L_0x0059;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04e9
        L_0x0042:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.O r6 = (androidx.datastore.preferences.protobuf.O) r6
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.r(r8, r6, r7)
        L_0x0056:
            int r5 = r5 + r6
            goto L_0x04e9
        L_0x0059:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = V(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.L(r8, r6)
            goto L_0x0056
        L_0x0068:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = U(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.J(r8, r6)
            goto L_0x0056
        L_0x0077:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.H(r8, r11)
            goto L_0x0056
        L_0x0082:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.F(r8, r3)
            goto L_0x0056
        L_0x008d:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = U(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.j(r8, r6)
            goto L_0x0056
        L_0x009c:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = U(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.Q(r8, r6)
            goto L_0x0056
        L_0x00ab:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.f(r8, r6)
            goto L_0x0056
        L_0x00bc:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.g0.o(r8, r6, r7)
            goto L_0x0056
        L_0x00cf:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.C1734g
            if (r7 == 0) goto L_0x00e5
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.f(r8, r6)
            goto L_0x0056
        L_0x00e5:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.N(r8, r6)
            goto L_0x0056
        L_0x00ed:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.c(r8, r14)
            goto L_0x0056
        L_0x00f9:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.l(r8, r3)
            goto L_0x0056
        L_0x0105:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.n(r8, r11)
            goto L_0x0056
        L_0x0111:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = U(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.u(r8, r6)
            goto L_0x0056
        L_0x0121:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = V(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.S(r8, r6)
            goto L_0x0056
        L_0x0131:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = V(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.w(r8, r6)
            goto L_0x0056
        L_0x0141:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.p(r8, r13)
            goto L_0x0056
        L_0x014d:
            boolean r6 = r15.D(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.C1737j.h(r8, r6)
            goto L_0x0056
        L_0x015b:
            androidx.datastore.preferences.protobuf.J r6 = r0.f16300q
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            java.lang.Object r9 = r15.q(r4)
            int r6 = r6.e(r8, r7, r9)
            goto L_0x0056
        L_0x016b:
            java.util.List r6 = F(r1, r9)
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.g0.j(r8, r6, r7)
            goto L_0x0056
        L_0x0179:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.t(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x018d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x018d:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
        L_0x0195:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0056
        L_0x0199:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.r(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x01ad
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ad:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x01b6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x01ca
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ca:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x01d3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x01e7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01e7:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x01f0:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.e(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x0204
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0204:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x020d:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.w(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x0221
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0221:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x022b:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.b(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x023f
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x023f:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x0249:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x025d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x025d:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x0267:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x027b
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x027b:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x0285:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.l(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x0299
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0299:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x02a3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.y(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x02b7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02b7:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x02c1:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.n(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x02d5
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02d5:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x02df:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x02f3
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02f3:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x02fd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.g0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f16292i
            if (r9 == 0) goto L_0x0311
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0311:
            int r6 = androidx.datastore.preferences.protobuf.C1737j.P(r8)
            int r8 = androidx.datastore.preferences.protobuf.C1737j.R(r7)
            goto L_0x0195
        L_0x031b:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.s(r8, r6, r3)
            goto L_0x0056
        L_0x0325:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.q(r8, r6, r3)
            goto L_0x0056
        L_0x032f:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0339:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.f(r8, r6, r3)
            goto L_0x0056
        L_0x0343:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.d(r8, r6, r3)
            goto L_0x0056
        L_0x034d:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.v(r8, r6, r3)
            goto L_0x0056
        L_0x0357:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.c(r8, r6)
            goto L_0x0056
        L_0x0361:
            java.util.List r6 = F(r1, r9)
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.g0.p(r8, r6, r7)
            goto L_0x0056
        L_0x036f:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.u(r8, r6)
            goto L_0x0056
        L_0x0379:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.a(r8, r6, r3)
            goto L_0x0056
        L_0x0383:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.f(r8, r6, r3)
            goto L_0x0056
        L_0x038d:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0397:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.k(r8, r6, r3)
            goto L_0x0056
        L_0x03a1:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.x(r8, r6, r3)
            goto L_0x0056
        L_0x03ab:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.m(r8, r6, r3)
            goto L_0x0056
        L_0x03b5:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.f(r8, r6, r3)
            goto L_0x0056
        L_0x03bf:
            java.util.List r6 = F(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.g0.h(r8, r6, r3)
            goto L_0x0056
        L_0x03c9:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.O r6 = (androidx.datastore.preferences.protobuf.O) r6
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.r(r8, r6, r7)
            goto L_0x0056
        L_0x03df:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = androidx.datastore.preferences.protobuf.p0.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.L(r8, r6)
            goto L_0x0056
        L_0x03ef:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.p0.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.J(r8, r6)
            goto L_0x0056
        L_0x03ff:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.H(r8, r11)
            goto L_0x0056
        L_0x040b:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.F(r8, r3)
            goto L_0x0056
        L_0x0417:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.p0.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.j(r8, r6)
            goto L_0x0056
        L_0x0427:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.p0.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.Q(r8, r6)
            goto L_0x0056
        L_0x0437:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.f(r8, r6)
            goto L_0x0056
        L_0x0449:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            androidx.datastore.preferences.protobuf.e0 r7 = r15.r(r4)
            int r6 = androidx.datastore.preferences.protobuf.g0.o(r8, r6, r7)
            goto L_0x0056
        L_0x045d:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.p0.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.C1734g
            if (r7 == 0) goto L_0x0473
            androidx.datastore.preferences.protobuf.g r6 = (androidx.datastore.preferences.protobuf.C1734g) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.f(r8, r6)
            goto L_0x0056
        L_0x0473:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.C1737j.N(r8, r6)
            goto L_0x0056
        L_0x047b:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.c(r8, r14)
            goto L_0x0056
        L_0x0487:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.l(r8, r3)
            goto L_0x0056
        L_0x0493:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.n(r8, r11)
            goto L_0x0056
        L_0x049f:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.p0.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.u(r8, r6)
            goto L_0x0056
        L_0x04af:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = androidx.datastore.preferences.protobuf.p0.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.S(r8, r6)
            goto L_0x0056
        L_0x04bf:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = androidx.datastore.preferences.protobuf.p0.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.C1737j.w(r8, r6)
            goto L_0x0056
        L_0x04cf:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = androidx.datastore.preferences.protobuf.C1737j.p(r8, r13)
            goto L_0x0056
        L_0x04db:
            boolean r6 = r15.x(r1, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.C1737j.h(r8, r6)
            goto L_0x0056
        L_0x04e9:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04ed:
            androidx.datastore.preferences.protobuf.l0 r2 = r0.f16298o
            int r1 = r15.u(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(java.lang.Object):int");
    }

    private int u(l0 l0Var, Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    private static int v(Object obj, long j10) {
        return p0.x(obj, j10);
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean x(Object obj, int i10) {
        if (this.f16291h) {
            int h02 = h0(i10);
            long Q10 = Q(h02);
            switch (g0(h02)) {
                case 0:
                    if (p0.v(obj, Q10) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (p0.w(obj, Q10) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (p0.y(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (p0.y(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (p0.y(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return p0.p(obj, Q10);
                case 8:
                    Object A10 = p0.A(obj, Q10);
                    if (A10 instanceof String) {
                        return !((String) A10).isEmpty();
                    }
                    if (A10 instanceof C1734g) {
                        return !C1734g.f16324b.equals(A10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (p0.A(obj, Q10) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C1734g.f16324b.equals(p0.A(obj, Q10));
                case 11:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    if (p0.y(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    if (p0.x(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (p0.y(obj, Q10) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (p0.A(obj, Q10) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int X10 = X(i10);
            if ((p0.x(obj, (long) (X10 & 1048575)) & (1 << (X10 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private boolean y(Object obj, int i10, int i11, int i12) {
        if (this.f16291h) {
            return x(obj, i10);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    private static boolean z(Object obj, int i10, e0 e0Var) {
        return e0Var.f(p0.A(obj, Q(i10)));
    }

    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f16284a.length; i10 += 3) {
            L(obj, obj2, i10);
        }
        if (!this.f16291h) {
            g0.F(this.f16298o, obj, obj2);
            if (this.f16289f) {
                g0.D(this.f16299p, obj, obj2);
            }
        }
    }

    public Object b() {
        return this.f16296m.a(this.f16288e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f16284a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.h0(r1)
            int r4 = r8.P(r1)
            long r5 = Q(r3)
            int r3 = g0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = V(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = V(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = R(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = V(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = U(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = V(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = V(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = T(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = S(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.p0.p(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.p0.v(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C1751y.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.l0 r0 = r8.f16298o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f16289f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.p r0 = r8.f16299p
            androidx.datastore.preferences.protobuf.s r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.c(java.lang.Object):int");
    }

    public boolean d(Object obj, Object obj2) {
        int length = this.f16284a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f16298o.g(obj).equals(this.f16298o.g(obj2))) {
            return false;
        }
        if (this.f16289f) {
            return this.f16299p.c(obj).equals(this.f16299p.c(obj2));
        }
        return true;
    }

    public void e(Object obj) {
        int i10;
        int i11 = this.f16294k;
        while (true) {
            i10 = this.f16295l;
            if (i11 >= i10) {
                break;
            }
            long Q10 = Q(h0(this.f16293j[i11]));
            Object A10 = p0.A(obj, Q10);
            if (A10 != null) {
                p0.O(obj, Q10, this.f16300q.d(A10));
            }
            i11++;
        }
        int length = this.f16293j.length;
        while (i10 < length) {
            this.f16297n.c(obj, (long) this.f16293j[i10]);
            i10++;
        }
        this.f16298o.j(obj);
        if (this.f16289f) {
            this.f16299p.f(obj);
        }
    }

    public final boolean f(Object obj) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f16294k; i13++) {
            int i14 = this.f16293j[i13];
            int P10 = P(i14);
            int h02 = h0(i14);
            if (!this.f16291h) {
                int i15 = this.f16284a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f16283s.getInt(obj, (long) i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            if (E(h02) && !y(obj, i14, i12, i10)) {
                return false;
            }
            int g02 = g0(h02);
            if (g02 != 9 && g02 != 17) {
                if (g02 != 27) {
                    if (g02 == 60 || g02 == 68) {
                        if (D(obj, P10, i14) && !z(obj, h02, r(i14))) {
                            return false;
                        }
                    } else if (g02 != 49) {
                        if (g02 == 50 && !B(obj, h02, i14)) {
                            return false;
                        }
                    }
                }
                if (!A(obj, h02, i14)) {
                    return false;
                }
            } else if (y(obj, i14, i12, i10) && !z(obj, h02, r(i14))) {
                return false;
            }
        }
        if (!this.f16289f || this.f16299p.c(obj).k()) {
            return true;
        }
        return false;
    }

    public int g(Object obj) {
        if (this.f16291h) {
            return t(obj);
        }
        return s(obj);
    }

    public void h(Object obj, d0 d0Var, C1742o oVar) {
        oVar.getClass();
        H(this.f16298o, this.f16299p, obj, d0Var, oVar);
    }

    public void i(Object obj, s0 s0Var) {
        if (s0Var.t() == s0.a.DESCENDING) {
            k0(obj, s0Var);
        } else if (this.f16291h) {
            j0(obj, s0Var);
        } else {
            i0(obj, s0Var);
        }
    }
}
