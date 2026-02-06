package l6;

import G6.j;
import a6.C3136b;
import e7.C3499a;
import i7.C3593b;

/* renamed from: l6.a  reason: case insensitive filesystem */
public class C3741a extends C3499a {

    /* renamed from: a  reason: collision with root package name */
    private final C3136b f46134a;

    /* renamed from: b  reason: collision with root package name */
    private final j f46135b;

    public C3741a(C3136b bVar, j jVar) {
        this.f46134a = bVar;
        this.f46135b = jVar;
    }

    public void b(C3593b bVar, String str, boolean z10) {
        this.f46135b.J(this.f46134a.now());
        this.f46135b.I(bVar);
        this.f46135b.P(str);
        this.f46135b.O(z10);
    }

    public void c(C3593b bVar, Object obj, String str, boolean z10) {
        this.f46135b.K(this.f46134a.now());
        this.f46135b.I(bVar);
        this.f46135b.y(obj);
        this.f46135b.P(str);
        this.f46135b.O(z10);
    }

    public void j(C3593b bVar, String str, Throwable th2, boolean z10) {
        this.f46135b.J(this.f46134a.now());
        this.f46135b.I(bVar);
        this.f46135b.P(str);
        this.f46135b.O(z10);
    }

    public void k(String str) {
        this.f46135b.J(this.f46134a.now());
        this.f46135b.P(str);
    }
}
