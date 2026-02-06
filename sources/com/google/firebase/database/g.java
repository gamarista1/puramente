package com.google.firebase.database;

import Lb.D;
import Lb.l;
import Lb.n;
import Ob.m;
import Tb.o;
import Tb.r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.b;
import java.util.Map;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public n f57149a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public l f57150b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tb.n f57151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ob.g f57152b;

        a(Tb.n nVar, Ob.g gVar) {
            this.f57151a = nVar;
            this.f57152b = gVar;
        }

        public void run() {
            g.this.f57149a.T(g.this.f57150b, this.f57151a, (b.e) this.f57152b.b());
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f57154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ob.g f57155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f57156c;

        b(Map map, Ob.g gVar, Map map2) {
            this.f57154a = map;
            this.f57155b = gVar;
            this.f57156c = map2;
        }

        public void run() {
            g.this.f57149a.U(g.this.f57150b, this.f57154a, (b.e) this.f57155b.b(), this.f57156c);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ob.g f57158a;

        c(Ob.g gVar) {
            this.f57158a = gVar;
        }

        public void run() {
            g.this.f57149a.S(g.this.f57150b, (b.e) this.f57158a.b());
        }
    }

    g(n nVar, l lVar) {
        this.f57149a = nVar;
        this.f57150b = lVar;
    }

    private Task d(b.e eVar) {
        Ob.g l10 = Ob.l.l(eVar);
        this.f57149a.g0(new c(l10));
        return (Task) l10.a();
    }

    private Task e(Object obj, Tb.n nVar, b.e eVar) {
        m.l(this.f57150b);
        D.g(this.f57150b, obj);
        Object b10 = Pb.a.b(obj);
        m.k(b10);
        Tb.n b11 = o.b(b10, nVar);
        Ob.g l10 = Ob.l.l(eVar);
        this.f57149a.g0(new a(b11, l10));
        return (Task) l10.a();
    }

    private Task k(Map map, b.e eVar) {
        Map e10 = m.e(this.f57150b, map);
        Ob.g l10 = Ob.l.l(eVar);
        this.f57149a.g0(new b(e10, l10, map));
        return (Task) l10.a();
    }

    public Task c() {
        return d((b.e) null);
    }

    public Task f() {
        return g((Object) null);
    }

    public Task g(Object obj) {
        return e(obj, r.a(), (b.e) null);
    }

    public Task h(Object obj, double d10) {
        return e(obj, r.c(this.f57150b, Double.valueOf(d10)), (b.e) null);
    }

    public Task i(Object obj, String str) {
        return e(obj, r.c(this.f57150b, str), (b.e) null);
    }

    public Task j(Map map) {
        return k(map, (b.e) null);
    }
}
