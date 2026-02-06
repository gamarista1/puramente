package androidx.work.impl;

import P3.m;
import P3.u;
import Q3.w;
import R3.b;
import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.c;
import androidx.work.C1836c;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.a;
import androidx.work.j;
import androidx.work.s;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.util.concurrent.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.u  reason: case insensitive filesystem */
public class C1860u implements a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f18953l = s.i("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f18954a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f18955b;

    /* renamed from: c  reason: collision with root package name */
    private C1836c f18956c;

    /* renamed from: d  reason: collision with root package name */
    private b f18957d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f18958e;

    /* renamed from: f  reason: collision with root package name */
    private Map f18959f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map f18960g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map f18961h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set f18962i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List f18963j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final Object f18964k = new Object();

    public C1860u(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase) {
        this.f18955b = context;
        this.f18956c = cVar;
        this.f18957d = bVar;
        this.f18958e = workDatabase;
    }

    private U f(String str) {
        boolean z10;
        U u10 = (U) this.f18959f.remove(str);
        if (u10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            u10 = (U) this.f18960g.remove(str);
        }
        this.f18961h.remove(str);
        if (z10) {
            u();
        }
        return u10;
    }

    private U h(String str) {
        U u10 = (U) this.f18959f.get(str);
        if (u10 == null) {
            return (U) this.f18960g.get(str);
        }
        return u10;
    }

    private static boolean i(String str, U u10, int i10) {
        if (u10 != null) {
            u10.g(i10);
            s e10 = s.e();
            String str2 = f18953l;
            e10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        s e11 = s.e();
        String str3 = f18953l;
        e11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(m mVar, boolean z10) {
        synchronized (this.f18964k) {
            try {
                for (C1846f b10 : this.f18963j) {
                    b10.b(mVar, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f18958e.I().a(str));
        return this.f18958e.H().h(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(g gVar, U u10) {
        boolean z10;
        try {
            z10 = ((Boolean) gVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        o(u10, z10);
    }

    private void o(U u10, boolean z10) {
        synchronized (this.f18964k) {
            try {
                m d10 = u10.d();
                String b10 = d10.b();
                if (h(b10) == u10) {
                    f(b10);
                }
                s e10 = s.e();
                String str = f18953l;
                e10.a(str, getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + b10 + " executed; reschedule = " + z10);
                for (C1846f b11 : this.f18963j) {
                    b11.b(d10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q(m mVar, boolean z10) {
        this.f18957d.a().execute(new C1859t(this, mVar, z10));
    }

    private void u() {
        synchronized (this.f18964k) {
            try {
                if (this.f18959f.isEmpty()) {
                    this.f18955b.startService(androidx.work.impl.foreground.b.g(this.f18955b));
                    PowerManager.WakeLock wakeLock = this.f18954a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f18954a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, j jVar) {
        synchronized (this.f18964k) {
            try {
                s e10 = s.e();
                String str2 = f18953l;
                e10.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
                U u10 = (U) this.f18960g.remove(str);
                if (u10 != null) {
                    if (this.f18954a == null) {
                        PowerManager.WakeLock b10 = w.b(this.f18955b, "ProcessorForegroundLck");
                        this.f18954a = b10;
                        b10.acquire();
                    }
                    this.f18959f.put(str, u10);
                    c.startForegroundService(this.f18955b, androidx.work.impl.foreground.b.f(this.f18955b, u10.d(), jVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(C1846f fVar) {
        synchronized (this.f18964k) {
            this.f18963j.add(fVar);
        }
    }

    public u g(String str) {
        synchronized (this.f18964k) {
            try {
                U h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                u e10 = h10.e();
                return e10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f18964k) {
            contains = this.f18962i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f18964k) {
            if (h(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void p(C1846f fVar) {
        synchronized (this.f18964k) {
            this.f18963j.remove(fVar);
        }
    }

    public boolean r(A a10) {
        return s(a10, (WorkerParameters.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(androidx.work.impl.A r13, androidx.work.WorkerParameters.a r14) {
        /*
            r12 = this;
            P3.m r0 = r13.a()
            java.lang.String r1 = r0.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f18958e
            androidx.work.impl.r r3 = new androidx.work.impl.r
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.z(r3)
            r8 = r2
            P3.u r8 = (P3.u) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            androidx.work.s r13 = androidx.work.s.e()
            java.lang.String r14 = f18953l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.k(r14, r1)
            r12.q(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f18964k
            monitor-enter(r10)
            boolean r3 = r12.k(r1)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0090
            java.util.Map r14 = r12.f18961h     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0088 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.A r1 = (androidx.work.impl.A) r1     // Catch:{ all -> 0x0088 }
            P3.m r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r3 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r1 != r3) goto L_0x008b
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            androidx.work.s r13 = androidx.work.s.e()     // Catch:{ all -> 0x0088 }
            java.lang.String r14 = f18953l     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            r13.a(r14, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r13 = move-exception
            goto L_0x010b
        L_0x008b:
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x008e:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x0090:
            int r3 = r8.f()     // Catch:{ all -> 0x0088 }
            int r4 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r3 == r4) goto L_0x009f
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x009f:
            androidx.work.impl.U$c r11 = new androidx.work.impl.U$c     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = r12.f18955b     // Catch:{ all -> 0x0088 }
            androidx.work.c r4 = r12.f18956c     // Catch:{ all -> 0x0088 }
            R3.b r5 = r12.f18957d     // Catch:{ all -> 0x0088 }
            androidx.work.impl.WorkDatabase r7 = r12.f18958e     // Catch:{ all -> 0x0088 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.U$c r14 = r11.c(r14)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.U r14 = r14.b()     // Catch:{ all -> 0x0088 }
            com.google.common.util.concurrent.g r2 = r14.c()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.s r3 = new androidx.work.impl.s     // Catch:{ all -> 0x0088 }
            r3.<init>(r12, r2, r14)     // Catch:{ all -> 0x0088 }
            R3.b r4 = r12.f18957d     // Catch:{ all -> 0x0088 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0088 }
            r2.e(r3, r4)     // Catch:{ all -> 0x0088 }
            java.util.Map r2 = r12.f18960g     // Catch:{ all -> 0x0088 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0088 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0088 }
            r2.<init>()     // Catch:{ all -> 0x0088 }
            r2.add(r13)     // Catch:{ all -> 0x0088 }
            java.util.Map r13 = r12.f18961h     // Catch:{ all -> 0x0088 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            R3.b r13 = r12.f18957d
            R3.a r13 = r13.c()
            r13.execute(r14)
            androidx.work.s r13 = androidx.work.s.e()
            java.lang.String r14 = f18953l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.a(r14, r0)
            r13 = 1
            return r13
        L_0x010b:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1860u.s(androidx.work.impl.A, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean t(String str, int i10) {
        U f10;
        synchronized (this.f18964k) {
            s e10 = s.e();
            String str2 = f18953l;
            e10.a(str2, "Processor cancelling " + str);
            this.f18962i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public boolean v(A a10, int i10) {
        U f10;
        String b10 = a10.a().b();
        synchronized (this.f18964k) {
            f10 = f(b10);
        }
        return i(b10, f10, i10);
    }

    public boolean w(A a10, int i10) {
        String b10 = a10.a().b();
        synchronized (this.f18964k) {
            try {
                if (this.f18959f.get(b10) != null) {
                    s e10 = s.e();
                    String str = f18953l;
                    e10.a(str, "Ignored stopWork. WorkerWrapper " + b10 + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f18961h.get(b10);
                if (set != null) {
                    if (set.contains(a10)) {
                        U f10 = f(b10);
                        return i(b10, f10, i10);
                    }
                }
                return false;
            } finally {
            }
        }
    }
}
