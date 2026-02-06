package j3;

import Ff.d;
import Sg.p;
import j3.z;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: j3.A  reason: case insensitive filesystem */
public final class C2124A {

    /* renamed from: a  reason: collision with root package name */
    private final z.a f22753a = new z.a();

    /* renamed from: b  reason: collision with root package name */
    private boolean f22754b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22755c;

    /* renamed from: d  reason: collision with root package name */
    private int f22756d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f22757e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22758f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22759g;

    /* renamed from: h  reason: collision with root package name */
    private d f22760h;

    /* renamed from: i  reason: collision with root package name */
    private Object f22761i;

    private final void g(String str) {
        if (str == null) {
            return;
        }
        if (!p.d0(str)) {
            this.f22757e = str;
            this.f22758f = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route");
    }

    public final void a(C6798l lVar) {
        C6496s.h(lVar, "animBuilder");
        C2131b bVar = new C2131b();
        lVar.invoke(bVar);
        this.f22753a.b(bVar.a()).c(bVar.b()).e(bVar.c()).f(bVar.d());
    }

    public final z b() {
        z.a aVar = this.f22753a;
        aVar.d(this.f22754b);
        aVar.l(this.f22755c);
        String str = this.f22757e;
        if (str != null) {
            aVar.j(str, this.f22758f, this.f22759g);
        } else {
            d dVar = this.f22760h;
            if (dVar != null) {
                C6496s.e(dVar);
                aVar.h(dVar, this.f22758f, this.f22759g);
            } else {
                Object obj = this.f22761i;
                if (obj != null) {
                    C6496s.e(obj);
                    aVar.i(obj, this.f22758f, this.f22759g);
                } else {
                    aVar.g(this.f22756d, this.f22758f, this.f22759g);
                }
            }
        }
        return aVar.a();
    }

    public final void c(int i10, C6798l lVar) {
        C6496s.h(lVar, "popUpToBuilder");
        f(i10);
        g((String) null);
        H h10 = new H();
        lVar.invoke(h10);
        this.f22758f = h10.a();
        this.f22759g = h10.b();
    }

    public final void d(String str, C6798l lVar) {
        C6496s.h(str, "route");
        C6496s.h(lVar, "popUpToBuilder");
        g(str);
        f(-1);
        H h10 = new H();
        lVar.invoke(h10);
        this.f22758f = h10.a();
        this.f22759g = h10.b();
    }

    public final void e(boolean z10) {
        this.f22754b = z10;
    }

    public final void f(int i10) {
        this.f22756d = i10;
        this.f22758f = false;
    }

    public final void h(boolean z10) {
        this.f22755c = z10;
    }
}
