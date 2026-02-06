package com.facebook.imagepipeline.producers;

import W5.i;
import c7.C3189i;
import i7.C3593b;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class L implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39843a;

    /* renamed from: b  reason: collision with root package name */
    private final i f39844b;

    class a extends m0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C3593b f39845f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g0 f39846g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e0 f39847h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3308n nVar, g0 g0Var, e0 e0Var, String str, C3593b bVar, g0 g0Var2, e0 e0Var2) {
            super(nVar, g0Var, e0Var, str);
            this.f39845f = bVar;
            this.f39846g = g0Var2;
            this.f39847h = e0Var2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void b(C3189i iVar) {
            C3189i.f(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C3189i c() {
            C3189i d10 = L.this.d(this.f39845f);
            if (d10 == null) {
                this.f39846g.b(this.f39847h, L.this.f(), false);
                this.f39847h.n("local", "fetch");
                return null;
            }
            d10.j0();
            this.f39846g.b(this.f39847h, L.this.f(), true);
            this.f39847h.n("local", "fetch");
            this.f39847h.t("image_color_space", d10.t());
            return d10;
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f39849a;

        b(m0 m0Var) {
            this.f39849a = m0Var;
        }

        public void b() {
            this.f39849a.a();
        }
    }

    protected L(Executor executor, i iVar) {
        this.f39843a = executor;
        this.f39844b = iVar;
    }

    public void b(C3308n nVar, e0 e0Var) {
        g0 y10 = e0Var.y();
        C3593b F10 = e0Var.F();
        e0Var.n("local", "fetch");
        a aVar = new a(nVar, y10, e0Var, f(), F10, y10, e0Var);
        e0Var.b(new b(aVar));
        this.f39843a.execute(aVar);
    }

    /* access modifiers changed from: protected */
    public C3189i c(InputStream inputStream, int i10) {
        X5.a U10;
        if (i10 <= 0) {
            try {
                U10 = X5.a.U(this.f39844b.a(inputStream));
            } catch (Throwable th2) {
                T5.b.b(inputStream);
                X5.a.E((X5.a) null);
                throw th2;
            }
        } else {
            U10 = X5.a.U(this.f39844b.b(inputStream, i10));
        }
        X5.a aVar = U10;
        C3189i iVar = new C3189i(aVar);
        T5.b.b(inputStream);
        X5.a.E(aVar);
        return iVar;
    }

    /* access modifiers changed from: protected */
    public abstract C3189i d(C3593b bVar);

    /* access modifiers changed from: protected */
    public C3189i e(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    /* access modifiers changed from: protected */
    public abstract String f();
}
