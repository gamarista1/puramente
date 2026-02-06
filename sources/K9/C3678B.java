package k9;

import N9.C3061j;
import N9.C3070t;
import android.content.Context;
import android.os.Looper;
import ga.A;
import ga.m;
import ia.C3607e;
import ja.C3645a;
import ja.C3648d;
import ja.M;
import k9.C3704k;
import m9.C3847e;
import nb.C5112g;
import nb.u;
import q9.C3973h;
import q9.p;

/* renamed from: k9.B  reason: case insensitive filesystem */
public final class C3678B {

    /* renamed from: A  reason: collision with root package name */
    boolean f45171A;

    /* renamed from: a  reason: collision with root package name */
    final Context f45172a;

    /* renamed from: b  reason: collision with root package name */
    C3648d f45173b;

    /* renamed from: c  reason: collision with root package name */
    long f45174c;

    /* renamed from: d  reason: collision with root package name */
    u f45175d;

    /* renamed from: e  reason: collision with root package name */
    u f45176e;

    /* renamed from: f  reason: collision with root package name */
    u f45177f;

    /* renamed from: g  reason: collision with root package name */
    u f45178g;

    /* renamed from: h  reason: collision with root package name */
    u f45179h;

    /* renamed from: i  reason: collision with root package name */
    C5112g f45180i;

    /* renamed from: j  reason: collision with root package name */
    Looper f45181j;

    /* renamed from: k  reason: collision with root package name */
    C3847e f45182k;

    /* renamed from: l  reason: collision with root package name */
    boolean f45183l;

    /* renamed from: m  reason: collision with root package name */
    int f45184m;

    /* renamed from: n  reason: collision with root package name */
    boolean f45185n;

    /* renamed from: o  reason: collision with root package name */
    boolean f45186o;

    /* renamed from: p  reason: collision with root package name */
    int f45187p;

    /* renamed from: q  reason: collision with root package name */
    int f45188q;

    /* renamed from: r  reason: collision with root package name */
    boolean f45189r;

    /* renamed from: s  reason: collision with root package name */
    e1 f45190s;

    /* renamed from: t  reason: collision with root package name */
    long f45191t;

    /* renamed from: u  reason: collision with root package name */
    long f45192u;

    /* renamed from: v  reason: collision with root package name */
    C3726v0 f45193v;

    /* renamed from: w  reason: collision with root package name */
    long f45194w;

    /* renamed from: x  reason: collision with root package name */
    long f45195x;

    /* renamed from: y  reason: collision with root package name */
    boolean f45196y;

    /* renamed from: z  reason: collision with root package name */
    boolean f45197z;

    public C3678B(Context context) {
        this(context, new C3721t(context), new C3723u(context));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ d1 h(Context context) {
        return new C3710n(context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C3070t.a i(Context context) {
        return new C3061j(context, (p) new C3973h());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ A j(Context context) {
        return new m(context);
    }

    /* access modifiers changed from: package-private */
    public f1 g() {
        C3645a.f(!this.f45171A);
        this.f45171A = true;
        return new f1(this);
    }

    public C3678B n(C3607e eVar) {
        C3645a.f(!this.f45171A);
        this.f45179h = new C3725v(eVar);
        return this;
    }

    public C3678B o(Looper looper) {
        C3645a.f(!this.f45171A);
        this.f45181j = looper;
        return this;
    }

    public C3678B p(A a10) {
        C3645a.f(!this.f45171A);
        this.f45177f = new C3727w(a10);
        return this;
    }

    private C3678B(Context context, u uVar, u uVar2) {
        this(context, uVar, uVar2, new C3729x(context), new C3731y(), new C3733z(context), new C3677A());
    }

    private C3678B(Context context, u uVar, u uVar2, u uVar3, u uVar4, u uVar5, C5112g gVar) {
        this.f45172a = context;
        this.f45175d = uVar;
        this.f45176e = uVar2;
        this.f45177f = uVar3;
        this.f45178g = uVar4;
        this.f45179h = uVar5;
        this.f45180i = gVar;
        this.f45181j = M.Q();
        this.f45182k = C3847e.f46631g;
        this.f45184m = 0;
        this.f45187p = 1;
        this.f45188q = 0;
        this.f45189r = true;
        this.f45190s = e1.f45539g;
        this.f45191t = 5000;
        this.f45192u = 15000;
        this.f45193v = new C3704k.b().a();
        this.f45173b = C3648d.f44997a;
        this.f45194w = 500;
        this.f45195x = 2000;
        this.f45197z = true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C3607e l(C3607e eVar) {
        return eVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ A m(A a10) {
        return a10;
    }
}
