package Y8;

import W8.c;
import W8.i;
import W8.j;
import android.content.Context;
import e9.e;
import f9.r;
import f9.v;
import i9.C3597a;
import java.util.Collections;
import java.util.Set;

public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f35774e;

    /* renamed from: a  reason: collision with root package name */
    private final C3597a f35775a;

    /* renamed from: b  reason: collision with root package name */
    private final C3597a f35776b;

    /* renamed from: c  reason: collision with root package name */
    private final e f35777c;

    /* renamed from: d  reason: collision with root package name */
    private final r f35778d;

    t(C3597a aVar, C3597a aVar2, e eVar, r rVar, v vVar) {
        this.f35775a = aVar;
        this.f35776b = aVar2;
        this.f35777c = eVar;
        this.f35778d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f35775a.a()).k(this.f35776b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f35774e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(c.b("proto"));
    }

    public static void f(Context context) {
        if (f35774e == null) {
            synchronized (t.class) {
                try {
                    if (f35774e == null) {
                        f35774e = e.f().a(context).f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(n nVar, j jVar) {
        this.f35777c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public r e() {
        return this.f35778d;
    }

    public i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
