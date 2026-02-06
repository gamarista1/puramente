package ff;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import p003if.h;

/* renamed from: ff.f  reason: case insensitive filesystem */
public final class C5852f {

    /* renamed from: A  reason: collision with root package name */
    private String f67495A;

    /* renamed from: B  reason: collision with root package name */
    private String f67496B;

    /* renamed from: C  reason: collision with root package name */
    private String f67497C;

    /* renamed from: D  reason: collision with root package name */
    private Float f67498D;

    /* renamed from: E  reason: collision with root package name */
    private Integer f67499E;

    /* renamed from: F  reason: collision with root package name */
    private Double f67500F;

    /* renamed from: G  reason: collision with root package name */
    private String f67501G;

    /* renamed from: H  reason: collision with root package name */
    private Map f67502H;

    /* renamed from: a  reason: collision with root package name */
    private String f67503a;

    /* renamed from: b  reason: collision with root package name */
    private String f67504b;

    /* renamed from: c  reason: collision with root package name */
    private String f67505c;

    /* renamed from: d  reason: collision with root package name */
    private String f67506d;

    /* renamed from: e  reason: collision with root package name */
    private String f67507e;

    /* renamed from: f  reason: collision with root package name */
    private String f67508f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f67509g;

    /* renamed from: h  reason: collision with root package name */
    private Float f67510h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f67511i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f67512j;

    /* renamed from: k  reason: collision with root package name */
    private b f67513k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f67514l;

    /* renamed from: m  reason: collision with root package name */
    private Long f67515m;

    /* renamed from: n  reason: collision with root package name */
    private Long f67516n;

    /* renamed from: o  reason: collision with root package name */
    private Long f67517o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f67518p;

    /* renamed from: q  reason: collision with root package name */
    private Long f67519q;

    /* renamed from: r  reason: collision with root package name */
    private Long f67520r;

    /* renamed from: s  reason: collision with root package name */
    private Long f67521s;

    /* renamed from: t  reason: collision with root package name */
    private Long f67522t;

    /* renamed from: u  reason: collision with root package name */
    private Integer f67523u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f67524v;

    /* renamed from: w  reason: collision with root package name */
    private Float f67525w;

    /* renamed from: x  reason: collision with root package name */
    private Integer f67526x;

    /* renamed from: y  reason: collision with root package name */
    private Date f67527y;

    /* renamed from: z  reason: collision with root package name */
    private TimeZone f67528z;

    /* renamed from: ff.f$a */
    public static final class a {
    }

    /* renamed from: ff.f$b */
    public enum b {
        PORTRAIT,
        LANDSCAPE;

        /* renamed from: ff.f$b$a */
        public static final class a {
        }
    }

    public C5852f() {
    }

    public void a(String str) {
        this.f67505c = str;
    }

    public void b(String str) {
        this.f67496B = str;
    }

    public void c(String str) {
        this.f67507e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5852f.class != obj.getClass()) {
            return false;
        }
        C5852f fVar = (C5852f) obj;
        if (!h.a(this.f67503a, fVar.f67503a) || !h.a(this.f67504b, fVar.f67504b) || !h.a(this.f67505c, fVar.f67505c) || !h.a(this.f67506d, fVar.f67506d) || !h.a(this.f67507e, fVar.f67507e) || !h.a(this.f67508f, fVar.f67508f) || !Arrays.equals(this.f67509g, fVar.f67509g) || !h.a(this.f67510h, fVar.f67510h) || !h.a(this.f67511i, fVar.f67511i) || !h.a(this.f67512j, fVar.f67512j) || this.f67513k != fVar.f67513k || !h.a(this.f67514l, fVar.f67514l) || !h.a(this.f67515m, fVar.f67515m) || !h.a(this.f67516n, fVar.f67516n) || !h.a(this.f67517o, fVar.f67517o) || !h.a(this.f67518p, fVar.f67518p) || !h.a(this.f67519q, fVar.f67519q) || !h.a(this.f67520r, fVar.f67520r) || !h.a(this.f67521s, fVar.f67521s) || !h.a(this.f67522t, fVar.f67522t) || !h.a(this.f67523u, fVar.f67523u) || !h.a(this.f67524v, fVar.f67524v) || !h.a(this.f67525w, fVar.f67525w) || !h.a(this.f67526x, fVar.f67526x) || !h.a(this.f67527y, fVar.f67527y) || !h.a(this.f67495A, fVar.f67495A) || !h.a(this.f67496B, fVar.f67496B) || !h.a(this.f67497C, fVar.f67497C) || !h.a(this.f67498D, fVar.f67498D) || !h.a(this.f67499E, fVar.f67499E) || !h.a(this.f67500F, fVar.f67500F) || !h.a(this.f67501G, fVar.f67501G)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f67503a;
        return (h.b(str, this.f67504b, this.f67505c, this.f67506d, this.f67507e, this.f67508f, this.f67510h, this.f67511i, this.f67512j, this.f67513k, this.f67514l, this.f67515m, this.f67516n, this.f67517o, this.f67518p, this.f67519q, this.f67520r, this.f67521s, this.f67522t, this.f67523u, this.f67524v, this.f67525w, this.f67526x, this.f67527y, this.f67528z, this.f67495A, this.f67496B, this.f67497C, this.f67498D, this.f67499E, this.f67500F, this.f67501G) * 31) + Arrays.hashCode(this.f67509g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.TimeZone} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5852f(ff.C5852f r3) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.f67503a
            r2.f67503a = r0
            java.lang.String r0 = r3.f67504b
            r2.f67504b = r0
            java.lang.String r0 = r3.f67505c
            r2.f67505c = r0
            java.lang.String r0 = r3.f67506d
            r2.f67506d = r0
            java.lang.String r0 = r3.f67507e
            r2.f67507e = r0
            java.lang.String r0 = r3.f67508f
            r2.f67508f = r0
            java.lang.Boolean r0 = r3.f67511i
            r2.f67511i = r0
            java.lang.Boolean r0 = r3.f67512j
            r2.f67512j = r0
            ff.f$b r0 = r3.f67513k
            r2.f67513k = r0
            java.lang.Boolean r0 = r3.f67514l
            r2.f67514l = r0
            java.lang.Long r0 = r3.f67515m
            r2.f67515m = r0
            java.lang.Long r0 = r3.f67516n
            r2.f67516n = r0
            java.lang.Long r0 = r3.f67517o
            r2.f67517o = r0
            java.lang.Boolean r0 = r3.f67518p
            r2.f67518p = r0
            java.lang.Long r0 = r3.f67519q
            r2.f67519q = r0
            java.lang.Long r0 = r3.f67520r
            r2.f67520r = r0
            java.lang.Long r0 = r3.f67521s
            r2.f67521s = r0
            java.lang.Long r0 = r3.f67522t
            r2.f67522t = r0
            java.lang.Integer r0 = r3.f67523u
            r2.f67523u = r0
            java.lang.Integer r0 = r3.f67524v
            r2.f67524v = r0
            java.lang.Float r0 = r3.f67525w
            r2.f67525w = r0
            java.lang.Integer r0 = r3.f67526x
            r2.f67526x = r0
            java.util.Date r0 = r3.f67527y
            r2.f67527y = r0
            java.lang.String r0 = r3.f67495A
            r2.f67495A = r0
            java.lang.String r0 = r3.f67497C
            r2.f67497C = r0
            java.lang.Float r0 = r3.f67498D
            r2.f67498D = r0
            java.lang.Float r0 = r3.f67510h
            r2.f67510h = r0
            java.lang.String[] r0 = r3.f67509g
            r1 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L_0x007c
        L_0x007b:
            r0 = r1
        L_0x007c:
            r2.f67509g = r0
            java.lang.String r0 = r3.f67496B
            r2.f67496B = r0
            java.util.TimeZone r0 = r3.f67528z
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r0.clone()
            r1 = r0
            java.util.TimeZone r1 = (java.util.TimeZone) r1
        L_0x008d:
            r2.f67528z = r1
            java.lang.Integer r0 = r3.f67499E
            r2.f67499E = r0
            java.lang.Double r0 = r3.f67500F
            r2.f67500F = r0
            java.lang.String r0 = r3.f67501G
            r2.f67501G = r0
            java.util.Map r3 = r3.f67502H
            java.util.Map r3 = p003if.b.b(r3)
            r2.f67502H = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.C5852f.<init>(ff.f):void");
    }
}
