package Lb;

import Hb.p;
import Jb.d;
import Jb.f;
import Jb.h;
import Lb.B;
import Nb.e;
import Sb.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.database.c;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;

/* renamed from: Lb.g  reason: case insensitive filesystem */
public abstract class C4373g {

    /* renamed from: a  reason: collision with root package name */
    protected d f51735a;

    /* renamed from: b  reason: collision with root package name */
    protected k f51736b;

    /* renamed from: c  reason: collision with root package name */
    protected B f51737c;

    /* renamed from: d  reason: collision with root package name */
    protected B f51738d;

    /* renamed from: e  reason: collision with root package name */
    protected s f51739e;

    /* renamed from: f  reason: collision with root package name */
    protected String f51740f;

    /* renamed from: g  reason: collision with root package name */
    protected List f51741g;

    /* renamed from: h  reason: collision with root package name */
    protected String f51742h;

    /* renamed from: i  reason: collision with root package name */
    protected d.a f51743i = d.a.INFO;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f51744j;

    /* renamed from: k  reason: collision with root package name */
    protected long f51745k = 10485760;

    /* renamed from: l  reason: collision with root package name */
    protected C5230g f51746l;

    /* renamed from: m  reason: collision with root package name */
    private e f51747m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f51748n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f51749o = false;

    /* renamed from: p  reason: collision with root package name */
    private m f51750p;

    /* renamed from: Lb.g$a */
    class a implements B.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScheduledExecutorService f51751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a f51752b;

        a(ScheduledExecutorService scheduledExecutorService, d.a aVar) {
            this.f51751a = scheduledExecutorService;
            this.f51752b = aVar;
        }

        public void a(String str) {
            this.f51751a.execute(new C4372f(this.f51752b, str));
        }

        public void b(String str) {
            this.f51751a.execute(new C4371e(this.f51752b, str));
        }
    }

    private synchronized void A() {
        this.f51750p = new p(this.f51746l);
    }

    private void G() {
        this.f51736b.a();
        this.f51739e.a();
    }

    private static Jb.d H(B b10, ScheduledExecutorService scheduledExecutorService) {
        return new C4370d(b10, scheduledExecutorService);
    }

    private String c(String str) {
        return "Firebase/" + "5" + "/" + c.g() + "/" + str;
    }

    private void d() {
        C4536s.m(this.f51738d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    private void e() {
        C4536s.m(this.f51737c, "You must register an authTokenProvider before initializing Context.");
    }

    private void f() {
        if (this.f51736b == null) {
            this.f51736b = u().e(this);
        }
    }

    private void g() {
        if (this.f51735a == null) {
            this.f51735a = u().d(this, this.f51743i, this.f51741g);
        }
    }

    private void h() {
        if (this.f51739e == null) {
            this.f51739e = this.f51750p.g(this);
        }
    }

    private void i() {
        if (this.f51740f == null) {
            this.f51740f = "default";
        }
    }

    private void j() {
        if (this.f51742h == null) {
            this.f51742h = c(u().f(this));
        }
    }

    private ScheduledExecutorService p() {
        s v10 = v();
        if (v10 instanceof Ob.c) {
            return ((Ob.c) v10).c();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private m u() {
        if (this.f51750p == null) {
            A();
        }
        return this.f51750p;
    }

    private void z() {
        g();
        u();
        j();
        f();
        h();
        i();
        e();
        d();
    }

    public boolean B() {
        return this.f51748n;
    }

    public boolean C() {
        return this.f51744j;
    }

    public h E(f fVar, h.a aVar) {
        return u().a(this, n(), fVar, aVar);
    }

    public void F() {
        if (this.f51749o) {
            G();
            this.f51749o = false;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (B()) {
            throw new Gb.c("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k() {
        if (!this.f51748n) {
            this.f51748n = true;
            z();
        }
    }

    public B l() {
        return this.f51738d;
    }

    public B m() {
        return this.f51737c;
    }

    public Jb.c n() {
        return new Jb.c(r(), H(m(), p()), H(l(), p()), p(), C(), c.g(), y(), this.f51746l.r().c(), w().getAbsolutePath());
    }

    public k o() {
        return this.f51736b;
    }

    public Sb.c q(String str) {
        return new Sb.c(this.f51735a, str);
    }

    public Sb.d r() {
        return this.f51735a;
    }

    public long s() {
        return this.f51745k;
    }

    /* access modifiers changed from: package-private */
    public e t(String str) {
        e eVar = this.f51747m;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f51744j) {
            return new Nb.d();
        }
        e b10 = this.f51750p.b(this, str);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    public s v() {
        return this.f51739e;
    }

    public File w() {
        return u().c();
    }

    public String x() {
        return this.f51740f;
    }

    public String y() {
        return this.f51742h;
    }
}
