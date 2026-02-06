package D5;

import D5.l;
import D5.o;
import D5.u;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import t7.C4049a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f30417a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f30418b = new AtomicBoolean(false);

    private h() {
    }

    private final void d(u.a aVar, String str) {
        if (!C4049a.d(this)) {
            try {
                boolean e10 = r.e();
                if (e10) {
                    r.g();
                }
                if (aVar == u.a.V2_V4) {
                    l.b bVar = l.f30426q;
                    r.d(bVar.c(), bVar.e(), false, str, aVar, e10);
                    r.d(bVar.f(), bVar.e(), true, str, aVar, e10);
                    bVar.c().clear();
                    bVar.f().clear();
                } else {
                    o.a aVar2 = o.f30462N;
                    r.d(aVar2.c(), aVar2.e(), false, str, aVar, e10);
                    r.d(aVar2.f(), aVar2.e(), true, str, aVar, e10);
                    aVar2.c().clear();
                    aVar2.f().clear();
                }
                if (e10) {
                    r.h();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void e(android.content.Context r5, D5.u.a r6) {
        /*
            java.lang.Class<D5.h> r0 = D5.h.class
            monitor-enter(r0)
            java.lang.Class<D5.h> r1 = D5.h.class
            boolean r1 = t7.C4049a.d(r1)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C6496s.h(r5, r1)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "billingClientVersion"
            kotlin.jvm.internal.C6496s.h(r6, r1)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.atomic.AtomicBoolean r1 = f30418b     // Catch:{ all -> 0x0033 }
            boolean r2 = r1.get()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)
            return
        L_0x0021:
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N     // Catch:{ all -> 0x0033 }
            r2.<init>()     // Catch:{ all -> 0x0033 }
            D5.u$a r3 = D5.u.a.V2_V4     // Catch:{ all -> 0x0033 }
            if (r6 != r3) goto L_0x0035
            D5.l$b r4 = D5.l.f30426q     // Catch:{ all -> 0x0033 }
            D5.l r4 = r4.d(r5)     // Catch:{ all -> 0x0033 }
            r2.f71759a = r4     // Catch:{ all -> 0x0033 }
            goto L_0x0041
        L_0x0033:
            r5 = move-exception
            goto L_0x007a
        L_0x0035:
            D5.u$a r4 = D5.u.a.V5_V7     // Catch:{ all -> 0x0033 }
            if (r6 != r4) goto L_0x0041
            D5.o$a r4 = D5.o.f30462N     // Catch:{ all -> 0x0033 }
            D5.o r4 = r4.d(r5)     // Catch:{ all -> 0x0033 }
            r2.f71759a = r4     // Catch:{ all -> 0x0033 }
        L_0x0041:
            java.lang.Object r4 = r2.f71759a     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x004b
            r5 = 1
            r1.set(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)
            return
        L_0x004b:
            o7.s$b r1 = o7.C3902s.b.AndroidIAPSubscriptionAutoLogging     // Catch:{ all -> 0x0033 }
            boolean r1 = o7.C3902s.g(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x006a
            boolean r1 = E5.e.d()     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x005b
            if (r6 != r3) goto L_0x006a
        L_0x005b:
            java.lang.Object r1 = r2.f71759a     // Catch:{ all -> 0x0033 }
            D5.i r1 = (D5.i) r1     // Catch:{ all -> 0x0033 }
            D5.u$b r3 = D5.u.b.INAPP     // Catch:{ all -> 0x0033 }
            D5.e r4 = new D5.e     // Catch:{ all -> 0x0033 }
            r4.<init>(r2, r6, r5)     // Catch:{ all -> 0x0033 }
            r1.a(r3, r4)     // Catch:{ all -> 0x0033 }
            goto L_0x0078
        L_0x006a:
            java.lang.Object r1 = r2.f71759a     // Catch:{ all -> 0x0033 }
            D5.i r1 = (D5.i) r1     // Catch:{ all -> 0x0033 }
            D5.u$b r2 = D5.u.b.INAPP     // Catch:{ all -> 0x0033 }
            D5.f r3 = new D5.f     // Catch:{ all -> 0x0033 }
            r3.<init>(r6, r5)     // Catch:{ all -> 0x0033 }
            r1.a(r2, r3)     // Catch:{ all -> 0x0033 }
        L_0x0078:
            monitor-exit(r0)
            return
        L_0x007a:
            java.lang.Class<D5.h> r6 = D5.h.class
            t7.C4049a.b(r5, r6)     // Catch:{ all -> 0x0081 }
            monitor-exit(r0)
            return
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.h.e(android.content.Context, D5.u$a):void");
    }

    /* access modifiers changed from: private */
    public static final void f(N n10, u.a aVar, Context context) {
        Class<h> cls = h.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(n10, "$billingClientWrapper");
                C6496s.h(aVar, "$billingClientVersion");
                C6496s.h(context, "$context");
                ((i) n10.f71759a).a(u.b.SUBS, new g(aVar, context));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void g(u.a aVar, Context context) {
        Class<h> cls = h.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "$billingClientVersion");
                C6496s.h(context, "$context");
                h hVar = f30417a;
                String packageName = context.getPackageName();
                C6496s.g(packageName, "context.packageName");
                hVar.d(aVar, packageName);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(u.a aVar, Context context) {
        Class<h> cls = h.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "$billingClientVersion");
                C6496s.h(context, "$context");
                h hVar = f30417a;
                String packageName = context.getPackageName();
                C6496s.g(packageName, "context.packageName");
                hVar.d(aVar, packageName);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
