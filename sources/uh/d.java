package uh;

import Bh.j;
import Gh.C5405f;
import Gh.C5414o;
import Gh.H;
import Gh.W;
import Sg.m;
import Sg.p;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6527k;
import sh.C6726e;
import vh.C6756a;
import vh.C6759d;
import vh.C6760e;
import wf.C6763c;
import yf.C6798l;

public final class d implements Closeable, Flushable {

    /* renamed from: A  reason: collision with root package name */
    public static final String f73612A = "1";

    /* renamed from: B  reason: collision with root package name */
    public static final long f73613B = -1;

    /* renamed from: C  reason: collision with root package name */
    public static final m f73614C = new m("[a-z0-9_-]{1,120}");

    /* renamed from: D  reason: collision with root package name */
    public static final String f73615D = "CLEAN";

    /* renamed from: E  reason: collision with root package name */
    public static final String f73616E = "DIRTY";

    /* renamed from: F  reason: collision with root package name */
    public static final String f73617F = "REMOVE";

    /* renamed from: G  reason: collision with root package name */
    public static final String f73618G = "READ";

    /* renamed from: v  reason: collision with root package name */
    public static final a f73619v = new a((DefaultConstructorMarker) null);

    /* renamed from: w  reason: collision with root package name */
    public static final String f73620w = "journal";

    /* renamed from: x  reason: collision with root package name */
    public static final String f73621x = "journal.tmp";

    /* renamed from: y  reason: collision with root package name */
    public static final String f73622y = "journal.bkp";

    /* renamed from: z  reason: collision with root package name */
    public static final String f73623z = "libcore.io.DiskLruCache";

    /* renamed from: a  reason: collision with root package name */
    private final Ah.a f73624a;

    /* renamed from: b  reason: collision with root package name */
    private final File f73625b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73626c;

    /* renamed from: d  reason: collision with root package name */
    private final int f73627d;

    /* renamed from: e  reason: collision with root package name */
    private long f73628e;

    /* renamed from: f  reason: collision with root package name */
    private final File f73629f;

    /* renamed from: g  reason: collision with root package name */
    private final File f73630g;

    /* renamed from: h  reason: collision with root package name */
    private final File f73631h;

    /* renamed from: i  reason: collision with root package name */
    private long f73632i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C5405f f73633j;

    /* renamed from: k  reason: collision with root package name */
    private final LinkedHashMap f73634k = new LinkedHashMap(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f73635l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f73636m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f73637n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f73638o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f73639p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f73640q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f73641r;

    /* renamed from: s  reason: collision with root package name */
    private long f73642s;

    /* renamed from: t  reason: collision with root package name */
    private final C6759d f73643t;

    /* renamed from: u  reason: collision with root package name */
    private final e f73644u;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f73645a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f73646b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f73647c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f73648d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f73649a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f73650b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f73649a = dVar;
                this.f73650b = bVar;
            }

            public final void a(IOException iOException) {
                C6496s.h(iOException, "it");
                d dVar = this.f73649a;
                b bVar = this.f73650b;
                synchronized (dVar) {
                    bVar.c();
                    C6514M m10 = C6514M.f71813a;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return C6514M.f71813a;
            }
        }

        public b(d dVar, c cVar) {
            boolean[] zArr;
            C6496s.h(cVar, "entry");
            this.f73648d = dVar;
            this.f73645a = cVar;
            if (cVar.g()) {
                zArr = null;
            } else {
                zArr = new boolean[dVar.f0()];
            }
            this.f73646b = zArr;
        }

        public final void a() {
            d dVar = this.f73648d;
            synchronized (dVar) {
                try {
                    if (!this.f73647c) {
                        if (C6496s.c(this.f73645a.b(), this)) {
                            dVar.E(this, false);
                        }
                        this.f73647c = true;
                        C6514M m10 = C6514M.f71813a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            d dVar = this.f73648d;
            synchronized (dVar) {
                try {
                    if (!this.f73647c) {
                        if (C6496s.c(this.f73645a.b(), this)) {
                            dVar.E(this, true);
                        }
                        this.f73647c = true;
                        C6514M m10 = C6514M.f71813a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (!C6496s.c(this.f73645a.b(), this)) {
                return;
            }
            if (this.f73648d.f73637n) {
                this.f73648d.E(this, false);
            } else {
                this.f73645a.q(true);
            }
        }

        public final c d() {
            return this.f73645a;
        }

        public final boolean[] e() {
            return this.f73646b;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r4 = Gh.H.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Gh.U f(int r4) {
            /*
                r3 = this;
                uh.d r0 = r3.f73648d
                monitor-enter(r0)
                boolean r1 = r3.f73647c     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0051
                uh.d$c r1 = r3.f73645a     // Catch:{ all -> 0x0019 }
                uh.d$b r1 = r1.b()     // Catch:{ all -> 0x0019 }
                boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x001b
                Gh.U r4 = Gh.H.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0019:
                r4 = move-exception
                goto L_0x0059
            L_0x001b:
                uh.d$c r1 = r3.f73645a     // Catch:{ all -> 0x0019 }
                boolean r1 = r1.g()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r3.f73646b     // Catch:{ all -> 0x0019 }
                kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x0019 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0019 }
            L_0x002b:
                uh.d$c r1 = r3.f73645a     // Catch:{ all -> 0x0019 }
                java.util.List r1 = r1.c()     // Catch:{ all -> 0x0019 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0019 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0019 }
                Ah.a r1 = r0.V()     // Catch:{ FileNotFoundException -> 0x004b }
                Gh.U r4 = r1.f(r4)     // Catch:{ FileNotFoundException -> 0x004b }
                uh.e r1 = new uh.e     // Catch:{ all -> 0x0019 }
                uh.d$b$a r2 = new uh.d$b$a     // Catch:{ all -> 0x0019 }
                r2.<init>(r0, r3)     // Catch:{ all -> 0x0019 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r1
            L_0x004b:
                Gh.U r4 = Gh.H.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0051:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0019 }
                r1.<init>(r4)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ all -> 0x0019 }
            L_0x0059:
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.d.b.f(int):Gh.U");
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f73651a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f73652b;

        /* renamed from: c  reason: collision with root package name */
        private final List f73653c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f73654d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private boolean f73655e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f73656f;

        /* renamed from: g  reason: collision with root package name */
        private b f73657g;

        /* renamed from: h  reason: collision with root package name */
        private int f73658h;

        /* renamed from: i  reason: collision with root package name */
        private long f73659i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f73660j;

        public static final class a extends C5414o {

            /* renamed from: b  reason: collision with root package name */
            private boolean f73661b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f73662c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c f73663d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(W w10, d dVar, c cVar) {
                super(w10);
                this.f73662c = dVar;
                this.f73663d = cVar;
            }

            public void close() {
                super.close();
                if (!this.f73661b) {
                    this.f73661b = true;
                    d dVar = this.f73662c;
                    c cVar = this.f73663d;
                    synchronized (dVar) {
                        try {
                            cVar.n(cVar.f() - 1);
                            if (cVar.f() == 0 && cVar.i()) {
                                dVar.I0(cVar);
                            }
                            C6514M m10 = C6514M.f71813a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public c(d dVar, String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.f73660j = dVar;
            this.f73651a = str;
            this.f73652b = new long[dVar.f0()];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int f02 = dVar.f0();
            for (int i10 = 0; i10 < f02; i10++) {
                sb2.append(i10);
                this.f73653c.add(new File(this.f73660j.U(), sb2.toString()));
                sb2.append(".tmp");
                this.f73654d.add(new File(this.f73660j.U(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final W k(int i10) {
            W e10 = this.f73660j.V().e((File) this.f73653c.get(i10));
            if (this.f73660j.f73637n) {
                return e10;
            }
            this.f73658h++;
            return new a(e10, this.f73660j, this);
        }

        public final List a() {
            return this.f73653c;
        }

        public final b b() {
            return this.f73657g;
        }

        public final List c() {
            return this.f73654d;
        }

        public final String d() {
            return this.f73651a;
        }

        public final long[] e() {
            return this.f73652b;
        }

        public final int f() {
            return this.f73658h;
        }

        public final boolean g() {
            return this.f73655e;
        }

        public final long h() {
            return this.f73659i;
        }

        public final boolean i() {
            return this.f73656f;
        }

        public final void l(b bVar) {
            this.f73657g = bVar;
        }

        public final void m(List list) {
            C6496s.h(list, "strings");
            if (list.size() == this.f73660j.f0()) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f73652b[i10] = Long.parseLong((String) list.get(i10));
                    }
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new C6527k();
                }
            } else {
                j(list);
                throw new C6527k();
            }
        }

        public final void n(int i10) {
            this.f73658h = i10;
        }

        public final void o(boolean z10) {
            this.f73655e = z10;
        }

        public final void p(long j10) {
            this.f73659i = j10;
        }

        public final void q(boolean z10) {
            this.f73656f = z10;
        }

        public final C1074d r() {
            d dVar = this.f73660j;
            if (C6726e.f73547h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            } else if (!this.f73655e) {
                return null;
            } else {
                if (!this.f73660j.f73637n && (this.f73657g != null || this.f73656f)) {
                    return null;
                }
                ArrayList<W> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.f73652b.clone();
                try {
                    int f02 = this.f73660j.f0();
                    for (int i10 = 0; i10 < f02; i10++) {
                        arrayList.add(k(i10));
                    }
                    return new C1074d(this.f73660j, this.f73651a, this.f73659i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (W m10 : arrayList) {
                        C6726e.m(m10);
                    }
                    try {
                        this.f73660j.I0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(C5405f fVar) {
            C6496s.h(fVar, "writer");
            for (long v02 : this.f73652b) {
                fVar.K0(32).v0(v02);
            }
        }
    }

    /* renamed from: uh.d$d  reason: collision with other inner class name */
    public final class C1074d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final String f73664a;

        /* renamed from: b  reason: collision with root package name */
        private final long f73665b;

        /* renamed from: c  reason: collision with root package name */
        private final List f73666c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f73667d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f73668e;

        public C1074d(d dVar, String str, long j10, List list, long[] jArr) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(list, "sources");
            C6496s.h(jArr, "lengths");
            this.f73668e = dVar;
            this.f73664a = str;
            this.f73665b = j10;
            this.f73666c = list;
            this.f73667d = jArr;
        }

        public final b a() {
            return this.f73668e.I(this.f73664a, this.f73665b);
        }

        public final W b(int i10) {
            return (W) this.f73666c.get(i10);
        }

        public void close() {
            for (W m10 : this.f73666c) {
                C6726e.m(m10);
            }
        }
    }

    public static final class e extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f73669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f73669e = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            uh.d.q(r0, true);
            uh.d.o(r0, Gh.H.c(Gh.H.b()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                uh.d r0 = r5.f73669e
                monitor-enter(r0)
                boolean r1 = r0.f73638o     // Catch:{ all -> 0x0017 }
                r2 = -1
                if (r1 == 0) goto L_0x003a
                boolean r1 = r0.T()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0012
                goto L_0x003a
            L_0x0012:
                r1 = 1
                r0.P0()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001c
            L_0x0017:
                r1 = move-exception
                goto L_0x003c
            L_0x0019:
                r0.f73640q = r1     // Catch:{ all -> 0x0017 }
            L_0x001c:
                boolean r4 = r0.h0()     // Catch:{ IOException -> 0x002a }
                if (r4 == 0) goto L_0x0038
                r0.B0()     // Catch:{ IOException -> 0x002a }
                r4 = 0
                r0.f73635l = r4     // Catch:{ IOException -> 0x002a }
                goto L_0x0038
            L_0x002a:
                r0.f73641r = r1     // Catch:{ all -> 0x0017 }
                Gh.U r1 = Gh.H.b()     // Catch:{ all -> 0x0017 }
                Gh.f r1 = Gh.H.c(r1)     // Catch:{ all -> 0x0017 }
                r0.f73633j = r1     // Catch:{ all -> 0x0017 }
            L_0x0038:
                monitor-exit(r0)
                return r2
            L_0x003a:
                monitor-exit(r0)
                return r2
            L_0x003c:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.d.e.f():long");
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73670a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.f73670a = dVar;
        }

        public final void a(IOException iOException) {
            C6496s.h(iOException, "it");
            d dVar = this.f73670a;
            if (!C6726e.f73547h || Thread.holdsLock(dVar)) {
                this.f73670a.f73636m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return C6514M.f71813a;
        }
    }

    public d(Ah.a aVar, File file, int i10, int i11, long j10, C6760e eVar) {
        C6496s.h(aVar, "fileSystem");
        C6496s.h(file, "directory");
        C6496s.h(eVar, "taskRunner");
        this.f73624a = aVar;
        this.f73625b = file;
        this.f73626c = i10;
        this.f73627d = i11;
        this.f73628e = j10;
        this.f73643t = eVar.i();
        this.f73644u = new e(this, C6726e.f73548i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            this.f73629f = new File(file, f73620w);
            this.f73630g = new File(file, f73621x);
            this.f73631h = new File(file, f73622y);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private final boolean L0() {
        for (c cVar : this.f73634k.values()) {
            if (!cVar.i()) {
                C6496s.g(cVar, "toEvict");
                I0(cVar);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ b M(d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f73613B;
        }
        return dVar.I(str, j10);
    }

    private final void R0(String str) {
        if (!f73614C.d(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean h0() {
        int i10 = this.f73635l;
        if (i10 < 2000 || i10 < this.f73634k.size()) {
            return false;
        }
        return true;
    }

    private final C5405f j0() {
        return H.c(new e(this.f73624a.c(this.f73629f), new f(this)));
    }

    private final void o0() {
        this.f73624a.h(this.f73630g);
        Iterator it = this.f73634k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C6496s.g(next, "i.next()");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f73627d;
                while (i10 < i11) {
                    this.f73632i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l((b) null);
                int i12 = this.f73627d;
                while (i10 < i12) {
                    this.f73624a.h((File) cVar.a().get(i10));
                    this.f73624a.h((File) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.f73635l = r0 - r9.f73634k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.J0() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        B0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r9.f73633j = j0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        wf.C6763c.a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        wf.C6763c.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x005d=Splitter:B:17:0x005d, B:25:0x007d=Splitter:B:25:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void t0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            Ah.a r1 = r9.f73624a
            java.io.File r2 = r9.f73629f
            Gh.W r1 = r1.e(r2)
            Gh.g r1 = Gh.H.d(r1)
            java.lang.String r2 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r1.i0()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = f73623z     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r2)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = f73612A     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r3)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f73626c     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.C6496s.c(r7, r4)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.f73627d     // Catch:{ all -> 0x005b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r6.length()     // Catch:{ all -> 0x005b }
            if (r4 > 0) goto L_0x007d
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.i0()     // Catch:{ EOFException -> 0x005d }
            r9.x0(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00ab
        L_0x005d:
            java.util.LinkedHashMap r2 = r9.f73634k     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r9.f73635l = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.J0()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r9.B0()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            Gh.f r0 = r9.j0()     // Catch:{ all -> 0x005b }
            r9.f73633j = r0     // Catch:{ all -> 0x005b }
        L_0x0076:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x005b }
            r0 = 0
            wf.C6763c.a(r1, r0)
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r7.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005b }
            r7.append(r2)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r3)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r5)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r6)     // Catch:{ all -> 0x005b }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005b }
            r4.<init>(r0)     // Catch:{ all -> 0x005b }
            throw r4     // Catch:{ all -> 0x005b }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            wf.C6763c.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.t0():void");
    }

    private final void x0(String str) {
        String str2;
        String str3 = str;
        int a02 = p.a0(str, ' ', 0, false, 6, (Object) null);
        if (a02 != -1) {
            int i10 = a02 + 1;
            int a03 = p.a0(str, ' ', i10, false, 4, (Object) null);
            if (a03 == -1) {
                str2 = str3.substring(i10);
                C6496s.g(str2, "this as java.lang.String).substring(startIndex)");
                String str4 = f73617F;
                if (a02 == str4.length() && p.J(str3, str4, false, 2, (Object) null)) {
                    this.f73634k.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i10, a03);
                C6496s.g(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c cVar = (c) this.f73634k.get(str2);
            if (cVar == null) {
                cVar = new c(this, str2);
                this.f73634k.put(str2, cVar);
            }
            if (a03 != -1) {
                String str5 = f73615D;
                if (a02 == str5.length() && p.J(str3, str5, false, 2, (Object) null)) {
                    String substring = str3.substring(a03 + 1);
                    C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
                    List E02 = p.E0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    cVar.o(true);
                    cVar.l((b) null);
                    cVar.m(E02);
                    return;
                }
            }
            if (a03 == -1) {
                String str6 = f73616E;
                if (a02 == str6.length() && p.J(str3, str6, false, 2, (Object) null)) {
                    cVar.l(new b(this, cVar));
                    return;
                }
            }
            if (a03 == -1) {
                String str7 = f73618G;
                if (a02 == str7.length() && p.J(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    private final synchronized void y() {
        if (this.f73639p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void B0() {
        try {
            C5405f fVar = this.f73633j;
            if (fVar != null) {
                fVar.close();
            }
            C5405f c10 = H.c(this.f73624a.f(this.f73630g));
            try {
                c10.X(f73623z).K0(10);
                c10.X(f73612A).K0(10);
                c10.v0((long) this.f73626c).K0(10);
                c10.v0((long) this.f73627d).K0(10);
                c10.K0(10);
                for (c cVar : this.f73634k.values()) {
                    if (cVar.b() != null) {
                        c10.X(f73616E).K0(32);
                        c10.X(cVar.d());
                        c10.K0(10);
                    } else {
                        c10.X(f73615D).K0(32);
                        c10.X(cVar.d());
                        cVar.s(c10);
                        c10.K0(10);
                    }
                }
                C6514M m10 = C6514M.f71813a;
                C6763c.a(c10, (Throwable) null);
                if (this.f73624a.b(this.f73629f)) {
                    this.f73624a.g(this.f73629f, this.f73631h);
                }
                this.f73624a.g(this.f73630g, this.f73629f);
                this.f73624a.h(this.f73631h);
                this.f73633j = j0();
                this.f73636m = false;
                this.f73641r = false;
            } catch (Throwable th2) {
                C6763c.a(c10, th);
                throw th2;
            }
        } finally {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void E(uh.d.b r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.C6496s.h(r9, r0)     // Catch:{ all -> 0x0044 }
            uh.d$c r0 = r9.d()     // Catch:{ all -> 0x0044 }
            uh.d$b r1 = r0.b()     // Catch:{ all -> 0x0044 }
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r9)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0139
            r1 = 0
            if (r10 == 0) goto L_0x0064
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0064
            int r2 = r8.f73627d     // Catch:{ all -> 0x0044 }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x0064
            boolean[] r4 = r9.e()     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.C6496s.e(r4)     // Catch:{ all -> 0x0044 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x004a
            Ah.a r4 = r8.f73624a     // Catch:{ all -> 0x0044 }
            java.util.List r5 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0044 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.b(r5)     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0047
            r9.a()     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x0044:
            r9 = move-exception
            goto L_0x0141
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x004a:
            r9.a()     // Catch:{ all -> 0x0044 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r10.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0044 }
            r10.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0044 }
            r9.<init>(r10)     // Catch:{ all -> 0x0044 }
            throw r9     // Catch:{ all -> 0x0044 }
        L_0x0064:
            int r9 = r8.f73627d     // Catch:{ all -> 0x0044 }
        L_0x0066:
            if (r1 >= r9) goto L_0x00b2
            java.util.List r2 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x00aa
            boolean r3 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x00aa
            Ah.a r3 = r8.f73624a     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.b(r2)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x00af
            java.util.List r3 = r0.a()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0044 }
            Ah.a r4 = r8.f73624a     // Catch:{ all -> 0x0044 }
            r4.g(r2, r3)     // Catch:{ all -> 0x0044 }
            long[] r2 = r0.e()     // Catch:{ all -> 0x0044 }
            r4 = r2[r1]     // Catch:{ all -> 0x0044 }
            Ah.a r2 = r8.f73624a     // Catch:{ all -> 0x0044 }
            long r2 = r2.d(r3)     // Catch:{ all -> 0x0044 }
            long[] r6 = r0.e()     // Catch:{ all -> 0x0044 }
            r6[r1] = r2     // Catch:{ all -> 0x0044 }
            long r6 = r8.f73632i     // Catch:{ all -> 0x0044 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f73632i = r6     // Catch:{ all -> 0x0044 }
            goto L_0x00af
        L_0x00aa:
            Ah.a r3 = r8.f73624a     // Catch:{ all -> 0x0044 }
            r3.h(r2)     // Catch:{ all -> 0x0044 }
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x0066
        L_0x00b2:
            r9 = 0
            r0.l(r9)     // Catch:{ all -> 0x0044 }
            boolean r9 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x00c1
            r8.I0(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x00c1:
            int r9 = r8.f73635l     // Catch:{ all -> 0x0044 }
            r1 = 1
            int r9 = r9 + r1
            r8.f73635l = r9     // Catch:{ all -> 0x0044 }
            Gh.f r9 = r8.f73633j     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.C6496s.e(r9)     // Catch:{ all -> 0x0044 }
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f6
            if (r10 == 0) goto L_0x00d9
            goto L_0x00f6
        L_0x00d9:
            java.util.LinkedHashMap r10 = r8.f73634k     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r10.remove(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = f73617F     // Catch:{ all -> 0x0044 }
            Gh.f r10 = r9.X(r10)     // Catch:{ all -> 0x0044 }
            r10.K0(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.X(r10)     // Catch:{ all -> 0x0044 }
            r9.K0(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x011b
        L_0x00f6:
            r0.o(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = f73615D     // Catch:{ all -> 0x0044 }
            Gh.f r1 = r9.X(r1)     // Catch:{ all -> 0x0044 }
            r1.K0(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.X(r1)     // Catch:{ all -> 0x0044 }
            r0.s(r9)     // Catch:{ all -> 0x0044 }
            r9.K0(r3)     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x011b
            long r1 = r8.f73642s     // Catch:{ all -> 0x0044 }
            r3 = 1
            long r3 = r3 + r1
            r8.f73642s = r3     // Catch:{ all -> 0x0044 }
            r0.p(r1)     // Catch:{ all -> 0x0044 }
        L_0x011b:
            r9.flush()     // Catch:{ all -> 0x0044 }
            long r9 = r8.f73632i     // Catch:{ all -> 0x0044 }
            long r0 = r8.f73628e     // Catch:{ all -> 0x0044 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x012c
            boolean r9 = r8.h0()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x0137
        L_0x012c:
            vh.d r0 = r8.f73643t     // Catch:{ all -> 0x0044 }
            uh.d$e r1 = r8.f73644u     // Catch:{ all -> 0x0044 }
            r4 = 2
            r5 = 0
            r2 = 0
            vh.C6759d.j(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0044 }
        L_0x0137:
            monitor-exit(r8)
            return
        L_0x0139:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            r10.<init>(r9)     // Catch:{ all -> 0x0044 }
            throw r10     // Catch:{ all -> 0x0044 }
        L_0x0141:
            monitor-exit(r8)     // Catch:{ all -> 0x0044 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.E(uh.d$b, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean E0(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C6496s.h(r6, r0)     // Catch:{ all -> 0x002d }
            r5.g0()     // Catch:{ all -> 0x002d }
            r5.y()     // Catch:{ all -> 0x002d }
            r5.R0(r6)     // Catch:{ all -> 0x002d }
            java.util.LinkedHashMap r0 = r5.f73634k     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002d }
            uh.d$c r6 = (uh.d.c) r6     // Catch:{ all -> 0x002d }
            r0 = 0
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            boolean r6 = r5.I0(r6)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x002f
            long r1 = r5.f73632i     // Catch:{ all -> 0x002d }
            long r3 = r5.f73628e     // Catch:{ all -> 0x002d }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            r5.f73640q = r0     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r6 = move-exception
            goto L_0x0031
        L_0x002f:
            monitor-exit(r5)
            return r6
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.E0(java.lang.String):boolean");
    }

    public final void F() {
        close();
        this.f73624a.a(this.f73625b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized uh.d.b I(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C6496s.h(r10, r0)     // Catch:{ all -> 0x0029 }
            r9.g0()     // Catch:{ all -> 0x0029 }
            r9.y()     // Catch:{ all -> 0x0029 }
            r9.R0(r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap r0 = r9.f73634k     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0029 }
            uh.d$c r0 = (uh.d.c) r0     // Catch:{ all -> 0x0029 }
            long r1 = f73613B     // Catch:{ all -> 0x0029 }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x002b
            long r3 = r0.h()     // Catch:{ all -> 0x0029 }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002d
            goto L_0x002b
        L_0x0029:
            r10 = move-exception
            goto L_0x0092
        L_0x002b:
            monitor-exit(r9)
            return r2
        L_0x002d:
            if (r0 == 0) goto L_0x0034
            uh.d$b r11 = r0.b()     // Catch:{ all -> 0x0029 }
            goto L_0x0035
        L_0x0034:
            r11 = r2
        L_0x0035:
            if (r11 == 0) goto L_0x0039
            monitor-exit(r9)
            return r2
        L_0x0039:
            if (r0 == 0) goto L_0x0043
            int r11 = r0.f()     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x0043
            monitor-exit(r9)
            return r2
        L_0x0043:
            boolean r11 = r9.f73640q     // Catch:{ all -> 0x0029 }
            if (r11 != 0) goto L_0x0085
            boolean r11 = r9.f73641r     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x004c
            goto L_0x0085
        L_0x004c:
            Gh.f r11 = r9.f73633j     // Catch:{ all -> 0x0029 }
            kotlin.jvm.internal.C6496s.e(r11)     // Catch:{ all -> 0x0029 }
            java.lang.String r12 = f73616E     // Catch:{ all -> 0x0029 }
            Gh.f r12 = r11.X(r12)     // Catch:{ all -> 0x0029 }
            r1 = 32
            Gh.f r12 = r12.K0(r1)     // Catch:{ all -> 0x0029 }
            Gh.f r12 = r12.X(r10)     // Catch:{ all -> 0x0029 }
            r1 = 10
            r12.K0(r1)     // Catch:{ all -> 0x0029 }
            r11.flush()     // Catch:{ all -> 0x0029 }
            boolean r11 = r9.f73636m     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x006f
            monitor-exit(r9)
            return r2
        L_0x006f:
            if (r0 != 0) goto L_0x007b
            uh.d$c r0 = new uh.d$c     // Catch:{ all -> 0x0029 }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap r11 = r9.f73634k     // Catch:{ all -> 0x0029 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0029 }
        L_0x007b:
            uh.d$b r10 = new uh.d$b     // Catch:{ all -> 0x0029 }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x0029 }
            r0.l(r10)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r10
        L_0x0085:
            vh.d r3 = r9.f73643t     // Catch:{ all -> 0x0029 }
            uh.d$e r4 = r9.f73644u     // Catch:{ all -> 0x0029 }
            r7 = 2
            r8 = 0
            r5 = 0
            vh.C6759d.j(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r2
        L_0x0092:
            monitor-exit(r9)     // Catch:{ all -> 0x0029 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.I(java.lang.String, long):uh.d$b");
    }

    public final boolean I0(c cVar) {
        C5405f fVar;
        C6496s.h(cVar, "entry");
        if (!this.f73637n) {
            if (cVar.f() > 0 && (fVar = this.f73633j) != null) {
                fVar.X(f73616E);
                fVar.K0(32);
                fVar.X(cVar.d());
                fVar.K0(10);
                fVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b10 = cVar.b();
        if (b10 != null) {
            b10.c();
        }
        int i10 = this.f73627d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f73624a.h((File) cVar.a().get(i11));
            this.f73632i -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f73635l++;
        C5405f fVar2 = this.f73633j;
        if (fVar2 != null) {
            fVar2.X(f73617F);
            fVar2.K0(32);
            fVar2.X(cVar.d());
            fVar2.K0(10);
        }
        this.f73634k.remove(cVar.d());
        if (h0()) {
            C6759d.j(this.f73643t, this.f73644u, 0, 2, (Object) null);
        }
        return true;
    }

    public final void P0() {
        while (this.f73632i > this.f73628e) {
            if (!L0()) {
                return;
            }
        }
        this.f73640q = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized uh.d.C1074d Q(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C6496s.h(r8, r0)     // Catch:{ all -> 0x0056 }
            r7.g0()     // Catch:{ all -> 0x0056 }
            r7.y()     // Catch:{ all -> 0x0056 }
            r7.R0(r8)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashMap r0 = r7.f73634k     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0056 }
            uh.d$c r0 = (uh.d.c) r0     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            monitor-exit(r7)
            return r1
        L_0x001c:
            uh.d$d r0 = r0.r()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return r1
        L_0x0024:
            int r1 = r7.f73635l     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            r7.f73635l = r1     // Catch:{ all -> 0x0056 }
            Gh.f r1 = r7.f73633j     // Catch:{ all -> 0x0056 }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = f73618G     // Catch:{ all -> 0x0056 }
            Gh.f r1 = r1.X(r2)     // Catch:{ all -> 0x0056 }
            r2 = 32
            Gh.f r1 = r1.K0(r2)     // Catch:{ all -> 0x0056 }
            Gh.f r8 = r1.X(r8)     // Catch:{ all -> 0x0056 }
            r1 = 10
            r8.K0(r1)     // Catch:{ all -> 0x0056 }
            boolean r8 = r7.h0()     // Catch:{ all -> 0x0056 }
            if (r8 == 0) goto L_0x0058
            vh.d r1 = r7.f73643t     // Catch:{ all -> 0x0056 }
            uh.d$e r2 = r7.f73644u     // Catch:{ all -> 0x0056 }
            r5 = 2
            r6 = 0
            r3 = 0
            vh.C6759d.j(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r8 = move-exception
            goto L_0x005a
        L_0x0058:
            monitor-exit(r7)
            return r0
        L_0x005a:
            monitor-exit(r7)     // Catch:{ all -> 0x0056 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.Q(java.lang.String):uh.d$d");
    }

    public final boolean T() {
        return this.f73639p;
    }

    public final File U() {
        return this.f73625b;
    }

    public final Ah.a V() {
        return this.f73624a;
    }

    public synchronized void close() {
        b b10;
        try {
            if (this.f73638o) {
                if (!this.f73639p) {
                    Collection values = this.f73634k.values();
                    C6496s.g(values, "lruEntries.values");
                    for (c cVar : (c[]) values.toArray(new c[0])) {
                        if (!(cVar.b() == null || (b10 = cVar.b()) == null)) {
                            b10.c();
                        }
                    }
                    P0();
                    C5405f fVar = this.f73633j;
                    C6496s.e(fVar);
                    fVar.close();
                    this.f73633j = null;
                    this.f73639p = true;
                    return;
                }
            }
            this.f73639p = true;
        } finally {
            while (true) {
            }
        }
    }

    public final int f0() {
        return this.f73627d;
    }

    public synchronized void flush() {
        if (this.f73638o) {
            y();
            P0();
            C5405f fVar = this.f73633j;
            C6496s.e(fVar);
            fVar.flush();
        }
    }

    public final synchronized void g0() {
        try {
            if (C6726e.f73547h) {
                if (!Thread.holdsLock(this)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                }
            }
            if (!this.f73638o) {
                if (this.f73624a.b(this.f73631h)) {
                    if (this.f73624a.b(this.f73629f)) {
                        this.f73624a.h(this.f73631h);
                    } else {
                        this.f73624a.g(this.f73631h, this.f73629f);
                    }
                }
                this.f73637n = C6726e.F(this.f73624a, this.f73631h);
                if (this.f73624a.b(this.f73629f)) {
                    t0();
                    o0();
                    this.f73638o = true;
                    return;
                }
                B0();
                this.f73638o = true;
            }
        } catch (IOException e10) {
            j g10 = j.f62626a.g();
            g10.k("DiskLruCache " + this.f73625b + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
            F();
            this.f73639p = false;
        } catch (Throwable th2) {
            this.f73639p = false;
            throw th2;
        }
    }
}
