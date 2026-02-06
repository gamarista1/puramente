package b4;

import Gh.C5405f;
import Gh.C5411l;
import Gh.C5412m;
import Gh.H;
import Gh.M;
import Gh.U;
import Sg.m;
import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.L;
import Ug.U0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import yf.p;

/* renamed from: b4.c  reason: case insensitive filesystem */
public final class C3147c implements Closeable, Flushable {

    /* renamed from: s  reason: collision with root package name */
    public static final a f36193s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    private static final m f36194t = new m("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final M f36195a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36196b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36197c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f36198d;

    /* renamed from: e  reason: collision with root package name */
    private final M f36199e;

    /* renamed from: f  reason: collision with root package name */
    private final M f36200f;

    /* renamed from: g  reason: collision with root package name */
    private final M f36201g;

    /* renamed from: h  reason: collision with root package name */
    private final LinkedHashMap f36202h;

    /* renamed from: i  reason: collision with root package name */
    private final K f36203i;

    /* renamed from: j  reason: collision with root package name */
    private long f36204j;

    /* renamed from: k  reason: collision with root package name */
    private int f36205k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public C5405f f36206l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36207m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f36208n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f36209o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f36210p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f36211q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final e f36212r;

    /* renamed from: b4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: b4.c$b */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0593c f36213a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f36214b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f36215c;

        public b(C0593c cVar) {
            this.f36213a = cVar;
            this.f36215c = new boolean[C3147c.this.f36198d];
        }

        private final void d(boolean z10) {
            C3147c cVar = C3147c.this;
            synchronized (cVar) {
                try {
                    if (!this.f36214b) {
                        if (C6496s.c(this.f36213a.b(), this)) {
                            cVar.U(this, z10);
                        }
                        this.f36214b = true;
                        C6514M m10 = C6514M.f71813a;
                    } else {
                        throw new IllegalStateException("editor is closed");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d g02;
            C3147c cVar = C3147c.this;
            synchronized (cVar) {
                b();
                g02 = cVar.g0(this.f36213a.d());
            }
            return g02;
        }

        public final void e() {
            if (C6496s.c(this.f36213a.b(), this)) {
                this.f36213a.m(true);
            }
        }

        public final M f(int i10) {
            M m10;
            C3147c cVar = C3147c.this;
            synchronized (cVar) {
                if (!this.f36214b) {
                    this.f36215c[i10] = true;
                    Object obj = this.f36213a.c().get(i10);
                    o4.e.a(cVar.f36212r, (M) obj);
                    m10 = (M) obj;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            }
            return m10;
        }

        public final C0593c g() {
            return this.f36213a;
        }

        public final boolean[] h() {
            return this.f36215c;
        }
    }

    /* renamed from: b4.c$c  reason: collision with other inner class name */
    public final class C0593c {

        /* renamed from: a  reason: collision with root package name */
        private final String f36217a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f36218b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f36219c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList f36220d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f36221e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f36222f;

        /* renamed from: g  reason: collision with root package name */
        private b f36223g;

        /* renamed from: h  reason: collision with root package name */
        private int f36224h;

        public C0593c(String str) {
            this.f36217a = str;
            this.f36218b = new long[C3147c.this.f36198d];
            this.f36219c = new ArrayList(C3147c.this.f36198d);
            this.f36220d = new ArrayList(C3147c.this.f36198d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int t10 = C3147c.this.f36198d;
            for (int i10 = 0; i10 < t10; i10++) {
                sb2.append(i10);
                this.f36219c.add(C3147c.this.f36195a.p(sb2.toString()));
                sb2.append(".tmp");
                this.f36220d.add(C3147c.this.f36195a.p(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.f36219c;
        }

        public final b b() {
            return this.f36223g;
        }

        public final ArrayList c() {
            return this.f36220d;
        }

        public final String d() {
            return this.f36217a;
        }

        public final long[] e() {
            return this.f36218b;
        }

        public final int f() {
            return this.f36224h;
        }

        public final boolean g() {
            return this.f36221e;
        }

        public final boolean h() {
            return this.f36222f;
        }

        public final void i(b bVar) {
            this.f36223g = bVar;
        }

        public final void j(List list) {
            if (list.size() == C3147c.this.f36198d) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f36218b[i10] = Long.parseLong((String) list.get(i10));
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            } else {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f36224h = i10;
        }

        public final void l(boolean z10) {
            this.f36221e = z10;
        }

        public final void m(boolean z10) {
            this.f36222f = z10;
        }

        public final d n() {
            if (!this.f36221e || this.f36223g != null || this.f36222f) {
                return null;
            }
            ArrayList arrayList = this.f36219c;
            C3147c cVar = C3147c.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!cVar.f36212r.j((M) arrayList.get(i10))) {
                    try {
                        boolean unused = cVar.L0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            this.f36224h++;
            return new d(this);
        }

        public final void o(C5405f fVar) {
            for (long v02 : this.f36218b) {
                fVar.K0(32).v0(v02);
            }
        }
    }

    /* renamed from: b4.c$d */
    public final class d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final C0593c f36226a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f36227b;

        public d(C0593c cVar) {
            this.f36226a = cVar;
        }

        public final b a() {
            b f02;
            C3147c cVar = C3147c.this;
            synchronized (cVar) {
                close();
                f02 = cVar.f0(this.f36226a.d());
            }
            return f02;
        }

        public final M b(int i10) {
            if (!this.f36227b) {
                return (M) this.f36226a.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed");
        }

        public void close() {
            if (!this.f36227b) {
                this.f36227b = true;
                C3147c cVar = C3147c.this;
                synchronized (cVar) {
                    try {
                        C0593c cVar2 = this.f36226a;
                        cVar2.k(cVar2.f() - 1);
                        if (this.f36226a.f() == 0 && this.f36226a.h()) {
                            boolean unused = cVar.L0(this.f36226a);
                        }
                        C6514M m10 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: b4.c$e */
    public static final class e extends C5412m {
        e(C5411l lVar) {
            super(lVar);
        }

        public U p(M m10, boolean z10) {
            M l10 = m10.l();
            if (l10 != null) {
                d(l10);
            }
            return super.p(m10, z10);
        }
    }

    /* renamed from: b4.c$f */
    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f36229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3147c f36230b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C3147c cVar, C6658d dVar) {
            super(2, dVar);
            this.f36230b = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f36230b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|13|14|15|16|(1:18)) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            b4.C3147c.F(r3, true);
            b4.C3147c.E(r3, Gh.H.c(Gh.H.b()));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002e */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0040=Splitter:B:24:0x0040, B:13:0x0021=Splitter:B:13:0x0021, B:15:0x0024=Splitter:B:15:0x0024} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                rf.C6680b.f()
                int r0 = r2.f36229a
                if (r0 != 0) goto L_0x0046
                lf.w.b(r3)
                b4.c r3 = r2.f36230b
                monitor-enter(r3)
                boolean r0 = r3.f36208n     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0040
                boolean r0 = r3.f36209o     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x001a
                goto L_0x0040
            L_0x001a:
                r0 = 1
                r3.R0()     // Catch:{ IOException -> 0x0021 }
                goto L_0x0024
            L_0x001f:
                r0 = move-exception
                goto L_0x0044
            L_0x0021:
                r3.f36210p = r0     // Catch:{ all -> 0x001f }
            L_0x0024:
                boolean r1 = r3.j0()     // Catch:{ IOException -> 0x002e }
                if (r1 == 0) goto L_0x003c
                r3.n1()     // Catch:{ IOException -> 0x002e }
                goto L_0x003c
            L_0x002e:
                r3.f36211q = r0     // Catch:{ all -> 0x001f }
                Gh.U r0 = Gh.H.b()     // Catch:{ all -> 0x001f }
                Gh.f r0 = Gh.H.c(r0)     // Catch:{ all -> 0x001f }
                r3.f36206l = r0     // Catch:{ all -> 0x001f }
            L_0x003c:
                monitor-exit(r3)
                lf.M r3 = lf.C6514M.f71813a
                return r3
            L_0x0040:
                lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x001f }
                monitor-exit(r3)
                return r0
            L_0x0044:
                monitor-exit(r3)
                throw r0
            L_0x0046:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.C3147c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3147c(C5411l lVar, M m10, G g10, long j10, int i10, int i11) {
        this.f36195a = m10;
        this.f36196b = j10;
        this.f36197c = i10;
        this.f36198d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            this.f36199e = m10.p("journal");
            this.f36200f = m10.p("journal.tmp");
            this.f36201g = m10.p("journal.bkp");
            this.f36202h = new LinkedHashMap(0, 0.75f, true);
            this.f36203i = L.a(U0.b((C5600w0) null, 1, (Object) null).n1(g10.C1(1)));
            this.f36212r = new e(lVar);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private final void B0() {
        Iterator it = this.f36202h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0593c cVar = (C0593c) it.next();
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f36198d;
                while (i10 < i11) {
                    j10 += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.i((b) null);
                int i12 = this.f36198d;
                while (i10 < i12) {
                    this.f36212r.h((M) cVar.a().get(i10));
                    this.f36212r.h((M) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f36204j = j10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|(2:24|25)|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.f36205k = r0 - r10.f36202h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.J0() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        n1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r10.f36206l = t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r1 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0082=Splitter:B:28:0x0082, B:17:0x005d=Splitter:B:17:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void E0() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            b4.c$e r1 = r10.f36212r
            Gh.M r2 = r10.f36199e
            Gh.W r1 = r1.q(r2)
            Gh.g r1 = Gh.H.d(r1)
            java.lang.String r2 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r2)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r3)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r10.f36197c     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r4)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r10.f36198d     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r5)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r6.length()     // Catch:{ all -> 0x005b }
            if (r7 > 0) goto L_0x0082
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.i0()     // Catch:{ EOFException -> 0x005d }
            r10.I0(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00b6
        L_0x005d:
            java.util.LinkedHashMap r2 = r10.f36202h     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r10.f36205k = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.J0()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r10.n1()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            Gh.f r0 = r10.t0()     // Catch:{ all -> 0x005b }
            r10.f36206l = r0     // Catch:{ all -> 0x005b }
        L_0x0076:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0080
            r1.close()     // Catch:{ all -> 0x007e }
            goto L_0x0080
        L_0x007e:
            r0 = move-exception
            goto L_0x00c0
        L_0x0080:
            r0 = 0
            goto L_0x00c0
        L_0x0082:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r8.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch:{ all -> 0x005b }
            r8.append(r2)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r3)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r4)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r5)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r6)     // Catch:{ all -> 0x005b }
            r0 = 93
            r8.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x005b }
            r7.<init>(r0)     // Catch:{ all -> 0x005b }
            throw r7     // Catch:{ all -> 0x005b }
        L_0x00b6:
            if (r1 == 0) goto L_0x00c0
            r1.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r1 = move-exception
            lf.C6523g.a(r0, r1)
        L_0x00c0:
            if (r0 != 0) goto L_0x00c3
            return
        L_0x00c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C3147c.E0():void");
    }

    private final void I0(String str) {
        String str2;
        String str3 = str;
        int a02 = Sg.p.a0(str, ' ', 0, false, 6, (Object) null);
        if (a02 != -1) {
            int i10 = a02 + 1;
            int a03 = Sg.p.a0(str, ' ', i10, false, 4, (Object) null);
            if (a03 == -1) {
                str2 = str3.substring(i10);
                C6496s.g(str2, "substring(...)");
                if (a02 == 6 && Sg.p.J(str3, "REMOVE", false, 2, (Object) null)) {
                    this.f36202h.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i10, a03);
                C6496s.g(str2, "substring(...)");
            }
            LinkedHashMap linkedHashMap = this.f36202h;
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new C0593c(str2);
                linkedHashMap.put(str2, obj);
            }
            C0593c cVar = (C0593c) obj;
            if (a03 != -1 && a02 == 5 && Sg.p.J(str3, "CLEAN", false, 2, (Object) null)) {
                String substring = str3.substring(a03 + 1);
                C6496s.g(substring, "substring(...)");
                List E02 = Sg.p.E0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                cVar.l(true);
                cVar.i((b) null);
                cVar.j(E02);
            } else if (a03 == -1 && a02 == 5 && Sg.p.J(str3, "DIRTY", false, 2, (Object) null)) {
                cVar.i(new b(cVar));
            } else if (a03 != -1 || a02 != 4 || !Sg.p.J(str3, "READ", false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    /* access modifiers changed from: private */
    public final boolean L0(C0593c cVar) {
        C5405f fVar;
        if (cVar.f() > 0 && (fVar = this.f36206l) != null) {
            fVar.X("DIRTY");
            fVar.K0(32);
            fVar.X(cVar.d());
            fVar.K0(10);
            fVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i10 = this.f36198d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36212r.h((M) cVar.a().get(i11));
            this.f36204j -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f36205k++;
        C5405f fVar2 = this.f36206l;
        if (fVar2 != null) {
            fVar2.X("REMOVE");
            fVar2.K0(32);
            fVar2.X(cVar.d());
            fVar2.K0(10);
        }
        this.f36202h.remove(cVar.d());
        if (j0()) {
            o0();
        }
        return true;
    }

    private final boolean P0() {
        for (C0593c cVar : this.f36202h.values()) {
            if (!cVar.h()) {
                L0(cVar);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void R0() {
        while (this.f36204j > this.f36196b) {
            if (!P0()) {
                return;
            }
        }
        this.f36210p = false;
    }

    private final void T() {
        if (this.f36209o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void U(b4.C3147c.b r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            b4.c$c r0 = r9.g()     // Catch:{ all -> 0x003c }
            b4.c$b r1 = r0.b()     // Catch:{ all -> 0x003c }
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r9)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0126
            r1 = 0
            if (r10 == 0) goto L_0x009f
            boolean r2 = r0.h()     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x009f
            int r2 = r8.f36198d     // Catch:{ all -> 0x003c }
            r3 = r1
        L_0x001b:
            if (r3 >= r2) goto L_0x0042
            boolean[] r4 = r9.h()     // Catch:{ all -> 0x003c }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x003f
            b4.c$e r4 = r8.f36212r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r5 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x003c }
            Gh.M r5 = (Gh.M) r5     // Catch:{ all -> 0x003c }
            boolean r4 = r4.j(r5)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x003f
            r9.a()     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x003c:
            r9 = move-exception
            goto L_0x012e
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0042:
            int r9 = r8.f36198d     // Catch:{ all -> 0x003c }
        L_0x0044:
            if (r1 >= r9) goto L_0x00b5
            java.util.ArrayList r2 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003c }
            Gh.M r2 = (Gh.M) r2     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            Gh.M r3 = (Gh.M) r3     // Catch:{ all -> 0x003c }
            b4.c$e r4 = r8.f36212r     // Catch:{ all -> 0x003c }
            boolean r4 = r4.j(r2)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0068
            b4.c$e r4 = r8.f36212r     // Catch:{ all -> 0x003c }
            r4.c(r2, r3)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0068:
            b4.c$e r2 = r8.f36212r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r4 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x003c }
            Gh.M r4 = (Gh.M) r4     // Catch:{ all -> 0x003c }
            o4.e.a(r2, r4)     // Catch:{ all -> 0x003c }
        L_0x0077:
            long[] r2 = r0.e()     // Catch:{ all -> 0x003c }
            r4 = r2[r1]     // Catch:{ all -> 0x003c }
            b4.c$e r2 = r8.f36212r     // Catch:{ all -> 0x003c }
            Gh.k r2 = r2.l(r3)     // Catch:{ all -> 0x003c }
            java.lang.Long r2 = r2.c()     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x008e
            long r2 = r2.longValue()     // Catch:{ all -> 0x003c }
            goto L_0x0090
        L_0x008e:
            r2 = 0
        L_0x0090:
            long[] r6 = r0.e()     // Catch:{ all -> 0x003c }
            r6[r1] = r2     // Catch:{ all -> 0x003c }
            long r6 = r8.f36204j     // Catch:{ all -> 0x003c }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f36204j = r6     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x0044
        L_0x009f:
            int r9 = r8.f36198d     // Catch:{ all -> 0x003c }
        L_0x00a1:
            if (r1 >= r9) goto L_0x00b5
            b4.c$e r2 = r8.f36212r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            Gh.M r3 = (Gh.M) r3     // Catch:{ all -> 0x003c }
            r2.h(r3)     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00b5:
            r9 = 0
            r0.i(r9)     // Catch:{ all -> 0x003c }
            boolean r9 = r0.h()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x00c4
            r8.L0(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x00c4:
            int r9 = r8.f36205k     // Catch:{ all -> 0x003c }
            r1 = 1
            int r9 = r9 + r1
            r8.f36205k = r9     // Catch:{ all -> 0x003c }
            Gh.f r9 = r8.f36206l     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.C6496s.e(r9)     // Catch:{ all -> 0x003c }
            r2 = 10
            r3 = 32
            if (r10 != 0) goto L_0x00f8
            boolean r10 = r0.g()     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.util.LinkedHashMap r10 = r8.f36202h     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x003c }
            r10.remove(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "REMOVE"
            r9.X(r10)     // Catch:{ all -> 0x003c }
            r9.K0(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.X(r10)     // Catch:{ all -> 0x003c }
            r9.K0(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0110
        L_0x00f8:
            r0.l(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "CLEAN"
            r9.X(r10)     // Catch:{ all -> 0x003c }
            r9.K0(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.X(r10)     // Catch:{ all -> 0x003c }
            r0.o(r9)     // Catch:{ all -> 0x003c }
            r9.K0(r2)     // Catch:{ all -> 0x003c }
        L_0x0110:
            r9.flush()     // Catch:{ all -> 0x003c }
            long r9 = r8.f36204j     // Catch:{ all -> 0x003c }
            long r0 = r8.f36196b     // Catch:{ all -> 0x003c }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0121
            boolean r9 = r8.j0()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0124
        L_0x0121:
            r8.o0()     // Catch:{ all -> 0x003c }
        L_0x0124:
            monitor-exit(r8)
            return
        L_0x0126:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003c }
            r10.<init>(r9)     // Catch:{ all -> 0x003c }
            throw r10     // Catch:{ all -> 0x003c }
        L_0x012e:
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C3147c.U(b4.c$b, boolean):void");
    }

    private final void V() {
        close();
        o4.e.b(this.f36212r, this.f36195a);
    }

    private final void W0(String str) {
        if (!f36194t.d(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean j0() {
        if (this.f36205k >= 2000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ all -> 0x0075, all -> 0x009f, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1 A[SYNTHETIC, Splitter:B:40:0x00e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void n1() {
        /*
            r7 = this;
            monitor-enter(r7)
            Gh.f r0 = r7.f36206l     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r0 = move-exception
            goto L_0x00e2
        L_0x000c:
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36200f     // Catch:{ all -> 0x0009 }
            r2 = 0
            Gh.U r0 = r0.p(r1, r2)     // Catch:{ all -> 0x0009 }
            Gh.f r0 = Gh.H.c(r0)     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            Gh.f r1 = r0.X(r1)     // Catch:{ all -> 0x0075 }
            r3 = 10
            r1.K0(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "1"
            Gh.f r1 = r0.X(r1)     // Catch:{ all -> 0x0075 }
            r1.K0(r3)     // Catch:{ all -> 0x0075 }
            int r1 = r7.f36197c     // Catch:{ all -> 0x0075 }
            long r4 = (long) r1     // Catch:{ all -> 0x0075 }
            Gh.f r1 = r0.v0(r4)     // Catch:{ all -> 0x0075 }
            r1.K0(r3)     // Catch:{ all -> 0x0075 }
            int r1 = r7.f36198d     // Catch:{ all -> 0x0075 }
            long r4 = (long) r1     // Catch:{ all -> 0x0075 }
            Gh.f r1 = r0.v0(r4)     // Catch:{ all -> 0x0075 }
            r1.K0(r3)     // Catch:{ all -> 0x0075 }
            r0.K0(r3)     // Catch:{ all -> 0x0075 }
            java.util.LinkedHashMap r1 = r7.f36202h     // Catch:{ all -> 0x0075 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0075 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0075 }
            b4.c$c r4 = (b4.C3147c.C0593c) r4     // Catch:{ all -> 0x0075 }
            b4.c$b r5 = r4.b()     // Catch:{ all -> 0x0075 }
            r6 = 32
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = "DIRTY"
            r0.X(r5)     // Catch:{ all -> 0x0075 }
            r0.K0(r6)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x0075 }
            r0.X(r4)     // Catch:{ all -> 0x0075 }
            r0.K0(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x004e
        L_0x0075:
            r1 = move-exception
            goto L_0x0099
        L_0x0077:
            java.lang.String r5 = "CLEAN"
            r0.X(r5)     // Catch:{ all -> 0x0075 }
            r0.K0(r6)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r4.d()     // Catch:{ all -> 0x0075 }
            r0.X(r5)     // Catch:{ all -> 0x0075 }
            r4.o(r0)     // Catch:{ all -> 0x0075 }
            r0.K0(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x004e
        L_0x008d:
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            goto L_0x00a4
        L_0x0097:
            r0 = 0
            goto L_0x00a4
        L_0x0099:
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            lf.C6523g.a(r1, r0)     // Catch:{ all -> 0x0009 }
        L_0x00a3:
            r0 = r1
        L_0x00a4:
            if (r0 != 0) goto L_0x00e1
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36199e     // Catch:{ all -> 0x0009 }
            boolean r0 = r0.j(r1)     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x00ca
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36199e     // Catch:{ all -> 0x0009 }
            Gh.M r3 = r7.f36201g     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36200f     // Catch:{ all -> 0x0009 }
            Gh.M r3 = r7.f36199e     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36201g     // Catch:{ all -> 0x0009 }
            r0.h(r1)     // Catch:{ all -> 0x0009 }
            goto L_0x00d3
        L_0x00ca:
            b4.c$e r0 = r7.f36212r     // Catch:{ all -> 0x0009 }
            Gh.M r1 = r7.f36200f     // Catch:{ all -> 0x0009 }
            Gh.M r3 = r7.f36199e     // Catch:{ all -> 0x0009 }
            r0.c(r1, r3)     // Catch:{ all -> 0x0009 }
        L_0x00d3:
            Gh.f r0 = r7.t0()     // Catch:{ all -> 0x0009 }
            r7.f36206l = r0     // Catch:{ all -> 0x0009 }
            r7.f36205k = r2     // Catch:{ all -> 0x0009 }
            r7.f36207m = r2     // Catch:{ all -> 0x0009 }
            r7.f36211q = r2     // Catch:{ all -> 0x0009 }
            monitor-exit(r7)
            return
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x00e2:
            monitor-exit(r7)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C3147c.n1():void");
    }

    private final void o0() {
        C5600w0 unused = C5576k.d(this.f36203i, (g) null, (Ug.M) null, new f(this, (C6658d) null), 3, (Object) null);
    }

    private final C5405f t0() {
        return H.c(new C3148d(this.f36212r.a(this.f36199e), new C3146b(this)));
    }

    /* access modifiers changed from: private */
    public static final C6514M x0(C3147c cVar, IOException iOException) {
        cVar.f36207m = true;
        return C6514M.f71813a;
    }

    public synchronized void close() {
        try {
            if (this.f36208n) {
                if (!this.f36209o) {
                    for (C0593c b10 : (C0593c[]) this.f36202h.values().toArray(new C0593c[0])) {
                        b b11 = b10.b();
                        if (b11 != null) {
                            b11.e();
                        }
                    }
                    R0();
                    L.d(this.f36203i, (CancellationException) null, 1, (Object) null);
                    C5405f fVar = this.f36206l;
                    C6496s.e(fVar);
                    fVar.close();
                    this.f36206l = null;
                    this.f36209o = true;
                    return;
                }
            }
            this.f36209o = true;
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized b f0(String str) {
        b bVar;
        T();
        W0(str);
        h0();
        C0593c cVar = (C0593c) this.f36202h.get(str);
        if (cVar != null) {
            bVar = cVar.b();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return null;
        }
        if (cVar != null) {
            if (cVar.f() != 0) {
                return null;
            }
        }
        if (!this.f36210p) {
            if (!this.f36211q) {
                C5405f fVar = this.f36206l;
                C6496s.e(fVar);
                fVar.X("DIRTY");
                fVar.K0(32);
                fVar.X(str);
                fVar.K0(10);
                fVar.flush();
                if (this.f36207m) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new C0593c(str);
                    this.f36202h.put(str, cVar);
                }
                b bVar2 = new b(cVar);
                cVar.i(bVar2);
                return bVar2;
            }
        }
        o0();
        return null;
    }

    public synchronized void flush() {
        if (this.f36208n) {
            T();
            R0();
            C5405f fVar = this.f36206l;
            C6496s.e(fVar);
            fVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized b4.C3147c.d g0(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.T()     // Catch:{ all -> 0x0042 }
            r3.W0(r4)     // Catch:{ all -> 0x0042 }
            r3.h0()     // Catch:{ all -> 0x0042 }
            java.util.LinkedHashMap r0 = r3.f36202h     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0042 }
            b4.c$c r0 = (b4.C3147c.C0593c) r0     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0046
            b4.c$d r0 = r0.n()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            int r1 = r3.f36205k     // Catch:{ all -> 0x0042 }
            int r1 = r1 + 1
            r3.f36205k = r1     // Catch:{ all -> 0x0042 }
            Gh.f r1 = r3.f36206l     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "READ"
            r1.X(r2)     // Catch:{ all -> 0x0042 }
            r2 = 32
            r1.K0(r2)     // Catch:{ all -> 0x0042 }
            r1.X(r4)     // Catch:{ all -> 0x0042 }
            r4 = 10
            r1.K0(r4)     // Catch:{ all -> 0x0042 }
            boolean r4 = r3.j0()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0044
            r3.o0()     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r4 = move-exception
            goto L_0x0049
        L_0x0044:
            monitor-exit(r3)
            return r0
        L_0x0046:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C3147c.g0(java.lang.String):b4.c$d");
    }

    public final synchronized void h0() {
        try {
            if (!this.f36208n) {
                this.f36212r.h(this.f36200f);
                if (this.f36212r.j(this.f36201g)) {
                    if (this.f36212r.j(this.f36199e)) {
                        this.f36212r.h(this.f36201g);
                    } else {
                        this.f36212r.c(this.f36201g, this.f36199e);
                    }
                }
                if (this.f36212r.j(this.f36199e)) {
                    E0();
                    B0();
                    this.f36208n = true;
                    return;
                }
                n1();
                this.f36208n = true;
            }
        } catch (IOException unused) {
            V();
            this.f36209o = false;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
