package z;

import Ug.K;
import Ug.L;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import x.C2850N;
import yf.C6798l;
import yf.p;

/* renamed from: z.g  reason: case insensitive filesystem */
final class C2949g implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f28939a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f28940b = new b(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2850N f28941c = new C2850N();

    /* renamed from: z.g$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2949g f28943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2848L f28944c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f28945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2949g gVar, C2848L l10, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f28943b = gVar;
            this.f28944c = l10;
            this.f28945d = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f28943b, this.f28944c, this.f28945d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28942a;
            if (i10 == 0) {
                w.b(obj);
                C2850N c10 = this.f28943b.f28941c;
                k b10 = this.f28943b.f28940b;
                C2848L l10 = this.f28944c;
                p pVar = this.f28945d;
                this.f28942a = 1;
                if (c10.d(b10, l10, pVar, this) == f10) {
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

    /* renamed from: z.g$b */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2949g f28946a;

        b(C2949g gVar) {
            this.f28946a = gVar;
        }

        public void a(float f10) {
            this.f28946a.d().invoke(Float.valueOf(f10));
        }
    }

    public C2949g(C6798l lVar) {
        this.f28939a = lVar;
    }

    public Object a(C2848L l10, p pVar, C6658d dVar) {
        Object e10 = L.e(new a(this, l10, pVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final C6798l d() {
        return this.f28939a;
    }
}
