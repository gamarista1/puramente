package l6;

import G6.a;
import G6.b;
import G6.e;
import G6.i;
import G6.j;
import G6.n;
import a6.C3136b;
import c7.C3191k;
import java.io.Closeable;
import q6.F;

/* renamed from: l6.b  reason: case insensitive filesystem */
public class C3742b extends a implements Closeable, F {

    /* renamed from: c  reason: collision with root package name */
    private final C3136b f46136c;

    /* renamed from: d  reason: collision with root package name */
    private final j f46137d;

    /* renamed from: e  reason: collision with root package name */
    private final i f46138e;

    /* renamed from: f  reason: collision with root package name */
    private i f46139f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f46140g;

    public C3742b(C3136b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    private void E(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        Q(jVar, n.INVISIBLE);
    }

    private void M(j jVar, e eVar) {
        jVar.H(eVar);
        this.f46138e.b(jVar, eVar);
        i iVar = this.f46139f;
        if (iVar != null) {
            iVar.b(jVar, eVar);
        }
    }

    private void Q(j jVar, n nVar) {
        this.f46138e.a(jVar, nVar);
        i iVar = this.f46139f;
        if (iVar != null) {
            iVar.a(jVar, nVar);
        }
    }

    public void F(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        Q(jVar, n.VISIBLE);
    }

    public void I() {
        this.f46137d.w();
    }

    public void b(String str, Object obj, b.a aVar) {
        long now = this.f46136c.now();
        j jVar = this.f46137d;
        jVar.x();
        jVar.D(now);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        M(jVar, e.REQUESTED);
        if (this.f46140g) {
            F(jVar, now);
        }
    }

    public void close() {
        I();
    }

    public void f(String str, Throwable th2, b.a aVar) {
        long now = this.f46136c.now();
        j jVar = this.f46137d;
        jVar.F(aVar);
        jVar.z(now);
        jVar.B(str);
        jVar.E(th2);
        M(jVar, e.ERROR);
        E(jVar, now);
    }

    public void q(boolean z10) {
        if (z10) {
            F(this.f46137d, this.f46136c.now());
        } else {
            E(this.f46137d, this.f46136c.now());
        }
    }

    public void t(String str, b.a aVar) {
        long now = this.f46136c.now();
        j jVar = this.f46137d;
        jVar.F(aVar);
        jVar.B(str);
        M(jVar, e.RELEASED);
        if (this.f46140g) {
            E(jVar, now);
        }
    }

    /* renamed from: v */
    public void n(String str, C3191k kVar, b.a aVar) {
        long now = this.f46136c.now();
        j jVar = this.f46137d;
        jVar.F(aVar);
        jVar.A(now);
        jVar.J(now);
        jVar.B(str);
        jVar.G(kVar);
        M(jVar, e.SUCCESS);
    }

    /* renamed from: y */
    public void a(String str, C3191k kVar) {
        long now = this.f46136c.now();
        j jVar = this.f46137d;
        jVar.C(now);
        jVar.B(str);
        jVar.G(kVar);
        M(jVar, e.INTERMEDIATE_AVAILABLE);
    }

    public C3742b(C3136b bVar, j jVar, i iVar, boolean z10) {
        this.f46139f = null;
        this.f46136c = bVar;
        this.f46137d = jVar;
        this.f46138e = iVar;
        this.f46140g = z10;
    }

    public void onDraw() {
    }
}
