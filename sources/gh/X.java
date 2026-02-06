package Gh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class X {

    /* renamed from: d  reason: collision with root package name */
    public static final b f63256d = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final X f63257e = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f63258a;

    /* renamed from: b  reason: collision with root package name */
    private long f63259b;

    /* renamed from: c  reason: collision with root package name */
    private long f63260c;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public X a() {
        this.f63258a = false;
        return this;
    }

    public X b() {
        this.f63260c = 0;
        return this;
    }

    public long c() {
        if (this.f63258a) {
            return this.f63259b;
        }
        throw new IllegalStateException("No deadline");
    }

    public X d(long j10) {
        this.f63258a = true;
        this.f63259b = j10;
        return this;
    }

    public boolean e() {
        return this.f63258a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f63258a && this.f63259b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public X g(long j10, TimeUnit timeUnit) {
        C6496s.h(timeUnit, "unit");
        if (j10 >= 0) {
            this.f63260c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f63260c;
    }

    public static final class a extends X {
        a() {
        }

        public X g(long j10, TimeUnit timeUnit) {
            C6496s.h(timeUnit, "unit");
            return this;
        }

        public void f() {
        }

        public X d(long j10) {
            return this;
        }
    }
}
