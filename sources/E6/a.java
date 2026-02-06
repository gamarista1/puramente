package E6;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.C4109d;

public final class a implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0508a f30665c = new C0508a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4109d f30666a;

    /* renamed from: b  reason: collision with root package name */
    private long f30667b = -1;

    /* renamed from: E6.a$a  reason: collision with other inner class name */
    public static final class C0508a {
        public /* synthetic */ C0508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0508a() {
        }
    }

    public a(C4109d dVar) {
        C6496s.h(dVar, "animationInformation");
        this.f30666a = dVar;
    }

    public long a(long j10) {
        long d10 = d();
        long j11 = 0;
        if (d10 == 0) {
            return -1;
        }
        if (!e() && j10 / d10 >= ((long) this.f30666a.b())) {
            return -1;
        }
        long j12 = j10 % d10;
        int a10 = this.f30666a.a();
        for (int i10 = 0; i10 < a10 && j11 <= j12; i10++) {
            j11 += (long) this.f30666a.l(i10);
        }
        return j10 + (j11 - j12);
    }

    public int b(long j10, long j11) {
        long d10 = d();
        if (d10 == 0) {
            return c(0);
        }
        if (e() || j10 / d10 < ((long) this.f30666a.b())) {
            return c(j10 % d10);
        }
        return -1;
    }

    public final int c(long j10) {
        int i10 = 0;
        long j11 = 0;
        while (true) {
            j11 += (long) this.f30666a.l(i10);
            int i11 = i10 + 1;
            if (j10 < j11) {
                return i10;
            }
            i10 = i11;
        }
    }

    public long d() {
        long j10 = this.f30667b;
        if (j10 != -1) {
            return j10;
        }
        this.f30667b = 0;
        int a10 = this.f30666a.a();
        for (int i10 = 0; i10 < a10; i10++) {
            this.f30667b += (long) this.f30666a.l(i10);
        }
        return this.f30667b;
    }

    public boolean e() {
        if (this.f30666a.b() == 0) {
            return true;
        }
        return false;
    }
}
