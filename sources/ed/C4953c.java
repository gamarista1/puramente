package ed;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: ed.c  reason: case insensitive filesystem */
public final class C4953c {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f60092e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f  reason: collision with root package name */
    private static final C4953c[] f60093f = a();

    /* renamed from: a  reason: collision with root package name */
    private final int f60094a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f60095b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f60096c;

    /* renamed from: d  reason: collision with root package name */
    private final int f60097d;

    /* renamed from: ed.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f60098a;

        /* renamed from: b  reason: collision with root package name */
        private final int f60099b;

        a(int i10, int i11) {
            this.f60098a = i10;
            this.f60099b = i11;
        }

        public int a() {
            return this.f60098a;
        }

        public int b() {
            return this.f60099b;
        }
    }

    /* renamed from: ed.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f60100a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f60101b;

        b(int i10, a... aVarArr) {
            this.f60100a = i10;
            this.f60101b = aVarArr;
        }

        public a[] a() {
            return this.f60101b;
        }

        public int b() {
            return this.f60100a;
        }

        public int c() {
            int i10 = 0;
            for (a a10 : this.f60101b) {
                i10 += a10.a();
            }
            return i10;
        }

        public int d() {
            return this.f60100a * c();
        }
    }

    private C4953c(int i10, int[] iArr, b... bVarArr) {
        this.f60094a = i10;
        this.f60095b = iArr;
        this.f60096c = bVarArr;
        int b10 = bVarArr[0].b();
        int i11 = 0;
        for (a aVar : bVarArr[0].a()) {
            i11 += aVar.a() * (aVar.b() + b10);
        }
        this.f60097d = i11;
    }

    private static C4953c[] a() {
        C4953c cVar = r1;
        C4953c cVar2 = new C4953c(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9)));
        C4953c cVar3 = r2;
        C4953c cVar4 = new C4953c(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16)));
        C4953c cVar5 = r3;
        C4953c cVar6 = new C4953c(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13)));
        C4953c cVar7 = r4;
        C4953c cVar8 = new C4953c(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9)));
        C4953c cVar9 = r5;
        C4953c cVar10 = new C4953c(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12)));
        C4953c cVar11 = r6;
        C4953c cVar12 = new C4953c(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15)));
        C4953c cVar13 = r8;
        C4953c cVar14 = cVar;
        C4953c cVar15 = new C4953c(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14)));
        C4953c cVar16 = r0;
        C4953c cVar17 = cVar3;
        C4953c cVar18 = new C4953c(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15)));
        C4953c cVar19 = r0;
        C4953c cVar20 = cVar5;
        C4953c cVar21 = new C4953c(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13)));
        C4953c cVar22 = r0;
        C4953c cVar23 = cVar7;
        C4953c cVar24 = new C4953c(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16)));
        C4953c cVar25 = r0;
        C4953c cVar26 = cVar9;
        C4953c cVar27 = new C4953c(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13)));
        C4953c cVar28 = r0;
        C4953c cVar29 = cVar11;
        C4953c cVar30 = new C4953c(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15)));
        C4953c cVar31 = r0;
        C4953c cVar32 = cVar13;
        C4953c cVar33 = new C4953c(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12)));
        C4953c cVar34 = r0;
        C4953c cVar35 = cVar16;
        C4953c cVar36 = new C4953c(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13)));
        C4953c cVar37 = r0;
        C4953c cVar38 = cVar19;
        C4953c cVar39 = new C4953c(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13)));
        C4953c cVar40 = r0;
        C4953c cVar41 = cVar22;
        C4953c cVar42 = new C4953c(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16)));
        C4953c cVar43 = r0;
        C4953c cVar44 = new C4953c(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15)));
        C4953c cVar45 = r0;
        C4953c cVar46 = new C4953c(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15)));
        C4953c cVar47 = r0;
        C4953c cVar48 = new C4953c(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14)));
        C4953c cVar49 = r0;
        C4953c cVar50 = new C4953c(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16)));
        C4953c cVar51 = r0;
        C4953c cVar52 = new C4953c(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, ModuleDescriptor.MODULE_VERSION)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17)));
        C4953c cVar53 = r0;
        C4953c cVar54 = new C4953c(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13)));
        C4953c cVar55 = r0;
        C4953c cVar56 = new C4953c(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16)));
        C4953c cVar57 = r0;
        C4953c cVar58 = new C4953c(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, ModuleDescriptor.MODULE_VERSION), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17)));
        C4953c cVar59 = r0;
        C4953c cVar60 = new C4953c(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16)));
        C4953c cVar61 = r0;
        C4953c cVar62 = new C4953c(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17)));
        C4953c cVar63 = r0;
        C4953c cVar64 = new C4953c(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16)));
        C4953c cVar65 = r0;
        C4953c cVar66 = new C4953c(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, ModuleDescriptor.MODULE_VERSION), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16)));
        C4953c cVar67 = r0;
        C4953c cVar68 = new C4953c(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new a(7, 116), new a(7, ModuleDescriptor.MODULE_VERSION)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16)));
        C4953c cVar69 = r0;
        C4953c cVar70 = new C4953c(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16)));
        C4953c cVar71 = r0;
        C4953c cVar72 = new C4953c(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16)));
        C4953c cVar73 = r0;
        C4953c cVar74 = new C4953c(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16)));
        C4953c cVar75 = r0;
        C4953c cVar76 = new C4953c(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16)));
        C4953c cVar77 = r0;
        C4953c cVar78 = new C4953c(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17)));
        C4953c cVar79 = r0;
        C4953c cVar80 = new C4953c(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16)));
        C4953c cVar81 = r0;
        C4953c cVar82 = new C4953c(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16)));
        C4953c cVar83 = r0;
        C4953c cVar84 = new C4953c(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16)));
        C4953c cVar85 = r0;
        C4953c cVar86 = new C4953c(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16)));
        C4953c cVar87 = r0;
        C4953c cVar88 = new C4953c(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, ModuleDescriptor.MODULE_VERSION), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16)));
        C4953c cVar89 = r0;
        C4953c cVar90 = new C4953c(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)));
        return new C4953c[]{cVar14, cVar17, cVar20, cVar23, cVar26, cVar29, cVar32, cVar35, cVar38, cVar41, cVar25, cVar28, cVar31, cVar34, cVar37, cVar40, cVar43, cVar45, cVar47, cVar49, cVar51, cVar53, cVar55, cVar57, cVar59, cVar61, cVar63, cVar65, cVar67, cVar69, cVar71, cVar73, cVar75, cVar77, cVar79, cVar81, cVar83, cVar85, cVar87, cVar89};
    }

    public static C4953c e(int i10) {
        if (i10 > 0 && i10 <= 40) {
            return f60093f[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return (this.f60094a * 4) + 17;
    }

    public b c(C4951a aVar) {
        return this.f60096c[aVar.ordinal()];
    }

    public int d() {
        return this.f60097d;
    }

    public int f() {
        return this.f60094a;
    }

    public String toString() {
        return String.valueOf(this.f60094a);
    }
}
