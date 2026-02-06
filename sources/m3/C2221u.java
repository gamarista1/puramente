package m3;

import Ug.K;
import Xg.C5695g;
import Xg.C5696h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import m3.C2224x;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;
import yf.q;

/* renamed from: m3.u  reason: case insensitive filesystem */
final class C2221u {

    /* renamed from: a  reason: collision with root package name */
    private final K f24112a;

    /* renamed from: b  reason: collision with root package name */
    private final C2201F f24113b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2203b f24114c;

    /* renamed from: m3.u$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24115a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2221u f24116b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2221u uVar, C6658d dVar) {
            super(2, dVar);
            this.f24116b = uVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f24116b, dVar);
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            int i10 = this.f24115a;
            if (i10 == 0) {
                w.b(obj);
                this.f24116b.d();
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.u$b */
    static final class b extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f24117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2221u f24118b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2221u uVar, C6658d dVar) {
            super(3, dVar);
            this.f24118b = uVar;
        }

        /* renamed from: i */
        public final Object invoke(C5695g gVar, Throwable th2, C6658d dVar) {
            return new b(this.f24118b, dVar).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            int i10 = this.f24117a;
            if (i10 == 0) {
                w.b(obj);
                this.f24118b.d();
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.u$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2221u f24119a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2221u uVar) {
            super(0);
            this.f24119a = uVar;
        }

        /* renamed from: a */
        public final C2224x.b invoke() {
            return this.f24119a.f24114c.f();
        }
    }

    public C2221u(K k10, C2201F f10, C2202a aVar) {
        C6496s.h(k10, "scope");
        C6496s.h(f10, "parent");
        this.f24112a = k10;
        this.f24113b = f10;
        this.f24114c = new C2203b(f10.d(), k10);
    }

    public final C2201F b() {
        return new C2201F(C5696h.F(C5696h.H(this.f24114c.g(), new a(this, (C6658d) null)), new b(this, (C6658d) null)), this.f24113b.f(), this.f24113b.e(), new c(this));
    }

    public final Object c(C6658d dVar) {
        this.f24114c.e();
        return C6514M.f71813a;
    }

    public final C2202a d() {
        return null;
    }
}
