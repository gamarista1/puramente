package w;

import Ef.m;
import Y.A1;
import Y.C1510r0;
import Y.o1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;

/* renamed from: w.a  reason: case insensitive filesystem */
public final class C2782a {

    /* renamed from: m  reason: collision with root package name */
    public static final int f27266m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final r0 f27267a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f27268b;

    /* renamed from: c  reason: collision with root package name */
    private final String f27269c;

    /* renamed from: d  reason: collision with root package name */
    private final C2799k f27270d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f27271e;

    /* renamed from: f  reason: collision with root package name */
    private final C1510r0 f27272f;

    /* renamed from: g  reason: collision with root package name */
    private final C2781Z f27273g;

    /* renamed from: h  reason: collision with root package name */
    private final C2795g0 f27274h;

    /* renamed from: i  reason: collision with root package name */
    private final C2805q f27275i;

    /* renamed from: j  reason: collision with root package name */
    private final C2805q f27276j;

    /* renamed from: k  reason: collision with root package name */
    private C2805q f27277k;

    /* renamed from: l  reason: collision with root package name */
    private C2805q f27278l;

    /* renamed from: w.a$a  reason: collision with other inner class name */
    static final class C0452a extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        Object f27279a;

        /* renamed from: b  reason: collision with root package name */
        Object f27280b;

        /* renamed from: c  reason: collision with root package name */
        int f27281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2782a f27282d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f27283e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2788d f27284f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f27285g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f27286h;

        /* renamed from: w.a$a$a  reason: collision with other inner class name */
        static final class C0453a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2782a f27287a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2799k f27288b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6798l f27289c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ J f27290d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0453a(C2782a aVar, C2799k kVar, C6798l lVar, J j10) {
                super(1);
                this.f27287a = aVar;
                this.f27288b = kVar;
                this.f27289c = lVar;
                this.f27290d = j10;
            }

            public final void a(C2796h hVar) {
                l0.o(hVar, this.f27287a.j());
                Object a10 = this.f27287a.h(hVar.e());
                if (!C6496s.c(a10, hVar.e())) {
                    this.f27287a.j().v(a10);
                    this.f27288b.v(a10);
                    C6798l lVar = this.f27289c;
                    if (lVar != null) {
                        lVar.invoke(this.f27287a);
                    }
                    hVar.a();
                    this.f27290d.f71755a = true;
                    return;
                }
                C6798l lVar2 = this.f27289c;
                if (lVar2 != null) {
                    lVar2.invoke(this.f27287a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2796h) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0452a(C2782a aVar, Object obj, C2788d dVar, long j10, C6798l lVar, C6658d dVar2) {
            super(1, dVar2);
            this.f27282d = aVar;
            this.f27283e = obj;
            this.f27284f = dVar;
            this.f27285g = j10;
            this.f27286h = lVar;
        }

        public final C6658d create(C6658d dVar) {
            return new C0452a(this.f27282d, this.f27283e, this.f27284f, this.f27285g, this.f27286h, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((C0452a) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C2799k kVar;
            J j10;
            C2790e eVar;
            Object f10 = C6680b.f();
            int i10 = this.f27281c;
            if (i10 == 0) {
                w.b(obj);
                this.f27282d.j().w((C2805q) this.f27282d.l().a().invoke(this.f27283e));
                this.f27282d.s(this.f27284f.g());
                this.f27282d.r(true);
                C2799k h10 = C2800l.h(this.f27282d.j(), (Object) null, (C2805q) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
                J j11 = new J();
                C2788d dVar = this.f27284f;
                long j12 = this.f27285g;
                C0453a aVar = new C0453a(this.f27282d, h10, this.f27286h, j11);
                this.f27279a = h10;
                this.f27280b = j11;
                this.f27281c = 1;
                if (l0.c(h10, dVar, j12, aVar, this) == f10) {
                    return f10;
                }
                kVar = h10;
                j10 = j11;
            } else if (i10 == 1) {
                j10 = (J) this.f27280b;
                kVar = (C2799k) this.f27279a;
                try {
                    w.b(obj);
                } catch (CancellationException e10) {
                    this.f27282d.i();
                    throw e10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (j10.f71755a) {
                eVar = C2790e.BoundReached;
            } else {
                eVar = C2790e.Finished;
            }
            this.f27282d.i();
            return new C2794g(kVar, eVar);
        }
    }

    /* renamed from: w.a$b */
    static final class b extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f27291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f27292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27293c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2782a aVar, Object obj, C6658d dVar) {
            super(1, dVar);
            this.f27292b = aVar;
            this.f27293c = obj;
        }

        public final C6658d create(C6658d dVar) {
            return new b(this.f27292b, this.f27293c, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((b) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f27291a == 0) {
                w.b(obj);
                this.f27292b.i();
                Object a10 = this.f27292b.h(this.f27293c);
                this.f27292b.j().v(a10);
                this.f27292b.s(a10);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: w.a$c */
    static final class c extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f27294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f27295b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2782a aVar, C6658d dVar) {
            super(1, dVar);
            this.f27295b = aVar;
        }

        public final C6658d create(C6658d dVar) {
            return new c(this.f27295b, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((c) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f27294a == 0) {
                w.b(obj);
                this.f27295b.i();
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C2782a(Object obj, r0 r0Var, Object obj2, String str) {
        C2805q qVar;
        C2805q qVar2;
        this.f27267a = r0Var;
        this.f27268b = obj2;
        this.f27269c = str;
        this.f27270d = new C2799k(r0Var, obj, (C2805q) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
        this.f27271e = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
        this.f27272f = u1.d(obj, (o1) null, 2, (Object) null);
        this.f27273g = new C2781Z();
        this.f27274h = new C2795g0(0.0f, 0.0f, obj2, 3, (DefaultConstructorMarker) null);
        C2805q o10 = o();
        if (o10 instanceof C2801m) {
            qVar = C2784b.f27300e;
        } else if (o10 instanceof C2802n) {
            qVar = C2784b.f27301f;
        } else if (o10 instanceof C2803o) {
            qVar = C2784b.f27302g;
        } else {
            qVar = C2784b.f27303h;
        }
        C6496s.f(qVar, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f27275i = qVar;
        C2805q o11 = o();
        if (o11 instanceof C2801m) {
            qVar2 = C2784b.f27296a;
        } else if (o11 instanceof C2802n) {
            qVar2 = C2784b.f27297b;
        } else if (o11 instanceof C2803o) {
            qVar2 = C2784b.f27298c;
        } else {
            qVar2 = C2784b.f27299d;
        }
        C6496s.f(qVar2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f27276j = qVar2;
        this.f27277k = qVar;
        this.f27278l = qVar2;
    }

    public static /* synthetic */ Object f(C2782a aVar, Object obj, C2797i iVar, Object obj2, C6798l lVar, C6658d dVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            iVar = aVar.f27274h;
        }
        C2797i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            obj2 = aVar.n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return aVar.e(obj, iVar2, obj4, lVar, dVar);
    }

    /* access modifiers changed from: private */
    public final Object h(Object obj) {
        if (C6496s.c(this.f27277k, this.f27275i) && C6496s.c(this.f27278l, this.f27276j)) {
            return obj;
        }
        C2805q qVar = (C2805q) this.f27267a.a().invoke(obj);
        int b10 = qVar.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < b10; i10++) {
            if (qVar.a(i10) < this.f27277k.a(i10) || qVar.a(i10) > this.f27278l.a(i10)) {
                qVar.e(i10, m.k(qVar.a(i10), this.f27277k.a(i10), this.f27278l.a(i10)));
                z10 = true;
            }
        }
        if (z10) {
            return this.f27267a.b().invoke(qVar);
        }
        return obj;
    }

    /* access modifiers changed from: private */
    public final void i() {
        C2799k kVar = this.f27270d;
        kVar.q().d();
        kVar.t(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(C2788d dVar, Object obj, C6798l lVar, C6658d dVar2) {
        return C2781Z.e(this.f27273g, (C2778W) null, new C0452a(this, obj, dVar, this.f27270d.k(), lVar, (C6658d) null), dVar2, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void r(boolean z10) {
        this.f27271e.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void s(Object obj) {
        this.f27272f.setValue(obj);
    }

    public final Object e(Object obj, C2797i iVar, Object obj2, C6798l lVar, C6658d dVar) {
        return q(C2792f.a(iVar, this.f27267a, m(), obj, obj2), obj2, lVar, dVar);
    }

    public final A1 g() {
        return this.f27270d;
    }

    public final C2799k j() {
        return this.f27270d;
    }

    public final Object k() {
        return this.f27272f.getValue();
    }

    public final r0 l() {
        return this.f27267a;
    }

    public final Object m() {
        return this.f27270d.getValue();
    }

    public final Object n() {
        return this.f27267a.b().invoke(o());
    }

    public final C2805q o() {
        return this.f27270d.q();
    }

    public final boolean p() {
        return ((Boolean) this.f27271e.getValue()).booleanValue();
    }

    public final Object t(Object obj, C6658d dVar) {
        Object e10 = C2781Z.e(this.f27273g, (C2778W) null, new b(this, obj, (C6658d) null), dVar, 1, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final Object u(C6658d dVar) {
        Object e10 = C2781Z.e(this.f27273g, (C2778W) null, new c(this, (C6658d) null), dVar, 1, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2782a(Object obj, r0 r0Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, r0Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
