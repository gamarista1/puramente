package p2;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import f2.C1973h;
import i2.C2076a;
import i2.C2082g;
import i2.C2083h;
import i2.L;
import i2.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l2.C2170b;
import n2.u1;
import p2.C2390A;
import p2.C2409m;
import p2.t;
import t2.C2613A;
import t2.C2658x;
import w2.C2827i;

/* renamed from: p2.g  reason: case insensitive filesystem */
class C2403g implements C2409m {

    /* renamed from: a  reason: collision with root package name */
    public final List f25202a;

    /* renamed from: b  reason: collision with root package name */
    private final C2390A f25203b;

    /* renamed from: c  reason: collision with root package name */
    private final a f25204c;

    /* renamed from: d  reason: collision with root package name */
    private final b f25205d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25206e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f25207f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f25208g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f25209h;

    /* renamed from: i  reason: collision with root package name */
    private final C2083h f25210i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C2827i f25211j;

    /* renamed from: k  reason: collision with root package name */
    private final u1 f25212k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final L f25213l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final UUID f25214m;

    /* renamed from: n  reason: collision with root package name */
    private final Looper f25215n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final e f25216o;

    /* renamed from: p  reason: collision with root package name */
    private int f25217p;

    /* renamed from: q  reason: collision with root package name */
    private int f25218q;

    /* renamed from: r  reason: collision with root package name */
    private HandlerThread f25219r;

    /* renamed from: s  reason: collision with root package name */
    private c f25220s;

    /* renamed from: t  reason: collision with root package name */
    private C2170b f25221t;

    /* renamed from: u  reason: collision with root package name */
    private C2409m.a f25222u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f25223v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f25224w;

    /* renamed from: x  reason: collision with root package name */
    private C2390A.a f25225x;

    /* renamed from: y  reason: collision with root package name */
    private C2390A.d f25226y;

    /* renamed from: p2.g$a */
    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(C2403g gVar);
    }

    /* renamed from: p2.g$b */
    public interface b {
        void a(C2403g gVar, int i10);

        void b(C2403g gVar, int i10);
    }

    /* renamed from: p2.g$c */
    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25227a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, M m10) {
            IOException iOException;
            M m11 = m10;
            d dVar = (d) message.obj;
            if (!dVar.f25230b) {
                return false;
            }
            int i10 = dVar.f25233e + 1;
            dVar.f25233e = i10;
            if (i10 > C2403g.this.f25211j.a(3)) {
                return false;
            }
            C2658x xVar = new C2658x(dVar.f25229a, m11.f25195a, m11.f25196b, m11.f25197c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f25231c, m11.f25198d);
            C2613A a10 = new C2613A(3);
            if (m10.getCause() instanceof IOException) {
                iOException = (IOException) m10.getCause();
            } else {
                iOException = new f(m10.getCause());
            }
            long c10 = C2403g.this.f25211j.c(new C2827i.a(xVar, a10, iOException, dVar.f25233e));
            if (c10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f25227a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), c10);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C2658x.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages((Object) null);
            this.f25227a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: p2.M} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: p2.M} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: p2.M} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                p2.g$d r0 = (p2.C2403g.d) r0
                int r1 = r6.what     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                r2 = 1
                if (r1 == r2) goto L_0x002b
                r2 = 2
                if (r1 != r2) goto L_0x0025
                p2.g r1 = p2.C2403g.this     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.L r1 = r1.f25213l     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.g r2 = p2.C2403g.this     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                java.util.UUID r2 = r2.f25214m     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                java.lang.Object r3 = r0.f25232d     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.A$a r3 = (p2.C2390A.a) r3     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                byte[] r1 = r1.a(r2, r3)     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                goto L_0x004f
            L_0x0021:
                r1 = move-exception
                goto L_0x0040
            L_0x0023:
                r1 = move-exception
                goto L_0x0048
            L_0x0025:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                r1.<init>()     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                throw r1     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
            L_0x002b:
                p2.g r1 = p2.C2403g.this     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.L r1 = r1.f25213l     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.g r2 = p2.C2403g.this     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                java.util.UUID r2 = r2.f25214m     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                java.lang.Object r3 = r0.f25232d     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                p2.A$d r3 = (p2.C2390A.d) r3     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                byte[] r1 = r1.b(r2, r3)     // Catch:{ M -> 0x0023, Exception -> 0x0021 }
                goto L_0x004f
            L_0x0040:
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                i2.p.i(r2, r3, r1)
                goto L_0x004f
            L_0x0048:
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x004f
                return
            L_0x004f:
                p2.g r2 = p2.C2403g.this
                w2.i r2 = r2.f25211j
                long r3 = r0.f25229a
                r2.b(r3)
                monitor-enter(r5)
                boolean r2 = r5.f25227a     // Catch:{ all -> 0x0075 }
                if (r2 != 0) goto L_0x0077
                p2.g r2 = p2.C2403g.this     // Catch:{ all -> 0x0075 }
                p2.g$e r2 = r2.f25216o     // Catch:{ all -> 0x0075 }
                int r6 = r6.what     // Catch:{ all -> 0x0075 }
                java.lang.Object r0 = r0.f25232d     // Catch:{ all -> 0x0075 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0075 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0075 }
                r6.sendToTarget()     // Catch:{ all -> 0x0075 }
                goto L_0x0077
            L_0x0075:
                r6 = move-exception
                goto L_0x0079
            L_0x0077:
                monitor-exit(r5)     // Catch:{ all -> 0x0075 }
                return
            L_0x0079:
                monitor-exit(r5)     // Catch:{ all -> 0x0075 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.C2403g.c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: p2.g$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f25229a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25230b;

        /* renamed from: c  reason: collision with root package name */
        public final long f25231c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f25232d;

        /* renamed from: e  reason: collision with root package name */
        public int f25233e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f25229a = j10;
            this.f25230b = z10;
            this.f25231c = j11;
            this.f25232d = obj;
        }
    }

    /* renamed from: p2.g$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C2403g.this.F(obj, obj2);
            } else if (i10 == 2) {
                C2403g.this.z(obj, obj2);
            }
        }
    }

    /* renamed from: p2.g$f */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C2403g(UUID uuid, C2390A a10, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, L l10, Looper looper, C2827i iVar, u1 u1Var) {
        if (i10 == 1 || i10 == 3) {
            C2076a.e(bArr);
        }
        this.f25214m = uuid;
        this.f25204c = aVar;
        this.f25205d = bVar;
        this.f25203b = a10;
        this.f25206e = i10;
        this.f25207f = z10;
        this.f25208g = z11;
        if (bArr != null) {
            this.f25224w = bArr;
            this.f25202a = null;
        } else {
            this.f25202a = Collections.unmodifiableList((List) C2076a.e(list));
        }
        this.f25209h = hashMap;
        this.f25213l = l10;
        this.f25210i = new C2083h();
        this.f25211j = iVar;
        this.f25212k = u1Var;
        this.f25217p = 2;
        this.f25215n = looper;
        this.f25216o = new e(looper);
    }

    private void A(Throwable th2, boolean z10) {
        int i10;
        if ((th2 instanceof NotProvisionedException) || x.b(th2)) {
            this.f25204c.c(this);
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        y(th2, i10);
    }

    private void B() {
        if (this.f25206e == 0 && this.f25217p == 4) {
            L.h(this.f25223v);
            s(false);
        }
    }

    /* access modifiers changed from: private */
    public void F(Object obj, Object obj2) {
        if (obj != this.f25226y) {
            return;
        }
        if (this.f25217p == 2 || v()) {
            this.f25226y = null;
            if (obj2 instanceof Exception) {
                this.f25204c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f25203b.e((byte[]) obj2);
                this.f25204c.b();
            } catch (Exception e10) {
                this.f25204c.a(e10, true);
            }
        }
    }

    private boolean G() {
        if (v()) {
            return true;
        }
        try {
            byte[] c10 = this.f25203b.c();
            this.f25223v = c10;
            this.f25203b.l(c10, this.f25212k);
            this.f25221t = this.f25203b.g(this.f25223v);
            this.f25217p = 3;
            r(new C2398b(3));
            C2076a.e(this.f25223v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f25204c.c(this);
            return false;
        } catch (Exception | NoSuchMethodError e10) {
            if (x.b(e10)) {
                this.f25204c.c(this);
                return false;
            }
            y(e10, 1);
            return false;
        }
    }

    private void H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f25225x = this.f25203b.k(bArr, this.f25202a, i10, this.f25209h);
            ((c) L.h(this.f25220s)).b(2, C2076a.e(this.f25225x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            A(e10, true);
        }
    }

    private boolean J() {
        try {
            this.f25203b.d(this.f25223v, this.f25224w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, 1);
            return false;
        }
    }

    private void K() {
        if (Thread.currentThread() != this.f25215n.getThread()) {
            p.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f25215n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(C2082g gVar) {
        for (t.a accept : this.f25210i.O()) {
            gVar.accept(accept);
        }
    }

    private void s(boolean z10) {
        if (!this.f25208g) {
            byte[] bArr = (byte[]) L.h(this.f25223v);
            int i10 = this.f25206e;
            if (i10 == 0 || i10 == 1) {
                if (this.f25224w == null) {
                    H(bArr, 1, z10);
                } else if (this.f25217p == 4 || J()) {
                    long t10 = t();
                    if (this.f25206e == 0 && t10 <= 60) {
                        p.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + t10);
                        H(bArr, 2, z10);
                    } else if (t10 <= 0) {
                        y(new K(), 2);
                    } else {
                        this.f25217p = 4;
                        r(new C2402f());
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    C2076a.e(this.f25224w);
                    C2076a.e(this.f25223v);
                    H(this.f25224w, 3, z10);
                }
            } else if (this.f25224w == null || J()) {
                H(bArr, 2, z10);
            }
        }
    }

    private long t() {
        if (!C1973h.f19975d.equals(this.f25214m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C2076a.e(O.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f25217p;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return false;
    }

    private void y(Throwable th2, int i10) {
        this.f25222u = new C2409m.a(th2, x.a(th2, i10));
        p.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            r(new C2401e(th2));
        } else if (!(th2 instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        } else if (!x.c(th2) && !x.b(th2)) {
            throw ((Error) th2);
        }
        if (this.f25217p != 4) {
            this.f25217p = 1;
        }
    }

    /* access modifiers changed from: private */
    public void z(Object obj, Object obj2) {
        if (obj == this.f25225x && v()) {
            this.f25225x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f25206e == 3) {
                    this.f25203b.j((byte[]) L.h(this.f25224w), bArr);
                    r(new C2399c());
                    return;
                }
                byte[] j10 = this.f25203b.j(this.f25223v, bArr);
                int i10 = this.f25206e;
                if (!((i10 != 2 && (i10 != 0 || this.f25224w == null)) || j10 == null || j10.length == 0)) {
                    this.f25224w = j10;
                }
                this.f25217p = 4;
                r(new C2400d());
            } catch (Exception e10) {
                e = e10;
                A(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                A(e, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (i10 == 2) {
            B();
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        if (G()) {
            s(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(Exception exc, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        y(exc, i10);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f25226y = this.f25203b.b();
        ((c) L.h(this.f25220s)).b(1, C2076a.e(this.f25226y), true);
    }

    public final C2409m.a a() {
        K();
        if (this.f25217p == 1) {
            return this.f25222u;
        }
        return null;
    }

    public final UUID b() {
        K();
        return this.f25214m;
    }

    public boolean c() {
        K();
        return this.f25207f;
    }

    public final C2170b d() {
        K();
        return this.f25221t;
    }

    public Map e() {
        K();
        byte[] bArr = this.f25223v;
        if (bArr == null) {
            return null;
        }
        return this.f25203b.a(bArr);
    }

    public boolean f(String str) {
        K();
        return this.f25203b.h((byte[]) C2076a.i(this.f25223v), str);
    }

    public final int getState() {
        K();
        return this.f25217p;
    }

    public void h(t.a aVar) {
        K();
        int i10 = this.f25218q;
        if (i10 <= 0) {
            p.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f25218q = i11;
        if (i11 == 0) {
            this.f25217p = 0;
            ((e) L.h(this.f25216o)).removeCallbacksAndMessages((Object) null);
            ((c) L.h(this.f25220s)).c();
            this.f25220s = null;
            ((HandlerThread) L.h(this.f25219r)).quit();
            this.f25219r = null;
            this.f25221t = null;
            this.f25222u = null;
            this.f25225x = null;
            this.f25226y = null;
            byte[] bArr = this.f25223v;
            if (bArr != null) {
                this.f25203b.i(bArr);
                this.f25223v = null;
            }
        }
        if (aVar != null) {
            this.f25210i.d(aVar);
            if (this.f25210i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f25205d.a(this, this.f25218q);
    }

    public void i(t.a aVar) {
        K();
        boolean z10 = false;
        if (this.f25218q < 0) {
            p.c("DefaultDrmSession", "Session reference count less than zero: " + this.f25218q);
            this.f25218q = 0;
        }
        if (aVar != null) {
            this.f25210i.a(aVar);
        }
        int i10 = this.f25218q + 1;
        this.f25218q = i10;
        if (i10 == 1) {
            if (this.f25217p == 2) {
                z10 = true;
            }
            C2076a.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f25219r = handlerThread;
            handlerThread.start();
            this.f25220s = new c(this.f25219r.getLooper());
            if (G()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f25210i.b(aVar) == 1) {
            aVar.k(this.f25217p);
        }
        this.f25205d.b(this, this.f25218q);
    }

    public boolean u(byte[] bArr) {
        K();
        return Arrays.equals(this.f25223v, bArr);
    }
}
