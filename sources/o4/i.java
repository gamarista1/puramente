package o4;

import Ug.C5582n;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.coroutines.jvm.internal.d;
import lf.C6514M;
import lf.v;
import qf.C6658d;

public abstract class i {

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f46998a;

        /* renamed from: b  reason: collision with root package name */
        Object f46999b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f47000c;

        /* renamed from: d  reason: collision with root package name */
        int f47001d;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f47000c = obj;
            this.f47001d |= Integer.MIN_VALUE;
            return i.a((C1790m) null, this);
        }
    }

    public static final class b implements DefaultLifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f47002a;

        b(C5582n nVar) {
            this.f47002a = nVar;
        }

        public void onStart(C1798v vVar) {
            C5582n nVar = this.f47002a;
            v.a aVar = v.f71841b;
            nVar.resumeWith(v.b(C6514M.f71813a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.lifecycle.C1790m r6, qf.C6658d r7) {
        /*
            boolean r0 = r7 instanceof o4.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            o4.i$a r0 = (o4.i.a) r0
            int r1 = r0.f47001d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47001d = r1
            goto L_0x0018
        L_0x0013:
            o4.i$a r0 = new o4.i$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f47000c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f47001d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f46999b
            kotlin.jvm.internal.N r6 = (kotlin.jvm.internal.N) r6
            java.lang.Object r0 = r0.f46998a
            androidx.lifecycle.m r0 = (androidx.lifecycle.C1790m) r0
            lf.w.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x008c
        L_0x0031:
            r7 = move-exception
            goto L_0x0098
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            lf.w.b(r7)
            androidx.lifecycle.m$b r7 = r6.b()
            androidx.lifecycle.m$b r2 = androidx.lifecycle.C1790m.b.STARTED
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L_0x004d
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x004d:
            kotlin.jvm.internal.N r7 = new kotlin.jvm.internal.N
            r7.<init>()
            r0.f46998a = r6     // Catch:{ all -> 0x0081 }
            r0.f46999b = r7     // Catch:{ all -> 0x0081 }
            r0.f47001d = r3     // Catch:{ all -> 0x0081 }
            Ug.o r2 = new Ug.o     // Catch:{ all -> 0x0081 }
            qf.d r4 = rf.C6680b.c(r0)     // Catch:{ all -> 0x0081 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0081 }
            r2.E()     // Catch:{ all -> 0x0081 }
            o4.i$b r3 = new o4.i$b     // Catch:{ all -> 0x0081 }
            r3.<init>(r2)     // Catch:{ all -> 0x0081 }
            r7.f71759a = r3     // Catch:{ all -> 0x0081 }
            kotlin.jvm.internal.C6496s.e(r3)     // Catch:{ all -> 0x0081 }
            androidx.lifecycle.u r3 = (androidx.lifecycle.C1797u) r3     // Catch:{ all -> 0x0081 }
            r6.a(r3)     // Catch:{ all -> 0x0081 }
            java.lang.Object r2 = r2.v()     // Catch:{ all -> 0x0081 }
            java.lang.Object r3 = rf.C6680b.f()     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x0087
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L_0x0098
        L_0x0087:
            if (r2 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r0 = r6
            r6 = r7
        L_0x008c:
            java.lang.Object r6 = r6.f71759a
            androidx.lifecycle.u r6 = (androidx.lifecycle.C1797u) r6
            if (r6 == 0) goto L_0x0095
            r0.d(r6)
        L_0x0095:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x0098:
            java.lang.Object r6 = r6.f71759a
            androidx.lifecycle.u r6 = (androidx.lifecycle.C1797u) r6
            if (r6 == 0) goto L_0x00a1
            r0.d(r6)
        L_0x00a1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.a(androidx.lifecycle.m, qf.d):java.lang.Object");
    }

    public static final void b(C1790m mVar, C1797u uVar) {
        mVar.d(uVar);
        mVar.a(uVar);
    }
}
