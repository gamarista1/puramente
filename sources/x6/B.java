package X6;

import T5.n;
import T5.o;
import U6.d;
import V6.C3077d;
import V6.k;
import V6.x;
import W5.a;
import W5.i;
import a7.c;
import a7.f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C3295a;
import com.facebook.imagepipeline.producers.C3301g;
import com.facebook.imagepipeline.producers.C3302h;
import com.facebook.imagepipeline.producers.C3303i;
import com.facebook.imagepipeline.producers.C3304j;
import com.facebook.imagepipeline.producers.C3305k;
import com.facebook.imagepipeline.producers.C3306l;
import com.facebook.imagepipeline.producers.C3309o;
import com.facebook.imagepipeline.producers.C3310p;
import com.facebook.imagepipeline.producers.C3312s;
import com.facebook.imagepipeline.producers.C3315v;
import com.facebook.imagepipeline.producers.C3316w;
import com.facebook.imagepipeline.producers.C3318y;
import com.facebook.imagepipeline.producers.C3319z;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.W;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;

public class B {

    /* renamed from: a  reason: collision with root package name */
    protected ContentResolver f35047a;

    /* renamed from: b  reason: collision with root package name */
    protected Resources f35048b;

    /* renamed from: c  reason: collision with root package name */
    protected AssetManager f35049c;

    /* renamed from: d  reason: collision with root package name */
    protected final a f35050d;

    /* renamed from: e  reason: collision with root package name */
    protected final c f35051e;

    /* renamed from: f  reason: collision with root package name */
    protected final f f35052f;

    /* renamed from: g  reason: collision with root package name */
    protected final C3091n f35053g;

    /* renamed from: h  reason: collision with root package name */
    protected final boolean f35054h;

    /* renamed from: i  reason: collision with root package name */
    protected final boolean f35055i;

    /* renamed from: j  reason: collision with root package name */
    protected final C3093p f35056j;

    /* renamed from: k  reason: collision with root package name */
    protected final i f35057k;

    /* renamed from: l  reason: collision with root package name */
    protected final n f35058l;

    /* renamed from: m  reason: collision with root package name */
    protected final x f35059m;

    /* renamed from: n  reason: collision with root package name */
    protected final x f35060n;

    /* renamed from: o  reason: collision with root package name */
    protected final k f35061o;

    /* renamed from: p  reason: collision with root package name */
    protected final C3077d f35062p;

    /* renamed from: q  reason: collision with root package name */
    protected final C3077d f35063q;

    /* renamed from: r  reason: collision with root package name */
    protected final d f35064r;

    /* renamed from: s  reason: collision with root package name */
    protected final int f35065s;

    /* renamed from: t  reason: collision with root package name */
    protected final int f35066t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f35067u;

    /* renamed from: v  reason: collision with root package name */
    protected final C3078a f35068v;

    /* renamed from: w  reason: collision with root package name */
    protected final int f35069w;

    /* renamed from: x  reason: collision with root package name */
    protected final boolean f35070x;

    public B(Context context, a aVar, c cVar, f fVar, C3091n nVar, boolean z10, boolean z11, C3093p pVar, i iVar, x xVar, x xVar2, n nVar2, k kVar, d dVar, int i10, int i11, boolean z12, int i12, C3078a aVar2, boolean z13, int i13) {
        int i14 = i13;
        this.f35047a = context.getApplicationContext().getContentResolver();
        this.f35048b = context.getApplicationContext().getResources();
        this.f35049c = context.getApplicationContext().getAssets();
        this.f35050d = aVar;
        this.f35051e = cVar;
        this.f35052f = fVar;
        this.f35053g = nVar;
        this.f35054h = z10;
        this.f35055i = z11;
        this.f35056j = pVar;
        this.f35057k = iVar;
        this.f35060n = xVar;
        this.f35059m = xVar2;
        this.f35058l = nVar2;
        this.f35061o = kVar;
        this.f35064r = dVar;
        this.f35062p = new C3077d(i14);
        this.f35063q = new C3077d(i14);
        this.f35065s = i10;
        this.f35066t = i11;
        this.f35067u = z12;
        this.f35069w = i12;
        this.f35068v = aVar2;
        this.f35070x = z13;
    }

    public static C3295a a(d0 d0Var) {
        return new C3295a(d0Var);
    }

    public static C3306l h(d0 d0Var, d0 d0Var2) {
        return new C3306l(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f35060n, this.f35061o, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f35064r, this.f35056j.e());
    }

    public i0 C() {
        return new i0(this.f35056j.f(), this.f35057k, this.f35047a);
    }

    public k0 D(d0 d0Var, boolean z10, k7.d dVar) {
        return new k0(this.f35056j.e(), this.f35057k, d0Var, z10, dVar);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f35056j.a(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C3301g c(d0 d0Var) {
        return new C3301g(this.f35060n, this.f35061o, d0Var);
    }

    public C3302h d(d0 d0Var) {
        return new C3302h(this.f35061o, d0Var);
    }

    public C3303i e(d0 d0Var) {
        return new C3303i(this.f35060n, this.f35061o, d0Var);
    }

    public C3304j f(d0 d0Var) {
        return new C3304j(d0Var, this.f35065s, this.f35066t, this.f35067u);
    }

    public C3305k g(d0 d0Var) {
        return new C3305k(this.f35059m, this.f35058l, this.f35061o, this.f35062p, this.f35063q, d0Var);
    }

    public C3309o i() {
        return new C3309o(this.f35057k);
    }

    public C3310p j(d0 d0Var) {
        return new C3310p(this.f35050d, this.f35056j.d(), this.f35051e, this.f35052f, this.f35053g, this.f35054h, this.f35055i, d0Var, this.f35069w, this.f35068v, (Runnable) null, o.f34179b);
    }

    public C3312s k(d0 d0Var) {
        return new C3312s(d0Var, this.f35056j.c());
    }

    public C3315v l(d0 d0Var) {
        return new C3315v(this.f35058l, this.f35061o, d0Var);
    }

    public C3316w m(d0 d0Var) {
        return new C3316w(this.f35058l, this.f35061o, d0Var);
    }

    public C3318y n(d0 d0Var) {
        return new C3318y(this.f35061o, this.f35070x, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C3319z(this.f35059m, this.f35061o, d0Var);
    }

    public A p(d0 d0Var) {
        return new A(this.f35058l, this.f35061o, this.f35062p, this.f35063q, d0Var);
    }

    public H q() {
        return new H(this.f35056j.f(), this.f35057k, this.f35049c);
    }

    public I r() {
        return new I(this.f35056j.f(), this.f35057k, this.f35047a);
    }

    public J s() {
        return new J(this.f35056j.f(), this.f35057k, this.f35047a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f35056j.g(), this.f35057k, this.f35047a);
    }

    public M u() {
        return new M(this.f35056j.f(), this.f35057k);
    }

    public N v() {
        return new N(this.f35056j.f(), this.f35057k, this.f35048b);
    }

    public S w() {
        return new S(this.f35056j.e(), this.f35047a);
    }

    public T x() {
        return new T(this.f35056j.f(), this.f35047a);
    }

    public d0 y(X x10) {
        return new W(this.f35057k, this.f35050d, x10);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f35058l, this.f35061o, this.f35057k, this.f35050d, d0Var);
    }
}
