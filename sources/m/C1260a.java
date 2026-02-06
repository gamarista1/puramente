package M;

import H0.C1197s;
import K.c;
import M.q0;
import Q0.L;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import W0.C1450s;
import W0.I;
import W0.Q;
import Wg.a;
import Xg.C5695g;
import Xg.D;
import Xg.w;
import Y.C1495j0;
import androidx.compose.ui.platform.O0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import q0.C2423i;
import qf.C6658d;
import qf.g;
import r0.M1;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: M.a  reason: case insensitive filesystem */
public final class C1260a extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private C5600w0 f4182b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public s0 f4183c;

    /* renamed from: d  reason: collision with root package name */
    private w f4184d;

    /* renamed from: M.a$a  reason: collision with other inner class name */
    static final class C0099a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f4185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1260a f4186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1450s f4187c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f4188d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f4189e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0099a(Q q10, C1260a aVar, C1450s sVar, C6798l lVar, C6798l lVar2) {
            super(1);
            this.f4185a = q10;
            this.f4186b = aVar;
            this.f4187c = sVar;
            this.f4188d = lVar;
            this.f4189e = lVar2;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f4185a, this.f4186b.i(), this.f4187c, this.f4188d, this.f4189e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s0) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public final w p() {
        w wVar = this.f4184d;
        if (wVar != null) {
            return wVar;
        }
        if (!c.a()) {
            return null;
        }
        w b10 = D.b(1, 0, a.DROP_LATEST, 2, (Object) null);
        this.f4184d = b10;
        return b10;
    }

    private final void q(C6798l lVar) {
        q0.a i10 = i();
        if (i10 != null) {
            this.f4182b = i10.U0(new b(lVar, this, i10, (C6658d) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void r(q0.a aVar, float[] fArr) {
        C1197s x02 = aVar.x0();
        if (x02 != null) {
            if (!x02.G()) {
                x02 = null;
            }
            if (x02 != null) {
                x02.q0(fArr);
            }
        }
    }

    public void a() {
        q((C6798l) null);
    }

    public void b(C2423i iVar) {
        s0 s0Var = this.f4183c;
        if (s0Var != null) {
            s0Var.j(iVar);
        }
    }

    public void c(Q q10, C1450s sVar, C6798l lVar, C6798l lVar2) {
        q(new C0099a(q10, this, sVar, lVar, lVar2));
    }

    public void d() {
        C5600w0 w0Var = this.f4182b;
        if (w0Var != null) {
            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f4182b = null;
        w p10 = p();
        if (p10 != null) {
            p10.h();
        }
    }

    public void e(Q q10, I i10, L l10, C6798l lVar, C2423i iVar, C2423i iVar2) {
        s0 s0Var = this.f4183c;
        if (s0Var != null) {
            s0Var.n(q10, i10, l10, iVar, iVar2);
        }
    }

    public void h(Q q10, Q q11) {
        s0 s0Var = this.f4183c;
        if (s0Var != null) {
            s0Var.m(q10, q11);
        }
    }

    public void k() {
        w p10 = p();
        if (p10 != null) {
            p10.b(C6514M.f71813a);
        }
    }

    /* renamed from: M.a$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4190a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4191b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f4192c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1260a f4193d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q0.a f4194e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6798l lVar, C1260a aVar, q0.a aVar2, C6658d dVar) {
            super(2, dVar);
            this.f4192c = lVar;
            this.f4193d = aVar;
            this.f4194e = aVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f4192c, this.f4193d, this.f4194e, dVar);
            bVar.f4191b = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(O0 o02, C6658d dVar) {
            return ((b) create(o02, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4190a;
            if (i10 == 0) {
                lf.w.b(obj);
                C0100a aVar = new C0100a((O0) this.f4191b, this.f4192c, this.f4193d, this.f4194e, (C6658d) null);
                this.f4190a = 1;
                if (Ug.L.e(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lf.w.b(obj);
            }
            throw new C6527k();
        }

        /* renamed from: M.a$b$a  reason: collision with other inner class name */
        static final class C0100a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f4195a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f4196b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O0 f4197c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6798l f4198d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C1260a f4199e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ q0.a f4200f;

            /* renamed from: M.a$b$a$b  reason: collision with other inner class name */
            /* synthetic */ class C0104b extends C6494p implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ q0.a f4206a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0104b(q0.a aVar) {
                    super(1, C6496s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f4206a = aVar;
                }

                public final void i(float[] fArr) {
                    C1260a.r(this.f4206a, fArr);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    i(((M1) obj).r());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0100a(O0 o02, C6798l lVar, C1260a aVar, q0.a aVar2, C6658d dVar) {
                super(2, dVar);
                this.f4197c = o02;
                this.f4198d = lVar;
                this.f4199e = aVar;
                this.f4200f = aVar2;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0100a aVar = new C0100a(this.f4197c, this.f4198d, this.f4199e, this.f4200f, dVar);
                aVar.f4196b = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0100a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f4195a;
                if (i10 == 0) {
                    lf.w.b(obj);
                    K k10 = (K) this.f4196b;
                    l0 l0Var = (l0) r0.c().invoke(this.f4197c.a());
                    s0 s0Var = new s0(this.f4197c.a(), new C0104b(this.f4200f), l0Var);
                    if (c.a()) {
                        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new C0101a(this.f4199e, l0Var, (C6658d) null), 3, (Object) null);
                    }
                    C6798l lVar = this.f4198d;
                    if (lVar != null) {
                        lVar.invoke(s0Var);
                    }
                    this.f4199e.f4183c = s0Var;
                    O0 o02 = this.f4197c;
                    this.f4195a = 1;
                    if (o02.b(s0Var, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    try {
                        lf.w.b(obj);
                    } catch (Throwable th2) {
                        this.f4199e.f4183c = null;
                        throw th2;
                    }
                }
                throw new C6527k();
            }

            /* renamed from: M.a$b$a$a  reason: collision with other inner class name */
            static final class C0101a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f4201a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1260a f4202b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ l0 f4203c;

                /* renamed from: M.a$b$a$a$b  reason: collision with other inner class name */
                static final class C0103b implements C5695g {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ l0 f4205a;

                    C0103b(l0 l0Var) {
                        this.f4205a = l0Var;
                    }

                    /* renamed from: a */
                    public final Object emit(C6514M m10, C6658d dVar) {
                        this.f4205a.f();
                        return C6514M.f71813a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0101a(C1260a aVar, l0 l0Var, C6658d dVar) {
                    super(2, dVar);
                    this.f4202b = aVar;
                    this.f4203c = l0Var;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0101a(this.f4202b, this.f4203c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0101a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f4201a;
                    if (i10 == 0) {
                        lf.w.b(obj);
                        C0102a aVar = C0102a.f4204a;
                        this.f4201a = 1;
                        if (C1495j0.b(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        lf.w.b(obj);
                    } else if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        lf.w.b(obj);
                        throw new C6527k();
                    }
                    w m10 = this.f4202b.p();
                    if (m10 == null) {
                        return C6514M.f71813a;
                    }
                    C0103b bVar = new C0103b(this.f4203c);
                    this.f4201a = 2;
                    if (m10.collect(bVar, this) == f10) {
                        return f10;
                    }
                    throw new C6527k();
                }

                /* renamed from: M.a$b$a$a$a  reason: collision with other inner class name */
                static final class C0102a extends C6498u implements C6798l {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0102a f4204a = new C0102a();

                    C0102a() {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return C6514M.f71813a;
                    }

                    public final void a(long j10) {
                    }
                }
            }
        }
    }
}
