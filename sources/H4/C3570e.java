package h4;

import h4.C3568c;
import o4.C3880c;

/* renamed from: h4.e  reason: case insensitive filesystem */
public final class C3570e implements C3568c {

    /* renamed from: a  reason: collision with root package name */
    private final C3573h f43987a;

    /* renamed from: b  reason: collision with root package name */
    private final C3574i f43988b;

    public C3570e(C3573h hVar, C3574i iVar) {
        this.f43987a = hVar;
        this.f43988b = iVar;
    }

    public void a(int i10) {
        this.f43987a.a(i10);
        this.f43988b.a(i10);
    }

    public C3568c.C0675c b(C3568c.b bVar) {
        C3568c.C0675c b10 = this.f43987a.b(bVar);
        if (b10 == null) {
            return this.f43988b.b(bVar);
        }
        return b10;
    }

    public void c(C3568c.b bVar, C3568c.C0675c cVar) {
        this.f43987a.c(C3568c.b.b(bVar, (String) null, C3880c.b(bVar.c()), 1, (Object) null), cVar.a(), C3880c.b(cVar.b()));
    }
}
