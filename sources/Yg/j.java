package Yg;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.r;
import Wg.t;
import Xg.C5694f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.p;

public final class j extends e {

    /* renamed from: d  reason: collision with root package name */
    private final Iterable f66816d;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5694f f66818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f66819c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5694f fVar, x xVar, C6658d dVar) {
            super(2, dVar);
            this.f66818b = fVar;
            this.f66819c = xVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f66818b, this.f66819c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66817a;
            if (i10 == 0) {
                w.b(obj);
                C5694f fVar = this.f66818b;
                x xVar = this.f66819c;
                this.f66817a = 1;
                if (fVar.collect(xVar, this) == f10) {
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Iterable iterable, g gVar, int i10, Wg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? h.f72645a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Wg.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    public Object i(r rVar, C6658d dVar) {
        x xVar = new x(rVar);
        for (C5694f aVar : this.f66816d) {
            C5600w0 unused = C5576k.d(rVar, (g) null, (M) null, new a(aVar, xVar, (C6658d) null), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public e j(g gVar, int i10, Wg.a aVar) {
        return new j(this.f66816d, gVar, i10, aVar);
    }

    public t n(K k10) {
        return Wg.p.c(k10, this.f66783a, this.f66784b, l());
    }

    public j(Iterable iterable, g gVar, int i10, Wg.a aVar) {
        super(gVar, i10, aVar);
        this.f66816d = iterable;
    }
}
