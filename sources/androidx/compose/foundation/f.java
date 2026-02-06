package androidx.compose.foundation;

import D0.J;
import J0.s0;
import J0.x0;
import O0.g;
import O0.t;
import O0.v;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import x.C2845I;
import yf.C6787a;
import yf.C6798l;
import yf.q;
import z.C2938B;
import z.r;

final class f extends a implements s0 {

    /* renamed from: X  reason: collision with root package name */
    private String f12551X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public C6787a f12552Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public C6787a f12553Z;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12554a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f12554a = fVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            C6787a L22 = this.f12554a.f12552Y;
            if (L22 != null) {
                L22.invoke();
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12555a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.f12555a = fVar;
        }

        public final void a(long j10) {
            C6787a K22 = this.f12555a.f12553Z;
            if (K22 != null) {
                K22.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12556a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.f12556a = fVar;
        }

        public final void a(long j10) {
            C6787a L22 = this.f12556a.f12552Y;
            if (L22 != null) {
                L22.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f12557a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12558b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ long f12559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f12560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C6658d dVar) {
            super(3, dVar);
            this.f12560d = fVar;
        }

        public final Object i(r rVar, long j10, C6658d dVar) {
            d dVar2 = new d(this.f12560d, dVar);
            dVar2.f12558b = rVar;
            dVar2.f12559c = j10;
            return dVar2.invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((r) obj, ((C2421g) obj2).v(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12557a;
            if (i10 == 0) {
                w.b(obj);
                r rVar = (r) this.f12558b;
                long j10 = this.f12559c;
                if (this.f12560d.D2()) {
                    f fVar = this.f12560d;
                    this.f12557a = 1;
                    if (fVar.F2(rVar, j10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12561a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.f12561a = fVar;
        }

        public final void a(long j10) {
            if (this.f12561a.D2()) {
                this.f12561a.E2().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ f(C6787a aVar, String str, C6787a aVar2, C6787a aVar3, B.l lVar, C2845I i10, boolean z10, String str2, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, aVar2, aVar3, lVar, i10, z10, str2, gVar);
    }

    public void M2(C6787a aVar, String str, C6787a aVar2, C6787a aVar3, B.l lVar, C2845I i10, boolean z10, String str2, g gVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str3 = str;
        C6787a aVar4 = aVar2;
        C6787a aVar5 = aVar3;
        if (!C6496s.c(this.f12551X, str)) {
            this.f12551X = str3;
            x0.b(this);
        }
        boolean z16 = false;
        if (this.f12552Y == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (aVar4 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            A2();
            x0.b(this);
            z13 = true;
        } else {
            z13 = false;
        }
        this.f12552Y = aVar4;
        if (this.f12553Z == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (aVar5 == null) {
            z16 = true;
        }
        if (z14 != z16) {
            z13 = true;
        }
        this.f12553Z = aVar5;
        if (D2() != z10) {
            z15 = true;
        } else {
            z15 = z13;
        }
        J2(lVar, i10, z10, str2, gVar, aVar);
        if (z15) {
            H2();
        }
    }

    public void x2(v vVar) {
        if (this.f12552Y != null) {
            t.B(vVar, this.f12551X, new a(this));
        }
    }

    public Object y2(J j10, C6658d dVar) {
        b bVar;
        c cVar;
        if (!D2() || this.f12553Z == null) {
            bVar = null;
        } else {
            bVar = new b(this);
        }
        if (!D2() || this.f12552Y == null) {
            cVar = null;
        } else {
            cVar = new c(this);
        }
        Object i10 = C2938B.i(j10, bVar, cVar, new d(this, (C6658d) null), new e(this), dVar);
        if (i10 == C6680b.f()) {
            return i10;
        }
        return C6514M.f71813a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(C6787a aVar, String str, C6787a aVar2, C6787a aVar3, B.l lVar, C2845I i10, boolean z10, String str2, g gVar) {
        super(lVar, i10, z10, str2, gVar, aVar, (DefaultConstructorMarker) null);
        this.f12551X = str;
        this.f12552Y = aVar2;
        this.f12553Z = aVar3;
    }
}
