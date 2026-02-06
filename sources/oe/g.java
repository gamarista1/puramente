package oe;

import Ff.d;
import Ff.e;
import Ff.p;
import ae.C4464a;
import expo.modules.kotlin.exception.n;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import qe.S;
import xf.C6781a;

public final class g extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61213b;

    /* renamed from: c  reason: collision with root package name */
    private final e f61214c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f61215d = C6531o.b(new f(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(p pVar) {
        super(pVar.e());
        C6496s.h(pVar, "type");
        this.f61213b = pVar;
        this.f61214c = new e(pVar);
    }

    private final SharedRef f(SharedRef sharedRef) {
        e eVar;
        Object T10 = sharedRef.T();
        if (T10 == null) {
            return sharedRef;
        }
        p h10 = h();
        d dVar = null;
        if (h10 != null) {
            eVar = h10.b();
        } else {
            eVar = null;
        }
        if (eVar instanceof d) {
            dVar = (d) eVar;
        }
        if (dVar == null || Gf.e.m(dVar, C6781a.e(T10.getClass()))) {
            return sharedRef;
        }
        throw new n(this.f61213b, sharedRef.getClass());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: Ff.p} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Ff.p i(oe.g r4) {
        /*
            Ff.p r0 = r4.f61213b
            Ff.e r0 = r0.b()
            boolean r1 = r0 instanceof Ff.d
            r2 = 0
            if (r1 == 0) goto L_0x000e
            Ff.d r0 = (Ff.d) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            Ff.p r1 = r4.f61213b
        L_0x0011:
            if (r0 == 0) goto L_0x0085
            java.lang.Class<expo.modules.kotlin.sharedobjects.SharedRef> r3 = expo.modules.kotlin.sharedobjects.SharedRef.class
            Ff.d r3 = kotlin.jvm.internal.O.b(r3)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r0, r3)
            if (r3 == 0) goto L_0x0069
            if (r1 == 0) goto L_0x002e
            java.util.List r0 = r1.c()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = mf.C6565s.o0(r0)
            Ff.r r0 = (Ff.r) r0
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            Ff.r$a r1 = Ff.r.f62882c
            Ff.r r1 = r1.c()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r1 == 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r0 == 0) goto L_0x0042
            Ff.p r2 = r0.c()
        L_0x0042:
            if (r2 == 0) goto L_0x0045
            return r2
        L_0x0045:
            Ff.p r4 = r4.h()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " type should contain the type of the inner ref"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L_0x0069:
            java.util.List r0 = r0.l()
            java.lang.Object r0 = mf.C6565s.q0(r0)
            r1 = r0
            Ff.p r1 = (Ff.p) r1
            if (r1 == 0) goto L_0x007b
            Ff.e r0 = r1.b()
            goto L_0x007c
        L_0x007b:
            r0 = r2
        L_0x007c:
            boolean r3 = r0 instanceof Ff.d
            if (r3 == 0) goto L_0x0083
            Ff.d r0 = (Ff.d) r0
            goto L_0x0011
        L_0x0083:
            r0 = r2
            goto L_0x0011
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.g.i(oe.g):Ff.p");
    }

    public ExpectedType b() {
        return this.f61214c.b();
    }

    public boolean c() {
        return this.f61214c.c();
    }

    /* renamed from: g */
    public SharedRef d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        SharedRef sharedRef = (SharedRef) this.f61214c.a(obj, aVar);
        if (sharedRef != null) {
            SharedRef f10 = f(sharedRef);
            C6496s.f(f10, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
            return f10;
        }
        throw new expo.modules.kotlin.exception.p(this.f61213b);
    }

    public final p h() {
        return (p) this.f61215d.getValue();
    }
}
