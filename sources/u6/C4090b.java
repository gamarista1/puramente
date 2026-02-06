package u6;

import T5.i;
import T5.k;
import U5.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import m6.C3779c;
import q6.C3951E;
import q6.F;
import t6.C4046a;
import t6.C4047b;

/* renamed from: u6.b  reason: case insensitive filesystem */
public class C4090b implements F {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48602a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f48603b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48604c = true;

    /* renamed from: d  reason: collision with root package name */
    private C4047b f48605d;

    /* renamed from: e  reason: collision with root package name */
    private C4046a f48606e = null;

    /* renamed from: f  reason: collision with root package name */
    private final C3779c f48607f = C3779c.a();

    public C4090b(C4047b bVar) {
        if (bVar != null) {
            o(bVar);
        }
    }

    private void a() {
        if (!this.f48602a) {
            this.f48607f.b(C3779c.a.ON_ATTACH_CONTROLLER);
            this.f48602a = true;
            C4046a aVar = this.f48606e;
            if (aVar != null && aVar.d() != null) {
                this.f48606e.b();
            }
        }
    }

    private void b() {
        if (!this.f48603b || !this.f48604c) {
            d();
        } else {
            a();
        }
    }

    public static C4090b c(C4047b bVar, Context context) {
        C4090b bVar2 = new C4090b(bVar);
        bVar2.l(context);
        return bVar2;
    }

    private void d() {
        if (this.f48602a) {
            this.f48607f.b(C3779c.a.ON_DETACH_CONTROLLER);
            this.f48602a = false;
            if (h()) {
                this.f48606e.c();
            }
        }
    }

    private void p(F f10) {
        Drawable g10 = g();
        if (g10 instanceof C3951E) {
            ((C3951E) g10).g(f10);
        }
    }

    public C4046a e() {
        return this.f48606e;
    }

    public C4047b f() {
        return (C4047b) k.g(this.f48605d);
    }

    public Drawable g() {
        C4047b bVar = this.f48605d;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public boolean h() {
        C4046a aVar = this.f48606e;
        if (aVar == null || aVar.d() != this.f48605d) {
            return false;
        }
        return true;
    }

    public void i() {
        this.f48607f.b(C3779c.a.ON_HOLDER_ATTACH);
        this.f48603b = true;
        b();
    }

    public void j() {
        this.f48607f.b(C3779c.a.ON_HOLDER_DETACH);
        this.f48603b = false;
        b();
    }

    public boolean k(MotionEvent motionEvent) {
        if (!h()) {
            return false;
        }
        return this.f48606e.e(motionEvent);
    }

    public void m() {
        n((C4046a) null);
    }

    public void n(C4046a aVar) {
        boolean z10 = this.f48602a;
        if (z10) {
            d();
        }
        if (h()) {
            this.f48607f.b(C3779c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f48606e.f((C4047b) null);
        }
        this.f48606e = aVar;
        if (aVar != null) {
            this.f48607f.b(C3779c.a.ON_SET_CONTROLLER);
            this.f48606e.f(this.f48605d);
        } else {
            this.f48607f.b(C3779c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    public void o(C4047b bVar) {
        boolean z10;
        this.f48607f.b(C3779c.a.ON_SET_HIERARCHY);
        boolean h10 = h();
        p((F) null);
        C4047b bVar2 = (C4047b) k.g(bVar);
        this.f48605d = bVar2;
        Drawable d10 = bVar2.d();
        if (d10 == null || d10.isVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        q(z10);
        p(this);
        if (h10) {
            this.f48606e.f(bVar);
        }
    }

    public void onDraw() {
        if (!this.f48602a) {
            a.G(C3779c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f48606e)), toString());
            this.f48603b = true;
            this.f48604c = true;
            b();
        }
    }

    public void q(boolean z10) {
        C3779c.a aVar;
        if (this.f48604c != z10) {
            C3779c cVar = this.f48607f;
            if (z10) {
                aVar = C3779c.a.ON_DRAWABLE_SHOW;
            } else {
                aVar = C3779c.a.ON_DRAWABLE_HIDE;
            }
            cVar.b(aVar);
            this.f48604c = z10;
            b();
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f48602a).c("holderAttached", this.f48603b).c("drawableVisible", this.f48604c).b("events", this.f48607f.toString()).toString();
    }

    public void l(Context context) {
    }
}
