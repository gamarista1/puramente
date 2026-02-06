package V4;

import T4.i;
import T4.l;
import V4.f;
import V4.i;
import android.os.Build;
import android.util.Log;
import c5.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5.C3931a;
import p5.C3932b;
import p5.C3933c;

class h implements f.a, Runnable, Comparable, C3931a.f {

    /* renamed from: A  reason: collision with root package name */
    private T4.a f34479A;

    /* renamed from: B  reason: collision with root package name */
    private com.bumptech.glide.load.data.d f34480B;

    /* renamed from: C  reason: collision with root package name */
    private volatile f f34481C;

    /* renamed from: D  reason: collision with root package name */
    private volatile boolean f34482D;

    /* renamed from: E  reason: collision with root package name */
    private volatile boolean f34483E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f34484F;

    /* renamed from: a  reason: collision with root package name */
    private final g f34485a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final List f34486b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C3933c f34487c = C3933c.a();

    /* renamed from: d  reason: collision with root package name */
    private final e f34488d;

    /* renamed from: e  reason: collision with root package name */
    private final x1.e f34489e;

    /* renamed from: f  reason: collision with root package name */
    private final d f34490f = new d();

    /* renamed from: g  reason: collision with root package name */
    private final f f34491g = new f();

    /* renamed from: h  reason: collision with root package name */
    private com.bumptech.glide.e f34492h;

    /* renamed from: i  reason: collision with root package name */
    private T4.f f34493i;

    /* renamed from: j  reason: collision with root package name */
    private com.bumptech.glide.h f34494j;

    /* renamed from: k  reason: collision with root package name */
    private n f34495k;

    /* renamed from: l  reason: collision with root package name */
    private int f34496l;

    /* renamed from: m  reason: collision with root package name */
    private int f34497m;

    /* renamed from: n  reason: collision with root package name */
    private j f34498n;

    /* renamed from: o  reason: collision with root package name */
    private i f34499o;

    /* renamed from: p  reason: collision with root package name */
    private b f34500p;

    /* renamed from: q  reason: collision with root package name */
    private int f34501q;

    /* renamed from: r  reason: collision with root package name */
    private C0561h f34502r;

    /* renamed from: s  reason: collision with root package name */
    private g f34503s;

    /* renamed from: t  reason: collision with root package name */
    private long f34504t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f34505u;

    /* renamed from: v  reason: collision with root package name */
    private Object f34506v;

    /* renamed from: w  reason: collision with root package name */
    private Thread f34507w;

    /* renamed from: x  reason: collision with root package name */
    private T4.f f34508x;

    /* renamed from: y  reason: collision with root package name */
    private T4.f f34509y;

    /* renamed from: z  reason: collision with root package name */
    private Object f34510z;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34511a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f34512b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f34513c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                T4.c[] r0 = T4.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34513c = r0
                r1 = 1
                T4.c r2 = T4.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f34513c     // Catch:{ NoSuchFieldError -> 0x001d }
                T4.c r3 = T4.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                V4.h$h[] r2 = V4.h.C0561h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f34512b = r2
                V4.h$h r3 = V4.h.C0561h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f34512b     // Catch:{ NoSuchFieldError -> 0x0038 }
                V4.h$h r3 = V4.h.C0561h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f34512b     // Catch:{ NoSuchFieldError -> 0x0043 }
                V4.h$h r4 = V4.h.C0561h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f34512b     // Catch:{ NoSuchFieldError -> 0x004e }
                V4.h$h r4 = V4.h.C0561h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f34512b     // Catch:{ NoSuchFieldError -> 0x0059 }
                V4.h$h r4 = V4.h.C0561h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                V4.h$g[] r3 = V4.h.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f34511a = r3
                V4.h$g r4 = V4.h.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f34511a     // Catch:{ NoSuchFieldError -> 0x0074 }
                V4.h$g r3 = V4.h.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f34511a     // Catch:{ NoSuchFieldError -> 0x007e }
                V4.h$g r1 = V4.h.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V4.h.a.<clinit>():void");
        }
    }

    interface b {
        void a(v vVar, T4.a aVar, boolean z10);

        void c(q qVar);

        void d(h hVar);
    }

    private final class c implements i.a {

        /* renamed from: a  reason: collision with root package name */
        private final T4.a f34514a;

        c(T4.a aVar) {
            this.f34514a = aVar;
        }

        public v a(v vVar) {
            return h.this.E(this.f34514a, vVar);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private T4.f f34516a;

        /* renamed from: b  reason: collision with root package name */
        private l f34517b;

        /* renamed from: c  reason: collision with root package name */
        private u f34518c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f34516a = null;
            this.f34517b = null;
            this.f34518c = null;
        }

        /* access modifiers changed from: package-private */
        public void b(e eVar, T4.i iVar) {
            C3932b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f34516a, new e(this.f34517b, this.f34518c, iVar));
            } finally {
                this.f34518c.f();
                C3932b.e();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f34518c != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d(T4.f fVar, l lVar, u uVar) {
            this.f34516a = fVar;
            this.f34517b = lVar;
            this.f34518c = uVar;
        }
    }

    interface e {
        X4.a a();
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f34519a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f34520b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f34521c;

        f() {
        }

        private boolean a(boolean z10) {
            if ((this.f34521c || z10 || this.f34520b) && this.f34519a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.f34520b = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            this.f34521c = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean d(boolean z10) {
            this.f34519a = true;
            return a(z10);
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            this.f34520b = false;
            this.f34519a = false;
            this.f34521c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: V4.h$h  reason: collision with other inner class name */
    private enum C0561h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, x1.e eVar2) {
        this.f34488d = eVar;
        this.f34489e = eVar2;
    }

    private void A() {
        O();
        this.f34500p.c(new q("Failed to load resource", (List) new ArrayList(this.f34486b)));
        D();
    }

    private void C() {
        if (this.f34491g.b()) {
            G();
        }
    }

    private void D() {
        if (this.f34491g.c()) {
            G();
        }
    }

    private void G() {
        this.f34491g.e();
        this.f34490f.a();
        this.f34485a.a();
        this.f34482D = false;
        this.f34492h = null;
        this.f34493i = null;
        this.f34499o = null;
        this.f34494j = null;
        this.f34495k = null;
        this.f34500p = null;
        this.f34502r = null;
        this.f34481C = null;
        this.f34507w = null;
        this.f34508x = null;
        this.f34510z = null;
        this.f34479A = null;
        this.f34480B = null;
        this.f34504t = 0;
        this.f34483E = false;
        this.f34506v = null;
        this.f34486b.clear();
        this.f34489e.a(this);
    }

    private void H(g gVar) {
        this.f34503s = gVar;
        this.f34500p.d(this);
    }

    private void I() {
        this.f34507w = Thread.currentThread();
        this.f34504t = o5.g.b();
        boolean z10 = false;
        while (!this.f34483E && this.f34481C != null && !(z10 = this.f34481C.b())) {
            this.f34502r = p(this.f34502r);
            this.f34481C = o();
            if (this.f34502r == C0561h.SOURCE) {
                H(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f34502r == C0561h.FINISHED || this.f34483E) && !z10) {
            A();
        }
    }

    private v J(Object obj, T4.a aVar, t tVar) {
        T4.i r10 = r(aVar);
        com.bumptech.glide.load.data.e l10 = this.f34492h.i().l(obj);
        try {
            return tVar.a(l10, r10, this.f34496l, this.f34497m, new c(aVar));
        } finally {
            l10.b();
        }
    }

    private void N() {
        int i10 = a.f34511a[this.f34503s.ordinal()];
        if (i10 == 1) {
            this.f34502r = p(C0561h.INITIALIZE);
            this.f34481C = o();
            I();
        } else if (i10 == 2) {
            I();
        } else if (i10 == 3) {
            m();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f34503s);
        }
    }

    private void O() {
        Throwable th2;
        this.f34487c.c();
        if (this.f34482D) {
            if (this.f34486b.isEmpty()) {
                th2 = null;
            } else {
                List list = this.f34486b;
                th2 = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.f34482D = true;
    }

    private v j(com.bumptech.glide.load.data.d dVar, Object obj, T4.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = o5.g.b();
            v l10 = l(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                u("Decoded result " + l10, b10);
            }
            return l10;
        } finally {
            dVar.b();
        }
    }

    private v l(Object obj, T4.a aVar) {
        return J(obj, aVar, this.f34485a.h(obj.getClass()));
    }

    private void m() {
        v vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f34504t;
            x("Retrieved data", j10, "data: " + this.f34510z + ", cache key: " + this.f34508x + ", fetcher: " + this.f34480B);
        }
        try {
            vVar = j(this.f34480B, this.f34510z, this.f34479A);
        } catch (q e10) {
            e10.i(this.f34509y, this.f34479A);
            this.f34486b.add(e10);
            vVar = null;
        }
        if (vVar != null) {
            z(vVar, this.f34479A, this.f34484F);
        } else {
            I();
        }
    }

    private f o() {
        int i10 = a.f34512b[this.f34502r.ordinal()];
        if (i10 == 1) {
            return new w(this.f34485a, this);
        }
        if (i10 == 2) {
            return new c(this.f34485a, this);
        }
        if (i10 == 3) {
            return new z(this.f34485a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f34502r);
    }

    private C0561h p(C0561h hVar) {
        int i10 = a.f34512b[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    return C0561h.FINISHED;
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                } else if (this.f34498n.b()) {
                    return C0561h.RESOURCE_CACHE;
                } else {
                    return p(C0561h.RESOURCE_CACHE);
                }
            } else if (this.f34505u) {
                return C0561h.FINISHED;
            } else {
                return C0561h.SOURCE;
            }
        } else if (this.f34498n.a()) {
            return C0561h.DATA_CACHE;
        } else {
            return p(C0561h.DATA_CACHE);
        }
    }

    private T4.i r(T4.a aVar) {
        boolean z10;
        T4.i iVar = this.f34499o;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        if (aVar == T4.a.RESOURCE_DISK_CACHE || this.f34485a.x()) {
            z10 = true;
        } else {
            z10 = false;
        }
        T4.h hVar = s.f36487j;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return iVar;
        }
        T4.i iVar2 = new T4.i();
        iVar2.d(this.f34499o);
        iVar2.f(hVar, Boolean.valueOf(z10));
        return iVar2;
    }

    private int s() {
        return this.f34494j.ordinal();
    }

    private void u(String str, long j10) {
        x(str, j10, (String) null);
    }

    private void x(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(o5.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f34495k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void y(v vVar, T4.a aVar, boolean z10) {
        O();
        this.f34500p.a(vVar, aVar, z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: V4.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: V4.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: V4.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: V4.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: V4.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z(V4.v r2, T4.a r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "DecodeJob.notifyEncodeAndRelease"
            p5.C3932b.a(r0)
            boolean r0 = r2 instanceof V4.r     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0012
            r0 = r2
            V4.r r0 = (V4.r) r0     // Catch:{ all -> 0x0010 }
            r0.initialize()     // Catch:{ all -> 0x0010 }
            goto L_0x0012
        L_0x0010:
            r2 = move-exception
            goto L_0x004e
        L_0x0012:
            V4.h$d r0 = r1.f34490f     // Catch:{ all -> 0x0010 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0020
            V4.u r2 = V4.u.d(r2)     // Catch:{ all -> 0x0010 }
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1.y(r2, r3, r4)     // Catch:{ all -> 0x0010 }
            V4.h$h r2 = V4.h.C0561h.ENCODE     // Catch:{ all -> 0x0010 }
            r1.f34502r = r2     // Catch:{ all -> 0x0010 }
            V4.h$d r2 = r1.f34490f     // Catch:{ all -> 0x003a }
            boolean r2 = r2.c()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x003c
            V4.h$d r2 = r1.f34490f     // Catch:{ all -> 0x003a }
            V4.h$e r3 = r1.f34488d     // Catch:{ all -> 0x003a }
            T4.i r4 = r1.f34499o     // Catch:{ all -> 0x003a }
            r2.b(r3, r4)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r2 = move-exception
            goto L_0x0048
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.f()     // Catch:{ all -> 0x0010 }
        L_0x0041:
            r1.C()     // Catch:{ all -> 0x0010 }
            p5.C3932b.e()
            return
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.f()     // Catch:{ all -> 0x0010 }
        L_0x004d:
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x004e:
            p5.C3932b.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.h.z(V4.v, T4.a, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: V4.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: V4.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: V4.x} */
    /* JADX WARNING: type inference failed for: r12v5, types: [T4.f] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V4.v E(T4.a r12, V4.v r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            T4.a r0 = T4.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            V4.g r0 = r11.f34485a
            T4.m r0 = r0.s(r8)
            com.bumptech.glide.e r2 = r11.f34492h
            int r3 = r11.f34496l
            int r4 = r11.f34497m
            V4.v r2 = r0.a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            V4.g r13 = r11.f34485a
            boolean r13 = r13.w(r0)
            if (r13 == 0) goto L_0x0041
            V4.g r13 = r11.f34485a
            T4.l r1 = r13.n(r0)
            T4.i r13 = r11.f34499o
            T4.c r13 = r1.b(r13)
        L_0x003f:
            r10 = r1
            goto L_0x0044
        L_0x0041:
            T4.c r13 = T4.c.NONE
            goto L_0x003f
        L_0x0044:
            V4.g r1 = r11.f34485a
            T4.f r2 = r11.f34508x
            boolean r1 = r1.y(r2)
            r2 = 1
            r1 = r1 ^ r2
            V4.j r3 = r11.f34498n
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00a6
            int[] r12 = V4.h.a.f34513c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0093
            r1 = 2
            if (r12 != r1) goto L_0x007c
            V4.x r12 = new V4.x
            V4.g r13 = r11.f34485a
            W4.b r2 = r13.b()
            T4.f r3 = r11.f34508x
            T4.f r4 = r11.f34493i
            int r5 = r11.f34496l
            int r6 = r11.f34497m
            T4.i r9 = r11.f34499o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009c
        L_0x007c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0093:
            V4.d r12 = new V4.d
            T4.f r13 = r11.f34508x
            T4.f r1 = r11.f34493i
            r12.<init>(r13, r1)
        L_0x009c:
            V4.u r0 = V4.u.d(r0)
            V4.h$d r13 = r11.f34490f
            r13.d(r12, r10, r0)
            goto L_0x00b4
        L_0x00a6:
            com.bumptech.glide.j$d r12 = new com.bumptech.glide.j$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.h.E(T4.a, V4.v):V4.v");
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z10) {
        if (this.f34491g.d(z10)) {
            G();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P() {
        C0561h p10 = p(C0561h.INITIALIZE);
        if (p10 == C0561h.RESOURCE_CACHE || p10 == C0561h.DATA_CACHE) {
            return true;
        }
        return false;
    }

    public void a(T4.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, T4.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", (Throwable) exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f34486b.add(qVar);
        if (Thread.currentThread() != this.f34507w) {
            H(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            I();
        }
    }

    public C3933c b() {
        return this.f34487c;
    }

    public void c(T4.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, T4.a aVar, T4.f fVar2) {
        this.f34508x = fVar;
        this.f34510z = obj;
        this.f34480B = dVar;
        this.f34479A = aVar;
        this.f34509y = fVar2;
        boolean z10 = false;
        if (fVar != this.f34485a.c().get(0)) {
            z10 = true;
        }
        this.f34484F = z10;
        if (Thread.currentThread() != this.f34507w) {
            H(g.DECODE_DATA);
            return;
        }
        C3932b.a("DecodeJob.decodeFromRetrievedData");
        try {
            m();
        } finally {
            C3932b.e();
        }
    }

    public void e() {
        H(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void f() {
        this.f34483E = true;
        f fVar = this.f34481C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: i */
    public int compareTo(h hVar) {
        int s10 = s() - hVar.s();
        if (s10 == 0) {
            return this.f34501q - hVar.f34501q;
        }
        return s10;
    }

    public void run() {
        C3932b.c("DecodeJob#run(reason=%s, model=%s)", this.f34503s, this.f34506v);
        com.bumptech.glide.load.data.d dVar = this.f34480B;
        try {
            if (this.f34483E) {
                A();
                if (dVar != null) {
                    dVar.b();
                }
                C3932b.e();
                return;
            }
            N();
            if (dVar != null) {
                dVar.b();
            }
            C3932b.e();
        } catch (b e10) {
            throw e10;
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            C3932b.e();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public h t(com.bumptech.glide.e eVar, Object obj, n nVar, T4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, T4.i iVar, b bVar, int i12) {
        this.f34485a.v(eVar, obj, fVar, i10, i11, jVar, cls, cls2, hVar, iVar, map, z10, z11, this.f34488d);
        this.f34492h = eVar;
        this.f34493i = fVar;
        this.f34494j = hVar;
        this.f34495k = nVar;
        this.f34496l = i10;
        this.f34497m = i11;
        this.f34498n = jVar;
        this.f34505u = z12;
        this.f34499o = iVar;
        this.f34500p = bVar;
        this.f34501q = i12;
        this.f34503s = g.INITIALIZE;
        this.f34506v = obj;
        return this;
    }
}
