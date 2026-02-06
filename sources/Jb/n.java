package Jb;

import Jb.b;
import Jb.d;
import Jb.h;
import Kb.a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class n implements b.a, h {

    /* renamed from: H  reason: collision with root package name */
    private static long f51253H;

    /* renamed from: A  reason: collision with root package name */
    private String f51254A;

    /* renamed from: B  reason: collision with root package name */
    private long f51255B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public int f51256C = 0;

    /* renamed from: D  reason: collision with root package name */
    private int f51257D = 0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public ScheduledFuture f51258E = null;

    /* renamed from: F  reason: collision with root package name */
    private long f51259F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f51260G;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h.a f51261a;

    /* renamed from: b  reason: collision with root package name */
    private final f f51262b;

    /* renamed from: c  reason: collision with root package name */
    private String f51263c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet f51264d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private boolean f51265e = true;

    /* renamed from: f  reason: collision with root package name */
    private long f51266f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public b f51267g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public k f51268h = k.Disconnected;

    /* renamed from: i  reason: collision with root package name */
    private long f51269i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f51270j = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f51271k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Map f51272l;

    /* renamed from: m  reason: collision with root package name */
    private List f51273m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Map f51274n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Map f51275o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Map f51276p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public String f51277q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f51278r;

    /* renamed from: s  reason: collision with root package name */
    private String f51279s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f51280t;

    /* renamed from: u  reason: collision with root package name */
    private final c f51281u;

    /* renamed from: v  reason: collision with root package name */
    private final d f51282v;

    /* renamed from: w  reason: collision with root package name */
    private final d f51283w;

    /* renamed from: x  reason: collision with root package name */
    private final ScheduledExecutorService f51284x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final Sb.c f51285y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final Kb.a f51286z;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f51287a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f51287a = taskCompletionSource;
        }

        public void a(String str) {
            this.f51287a.setException(new Exception(str));
        }

        public void b(String str) {
            this.f51287a.setResult(str);
        }
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f51289a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f51289a = taskCompletionSource;
        }

        public void a(String str) {
            this.f51289a.setException(new Exception(str));
        }

        public void b(String str) {
            this.f51289a.setResult(str);
        }
    }

    class c implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f51291a;

        c(p pVar) {
            this.f51291a = pVar;
        }

        public void a(Map map) {
            String str;
            String str2 = (String) map.get("s");
            if (!str2.equals("ok")) {
                str = (String) map.get("d");
            } else {
                str2 = null;
                str = null;
            }
            p pVar = this.f51291a;
            if (pVar != null) {
                pVar.a(str2, str);
            }
        }
    }

    class d implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51293a;

        d(boolean z10) {
            this.f51293a = z10;
        }

        public void a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                k unused = n.this.f51268h = k.Connected;
                int unused2 = n.this.f51256C = 0;
                n.this.u0(this.f51293a);
                return;
            }
            String unused3 = n.this.f51277q = null;
            boolean unused4 = n.this.f51278r = true;
            n.this.f51261a.b(false);
            Sb.c E10 = n.this.f51285y;
            E10.b("Authentication failed: " + str + " (" + ((String) map.get("d")) + ")", new Object[0]);
            n.this.f51267g.c();
            if (str.equals("invalid_token")) {
                n.z(n.this);
                if (((long) n.this.f51256C) >= 3) {
                    n.this.f51286z.d();
                    n.this.f51285y.i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                }
            }
        }
    }

    class e implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f51295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f51296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f51297c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f51298d;

        e(String str, long j10, o oVar, p pVar) {
            this.f51295a = str;
            this.f51296b = j10;
            this.f51297c = oVar;
            this.f51298d = pVar;
        }

        public void a(Map map) {
            if (n.this.f51285y.f()) {
                Sb.c E10 = n.this.f51285y;
                E10.b(this.f51295a + " response: " + map, new Object[0]);
            }
            if (((o) n.this.f51274n.get(Long.valueOf(this.f51296b))) == this.f51297c) {
                n.this.f51274n.remove(Long.valueOf(this.f51296b));
                if (this.f51298d != null) {
                    String str = (String) map.get("s");
                    if (str.equals("ok")) {
                        this.f51298d.a((String) null, (String) null);
                    } else {
                        this.f51298d.a(str, (String) map.get("d"));
                    }
                }
            } else if (n.this.f51285y.f()) {
                Sb.c E11 = n.this.f51285y;
                E11.b("Ignoring on complete for put " + this.f51296b + " because it was removed already.", new Object[0]);
            }
            n.this.U();
        }
    }

    class f implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f51300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f51301b;

        f(Long l10, m mVar) {
            this.f51300a = l10;
            this.f51301b = mVar;
        }

        public void a(Map map) {
            if (((m) n.this.f51275o.get(this.f51300a)) == this.f51301b) {
                n.this.f51275o.remove(this.f51300a);
                this.f51301b.d().a(map);
            } else if (n.this.f51285y.f()) {
                Sb.c E10 = n.this.f51285y;
                E10.b("Ignoring on complete for get " + this.f51300a + " because it was removed already.", new Object[0]);
            }
        }
    }

    class g implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0788n f51303a;

        g(C0788n nVar) {
            this.f51303a = nVar;
        }

        public void a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                Map map2 = (Map) map.get("d");
                if (map2.containsKey("w")) {
                    n.this.L0((List) map2.get("w"), this.f51303a.f51321b);
                }
            }
            if (((C0788n) n.this.f51276p.get(this.f51303a.d())) != this.f51303a) {
                return;
            }
            if (!str.equals("ok")) {
                C0788n unused = n.this.p0(this.f51303a.d());
                this.f51303a.f51320a.a(str, (String) map.get("d"));
                return;
            }
            this.f51303a.f51320a.a((String) null, (String) null);
        }
    }

    class h implements j {
        h() {
        }

        public void a(Map map) {
            String str = (String) map.get("s");
            if (!str.equals("ok")) {
                String str2 = (String) map.get("d");
                if (n.this.f51285y.f()) {
                    Sb.c E10 = n.this.f51285y;
                    E10.b("Failed to send stats: " + str + " (message: " + str2 + ")", new Object[0]);
                }
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        public void run() {
            ScheduledFuture unused = n.this.f51258E = null;
            if (n.this.Z()) {
                n.this.k("connection_idle");
            } else {
                n.this.U();
            }
        }
    }

    private interface j {
        void a(Map map);
    }

    private enum k {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final String f51313a;

        /* renamed from: b  reason: collision with root package name */
        private final List f51314b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f51315c;

        /* renamed from: d  reason: collision with root package name */
        private final p f51316d;

        /* synthetic */ l(String str, List list, Object obj, p pVar, a aVar) {
            this(str, list, obj, pVar);
        }

        public String a() {
            return this.f51313a;
        }

        public Object b() {
            return this.f51315c;
        }

        public p c() {
            return this.f51316d;
        }

        public List d() {
            return this.f51314b;
        }

        private l(String str, List list, Object obj, p pVar) {
            this.f51313a = str;
            this.f51314b = list;
            this.f51315c = obj;
            this.f51316d = pVar;
        }
    }

    private static class m {

        /* renamed from: a  reason: collision with root package name */
        private final Map f51317a;

        /* renamed from: b  reason: collision with root package name */
        private final j f51318b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f51319c;

        /* synthetic */ m(String str, Map map, j jVar, a aVar) {
            this(str, map, jVar);
        }

        /* access modifiers changed from: private */
        public j d() {
            return this.f51318b;
        }

        /* access modifiers changed from: private */
        public Map e() {
            return this.f51317a;
        }

        /* access modifiers changed from: private */
        public boolean f() {
            if (this.f51319c) {
                return false;
            }
            this.f51319c = true;
            return true;
        }

        private m(String str, Map map, j jVar) {
            this.f51317a = map;
            this.f51318b = jVar;
            this.f51319c = false;
        }
    }

    /* renamed from: Jb.n$n  reason: collision with other inner class name */
    private static class C0788n {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final p f51320a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final p f51321b;

        /* renamed from: c  reason: collision with root package name */
        private final g f51322c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f51323d;

        /* synthetic */ C0788n(p pVar, p pVar2, Long l10, g gVar, a aVar) {
            this(pVar, pVar2, l10, gVar);
        }

        public g c() {
            return this.f51322c;
        }

        public p d() {
            return this.f51321b;
        }

        public Long e() {
            return this.f51323d;
        }

        public String toString() {
            return this.f51321b.toString() + " (Tag: " + this.f51323d + ")";
        }

        private C0788n(p pVar, p pVar2, Long l10, g gVar) {
            this.f51320a = pVar;
            this.f51321b = pVar2;
            this.f51322c = gVar;
            this.f51323d = l10;
        }
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private String f51324a;

        /* renamed from: b  reason: collision with root package name */
        private Map f51325b;

        /* renamed from: c  reason: collision with root package name */
        private p f51326c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f51327d;

        /* synthetic */ o(String str, Map map, p pVar, a aVar) {
            this(str, map, pVar);
        }

        public String a() {
            return this.f51324a;
        }

        public p b() {
            return this.f51326c;
        }

        public Map c() {
            return this.f51325b;
        }

        public void d() {
            this.f51327d = true;
        }

        public boolean e() {
            return this.f51327d;
        }

        private o(String str, Map map, p pVar) {
            this.f51324a = str;
            this.f51325b = map;
            this.f51326c = pVar;
        }
    }

    private static class p {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f51328a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Map f51329b;

        public p(List list, Map map) {
            this.f51328a = list;
            this.f51329b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (!this.f51328a.equals(pVar.f51328a)) {
                return false;
            }
            return this.f51329b.equals(pVar.f51329b);
        }

        public int hashCode() {
            return (this.f51328a.hashCode() * 31) + this.f51329b.hashCode();
        }

        public String toString() {
            return e.d(this.f51328a) + " (params: " + this.f51329b + ")";
        }
    }

    public n(c cVar, f fVar, h.a aVar) {
        this.f51261a = aVar;
        this.f51281u = cVar;
        ScheduledExecutorService e10 = cVar.e();
        this.f51284x = e10;
        this.f51282v = cVar.c();
        this.f51283w = cVar.a();
        this.f51262b = fVar;
        this.f51276p = new HashMap();
        this.f51272l = new HashMap();
        this.f51274n = new HashMap();
        this.f51275o = new ConcurrentHashMap();
        this.f51273m = new ArrayList();
        this.f51286z = new a.b(e10, cVar.f(), "ConnectionRetryHelper").d(1000).e(1.3d).c(30000).b(0.7d).a();
        long j10 = f51253H;
        f51253H = 1 + j10;
        Sb.d f10 = cVar.f();
        this.f51285y = new Sb.c(f10, "PersistentConnection", "pc_" + j10);
        this.f51254A = null;
        U();
    }

    private void A0(String str, List list, Object obj, p pVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", e.d(list));
        hashMap.put("d", obj);
        t0(str, hashMap, new c(pVar));
    }

    private void B0(long j10) {
        e.b(R(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        o oVar = (o) this.f51274n.get(Long.valueOf(j10));
        p b10 = oVar.b();
        String a10 = oVar.a();
        oVar.d();
        t0(a10, oVar.c(), new e(a10, j10, oVar, b10));
    }

    private void C0(String str, boolean z10, Map map, j jVar) {
        long h02 = h0();
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(h02));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.f51267g.m(hashMap, z10);
        this.f51272l.put(Long.valueOf(h02), jVar);
    }

    private void D0(Map map) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("c", map);
            t0("s", hashMap, new h());
        } else if (this.f51285y.f()) {
            this.f51285y.b("Not sending stats because stats are empty", new Object[0]);
        }
    }

    private void E0() {
        boolean z10;
        e.b(T(), "Must be connected to send unauth.", new Object[0]);
        if (this.f51279s == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.b(z10, "App check token must not be set.", new Object[0]);
        t0("unappcheck", Collections.emptyMap(), (j) null);
    }

    private void F0() {
        boolean z10;
        e.b(T(), "Must be connected to send unauth.", new Object[0]);
        if (this.f51277q == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.b(z10, "Auth token must not be set.", new Object[0]);
        t0("unauth", Collections.emptyMap(), (j) null);
    }

    private void G0(C0788n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", e.d(nVar.f51321b.f51328a));
        Long e10 = nVar.e();
        if (e10 != null) {
            hashMap.put("q", nVar.d().f51329b);
            hashMap.put("t", e10);
        }
        t0("n", hashMap, (j) null);
    }

    private void I0() {
        boolean z10;
        if (H0()) {
            k kVar = this.f51268h;
            if (kVar == k.Disconnected) {
                z10 = true;
            } else {
                z10 = false;
            }
            e.b(z10, "Not in disconnected state: %s", kVar);
            boolean z11 = this.f51278r;
            boolean z12 = this.f51280t;
            this.f51285y.b("Scheduling connection attempt", new Object[0]);
            this.f51278r = false;
            this.f51280t = false;
            this.f51286z.c(new i(this, z11, z12));
        }
    }

    private void J0() {
        u0(false);
    }

    private void K0() {
        w0(false);
    }

    /* access modifiers changed from: private */
    public void L0(List list, p pVar) {
        if (list.contains("no_index")) {
            Sb.c cVar = this.f51285y;
            cVar.i("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + ("\".indexOn\": \"" + pVar.f51329b.get("i") + '\"') + "' at " + e.d(pVar.f51328a) + " to your security and Firebase Database rules for better performance");
        }
    }

    private boolean Q() {
        if (this.f51268h == k.Connected) {
            return true;
        }
        return false;
    }

    private boolean R() {
        if (this.f51268h == k.Connected) {
            return true;
        }
        return false;
    }

    private void S() {
        ArrayList<o> arrayList = new ArrayList<>();
        Iterator it = this.f51274n.entrySet().iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            if (oVar.c().containsKey("h") && oVar.e()) {
                arrayList.add(oVar);
                it.remove();
            }
        }
        for (o b10 : arrayList) {
            b10.b().a("disconnected", (String) null);
        }
    }

    private boolean T() {
        k kVar = this.f51268h;
        if (kVar == k.Authenticating || kVar == k.Connected) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void U() {
        if (a0()) {
            ScheduledFuture scheduledFuture = this.f51258E;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f51258E = this.f51284x.schedule(new i(), 60000, TimeUnit.MILLISECONDS);
        } else if (b0("connection_idle")) {
            e.a(!a0());
            n("connection_idle");
        }
    }

    private Task V(boolean z10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51285y.b("Trying to fetch app check token", new Object[0]);
        this.f51283w.a(z10, new b(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task W(boolean z10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51285y.b("Trying to fetch auth token", new Object[0]);
        this.f51282v.a(z10, new a(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Map X(List list, Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", e.d(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    private void Y(long j10) {
        if (this.f51285y.f()) {
            this.f51285y.b("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j10 - System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.f51261a.c(hashMap);
    }

    /* access modifiers changed from: private */
    public boolean Z() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!a0() || currentTimeMillis <= this.f51259F + 60000) {
            return false;
        }
        return true;
    }

    private boolean a0() {
        if (!this.f51276p.isEmpty() || !this.f51275o.isEmpty() || !this.f51272l.isEmpty() || this.f51260G || !this.f51274n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0(TaskCompletionSource taskCompletionSource, Map map) {
        if (((String) map.get("s")).equals("ok")) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(boolean z10, Map map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            this.f51257D = 0;
        } else {
            this.f51279s = null;
            this.f51280t = true;
            Sb.c cVar = this.f51285y;
            cVar.b("App check failed: " + str + " (" + ((String) map.get("d")) + ")", new Object[0]);
        }
        if (z10) {
            r0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e0(long j10, Task task, Task task2, Void voidR) {
        if (j10 == this.f51255B) {
            k kVar = this.f51268h;
            if (kVar == k.GettingToken) {
                this.f51285y.b("Successfully fetched token, opening connection", new Object[0]);
                n0((String) task.getResult(), (String) task2.getResult());
            } else if (kVar == k.Disconnected) {
                this.f51285y.b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
            }
        } else {
            this.f51285y.b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f0(long j10, Exception exc) {
        if (j10 == this.f51255B) {
            this.f51268h = k.Disconnected;
            Sb.c cVar = this.f51285y;
            cVar.b("Error fetching token: " + exc, new Object[0]);
            I0();
            return;
        }
        this.f51285y.b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0(boolean z10, boolean z11) {
        boolean z12;
        k kVar = this.f51268h;
        if (kVar == k.Disconnected) {
            z12 = true;
        } else {
            z12 = false;
        }
        e.b(z12, "Not in disconnected state: %s", kVar);
        this.f51268h = k.GettingToken;
        long j10 = this.f51255B + 1;
        this.f51255B = j10;
        Task W10 = W(z10);
        Task V10 = V(z11);
        Tasks.whenAll((Task<?>[]) new Task[]{W10, V10}).addOnSuccessListener((Executor) this.f51284x, new j(this, j10, W10, V10)).addOnFailureListener((Executor) this.f51284x, (OnFailureListener) new k(this, j10));
    }

    private long h0() {
        long j10 = this.f51271k;
        this.f51271k = 1 + j10;
        return j10;
    }

    private void i0(String str, String str2) {
        Sb.c cVar = this.f51285y;
        cVar.b("App check token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f51279s = null;
        this.f51280t = true;
    }

    private void j0(String str, String str2) {
        Sb.c cVar = this.f51285y;
        cVar.b("Auth token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f51277q = null;
        this.f51278r = true;
        this.f51261a.b(false);
        this.f51267g.c();
    }

    private void k0(String str, Map map) {
        List list;
        if (this.f51285y.f()) {
            this.f51285y.b("handleServerMessage: " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + map, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            String str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long c10 = e.c(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f51261a.a(e.e(str2), obj, equals, c10);
            } else if (this.f51285y.f()) {
                this.f51285y.b("ignoring empty merge for path " + str2, new Object[0]);
            }
        } else if (str.equals("rm")) {
            String str3 = (String) map.get("p");
            List e10 = e.e(str3);
            Object obj2 = map.get("d");
            Long c11 = e.c(map.get("t"));
            ArrayList arrayList = new ArrayList();
            for (Map map2 : (List) obj2) {
                String str4 = (String) map2.get("s");
                String str5 = (String) map2.get("e");
                List list2 = null;
                if (str4 != null) {
                    list = e.e(str4);
                } else {
                    list = null;
                }
                if (str5 != null) {
                    list2 = e.e(str5);
                }
                arrayList.add(new o(list, list2, map2.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.f51261a.d(e10, arrayList, c11);
            } else if (this.f51285y.f()) {
                this.f51285y.b("Ignoring empty range merge for path " + str3, new Object[0]);
            }
        } else if (str.equals("c")) {
            l0(e.e((String) map.get("p")));
        } else if (str.equals("ac")) {
            j0((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("apc")) {
            i0((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("sd")) {
            m0(map);
        } else if (this.f51285y.f()) {
            this.f51285y.b("Unrecognized action from server: " + str, new Object[0]);
        }
    }

    private void l0(List list) {
        Collection<C0788n> q02 = q0(list);
        if (q02 != null) {
            for (C0788n b10 : q02) {
                b10.f51320a.a("permission_denied", (String) null);
            }
        }
    }

    private void m0(Map map) {
        this.f51285y.e((String) map.get("msg"));
    }

    private void o0(String str, List list, Object obj, String str2, p pVar) {
        Map X10 = X(list, obj, str2);
        long j10 = this.f51269i;
        this.f51269i = 1 + j10;
        this.f51274n.put(Long.valueOf(j10), new o(str, X10, pVar, (a) null));
        if (R()) {
            B0(j10);
        }
        this.f51259F = System.currentTimeMillis();
        U();
    }

    /* access modifiers changed from: private */
    public C0788n p0(p pVar) {
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("removing query " + pVar, new Object[0]);
        }
        if (this.f51276p.containsKey(pVar)) {
            C0788n nVar = (C0788n) this.f51276p.get(pVar);
            this.f51276p.remove(pVar);
            U();
            return nVar;
        } else if (!this.f51285y.f()) {
            return null;
        } else {
            Sb.c cVar2 = this.f51285y;
            cVar2.b("Trying to remove listener for QuerySpec " + pVar + " but no listener exists.", new Object[0]);
            return null;
        }
    }

    private Collection q0(List list) {
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("removing all listens at path " + list, new Object[0]);
        }
        ArrayList<C0788n> arrayList = new ArrayList<>();
        for (Map.Entry entry : this.f51276p.entrySet()) {
            C0788n nVar = (C0788n) entry.getValue();
            if (((p) entry.getKey()).f51328a.equals(list)) {
                arrayList.add(nVar);
            }
        }
        for (C0788n d10 : arrayList) {
            this.f51276p.remove(d10.d());
        }
        U();
        return arrayList;
    }

    private void r0() {
        boolean z10;
        k kVar = this.f51268h;
        if (kVar == k.Connected) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.b(z10, "Should be connected if we're restoring state, but we are: %s", kVar);
        if (this.f51285y.f()) {
            this.f51285y.b("Restoring outstanding listens", new Object[0]);
        }
        for (C0788n nVar : this.f51276p.values()) {
            if (this.f51285y.f()) {
                this.f51285y.b("Restoring listen " + nVar.d(), new Object[0]);
            }
            z0(nVar);
        }
        if (this.f51285y.f()) {
            this.f51285y.b("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f51274n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B0(((Long) it.next()).longValue());
        }
        for (l lVar : this.f51273m) {
            A0(lVar.a(), lVar.d(), lVar.b(), lVar.c());
        }
        this.f51273m.clear();
        if (this.f51285y.f()) {
            this.f51285y.b("Restoring reads.", new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList(this.f51275o.keySet());
        Collections.sort(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            y0((Long) it2.next());
        }
    }

    private void s0() {
        boolean z10;
        if (this.f51285y.f()) {
            this.f51285y.b("calling restore tokens", new Object[0]);
        }
        k kVar = this.f51268h;
        if (kVar == k.Connecting) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.b(z10, "Wanted to restore tokens, but was in wrong state: %s", kVar);
        if (this.f51277q != null) {
            if (this.f51285y.f()) {
                this.f51285y.b("Restoring auth.", new Object[0]);
            }
            this.f51268h = k.Authenticating;
            v0();
            return;
        }
        if (this.f51285y.f()) {
            this.f51285y.b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.f51268h = k.Connected;
        u0(true);
    }

    private void t0(String str, Map map, j jVar) {
        C0(str, false, map, jVar);
    }

    /* access modifiers changed from: private */
    public void u0(boolean z10) {
        boolean z11;
        if (this.f51279s == null) {
            r0();
            return;
        }
        e.b(T(), "Must be connected to send auth, but was: %s", this.f51268h);
        if (this.f51285y.f()) {
            this.f51285y.b("Sending app check.", new Object[0]);
        }
        l lVar = new l(this, z10);
        HashMap hashMap = new HashMap();
        if (this.f51279s != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        e.b(z11, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f51279s);
        C0("appcheck", true, hashMap, lVar);
    }

    private void v0() {
        w0(true);
    }

    private void w0(boolean z10) {
        e.b(T(), "Must be connected to send auth, but was: %s", this.f51268h);
        if (this.f51285y.f()) {
            this.f51285y.b("Sending auth.", new Object[0]);
        }
        d dVar = new d(z10);
        HashMap hashMap = new HashMap();
        Vb.a c10 = Vb.a.c(this.f51277q);
        if (c10 != null) {
            hashMap.put("cred", c10.b());
            if (c10.a() != null) {
                hashMap.put("authvar", c10.a());
            }
            C0("gauth", true, hashMap, dVar);
            return;
        }
        hashMap.put("cred", this.f51277q);
        C0("auth", true, hashMap, dVar);
    }

    private void x0() {
        HashMap hashMap = new HashMap();
        if (this.f51281u.i()) {
            hashMap.put("persistence.android.enabled", 1);
        }
        hashMap.put("sdk.android." + this.f51281u.d().replace('.', '-'), 1);
        if (this.f51285y.f()) {
            this.f51285y.b("Sending first connection stats", new Object[0]);
        }
        D0(hashMap);
    }

    private void y0(Long l10) {
        e.b(Q(), "sendGet called when we can't send gets", new Object[0]);
        m mVar = (m) this.f51275o.get(l10);
        if (mVar.f() || !this.f51285y.f()) {
            t0("g", mVar.e(), new f(l10, mVar));
            return;
        }
        Sb.c cVar = this.f51285y;
        cVar.b(com.amazon.a.a.o.b.au + l10 + " cancelled, ignoring.", new Object[0]);
    }

    static /* synthetic */ int z(n nVar) {
        int i10 = nVar.f51256C;
        nVar.f51256C = i10 + 1;
        return i10;
    }

    private void z0(C0788n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", e.d(nVar.d().f51328a));
        Long e10 = nVar.e();
        if (e10 != null) {
            hashMap.put("q", nVar.f51321b.f51329b);
            hashMap.put("t", e10);
        }
        g c10 = nVar.c();
        hashMap.put("h", c10.a());
        if (c10.c()) {
            a b10 = c10.b();
            ArrayList arrayList = new ArrayList();
            for (List d10 : b10.b()) {
                arrayList.add(e.d(d10));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", b10.a());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        t0("q", hashMap, new g(nVar));
    }

    /* access modifiers changed from: package-private */
    public boolean H0() {
        if (this.f51264d.size() == 0) {
            return true;
        }
        return false;
    }

    public void a(List list, Object obj, p pVar) {
        o0("p", list, obj, (String) null, pVar);
    }

    public void b(List list, Map map, p pVar) {
        o0("m", list, map, (String) null, pVar);
    }

    public boolean b0(String str) {
        return this.f51264d.contains(str);
    }

    public void c(List list, Map map, p pVar) {
        this.f51260G = true;
        if (R()) {
            A0("om", list, map, pVar);
        } else {
            this.f51273m.add(new l("om", list, map, pVar, (a) null));
        }
        U();
    }

    public void d(String str) {
        if (str.equals("Invalid appcheck token")) {
            int i10 = this.f51257D;
            if (((long) i10) < 3) {
                this.f51257D = i10 + 1;
                Sb.c cVar = this.f51285y;
                cVar.i("Detected invalid AppCheck token. Reconnecting (" + (3 - ((long) this.f51257D)) + " attempts remaining)");
                return;
            }
        }
        Sb.c cVar2 = this.f51285y;
        cVar2.i("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: " + str);
        k("server_kill");
    }

    public void e(List list, Map map, g gVar, Long l10, p pVar) {
        p pVar2 = new p(list, map);
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("Listening on " + pVar2, new Object[0]);
        }
        e.b(!this.f51276p.containsKey(pVar2), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f51285y.f()) {
            Sb.c cVar2 = this.f51285y;
            cVar2.b("Adding listen query: " + pVar2, new Object[0]);
        }
        C0788n nVar = new C0788n(pVar, pVar2, l10, gVar, (a) null);
        this.f51276p.put(pVar2, nVar);
        if (T()) {
            z0(nVar);
        }
        U();
    }

    public void f(Map map) {
        if (map.containsKey("r")) {
            j jVar = (j) this.f51272l.remove(Long.valueOf((long) ((Integer) map.get("r")).intValue()));
            if (jVar != null) {
                jVar.a((Map) map.get("b"));
            }
        } else if (!map.containsKey(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)) {
            if (map.containsKey("a")) {
                k0((String) map.get("a"), (Map) map.get("b"));
            } else if (this.f51285y.f()) {
                Sb.c cVar = this.f51285y;
                cVar.b("Ignoring unknown message: " + map, new Object[0]);
            }
        }
    }

    public void g(List list, Map map) {
        p pVar = new p(list, map);
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("unlistening on " + pVar, new Object[0]);
        }
        C0788n p02 = p0(pVar);
        if (p02 != null && T()) {
            G0(p02);
        }
        U();
    }

    public Task h(List list, Map map) {
        p pVar = new p(list, map);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        long j10 = this.f51270j;
        this.f51270j = 1 + j10;
        HashMap hashMap = new HashMap();
        hashMap.put("p", e.d(pVar.f51328a));
        hashMap.put("q", pVar.f51329b);
        this.f51275o.put(Long.valueOf(j10), new m("g", hashMap, new m(taskCompletionSource), (a) null));
        if (Q()) {
            y0(Long.valueOf(j10));
        }
        U();
        return taskCompletionSource.getTask();
    }

    public void i(List list, p pVar) {
        if (R()) {
            A0("oc", list, (Object) null, pVar);
        } else {
            this.f51273m.add(new l("oc", list, (Object) null, pVar, (a) null));
        }
        U();
    }

    public void initialize() {
        I0();
    }

    public void j(List list, Object obj, String str, p pVar) {
        o0("p", list, obj, str, pVar);
    }

    public void k(String str) {
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("Connection interrupted for: " + str, new Object[0]);
        }
        this.f51264d.add(str);
        b bVar = this.f51267g;
        if (bVar != null) {
            bVar.c();
            this.f51267g = null;
        } else {
            this.f51286z.b();
            this.f51268h = k.Disconnected;
        }
        this.f51286z.e();
    }

    public void l(List list, Object obj, p pVar) {
        this.f51260G = true;
        if (R()) {
            A0("o", list, obj, pVar);
        } else {
            this.f51273m.add(new l("o", list, obj, pVar, (a) null));
        }
        U();
    }

    public void m(String str) {
        this.f51263c = str;
    }

    public void n(String str) {
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("Connection no longer interrupted for: " + str, new Object[0]);
        }
        this.f51264d.remove(str);
        if (H0() && this.f51268h == k.Disconnected) {
            I0();
        }
    }

    public void n0(String str, String str2) {
        boolean z10;
        k kVar = this.f51268h;
        if (kVar == k.GettingToken) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.b(z10, "Trying to open network connection while in the wrong state: %s", kVar);
        if (str == null) {
            this.f51261a.b(false);
        }
        this.f51277q = str;
        this.f51279s = str2;
        this.f51268h = k.Connecting;
        b bVar = new b(this.f51281u, this.f51262b, this.f51263c, this, this.f51254A, str2);
        this.f51267g = bVar;
        bVar.k();
    }

    public void o(long j10, String str) {
        if (this.f51285y.f()) {
            this.f51285y.b("onReady", new Object[0]);
        }
        this.f51266f = System.currentTimeMillis();
        Y(j10);
        if (this.f51265e) {
            x0();
        }
        s0();
        this.f51265e = false;
        this.f51254A = str;
        this.f51261a.onConnect();
    }

    public void p(String str) {
        this.f51285y.b("Auth token refreshed.", new Object[0]);
        this.f51277q = str;
        if (!T()) {
            return;
        }
        if (str != null) {
            K0();
        } else {
            F0();
        }
    }

    public void q(b.C0787b bVar) {
        boolean z10 = false;
        if (this.f51285y.f()) {
            Sb.c cVar = this.f51285y;
            cVar.b("Got on disconnect due to " + bVar.name(), new Object[0]);
        }
        this.f51268h = k.Disconnected;
        this.f51267g = null;
        this.f51260G = false;
        this.f51272l.clear();
        S();
        if (H0()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f51266f;
            long j11 = currentTimeMillis - j10;
            if (j10 > 0 && j11 > 30000) {
                z10 = true;
            }
            if (bVar == b.C0787b.SERVER_RESET || z10) {
                this.f51286z.e();
            }
            I0();
        }
        this.f51266f = 0;
        this.f51261a.onDisconnect();
    }

    public void r(String str) {
        this.f51285y.b("App check token refreshed.", new Object[0]);
        this.f51279s = str;
        if (!T()) {
            return;
        }
        if (str != null) {
            J0();
        } else {
            E0();
        }
    }
}
