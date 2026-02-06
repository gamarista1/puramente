package We;

import ff.C5868v;
import p003if.n;

/* renamed from: We.f0  reason: case insensitive filesystem */
public final class C5626f0 {

    /* renamed from: a  reason: collision with root package name */
    private C5868v f65864a;

    /* renamed from: b  reason: collision with root package name */
    private b1 f65865b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f65866c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f65867d;

    /* renamed from: e  reason: collision with root package name */
    private final C5615a f65868e;

    public C5626f0() {
        this(new C5868v(), new b1(), (b1) null, (C5615a) null, (Boolean) null);
    }

    public C5615a a() {
        return this.f65868e;
    }

    public b1 b() {
        return this.f65866c;
    }

    public b1 c() {
        return this.f65865b;
    }

    public C5868v d() {
        return this.f65864a;
    }

    public Boolean e() {
        return this.f65867d;
    }

    public C5626f0(C5626f0 f0Var) {
        this(f0Var.d(), f0Var.c(), f0Var.b(), f0Var.a(), f0Var.e());
    }

    public C5626f0(C5868v vVar, b1 b1Var, b1 b1Var2, C5615a aVar, Boolean bool) {
        this.f65864a = vVar;
        this.f65865b = b1Var;
        this.f65866c = b1Var2;
        this.f65868e = n.a(aVar, bool, (Double) null, (Double) null);
        this.f65867d = bool;
    }
}
