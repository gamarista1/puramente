package i4;

import Sg.p;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.C3877C;
import o4.l;
import rh.C;
import rh.C6707d;
import rh.E;
import rh.u;

/* renamed from: i4.d  reason: case insensitive filesystem */
public final class C3589d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f44181c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C f44182a;

    /* renamed from: b  reason: collision with root package name */
    private final C3588c f44183b;

    /* renamed from: i4.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            if (p.v("Content-Length", str, true) || p.v("Content-Encoding", str, true) || p.v("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        private final boolean e(String str) {
            if (p.v("Connection", str, true) || p.v("Keep-Alive", str, true) || p.v("Proxy-Authenticate", str, true) || p.v("Proxy-Authorization", str, true) || p.v("TE", str, true) || p.v("Trailers", str, true) || p.v("Transfer-Encoding", str, true) || p.v("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        public final u a(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                String x10 = uVar.x(i10);
                if ((!p.v("Warning", g10, true) || !p.J(x10, "1", false, 2, (Object) null)) && (d(g10) || !e(g10) || uVar2.a(g10) == null)) {
                    aVar.e(g10, x10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String g11 = uVar2.g(i11);
                if (!d(g11) && e(g11)) {
                    aVar.e(g11, uVar2.x(i11));
                }
            }
            return aVar.f();
        }

        public final boolean b(C c10, C3588c cVar) {
            if (c10.b().h() || cVar.e().h() || C6496s.c(cVar.h().a("Vary"), "*")) {
                return false;
            }
            return true;
        }

        public final boolean c(C c10, E e10) {
            if (c10.b().h() || e10.b().h() || C6496s.c(e10.F().a("Vary"), "*")) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    /* renamed from: i4.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C f44184a;

        /* renamed from: b  reason: collision with root package name */
        private final C3588c f44185b;

        /* renamed from: c  reason: collision with root package name */
        private Date f44186c;

        /* renamed from: d  reason: collision with root package name */
        private String f44187d;

        /* renamed from: e  reason: collision with root package name */
        private Date f44188e;

        /* renamed from: f  reason: collision with root package name */
        private String f44189f;

        /* renamed from: g  reason: collision with root package name */
        private Date f44190g;

        /* renamed from: h  reason: collision with root package name */
        private long f44191h;

        /* renamed from: i  reason: collision with root package name */
        private long f44192i;

        /* renamed from: j  reason: collision with root package name */
        private String f44193j;

        /* renamed from: k  reason: collision with root package name */
        private int f44194k = -1;

        public b(C c10, C3588c cVar) {
            this.f44184a = c10;
            this.f44185b = cVar;
            if (cVar != null) {
                this.f44191h = cVar.i();
                this.f44192i = cVar.g();
                u h10 = cVar.h();
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String g10 = h10.g(i10);
                    if (p.v(g10, "Date", true)) {
                        this.f44186c = h10.b("Date");
                        this.f44187d = h10.x(i10);
                    } else if (p.v(g10, "Expires", true)) {
                        this.f44190g = h10.b("Expires");
                    } else if (p.v(g10, "Last-Modified", true)) {
                        this.f44188e = h10.b("Last-Modified");
                        this.f44189f = h10.x(i10);
                    } else if (p.v(g10, "ETag", true)) {
                        this.f44193j = h10.x(i10);
                    } else if (p.v(g10, "Age", true)) {
                        this.f44194k = l.z(h10.x(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f44186c;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f44192i - date.getTime());
            }
            int i10 = this.f44194k;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            return j10 + (this.f44192i - this.f44191h) + (C3877C.f46987a.a() - this.f44192i);
        }

        private final long c() {
            long j10;
            long j11;
            C3588c cVar = this.f44185b;
            C6496s.e(cVar);
            C6707d e10 = cVar.e();
            if (e10.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) e10.c());
            }
            Date date = this.f44190g;
            if (date != null) {
                Date date2 = this.f44186c;
                if (date2 != null) {
                    j11 = date2.getTime();
                } else {
                    j11 = this.f44192i;
                }
                long time = date.getTime() - j11;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f44188e == null || this.f44184a.l().p() != null) {
                return 0;
            } else {
                Date date3 = this.f44186c;
                if (date3 != null) {
                    j10 = date3.getTime();
                } else {
                    j10 = this.f44191h;
                }
                Date date4 = this.f44188e;
                C6496s.e(date4);
                long time2 = j10 - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean d(C c10) {
            if (c10.d("If-Modified-Since") == null && c10.d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        public final C3589d b() {
            long j10;
            String str;
            if (this.f44185b == null) {
                return new C3589d(this.f44184a, (C3588c) null, (DefaultConstructorMarker) null);
            }
            if (this.f44184a.g() && !this.f44185b.j()) {
                return new C3589d(this.f44184a, (C3588c) null, (DefaultConstructorMarker) null);
            }
            C6707d e10 = this.f44185b.e();
            if (!C3589d.f44181c.b(this.f44184a, this.f44185b)) {
                return new C3589d(this.f44184a, (C3588c) null, (DefaultConstructorMarker) null);
            }
            C6707d b10 = this.f44184a.b();
            if (b10.g() || d(this.f44184a)) {
                return new C3589d(this.f44184a, (C3588c) null, (DefaultConstructorMarker) null);
            }
            long a10 = a();
            long c10 = c();
            if (b10.c() != -1) {
                c10 = Math.min(c10, TimeUnit.SECONDS.toMillis((long) b10.c()));
            }
            long j11 = 0;
            if (b10.e() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.e());
            } else {
                j10 = 0;
            }
            if (!e10.f() && b10.d() != -1) {
                j11 = TimeUnit.SECONDS.toMillis((long) b10.d());
            }
            if (!e10.g() && a10 + j10 < c10 + j11) {
                return new C3589d((C) null, this.f44185b, (DefaultConstructorMarker) null);
            }
            String str2 = this.f44193j;
            if (str2 != null) {
                C6496s.e(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f44188e != null) {
                    str2 = this.f44189f;
                    C6496s.e(str2);
                } else if (this.f44186c == null) {
                    return new C3589d(this.f44184a, (C3588c) null, (DefaultConstructorMarker) null);
                } else {
                    str2 = this.f44187d;
                    C6496s.e(str2);
                }
            }
            return new C3589d(this.f44184a.i().a(str, str2).b(), this.f44185b, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C3589d(C c10, C3588c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10, cVar);
    }

    public final C3588c a() {
        return this.f44183b;
    }

    public final C b() {
        return this.f44182a;
    }

    private C3589d(C c10, C3588c cVar) {
        this.f44182a = c10;
        this.f44183b = cVar;
    }
}
