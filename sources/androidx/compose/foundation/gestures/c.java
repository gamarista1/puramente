package androidx.compose.foundation.gestures;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import androidx.compose.foundation.gestures.a;
import c1.y;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import x.C2848L;
import yf.C6798l;
import yf.p;
import yf.q;
import z.k;
import z.m;

public final class c extends b {

    /* renamed from: A  reason: collision with root package name */
    private boolean f12651A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public q f12652B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public q f12653C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f12654D;

    /* renamed from: y  reason: collision with root package name */
    private m f12655y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public z.q f12656z;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12657a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f12659c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f12660d;

        /* renamed from: androidx.compose.foundation.gestures.c$a$a  reason: collision with other inner class name */
        static final class C0238a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f12661a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f12662b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0238a(k kVar, c cVar) {
                super(1);
                this.f12661a = kVar;
                this.f12662b = cVar;
            }

            public final void a(a.b bVar) {
                this.f12661a.a(z.l.j(this.f12662b.S2(bVar.a()), this.f12662b.f12656z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, c cVar, C6658d dVar) {
            super(2, dVar);
            this.f12659c = pVar;
            this.f12660d = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f12659c, this.f12660d, dVar);
            aVar.f12658b = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(k kVar, C6658d dVar) {
            return ((a) create(kVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12657a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f12659c;
                C0238a aVar = new C0238a((k) this.f12658b, this.f12660d);
                this.f12657a = 1;
                if (pVar.invoke(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12663a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12664b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f12665c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f12666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f12665c = cVar;
            this.f12666d = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f12665c, this.f12666d, dVar);
            bVar.f12664b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12663a;
            if (i10 == 0) {
                w.b(obj);
                q M22 = this.f12665c.f12652B;
                C2421g d10 = C2421g.d(this.f12666d);
                this.f12663a = 1;
                if (M22.invoke((K) this.f12664b, d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.c$c  reason: collision with other inner class name */
    static final class C0239c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12667a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f12669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f12670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0239c(c cVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f12669c = cVar;
            this.f12670d = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            C0239c cVar = new C0239c(this.f12669c, this.f12670d, dVar);
            cVar.f12668b = obj;
            return cVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0239c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12667a;
            if (i10 == 0) {
                w.b(obj);
                q N22 = this.f12669c.f12653C;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(z.l.k(this.f12669c.R2(this.f12670d), this.f12669c.f12656z));
                this.f12667a = 1;
                if (N22.invoke((K) this.f12668b, b10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public c(m mVar, C6798l lVar, z.q qVar, boolean z10, B.l lVar2, boolean z11, q qVar2, q qVar3, boolean z12) {
        super(lVar, z10, lVar2, qVar);
        this.f12655y = mVar;
        this.f12656z = qVar;
        this.f12651A = z11;
        this.f12652B = qVar2;
        this.f12653C = qVar3;
        this.f12654D = z12;
    }

    /* access modifiers changed from: private */
    public final long R2(long j10) {
        float f10;
        if (this.f12654D) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        return y.m(j10, f10);
    }

    /* access modifiers changed from: private */
    public final long S2(long j10) {
        float f10;
        if (this.f12654D) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        return C2421g.s(j10, f10);
    }

    public Object A2(p pVar, C6658d dVar) {
        Object a10 = this.f12655y.a(C2848L.UserInput, new a(pVar, this, (C6658d) null), dVar);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    public void E2(long j10) {
        if (S1() && !C6496s.c(this.f12652B, z.l.f29016a)) {
            C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new b(this, j10, (C6658d) null), 3, (Object) null);
        }
    }

    public void F2(long j10) {
        if (S1() && !C6496s.c(this.f12653C, z.l.f29017b)) {
            C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new C0239c(this, j10, (C6658d) null), 3, (Object) null);
        }
    }

    public boolean J2() {
        return this.f12651A;
    }

    public final void T2(m mVar, C6798l lVar, z.q qVar, boolean z10, B.l lVar2, boolean z11, q qVar2, q qVar3, boolean z12) {
        boolean z13;
        boolean z14;
        q qVar4;
        m mVar2 = mVar;
        z.q qVar5 = qVar;
        boolean z15 = z12;
        if (!C6496s.c(this.f12655y, mVar)) {
            this.f12655y = mVar2;
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f12656z != qVar5) {
            this.f12656z = qVar5;
            z13 = true;
        }
        if (this.f12654D != z15) {
            this.f12654D = z15;
            qVar4 = qVar2;
            z14 = true;
        } else {
            z14 = z13;
            qVar4 = qVar2;
        }
        this.f12652B = qVar4;
        this.f12653C = qVar3;
        this.f12651A = z11;
        L2(lVar, z10, lVar2, qVar, z14);
    }
}
