package x0;

import c1.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2490f0;
import r0.C2514n0;
import r0.C2544x0;

/* renamed from: x0.d  reason: case insensitive filesystem */
public final class C2891d {

    /* renamed from: k  reason: collision with root package name */
    public static final b f28036k = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static int f28037l;

    /* renamed from: a  reason: collision with root package name */
    private final String f28038a;

    /* renamed from: b  reason: collision with root package name */
    private final float f28039b;

    /* renamed from: c  reason: collision with root package name */
    private final float f28040c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28041d;

    /* renamed from: e  reason: collision with root package name */
    private final float f28042e;

    /* renamed from: f  reason: collision with root package name */
    private final n f28043f;

    /* renamed from: g  reason: collision with root package name */
    private final long f28044g;

    /* renamed from: h  reason: collision with root package name */
    private final int f28045h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f28046i;

    /* renamed from: j  reason: collision with root package name */
    private final int f28047j;

    /* renamed from: x0.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f28048a;

        /* renamed from: b  reason: collision with root package name */
        private final float f28049b;

        /* renamed from: c  reason: collision with root package name */
        private final float f28050c;

        /* renamed from: d  reason: collision with root package name */
        private final float f28051d;

        /* renamed from: e  reason: collision with root package name */
        private final float f28052e;

        /* renamed from: f  reason: collision with root package name */
        private final long f28053f;

        /* renamed from: g  reason: collision with root package name */
        private final int f28054g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f28055h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList f28056i;

        /* renamed from: j  reason: collision with root package name */
        private C0469a f28057j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f28058k;

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        public static /* synthetic */ a b(a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            String str2;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            List list2;
            int i11 = i10;
            if ((i11 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f22 = 0.0f;
            if ((i11 & 2) != 0) {
                f17 = 0.0f;
            } else {
                f17 = f10;
            }
            if ((i11 & 4) != 0) {
                f18 = 0.0f;
            } else {
                f18 = f11;
            }
            if ((i11 & 8) != 0) {
                f19 = 0.0f;
            } else {
                f19 = f12;
            }
            float f23 = 1.0f;
            if ((i11 & 16) != 0) {
                f20 = 1.0f;
            } else {
                f20 = f13;
            }
            if ((i11 & 32) == 0) {
                f23 = f14;
            }
            if ((i11 & 64) != 0) {
                f21 = 0.0f;
            } else {
                f21 = f15;
            }
            if ((i11 & 128) == 0) {
                f22 = f16;
            }
            if ((i11 & 256) != 0) {
                list2 = o.d();
            } else {
                list2 = list;
            }
            return aVar.a(str2, f17, f18, f19, f20, f23, f21, f22, list2);
        }

        public static /* synthetic */ a d(a aVar, List list, int i10, String str, C2514n0 n0Var, float f10, C2514n0 n0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, Object obj) {
            int i14;
            String str2;
            C2514n0 n0Var3;
            float f17;
            float f18;
            float f19;
            int i15;
            int i16;
            float f20;
            float f21;
            int i17 = i13;
            if ((i17 & 2) != 0) {
                i14 = o.a();
            } else {
                i14 = i10;
            }
            if ((i17 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            C2514n0 n0Var4 = null;
            if ((i17 & 8) != 0) {
                n0Var3 = null;
            } else {
                n0Var3 = n0Var;
            }
            float f22 = 1.0f;
            if ((i17 & 16) != 0) {
                f17 = 1.0f;
            } else {
                f17 = f10;
            }
            if ((i17 & 32) == 0) {
                n0Var4 = n0Var2;
            }
            if ((i17 & 64) != 0) {
                f18 = 1.0f;
            } else {
                f18 = f11;
            }
            float f23 = 0.0f;
            if ((i17 & 128) != 0) {
                f19 = 0.0f;
            } else {
                f19 = f12;
            }
            if ((i17 & 256) != 0) {
                i15 = o.b();
            } else {
                i15 = i11;
            }
            if ((i17 & 512) != 0) {
                i16 = o.c();
            } else {
                i16 = i12;
            }
            if ((i17 & 1024) != 0) {
                f20 = 4.0f;
            } else {
                f20 = f13;
            }
            if ((i17 & 2048) != 0) {
                f21 = 0.0f;
            } else {
                f21 = f14;
            }
            if ((i17 & 4096) == 0) {
                f22 = f15;
            }
            if ((i17 & 8192) == 0) {
                f23 = f16;
            }
            return aVar.c(list, i14, str2, n0Var3, f17, n0Var4, f18, f19, i15, i16, f20, f21, f22, f23);
        }

        private final n e(C0469a aVar) {
            return new n(aVar.c(), aVar.f(), aVar.d(), aVar.e(), aVar.g(), aVar.h(), aVar.i(), aVar.j(), aVar.b(), aVar.a());
        }

        private final void h() {
            if (this.f28058k) {
                G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C0469a i() {
            return (C0469a) C2892e.d(this.f28056i);
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list) {
            h();
            boolean unused = C2892e.f(this.f28056i, new C0469a(str, f10, f11, f12, f13, f14, f15, f16, list, (List) null, 512, (DefaultConstructorMarker) null));
            return this;
        }

        public final a c(List list, int i10, String str, C2514n0 n0Var, float f10, C2514n0 n0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            h();
            List a10 = i().a();
            s sVar = r1;
            s sVar2 = new s(str, list, i10, n0Var, f10, n0Var2, f11, f12, i11, i12, f13, f14, f15, f16, (DefaultConstructorMarker) null);
            a10.add(sVar);
            return this;
        }

        public final C2891d f() {
            h();
            while (this.f28056i.size() > 1) {
                g();
            }
            C2891d dVar = new C2891d(this.f28048a, this.f28049b, this.f28050c, this.f28051d, this.f28052e, e(this.f28057j), this.f28053f, this.f28054g, this.f28055h, 0, 512, (DefaultConstructorMarker) null);
            this.f28058k = true;
            return dVar;
        }

        public final a g() {
            h();
            i().a().add(e((C0469a) C2892e.e(this.f28056i)));
            return this;
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f28048a = str;
            this.f28049b = f10;
            this.f28050c = f11;
            this.f28051d = f12;
            this.f28052e = f13;
            this.f28053f = j10;
            this.f28054g = i10;
            this.f28055h = z10;
            ArrayList arrayList = new ArrayList();
            this.f28056i = arrayList;
            C0469a aVar = new C0469a((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            this.f28057j = aVar;
            boolean unused = C2892e.f(arrayList, aVar);
        }

        /* renamed from: x0.d$a$a  reason: collision with other inner class name */
        private static final class C0469a {

            /* renamed from: a  reason: collision with root package name */
            private String f28059a;

            /* renamed from: b  reason: collision with root package name */
            private float f28060b;

            /* renamed from: c  reason: collision with root package name */
            private float f28061c;

            /* renamed from: d  reason: collision with root package name */
            private float f28062d;

            /* renamed from: e  reason: collision with root package name */
            private float f28063e;

            /* renamed from: f  reason: collision with root package name */
            private float f28064f;

            /* renamed from: g  reason: collision with root package name */
            private float f28065g;

            /* renamed from: h  reason: collision with root package name */
            private float f28066h;

            /* renamed from: i  reason: collision with root package name */
            private List f28067i;

            /* renamed from: j  reason: collision with root package name */
            private List f28068j;

            public C0469a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
                this.f28059a = str;
                this.f28060b = f10;
                this.f28061c = f11;
                this.f28062d = f12;
                this.f28063e = f13;
                this.f28064f = f14;
                this.f28065g = f15;
                this.f28066h = f16;
                this.f28067i = list;
                this.f28068j = list2;
            }

            public final List a() {
                return this.f28068j;
            }

            public final List b() {
                return this.f28067i;
            }

            public final String c() {
                return this.f28059a;
            }

            public final float d() {
                return this.f28061c;
            }

            public final float e() {
                return this.f28062d;
            }

            public final float f() {
                return this.f28060b;
            }

            public final float g() {
                return this.f28063e;
            }

            public final float h() {
                return this.f28064f;
            }

            public final float i() {
                return this.f28065g;
            }

            public final float j() {
                return this.f28066h;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C0469a(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
                /*
                    r10 = this;
                    r0 = r21
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0009
                    java.lang.String r1 = ""
                    goto L_0x000a
                L_0x0009:
                    r1 = r11
                L_0x000a:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L_0x0011
                    r2 = r3
                    goto L_0x0012
                L_0x0011:
                    r2 = r12
                L_0x0012:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0018
                    r4 = r3
                    goto L_0x0019
                L_0x0018:
                    r4 = r13
                L_0x0019:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001f
                    r5 = r3
                    goto L_0x0020
                L_0x001f:
                    r5 = r14
                L_0x0020:
                    r6 = r0 & 16
                    r7 = 1065353216(0x3f800000, float:1.0)
                    if (r6 == 0) goto L_0x0028
                    r6 = r7
                    goto L_0x0029
                L_0x0028:
                    r6 = r15
                L_0x0029:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x002e
                    goto L_0x0030
                L_0x002e:
                    r7 = r16
                L_0x0030:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0036
                    r8 = r3
                    goto L_0x0038
                L_0x0036:
                    r8 = r17
                L_0x0038:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003d
                    goto L_0x003f
                L_0x003d:
                    r3 = r18
                L_0x003f:
                    r9 = r0 & 256(0x100, float:3.59E-43)
                    if (r9 == 0) goto L_0x0048
                    java.util.List r9 = x0.o.d()
                    goto L_0x004a
                L_0x0048:
                    r9 = r19
                L_0x004a:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0054
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    goto L_0x0056
                L_0x0054:
                    r0 = r20
                L_0x0056:
                    r11 = r10
                    r12 = r1
                    r13 = r2
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r3
                    r20 = r9
                    r21 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: x0.C2891d.a.C0469a.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r14, float r15, float r16, float r17, float r18, long r19, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r14
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                r0.x0$a r1 = r0.C2544x0.f25560b
                long r1 = r1.h()
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r19
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0025
                r0.f0$a r1 = r0.C2490f0.f25500a
                int r1 = r1.z()
                r10 = r1
                goto L_0x0027
            L_0x0025:
                r10 = r21
            L_0x0027:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                r11 = r0
                goto L_0x0030
            L_0x002e:
                r11 = r22
            L_0x0030:
                r12 = 0
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.C2891d.a.<init>(java.lang.String, float, float, float, float, long, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: x0.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int a10;
            synchronized (this) {
                a10 = C2891d.f28037l;
                C2891d.f28037l = a10 + 1;
            }
            return a10;
        }

        private b() {
        }
    }

    public /* synthetic */ C2891d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, i11);
    }

    public final boolean c() {
        return this.f28046i;
    }

    public final float d() {
        return this.f28040c;
    }

    public final float e() {
        return this.f28039b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2891d)) {
            return false;
        }
        C2891d dVar = (C2891d) obj;
        if (C6496s.c(this.f28038a, dVar.f28038a) && h.m(this.f28039b, dVar.f28039b) && h.m(this.f28040c, dVar.f28040c) && this.f28041d == dVar.f28041d && this.f28042e == dVar.f28042e && C6496s.c(this.f28043f, dVar.f28043f) && C2544x0.q(this.f28044g, dVar.f28044g) && C2490f0.E(this.f28045h, dVar.f28045h) && this.f28046i == dVar.f28046i) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f28047j;
    }

    public final String g() {
        return this.f28038a;
    }

    public final n h() {
        return this.f28043f;
    }

    public int hashCode() {
        return (((((((((((((((this.f28038a.hashCode() * 31) + h.o(this.f28039b)) * 31) + h.o(this.f28040c)) * 31) + Float.hashCode(this.f28041d)) * 31) + Float.hashCode(this.f28042e)) * 31) + this.f28043f.hashCode()) * 31) + C2544x0.w(this.f28044g)) * 31) + C2490f0.F(this.f28045h)) * 31) + Boolean.hashCode(this.f28046i);
    }

    public final int i() {
        return this.f28045h;
    }

    public final long j() {
        return this.f28044g;
    }

    public final float k() {
        return this.f28042e;
    }

    public final float l() {
        return this.f28041d;
    }

    private C2891d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11) {
        this.f28038a = str;
        this.f28039b = f10;
        this.f28040c = f11;
        this.f28041d = f12;
        this.f28042e = f13;
        this.f28043f = nVar;
        this.f28044g = j10;
        this.f28045h = i10;
        this.f28046i = z10;
        this.f28047j = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2891d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, (i12 & 512) != 0 ? f28036k.a() : i11, (DefaultConstructorMarker) null);
    }
}
