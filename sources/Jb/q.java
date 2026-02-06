package Jb;

import Ub.g;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class q {

    /* renamed from: l  reason: collision with root package name */
    private static long f51333l;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d f51334a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f51335b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51336c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f51337d = 0;

    /* renamed from: e  reason: collision with root package name */
    private Kb.b f51338e;

    /* renamed from: f  reason: collision with root package name */
    private c f51339f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture f51340g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public ScheduledFuture f51341h;

    /* renamed from: i  reason: collision with root package name */
    private final c f51342i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final ScheduledExecutorService f51343j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Sb.c f51344k;

    class a implements Runnable {
        a() {
        }

        public void run() {
            q.this.l();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (q.this.f51334a != null) {
                q.this.f51334a.send("0");
                q.this.u();
            }
        }
    }

    public interface c {
        void a(boolean z10);

        void b(Map map);
    }

    private interface d {
        void close();

        void connect();

        void send(String str);
    }

    private class e implements d, Ub.d {

        /* renamed from: a  reason: collision with root package name */
        private Ub.c f51347a;

        class a implements Runnable {
            a() {
            }

            public void run() {
                q.this.f51341h.cancel(false);
                boolean unused = q.this.f51335b = true;
                if (q.this.f51344k.f()) {
                    q.this.f51344k.b("websocket opened", new Object[0]);
                }
                q.this.u();
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f51350a;

            b(String str) {
                this.f51350a = str;
            }

            public void run() {
                q.this.o(this.f51350a);
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                if (q.this.f51344k.f()) {
                    q.this.f51344k.b(MetricTracker.Action.CLOSED, new Object[0]);
                }
                q.this.s();
            }
        }

        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Ub.e f51353a;

            d(Ub.e eVar) {
                this.f51353a = eVar;
            }

            public void run() {
                if (this.f51353a.getCause() == null || !(this.f51353a.getCause() instanceof EOFException)) {
                    q.this.f51344k.a("WebSocket error.", this.f51353a, new Object[0]);
                } else {
                    q.this.f51344k.b("WebSocket reached EOF.", new Object[0]);
                }
                q.this.s();
            }
        }

        /* synthetic */ e(q qVar, Ub.c cVar, a aVar) {
            this(cVar);
        }

        private void e() {
            this.f51347a.c();
            try {
                this.f51347a.b();
            } catch (InterruptedException e10) {
                q.this.f51344k.c("Interrupted while shutting down websocket threads", e10);
            }
        }

        public void a() {
            q.this.f51343j.execute(new c());
        }

        public void b(Ub.e eVar) {
            q.this.f51343j.execute(new d(eVar));
        }

        public void c() {
            q.this.f51343j.execute(new a());
        }

        public void close() {
            this.f51347a.c();
        }

        public void connect() {
            try {
                this.f51347a.e();
            } catch (Ub.e e10) {
                if (q.this.f51344k.f()) {
                    q.this.f51344k.a("Error connecting", e10, new Object[0]);
                }
                e();
            }
        }

        public void d(g gVar) {
            String a10 = gVar.a();
            if (q.this.f51344k.f()) {
                Sb.c c10 = q.this.f51344k;
                c10.b("ws message: " + a10, new Object[0]);
            }
            q.this.f51343j.execute(new b(a10));
        }

        public void send(String str) {
            this.f51347a.p(str);
        }

        private e(Ub.c cVar) {
            this.f51347a = cVar;
            cVar.r(this);
        }
    }

    public q(c cVar, f fVar, String str, String str2, c cVar2, String str3) {
        this.f51342i = cVar;
        this.f51343j = cVar.e();
        this.f51339f = cVar2;
        long j10 = f51333l;
        f51333l = 1 + j10;
        Sb.d f10 = cVar.f();
        this.f51344k = new Sb.c(f10, "WebSocket", "ws_" + j10);
        this.f51334a = m(fVar, str, str2, str3);
    }

    private void j(String str) {
        this.f51338e.a(str);
        long j10 = this.f51337d - 1;
        this.f51337d = j10;
        if (j10 == 0) {
            try {
                this.f51338e.q();
                Map a10 = Vb.b.a(this.f51338e.toString());
                this.f51338e = null;
                if (this.f51344k.f()) {
                    Sb.c cVar = this.f51344k;
                    cVar.b("handleIncomingFrame complete frame: " + a10, new Object[0]);
                }
                this.f51339f.b(a10);
            } catch (IOException e10) {
                Sb.c cVar2 = this.f51344k;
                cVar2.c("Error parsing frame: " + this.f51338e.toString(), e10);
                k();
                w();
            } catch (ClassCastException e11) {
                Sb.c cVar3 = this.f51344k;
                cVar3.c("Error parsing frame (cast error): " + this.f51338e.toString(), e11);
                k();
                w();
            }
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!this.f51335b && !this.f51336c) {
            if (this.f51344k.f()) {
                this.f51344k.b("timed out on connect", new Object[0]);
            }
            this.f51334a.close();
        }
    }

    private d m(f fVar, String str, String str2, String str3) {
        if (str == null) {
            str = fVar.b();
        }
        URI a10 = f.a(str, fVar.d(), fVar.c(), str3);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f51342i.h());
        hashMap.put("X-Firebase-GMPID", this.f51342i.b());
        hashMap.put("X-Firebase-AppCheck", str2);
        return new e(this, new Ub.c(this.f51342i, a10, (String) null, hashMap), (a) null);
    }

    private String n(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= 0) {
                    return null;
                }
                p(parseInt);
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        p(1);
        return str;
    }

    /* access modifiers changed from: private */
    public void o(String str) {
        if (!this.f51336c) {
            u();
            if (q()) {
                j(str);
                return;
            }
            String n10 = n(str);
            if (n10 != null) {
                j(n10);
            }
        }
    }

    private void p(int i10) {
        this.f51337d = (long) i10;
        this.f51338e = new Kb.b();
        if (this.f51344k.f()) {
            Sb.c cVar = this.f51344k;
            cVar.b("HandleNewFrameCount: " + this.f51337d, new Object[0]);
        }
    }

    private boolean q() {
        if (this.f51338e != null) {
            return true;
        }
        return false;
    }

    private Runnable r() {
        return new b();
    }

    /* access modifiers changed from: private */
    public void s() {
        if (!this.f51336c) {
            if (this.f51344k.f()) {
                this.f51344k.b("closing itself", new Object[0]);
            }
            w();
        }
        this.f51334a = null;
        ScheduledFuture scheduledFuture = this.f51340g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        if (!this.f51336c) {
            ScheduledFuture scheduledFuture = this.f51340g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                if (this.f51344k.f()) {
                    Sb.c cVar = this.f51344k;
                    cVar.b("Reset keepAlive. Remaining: " + this.f51340g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
                }
            } else if (this.f51344k.f()) {
                this.f51344k.b("Reset keepAlive", new Object[0]);
            }
            this.f51340g = this.f51343j.schedule(r(), 45000, TimeUnit.MILLISECONDS);
        }
    }

    private void w() {
        this.f51336c = true;
        this.f51339f.a(this.f51335b);
    }

    private static String[] x(String str, int i10) {
        if (str.length() <= i10) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < str.length()) {
            int i12 = i11 + i10;
            arrayList.add(str.substring(i11, Math.min(i12, str.length())));
            i11 = i12;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void k() {
        if (this.f51344k.f()) {
            this.f51344k.b("websocket is being closed", new Object[0]);
        }
        this.f51336c = true;
        this.f51334a.close();
        ScheduledFuture scheduledFuture = this.f51341h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f51340g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public void t() {
        this.f51334a.connect();
        this.f51341h = this.f51343j.schedule(new a(), 30000, TimeUnit.MILLISECONDS);
    }

    public void v(Map map) {
        u();
        try {
            String[] x10 = x(Vb.b.c(map), 16384);
            if (x10.length > 1) {
                this.f51334a.send("" + x10.length);
            }
            for (String send : x10) {
                this.f51334a.send(send);
            }
        } catch (IOException e10) {
            this.f51344k.c("Failed to serialize message: " + map.toString(), e10);
            w();
        }
    }

    public void y() {
    }
}
