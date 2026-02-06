package ae;

import ae.p;
import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.C6496s;
import qe.L;

public final class j implements p {

    /* renamed from: a  reason: collision with root package name */
    private final Promise f53624a;

    public j(Promise promise) {
        C6496s.h(promise, "bridgePromise");
        this.f53624a = promise;
    }

    public void a() {
        p.a.b(this);
    }

    public void b(boolean z10) {
        p.a.g(this, z10);
    }

    public void c(int i10) {
        p.a.e(this, i10);
    }

    public void d(double d10) {
        p.a.c(this, d10);
    }

    public void e(float f10) {
        p.a.d(this, f10);
    }

    public void f(String str) {
        p.a.f(this, str);
    }

    public void g(CodedException codedException) {
        p.a.a(this, codedException);
    }

    public void reject(String str, String str2, Throwable th2) {
        C6496s.h(str, "code");
        this.f53624a.reject(str, str2, th2);
    }

    public void resolve(Object obj) {
        this.f53624a.resolve(L.b(L.f61392a, obj, (L.a) null, false, 6, (Object) null));
    }
}
