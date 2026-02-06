package G6;

import G6.b;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class j extends h {

    /* renamed from: A  reason: collision with root package name */
    private long f31590A = -1;

    /* renamed from: B  reason: collision with root package name */
    private long f31591B = -1;

    /* renamed from: C  reason: collision with root package name */
    private long f31592C = -1;

    /* renamed from: D  reason: collision with root package name */
    private boolean f31593D;

    /* renamed from: E  reason: collision with root package name */
    private int f31594E = -1;

    /* renamed from: F  reason: collision with root package name */
    private int f31595F = -1;

    /* renamed from: G  reason: collision with root package name */
    private Throwable f31596G;

    /* renamed from: H  reason: collision with root package name */
    private e f31597H = e.UNKNOWN;

    /* renamed from: I  reason: collision with root package name */
    private n f31598I = n.UNKNOWN;

    /* renamed from: J  reason: collision with root package name */
    private long f31599J = -1;

    /* renamed from: K  reason: collision with root package name */
    private long f31600K = -1;

    /* renamed from: L  reason: collision with root package name */
    private b.a f31601L;

    /* renamed from: s  reason: collision with root package name */
    private String f31602s;

    /* renamed from: t  reason: collision with root package name */
    private String f31603t;

    /* renamed from: u  reason: collision with root package name */
    private Object f31604u;

    /* renamed from: v  reason: collision with root package name */
    private Object f31605v;

    /* renamed from: w  reason: collision with root package name */
    private Object f31606w;

    /* renamed from: x  reason: collision with root package name */
    private long f31607x = -1;

    /* renamed from: y  reason: collision with root package name */
    private long f31608y = -1;

    /* renamed from: z  reason: collision with root package name */
    private long f31609z = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(kVar);
        C6496s.h(kVar, "infra");
    }

    public final void A(long j10) {
        this.f31609z = j10;
    }

    public final void B(String str) {
        this.f31602s = str;
    }

    public final void C(long j10) {
        this.f31608y = j10;
    }

    public final void D(long j10) {
        this.f31607x = j10;
    }

    public final void E(Throwable th2) {
        this.f31596G = th2;
    }

    public final void F(b.a aVar) {
        this.f31601L = aVar;
    }

    public final void G(Object obj) {
        this.f31606w = obj;
    }

    public final void H(e eVar) {
        C6496s.h(eVar, "<set-?>");
        this.f31597H = eVar;
    }

    public final void I(Object obj) {
        this.f31604u = obj;
    }

    public final void J(long j10) {
        this.f31592C = j10;
    }

    public final void K(long j10) {
        this.f31591B = j10;
    }

    public final void L(long j10) {
        this.f31600K = j10;
    }

    public final void M(int i10) {
        this.f31595F = i10;
    }

    public final void N(int i10) {
        this.f31594E = i10;
    }

    public final void O(boolean z10) {
        this.f31593D = z10;
    }

    public final void P(String str) {
        this.f31603t = str;
    }

    public final void Q(long j10) {
        this.f31599J = j10;
    }

    public final void R(boolean z10) {
        n nVar;
        if (z10) {
            nVar = n.VISIBLE;
        } else {
            nVar = n.INVISIBLE;
        }
        this.f31598I = nVar;
    }

    public final f S() {
        return new f(j(), this.f31602s, this.f31603t, this.f31604u, this.f31605v, this.f31606w, this.f31607x, this.f31608y, this.f31609z, this.f31590A, this.f31591B, this.f31592C, f(), n(), this.f31593D, this.f31594E, this.f31595F, this.f31596G, this.f31598I, this.f31599J, this.f31600K, (c) null, this.f31601L, a(), o(), c(), d(), b(), r(), q(), l(), p(), C6565s.e1(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f31603t = null;
        this.f31604u = null;
        this.f31605v = null;
        this.f31606w = null;
        this.f31593D = false;
        this.f31594E = -1;
        this.f31595F = -1;
        this.f31596G = null;
        this.f31597H = e.UNKNOWN;
        this.f31598I = n.UNKNOWN;
        this.f31601L = null;
        x();
        s();
    }

    public final void x() {
        this.f31591B = -1;
        this.f31592C = -1;
        this.f31607x = -1;
        this.f31609z = -1;
        this.f31590A = -1;
        this.f31599J = -1;
        this.f31600K = -1;
        k().clear();
        u(false);
        t((Long) null);
        v((Long) null);
    }

    public final void y(Object obj) {
        this.f31605v = obj;
    }

    public final void z(long j10) {
        this.f31590A = j10;
    }
}
