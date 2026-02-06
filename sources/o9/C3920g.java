package o9;

import N9.C3065n;
import N9.C3068q;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import ia.A;
import ja.C3645a;
import ja.C3652h;
import ja.C3653i;
import ja.M;
import ja.s;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k9.C3702j;
import l9.s0;
import n9.C3866b;
import o9.C3912B;
import o9.n;
import o9.u;

/* renamed from: o9.g  reason: case insensitive filesystem */
class C3920g implements n {

    /* renamed from: a  reason: collision with root package name */
    public final List f47436a;

    /* renamed from: b  reason: collision with root package name */
    private final C3912B f47437b;

    /* renamed from: c  reason: collision with root package name */
    private final a f47438c;

    /* renamed from: d  reason: collision with root package name */
    private final b f47439d;

    /* renamed from: e  reason: collision with root package name */
    private final int f47440e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f47441f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f47442g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f47443h;

    /* renamed from: i  reason: collision with root package name */
    private final C3653i f47444i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final A f47445j;

    /* renamed from: k  reason: collision with root package name */
    private final s0 f47446k;

    /* renamed from: l  reason: collision with root package name */
    final I f47447l;

    /* renamed from: m  reason: collision with root package name */
    final UUID f47448m;

    /* renamed from: n  reason: collision with root package name */
    final e f47449n;

    /* renamed from: o  reason: collision with root package name */
    private int f47450o;

    /* renamed from: p  reason: collision with root package name */
    private int f47451p;

    /* renamed from: q  reason: collision with root package name */
    private HandlerThread f47452q;

    /* renamed from: r  reason: collision with root package name */
    private c f47453r;

    /* renamed from: s  reason: collision with root package name */
    private C3866b f47454s;

    /* renamed from: t  reason: collision with root package name */
    private n.a f47455t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f47456u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f47457v;

    /* renamed from: w  reason: collision with root package name */
    private C3912B.a f47458w;

    /* renamed from: x  reason: collision with root package name */
    private C3912B.d f47459x;

    /* renamed from: o9.g$a */
    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(C3920g gVar);
    }

    /* renamed from: o9.g$b */
    public interface b {
        void a(C3920g gVar, int i10);

        void b(C3920g gVar, int i10);
    }

    /* renamed from: o9.g$c */
    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f47460a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, J j10) {
            IOException iOException;
            J j11 = j10;
            d dVar = (d) message.obj;
            if (!dVar.f47463b) {
                return false;
            }
            int i10 = dVar.f47466e + 1;
            dVar.f47466e = i10;
            if (i10 > C3920g.this.f47445j.a(3)) {
                return false;
            }
            C3065n nVar = new C3065n(dVar.f47462a, j11.f47429a, j11.f47430b, j11.f47431c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f47464c, j11.f47432d);
            C3068q qVar = new C3068q(3);
            if (j10.getCause() instanceof IOException) {
                iOException = (IOException) j10.getCause();
            } else {
                iOException = new f(j10.getCause());
            }
            long c10 = C3920g.this.f47445j.c(new A.c(nVar, qVar, iOException, dVar.f47466e));
            if (c10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f47460a) {
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
            obtainMessage(i10, new d(C3065n.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages((Object) null);
            this.f47460a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o9.J} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: o9.J} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: o9.J} */
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
                o9.g$d r0 = (o9.C3920g.d) r0
                int r1 = r6.what     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                if (r1 == 0) goto L_0x0024
                r2 = 1
                if (r1 != r2) goto L_0x001e
                o9.g r1 = o9.C3920g.this     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                o9.I r2 = r1.f47447l     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                java.util.UUID r1 = r1.f47448m     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                java.lang.Object r3 = r0.f47465d     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                o9.B$a r3 = (o9.C3912B.a) r3     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                byte[] r1 = r2.b(r1, r3)     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                goto L_0x0042
            L_0x001a:
                r1 = move-exception
                goto L_0x0033
            L_0x001c:
                r1 = move-exception
                goto L_0x003b
            L_0x001e:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                r1.<init>()     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                throw r1     // Catch:{ J -> 0x001c, Exception -> 0x001a }
            L_0x0024:
                o9.g r1 = o9.C3920g.this     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                o9.I r2 = r1.f47447l     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                java.util.UUID r1 = r1.f47448m     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                java.lang.Object r3 = r0.f47465d     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                o9.B$d r3 = (o9.C3912B.d) r3     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                byte[] r1 = r2.a(r1, r3)     // Catch:{ J -> 0x001c, Exception -> 0x001a }
                goto L_0x0042
            L_0x0033:
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                ja.s.j(r2, r3, r1)
                goto L_0x0042
            L_0x003b:
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x0042
                return
            L_0x0042:
                o9.g r2 = o9.C3920g.this
                ia.A r2 = r2.f47445j
                long r3 = r0.f47462a
                r2.b(r3)
                monitor-enter(r5)
                boolean r2 = r5.f47460a     // Catch:{ all -> 0x0066 }
                if (r2 != 0) goto L_0x0068
                o9.g r2 = o9.C3920g.this     // Catch:{ all -> 0x0066 }
                o9.g$e r2 = r2.f47449n     // Catch:{ all -> 0x0066 }
                int r6 = r6.what     // Catch:{ all -> 0x0066 }
                java.lang.Object r0 = r0.f47465d     // Catch:{ all -> 0x0066 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0066 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0066 }
                r6.sendToTarget()     // Catch:{ all -> 0x0066 }
                goto L_0x0068
            L_0x0066:
                r6 = move-exception
                goto L_0x006a
            L_0x0068:
                monitor-exit(r5)     // Catch:{ all -> 0x0066 }
                return
            L_0x006a:
                monitor-exit(r5)     // Catch:{ all -> 0x0066 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o9.C3920g.c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: o9.g$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f47462a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47463b;

        /* renamed from: c  reason: collision with root package name */
        public final long f47464c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f47465d;

        /* renamed from: e  reason: collision with root package name */
        public int f47466e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f47462a = j10;
            this.f47463b = z10;
            this.f47464c = j11;
            this.f47465d = obj;
        }
    }

    /* renamed from: o9.g$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                C3920g.this.C(obj, obj2);
            } else if (i10 == 1) {
                C3920g.this.w(obj, obj2);
            }
        }
    }

    /* renamed from: o9.g$f */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C3920g(UUID uuid, C3912B b10, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, I i11, Looper looper, A a10, s0 s0Var) {
        if (i10 == 1 || i10 == 3) {
            C3645a.e(bArr);
        }
        this.f47448m = uuid;
        this.f47438c = aVar;
        this.f47439d = bVar;
        this.f47437b = b10;
        this.f47440e = i10;
        this.f47441f = z10;
        this.f47442g = z11;
        if (bArr != null) {
            this.f47457v = bArr;
            this.f47436a = null;
        } else {
            this.f47436a = Collections.unmodifiableList((List) C3645a.e(list));
        }
        this.f47443h = hashMap;
        this.f47447l = i11;
        this.f47444i = new C3653i();
        this.f47445j = a10;
        this.f47446k = s0Var;
        this.f47450o = 2;
        this.f47449n = new e(looper);
    }

    /* access modifiers changed from: private */
    public void C(Object obj, Object obj2) {
        if (obj != this.f47459x) {
            return;
        }
        if (this.f47450o == 2 || s()) {
            this.f47459x = null;
            if (obj2 instanceof Exception) {
                this.f47438c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f47437b.e((byte[]) obj2);
                this.f47438c.b();
            } catch (Exception e10) {
                this.f47438c.a(e10, true);
            }
        }
    }

    private boolean D() {
        if (s()) {
            return true;
        }
        try {
            byte[] c10 = this.f47437b.c();
            this.f47456u = c10;
            this.f47437b.l(c10, this.f47446k);
            this.f47454s = this.f47437b.g(this.f47456u);
            this.f47450o = 3;
            o(new C3915b(3));
            C3645a.e(this.f47456u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f47438c.c(this);
            return false;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    private void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.f47458w = this.f47437b.k(bArr, this.f47436a, i10, this.f47443h);
            ((c) M.j(this.f47453r)).b(1, C3645a.e(this.f47458w), z10);
        } catch (Exception e10) {
            x(e10, true);
        }
    }

    private boolean G() {
        try {
            this.f47437b.d(this.f47456u, this.f47457v);
            return true;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    private void o(C3652h hVar) {
        for (u.a accept : this.f47444i.O()) {
            hVar.accept(accept);
        }
    }

    private void p(boolean z10) {
        if (!this.f47442g) {
            byte[] bArr = (byte[]) M.j(this.f47456u);
            int i10 = this.f47440e;
            if (i10 == 0 || i10 == 1) {
                if (this.f47457v == null) {
                    E(bArr, 1, z10);
                } else if (this.f47450o == 4 || G()) {
                    long q10 = q();
                    if (this.f47440e == 0 && q10 <= 60) {
                        s.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + q10);
                        E(bArr, 2, z10);
                    } else if (q10 <= 0) {
                        v(new H(), 2);
                    } else {
                        this.f47450o = 4;
                        o(new C3916c());
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    C3645a.e(this.f47457v);
                    C3645a.e(this.f47456u);
                    E(this.f47457v, 3, z10);
                }
            } else if (this.f47457v == null || G()) {
                E(bArr, 2, z10);
            }
        }
    }

    private long q() {
        if (!C3702j.f45578d.equals(this.f47448m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C3645a.e(L.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean s() {
        int i10 = this.f47450o;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return false;
    }

    private void v(Exception exc, int i10) {
        this.f47455t = new n.a(exc, y.a(exc, i10));
        s.d("DefaultDrmSession", "DRM session error", exc);
        o(new C3917d(exc));
        if (this.f47450o != 4) {
            this.f47450o = 1;
        }
    }

    /* access modifiers changed from: private */
    public void w(Object obj, Object obj2) {
        if (obj == this.f47458w && s()) {
            this.f47458w = null;
            if (obj2 instanceof Exception) {
                x((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f47440e == 3) {
                    this.f47437b.j((byte[]) M.j(this.f47457v), bArr);
                    o(new C3918e());
                    return;
                }
                byte[] j10 = this.f47437b.j(this.f47456u, bArr);
                int i10 = this.f47440e;
                if (!((i10 != 2 && (i10 != 0 || this.f47457v == null)) || j10 == null || j10.length == 0)) {
                    this.f47457v = j10;
                }
                this.f47450o = 4;
                o(new C3919f());
            } catch (Exception e10) {
                x(e10, true);
            }
        }
    }

    private void x(Exception exc, boolean z10) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            this.f47438c.c(this);
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        v(exc, i10);
    }

    private void y() {
        if (this.f47440e == 0 && this.f47450o == 4) {
            M.j(this.f47456u);
            p(false);
        }
    }

    public void A() {
        if (D()) {
            p(true);
        }
    }

    public void B(Exception exc, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        v(exc, i10);
    }

    public void F() {
        this.f47459x = this.f47437b.b();
        ((c) M.j(this.f47453r)).b(0, C3645a.e(this.f47459x), true);
    }

    public final n.a a() {
        if (this.f47450o == 1) {
            return this.f47455t;
        }
        return null;
    }

    public final UUID b() {
        return this.f47448m;
    }

    public boolean c() {
        return this.f47441f;
    }

    public final C3866b d() {
        return this.f47454s;
    }

    public Map e() {
        byte[] bArr = this.f47456u;
        if (bArr == null) {
            return null;
        }
        return this.f47437b.a(bArr);
    }

    public boolean f(String str) {
        return this.f47437b.h((byte[]) C3645a.h(this.f47456u), str);
    }

    public void g(u.a aVar) {
        boolean z10 = false;
        if (this.f47451p < 0) {
            s.c("DefaultDrmSession", "Session reference count less than zero: " + this.f47451p);
            this.f47451p = 0;
        }
        if (aVar != null) {
            this.f47444i.a(aVar);
        }
        int i10 = this.f47451p + 1;
        this.f47451p = i10;
        if (i10 == 1) {
            if (this.f47450o == 2) {
                z10 = true;
            }
            C3645a.f(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f47452q = handlerThread;
            handlerThread.start();
            this.f47453r = new c(this.f47452q.getLooper());
            if (D()) {
                p(true);
            }
        } else if (aVar != null && s() && this.f47444i.b(aVar) == 1) {
            aVar.k(this.f47450o);
        }
        this.f47439d.a(this, this.f47451p);
    }

    public final int getState() {
        return this.f47450o;
    }

    public void i(u.a aVar) {
        int i10 = this.f47451p;
        if (i10 <= 0) {
            s.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f47451p = i11;
        if (i11 == 0) {
            this.f47450o = 0;
            ((e) M.j(this.f47449n)).removeCallbacksAndMessages((Object) null);
            ((c) M.j(this.f47453r)).c();
            this.f47453r = null;
            ((HandlerThread) M.j(this.f47452q)).quit();
            this.f47452q = null;
            this.f47454s = null;
            this.f47455t = null;
            this.f47458w = null;
            this.f47459x = null;
            byte[] bArr = this.f47456u;
            if (bArr != null) {
                this.f47437b.i(bArr);
                this.f47456u = null;
            }
        }
        if (aVar != null) {
            this.f47444i.d(aVar);
            if (this.f47444i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f47439d.b(this, this.f47451p);
    }

    public boolean r(byte[] bArr) {
        return Arrays.equals(this.f47456u, bArr);
    }

    public void z(int i10) {
        if (i10 == 2) {
            y();
        }
    }
}
