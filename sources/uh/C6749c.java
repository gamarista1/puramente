package uh;

import Sg.p;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.C;
import rh.C6707d;
import rh.E;
import rh.u;
import sh.C6726e;
import xh.c;

/* renamed from: uh.c  reason: case insensitive filesystem */
public final class C6749c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f73597c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C f73598a;

    /* renamed from: b  reason: collision with root package name */
    private final E f73599b;

    /* renamed from: uh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(E e10, C c10) {
            C6496s.h(e10, "response");
            C6496s.h(c10, "request");
            int o10 = e10.o();
            if (!(o10 == 200 || o10 == 410 || o10 == 414 || o10 == 501 || o10 == 203 || o10 == 204)) {
                if (o10 != 307) {
                    if (!(o10 == 308 || o10 == 404 || o10 == 405)) {
                        switch (o10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (E.E(e10, "Expires", (String) null, 2, (Object) null) == null && e10.b().c() == -1 && !e10.b().b() && !e10.b().a()) {
                    return false;
                }
            }
            if (e10.b().h() || c10.b().h()) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    /* renamed from: uh.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f73600a;

        /* renamed from: b  reason: collision with root package name */
        private final C f73601b;

        /* renamed from: c  reason: collision with root package name */
        private final E f73602c;

        /* renamed from: d  reason: collision with root package name */
        private Date f73603d;

        /* renamed from: e  reason: collision with root package name */
        private String f73604e;

        /* renamed from: f  reason: collision with root package name */
        private Date f73605f;

        /* renamed from: g  reason: collision with root package name */
        private String f73606g;

        /* renamed from: h  reason: collision with root package name */
        private Date f73607h;

        /* renamed from: i  reason: collision with root package name */
        private long f73608i;

        /* renamed from: j  reason: collision with root package name */
        private long f73609j;

        /* renamed from: k  reason: collision with root package name */
        private String f73610k;

        /* renamed from: l  reason: collision with root package name */
        private int f73611l = -1;

        public b(long j10, C c10, E e10) {
            C6496s.h(c10, "request");
            this.f73600a = j10;
            this.f73601b = c10;
            this.f73602c = e10;
            if (e10 != null) {
                this.f73608i = e10.h0();
                this.f73609j = e10.f0();
                u F10 = e10.F();
                int size = F10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String g10 = F10.g(i10);
                    String x10 = F10.x(i10);
                    if (p.v(g10, "Date", true)) {
                        this.f73603d = c.a(x10);
                        this.f73604e = x10;
                    } else if (p.v(g10, "Expires", true)) {
                        this.f73607h = c.a(x10);
                    } else if (p.v(g10, "Last-Modified", true)) {
                        this.f73605f = c.a(x10);
                        this.f73606g = x10;
                    } else if (p.v(g10, "ETag", true)) {
                        this.f73610k = x10;
                    } else if (p.v(g10, "Age", true)) {
                        this.f73611l = C6726e.Y(x10, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f73603d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f73609j - date.getTime());
            }
            int i10 = this.f73611l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f73609j;
            return j10 + (j11 - this.f73608i) + (this.f73600a - j11);
        }

        private final C6749c c() {
            long j10;
            String str;
            if (this.f73602c == null) {
                return new C6749c(this.f73601b, (E) null);
            }
            if (this.f73601b.g() && this.f73602c.t() == null) {
                return new C6749c(this.f73601b, (E) null);
            }
            if (!C6749c.f73597c.a(this.f73602c, this.f73601b)) {
                return new C6749c(this.f73601b, (E) null);
            }
            C6707d b10 = this.f73601b.b();
            if (b10.g() || e(this.f73601b)) {
                return new C6749c(this.f73601b, (E) null);
            }
            C6707d b11 = this.f73602c.b();
            long a10 = a();
            long d10 = d();
            if (b10.c() != -1) {
                d10 = Math.min(d10, TimeUnit.SECONDS.toMillis((long) b10.c()));
            }
            long j11 = 0;
            if (b10.e() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.e());
            } else {
                j10 = 0;
            }
            if (!b11.f() && b10.d() != -1) {
                j11 = TimeUnit.SECONDS.toMillis((long) b10.d());
            }
            if (!b11.g()) {
                long j12 = j10 + a10;
                if (j12 < j11 + d10) {
                    E.a T10 = this.f73602c.T();
                    if (j12 >= d10) {
                        T10.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        T10.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C6749c((C) null, T10.c());
                }
            }
            String str2 = this.f73610k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f73605f != null) {
                    str2 = this.f73606g;
                } else if (this.f73603d == null) {
                    return new C6749c(this.f73601b, (E) null);
                } else {
                    str2 = this.f73604e;
                }
                str = "If-Modified-Since";
            }
            u.a n10 = this.f73601b.f().n();
            C6496s.e(str2);
            n10.d(str, str2);
            return new C6749c(this.f73601b.i().f(n10.f()).b(), this.f73602c);
        }

        private final long d() {
            long j10;
            long j11;
            E e10 = this.f73602c;
            C6496s.e(e10);
            C6707d b10 = e10.b();
            if (b10.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b10.c());
            }
            Date date = this.f73607h;
            if (date != null) {
                Date date2 = this.f73603d;
                if (date2 != null) {
                    j11 = date2.getTime();
                } else {
                    j11 = this.f73609j;
                }
                long time = date.getTime() - j11;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f73605f == null || this.f73602c.g0().l().p() != null) {
                return 0;
            } else {
                Date date3 = this.f73603d;
                if (date3 != null) {
                    j10 = date3.getTime();
                } else {
                    j10 = this.f73608i;
                }
                Date date4 = this.f73605f;
                C6496s.e(date4);
                long time2 = j10 - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean e(C c10) {
            if (c10.d("If-Modified-Since") == null && c10.d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean f() {
            E e10 = this.f73602c;
            C6496s.e(e10);
            if (e10.b().c() == -1 && this.f73607h == null) {
                return true;
            }
            return false;
        }

        public final C6749c b() {
            C6749c c10 = c();
            if (c10.b() == null || !this.f73601b.b().i()) {
                return c10;
            }
            return new C6749c((C) null, (E) null);
        }
    }

    public C6749c(C c10, E e10) {
        this.f73598a = c10;
        this.f73599b = e10;
    }

    public final E a() {
        return this.f73599b;
    }

    public final C b() {
        return this.f73598a;
    }
}
