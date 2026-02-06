package k6;

import G6.g;
import G6.i;
import G6.j;
import G6.k;
import G6.n;
import a6.C3136b;
import android.graphics.Rect;
import e7.c;
import j6.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l6.C3741a;
import l6.C3742b;
import t6.C4047b;

/* renamed from: k6.a  reason: case insensitive filesystem */
public class C3673a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final e f45146a;

    /* renamed from: b  reason: collision with root package name */
    private final C3136b f45147b;

    /* renamed from: c  reason: collision with root package name */
    private final j f45148c = new j(k.DRAWEE);

    /* renamed from: d  reason: collision with root package name */
    private C3741a f45149d;

    /* renamed from: e  reason: collision with root package name */
    private C3742b f45150e;

    /* renamed from: f  reason: collision with root package name */
    private c f45151f;

    /* renamed from: g  reason: collision with root package name */
    private List f45152g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45153h;

    public C3673a(C3136b bVar, e eVar) {
        this.f45147b = bVar;
        this.f45146a = eVar;
    }

    private void h() {
        if (this.f45150e == null) {
            this.f45150e = new C3742b(this.f45147b, this.f45148c, this);
        }
        if (this.f45149d == null) {
            this.f45149d = new C3741a(this.f45147b, this.f45148c);
        }
        if (this.f45151f == null) {
            this.f45151f = new c(this.f45149d);
        }
    }

    public void a(j jVar, n nVar) {
        List list;
        if (this.f45153h && (list = this.f45152g) != null && !list.isEmpty()) {
            jVar.S();
            Iterator it = this.f45152g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }
    }

    public void b(j jVar, G6.e eVar) {
        List list;
        jVar.H(eVar);
        if (this.f45153h && (list = this.f45152g) != null && !list.isEmpty()) {
            if (eVar == G6.e.SUCCESS) {
                d();
            }
            jVar.S();
            Iterator it = this.f45152g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }
    }

    public void c(g gVar) {
        if (gVar != null) {
            if (this.f45152g == null) {
                this.f45152g = new CopyOnWriteArrayList();
            }
            this.f45152g.add(gVar);
        }
    }

    public void d() {
        C4047b d10 = this.f45146a.d();
        if (d10 != null && d10.d() != null) {
            Rect bounds = d10.d().getBounds();
            this.f45148c.N(bounds.width());
            this.f45148c.M(bounds.height());
        }
    }

    public void e() {
        List list = this.f45152g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f45148c.w();
    }

    public void g(boolean z10) {
        this.f45153h = z10;
        if (z10) {
            h();
            C3742b bVar = this.f45150e;
            if (bVar != null) {
                this.f45146a.k(bVar);
            }
            c cVar = this.f45151f;
            if (cVar != null) {
                this.f45146a.i0(cVar);
                return;
            }
            return;
        }
        C3742b bVar2 = this.f45150e;
        if (bVar2 != null) {
            this.f45146a.S(bVar2);
        }
        c cVar2 = this.f45151f;
        if (cVar2 != null) {
            this.f45146a.y0(cVar2);
        }
    }
}
