package We;

import android.support.v4.media.session.c;
import ff.C5844E;
import ff.C5849c;
import ff.C5859m;
import ff.C5868v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p003if.h;

/* renamed from: We.i0  reason: case insensitive filesystem */
public final class C5632i0 implements C5656v {

    /* renamed from: a  reason: collision with root package name */
    private volatile C5868v f65871a;

    /* renamed from: b  reason: collision with root package name */
    private E0 f65872b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference f65873c;

    /* renamed from: d  reason: collision with root package name */
    private String f65874d;

    /* renamed from: e  reason: collision with root package name */
    private C5844E f65875e;

    /* renamed from: f  reason: collision with root package name */
    private String f65876f;

    /* renamed from: g  reason: collision with root package name */
    private C5859m f65877g;

    /* renamed from: h  reason: collision with root package name */
    private List f65878h;

    /* renamed from: i  reason: collision with root package name */
    private volatile Queue f65879i;

    /* renamed from: j  reason: collision with root package name */
    private Map f65880j;

    /* renamed from: k  reason: collision with root package name */
    private Map f65881k;

    /* renamed from: l  reason: collision with root package name */
    private List f65882l;

    /* renamed from: m  reason: collision with root package name */
    private volatile M0 f65883m;

    /* renamed from: n  reason: collision with root package name */
    private volatile U0 f65884n;

    /* renamed from: o  reason: collision with root package name */
    private final p003if.a f65885o;

    /* renamed from: p  reason: collision with root package name */
    private final p003if.a f65886p;

    /* renamed from: q  reason: collision with root package name */
    private final p003if.a f65887q;

    /* renamed from: r  reason: collision with root package name */
    private C5849c f65888r;

    /* renamed from: s  reason: collision with root package name */
    private List f65889s;

    /* renamed from: t  reason: collision with root package name */
    private C5626f0 f65890t;

    /* renamed from: u  reason: collision with root package name */
    private C5868v f65891u;

    /* renamed from: v  reason: collision with root package name */
    private C5660x f65892v;

    /* renamed from: w  reason: collision with root package name */
    private final Map f65893w;

    /* renamed from: We.i0$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final U0 f65894a;

        /* renamed from: b  reason: collision with root package name */
        private final U0 f65895b;

        public a(U0 u02, U0 u03) {
            this.f65895b = u02;
            this.f65894a = u03;
        }

        public U0 a() {
            return this.f65895b;
        }

        public U0 b() {
            return this.f65894a;
        }
    }

    public C5632i0(M0 m02) {
        this.f65873c = new WeakReference((Object) null);
        this.f65878h = new ArrayList();
        this.f65880j = new ConcurrentHashMap();
        this.f65881k = new ConcurrentHashMap();
        this.f65882l = new CopyOnWriteArrayList();
        this.f65885o = new p003if.a();
        this.f65886p = new p003if.a();
        this.f65887q = new p003if.a();
        this.f65888r = new C5849c();
        this.f65889s = new CopyOnWriteArrayList();
        C5868v vVar = C5868v.f67577b;
        this.f65891u = vVar;
        this.f65892v = S.d();
        this.f65893w = Collections.synchronizedMap(new WeakHashMap());
        this.f65883m = (M0) h.c(m02, "SentryOptions is required.");
        this.f65879i = k(this.f65883m.t());
        this.f65890t = new C5626f0();
        this.f65871a = vVar;
    }

    static Queue k(int i10) {
        if (i10 > 0) {
            return f1.d(new C5619c(i10));
        }
        return f1.d(new C5631i());
    }

    public C5611D a() {
        return null;
    }

    public M0 b() {
        return this.f65883m;
    }

    public void c(C5663y0 y0Var) {
        if (this.f65883m.D() && y0Var.c() != null) {
            c.a(this.f65893w.get(p003if.c.a(y0Var.c())));
        }
    }

    public void clear() {
        this.f65872b = null;
        this.f65875e = null;
        this.f65877g = null;
        this.f65876f = null;
        this.f65878h.clear();
        i();
        this.f65880j.clear();
        this.f65881k.clear();
        this.f65882l.clear();
        j();
        h();
    }

    public U0 d() {
        C5664z a10 = this.f65885o.a();
        try {
            U0 u02 = null;
            if (this.f65884n != null) {
                this.f65884n.c();
                this.f65883m.k().b();
                U0 b10 = this.f65884n.clone();
                this.f65884n = null;
                u02 = b10;
            }
            if (a10 != null) {
                a10.close();
            }
            return u02;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public C5660x e() {
        return this.f65892v;
    }

    public void f(C5868v vVar) {
        this.f65871a = vVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: We.i0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: We.U0} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public We.C5632i0.a g() {
        /*
            r8 = this;
            if.a r0 = r8.f65885o
            We.z r0 = r0.a()
            We.U0 r1 = r8.f65884n     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001b
            We.U0 r1 = r8.f65884n     // Catch:{ all -> 0x0019 }
            r1.c()     // Catch:{ all -> 0x0019 }
            We.M0 r1 = r8.f65883m     // Catch:{ all -> 0x0019 }
            We.r r1 = r1.k()     // Catch:{ all -> 0x0019 }
            r1.b()     // Catch:{ all -> 0x0019 }
            goto L_0x001b
        L_0x0019:
            r1 = move-exception
            goto L_0x006a
        L_0x001b:
            We.U0 r1 = r8.f65884n     // Catch:{ all -> 0x0019 }
            We.M0 r2 = r8.f65883m     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = r2.u()     // Catch:{ all -> 0x0019 }
            r3 = 0
            if (r2 == 0) goto L_0x0054
            We.U0 r2 = new We.U0     // Catch:{ all -> 0x0019 }
            We.M0 r4 = r8.f65883m     // Catch:{ all -> 0x0019 }
            java.lang.String r4 = r4.m()     // Catch:{ all -> 0x0019 }
            ff.E r5 = r8.f65875e     // Catch:{ all -> 0x0019 }
            We.M0 r6 = r8.f65883m     // Catch:{ all -> 0x0019 }
            java.lang.String r6 = r6.o()     // Catch:{ all -> 0x0019 }
            We.M0 r7 = r8.f65883m     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = r7.u()     // Catch:{ all -> 0x0019 }
            r2.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x0019 }
            r8.f65884n = r2     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0047
            We.U0 r3 = r1.clone()     // Catch:{ all -> 0x0019 }
        L_0x0047:
            We.i0$a r1 = new We.i0$a     // Catch:{ all -> 0x0019 }
            We.U0 r2 = r8.f65884n     // Catch:{ all -> 0x0019 }
            We.U0 r2 = r2.clone()     // Catch:{ all -> 0x0019 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0019 }
            r3 = r1
            goto L_0x0064
        L_0x0054:
            We.M0 r1 = r8.f65883m     // Catch:{ all -> 0x0019 }
            We.u r1 = r1.s()     // Catch:{ all -> 0x0019 }
            We.E0 r2 = We.E0.WARNING     // Catch:{ all -> 0x0019 }
            java.lang.String r4 = "Release is not set on SentryOptions. Session could not be started"
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0019 }
            r1.b(r2, r4, r5)     // Catch:{ all -> 0x0019 }
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.close()
        L_0x0069:
            return r3
        L_0x006a:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0074:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: We.C5632i0.g():We.i0$a");
    }

    public void h() {
        this.f65889s.clear();
    }

    public void i() {
        this.f65879i.clear();
        Iterator it = this.f65883m.v().iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }

    public void j() {
        C5664z a10 = this.f65886p.a();
        if (a10 != null) {
            a10.close();
        }
        this.f65874d = null;
        Iterator it = this.f65883m.v().iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }

    public C5868v l() {
        return this.f65871a;
    }

    public C5656v clone() {
        return new C5632i0(this);
    }

    private C5632i0(C5632i0 i0Var) {
        C5859m mVar = null;
        this.f65873c = new WeakReference((Object) null);
        this.f65878h = new ArrayList();
        this.f65880j = new ConcurrentHashMap();
        this.f65881k = new ConcurrentHashMap();
        this.f65882l = new CopyOnWriteArrayList();
        this.f65885o = new p003if.a();
        this.f65886p = new p003if.a();
        this.f65887q = new p003if.a();
        this.f65888r = new C5849c();
        this.f65889s = new CopyOnWriteArrayList();
        this.f65891u = C5868v.f67577b;
        this.f65892v = S.d();
        this.f65893w = Collections.synchronizedMap(new WeakHashMap());
        i0Var.getClass();
        this.f65874d = i0Var.f65874d;
        this.f65884n = i0Var.f65884n;
        this.f65883m = i0Var.f65883m;
        this.f65872b = i0Var.f65872b;
        this.f65892v = i0Var.f65892v;
        this.f65871a = i0Var.l();
        C5844E e10 = i0Var.f65875e;
        this.f65875e = e10 != null ? new C5844E(e10) : null;
        this.f65876f = i0Var.f65876f;
        this.f65891u = i0Var.f65891u;
        C5859m mVar2 = i0Var.f65877g;
        this.f65877g = mVar2 != null ? new C5859m(mVar2) : mVar;
        this.f65878h = new ArrayList(i0Var.f65878h);
        this.f65882l = new CopyOnWriteArrayList(i0Var.f65882l);
        C5617b[] bVarArr = (C5617b[]) i0Var.f65879i.toArray(new C5617b[0]);
        Queue k10 = k(i0Var.f65883m.t());
        for (C5617b bVar : bVarArr) {
            k10.add(new C5617b(bVar));
        }
        this.f65879i = k10;
        Map map = i0Var.f65880j;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f65880j = concurrentHashMap;
        Map map2 = i0Var.f65881k;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f65881k = concurrentHashMap2;
        this.f65888r = new C5849c(i0Var.f65888r);
        this.f65889s = new CopyOnWriteArrayList(i0Var.f65889s);
        this.f65890t = new C5626f0(i0Var.f65890t);
    }
}
