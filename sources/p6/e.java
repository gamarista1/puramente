package P6;

import T5.k;
import X5.a;
import java.util.List;
import l7.C3743a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final c f33501a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33502b;

    /* renamed from: c  reason: collision with root package name */
    private String f33503c;

    /* renamed from: d  reason: collision with root package name */
    private a f33504d;

    /* renamed from: e  reason: collision with root package name */
    private List f33505e;

    e(f fVar) {
        this.f33501a = (c) k.g(fVar.e());
        this.f33502b = fVar.d();
        this.f33504d = fVar.f();
        this.f33505e = fVar.c();
        fVar.b();
        this.f33503c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        a.E(this.f33504d);
        this.f33504d = null;
        a.F(this.f33505e);
        this.f33505e = null;
    }

    public C3743a c() {
        return null;
    }

    public c d() {
        return this.f33501a;
    }

    public String e() {
        return this.f33503c;
    }

    private e(c cVar) {
        this.f33501a = (c) k.g(cVar);
        this.f33502b = 0;
    }
}
