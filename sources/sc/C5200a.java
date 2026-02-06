package sc;

import Cd.a;
import javax.inject.Provider;
import rc.e;
import rc.g;
import tc.C5209a;
import tc.C5210b;
import tc.C5211c;
import tc.C5212d;
import tc.C5213e;
import tc.C5214f;
import tc.C5215g;
import tc.C5216h;

/* renamed from: sc.a  reason: case insensitive filesystem */
public final class C5200a implements C5201b {

    /* renamed from: a  reason: collision with root package name */
    private Provider f61629a;

    /* renamed from: b  reason: collision with root package name */
    private Provider f61630b;

    /* renamed from: c  reason: collision with root package name */
    private Provider f61631c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f61632d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f61633e;

    /* renamed from: f  reason: collision with root package name */
    private Provider f61634f;

    /* renamed from: g  reason: collision with root package name */
    private Provider f61635g;

    /* renamed from: h  reason: collision with root package name */
    private Provider f61636h;

    /* renamed from: sc.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C5209a f61637a;

        public C5201b a() {
            Cd.b.a(this.f61637a, C5209a.class);
            return new C5200a(this.f61637a);
        }

        public b b(C5209a aVar) {
            this.f61637a = (C5209a) Cd.b.b(aVar);
            return this;
        }

        private b() {
        }
    }

    public static b b() {
        return new b();
    }

    private void c(C5209a aVar) {
        this.f61629a = C5211c.a(aVar);
        this.f61630b = C5213e.a(aVar);
        this.f61631c = C5212d.a(aVar);
        this.f61632d = C5216h.a(aVar);
        this.f61633e = C5214f.a(aVar);
        this.f61634f = C5210b.a(aVar);
        C5215g a10 = C5215g.a(aVar);
        this.f61635g = a10;
        this.f61636h = a.a(g.a(this.f61629a, this.f61630b, this.f61631c, this.f61632d, this.f61633e, this.f61634f, a10));
    }

    public e a() {
        return (e) this.f61636h.get();
    }

    private C5200a(C5209a aVar) {
        c(aVar);
    }
}
