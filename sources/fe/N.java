package Fe;

import Fe.C3016e;
import Fe.C3023l;
import Fe.I;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class N {

    /* renamed from: g  reason: collision with root package name */
    private static N f30924g;

    /* renamed from: h  reason: collision with root package name */
    private static final Object f30925h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f30926a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f30927b;

    /* renamed from: c  reason: collision with root package name */
    private final List f30928c;

    /* renamed from: d  reason: collision with root package name */
    private final Semaphore f30929d = new Semaphore(1);

    /* renamed from: e  reason: collision with root package name */
    int f30930e = 0;

    /* renamed from: f  reason: collision with root package name */
    final ConcurrentHashMap f30931f = new ConcurrentHashMap();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f30932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30934c;

        a(CountDownLatch countDownLatch, int i10, b bVar) {
            this.f30932a = countDownLatch;
            this.f30933b = i10;
            this.f30934c = bVar;
        }

        public void run() {
            N.this.c(this.f30932a, this.f30933b, this.f30934c);
        }
    }

    private class b extends C3018g {

        /* renamed from: a  reason: collision with root package name */
        I f30936a;

        /* renamed from: b  reason: collision with root package name */
        final CountDownLatch f30937b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                N.this.v("onPostExecuteInner");
            }
        }

        public b(I i10, CountDownLatch countDownLatch) {
            this.f30936a = i10;
            this.f30937b = countDownLatch;
        }

        private void f(Q q10) {
            boolean z10;
            C3023l.l("onRequestSuccess " + q10);
            JSONObject c10 = q10.c();
            if (c10 == null) {
                this.f30936a.q(500, "Null response json.");
            }
            I i10 = this.f30936a;
            if ((i10 instanceof J) && c10 != null) {
                try {
                    C3016e.X().f31063j.put(((J) i10).R(), c10.getString("url"));
                } catch (JSONException e10) {
                    C3023l.m("Caught JSONException " + e10.getMessage());
                }
            }
            if (this.f30936a instanceof L) {
                if (!C3016e.X().r0() && c10 != null) {
                    try {
                        y yVar = y.SessionID;
                        boolean z11 = true;
                        if (c10.has(yVar.b())) {
                            C3016e.X().f31056c.Z0(c10.getString(yVar.b()));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y yVar2 = y.RandomizedBundleToken;
                        if (c10.has(yVar2.b())) {
                            String string = c10.getString(yVar2.b());
                            if (!C3016e.X().f31056c.P().equals(string)) {
                                C3016e.X().f31063j.clear();
                                C3016e.X().f31056c.U0(string);
                                z10 = true;
                            }
                        }
                        y yVar3 = y.RandomizedDeviceToken;
                        if (c10.has(yVar3.b())) {
                            C3016e.X().f31056c.V0(c10.getString(yVar3.b()));
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            N.this.z();
                        }
                    } catch (JSONException e11) {
                        C3023l.m("Caught JSONException " + e11.getMessage());
                    }
                }
                if (this.f30936a instanceof L) {
                    C3016e.X().Q0(C3016e.n.INITIALISED);
                    C3016e.X().n();
                    if (C3016e.X().f31071r != null) {
                        C3016e.X().f31071r.countDown();
                    }
                    if (C3016e.X().f31070q != null) {
                        C3016e.X().f31070q.countDown();
                    }
                }
            }
            if (c10 != null) {
                this.f30936a.x(q10, C3016e.X());
                N.this.w(this.f30936a);
            } else if (this.f30936a.H()) {
                this.f30936a.e();
            } else {
                N.this.w(this.f30936a);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Q doInBackground(Void... voidArr) {
            Q f10;
            this.f30936a.f();
            if (C3016e.X().g0().c() && !this.f30936a.z()) {
                return new Q(this.f30936a.n(), -117, "", "Tracking is disabled");
            }
            String r10 = C3016e.X().f31056c.r();
            Q q10 = null;
            try {
                if (this.f30936a.s()) {
                    f10 = C3016e.X().P().e(this.f30936a.o(), this.f30936a.k(), this.f30936a.n(), r10);
                } else {
                    C3023l.l("BranchPostTask doInBackground beginning rest post for " + this.f30936a);
                    f10 = C3016e.X().P().f(this.f30936a.m(N.this.f30931f), this.f30936a.o(), this.f30936a.n(), r10);
                }
                q10 = f10;
                CountDownLatch countDownLatch = this.f30937b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Exception e10) {
                C3023l.l("BranchPostTask doInBackground caught exception: " + e10.getMessage());
            }
            return q10;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Q q10) {
            super.onPostExecute(q10);
            d(q10);
        }

        /* access modifiers changed from: package-private */
        public void d(Q q10) {
            C3023l.l("onPostExecuteInner " + this + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q10);
            CountDownLatch countDownLatch = this.f30937b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            if (q10 == null) {
                this.f30936a.q(-122, "Null response.");
                return;
            }
            int d10 = q10.d();
            if (d10 == 200) {
                f(q10);
            } else {
                e(q10, d10);
            }
            N.this.f30930e = 0;
            new Handler(Looper.getMainLooper()).post(new a());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(Fe.Q r5, int r6) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onRequestFailed "
                r0.append(r1)
                java.lang.String r1 = r5.b()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                Fe.C3023l.l(r0)
                Fe.I r0 = r4.f30936a
                boolean r0 = r0 instanceof Fe.L
                if (r0 == 0) goto L_0x0039
                Fe.e r0 = Fe.C3016e.X()
                Fe.E r0 = r0.f31056c
                java.lang.String r0 = r0.Z()
                java.lang.String r1 = "bnc_no_value"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0039
                Fe.e r0 = Fe.C3016e.X()
                Fe.e$n r1 = Fe.C3016e.n.UNINITIALISED
                r0.Q0(r1)
            L_0x0039:
                r0 = 400(0x190, float:5.6E-43)
                if (r6 == r0) goto L_0x0041
                r1 = 409(0x199, float:5.73E-43)
                if (r6 != r1) goto L_0x004d
            L_0x0041:
                Fe.I r1 = r4.f30936a
                boolean r2 = r1 instanceof Fe.J
                if (r2 == 0) goto L_0x004d
                Fe.J r1 = (Fe.J) r1
                r1.T()
                goto L_0x0076
            L_0x004d:
                Fe.N r1 = Fe.N.this
                r2 = 0
                r1.f30930e = r2
                Fe.I r1 = r4.f30936a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r5.a()
                r2.append(r3)
                r2.append(r6)
                java.lang.String r3 = " "
                r2.append(r3)
                java.lang.String r5 = r5.b()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.q(r6, r5)
            L_0x0076:
                if (r0 > r6) goto L_0x007c
                r5 = 451(0x1c3, float:6.32E-43)
                if (r6 <= r5) goto L_0x00a0
            L_0x007c:
                r5 = -117(0xffffffffffffff8b, float:NaN)
                if (r6 != r5) goto L_0x0081
                goto L_0x00a0
            L_0x0081:
                Fe.I r5 = r4.f30936a
                boolean r5 = r5.H()
                if (r5 == 0) goto L_0x00a0
                Fe.I r5 = r4.f30936a
                int r5 = r5.f30903j
                Fe.e r6 = Fe.C3016e.X()
                Fe.E r6 = r6.f31056c
                int r6 = r6.N()
                if (r5 < r6) goto L_0x009a
                goto L_0x00a0
            L_0x009a:
                Fe.I r5 = r4.f30936a
                r5.e()
                goto L_0x00ab
            L_0x00a0:
                Fe.e r5 = Fe.C3016e.X()
                Fe.N r5 = r5.f31062i
                Fe.I r6 = r4.f30936a
                r5.w(r6)
            L_0x00ab:
                Fe.I r5 = r4.f30936a
                int r6 = r5.f30903j
                int r6 = r6 + 1
                r5.f30903j = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fe.N.b.e(Fe.Q, int):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            this.f30936a.v();
            this.f30936a.g();
        }
    }

    private N(Context context) {
        C3023l.l("Creating ServerRequestQueue " + context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.f30926a = sharedPreferences;
        this.f30927b = sharedPreferences.edit();
        List synchronizedList = Collections.synchronizedList(new LinkedList());
        this.f30928c = synchronizedList;
        C3023l.l("Created queue " + synchronizedList);
    }

    /* access modifiers changed from: private */
    public void c(CountDownLatch countDownLatch, int i10, b bVar) {
        try {
            if (!countDownLatch.await((long) i10, TimeUnit.MILLISECONDS)) {
                bVar.cancel(true);
                String n10 = bVar.f30936a.n();
                bVar.d(new Q(n10, -120, "", "Thread task timed out. Timeout: " + i10));
            }
        } catch (InterruptedException e10) {
            C3023l.b("Caught InterruptedException " + e10.getMessage());
            bVar.cancel(true);
            bVar.d(new Q(bVar.f30936a.n(), -120, "", e10.getMessage()));
        }
    }

    private void g(I i10, int i11) {
        C3023l.l("executeTimedBranchPostTask " + i10);
        if (i10 instanceof L) {
            C3023l.l("callback to be returned " + ((L) i10).f30922m);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        b bVar = new b(i10, countDownLatch);
        bVar.a(new Void[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(new a(countDownLatch, i11, bVar)).start();
        } else {
            c(countDownLatch, i11, bVar);
        }
    }

    public static N h(Context context) {
        if (f30924g == null) {
            synchronized (N.class) {
                try {
                    if (f30924g == null) {
                        f30924g = new N(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30924g;
    }

    private boolean l() {
        return !C3016e.X().f31056c.Q().equals("bnc_no_value");
    }

    private boolean m() {
        return !C3016e.X().f31056c.Y().equals("bnc_no_value");
    }

    private boolean q() {
        if (!m() || !l()) {
            return false;
        }
        return true;
    }

    private boolean x(I i10) {
        if (!(i10 instanceof L) && !(i10 instanceof J)) {
            return true;
        }
        return false;
    }

    public void b(String str, String str2) {
        this.f30931f.put(str, str2);
    }

    public boolean d() {
        int i10;
        synchronized (f30925h) {
            int i11 = 0;
            i10 = 0;
            while (i11 < this.f30928c.size()) {
                try {
                    if (this.f30928c.get(i11) instanceof L) {
                        i10++;
                    }
                    i11++;
                } finally {
                }
            }
        }
        if (i10 <= 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        synchronized (f30925h) {
            try {
                C3023l.l("Queue operation clear");
                this.f30928c.clear();
                C3023l.l("Queue cleared.");
            } catch (UnsupportedOperationException e10) {
                C3023l.b("Caught UnsupportedOperationException " + e10.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(I i10) {
        synchronized (f30925h) {
            try {
                C3023l.l("Queue operation enqueue. Request: " + i10);
                if (i10 != null) {
                    this.f30928c.add(i10);
                    if (j() >= 25) {
                        C3023l.l("Queue maxed out. Removing index 1.");
                        this.f30928c.remove(1);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public L i() {
        synchronized (f30925h) {
            try {
                for (I i10 : this.f30928c) {
                    C3023l.l("Checking if " + i10 + " is instanceof ServerRequestInitSession");
                    if (i10 instanceof L) {
                        L l10 = (L) i10;
                        C3023l.l(l10 + " is initiated by client: " + l10.f30923n);
                        if (l10.f30923n) {
                            return l10;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int j() {
        int size;
        synchronized (f30925h) {
            size = this.f30928c.size();
        }
        return size;
    }

    public void k(I i10) {
        C3023l.a("handleNewRequest " + i10);
        if (!C3016e.X().g0().c() || i10.z()) {
            if (C3016e.X().f31066m != C3016e.n.INITIALISED && !(i10 instanceof L) && x(i10)) {
                C3023l.a("handleNewRequest " + i10 + " needs a session");
                i10.d(I.b.SDK_INIT_WAIT_LOCK);
            }
            f(i10);
            i10.w();
            v("handleNewRequest");
            return;
        }
        String str = "Requested operation cannot be completed since tracking is disabled [" + i10.f30897d.b() + "]";
        C3023l.a(str);
        i10.q(-117, str);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return !C3016e.X().f31056c.P().equals("bnc_no_value");
    }

    /* access modifiers changed from: package-private */
    public void o(I i10, int i11) {
        synchronized (f30925h) {
            try {
                C3023l.l("Queue operation insert. Request: " + i10 + " Size: " + this.f30928c.size() + " Index: " + i11);
                if (this.f30928c.size() < i11) {
                    i11 = this.f30928c.size();
                }
                this.f30928c.add(i11, i10);
            } catch (IndexOutOfBoundsException e10) {
                C3023l.b("Caught IndexOutOfBoundsException " + e10.getMessage());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(I i10) {
        C3023l.l("Queue operation insertRequestAtFront " + i10 + " networkCount_: " + this.f30930e);
        if (this.f30930e == 0) {
            o(i10, 0);
        } else {
            o(i10, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public I r() {
        I i10;
        synchronized (f30925h) {
            try {
                i10 = (I) this.f30928c.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException e10) {
                C3023l.m("Caught Exception ServerRequestQueue peek: " + e10.getMessage());
                i10 = null;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public I s(int i10) {
        I i11;
        Throwable e10;
        synchronized (f30925h) {
            try {
                i11 = (I) this.f30928c.get(i10);
                try {
                    C3023l.l("Queue operation peekAt " + i11);
                } catch (IndexOutOfBoundsException | NoSuchElementException e11) {
                    e10 = e11;
                }
            } catch (IndexOutOfBoundsException | NoSuchElementException e12) {
                Throwable th2 = e12;
                i11 = null;
                e10 = th2;
                C3023l.b("Caught Exception ServerRequestQueue peekAt " + i10 + ": " + e10.getMessage());
                return i11;
            }
        }
        return i11;
    }

    public void t() {
        E d02 = C3016e.X().d0();
        boolean d10 = d();
        C3023l.l("postInitClear " + d02 + " can clear init data " + d10);
        if (d02 != null && d10) {
            d02.R0("bnc_no_value");
            d02.I0("bnc_no_value");
            d02.x0("bnc_no_value");
            d02.H0("bnc_no_value");
            d02.G0("bnc_no_value");
            d02.w0("bnc_no_value");
            d02.T0("bnc_no_value");
            d02.M0("bnc_no_value");
            d02.O0(false);
            d02.K0("bnc_no_value");
            if (d02.L("bnc_previous_update_time") == 0) {
                d02.S0("bnc_previous_update_time", d02.L("bnc_last_known_update_time"));
            }
        }
    }

    public void u() {
        if (C3023l.c().b() == C3023l.a.VERBOSE.b()) {
            synchronized (f30925h) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < this.f30928c.size(); i10++) {
                        sb2.append(this.f30928c.get(i10));
                        sb2.append(" with locks ");
                        sb2.append(((I) this.f30928c.get(i10)).A());
                        sb2.append("\n");
                    }
                    C3023l.l("Queue is: " + sb2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(String str) {
        C3023l.l("processNextQueueItem " + str);
        u();
        try {
            this.f30929d.acquire();
            if (this.f30930e != 0 || j() <= 0) {
                this.f30929d.release();
                return;
            }
            this.f30930e = 1;
            I r10 = r();
            this.f30929d.release();
            if (r10 != null) {
                C3023l.a("processNextQueueItem, req " + r10);
                if (!r10.u()) {
                    if (!(r10 instanceof O)) {
                        if (!n()) {
                            C3023l.a("Branch Error: User session has not been initialized!");
                            this.f30930e = 0;
                            C3023l.l("Invoking " + r10 + " handleFailure. Has no session. hasUser: " + n());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Request ");
                            sb2.append(r10);
                            sb2.append(" has no session.");
                            r10.q(-101, sb2.toString());
                            return;
                        }
                    }
                    if (!x(r10) || q()) {
                        g(r10, C3016e.X().f31056c.b0());
                        return;
                    }
                    this.f30930e = 0;
                    C3023l.l("Invoking " + r10 + " handleFailure. Has no session.");
                    r10.q(-101, "Request " + r10 + " has no session.");
                    return;
                }
                this.f30930e = 0;
                return;
            }
            w((I) null);
        } catch (Exception e10) {
            C3023l.b("Caught Exception " + str + " processNextQueueItem: " + e10.getMessage() + " stacktrace: " + C3023l.j(e10));
        }
    }

    public boolean w(I i10) {
        boolean z10;
        synchronized (f30925h) {
            z10 = false;
            try {
                C3023l.l("Queue operation remove. Request: " + i10);
                z10 = this.f30928c.remove(i10);
                C3023l.l("Queue operation remove. Removed: " + z10);
            } catch (UnsupportedOperationException e10) {
                C3023l.b("Caught UnsupportedOperationException " + e10.getMessage());
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void y(I.b bVar) {
        synchronized (f30925h) {
            try {
                for (I i10 : this.f30928c) {
                    if (i10 != null) {
                        i10.D(bVar);
                    }
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        JSONObject l10;
        int i10 = 0;
        while (i10 < j()) {
            try {
                I s10 = s(i10);
                C3023l.l("Queue operation updateAllRequestsInQueue updating: " + s10);
                if (!(s10 == null || (l10 = s10.l()) == null)) {
                    y yVar = y.SessionID;
                    if (l10.has(yVar.b())) {
                        s10.l().put(yVar.b(), C3016e.X().f31056c.Y());
                    }
                    y yVar2 = y.RandomizedBundleToken;
                    if (l10.has(yVar2.b())) {
                        s10.l().put(yVar2.b(), C3016e.X().f31056c.P());
                    }
                    y yVar3 = y.RandomizedDeviceToken;
                    if (l10.has(yVar3.b())) {
                        s10.l().put(yVar3.b(), C3016e.X().f31056c.Q());
                    }
                }
                i10++;
            } catch (JSONException e10) {
                C3023l.b("Caught JSONException " + e10.getMessage());
                return;
            }
        }
    }
}
