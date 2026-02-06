package zc;

import Bc.c;
import Bc.d;
import Bc.g;
import Bc.h;
import Bc.i;
import Bc.j;
import Bc.m;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import ic.C5027b;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.C5046e;
import rc.C5191a;
import rc.e;
import ub.C5230g;
import uc.C5233a;
import uc.b;

/* renamed from: zc.k  reason: case insensitive filesystem */
public class C5313k implements a.b {

    /* renamed from: r  reason: collision with root package name */
    private static final C5233a f62400r = C5233a.e();

    /* renamed from: s  reason: collision with root package name */
    private static final C5313k f62401s = new C5313k();

    /* renamed from: a  reason: collision with root package name */
    private final Map f62402a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentLinkedQueue f62403b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f62404c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private C5230g f62405d;

    /* renamed from: e  reason: collision with root package name */
    private e f62406e;

    /* renamed from: f  reason: collision with root package name */
    private C5046e f62407f;

    /* renamed from: g  reason: collision with root package name */
    private C5027b f62408g;

    /* renamed from: h  reason: collision with root package name */
    private C5304b f62409h;

    /* renamed from: i  reason: collision with root package name */
    private ExecutorService f62410i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: j  reason: collision with root package name */
    private Context f62411j;

    /* renamed from: k  reason: collision with root package name */
    private com.google.firebase.perf.config.a f62412k;

    /* renamed from: l  reason: collision with root package name */
    private C5306d f62413l;

    /* renamed from: m  reason: collision with root package name */
    private a f62414m;

    /* renamed from: n  reason: collision with root package name */
    private c.b f62415n;

    /* renamed from: o  reason: collision with root package name */
    private String f62416o;

    /* renamed from: p  reason: collision with root package name */
    private String f62417p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f62418q = false;

    private C5313k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f62402a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private i D(i.b bVar, d dVar) {
        G();
        c.b D10 = this.f62415n.D(dVar);
        if (bVar.j() || bVar.g()) {
            D10 = ((c.b) D10.clone()).A(j());
        }
        return (i) bVar.z(D10).q();
    }

    /* access modifiers changed from: private */
    public void E() {
        Context m10 = this.f62405d.m();
        this.f62411j = m10;
        this.f62416o = m10.getPackageName();
        this.f62412k = com.google.firebase.perf.config.a.g();
        this.f62413l = new C5306d(this.f62411j, new Ac.i(100, 1, TimeUnit.MINUTES), 500);
        this.f62414m = a.b();
        this.f62409h = new C5304b(this.f62408g, this.f62412k.a());
        h();
    }

    private void F(i.b bVar, d dVar) {
        if (u()) {
            i D10 = D(bVar, dVar);
            if (t(D10)) {
                g(D10);
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
            }
        } else if (s(bVar)) {
            f62400r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
            this.f62403b.add(new C5305c(bVar, dVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G() {
        /*
            r4 = this;
            com.google.firebase.perf.config.a r0 = r4.f62412k
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0070
            Bc.c$b r0 = r4.f62415n
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.f62418q
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            jc.e r0 = r4.f62407f     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            com.google.android.gms.tasks.Task r0 = r0.getId()     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r2, r1)     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            goto L_0x005d
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x004d
        L_0x002d:
            uc.a r1 = f62400r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x003d:
            uc.a r1 = f62400r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x004d:
            uc.a r1 = f62400r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L_0x005c:
            r0 = 0
        L_0x005d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0069
            Bc.c$b r1 = r4.f62415n
            r1.C(r0)
            goto L_0x0070
        L_0x0069:
            uc.a r0 = f62400r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.C5313k.G():void");
    }

    private void H() {
        if (this.f62406e == null && u()) {
            this.f62406e = e.c();
        }
    }

    private void g(i iVar) {
        if (iVar.j()) {
            f62400r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.k()));
        } else {
            f62400r.g("Logging %s", n(iVar));
        }
        this.f62409h.b(iVar);
    }

    private void h() {
        this.f62414m.k(new WeakReference(f62401s));
        c.b h02 = c.h0();
        this.f62415n = h02;
        h02.E(this.f62405d.r().c()).B(Bc.a.a0().z(this.f62416o).A(C5191a.f61564b).B(p(this.f62411j)));
        this.f62404c.set(true);
        while (!this.f62403b.isEmpty()) {
            C5305c cVar = (C5305c) this.f62403b.poll();
            if (cVar != null) {
                this.f62410i.execute(new C5312j(this, cVar));
            }
        }
    }

    private String i(m mVar) {
        String r02 = mVar.r0();
        if (r02.startsWith("_st_")) {
            return b.c(this.f62417p, this.f62416o, r02);
        }
        return b.a(this.f62417p, this.f62416o, r02);
    }

    private Map j() {
        H();
        e eVar = this.f62406e;
        if (eVar != null) {
            return eVar.b();
        }
        return Collections.emptyMap();
    }

    public static C5313k k() {
        return f62401s;
    }

    private static String l(g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gVar.g0()), Integer.valueOf(gVar.d0()), Integer.valueOf(gVar.c0())});
    }

    private static String m(h hVar) {
        long j10;
        String str;
        if (hVar.E0()) {
            j10 = hVar.v0();
        } else {
            j10 = 0;
        }
        if (hVar.A0()) {
            str = String.valueOf(hVar.o0());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{hVar.x0(), str, new DecimalFormat("#.####").format(((double) j10) / 1000.0d)});
    }

    private static String n(j jVar) {
        if (jVar.j()) {
            return o(jVar.k());
        }
        if (jVar.g()) {
            return m(jVar.h());
        }
        if (jVar.e()) {
            return l(jVar.l());
        }
        return "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{mVar.r0(), new DecimalFormat("#.####").format(((double) mVar.o0()) / 1000.0d)});
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(i iVar) {
        if (iVar.j()) {
            this.f62414m.d(Ac.b.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (iVar.g()) {
            this.f62414m.d(Ac.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    private boolean s(j jVar) {
        Integer num = (Integer) this.f62402a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int intValue = num.intValue();
        Integer num2 = (Integer) this.f62402a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) this.f62402a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int intValue3 = num3.intValue();
        if (jVar.j() && intValue > 0) {
            this.f62402a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.g() && intValue2 > 0) {
            this.f62402a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!jVar.e() || intValue3 <= 0) {
            f62400r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), num, num2, num3);
            return false;
        } else {
            this.f62402a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    private boolean t(i iVar) {
        if (!this.f62412k.K()) {
            f62400r.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        } else if (!iVar.Y().d0()) {
            f62400r.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        } else if (!wc.e.b(iVar, this.f62411j)) {
            f62400r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        } else if (!this.f62413l.h(iVar)) {
            q(iVar);
            f62400r.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        } else if (!this.f62413l.g(iVar)) {
            return true;
        } else {
            q(iVar);
            f62400r.g("Rate limited (per device) - %s", n(iVar));
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(C5305c cVar) {
        F(cVar.f62367a, cVar.f62368b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, d dVar) {
        F(i.a0().C(mVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(h hVar, d dVar) {
        F(i.a0().B(hVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(g gVar, d dVar) {
        F(i.a0().A(gVar), dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f62413l.a(this.f62418q);
    }

    public void A(g gVar, d dVar) {
        this.f62410i.execute(new C5308f(this, gVar, dVar));
    }

    public void B(h hVar, d dVar) {
        this.f62410i.execute(new C5310h(this, hVar, dVar));
    }

    public void C(m mVar, d dVar) {
        this.f62410i.execute(new C5309g(this, mVar, dVar));
    }

    public void onUpdateAppState(d dVar) {
        boolean z10;
        if (dVar == d.FOREGROUND) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f62418q = z10;
        if (u()) {
            this.f62410i.execute(new C5307e(this));
        }
    }

    public void r(C5230g gVar, C5046e eVar, C5027b bVar) {
        this.f62405d = gVar;
        this.f62417p = gVar.r().g();
        this.f62407f = eVar;
        this.f62408g = bVar;
        this.f62410i.execute(new C5311i(this));
    }

    public boolean u() {
        return this.f62404c.get();
    }
}
