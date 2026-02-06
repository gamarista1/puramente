package j3;

import Ff.d;
import gh.C5988l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import l3.C2173c;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23010a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23011b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23012c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23013d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23014e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23015f;

    /* renamed from: g  reason: collision with root package name */
    private final int f23016g;

    /* renamed from: h  reason: collision with root package name */
    private final int f23017h;

    /* renamed from: i  reason: collision with root package name */
    private final int f23018i;

    /* renamed from: j  reason: collision with root package name */
    private String f23019j;

    /* renamed from: k  reason: collision with root package name */
    private d f23020k;

    /* renamed from: l  reason: collision with root package name */
    private Object f23021l;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f23022a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f23023b;

        /* renamed from: c  reason: collision with root package name */
        private int f23024c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f23025d;

        /* renamed from: e  reason: collision with root package name */
        private d f23026e;

        /* renamed from: f  reason: collision with root package name */
        private Object f23027f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f23028g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f23029h;

        /* renamed from: i  reason: collision with root package name */
        private int f23030i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f23031j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f23032k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f23033l = -1;

        public static /* synthetic */ a k(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final z a() {
            String str = this.f23025d;
            if (str != null) {
                return new z(this.f23022a, this.f23023b, str, this.f23028g, this.f23029h, this.f23030i, this.f23031j, this.f23032k, this.f23033l);
            }
            d dVar = this.f23026e;
            if (dVar != null) {
                return new z(this.f23022a, this.f23023b, dVar, this.f23028g, this.f23029h, this.f23030i, this.f23031j, this.f23032k, this.f23033l);
            }
            Object obj = this.f23027f;
            if (obj != null) {
                boolean z10 = this.f23022a;
                boolean z11 = this.f23023b;
                C6496s.e(obj);
                return new z(z10, z11, obj, this.f23028g, this.f23029h, this.f23030i, this.f23031j, this.f23032k, this.f23033l);
            }
            return new z(this.f23022a, this.f23023b, this.f23024c, this.f23028g, this.f23029h, this.f23030i, this.f23031j, this.f23032k, this.f23033l);
        }

        public final a b(int i10) {
            this.f23030i = i10;
            return this;
        }

        public final a c(int i10) {
            this.f23031j = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f23022a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f23032k = i10;
            return this;
        }

        public final a f(int i10) {
            this.f23033l = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f23024c = i10;
            this.f23025d = null;
            this.f23028g = z10;
            this.f23029h = z11;
            return this;
        }

        public final a h(d dVar, boolean z10, boolean z11) {
            C6496s.h(dVar, "klass");
            this.f23026e = dVar;
            this.f23024c = -1;
            this.f23028g = z10;
            this.f23029h = z11;
            return this;
        }

        public final a i(Object obj, boolean z10, boolean z11) {
            C6496s.h(obj, "route");
            this.f23027f = obj;
            g(C2173c.b(C5988l.a(O.b(obj.getClass()))), z10, z11);
            return this;
        }

        public final a j(String str, boolean z10, boolean z11) {
            this.f23025d = str;
            this.f23024c = -1;
            this.f23028g = z10;
            this.f23029h = z11;
            return this;
        }

        public final a l(boolean z10) {
            this.f23023b = z10;
            return this;
        }
    }

    public z(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f23010a = z10;
        this.f23011b = z11;
        this.f23012c = i10;
        this.f23013d = z12;
        this.f23014e = z13;
        this.f23015f = i11;
        this.f23016g = i12;
        this.f23017h = i13;
        this.f23018i = i14;
    }

    public final int a() {
        return this.f23015f;
    }

    public final int b() {
        return this.f23016g;
    }

    public final int c() {
        return this.f23017h;
    }

    public final int d() {
        return this.f23018i;
    }

    public final int e() {
        return this.f23012c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f23010a == zVar.f23010a && this.f23011b == zVar.f23011b && this.f23012c == zVar.f23012c && C6496s.c(this.f23019j, zVar.f23019j) && C6496s.c(this.f23020k, zVar.f23020k) && C6496s.c(this.f23021l, zVar.f23021l) && this.f23013d == zVar.f23013d && this.f23014e == zVar.f23014e && this.f23015f == zVar.f23015f && this.f23016g == zVar.f23016g && this.f23017h == zVar.f23017h && this.f23018i == zVar.f23018i) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f23019j;
    }

    public final d g() {
        return this.f23020k;
    }

    public final Object h() {
        return this.f23021l;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = (((((j() ? 1 : 0) * true) + (l() ? 1 : 0)) * 31) + this.f23012c) * 31;
        String str = this.f23019j;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        d dVar = this.f23020k;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Object obj = this.f23021l;
        if (obj != null) {
            i13 = obj.hashCode();
        }
        return ((((((((((((i15 + i13) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + this.f23015f) * 31) + this.f23016g) * 31) + this.f23017h) * 31) + this.f23018i;
    }

    public final boolean i() {
        return this.f23013d;
    }

    public final boolean j() {
        return this.f23010a;
    }

    public final boolean k() {
        return this.f23014e;
    }

    public final boolean l() {
        return this.f23011b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z.class.getSimpleName());
        sb2.append("(");
        if (this.f23010a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f23011b) {
            sb2.append("restoreState ");
        }
        String str = this.f23019j;
        if (!((str == null && this.f23012c == -1) || str == null)) {
            sb2.append("popUpTo(");
            String str2 = this.f23019j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                d dVar = this.f23020k;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.f23021l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f23012c));
                    }
                }
            }
            if (this.f23013d) {
                sb2.append(" inclusive");
            }
            if (this.f23014e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (!(this.f23015f == -1 && this.f23016g == -1 && this.f23017h == -1 && this.f23018i == -1)) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f23015f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f23016g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f23017h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f23018i));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }

    public z(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, s.f22957k.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f23019j = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public z(boolean z10, boolean z11, d dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C2173c.b(C5988l.a(dVar)), z12, z13, i10, i11, i12, i13);
        C6496s.e(dVar);
        this.f23020k = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public z(boolean z10, boolean z11, Object obj, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C2173c.b(C5988l.a(O.b(obj.getClass()))), z12, z13, i10, i11, i12, i13);
        C6496s.h(obj, "popUpToRouteObject");
        this.f23021l = obj;
    }
}
