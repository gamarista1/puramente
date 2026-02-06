package V0;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class p implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8210b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final p f8211c;

    /* renamed from: d  reason: collision with root package name */
    private static final p f8212d;

    /* renamed from: e  reason: collision with root package name */
    private static final p f8213e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final p f8214f;

    /* renamed from: g  reason: collision with root package name */
    private static final p f8215g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final p f8216h;

    /* renamed from: i  reason: collision with root package name */
    private static final p f8217i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final p f8218j;

    /* renamed from: k  reason: collision with root package name */
    private static final p f8219k;

    /* renamed from: l  reason: collision with root package name */
    private static final p f8220l;

    /* renamed from: m  reason: collision with root package name */
    private static final p f8221m;

    /* renamed from: n  reason: collision with root package name */
    private static final p f8222n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final p f8223o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final p f8224p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final p f8225q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final p f8226r;

    /* renamed from: s  reason: collision with root package name */
    private static final p f8227s;

    /* renamed from: t  reason: collision with root package name */
    private static final p f8228t;

    /* renamed from: u  reason: collision with root package name */
    private static final List f8229u;

    /* renamed from: a  reason: collision with root package name */
    private final int f8230a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f8226r;
        }

        public final p b() {
            return p.f8224p;
        }

        public final p c() {
            return p.f8223o;
        }

        public final p d() {
            return p.f8225q;
        }

        public final p e() {
            return p.f8214f;
        }

        public final p f() {
            return p.f8216h;
        }

        public final p g() {
            return p.f8218j;
        }

        private a() {
        }
    }

    static {
        p pVar = new p(100);
        f8211c = pVar;
        p pVar2 = new p(200);
        f8212d = pVar2;
        p pVar3 = new p(300);
        f8213e = pVar3;
        p pVar4 = new p(400);
        f8214f = pVar4;
        p pVar5 = new p(500);
        f8215g = pVar5;
        p pVar6 = new p(600);
        f8216h = pVar6;
        p pVar7 = new p(700);
        f8217i = pVar7;
        p pVar8 = new p(800);
        f8218j = pVar8;
        p pVar9 = new p(900);
        f8219k = pVar9;
        f8220l = pVar;
        f8221m = pVar2;
        f8222n = pVar3;
        f8223o = pVar4;
        f8224p = pVar5;
        f8225q = pVar6;
        f8226r = pVar7;
        f8227s = pVar8;
        f8228t = pVar9;
        f8229u = C6565s.q(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public p(int i10) {
        this.f8230a = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && this.f8230a == ((p) obj).f8230a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8230a;
    }

    /* renamed from: l */
    public int compareTo(p pVar) {
        return C6496s.i(this.f8230a, pVar.f8230a);
    }

    public final int m() {
        return this.f8230a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f8230a + ')';
    }
}
