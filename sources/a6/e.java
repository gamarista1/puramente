package A6;

import Ef.m;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6535s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f29386a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicInteger f29387b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicInteger f29388c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f29389d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f29390e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f29391f = C6531o.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private static final Runnable f29392g;

    /* renamed from: h  reason: collision with root package name */
    private static final Runnable f29393h;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                A6.l$a[] r0 = A6.l.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                A6.l$a r1 = A6.l.a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                A6.l$a r1 = A6.l.a.NEAREST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                A6.l$a r1 = A6.l.a.MISSING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f29394a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A6.e.a.<clinit>():void");
        }
    }

    static {
        e eVar = new e();
        f29386a = eVar;
        c cVar = new c();
        f29392g = cVar;
        d dVar = new d();
        f29393h = dVar;
        eVar.f().post(cVar);
        eVar.f().post(dVar);
    }

    private e() {
    }

    /* access modifiers changed from: private */
    public static final void d() {
        float andSet = (float) f29387b.getAndSet(0);
        float andSet2 = (float) f29388c.getAndSet(0);
        float andSet3 = (float) f29389d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f29390e.entrySet()) {
                    int intValue = ((Number) entry.getValue()).intValue();
                    f29386a.k((i) entry.getKey(), -intValue);
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f29390e.entrySet()) {
                    int intValue2 = ((Number) entry2.getValue()).intValue();
                    f29386a.k((i) entry2.getKey(), intValue2);
                }
            }
            f29390e.clear();
        }
        f29386a.j();
    }

    /* access modifiers changed from: private */
    public static final void e() {
        k.f29415d.a(new Date(System.currentTimeMillis() - 10000));
        f29386a.i();
    }

    private final Handler f() {
        return (Handler) f29391f.getValue();
    }

    /* access modifiers changed from: private */
    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private final boolean i() {
        return f().postDelayed(f29393h, 10000);
    }

    private final boolean j() {
        return f().postDelayed(f29392g, 2000);
    }

    private final void k(i iVar, int i10) {
        int l10 = m.l(iVar.a() + i10, (int) m.c(((float) iVar.c()) * 0.5f, 1.0f), iVar.c());
        if (l10 != iVar.a()) {
            iVar.b(l10);
        }
    }

    public final void h(i iVar, l lVar) {
        C6496s.h(iVar, "animation");
        C6496s.h(lVar, "frameResult");
        ConcurrentHashMap concurrentHashMap = f29390e;
        if (!concurrentHashMap.contains(iVar)) {
            concurrentHashMap.put(iVar, Integer.valueOf((int) (((float) iVar.c()) * 0.2f)));
        }
        int i10 = a.f29394a[lVar.b().ordinal()];
        if (i10 == 1) {
            f29387b.incrementAndGet();
        } else if (i10 == 2) {
            f29388c.incrementAndGet();
        } else if (i10 == 3) {
            f29389d.incrementAndGet();
        } else {
            throw new C6535s();
        }
    }
}
