package com.google.protobuf;

import com.google.protobuf.D;
import com.google.protobuf.n0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.i  reason: case insensitive filesystem */
final class C4871i implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final C4870h f58494a;

    /* renamed from: com.google.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58495a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.m0$b[] r0 = com.google.protobuf.m0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58495a = r0
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f58495a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.m0$b r1 = com.google.protobuf.m0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4871i.a.<clinit>():void");
        }
    }

    private C4871i(C4870h hVar) {
        C4870h hVar2 = (C4870h) C4881t.b(hVar, "output");
        this.f58494a = hVar2;
        hVar2.f58482a = this;
    }

    public static C4871i P(C4870h hVar) {
        C4871i iVar = hVar.f58482a;
        if (iVar != null) {
            return iVar;
        }
        return new C4871i(hVar);
    }

    private void Q(int i10, boolean z10, Object obj, D.a aVar) {
        this.f58494a.N0(i10, 2);
        this.f58494a.P0(D.b(aVar, Boolean.valueOf(z10), obj));
        D.e(this.f58494a, aVar, Boolean.valueOf(z10), obj);
    }

    private void R(int i10, D.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i11] = intValue.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f58494a.N0(i10, 2);
            this.f58494a.P0(D.b(aVar, Integer.valueOf(i13), obj));
            D.e(this.f58494a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void S(int i10, D.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i11] = longValue.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f58494a.N0(i10, 2);
            this.f58494a.P0(D.b(aVar, Long.valueOf(j10), obj));
            D.e(this.f58494a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void T(int i10, D.a aVar, Map map) {
        switch (a.f58495a[aVar.f58380a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f58380a);
        }
    }

    private void U(int i10, D.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            Object obj = map.get(str2);
            this.f58494a.N0(i10, 2);
            this.f58494a.P0(D.b(aVar, str2, obj));
            D.e(this.f58494a, aVar, str2, obj);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f58494a.L0(i10, (String) obj);
        } else {
            this.f58494a.f0(i10, (C4868f) obj);
        }
    }

    public void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.e(((Boolean) list.get(i13)).booleanValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.c0(((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.b0(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public void B(int i10, float f10) {
        this.f58494a.p0(i10, f10);
    }

    public void C(int i10) {
        this.f58494a.N0(i10, 4);
    }

    public void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.J(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.I0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.H0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void E(int i10, int i11) {
        this.f58494a.j0(i10, i11);
    }

    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.y(((Long) list.get(i13)).longValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.y0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.x0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.j(((Double) list.get(i13)).doubleValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.i0(((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.h0(i10, ((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public void H(int i10, int i11) {
        this.f58494a.H0(i10, i11);
    }

    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f58494a.f0(i10, (C4868f) list.get(i11));
        }
    }

    public void J(int i10, List list, Z z10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), z10);
        }
    }

    public void K(int i10, Object obj, Z z10) {
        this.f58494a.s0(i10, (K) obj, z10);
    }

    public void L(int i10, C4868f fVar) {
        this.f58494a.f0(i10, fVar);
    }

    public void M(int i10, List list, Z z10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), z10);
        }
    }

    public void N(int i10, Object obj, Z z10) {
        this.f58494a.z0(i10, (K) obj, z10);
    }

    public void O(int i10, D.a aVar, Map map) {
        if (this.f58494a.W()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f58494a.N0(i10, 2);
            this.f58494a.P0(D.b(aVar, entry.getKey(), entry.getValue()));
            D.e(this.f58494a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.r(((Float) list.get(i13)).floatValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.q0(((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.p0(i10, ((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    public final void b(int i10, Object obj) {
        if (obj instanceof C4868f) {
            this.f58494a.C0(i10, (C4868f) obj);
        } else {
            this.f58494a.B0(i10, (K) obj);
        }
    }

    public void c(int i10, int i11) {
        this.f58494a.l0(i10, i11);
    }

    public void d(int i10, List list) {
        int i11 = 0;
        if (list instanceof C4887z) {
            C4887z zVar = (C4887z) list;
            while (i11 < list.size()) {
                V(i10, zVar.s(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.L0(i10, (String) list.get(i11));
            i11++;
        }
    }

    public void e(int i10, String str) {
        this.f58494a.L0(i10, str);
    }

    public void f(int i10, long j10) {
        this.f58494a.Q0(i10, j10);
    }

    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.w(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.w0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.v0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void h(int i10, int i11) {
        this.f58494a.v0(i10, i11);
    }

    public void i(int i10, long j10) {
        this.f58494a.F0(i10, j10);
    }

    public void j(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.n(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.m0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.l0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.Q(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.P0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.O0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.L(((Long) list.get(i13)).longValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.K0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.J0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void m(int i10, long j10) {
        this.f58494a.J0(i10, j10);
    }

    public void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.l(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.j0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void o(int i10, int i11) {
        this.f58494a.O0(i10, i11);
    }

    public void p(int i10, double d10) {
        this.f58494a.h0(i10, d10);
    }

    public void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.H(((Long) list.get(i13)).longValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.G0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.F0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.S(((Long) list.get(i13)).longValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.R0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.Q0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void s(int i10, long j10) {
        this.f58494a.n0(i10, j10);
    }

    public n0.a t() {
        return n0.a.ASCENDING;
    }

    public void u(int i10, long j10) {
        this.f58494a.x0(i10, j10);
    }

    public void v(int i10, boolean z10) {
        this.f58494a.b0(i10, z10);
    }

    public void w(int i10, int i11) {
        this.f58494a.D0(i10, i11);
    }

    public void x(int i10) {
        this.f58494a.N0(i10, 3);
    }

    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.p(((Long) list.get(i13)).longValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.o0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.n0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f58494a.N0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C4870h.F(((Integer) list.get(i13)).intValue());
            }
            this.f58494a.P0(i12);
            while (i11 < list.size()) {
                this.f58494a.E0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f58494a.D0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
