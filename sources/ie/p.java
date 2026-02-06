package ie;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import ae.C4464a;
import ae.w;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import qe.C5155b;
import qf.C6658d;
import qf.g;
import yf.q;

public final class p extends C5038h {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final q f60829h;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60830a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ie.m[] r0 = ie.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ie.m r1 = ie.m.MAIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ie.m r1 = ie.m.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f60830a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ie.p.a.<clinit>():void");
        }
    }

    static final class b extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        Object f60831a;

        /* renamed from: b  reason: collision with root package name */
        Object f60832b;

        /* renamed from: c  reason: collision with root package name */
        Object f60833c;

        /* renamed from: d  reason: collision with root package name */
        int f60834d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f60835e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PromiseImpl f60836f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f60837g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f60838h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object[] f60839i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4464a f60840j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PromiseImpl promiseImpl, p pVar, String str, Object[] objArr, C4464a aVar, C6658d dVar) {
            super(2, dVar);
            this.f60836f = promiseImpl;
            this.f60837g = pVar;
            this.f60838h = str;
            this.f60839i = objArr;
            this.f60840j = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f60836f, this.f60837g, this.f60838h, this.f60839i, this.f60840j, dVar);
            bVar.f60835e = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Od.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: Ug.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: expo.modules.kotlin.exception.CodedException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: expo.modules.kotlin.exception.CodedException} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r10.f60834d
                java.lang.String r2 = "getCode(...)"
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 != r3) goto L_0x0023
                java.lang.Object r0 = r10.f60833c
                expo.modules.kotlin.jni.PromiseImpl r0 = (expo.modules.kotlin.jni.PromiseImpl) r0
                java.lang.Object r1 = r10.f60832b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r10.f60831a
                ie.p r3 = (ie.p) r3
                java.lang.Object r4 = r10.f60835e
                Ug.K r4 = (Ug.K) r4
                lf.w.b(r11)     // Catch:{ all -> 0x0021 }
                goto L_0x005a
            L_0x0021:
                r11 = move-exception
                goto L_0x006a
            L_0x0023:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x002b:
                lf.w.b(r11)
                java.lang.Object r11 = r10.f60835e
                r4 = r11
                Ug.K r4 = (Ug.K) r4
                ie.p r11 = r10.f60837g     // Catch:{ all -> 0x0090 }
                java.lang.String r1 = r10.f60838h     // Catch:{ all -> 0x0090 }
                java.lang.Object[] r5 = r10.f60839i     // Catch:{ all -> 0x0090 }
                ae.a r6 = r10.f60840j     // Catch:{ all -> 0x0090 }
                expo.modules.kotlin.jni.PromiseImpl r7 = r10.f60836f     // Catch:{ all -> 0x0090 }
                yf.q r8 = r11.f60829h     // Catch:{ all -> 0x0067 }
                java.lang.Object[] r5 = r11.b(r5, r6)     // Catch:{ all -> 0x0067 }
                r10.f60835e = r4     // Catch:{ all -> 0x0067 }
                r10.f60831a = r11     // Catch:{ all -> 0x0067 }
                r10.f60832b = r1     // Catch:{ all -> 0x0067 }
                r10.f60833c = r7     // Catch:{ all -> 0x0067 }
                r10.f60834d = r3     // Catch:{ all -> 0x0067 }
                java.lang.Object r3 = r8.invoke(r4, r5, r10)     // Catch:{ all -> 0x0067 }
                if (r3 != r0) goto L_0x0056
                return r0
            L_0x0056:
                r0 = r7
                r9 = r3
                r3 = r11
                r11 = r9
            L_0x005a:
                boolean r4 = Ug.L.g(r4)     // Catch:{ all -> 0x0021 }
                if (r4 == 0) goto L_0x0063
                r0.resolve(r11)     // Catch:{ all -> 0x0021 }
            L_0x0063:
                lf.M r11 = lf.C6514M.f71813a     // Catch:{ all -> 0x0021 }
                goto L_0x00db
            L_0x0067:
                r0 = move-exception
                r3 = r11
                r11 = r0
            L_0x006a:
                boolean r0 = r11 instanceof expo.modules.kotlin.exception.CodedException     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x0098
                boolean r0 = r11 instanceof Od.a     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x0092
                expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException     // Catch:{ all -> 0x0090 }
                r4 = r11
                Od.a r4 = (Od.a) r4     // Catch:{ all -> 0x0090 }
                java.lang.String r4 = r4.a()     // Catch:{ all -> 0x0090 }
                kotlin.jvm.internal.C6496s.g(r4, r2)     // Catch:{ all -> 0x0090 }
                r5 = r11
                Od.a r5 = (Od.a) r5     // Catch:{ all -> 0x0090 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0090 }
                Od.a r11 = (Od.a) r11     // Catch:{ all -> 0x0090 }
                java.lang.Throwable r11 = r11.getCause()     // Catch:{ all -> 0x0090 }
                r0.<init>(r4, r5, r11)     // Catch:{ all -> 0x0090 }
                goto L_0x009b
            L_0x0090:
                r11 = move-exception
                goto L_0x00a5
            L_0x0092:
                expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException     // Catch:{ all -> 0x0090 }
                r0.<init>((java.lang.Throwable) r11)     // Catch:{ all -> 0x0090 }
                goto L_0x009b
            L_0x0098:
                r0 = r11
                expo.modules.kotlin.exception.CodedException r0 = (expo.modules.kotlin.exception.CodedException) r0     // Catch:{ all -> 0x0090 }
            L_0x009b:
                expo.modules.kotlin.exception.l r11 = new expo.modules.kotlin.exception.l     // Catch:{ all -> 0x0090 }
                java.lang.String r3 = r3.f()     // Catch:{ all -> 0x0090 }
                r11.<init>(r3, r1, r0)     // Catch:{ all -> 0x0090 }
                throw r11     // Catch:{ all -> 0x0090 }
            L_0x00a5:
                expo.modules.kotlin.jni.PromiseImpl r0 = r10.f60836f
                boolean r0 = r0.i()
                if (r0 != 0) goto L_0x00de
                expo.modules.kotlin.jni.PromiseImpl r0 = r10.f60836f
                boolean r1 = r11 instanceof expo.modules.kotlin.exception.CodedException
                if (r1 == 0) goto L_0x00b6
                expo.modules.kotlin.exception.CodedException r11 = (expo.modules.kotlin.exception.CodedException) r11
                goto L_0x00d8
            L_0x00b6:
                boolean r1 = r11 instanceof Od.a
                if (r1 == 0) goto L_0x00d2
                expo.modules.kotlin.exception.CodedException r1 = new expo.modules.kotlin.exception.CodedException
                Od.a r11 = (Od.a) r11
                java.lang.String r3 = r11.a()
                kotlin.jvm.internal.C6496s.g(r3, r2)
                java.lang.String r2 = r11.getMessage()
                java.lang.Throwable r11 = r11.getCause()
                r1.<init>(r3, r2, r11)
            L_0x00d0:
                r11 = r1
                goto L_0x00d8
            L_0x00d2:
                expo.modules.kotlin.exception.UnexpectedException r1 = new expo.modules.kotlin.exception.UnexpectedException
                r1.<init>((java.lang.Throwable) r11)
                goto L_0x00d0
            L_0x00d8:
                r0.g(r11)
            L_0x00db:
                lf.M r11 = lf.C6514M.f71813a
                return r11
            L_0x00de:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ie.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(String str, C5155b[] bVarArr, q qVar) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
        C6496s.h(qVar, "body");
        this.f60829h = qVar;
    }

    /* access modifiers changed from: private */
    public static final void p(WeakReference weakReference, String str, p pVar, C4464a aVar, Object[] objArr, PromiseImpl promiseImpl) {
        K r10;
        C6496s.h(objArr, "args");
        C6496s.h(promiseImpl, "promiseImpl");
        int i10 = a.f60830a[pVar.l().ordinal()];
        if (i10 == 1) {
            r10 = aVar.r();
        } else if (i10 == 2) {
            r10 = aVar.s();
        } else {
            throw new C6535s();
        }
        C5600w0 unused = C5576k.d(r10, (g) null, (M) null, new b(promiseImpl, pVar, str, objArr, aVar, (C6658d) null), 3, (Object) null);
    }

    public void a(C4464a aVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        C6496s.h(aVar, "appContext");
        C6496s.h(jSDecoratorsBridgingObject, "jsObject");
        C6496s.h(str, "moduleName");
        WeakReference a10 = w.a(aVar);
        String f10 = f();
        boolean h10 = h();
        boolean i10 = i();
        C5155b[] e10 = e();
        ArrayList arrayList = new ArrayList(e10.length);
        for (C5155b e11 : e10) {
            arrayList.add(e11.e());
        }
        jSDecoratorsBridgingObject.registerAsyncFunction(f10, h10, i10, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new o(a10, str, this, aVar));
    }
}
