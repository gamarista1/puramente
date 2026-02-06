package uc;

import java.util.Locale;

/* renamed from: uc.a  reason: case insensitive filesystem */
public class C5233a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C5233a f61711c;

    /* renamed from: a  reason: collision with root package name */
    private final c f61712a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f61713b;

    public C5233a(c cVar) {
        this.f61713b = false;
        this.f61712a = cVar == null ? c.c() : cVar;
    }

    public static C5233a e() {
        if (f61711c == null) {
            synchronized (C5233a.class) {
                try {
                    if (f61711c == null) {
                        f61711c = new C5233a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f61711c;
    }

    public void a(String str) {
        if (this.f61713b) {
            this.f61712a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f61713b) {
            this.f61712a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f61713b) {
            this.f61712a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f61713b) {
            this.f61712a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f61713b) {
            this.f61712a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f61713b) {
            this.f61712a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f61713b;
    }

    public void i(boolean z10) {
        this.f61713b = z10;
    }

    public void j(String str) {
        if (this.f61713b) {
            this.f61712a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f61713b) {
            this.f61712a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C5233a() {
        this((c) null);
    }
}
