package Y8;

import Y8.u;
import Z8.j;
import Z8.l;
import a9.C3141a;
import a9.C3142b;
import a9.C3143c;
import a9.C3144d;
import android.content.Context;
import e9.d;
import e9.g;
import e9.i;
import f9.s;
import f9.w;
import g9.C3546d;
import g9.C3549g;
import g9.C3550h;
import g9.C3551i;
import g9.C3552j;
import g9.N;
import g9.V;
import i9.C3599c;
import i9.C3600d;
import javax.inject.Provider;

final class e extends u {

    /* renamed from: a  reason: collision with root package name */
    private Provider f35746a;

    /* renamed from: b  reason: collision with root package name */
    private Provider f35747b;

    /* renamed from: c  reason: collision with root package name */
    private Provider f35748c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f35749d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f35750e;

    /* renamed from: f  reason: collision with root package name */
    private Provider f35751f;

    /* renamed from: g  reason: collision with root package name */
    private Provider f35752g;

    /* renamed from: h  reason: collision with root package name */
    private Provider f35753h;

    /* renamed from: i  reason: collision with root package name */
    private Provider f35754i;

    /* renamed from: j  reason: collision with root package name */
    private Provider f35755j;

    /* renamed from: k  reason: collision with root package name */
    private Provider f35756k;

    /* renamed from: l  reason: collision with root package name */
    private Provider f35757l;

    /* renamed from: m  reason: collision with root package name */
    private Provider f35758m;

    private static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f35759a;

        private b() {
        }

        /* renamed from: b */
        public b a(Context context) {
            this.f35759a = (Context) C3144d.b(context);
            return this;
        }

        public u f() {
            C3144d.a(this.f35759a, Context.class);
            return new e(this.f35759a);
        }
    }

    public static u.a f() {
        return new b();
    }

    private void n(Context context) {
        this.f35746a = C3141a.a(k.a());
        C3142b a10 = C3143c.a(context);
        this.f35747b = a10;
        j a11 = j.a(a10, C3599c.a(), C3600d.a());
        this.f35748c = a11;
        this.f35749d = C3141a.a(l.a(this.f35747b, a11));
        this.f35750e = V.a(this.f35747b, C3549g.a(), C3551i.a());
        this.f35751f = C3141a.a(C3550h.a(this.f35747b));
        this.f35752g = C3141a.a(N.a(C3599c.a(), C3600d.a(), C3552j.a(), this.f35750e, this.f35751f));
        g b10 = g.b(C3599c.a());
        this.f35753h = b10;
        i a12 = i.a(this.f35747b, this.f35752g, b10, C3600d.a());
        this.f35754i = a12;
        Provider provider = this.f35746a;
        Provider provider2 = this.f35749d;
        Provider provider3 = this.f35752g;
        this.f35755j = d.a(provider, provider2, a12, provider3, provider3);
        Provider provider4 = this.f35747b;
        Provider provider5 = this.f35749d;
        Provider provider6 = this.f35752g;
        this.f35756k = s.a(provider4, provider5, provider6, this.f35754i, this.f35746a, provider6, C3599c.a(), C3600d.a(), this.f35752g);
        Provider provider7 = this.f35746a;
        Provider provider8 = this.f35752g;
        this.f35757l = w.a(provider7, provider8, this.f35754i, provider8);
        this.f35758m = C3141a.a(v.a(C3599c.a(), C3600d.a(), this.f35755j, this.f35756k, this.f35757l));
    }

    /* access modifiers changed from: package-private */
    public C3546d a() {
        return (C3546d) this.f35752g.get();
    }

    /* access modifiers changed from: package-private */
    public t b() {
        return (t) this.f35758m.get();
    }

    private e(Context context) {
        n(context);
    }
}
