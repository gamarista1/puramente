package kg;

import ig.c;
import ig.j;
import ig.k;
import ig.x;
import pg.C6648j;

/* renamed from: kg.b  reason: case insensitive filesystem */
public abstract class C6435b {

    /* renamed from: A  reason: collision with root package name */
    public static final C1024b f71526A;

    /* renamed from: B  reason: collision with root package name */
    public static final C1024b f71527B;

    /* renamed from: C  reason: collision with root package name */
    public static final C1024b f71528C;

    /* renamed from: D  reason: collision with root package name */
    public static final C1024b f71529D;

    /* renamed from: E  reason: collision with root package name */
    public static final C1024b f71530E;

    /* renamed from: F  reason: collision with root package name */
    public static final C1024b f71531F;

    /* renamed from: G  reason: collision with root package name */
    public static final C1024b f71532G;

    /* renamed from: H  reason: collision with root package name */
    public static final C1024b f71533H;

    /* renamed from: I  reason: collision with root package name */
    public static final C1024b f71534I;

    /* renamed from: J  reason: collision with root package name */
    public static final C1024b f71535J;

    /* renamed from: K  reason: collision with root package name */
    public static final C1024b f71536K;

    /* renamed from: L  reason: collision with root package name */
    public static final C1024b f71537L;

    /* renamed from: M  reason: collision with root package name */
    public static final C1024b f71538M;

    /* renamed from: N  reason: collision with root package name */
    public static final C1024b f71539N;

    /* renamed from: O  reason: collision with root package name */
    public static final C1024b f71540O;

    /* renamed from: P  reason: collision with root package name */
    public static final C1024b f71541P = d.c();

    /* renamed from: a  reason: collision with root package name */
    public static final C1024b f71542a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1024b f71543b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1024b f71544c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f71545d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f71546e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f71547f;

    /* renamed from: g  reason: collision with root package name */
    public static final C1024b f71548g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1024b f71549h;

    /* renamed from: i  reason: collision with root package name */
    public static final C1024b f71550i;

    /* renamed from: j  reason: collision with root package name */
    public static final C1024b f71551j;

    /* renamed from: k  reason: collision with root package name */
    public static final C1024b f71552k;

    /* renamed from: l  reason: collision with root package name */
    public static final C1024b f71553l;

    /* renamed from: m  reason: collision with root package name */
    public static final C1024b f71554m;

    /* renamed from: n  reason: collision with root package name */
    public static final C1024b f71555n;

    /* renamed from: o  reason: collision with root package name */
    public static final C1024b f71556o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f71557p;

    /* renamed from: q  reason: collision with root package name */
    public static final C1024b f71558q;

    /* renamed from: r  reason: collision with root package name */
    public static final C1024b f71559r;

    /* renamed from: s  reason: collision with root package name */
    public static final C1024b f71560s;

    /* renamed from: t  reason: collision with root package name */
    public static final C1024b f71561t;

    /* renamed from: u  reason: collision with root package name */
    public static final C1024b f71562u;

    /* renamed from: v  reason: collision with root package name */
    public static final C1024b f71563v;

    /* renamed from: w  reason: collision with root package name */
    public static final C1024b f71564w;

    /* renamed from: x  reason: collision with root package name */
    public static final C1024b f71565x;

    /* renamed from: y  reason: collision with root package name */
    public static final C1024b f71566y;

    /* renamed from: z  reason: collision with root package name */
    public static final C1024b f71567z;

    /* renamed from: kg.b$b  reason: collision with other inner class name */
    public static class C1024b extends d {
        public C1024b(int i10) {
            super(i10, 1);
        }

        /* renamed from: f */
        public Boolean d(int i10) {
            boolean z10 = true;
            if ((i10 & (1 << this.f71569a)) == 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        /* renamed from: g */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f71569a;
            }
            return 0;
        }
    }

    /* renamed from: kg.b$c */
    private static class c extends d {

        /* renamed from: c  reason: collision with root package name */
        private final C6648j.a[] f71568c;

        public c(int i10, C6648j.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f71568c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        /* renamed from: h */
        public C6648j.a d(int i10) {
            int i11 = this.f71569a;
            int i12 = (i10 & (((1 << this.f71570b) - 1) << i11)) >> i11;
            for (C6648j.a aVar : this.f71568c) {
                if (aVar.d() == i12) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int e(C6648j.a aVar) {
            return aVar.d() << this.f71569a;
        }
    }

    /* renamed from: kg.b$d */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f71569a;

        /* renamed from: b  reason: collision with root package name */
        public final int f71570b;

        public static d a(d dVar, C6648j.a[] aVarArr) {
            return new c(dVar.f71569a + dVar.f71570b, aVarArr);
        }

        public static C1024b b(d dVar) {
            return new C1024b(dVar.f71569a + dVar.f71570b);
        }

        public static C1024b c() {
            return new C1024b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        private d(int i10, int i11) {
            this.f71569a = i10;
            this.f71570b = i11;
        }
    }

    static {
        C1024b c10 = d.c();
        f71542a = c10;
        f71543b = d.b(c10);
        C1024b c11 = d.c();
        f71544c = c11;
        d a10 = d.a(c11, x.values());
        f71545d = a10;
        d a11 = d.a(a10, k.values());
        f71546e = a11;
        d a12 = d.a(a11, c.C1017c.values());
        f71547f = a12;
        C1024b b10 = d.b(a12);
        f71548g = b10;
        C1024b b11 = d.b(b10);
        f71549h = b11;
        C1024b b12 = d.b(b11);
        f71550i = b12;
        C1024b b13 = d.b(b12);
        f71551j = b13;
        C1024b b14 = d.b(b13);
        f71552k = b14;
        C1024b b15 = d.b(b14);
        f71553l = b15;
        f71554m = d.b(b15);
        C1024b b16 = d.b(a10);
        f71555n = b16;
        f71556o = d.b(b16);
        d a13 = d.a(a11, j.values());
        f71557p = a13;
        C1024b b17 = d.b(a13);
        f71558q = b17;
        C1024b b18 = d.b(b17);
        f71559r = b18;
        C1024b b19 = d.b(b18);
        f71560s = b19;
        C1024b b20 = d.b(b19);
        f71561t = b20;
        C1024b b21 = d.b(b20);
        f71562u = b21;
        C1024b b22 = d.b(b21);
        f71563v = b22;
        C1024b b23 = d.b(b22);
        f71564w = b23;
        f71565x = d.b(b23);
        C1024b b24 = d.b(a13);
        f71566y = b24;
        C1024b b25 = d.b(b24);
        f71567z = b25;
        C1024b b26 = d.b(b25);
        f71526A = b26;
        C1024b b27 = d.b(b26);
        f71527B = b27;
        C1024b b28 = d.b(b27);
        f71528C = b28;
        C1024b b29 = d.b(b28);
        f71529D = b29;
        C1024b b30 = d.b(b29);
        f71530E = b30;
        C1024b b31 = d.b(b30);
        f71531F = b31;
        f71532G = d.b(b31);
        C1024b b32 = d.b(c11);
        f71533H = b32;
        C1024b b33 = d.b(b32);
        f71534I = b33;
        f71535J = d.b(b33);
        C1024b b34 = d.b(a11);
        f71536K = b34;
        C1024b b35 = d.b(b34);
        f71537L = b35;
        f71538M = d.b(b35);
        C1024b c12 = d.c();
        f71539N = c12;
        f71540O = d.b(c12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.C6435b.a(int):void");
    }

    public static int b(boolean z10, x xVar, k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f71544c.e(Boolean.valueOf(z10)) | f71546e.e(kVar) | f71545d.e(xVar) | f71536K.e(Boolean.valueOf(z11)) | f71537L.e(Boolean.valueOf(z12)) | f71538M.e(Boolean.valueOf(z13));
    }
}
