package rh;

import Sg.p;
import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: rh.d  reason: case insensitive filesystem */
public final class C6707d {

    /* renamed from: n  reason: collision with root package name */
    public static final b f73247n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final C6707d f73248o = new a().d().a();

    /* renamed from: p  reason: collision with root package name */
    public static final C6707d f73249p = new a().f().c(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f73250a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73251b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73252c;

    /* renamed from: d  reason: collision with root package name */
    private final int f73253d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f73254e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f73255f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f73256g;

    /* renamed from: h  reason: collision with root package name */
    private final int f73257h;

    /* renamed from: i  reason: collision with root package name */
    private final int f73258i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f73259j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f73260k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f73261l;

    /* renamed from: m  reason: collision with root package name */
    private String f73262m;

    /* renamed from: rh.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f73263a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f73264b;

        /* renamed from: c  reason: collision with root package name */
        private int f73265c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f73266d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f73267e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f73268f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f73269g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f73270h;

        private final int b(long j10) {
            if (j10 > 2147483647L) {
                return a.e.API_PRIORITY_OTHER;
            }
            return (int) j10;
        }

        public final C6707d a() {
            return new C6707d(this.f73263a, this.f73264b, this.f73265c, -1, false, false, false, this.f73266d, this.f73267e, this.f73268f, this.f73269g, this.f73270h, (String) null, (DefaultConstructorMarker) null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f73266d = b(timeUnit.toSeconds((long) i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f73263a = true;
            return this;
        }

        public final a e() {
            this.f73264b = true;
            return this;
        }

        public final a f() {
            this.f73268f = true;
            return this;
        }
    }

    /* renamed from: rh.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (p.N(str2, str.charAt(i10), false, 2, (Object) null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rh.C6707d b(rh.u r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.C6496s.h(r1, r2)
                int r2 = r31.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0183
                java.lang.String r3 = r1.g(r7)
                java.lang.String r6 = r1.x(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = Sg.p.v(r3, r4, r5)
                if (r4 == 0) goto L_0x003b
                if (r9 == 0) goto L_0x0039
            L_0x0037:
                r8 = 0
                goto L_0x0044
            L_0x0039:
                r9 = r6
                goto L_0x0044
            L_0x003b:
                java.lang.String r4 = "Pragma"
                boolean r3 = Sg.p.v(r3, r4, r5)
                if (r3 == 0) goto L_0x0178
                goto L_0x0037
            L_0x0044:
                r3 = 0
            L_0x0045:
                int r4 = r6.length()
                if (r3 >= r4) goto L_0x0178
                java.lang.String r4 = "=,;"
                int r4 = r0.a(r6, r4, r3)
                java.lang.String r3 = r6.substring(r3, r4)
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C6496s.g(r3, r5)
                java.lang.CharSequence r3 = Sg.p.g1(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r6.length()
                if (r4 == r1) goto L_0x00c1
                char r1 = r6.charAt(r4)
                r29 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00c3
                char r1 = r6.charAt(r4)
                r2 = 59
                if (r1 != r2) goto L_0x007b
                goto L_0x00c3
            L_0x007b:
                int r4 = r4 + 1
                int r1 = sh.C6726e.D(r6, r4)
                int r2 = r6.length()
                if (r1 >= r2) goto L_0x00ab
                char r2 = r6.charAt(r1)
                r4 = 34
                if (r2 != r4) goto L_0x00ab
                int r1 = r1 + 1
                r27 = 4
                r28 = 0
                r24 = 34
                r26 = 0
                r23 = r6
                r25 = r1
                int r2 = Sg.p.a0(r23, r24, r25, r26, r27, r28)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.C6496s.g(r1, r5)
                r4 = 1
                int r2 = r2 + r4
                goto L_0x00c7
            L_0x00ab:
                java.lang.String r2 = ",;"
                int r2 = r0.a(r6, r2, r1)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.C6496s.g(r1, r5)
                java.lang.CharSequence r1 = Sg.p.g1(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c7
            L_0x00c1:
                r29 = r2
            L_0x00c3:
                int r4 = r4 + 1
                r2 = r4
                r1 = 0
            L_0x00c7:
                java.lang.String r4 = "no-cache"
                r5 = 1
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x00d8
                r1 = r31
                r3 = r2
                r10 = r5
            L_0x00d4:
                r2 = r29
                goto L_0x0045
            L_0x00d8:
                java.lang.String r4 = "no-store"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x00e5
                r1 = r31
                r3 = r2
                r11 = r5
                goto L_0x00d4
            L_0x00e5:
                java.lang.String r4 = "max-age"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x00f6
                r4 = -1
                int r12 = sh.C6726e.Y(r1, r4)
            L_0x00f2:
                r1 = r31
                r3 = r2
                goto L_0x00d4
            L_0x00f6:
                java.lang.String r4 = "s-maxage"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x0104
                r4 = -1
                int r13 = sh.C6726e.Y(r1, r4)
                goto L_0x00f2
            L_0x0104:
                java.lang.String r4 = "private"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x0111
                r1 = r31
                r3 = r2
                r14 = r5
                goto L_0x00d4
            L_0x0111:
                java.lang.String r4 = "public"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x011e
                r1 = r31
                r3 = r2
                r15 = r5
                goto L_0x00d4
            L_0x011e:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x012c
                r1 = r31
                r3 = r2
                r16 = r5
                goto L_0x00d4
            L_0x012c:
                java.lang.String r4 = "max-stale"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x013c
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = sh.C6726e.Y(r1, r3)
                goto L_0x00f2
            L_0x013c:
                java.lang.String r4 = "min-fresh"
                boolean r4 = Sg.p.v(r4, r3, r5)
                if (r4 == 0) goto L_0x014a
                r4 = -1
                int r18 = sh.C6726e.Y(r1, r4)
                goto L_0x00f2
            L_0x014a:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = Sg.p.v(r1, r3, r5)
                if (r1 == 0) goto L_0x015a
                r1 = r31
                r3 = r2
                r19 = r5
                goto L_0x00d4
            L_0x015a:
                java.lang.String r1 = "no-transform"
                boolean r1 = Sg.p.v(r1, r3, r5)
                if (r1 == 0) goto L_0x0169
                r1 = r31
                r3 = r2
                r20 = r5
                goto L_0x00d4
            L_0x0169:
                java.lang.String r1 = "immutable"
                boolean r1 = Sg.p.v(r1, r3, r5)
                if (r1 == 0) goto L_0x00f2
                r1 = r31
                r3 = r2
                r21 = r5
                goto L_0x00d4
            L_0x0178:
                r29 = r2
                r4 = -1
                int r7 = r7 + 1
                r1 = r31
                r2 = r29
                goto L_0x0023
            L_0x0183:
                if (r8 != 0) goto L_0x0188
                r22 = 0
                goto L_0x018a
            L_0x0188:
                r22 = r9
            L_0x018a:
                rh.d r1 = new rh.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.C6707d.b.b(rh.u):rh.d");
        }

        private b() {
        }
    }

    public /* synthetic */ C6707d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f73254e;
    }

    public final boolean b() {
        return this.f73255f;
    }

    public final int c() {
        return this.f73252c;
    }

    public final int d() {
        return this.f73257h;
    }

    public final int e() {
        return this.f73258i;
    }

    public final boolean f() {
        return this.f73256g;
    }

    public final boolean g() {
        return this.f73250a;
    }

    public final boolean h() {
        return this.f73251b;
    }

    public final boolean i() {
        return this.f73259j;
    }

    public String toString() {
        String str = this.f73262m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f73250a) {
            sb2.append("no-cache, ");
        }
        if (this.f73251b) {
            sb2.append("no-store, ");
        }
        if (this.f73252c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f73252c);
            sb2.append(", ");
        }
        if (this.f73253d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f73253d);
            sb2.append(", ");
        }
        if (this.f73254e) {
            sb2.append("private, ");
        }
        if (this.f73255f) {
            sb2.append("public, ");
        }
        if (this.f73256g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f73257h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f73257h);
            sb2.append(", ");
        }
        if (this.f73258i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f73258i);
            sb2.append(", ");
        }
        if (this.f73259j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f73260k) {
            sb2.append("no-transform, ");
        }
        if (this.f73261l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f73262m = sb3;
        return sb3;
    }

    private C6707d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f73250a = z10;
        this.f73251b = z11;
        this.f73252c = i10;
        this.f73253d = i11;
        this.f73254e = z12;
        this.f73255f = z13;
        this.f73256g = z14;
        this.f73257h = i12;
        this.f73258i = i13;
        this.f73259j = z15;
        this.f73260k = z16;
        this.f73261l = z17;
        this.f73262m = str;
    }
}
