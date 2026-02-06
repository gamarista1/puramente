package j1;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f22628a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22629b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22630c = false;

    /* renamed from: d  reason: collision with root package name */
    p f22631d;

    /* renamed from: e  reason: collision with root package name */
    a f22632e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f22633f;

    /* renamed from: g  reason: collision with root package name */
    public int f22634g;

    /* renamed from: h  reason: collision with root package name */
    int f22635h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f22636i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22637j = false;

    /* renamed from: k  reason: collision with root package name */
    List f22638k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List f22639l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f22631d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f22639l) {
            if (!fVar.f22637j) {
                return;
            }
        }
        this.f22630c = true;
        d dVar2 = this.f22628a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f22629b) {
            this.f22631d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f22639l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f22637j) {
            g gVar = this.f22636i;
            if (gVar != null) {
                if (gVar.f22637j) {
                    this.f22633f = this.f22635h * gVar.f22634g;
                } else {
                    return;
                }
            }
            d(fVar2.f22634g + this.f22633f);
        }
        d dVar3 = this.f22628a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f22638k.add(dVar);
        if (this.f22637j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f22639l.clear();
        this.f22638k.clear();
        this.f22637j = false;
        this.f22634g = 0;
        this.f22630c = false;
        this.f22629b = false;
    }

    public void d(int i10) {
        if (!this.f22637j) {
            this.f22637j = true;
            this.f22634g = i10;
            for (d dVar : this.f22638k) {
                dVar.a(dVar);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22631d.f22681b.v());
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb2.append(this.f22632e);
        sb2.append("(");
        if (this.f22637j) {
            obj = Integer.valueOf(this.f22634g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f22639l.size());
        sb2.append(":d=");
        sb2.append(this.f22638k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
