package ie;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import ae.C4464a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import qe.C5155b;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.p;

/* renamed from: ie.d  reason: case insensitive filesystem */
public abstract class C5034d extends C5038h {

    /* renamed from: ie.d$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60811a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ie.m[] r0 = ie.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ie.m r1 = ie.m.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ie.m r1 = ie.m.MAIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f60811a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ie.C5034d.a.<clinit>():void");
        }
    }

    /* renamed from: ie.d$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f60812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f60813b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f60813b = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f60813b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f60812a == 0) {
                w.b(obj);
                this.f60813b.invoke();
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ie.d$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f60814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f60815b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f60815b = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f60815b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f60814a == 0) {
                w.b(obj);
                this.f60815b.invoke();
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5034d(String str, C5155b[] bVarArr) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
    }

    /* access modifiers changed from: private */
    public static final void p(WeakReference weakReference, String str, C5034d dVar, C4464a aVar, Object[] objArr, PromiseImpl promiseImpl) {
        C6496s.h(objArr, "args");
        C6496s.h(promiseImpl, "promiseImpl");
        dVar.s(aVar, new C5033c(promiseImpl, dVar, str, objArr, aVar));
    }

    /* access modifiers changed from: private */
    public static final C6514M q(PromiseImpl promiseImpl, C5034d dVar, String str, Object[] objArr, C4464a aVar) {
        CodedException codedException;
        CodedException unexpectedException;
        CodedException codedException2;
        try {
            dVar.r(objArr, promiseImpl, aVar);
            C6514M m10 = C6514M.f71813a;
        } catch (Throwable th2) {
            if (!promiseImpl.i()) {
                if (th2 instanceof CodedException) {
                    codedException = (CodedException) th2;
                } else {
                    if (th2 instanceof Od.a) {
                        Od.a aVar2 = th2;
                        String a10 = aVar2.a();
                        C6496s.g(a10, "getCode(...)");
                        unexpectedException = new CodedException(a10, aVar2.getMessage(), aVar2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException((Throwable) th2);
                    }
                    codedException = unexpectedException;
                }
                promiseImpl.g(codedException);
            } else {
                throw th2;
            }
        }
        return C6514M.f71813a;
    }

    private final void s(C4464a aVar, C6787a aVar2) {
        int i10 = a.f60811a[l().ordinal()];
        if (i10 == 1) {
            C5600w0 unused = C5576k.d(aVar.s(), (g) null, (M) null, new b(aVar2, (C6658d) null), 3, (Object) null);
        } else if (i10 == 2) {
            C5600w0 unused2 = C5576k.d(aVar.r(), (g) null, (M) null, new c(aVar2, (C6658d) null), 3, (Object) null);
        } else {
            throw new C6535s();
        }
    }

    public void a(C4464a aVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        C6496s.h(aVar, "appContext");
        C6496s.h(jSDecoratorsBridgingObject, "jsObject");
        C6496s.h(str, "moduleName");
        WeakReference a10 = ae.w.a(aVar);
        String f10 = f();
        boolean h10 = h();
        boolean i10 = i();
        C5155b[] e10 = e();
        ArrayList arrayList = new ArrayList(e10.length);
        for (C5155b e11 : e10) {
            arrayList.add(e11.e());
        }
        jSDecoratorsBridgingObject.registerAsyncFunction(f10, h10, i10, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C5032b(a10, str, this, aVar));
    }

    public abstract void r(Object[] objArr, ae.p pVar, C4464a aVar);
}
