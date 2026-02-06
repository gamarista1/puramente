package n0;

import J0.A0;
import J0.B0;
import J0.C0;
import J0.C1245k;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import yf.C6798l;

/* renamed from: n0.e  reason: case insensitive filesystem */
public final class C2232e extends i.c implements B0, C2231d {

    /* renamed from: r  reason: collision with root package name */
    public static final a f24397r = new a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f24398s = 8;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C6798l f24399n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f24400o = a.C0413a.f24403a;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public C2231d f24401p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public C2234g f24402q;

    /* renamed from: n0.e$a */
    public static final class a {

        /* renamed from: n0.e$a$a  reason: collision with other inner class name */
        private static final class C0413a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0413a f24403a = new C0413a();

            private C0413a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: n0.e$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2229b f24404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2232e f24405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f24406c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2229b bVar, C2232e eVar, J j10) {
            super(1);
            this.f24404a = bVar;
            this.f24405b = eVar;
            this.f24406c = j10;
        }

        /* renamed from: a */
        public final A0 invoke(C2232e eVar) {
            boolean z10;
            boolean z11;
            if (!eVar.S1()) {
                return A0.SkipSubtreeAndContinueTraversal;
            }
            boolean z12 = false;
            if (eVar.f24402q == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            eVar.f24402q = (C2234g) eVar.f24399n.invoke(this.f24404a);
            if (eVar.f24402q != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                C1245k.n(this.f24405b).getDragAndDropManager().a(eVar);
            }
            J j10 = this.f24406c;
            if (j10.f71755a || z11) {
                z12 = true;
            }
            j10.f71755a = z12;
            return A0.ContinueTraversal;
        }
    }

    /* renamed from: n0.e$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2229b f24407a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2229b bVar) {
            super(1);
            this.f24407a = bVar;
        }

        /* renamed from: a */
        public final A0 invoke(C2232e eVar) {
            if (!eVar.v0().S1()) {
                return A0.SkipSubtreeAndContinueTraversal;
            }
            C2234g n22 = eVar.f24402q;
            if (n22 != null) {
                n22.o0(this.f24407a);
            }
            eVar.f24402q = null;
            eVar.f24401p = null;
            return A0.ContinueTraversal;
        }
    }

    /* renamed from: n0.e$d */
    public static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f24408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2232e f24409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2229b f24410c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N n10, C2232e eVar, C2229b bVar) {
            super(1);
            this.f24408a = n10;
            this.f24409b = eVar;
            this.f24410c = bVar;
        }

        /* renamed from: a */
        public final A0 invoke(B0 b02) {
            C2232e eVar = (C2232e) b02;
            if (!C1245k.n(this.f24409b).getDragAndDropManager().b(eVar) || !C2233f.d(eVar, C2236i.a(this.f24410c))) {
                return A0.ContinueTraversal;
            }
            this.f24408a.f71759a = b02;
            return A0.CancelTraversal;
        }
    }

    public C2232e(C6798l lVar) {
        this.f24399n = lVar;
    }

    public Object L() {
        return this.f24400o;
    }

    public void R0(C2229b bVar) {
        C2231d dVar;
        B0 b02;
        C2231d dVar2 = this.f24401p;
        if (dVar2 == null || !C2233f.d(dVar2, C2236i.a(bVar))) {
            if (!v0().S1()) {
                b02 = null;
            } else {
                N n10 = new N();
                C0.f(this, new d(n10, this, bVar));
                b02 = (B0) n10.f71759a;
            }
            dVar = (C2231d) b02;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            C2233f.e(dVar, bVar);
            C2234g gVar = this.f24402q;
            if (gVar != null) {
                gVar.t0(bVar);
            }
        } else if (dVar == null && dVar2 != null) {
            C2234g gVar2 = this.f24402q;
            if (gVar2 != null) {
                C2233f.e(gVar2, bVar);
            }
            dVar2.t0(bVar);
        } else if (!C6496s.c(dVar, dVar2)) {
            if (dVar != null) {
                C2233f.e(dVar, bVar);
            }
            if (dVar2 != null) {
                dVar2.t0(bVar);
            }
        } else if (dVar != null) {
            dVar.R0(bVar);
        } else {
            C2234g gVar3 = this.f24402q;
            if (gVar3 != null) {
                gVar3.R0(bVar);
            }
        }
        this.f24401p = dVar;
    }

    public void S0(C2229b bVar) {
        C2234g gVar = this.f24402q;
        if (gVar == null) {
            C2231d dVar = this.f24401p;
            if (dVar != null) {
                dVar.S0(bVar);
                return;
            }
            return;
        }
        gVar.S0(bVar);
    }

    public boolean T(C2229b bVar) {
        C2231d dVar = this.f24401p;
        if (dVar != null) {
            return dVar.T(bVar);
        }
        C2234g gVar = this.f24402q;
        if (gVar != null) {
            return gVar.T(bVar);
        }
        return false;
    }

    public void W1() {
        this.f24402q = null;
        this.f24401p = null;
    }

    public boolean l2(C2229b bVar) {
        J j10 = new J();
        C2233f.f(this, new b(bVar, this, j10));
        return j10.f71755a;
    }

    public void n1(C2229b bVar) {
        C2234g gVar = this.f24402q;
        if (gVar == null) {
            C2231d dVar = this.f24401p;
            if (dVar != null) {
                dVar.n1(bVar);
                return;
            }
            return;
        }
        gVar.n1(bVar);
    }

    public void o0(C2229b bVar) {
        C2233f.f(this, new c(bVar));
    }

    public void t0(C2229b bVar) {
        C2234g gVar = this.f24402q;
        if (gVar != null) {
            gVar.t0(bVar);
        }
        C2231d dVar = this.f24401p;
        if (dVar != null) {
            dVar.t0(bVar);
        }
        this.f24401p = null;
    }
}
