package vc;

import Ac.l;
import com.google.firebase.perf.config.a;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import uc.C5233a;
import wc.e;
import zc.C5313k;

/* renamed from: vc.g  reason: case insensitive filesystem */
public class C5254g {

    /* renamed from: f  reason: collision with root package name */
    private static final C5233a f61765f = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f61766a;

    /* renamed from: b  reason: collision with root package name */
    private final l f61767b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f61768c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f61769d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f61770e = false;

    public C5254g(String str, String str2, C5313k kVar, l lVar) {
        this.f61767b = lVar;
        h l10 = h.c(kVar).F(str).l(str2);
        this.f61766a = l10;
        l10.o();
        if (!a.g().K()) {
            f61765f.g("HttpMetric feature is disabled. URL %s", str);
            this.f61770e = true;
        }
    }

    private void a(String str, String str2) {
        if (this.f61769d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        } else if (this.f61768c.containsKey(str) || this.f61768c.size() < 5) {
            e.d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    public void b(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f61765f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f61766a.f());
            z10 = true;
        } catch (Exception e10) {
            f61765f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f61768c.put(str, str2);
        }
    }

    public void c(int i10) {
        this.f61766a.n(i10);
    }

    public void d(long j10) {
        this.f61766a.q(j10);
    }

    public void e(String str) {
        this.f61766a.u(str);
    }

    public void f(long j10) {
        this.f61766a.v(j10);
    }

    public void g() {
        this.f61767b.g();
        this.f61766a.s(this.f61767b.e());
    }

    public void h() {
        if (!this.f61770e) {
            this.f61766a.y(this.f61767b.c()).k(this.f61768c).b();
            this.f61769d = true;
        }
    }
}
