package o0;

import c1.d;
import c1.t;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import t0.C2602c;
import yf.C6787a;
import yf.C6798l;

/* renamed from: o0.d  reason: case insensitive filesystem */
public final class C2341d implements d {

    /* renamed from: a  reason: collision with root package name */
    private C2339b f24702a = C2346i.f24709a;

    /* renamed from: b  reason: collision with root package name */
    private C2345h f24703b;

    /* renamed from: c  reason: collision with root package name */
    private C2602c f24704c;

    /* renamed from: d  reason: collision with root package name */
    private C6787a f24705d;

    /* renamed from: o0.d$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f24706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar) {
            super(1);
            this.f24706a = lVar;
        }

        public final void a(C2602c cVar) {
            this.f24706a.invoke(cVar);
            cVar.H1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    public final C2345h a() {
        return this.f24703b;
    }

    public final long d() {
        return this.f24702a.d();
    }

    public final C2345h e(C6798l lVar) {
        return o(new a(lVar));
    }

    public float getDensity() {
        return this.f24702a.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.f24702a.getLayoutDirection();
    }

    public final C2345h o(C6798l lVar) {
        C2345h hVar = new C2345h(lVar);
        this.f24703b = hVar;
        return hVar;
    }

    public final void p(C2339b bVar) {
        this.f24702a = bVar;
    }

    public float r1() {
        return this.f24702a.getDensity().r1();
    }

    public final void s(C2602c cVar) {
        this.f24704c = cVar;
    }

    public final void u(C2345h hVar) {
        this.f24703b = hVar;
    }

    public final void x(C6787a aVar) {
        this.f24705d = aVar;
    }
}
