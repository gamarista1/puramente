package u4;

import A4.h;
import D4.e;
import H4.f;
import H4.k;
import H4.l;
import android.graphics.Rect;
import androidx.collection.C1607v;
import androidx.collection.Z;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: u4.k  reason: case insensitive filesystem */
public class C4071k {

    /* renamed from: a  reason: collision with root package name */
    private final X f48527a = new X();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet f48528b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private Map f48529c;

    /* renamed from: d  reason: collision with root package name */
    private Map f48530d;

    /* renamed from: e  reason: collision with root package name */
    private float f48531e;

    /* renamed from: f  reason: collision with root package name */
    private Map f48532f;

    /* renamed from: g  reason: collision with root package name */
    private List f48533g;

    /* renamed from: h  reason: collision with root package name */
    private Z f48534h;

    /* renamed from: i  reason: collision with root package name */
    private C1607v f48535i;

    /* renamed from: j  reason: collision with root package name */
    private List f48536j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f48537k;

    /* renamed from: l  reason: collision with root package name */
    private float f48538l;

    /* renamed from: m  reason: collision with root package name */
    private float f48539m;

    /* renamed from: n  reason: collision with root package name */
    private float f48540n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48541o;

    /* renamed from: p  reason: collision with root package name */
    private int f48542p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f48543q;

    /* renamed from: r  reason: collision with root package name */
    private int f48544r;

    public void a(String str) {
        f.c(str);
        this.f48528b.add(str);
    }

    public Rect b() {
        return this.f48537k;
    }

    public Z c() {
        return this.f48534h;
    }

    public float d() {
        return (float) ((long) ((e() / this.f48540n) * 1000.0f));
    }

    public float e() {
        return this.f48539m - this.f48538l;
    }

    public float f() {
        return this.f48539m;
    }

    public Map g() {
        return this.f48532f;
    }

    public float h(float f10) {
        return k.i(this.f48538l, this.f48539m, f10);
    }

    public float i() {
        return this.f48540n;
    }

    public Map j() {
        float e10 = l.e();
        if (e10 != this.f48531e) {
            for (Map.Entry entry : this.f48530d.entrySet()) {
                this.f48530d.put((String) entry.getKey(), ((O) entry.getValue()).a(this.f48531e / e10));
            }
        }
        this.f48531e = e10;
        return this.f48530d;
    }

    public List k() {
        return this.f48536j;
    }

    public h l(String str) {
        int size = this.f48533g.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) this.f48533g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f48542p;
    }

    public X n() {
        return this.f48527a;
    }

    public List o(String str) {
        return (List) this.f48529c.get(str);
    }

    public float p() {
        return this.f48538l;
    }

    public boolean q() {
        return this.f48541o;
    }

    public void r(int i10) {
        this.f48542p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List list, C1607v vVar, Map map, Map map2, float f13, Z z10, Map map3, List list2, int i10, int i11) {
        this.f48537k = rect;
        this.f48538l = f10;
        this.f48539m = f11;
        this.f48540n = f12;
        this.f48536j = list;
        this.f48535i = vVar;
        this.f48529c = map;
        this.f48530d = map2;
        this.f48531e = f13;
        this.f48534h = z10;
        this.f48532f = map3;
        this.f48533g = list2;
        this.f48543q = i10;
        this.f48544r = i11;
    }

    public e t(long j10) {
        return (e) this.f48535i.e(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e z10 : this.f48536j) {
            sb2.append(z10.z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f48541o = z10;
    }

    public void v(boolean z10) {
        this.f48527a.b(z10);
    }
}
