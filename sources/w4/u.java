package w4;

import C4.t;
import D4.b;
import java.util.ArrayList;
import java.util.List;
import x4.C4155a;
import x4.C4158d;

public class u implements C4118c, C4155a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f49138a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49139b;

    /* renamed from: c  reason: collision with root package name */
    private final List f49140c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final t.a f49141d;

    /* renamed from: e  reason: collision with root package name */
    private final C4155a f49142e;

    /* renamed from: f  reason: collision with root package name */
    private final C4155a f49143f;

    /* renamed from: g  reason: collision with root package name */
    private final C4155a f49144g;

    public u(b bVar, t tVar) {
        this.f49138a = tVar.c();
        this.f49139b = tVar.g();
        this.f49141d = tVar.f();
        C4158d a10 = tVar.e().h();
        this.f49142e = a10;
        C4158d a11 = tVar.b().h();
        this.f49143f = a11;
        C4158d a12 = tVar.d().h();
        this.f49144g = a12;
        bVar.i(a10);
        bVar.i(a11);
        bVar.i(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f49140c.size(); i10++) {
            ((C4155a.b) this.f49140c.get(i10)).b();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(C4155a.b bVar) {
        this.f49140c.add(bVar);
    }

    public C4155a e() {
        return this.f49143f;
    }

    public C4155a g() {
        return this.f49144g;
    }

    public C4155a i() {
        return this.f49142e;
    }

    /* access modifiers changed from: package-private */
    public t.a j() {
        return this.f49141d;
    }

    public boolean k() {
        return this.f49139b;
    }

    public void c(List list, List list2) {
    }
}
