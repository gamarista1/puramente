package Zg;

import Ug.O;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.D;

public class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66992a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66993b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66994c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public static abstract class a extends C5713b {

        /* renamed from: b  reason: collision with root package name */
        public final r f66995b;

        /* renamed from: c  reason: collision with root package name */
        public r f66996c;

        public a(r rVar) {
            this.f66995b = rVar;
        }

        /* renamed from: f */
        public void b(r rVar, Object obj) {
            boolean z10;
            r rVar2;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rVar2 = this.f66995b;
            } else {
                rVar2 = this.f66996c;
            }
            if (rVar2 != null && androidx.concurrent.futures.b.a(r.f66992a, rVar, this, rVar2) && z10) {
                r rVar3 = this.f66995b;
                r rVar4 = this.f66996c;
                C6496s.e(rVar4);
                rVar3.j(rVar4);
            }
        }
    }

    /* synthetic */ class b extends D {
        b(Object obj) {
            super(obj, O.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return O.a(this.receiver);
        }
    }

    static {
        Class<r> cls = r.class;
        Class<Object> cls2 = Object.class;
        f66992a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f66993b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        f66994c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: Zg.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (androidx.concurrent.futures.b.a(n(), r3, r2, ((Zg.A) r4).f66945a) != false) goto L_0x004f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Zg.r h(Zg.z r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f66993b
            java.lang.Object r0 = r0.get(r7)
            Zg.r r0 = (Zg.r) r0
            r1 = 0
            r2 = r0
        L_0x000c:
            r3 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f66992a
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L_0x0026
            if (r0 != r2) goto L_0x001a
            return r2
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f66993b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0025
            goto L_0x0000
        L_0x0025:
            return r2
        L_0x0026:
            boolean r5 = r7.q()
            if (r5 == 0) goto L_0x002d
            return r1
        L_0x002d:
            if (r4 != r8) goto L_0x0030
            return r2
        L_0x0030:
            boolean r5 = r4 instanceof Zg.z
            if (r5 == 0) goto L_0x003a
            Zg.z r4 = (Zg.z) r4
            r4.a(r2)
            goto L_0x0000
        L_0x003a:
            boolean r5 = r4 instanceof Zg.A
            if (r5 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f66992a
            Zg.A r4 = (Zg.A) r4
            Zg.r r4 = r4.f66945a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004f
            goto L_0x0000
        L_0x004f:
            r2 = r3
            goto L_0x000c
        L_0x0051:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f66993b
            java.lang.Object r2 = r4.get(r2)
            Zg.r r2 = (Zg.r) r2
            goto L_0x000d
        L_0x005c:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C6496s.f(r4, r3)
            r3 = r4
            Zg.r r3 = (Zg.r) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.r.h(Zg.z):Zg.r");
    }

    private final r i(r rVar) {
        while (rVar.q()) {
            rVar = (r) f66993b.get(rVar);
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    public final void j(r rVar) {
        r rVar2;
        AtomicReferenceFieldUpdater o10 = f66993b;
        do {
            rVar2 = (r) o10.get(rVar);
            if (k() != rVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f66993b, rVar, rVar2, this));
        if (q()) {
            rVar.h((z) null);
        }
    }

    private final A t() {
        A a10 = (A) f66994c.get(this);
        if (a10 != null) {
            return a10;
        }
        A a11 = new A(this);
        f66994c.set(this, a11);
        return a11;
    }

    public final boolean g(r rVar) {
        f66993b.set(rVar, this);
        f66992a.set(rVar, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f66992a, this, this, rVar)) {
                rVar.j(this);
                return true;
            }
        }
        return false;
    }

    public final Object k() {
        AtomicReferenceFieldUpdater n10 = f66992a;
        while (true) {
            Object obj = n10.get(this);
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).a(this);
        }
    }

    public final r l() {
        A a10;
        r rVar;
        Object k10 = k();
        if (k10 instanceof A) {
            a10 = (A) k10;
        } else {
            a10 = null;
        }
        if (a10 != null && (rVar = a10.f66945a) != null) {
            return rVar;
        }
        C6496s.f(k10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (r) k10;
    }

    public final r m() {
        r h10 = h((z) null);
        if (h10 == null) {
            return i((r) f66993b.get(this));
        }
        return h10;
    }

    public boolean q() {
        return k() instanceof A;
    }

    public boolean r() {
        if (s() == null) {
            return true;
        }
        return false;
    }

    public final r s() {
        Object k10;
        r rVar;
        do {
            k10 = k();
            if (k10 instanceof A) {
                return ((A) k10).f66945a;
            }
            if (k10 == this) {
                return (r) k10;
            }
            C6496s.f(k10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            rVar = (r) k10;
        } while (!androidx.concurrent.futures.b.a(f66992a, this, k10, rVar.t()));
        rVar.h((z) null);
        return null;
    }

    public String toString() {
        return new b(this) + '@' + O.b(this);
    }

    public final int u(r rVar, r rVar2, a aVar) {
        f66993b.set(rVar, this);
        f66992a.set(rVar, rVar2);
        aVar.f66996c = rVar2;
        if (!androidx.concurrent.futures.b.a(f66992a, this, rVar2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }
}
