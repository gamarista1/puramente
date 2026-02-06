package Jd;

import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f51421a;

    /* renamed from: b  reason: collision with root package name */
    private long f51422b;

    /* renamed from: c  reason: collision with root package name */
    private long f51423c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f51424d;

    /* renamed from: e  reason: collision with root package name */
    private C6787a f51425e;

    public d(e eVar) {
        C6496s.h(eVar, "timeMachine");
        this.f51421a = eVar;
    }

    private final long b() {
        if (this.f51423c > this.f51421a.a()) {
            return this.f51422b;
        }
        long a10 = this.f51421a.a() - this.f51423c;
        long j10 = this.f51422b;
        return ((a10 / j10) + 1) * j10;
    }

    private final boolean c() {
        if (this.f51422b <= 0 || this.f51423c < 0 || this.f51424d) {
            return false;
        }
        return true;
    }

    private final void f() {
        if (this.f51423c == -1) {
            this.f51423c = this.f51421a.a();
        }
        if (c()) {
            long b10 = this.f51423c + b();
            this.f51423c = b10;
            this.f51424d = true;
            e eVar = this.f51421a;
            eVar.b(b10 - eVar.a(), new c(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M g(d dVar) {
        dVar.f51424d = false;
        C6787a aVar = dVar.f51425e;
        if (aVar != null) {
            aVar.invoke();
        }
        dVar.f();
        return C6514M.f71813a;
    }

    private final void h(boolean z10) {
        if (!z10) {
            this.f51422b = 0;
            this.f51423c = -1;
            this.f51424d = false;
        }
    }

    public final boolean d() {
        if (this.f51422b > 0) {
            return true;
        }
        return false;
    }

    public final void e(long j10, C6787a aVar) {
        C6496s.h(aVar, "listener");
        this.f51425e = aVar;
        this.f51422b = j10;
        f();
    }

    public final void i() {
        h(false);
        this.f51425e = null;
    }
}
