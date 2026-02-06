package P6;

import X5.a;
import java.util.List;
import l7.C3743a;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f33506a;

    /* renamed from: b  reason: collision with root package name */
    private a f33507b;

    /* renamed from: c  reason: collision with root package name */
    private List f33508c;

    /* renamed from: d  reason: collision with root package name */
    private int f33509d;

    /* renamed from: e  reason: collision with root package name */
    private String f33510e;

    f(c cVar) {
        this.f33506a = cVar;
    }

    public e a() {
        try {
            return new e(this);
        } finally {
            a.E(this.f33507b);
            this.f33507b = null;
            a.F(this.f33508c);
            this.f33508c = null;
        }
    }

    public C3743a b() {
        return null;
    }

    public List c() {
        return a.y(this.f33508c);
    }

    public int d() {
        return this.f33509d;
    }

    public c e() {
        return this.f33506a;
    }

    public a f() {
        return a.t(this.f33507b);
    }

    public String g() {
        return this.f33510e;
    }

    public f i(List list) {
        this.f33508c = a.y(list);
        return this;
    }

    public f j(int i10) {
        this.f33509d = i10;
        return this;
    }

    public f k(a aVar) {
        this.f33507b = a.t(aVar);
        return this;
    }

    public f l(String str) {
        this.f33510e = str;
        return this;
    }

    public f h(C3743a aVar) {
        return this;
    }
}
