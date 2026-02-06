package retrofit2;

import Ug.C5582n;
import Ug.C5584o;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6528l;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;

public abstract class u {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6671d f72920a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6671d dVar) {
            super(1);
            this.f72920a = dVar;
        }

        public final void a(Throwable th2) {
            this.f72920a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final class b implements C6673f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f72921a;

        b(C5582n nVar) {
            this.f72921a = nVar;
        }

        public void onFailure(C6671d dVar, Throwable th2) {
            C6496s.h(dVar, "call");
            C6496s.h(th2, "t");
            C5582n nVar = this.f72921a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(w.a(th2)));
        }

        public void onResponse(C6671d dVar, F f10) {
            C6496s.h(dVar, "call");
            C6496s.h(f10, "response");
            if (f10.e()) {
                Object a10 = f10.a();
                if (a10 == null) {
                    Object k10 = dVar.request().k(t.class);
                    C6496s.e(k10);
                    t tVar = (t) k10;
                    Class b10 = tVar.b();
                    Method a11 = tVar.a();
                    C6528l lVar = new C6528l("Response from " + b10.getName() + '.' + a11.getName() + " was null but response body type was declared as non-null");
                    C5582n nVar = this.f72921a;
                    v.a aVar = v.f71841b;
                    nVar.resumeWith(v.b(w.a(lVar)));
                    return;
                }
                this.f72921a.resumeWith(v.b(a10));
                return;
            }
            C5582n nVar2 = this.f72921a;
            v.a aVar2 = v.f71841b;
            nVar2.resumeWith(v.b(w.a(new r(f10))));
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6671d f72922a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6671d dVar) {
            super(1);
            this.f72922a = dVar;
        }

        public final void a(Throwable th2) {
            this.f72922a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final class d implements C6673f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f72923a;

        d(C5582n nVar) {
            this.f72923a = nVar;
        }

        public void onFailure(C6671d dVar, Throwable th2) {
            C6496s.h(dVar, "call");
            C6496s.h(th2, "t");
            C5582n nVar = this.f72923a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(w.a(th2)));
        }

        public void onResponse(C6671d dVar, F f10) {
            C6496s.h(dVar, "call");
            C6496s.h(f10, "response");
            if (f10.e()) {
                C5582n nVar = this.f72923a;
                v.a aVar = v.f71841b;
                nVar.resumeWith(v.b(f10.a()));
                return;
            }
            C5582n nVar2 = this.f72923a;
            v.a aVar2 = v.f71841b;
            nVar2.resumeWith(v.b(w.a(new r(f10))));
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6671d f72924a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6671d dVar) {
            super(1);
            this.f72924a = dVar;
        }

        public final void a(Throwable th2) {
            this.f72924a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final class f implements C6673f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f72925a;

        f(C5582n nVar) {
            this.f72925a = nVar;
        }

        public void onFailure(C6671d dVar, Throwable th2) {
            C6496s.h(dVar, "call");
            C6496s.h(th2, "t");
            C5582n nVar = this.f72925a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(w.a(th2)));
        }

        public void onResponse(C6671d dVar, F f10) {
            C6496s.h(dVar, "call");
            C6496s.h(f10, "response");
            this.f72925a.resumeWith(v.b(f10));
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f72926a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f72927b;

        /* renamed from: c  reason: collision with root package name */
        int f72928c;

        g(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f72927b = obj;
            this.f72928c |= Integer.MIN_VALUE;
            return u.e((Throwable) null, this);
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6658d f72929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f72930b;

        h(C6658d dVar, Throwable th2) {
            this.f72929a = dVar;
            this.f72930b = th2;
        }

        public final void run() {
            C6658d c10 = C6680b.c(this.f72929a);
            v.a aVar = v.f71841b;
            c10.resumeWith(v.b(w.a(this.f72930b)));
        }
    }

    public static final Object a(C6671d dVar, C6658d dVar2) {
        C5584o oVar = new C5584o(C6680b.c(dVar2), 1);
        oVar.E();
        oVar.s(new a(dVar));
        dVar.enqueue(new b(oVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return v10;
    }

    public static final Object b(C6671d dVar, C6658d dVar2) {
        C5584o oVar = new C5584o(C6680b.c(dVar2), 1);
        oVar.E();
        oVar.s(new c(dVar));
        dVar.enqueue(new d(oVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return v10;
    }

    public static final Object c(C6671d dVar, C6658d dVar2) {
        C5584o oVar = new C5584o(C6680b.c(dVar2), 1);
        oVar.E();
        oVar.s(new e(dVar));
        dVar.enqueue(new f(oVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return v10;
    }

    public static final Object d(C6671d dVar, C6658d dVar2) {
        C6496s.f(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, dVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.Throwable r4, qf.C6658d r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.u.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.u$g r0 = (retrofit2.u.g) r0
            int r1 = r0.f72928c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f72928c = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.u$g r0 = new retrofit2.u$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f72927b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f72928c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.f72926a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            lf.w.b(r5)
            goto L_0x005c
        L_0x0035:
            lf.w.b(r5)
            r0.f72926a = r4
            r0.f72928c = r3
            Ug.G r5 = Ug.Z.a()
            qf.g r2 = r0.getContext()
            retrofit2.u$h r3 = new retrofit2.u$h
            r3.<init>(r0, r4)
            r5.z1(r2, r3)
            java.lang.Object r4 = rf.C6680b.f()
            java.lang.Object r5 = rf.C6680b.f()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            lf.k r4 = new lf.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.u.e(java.lang.Throwable, qf.d):java.lang.Object");
    }
}
