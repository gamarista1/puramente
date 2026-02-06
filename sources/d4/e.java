package D4;

import B4.j;
import B4.k;
import B4.n;
import C4.h;
import F4.C3007j;
import java.util.List;
import java.util.Locale;
import u4.C4071k;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List f30317a;

    /* renamed from: b  reason: collision with root package name */
    private final C4071k f30318b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30319c;

    /* renamed from: d  reason: collision with root package name */
    private final long f30320d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30321e;

    /* renamed from: f  reason: collision with root package name */
    private final long f30322f;

    /* renamed from: g  reason: collision with root package name */
    private final String f30323g;

    /* renamed from: h  reason: collision with root package name */
    private final List f30324h;

    /* renamed from: i  reason: collision with root package name */
    private final n f30325i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30326j;

    /* renamed from: k  reason: collision with root package name */
    private final int f30327k;

    /* renamed from: l  reason: collision with root package name */
    private final int f30328l;

    /* renamed from: m  reason: collision with root package name */
    private final float f30329m;

    /* renamed from: n  reason: collision with root package name */
    private final float f30330n;

    /* renamed from: o  reason: collision with root package name */
    private final float f30331o;

    /* renamed from: p  reason: collision with root package name */
    private final float f30332p;

    /* renamed from: q  reason: collision with root package name */
    private final j f30333q;

    /* renamed from: r  reason: collision with root package name */
    private final k f30334r;

    /* renamed from: s  reason: collision with root package name */
    private final B4.b f30335s;

    /* renamed from: t  reason: collision with root package name */
    private final List f30336t;

    /* renamed from: u  reason: collision with root package name */
    private final b f30337u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f30338v;

    /* renamed from: w  reason: collision with root package name */
    private final C4.a f30339w;

    /* renamed from: x  reason: collision with root package name */
    private final C3007j f30340x;

    /* renamed from: y  reason: collision with root package name */
    private final h f30341y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List list, C4071k kVar, String str, long j10, a aVar, long j11, String str2, List list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar2, List list3, b bVar, B4.b bVar2, boolean z10, C4.a aVar2, C3007j jVar2, h hVar) {
        this.f30317a = list;
        this.f30318b = kVar;
        this.f30319c = str;
        this.f30320d = j10;
        this.f30321e = aVar;
        this.f30322f = j11;
        this.f30323g = str2;
        this.f30324h = list2;
        this.f30325i = nVar;
        this.f30326j = i10;
        this.f30327k = i11;
        this.f30328l = i12;
        this.f30329m = f10;
        this.f30330n = f11;
        this.f30331o = f12;
        this.f30332p = f13;
        this.f30333q = jVar;
        this.f30334r = kVar2;
        this.f30336t = list3;
        this.f30337u = bVar;
        this.f30335s = bVar2;
        this.f30338v = z10;
        this.f30339w = aVar2;
        this.f30340x = jVar2;
        this.f30341y = hVar;
    }

    public h a() {
        return this.f30341y;
    }

    public C4.a b() {
        return this.f30339w;
    }

    /* access modifiers changed from: package-private */
    public C4071k c() {
        return this.f30318b;
    }

    public C3007j d() {
        return this.f30340x;
    }

    public long e() {
        return this.f30320d;
    }

    /* access modifiers changed from: package-private */
    public List f() {
        return this.f30336t;
    }

    public a g() {
        return this.f30321e;
    }

    /* access modifiers changed from: package-private */
    public List h() {
        return this.f30324h;
    }

    /* access modifiers changed from: package-private */
    public b i() {
        return this.f30337u;
    }

    public String j() {
        return this.f30319c;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        return this.f30322f;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f30332p;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        return this.f30331o;
    }

    public String n() {
        return this.f30323g;
    }

    /* access modifiers changed from: package-private */
    public List o() {
        return this.f30317a;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f30328l;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f30327k;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f30326j;
    }

    /* access modifiers changed from: package-private */
    public float s() {
        return this.f30330n / this.f30318b.e();
    }

    /* access modifiers changed from: package-private */
    public j t() {
        return this.f30333q;
    }

    public String toString() {
        return z("");
    }

    /* access modifiers changed from: package-private */
    public k u() {
        return this.f30334r;
    }

    /* access modifiers changed from: package-private */
    public B4.b v() {
        return this.f30335s;
    }

    /* access modifiers changed from: package-private */
    public float w() {
        return this.f30329m;
    }

    /* access modifiers changed from: package-private */
    public n x() {
        return this.f30325i;
    }

    public boolean y() {
        return this.f30338v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e t10 = this.f30318b.t(k());
        if (t10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t10.j());
            e t11 = this.f30318b.t(t10.k());
            while (t11 != null) {
                sb2.append("->");
                sb2.append(t11.j());
                t11 = this.f30318b.t(t11.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (!(r() == 0 || q() == 0)) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())}));
        }
        if (!this.f30317a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object next : this.f30317a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(next);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
