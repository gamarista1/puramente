package androidx.work;

import androidx.work.impl.C1845e;
import com.google.android.gms.common.api.a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x1.C2896a;

/* renamed from: androidx.work.c  reason: case insensitive filesystem */
public final class C1836c {

    /* renamed from: p  reason: collision with root package name */
    public static final b f18682p = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Executor f18683a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f18684b;

    /* renamed from: c  reason: collision with root package name */
    private final C1835b f18685c;

    /* renamed from: d  reason: collision with root package name */
    private final G f18686d;

    /* renamed from: e  reason: collision with root package name */
    private final m f18687e;

    /* renamed from: f  reason: collision with root package name */
    private final A f18688f;

    /* renamed from: g  reason: collision with root package name */
    private final C2896a f18689g;

    /* renamed from: h  reason: collision with root package name */
    private final C2896a f18690h;

    /* renamed from: i  reason: collision with root package name */
    private final String f18691i;

    /* renamed from: j  reason: collision with root package name */
    private final int f18692j;

    /* renamed from: k  reason: collision with root package name */
    private final int f18693k;

    /* renamed from: l  reason: collision with root package name */
    private final int f18694l;

    /* renamed from: m  reason: collision with root package name */
    private final int f18695m;

    /* renamed from: n  reason: collision with root package name */
    private final int f18696n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18697o;

    /* renamed from: androidx.work.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Executor f18698a;

        /* renamed from: b  reason: collision with root package name */
        private G f18699b;

        /* renamed from: c  reason: collision with root package name */
        private m f18700c;

        /* renamed from: d  reason: collision with root package name */
        private Executor f18701d;

        /* renamed from: e  reason: collision with root package name */
        private C1835b f18702e;

        /* renamed from: f  reason: collision with root package name */
        private A f18703f;

        /* renamed from: g  reason: collision with root package name */
        private C2896a f18704g;

        /* renamed from: h  reason: collision with root package name */
        private C2896a f18705h;

        /* renamed from: i  reason: collision with root package name */
        private String f18706i;

        /* renamed from: j  reason: collision with root package name */
        private int f18707j = 4;

        /* renamed from: k  reason: collision with root package name */
        private int f18708k;

        /* renamed from: l  reason: collision with root package name */
        private int f18709l = a.e.API_PRIORITY_OTHER;

        /* renamed from: m  reason: collision with root package name */
        private int f18710m = 20;

        /* renamed from: n  reason: collision with root package name */
        private int f18711n = C1837d.c();

        public final C1836c a() {
            return new C1836c(this);
        }

        public final C1835b b() {
            return this.f18702e;
        }

        public final int c() {
            return this.f18711n;
        }

        public final String d() {
            return this.f18706i;
        }

        public final Executor e() {
            return this.f18698a;
        }

        public final C2896a f() {
            return this.f18704g;
        }

        public final m g() {
            return this.f18700c;
        }

        public final int h() {
            return this.f18707j;
        }

        public final int i() {
            return this.f18709l;
        }

        public final int j() {
            return this.f18710m;
        }

        public final int k() {
            return this.f18708k;
        }

        public final A l() {
            return this.f18703f;
        }

        public final C2896a m() {
            return this.f18705h;
        }

        public final Executor n() {
            return this.f18701d;
        }

        public final G o() {
            return this.f18699b;
        }
    }

    /* renamed from: androidx.work.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1836c(a aVar) {
        C6496s.h(aVar, "builder");
        Executor e10 = aVar.e();
        boolean z10 = false;
        this.f18683a = e10 == null ? C1837d.b(false) : e10;
        this.f18697o = aVar.n() == null ? true : z10;
        Executor n10 = aVar.n();
        this.f18684b = n10 == null ? C1837d.b(true) : n10;
        C1835b b10 = aVar.b();
        this.f18685c = b10 == null ? new B() : b10;
        G o10 = aVar.o();
        if (o10 == null) {
            o10 = G.c();
            C6496s.g(o10, "getDefaultWorkerFactory()");
        }
        this.f18686d = o10;
        m g10 = aVar.g();
        this.f18687e = g10 == null ? u.f19039a : g10;
        A l10 = aVar.l();
        this.f18688f = l10 == null ? new C1845e() : l10;
        this.f18692j = aVar.h();
        this.f18693k = aVar.k();
        this.f18694l = aVar.i();
        this.f18696n = aVar.j();
        this.f18689g = aVar.f();
        this.f18690h = aVar.m();
        this.f18691i = aVar.d();
        this.f18695m = aVar.c();
    }

    public final C1835b a() {
        return this.f18685c;
    }

    public final int b() {
        return this.f18695m;
    }

    public final String c() {
        return this.f18691i;
    }

    public final Executor d() {
        return this.f18683a;
    }

    public final C2896a e() {
        return this.f18689g;
    }

    public final m f() {
        return this.f18687e;
    }

    public final int g() {
        return this.f18694l;
    }

    public final int h() {
        return this.f18696n;
    }

    public final int i() {
        return this.f18693k;
    }

    public final int j() {
        return this.f18692j;
    }

    public final A k() {
        return this.f18688f;
    }

    public final C2896a l() {
        return this.f18690h;
    }

    public final Executor m() {
        return this.f18684b;
    }

    public final G n() {
        return this.f18686d;
    }
}
