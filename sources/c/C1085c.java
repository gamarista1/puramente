package C;

import c1.t;
import k0.c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

/* renamed from: C.c  reason: case insensitive filesystem */
public final class C1085c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1085c f882a = new C1085c();

    /* renamed from: b  reason: collision with root package name */
    private static final e f883b = new k();

    /* renamed from: c  reason: collision with root package name */
    private static final e f884c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static final m f885d = new l();

    /* renamed from: e  reason: collision with root package name */
    private static final m f886e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final f f887f = new C0008c();

    /* renamed from: g  reason: collision with root package name */
    private static final f f888g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static final f f889h = new h();

    /* renamed from: i  reason: collision with root package name */
    private static final f f890i = new g();

    /* renamed from: C.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f891a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final e f892b = new b();

        /* renamed from: c  reason: collision with root package name */
        private static final e f893c = new C0006a();

        /* renamed from: d  reason: collision with root package name */
        private static final e f894d = new C0007c();

        /* renamed from: e  reason: collision with root package name */
        private static final e f895e = new e();

        /* renamed from: f  reason: collision with root package name */
        private static final e f896f = new f();

        /* renamed from: g  reason: collision with root package name */
        private static final e f897g = new d();

        /* renamed from: C.c$a$a  reason: collision with other inner class name */
        public static final class C0006a implements e {
            C0006a() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.h(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* renamed from: C.c$a$b */
        public static final class b implements e {
            b() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.i(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* renamed from: C.c$a$c  reason: collision with other inner class name */
        public static final class C0007c implements e {
            C0007c() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.j(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        /* renamed from: C.c$a$d */
        public static final class d implements e {
            d() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.k(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* renamed from: C.c$a$e */
        public static final class e implements e {
            e() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.l(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        /* renamed from: C.c$a$f */
        public static final class f implements e {
            f() {
            }

            public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C1085c.f882a.m(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        /* renamed from: C.c$a$g */
        static final class g extends C6498u implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f898a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(c.b bVar) {
                super(2);
                this.f898a = bVar;
            }

            public final Integer a(int i10, t tVar) {
                return Integer.valueOf(this.f898a.a(0, i10, tVar));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (t) obj2);
            }
        }

        private a() {
        }

        public final e a() {
            return f893c;
        }

        public final e b() {
            return f892b;
        }

        public final e c() {
            return f894d;
        }

        public final f d(float f10) {
            return new j(f10, false, (yf.p) null, (DefaultConstructorMarker) null);
        }

        public final e e(float f10, c.b bVar) {
            return new j(f10, false, new g(bVar), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: C.c$b */
    public static final class b implements m {
        b() {
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.j(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: C.c$c  reason: collision with other inner class name */
    public static final class C0008c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f899a = c1.h.j((float) 0);

        C0008c() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.h(i10, iArr, iArr2, false);
            } else {
                C1085c.f882a.h(i10, iArr, iArr2, true);
            }
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.h(i10, iArr, iArr2, false);
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m0getSpacingD9Ej5fM() {
            return this.f899a;
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: C.c$d */
    public static final class d implements e {
        d() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.j(i10, iArr, iArr2, false);
            } else {
                C1085c.f882a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* renamed from: C.c$e */
    public interface e {
        void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        float m1getSpacingD9Ej5fM() {
            return c1.h.j((float) 0);
        }
    }

    /* renamed from: C.c$f */
    public interface f extends e, m {
    }

    /* renamed from: C.c$g */
    public static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f900a = c1.h.j((float) 0);

        g() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.k(i10, iArr, iArr2, false);
            } else {
                C1085c.f882a.k(i10, iArr, iArr2, true);
            }
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.k(i10, iArr, iArr2, false);
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m2getSpacingD9Ej5fM() {
            return this.f900a;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* renamed from: C.c$h */
    public static final class h implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f901a = c1.h.j((float) 0);

        h() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.l(i10, iArr, iArr2, false);
            } else {
                C1085c.f882a.l(i10, iArr, iArr2, true);
            }
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.l(i10, iArr, iArr2, false);
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m3getSpacingD9Ej5fM() {
            return this.f901a;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* renamed from: C.c$i */
    public static final class i implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f902a = c1.h.j((float) 0);

        i() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.m(i10, iArr, iArr2, false);
            } else {
                C1085c.f882a.m(i10, iArr, iArr2, true);
            }
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.m(i10, iArr, iArr2, false);
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m4getSpacingD9Ej5fM() {
            return this.f902a;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* renamed from: C.c$j */
    public static final class j implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f903a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f904b;

        /* renamed from: c  reason: collision with root package name */
        private final yf.p f905c;

        /* renamed from: d  reason: collision with root package name */
        private final float f906d;

        public /* synthetic */ j(float f10, boolean z10, yf.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, z10, pVar);
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            boolean z10;
            int i11;
            int i12;
            if (iArr.length != 0) {
                int E02 = dVar.E0(this.f903a);
                if (!this.f904b || tVar != t.Rtl) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                C1085c cVar = C1085c.f882a;
                if (!z10) {
                    int length = iArr.length;
                    int i13 = 0;
                    i12 = 0;
                    i11 = 0;
                    int i14 = 0;
                    while (i13 < length) {
                        int i15 = iArr[i13];
                        int min = Math.min(i12, i10 - i15);
                        iArr2[i14] = min;
                        int min2 = Math.min(E02, (i10 - min) - i15);
                        int i16 = iArr2[i14] + i15 + min2;
                        i13++;
                        i14++;
                        int i17 = i16;
                        i11 = min2;
                        i12 = i17;
                    }
                } else {
                    int length2 = iArr.length - 1;
                    int i18 = 0;
                    int i19 = 0;
                    while (-1 < length2) {
                        int i20 = iArr[length2];
                        int min3 = Math.min(i12, i10 - i20);
                        iArr2[length2] = min3;
                        int min4 = Math.min(E02, (i10 - min3) - i20);
                        length2--;
                        int i21 = iArr2[length2] + i20 + min4;
                        i19 = min4;
                        i18 = i21;
                    }
                }
                int i22 = i12 - i11;
                yf.p pVar = this.f905c;
                if (pVar != null && i22 < i10) {
                    int intValue = ((Number) pVar.invoke(Integer.valueOf(i10 - i22), tVar)).intValue();
                    int length3 = iArr2.length;
                    for (int i23 = 0; i23 < length3; i23++) {
                        iArr2[i23] = iArr2[i23] + intValue;
                    }
                }
            }
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            a(dVar, i10, iArr, t.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (c1.h.m(this.f903a, jVar.f903a) && this.f904b == jVar.f904b && C6496s.c(this.f905c, jVar.f905c)) {
                return true;
            }
            return false;
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m5getSpacingD9Ej5fM() {
            return this.f906d;
        }

        public int hashCode() {
            int i10;
            int o10 = ((c1.h.o(this.f903a) * 31) + Boolean.hashCode(this.f904b)) * 31;
            yf.p pVar = this.f905c;
            if (pVar == null) {
                i10 = 0;
            } else {
                i10 = pVar.hashCode();
            }
            return o10 + i10;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            if (this.f904b) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb2.append(str);
            sb2.append("Arrangement#spacedAligned(");
            sb2.append(c1.h.p(this.f903a));
            sb2.append(", ");
            sb2.append(this.f905c);
            sb2.append(')');
            return sb2.toString();
        }

        private j(float f10, boolean z10, yf.p pVar) {
            this.f903a = f10;
            this.f904b = z10;
            this.f905c = pVar;
            this.f906d = f10;
        }
    }

    /* renamed from: C.c$k */
    public static final class k implements e {
        k() {
        }

        public void a(c1.d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C1085c.f882a.i(iArr, iArr2, false);
            } else {
                C1085c.f882a.j(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: C.c$l */
    public static final class l implements m {
        l() {
        }

        public void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C1085c.f882a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* renamed from: C.c$m */
    public interface m {
        void arrange(c1.d dVar, int i10, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        float m6getSpacingD9Ej5fM() {
            return c1.h.j((float) 0);
        }
    }

    /* renamed from: C.c$n */
    static final class n extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final n f907a = new n();

        n() {
            super(2);
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(c.f23044a.k().a(0, i10, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    /* renamed from: C.c$o */
    static final class o extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.b f908a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c.b bVar) {
            super(2);
            this.f908a = bVar;
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(this.f908a.a(0, i10, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    /* renamed from: C.c$p */
    static final class p extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.C0368c f909a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c.C0368c cVar) {
            super(2);
            this.f909a = cVar;
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(this.f909a.a(0, i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    private C1085c() {
    }

    public final m a() {
        return f886e;
    }

    public final f b() {
        return f887f;
    }

    public final e c() {
        return f884c;
    }

    public final f d() {
        return f889h;
    }

    public final f e() {
        return f888g;
    }

    public final e f() {
        return f883b;
    }

    public final m g() {
        return f885d;
    }

    public final void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = ((float) (i10 - i12)) / ((float) 2);
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += (float) i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += (float) i16;
            } else {
                return;
            }
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = i10;
                i10 += i14;
            } else {
                return;
            }
        }
    }

    public final void j(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = i14;
                i14 += i17;
            } else {
                return;
            }
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        boolean z11;
        float f10;
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            f10 = ((float) (i10 - i12)) / ((float) iArr.length);
        } else {
            f10 = 0.0f;
        }
        float f11 = f10 / ((float) 2);
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f11);
                f11 += ((float) i15) + f10;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f11);
            f11 += ((float) i16) + f10;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        float f10;
        if (iArr.length != 0) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 : iArr) {
                i12 += i13;
            }
            float max = ((float) (i10 - i12)) / ((float) Math.max(C6559l.h0(iArr), 1));
            if (!z10 || iArr.length != 1) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            if (!z10) {
                int length = iArr.length;
                int i14 = 0;
                while (i11 < length) {
                    int i15 = iArr[i11];
                    iArr2[i14] = Math.round(f10);
                    f10 += ((float) i15) + max;
                    i11++;
                    i14++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i16 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += ((float) i16) + max;
            }
        }
    }

    public final void m(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = ((float) (i10 - i12)) / ((float) (iArr.length + 1));
        if (!z10) {
            int length2 = iArr.length;
            float f10 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += ((float) i15) + length;
                i11++;
                i14++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f11);
            f11 += ((float) i16) + length;
        }
    }

    public final f n(float f10) {
        return new j(f10, true, n.f907a, (DefaultConstructorMarker) null);
    }

    public final e o(float f10, c.b bVar) {
        return new j(f10, true, new o(bVar), (DefaultConstructorMarker) null);
    }

    public final m p(float f10, c.C0368c cVar) {
        return new j(f10, false, new p(cVar), (DefaultConstructorMarker) null);
    }
}
