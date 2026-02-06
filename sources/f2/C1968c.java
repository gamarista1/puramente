package f2;

import android.media.AudioAttributes;
import i2.L;

/* renamed from: f2.c  reason: case insensitive filesystem */
public final class C1968c {

    /* renamed from: g  reason: collision with root package name */
    public static final C1968c f19951g = new e().a();

    /* renamed from: h  reason: collision with root package name */
    private static final String f19952h = L.y0(0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f19953i = L.y0(1);

    /* renamed from: j  reason: collision with root package name */
    private static final String f19954j = L.y0(2);

    /* renamed from: k  reason: collision with root package name */
    private static final String f19955k = L.y0(3);

    /* renamed from: l  reason: collision with root package name */
    private static final String f19956l = L.y0(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f19957a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19958b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19959c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19960d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19961e;

    /* renamed from: f  reason: collision with root package name */
    private d f19962f;

    /* renamed from: f2.c$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: f2.c$c  reason: collision with other inner class name */
    private static final class C0344c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: f2.c$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f19963a;

        private d(C1968c cVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(cVar.f19957a).setFlags(cVar.f19958b).setUsage(cVar.f19959c);
            int i10 = L.f22072a;
            if (i10 >= 29) {
                b.a(usage, cVar.f19960d);
            }
            if (i10 >= 32) {
                C0344c.a(usage, cVar.f19961e);
            }
            this.f19963a = usage.build();
        }
    }

    /* renamed from: f2.c$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private int f19964a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f19965b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f19966c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f19967d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f19968e = 0;

        public C1968c a() {
            return new C1968c(this.f19964a, this.f19965b, this.f19966c, this.f19967d, this.f19968e);
        }
    }

    public d a() {
        if (this.f19962f == null) {
            this.f19962f = new d();
        }
        return this.f19962f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1968c.class != obj.getClass()) {
            return false;
        }
        C1968c cVar = (C1968c) obj;
        if (this.f19957a == cVar.f19957a && this.f19958b == cVar.f19958b && this.f19959c == cVar.f19959c && this.f19960d == cVar.f19960d && this.f19961e == cVar.f19961e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f19957a) * 31) + this.f19958b) * 31) + this.f19959c) * 31) + this.f19960d) * 31) + this.f19961e;
    }

    private C1968c(int i10, int i11, int i12, int i13, int i14) {
        this.f19957a = i10;
        this.f19958b = i11;
        this.f19959c = i12;
        this.f19960d = i13;
        this.f19961e = i14;
    }
}
