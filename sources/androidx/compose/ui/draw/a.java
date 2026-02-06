package androidx.compose.ui.draw;

import J0.C1239e0;
import J0.C1245k;
import J0.C1252s;
import J0.h0;
import J0.i0;
import c1.d;
import c1.s;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6527k;
import o0.C2339b;
import o0.C2340c;
import o0.C2341d;
import o0.C2345h;
import r0.F1;
import t0.C2602c;
import yf.C6787a;
import yf.C6798l;

final class a extends i.c implements C2340c, h0, C2339b {

    /* renamed from: n  reason: collision with root package name */
    private final C2341d f13264n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13265o;

    /* renamed from: p  reason: collision with root package name */
    private f f13266p;

    /* renamed from: q  reason: collision with root package name */
    private C6798l f13267q;

    /* renamed from: androidx.compose.ui.draw.a$a  reason: collision with other inner class name */
    static final class C0254a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13268a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0254a(a aVar) {
            super(0);
            this.f13268a = aVar;
        }

        /* renamed from: a */
        public final F1 invoke() {
            return this.f13268a.m2();
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2341d f13270b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C2341d dVar) {
            super(0);
            this.f13269a = aVar;
            this.f13270b = dVar;
        }

        public final void invoke() {
            this.f13269a.l2().invoke(this.f13270b);
        }
    }

    public a(C2341d dVar, C6798l lVar) {
        this.f13264n = dVar;
        this.f13267q = lVar;
        dVar.p(this);
        dVar.x(new C0254a(this));
    }

    private final C2345h n2(C2602c cVar) {
        if (!this.f13265o) {
            C2341d dVar = this.f13264n;
            dVar.u((C2345h) null);
            dVar.s(cVar);
            i0.a(this, new b(this, dVar));
            if (dVar.a() != null) {
                this.f13265o = true;
            } else {
                G0.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new C6527k();
            }
        }
        C2345h a10 = this.f13264n.a();
        C6496s.e(a10);
        return a10;
    }

    public void A0() {
        W0();
    }

    public void W0() {
        f fVar = this.f13266p;
        if (fVar != null) {
            fVar.d();
        }
        this.f13265o = false;
        this.f13264n.u((C2345h) null);
        C1252s.a(this);
    }

    public void W1() {
        super.W1();
        f fVar = this.f13266p;
        if (fVar != null) {
            fVar.d();
        }
    }

    public long d() {
        return s.d(C1245k.h(this, C1239e0.a(128)).b());
    }

    public d getDensity() {
        return C1245k.i(this);
    }

    public t getLayoutDirection() {
        return C1245k.l(this);
    }

    public void l1() {
        W0();
    }

    public final C6798l l2() {
        return this.f13267q;
    }

    public final F1 m2() {
        f fVar = this.f13266p;
        if (fVar == null) {
            fVar = new f();
            this.f13266p = fVar;
        }
        if (fVar.c() == null) {
            fVar.e(C1245k.j(this));
        }
        return fVar;
    }

    public final void o2(C6798l lVar) {
        this.f13267q = lVar;
        W0();
    }

    public void u(C2602c cVar) {
        n2(cVar).a().invoke(cVar);
    }
}
