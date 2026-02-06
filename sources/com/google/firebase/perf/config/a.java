package com.google.firebase.perf.config;

import Ac.f;
import Ac.g;
import Ac.o;
import android.content.Context;
import rc.C5191a;
import uc.C5233a;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final C5233a f57640d = C5233a.e();

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f57641e;

    /* renamed from: a  reason: collision with root package name */
    private final RemoteConfigManager f57642a;

    /* renamed from: b  reason: collision with root package name */
    private f f57643b;

    /* renamed from: c  reason: collision with root package name */
    private x f57644c;

    public a(RemoteConfigManager remoteConfigManager, f fVar, x xVar) {
        this.f57642a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f57643b = fVar == null ? new f() : fVar;
        this.f57644c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(C5191a.f61564b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private g b(v vVar) {
        return this.f57644c.c(vVar.a());
    }

    private g c(v vVar) {
        return this.f57644c.d(vVar.a());
    }

    private g d(v vVar) {
        return this.f57644c.g(vVar.a());
    }

    private g e(v vVar) {
        return this.f57644c.h(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f57641e == null) {
                    f57641e = new a((RemoteConfigManager) null, (f) null, (x) null);
                }
                aVar = f57641e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    private boolean k() {
        l e10 = l.e();
        g u10 = u(e10);
        if (!u10.d()) {
            g b10 = b(e10);
            if (b10.d()) {
                return ((Boolean) b10.c()).booleanValue();
            }
            return e10.d().booleanValue();
        } else if (this.f57642a.isLastFetchFailed()) {
            return false;
        } else {
            this.f57644c.n(e10.a(), ((Boolean) u10.c()).booleanValue());
            return ((Boolean) u10.c()).booleanValue();
        }
    }

    private boolean l() {
        k e10 = k.e();
        g x10 = x(e10);
        if (x10.d()) {
            this.f57644c.m(e10.a(), (String) x10.c());
            return I((String) x10.c());
        }
        g e11 = e(e10);
        if (e11.d()) {
            return I((String) e11.c());
        }
        return I(e10.d());
    }

    private g n(v vVar) {
        return this.f57643b.b(vVar.b());
    }

    private g o(v vVar) {
        return this.f57643b.c(vVar.b());
    }

    private g p(v vVar) {
        return this.f57643b.e(vVar.b());
    }

    private g u(v vVar) {
        return this.f57642a.getBoolean(vVar.c());
    }

    private g v(v vVar) {
        return this.f57642a.getDouble(vVar.c());
    }

    private g w(v vVar) {
        return this.f57642a.getLong(vVar.c());
    }

    private g x(v vVar) {
        return this.f57642a.getString(vVar.c());
    }

    public long A() {
        o e10 = o.e();
        g p10 = p(e10);
        if (p10.d() && M(((Long) p10.c()).longValue())) {
            return ((Long) p10.c()).longValue();
        }
        g w10 = w(e10);
        if (!w10.d() || !M(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !M(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long B() {
        p e10 = p.e();
        g p10 = p(e10);
        if (p10.d() && J(((Long) p10.c()).longValue())) {
            return ((Long) p10.c()).longValue();
        }
        g w10 = w(e10);
        if (!w10.d() || !J(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !J(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long C() {
        q f10 = q.f();
        g p10 = p(f10);
        if (p10.d() && J(((Long) p10.c()).longValue())) {
            return ((Long) p10.c()).longValue();
        }
        g w10 = w(f10);
        if (!w10.d() || !J(((Long) w10.c()).longValue())) {
            g d10 = d(f10);
            if (d10.d() && J(((Long) d10.c()).longValue())) {
                return ((Long) d10.c()).longValue();
            }
            if (this.f57642a.isLastFetchFailed()) {
                return f10.e().longValue();
            }
            return f10.d().longValue();
        }
        this.f57644c.l(f10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public double D() {
        r f10 = r.f();
        g o10 = o(f10);
        if (o10.d()) {
            double doubleValue = ((Double) o10.c()).doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        g v10 = v(f10);
        if (!v10.d() || !L(((Double) v10.c()).doubleValue())) {
            g c10 = c(f10);
            if (c10.d() && L(((Double) c10.c()).doubleValue())) {
                return ((Double) c10.c()).doubleValue();
            }
            if (this.f57642a.isLastFetchFailed()) {
                return f10.e().doubleValue();
            }
            return f10.d().doubleValue();
        }
        this.f57644c.k(f10.a(), ((Double) v10.c()).doubleValue());
        return ((Double) v10.c()).doubleValue();
    }

    public long E() {
        s e10 = s.e();
        g w10 = w(e10);
        if (!w10.d() || !H(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !H(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long F() {
        t e10 = t.e();
        g w10 = w(e10);
        if (!w10.d() || !H(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !H(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public double G() {
        u f10 = u.f();
        g v10 = v(f10);
        if (!v10.d() || !L(((Double) v10.c()).doubleValue())) {
            g c10 = c(f10);
            if (c10.d() && L(((Double) c10.c()).doubleValue())) {
                return ((Double) c10.c()).doubleValue();
            }
            if (this.f57642a.isLastFetchFailed()) {
                return f10.e().doubleValue();
            }
            return f10.d().doubleValue();
        }
        this.f57644c.k(f10.a(), ((Double) v10.c()).doubleValue());
        return ((Double) v10.c()).doubleValue();
    }

    public boolean K() {
        Boolean j10 = j();
        if ((j10 == null || j10.booleanValue()) && m()) {
            return true;
        }
        return false;
    }

    public void O(Context context) {
        f57640d.i(o.b(context));
        this.f57644c.j(context);
    }

    public void P(Boolean bool) {
        String a10;
        if (i().booleanValue() || (a10 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f57644c.n(a10, Boolean.TRUE.equals(bool));
        } else {
            this.f57644c.b(a10);
        }
    }

    public void Q(f fVar) {
        this.f57643b = fVar;
    }

    public String a() {
        String f10;
        f e10 = f.e();
        if (C5191a.f61563a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long j10 = -1;
        if (c10 != null) {
            j10 = ((Long) this.f57642a.getRemoteConfigValueOrDefault(c10, -1L)).longValue();
        }
        String a10 = e10.a();
        if (!f.g(j10) || (f10 = f.f(j10)) == null) {
            g e11 = e(e10);
            if (e11.d()) {
                return (String) e11.c();
            }
            return e10.d();
        }
        this.f57644c.m(a10, f10);
        return f10;
    }

    public double f() {
        e e10 = e.e();
        g o10 = o(e10);
        if (o10.d()) {
            double doubleValue = ((Double) o10.c()).doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        g v10 = v(e10);
        if (!v10.d() || !L(((Double) v10.c()).doubleValue())) {
            g c10 = c(e10);
            if (!c10.d() || !L(((Double) c10.c()).doubleValue())) {
                return e10.d().doubleValue();
            }
            return ((Double) c10.c()).doubleValue();
        }
        this.f57644c.k(e10.a(), ((Double) v10.c()).doubleValue());
        return ((Double) v10.c()).doubleValue();
    }

    public boolean h() {
        d e10 = d.e();
        g n10 = n(e10);
        if (n10.d()) {
            return ((Boolean) n10.c()).booleanValue();
        }
        g u10 = u(e10);
        if (u10.d()) {
            this.f57644c.n(e10.a(), ((Boolean) u10.c()).booleanValue());
            return ((Boolean) u10.c()).booleanValue();
        }
        g b10 = b(e10);
        if (b10.d()) {
            return ((Boolean) b10.c()).booleanValue();
        }
        return e10.d().booleanValue();
    }

    public Boolean i() {
        b e10 = b.e();
        g n10 = n(e10);
        if (n10.d()) {
            return (Boolean) n10.c();
        }
        return e10.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        g b10 = b(d10);
        if (b10.d()) {
            return (Boolean) b10.c();
        }
        g n10 = n(d10);
        if (n10.d()) {
            return (Boolean) n10.c();
        }
        return null;
    }

    public boolean m() {
        if (!k() || l()) {
            return false;
        }
        return true;
    }

    public long q() {
        g e10 = g.e();
        g w10 = w(e10);
        if (!w10.d() || !H(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !H(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long r() {
        h e10 = h.e();
        g w10 = w(e10);
        if (!w10.d() || !H(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !H(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public double s() {
        i f10 = i.f();
        g v10 = v(f10);
        if (!v10.d() || !L(((Double) v10.c()).doubleValue())) {
            g c10 = c(f10);
            if (c10.d() && L(((Double) c10.c()).doubleValue())) {
                return ((Double) c10.c()).doubleValue();
            }
            if (this.f57642a.isLastFetchFailed()) {
                return f10.e().doubleValue();
            }
            return f10.d().doubleValue();
        }
        this.f57644c.k(f10.a(), ((Double) v10.c()).doubleValue());
        return ((Double) v10.c()).doubleValue();
    }

    public long t() {
        j e10 = j.e();
        g w10 = w(e10);
        if (!w10.d() || !N(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !N(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long y() {
        m e10 = m.e();
        g p10 = p(e10);
        if (p10.d() && J(((Long) p10.c()).longValue())) {
            return ((Long) p10.c()).longValue();
        }
        g w10 = w(e10);
        if (!w10.d() || !J(((Long) w10.c()).longValue())) {
            g d10 = d(e10);
            if (!d10.d() || !J(((Long) d10.c()).longValue())) {
                return e10.d().longValue();
            }
            return ((Long) d10.c()).longValue();
        }
        this.f57644c.l(e10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }

    public long z() {
        n f10 = n.f();
        g p10 = p(f10);
        if (p10.d() && J(((Long) p10.c()).longValue())) {
            return ((Long) p10.c()).longValue();
        }
        g w10 = w(f10);
        if (!w10.d() || !J(((Long) w10.c()).longValue())) {
            g d10 = d(f10);
            if (d10.d() && J(((Long) d10.c()).longValue())) {
                return ((Long) d10.c()).longValue();
            }
            if (this.f57642a.isLastFetchFailed()) {
                return f10.e().longValue();
            }
            return f10.d().longValue();
        }
        this.f57644c.l(f10.a(), ((Long) w10.c()).longValue());
        return ((Long) w10.c()).longValue();
    }
}
