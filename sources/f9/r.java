package f9;

import W8.c;
import Y8.h;
import Y8.i;
import Y8.o;
import Z8.e;
import Z8.f;
import Z8.g;
import Z8.m;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b9.C3160a;
import b9.C3162c;
import c9.C3193a;
import g9.C3545c;
import g9.C3546d;
import g9.C3553k;
import h9.C3585b;
import i9.C3597a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f43519a;

    /* renamed from: b  reason: collision with root package name */
    private final e f43520b;

    /* renamed from: c  reason: collision with root package name */
    private final C3546d f43521c;

    /* renamed from: d  reason: collision with root package name */
    private final x f43522d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f43523e;

    /* renamed from: f  reason: collision with root package name */
    private final C3585b f43524f;

    /* renamed from: g  reason: collision with root package name */
    private final C3597a f43525g;

    /* renamed from: h  reason: collision with root package name */
    private final C3597a f43526h;

    /* renamed from: i  reason: collision with root package name */
    private final C3545c f43527i;

    public r(Context context, e eVar, C3546d dVar, x xVar, Executor executor, C3585b bVar, C3597a aVar, C3597a aVar2, C3545c cVar) {
        this.f43519a = context;
        this.f43520b = eVar;
        this.f43521c = dVar;
        this.f43522d = xVar;
        this.f43523e = executor;
        this.f43524f = bVar;
        this.f43525g = aVar;
        this.f43526h = aVar2;
        this.f43527i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(o oVar) {
        return Boolean.valueOf(this.f43521c.w1(oVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(o oVar) {
        return this.f43521c.H(oVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, o oVar, long j10) {
        this.f43521c.s0(iterable);
        this.f43521c.c0(oVar, this.f43525g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f43521c.u(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f43527i.a();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f43527i.b((long) ((Integer) entry.getValue()).intValue(), C3162c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(o oVar, long j10) {
        this.f43521c.c0(oVar, this.f43525g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(o oVar, int i10) {
        this.f43522d.b(oVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.f43522d.b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(Y8.o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            h9.b r0 = r3.f43524f     // Catch:{ a -> 0x0029 }
            g9.d r1 = r3.f43521c     // Catch:{ a -> 0x0029 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0029 }
            f9.i r2 = new f9.i     // Catch:{ a -> 0x0029 }
            r2.<init>(r1)     // Catch:{ a -> 0x0029 }
            r0.n(r2)     // Catch:{ a -> 0x0029 }
            boolean r0 = r3.k()     // Catch:{ a -> 0x0029 }
            if (r0 != 0) goto L_0x0022
            h9.b r0 = r3.f43524f     // Catch:{ a -> 0x0029 }
            f9.j r1 = new f9.j     // Catch:{ a -> 0x0029 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0029 }
            r0.n(r1)     // Catch:{ a -> 0x0029 }
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x0032
        L_0x0022:
            r3.u(r4, r5)     // Catch:{ a -> 0x0029 }
        L_0x0025:
            r6.run()
            goto L_0x0031
        L_0x0029:
            f9.x r0 = r3.f43522d     // Catch:{ all -> 0x0020 }
            int r5 = r5 + 1
            r0.b(r4, r5)     // Catch:{ all -> 0x0020 }
            goto L_0x0025
        L_0x0031:
            return
        L_0x0032:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.r.t(Y8.o, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        C3585b bVar = this.f43524f;
        C3545c cVar = this.f43527i;
        Objects.requireNonNull(cVar);
        return mVar.b(i.a().i(this.f43525g.a()).k(this.f43526h.a()).j("GDT_CLIENT_METRICS").h(new h(c.b("proto"), ((C3160a) bVar.n(new h(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f43519a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public g u(o oVar, int i10) {
        g a10;
        m mVar = this.f43520b.get(oVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f43524f.n(new k(this, oVar))).booleanValue()) {
                Iterable<C3553k> iterable = (Iterable) this.f43524f.n(new l(this, oVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (mVar == null) {
                    C3193a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C3553k b10 : iterable) {
                        arrayList.add(b10.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    a10 = mVar.a(f.a().b(arrayList).c(oVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f43524f.n(new m(this, iterable, oVar, j11));
                    this.f43522d.a(oVar, i10 + 1, true);
                    return e10;
                }
                this.f43524f.n(new n(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (oVar.e()) {
                        this.f43524f.n(new o(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C3553k b11 : iterable) {
                        String j12 = b11.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f43524f.n(new p(this, hashMap));
                }
            }
            this.f43524f.n(new q(this, oVar, j11));
            return e10;
        }
    }

    public void v(o oVar, int i10, Runnable runnable) {
        this.f43523e.execute(new g(this, oVar, i10, runnable));
    }
}
