package com.google.firebase.functions;

import android.content.Context;
import com.google.firebase.functions.q;
import fc.C4988a;
import fc.d;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import ub.p;

abstract class b {

    /* renamed from: com.google.firebase.functions.b$b  reason: collision with other inner class name */
    private static final class C0856b implements q.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f57174a;

        /* renamed from: b  reason: collision with root package name */
        private p f57175b;

        /* renamed from: c  reason: collision with root package name */
        private Executor f57176c;

        /* renamed from: d  reason: collision with root package name */
        private Executor f57177d;

        /* renamed from: e  reason: collision with root package name */
        private C5027b f57178e;

        /* renamed from: f  reason: collision with root package name */
        private C5027b f57179f;

        /* renamed from: g  reason: collision with root package name */
        private C5026a f57180g;

        private C0856b() {
        }

        public q f() {
            d.a(this.f57174a, Context.class);
            d.a(this.f57175b, p.class);
            Class<Executor> cls = Executor.class;
            d.a(this.f57176c, cls);
            d.a(this.f57177d, cls);
            Class<C5027b> cls2 = C5027b.class;
            d.a(this.f57178e, cls2);
            d.a(this.f57179f, cls2);
            d.a(this.f57180g, C5026a.class);
            return new c(this.f57174a, this.f57175b, this.f57176c, this.f57177d, this.f57178e, this.f57179f, this.f57180g);
        }

        /* renamed from: i */
        public C0856b e(C5026a aVar) {
            this.f57180g = (C5026a) d.b(aVar);
            return this;
        }

        /* renamed from: j */
        public C0856b a(Context context) {
            this.f57174a = (Context) d.b(context);
            return this;
        }

        /* renamed from: k */
        public C0856b d(C5027b bVar) {
            this.f57178e = (C5027b) d.b(bVar);
            return this;
        }

        /* renamed from: l */
        public C0856b h(p pVar) {
            this.f57175b = (p) d.b(pVar);
            return this;
        }

        /* renamed from: m */
        public C0856b c(C5027b bVar) {
            this.f57179f = (C5027b) d.b(bVar);
            return this;
        }

        /* renamed from: n */
        public C0856b b(Executor executor) {
            this.f57176c = (Executor) d.b(executor);
            return this;
        }

        /* renamed from: o */
        public C0856b g(Executor executor) {
            this.f57177d = (Executor) d.b(executor);
            return this;
        }
    }

    private static final class c implements q {

        /* renamed from: a  reason: collision with root package name */
        private final c f57181a;

        /* renamed from: b  reason: collision with root package name */
        private Provider f57182b;

        /* renamed from: c  reason: collision with root package name */
        private Provider f57183c;

        /* renamed from: d  reason: collision with root package name */
        private Provider f57184d;

        /* renamed from: e  reason: collision with root package name */
        private Provider f57185e;

        /* renamed from: f  reason: collision with root package name */
        private Provider f57186f;

        /* renamed from: g  reason: collision with root package name */
        private Provider f57187g;

        /* renamed from: h  reason: collision with root package name */
        private Provider f57188h;

        /* renamed from: i  reason: collision with root package name */
        private Provider f57189i;

        /* renamed from: j  reason: collision with root package name */
        private Provider f57190j;

        /* renamed from: k  reason: collision with root package name */
        private p f57191k;

        /* renamed from: l  reason: collision with root package name */
        private Provider f57192l;

        /* renamed from: m  reason: collision with root package name */
        private Provider f57193m;

        private void b(Context context, p pVar, Executor executor, Executor executor2, C5027b bVar, C5027b bVar2, C5026a aVar) {
            this.f57182b = fc.c.a(context);
            fc.b a10 = fc.c.a(pVar);
            this.f57183c = a10;
            this.f57184d = r.b(a10);
            this.f57185e = fc.c.a(bVar);
            this.f57186f = fc.c.a(bVar2);
            this.f57187g = fc.c.a(aVar);
            fc.b a11 = fc.c.a(executor);
            this.f57188h = a11;
            this.f57189i = C4988a.a(i.a(this.f57185e, this.f57186f, this.f57187g, a11));
            fc.b a12 = fc.c.a(executor2);
            this.f57190j = a12;
            p a13 = p.a(this.f57182b, this.f57184d, this.f57189i, this.f57188h, a12);
            this.f57191k = a13;
            Provider b10 = u.b(a13);
            this.f57192l = b10;
            this.f57193m = C4988a.a(t.a(b10));
        }

        public s a() {
            return (s) this.f57193m.get();
        }

        private c(Context context, p pVar, Executor executor, Executor executor2, C5027b bVar, C5027b bVar2, C5026a aVar) {
            this.f57181a = this;
            b(context, pVar, executor, executor2, bVar, bVar2, aVar);
        }
    }

    public static q.a a() {
        return new C0856b();
    }
}
