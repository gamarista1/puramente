package Gh;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.p  reason: case insensitive filesystem */
public class C5415p extends X {

    /* renamed from: f  reason: collision with root package name */
    private X f63325f;

    public C5415p(X x10) {
        C6496s.h(x10, "delegate");
        this.f63325f = x10;
    }

    public X a() {
        return this.f63325f.a();
    }

    public X b() {
        return this.f63325f.b();
    }

    public long c() {
        return this.f63325f.c();
    }

    public X d(long j10) {
        return this.f63325f.d(j10);
    }

    public boolean e() {
        return this.f63325f.e();
    }

    public void f() {
        this.f63325f.f();
    }

    public X g(long j10, TimeUnit timeUnit) {
        C6496s.h(timeUnit, "unit");
        return this.f63325f.g(j10, timeUnit);
    }

    public long h() {
        return this.f63325f.h();
    }

    public final X i() {
        return this.f63325f;
    }

    public final C5415p j(X x10) {
        C6496s.h(x10, "delegate");
        this.f63325f = x10;
        return this;
    }
}
