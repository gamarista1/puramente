package ch;

import Ug.C5559b0;
import Ug.C5580m;
import Ug.C5582n;
import Ug.C5584o;
import Ug.C5588q;
import Ug.i1;
import Zg.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: ch.i  reason: case insensitive filesystem */
public class C5810i implements C5580m, C5804c, C5811j, i1 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67370f = AtomicReferenceFieldUpdater.newUpdater(C5810i.class, Object.class, "state$volatile");

    /* renamed from: a  reason: collision with root package name */
    private final g f67371a;

    /* renamed from: b  reason: collision with root package name */
    private List f67372b = new ArrayList(2);

    /* renamed from: c  reason: collision with root package name */
    private Object f67373c;

    /* renamed from: d  reason: collision with root package name */
    private int f67374d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object f67375e = C5812k.f67393e;
    private volatile /* synthetic */ Object state$volatile = C5812k.f67390b;

    /* renamed from: ch.i$a */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f67376a;

        /* renamed from: b  reason: collision with root package name */
        private final q f67377b;

        /* renamed from: c  reason: collision with root package name */
        private final q f67378c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f67379d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f67380e;

        /* renamed from: f  reason: collision with root package name */
        public final q f67381f;

        /* renamed from: g  reason: collision with root package name */
        public Object f67382g;

        /* renamed from: h  reason: collision with root package name */
        public int f67383h = -1;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.f67376a = obj;
            this.f67377b = qVar;
            this.f67378c = qVar2;
            this.f67379d = obj2;
            this.f67380e = obj3;
            this.f67381f = qVar3;
        }

        public final C6798l a(C5811j jVar, Object obj) {
            q qVar = this.f67381f;
            if (qVar != null) {
                return (C6798l) qVar.invoke(jVar, this.f67379d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f67382g;
            C5810i iVar = C5810i.this;
            C5559b0 b0Var = null;
            if (obj instanceof D) {
                ((D) obj).s(this.f67383h, (Throwable) null, iVar.getContext());
                return;
            }
            if (obj instanceof C5559b0) {
                b0Var = (C5559b0) obj;
            }
            if (b0Var != null) {
                b0Var.dispose();
            }
        }

        public final Object c(Object obj, C6658d dVar) {
            Object obj2 = this.f67380e;
            if (this.f67379d == C5812k.i()) {
                C6496s.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((C6798l) obj2).invoke(dVar);
            }
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, dVar);
        }

        public final Object d(Object obj) {
            return this.f67378c.invoke(this.f67376a, this.f67379d, obj);
        }

        public final boolean e(C5810i iVar) {
            this.f67377b.invoke(this.f67376a, iVar, this.f67379d);
            if (iVar.f67375e == C5812k.f67393e) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ch.i$b */
    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f67385a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f67386b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5810i f67387c;

        /* renamed from: d  reason: collision with root package name */
        int f67388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5810i iVar, C6658d dVar) {
            super(dVar);
            this.f67387c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f67386b = obj;
            this.f67388d |= Integer.MIN_VALUE;
            return this.f67387c.q(this);
        }
    }

    public C5810i(g gVar) {
        this.f67371a = gVar;
    }

    private final void l(Object obj) {
        List list = this.f67372b;
        C6496s.e(list);
        Iterable<a> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (a aVar : iterable) {
                if (aVar.f67376a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    private final void m(a aVar) {
        List<a> list = this.f67372b;
        if (list != null) {
            for (a aVar2 : list) {
                if (aVar2 != aVar) {
                    aVar2.b();
                }
            }
            f67370f.set(this, C5812k.f67391c);
            this.f67375e = C5812k.f67393e;
            this.f67372b = null;
        }
    }

    private final Object n(C6658d dVar) {
        Object obj = f67370f.get(this);
        C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f67375e;
        m(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    static /* synthetic */ Object p(C5810i iVar, C6658d dVar) {
        if (iVar.t()) {
            return iVar.n(dVar);
        }
        return iVar.q(dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:19:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.C5810i.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.i$b r0 = (ch.C5810i.b) r0
            int r1 = r0.f67388d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f67388d = r1
            goto L_0x0018
        L_0x0013:
            ch.i$b r0 = new ch.i$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f67386b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f67388d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.f67385a
            ch.i r2 = (ch.C5810i) r2
            lf.w.b(r6)
            goto L_0x004b
        L_0x003c:
            lf.w.b(r6)
            r0.f67385a = r5
            r0.f67388d = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.f67385a = r6
            r0.f67388d = r3
            java.lang.Object r6 = r2.n(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C5810i.q(qf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ch.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ch.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ch.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ch.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ch.C5810i.a r(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f67372b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r0.next()
            r3 = r2
            ch.i$a r3 = (ch.C5810i.a) r3
            java.lang.Object r3 = r3.f67376a
            if (r3 != r5) goto L_0x000c
            r1 = r2
        L_0x001e:
            ch.i$a r1 = (ch.C5810i.a) r1
            if (r1 == 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C5810i.r(java.lang.Object):ch.i$a");
    }

    private final boolean t() {
        return f67370f.get(this) instanceof a;
    }

    public static /* synthetic */ void v(C5810i iVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            iVar.u(aVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    /* access modifiers changed from: private */
    public final void w(Object obj) {
        a r10 = r(obj);
        C6496s.e(r10);
        r10.f67382g = null;
        r10.f67383h = -1;
        u(r10, true);
    }

    private final int y(Object obj, Object obj2) {
        boolean z10;
        while (true) {
            Object obj3 = f67370f.get(this);
            if (obj3 instanceof C5582n) {
                a r10 = r(obj);
                if (r10 == null) {
                    continue;
                } else {
                    C6798l a10 = r10.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(f67370f, this, obj3, r10)) {
                        this.f67375e = obj2;
                        if (C5812k.j((C5582n) obj3, a10)) {
                            return 0;
                        }
                        this.f67375e = C5812k.f67393e;
                        return 2;
                    }
                }
            } else {
                if (C6496s.c(obj3, C5812k.f67391c)) {
                    z10 = true;
                } else {
                    z10 = obj3 instanceof a;
                }
                if (z10) {
                    return 3;
                }
                if (C6496s.c(obj3, C5812k.f67392d)) {
                    return 2;
                }
                if (C6496s.c(obj3, C5812k.f67390b)) {
                    if (androidx.concurrent.futures.b.a(f67370f, this, obj3, C6565s.e(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (androidx.concurrent.futures.b.a(f67370f, this, obj3, C6565s.L0((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    private final Object z(C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        AtomicReferenceFieldUpdater j10 = f67370f;
        while (true) {
            Object obj = j10.get(this);
            if (obj == C5812k.f67390b) {
                if (androidx.concurrent.futures.b.a(f67370f, this, obj, oVar)) {
                    C5588q.c(oVar, this);
                    break;
                }
            } else if (obj instanceof List) {
                if (androidx.concurrent.futures.b.a(f67370f, this, obj, C5812k.f67390b)) {
                    for (Object k10 : (Iterable) obj) {
                        w(k10);
                    }
                }
            } else if (obj instanceof a) {
                oVar.x(C6514M.f71813a, ((a) obj).a(this, this.f67375e));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    public void a(C5805d dVar, C6798l lVar) {
        v(this, new a(dVar.d(), dVar.a(), dVar.c(), C5812k.i(), lVar, dVar.b()), false, 1, (Object) null);
    }

    public void b(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater s10 = f67370f;
        do {
            obj = s10.get(this);
            if (obj == C5812k.f67391c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(s10, this, obj, C5812k.f67392d));
        List<a> list = this.f67372b;
        if (list != null) {
            for (a b10 : list) {
                b10.b();
            }
            this.f67375e = C5812k.f67393e;
            this.f67372b = null;
        }
    }

    public void c(D d10, int i10) {
        this.f67373c = d10;
        this.f67374d = i10;
    }

    public void d(C5807f fVar, p pVar) {
        v(this, new a(fVar.d(), fVar.a(), fVar.c(), (Object) null, pVar, fVar.b()), false, 1, (Object) null);
    }

    public void e(Object obj) {
        this.f67375e = obj;
    }

    public void f(C5559b0 b0Var) {
        this.f67373c = b0Var;
    }

    public boolean g(Object obj, Object obj2) {
        if (y(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    public g getContext() {
        return this.f67371a;
    }

    public Object o(C6658d dVar) {
        return p(this, dVar);
    }

    public final void u(a aVar, boolean z10) {
        if (!(f67370f.get(this) instanceof a)) {
            if (!z10) {
                l(aVar.f67376a);
            }
            if (aVar.e(this)) {
                if (!z10) {
                    List list = this.f67372b;
                    C6496s.e(list);
                    list.add(aVar);
                }
                aVar.f67382g = this.f67373c;
                aVar.f67383h = this.f67374d;
                this.f67373c = null;
                this.f67374d = -1;
                return;
            }
            f67370f.set(this, aVar);
        }
    }

    public final C5813l x(Object obj, Object obj2) {
        return C5812k.a(y(obj, obj2));
    }
}
