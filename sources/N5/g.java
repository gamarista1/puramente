package N5;

import M5.a;
import M5.c;
import M5.d;
import M5.e;
import M5.j;
import N5.f;
import T5.k;
import Y5.a;
import a6.C3135a;
import a6.C3138d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class g implements k, Q5.a {

    /* renamed from: r  reason: collision with root package name */
    private static final Class f32977r = g.class;

    /* renamed from: s  reason: collision with root package name */
    private static final long f32978s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t  reason: collision with root package name */
    private static final long f32979t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final long f32980a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32981b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f32982c;

    /* renamed from: d  reason: collision with root package name */
    private long f32983d;

    /* renamed from: e  reason: collision with root package name */
    private final M5.c f32984e;

    /* renamed from: f  reason: collision with root package name */
    final Set f32985f;

    /* renamed from: g  reason: collision with root package name */
    private long f32986g;

    /* renamed from: h  reason: collision with root package name */
    private final long f32987h;

    /* renamed from: i  reason: collision with root package name */
    private final Y5.a f32988i;

    /* renamed from: j  reason: collision with root package name */
    private final f f32989j;

    /* renamed from: k  reason: collision with root package name */
    private final j f32990k;

    /* renamed from: l  reason: collision with root package name */
    private final M5.a f32991l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f32992m;

    /* renamed from: n  reason: collision with root package name */
    private final b f32993n;

    /* renamed from: o  reason: collision with root package name */
    private final C3135a f32994o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Object f32995p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f32996q;

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (g.this.f32995p) {
                boolean unused = g.this.p();
            }
            g.this.f32996q = true;
            g.this.f32982c.countDown();
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f32998a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f32999b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f33000c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f33000c;
        }

        public synchronized long b() {
            return this.f32999b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f32998a) {
                this.f32999b += j10;
                this.f33000c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f32998a;
        }

        public synchronized void e() {
            this.f32998a = false;
            this.f33000c = -1;
            this.f32999b = -1;
        }

        public synchronized void f(long j10, long j11) {
            this.f33000c = j11;
            this.f32999b = j10;
            this.f32998a = true;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f33001a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33002b;

        /* renamed from: c  reason: collision with root package name */
        public final long f33003c;

        public c(long j10, long j11, long j12) {
            this.f33001a = j10;
            this.f33002b = j11;
            this.f33003c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, M5.c cVar2, M5.a aVar, Q5.b bVar, Executor executor, boolean z10) {
        this.f32980a = cVar.f33002b;
        long j10 = cVar.f33003c;
        this.f32981b = j10;
        this.f32983d = j10;
        this.f32988i = Y5.a.d();
        this.f32989j = fVar;
        this.f32990k = jVar;
        this.f32986g = -1;
        this.f32984e = cVar2;
        this.f32987h = cVar.f33001a;
        this.f32991l = aVar;
        this.f32993n = new b();
        this.f32994o = C3138d.a();
        this.f32992m = z10;
        this.f32985f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (z10) {
            this.f32982c = new CountDownLatch(1);
            executor.execute(new a());
            return;
        }
        this.f32982c = new CountDownLatch(0);
    }

    private L5.a l(f.b bVar, d dVar, String str) {
        L5.a i10;
        synchronized (this.f32995p) {
            i10 = bVar.i(dVar);
            this.f32985f.add(str);
            this.f32993n.c(i10.size(), 1);
        }
        return i10;
    }

    private void m(long j10, c.a aVar) {
        long j11 = j10;
        try {
            Collection<f.a> n10 = n(this.f32989j.h());
            long b10 = this.f32993n.b();
            long j12 = b10 - j11;
            int i10 = 0;
            long j13 = 0;
            for (f.a aVar2 : n10) {
                if (j13 > j12) {
                    break;
                }
                long d10 = this.f32989j.d(aVar2);
                this.f32985f.remove(aVar2.getId());
                if (d10 > 0) {
                    i10++;
                    j13 += d10;
                    l e10 = l.a().j(aVar2.getId()).g(aVar).i(d10).f(b10 - j13).e(j11);
                    M5.c cVar = this.f32984e;
                    if (cVar != null) {
                        cVar.f(e10);
                    }
                    e10.b();
                } else {
                    c.a aVar3 = aVar;
                }
            }
            this.f32993n.c(-j13, (long) (-i10));
            this.f32989j.b();
        } catch (IOException e11) {
            M5.a aVar4 = this.f32991l;
            a.C0534a aVar5 = a.C0534a.EVICTION;
            Class cls = f32977r;
            aVar4.a(aVar5, cls, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    private Collection n(Collection collection) {
        long now = this.f32994o.now() + f32978s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.a() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f32990k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f32995p) {
            try {
                boolean p10 = p();
                s();
                long b10 = this.f32993n.b();
                if (b10 > this.f32983d && !p10) {
                    this.f32993n.e();
                    p();
                }
                long j10 = this.f32983d;
                if (b10 > j10) {
                    m((j10 * 9) / 10, c.a.CACHE_FULL);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean p() {
        long now = this.f32994o.now();
        if (this.f32993n.d()) {
            long j10 = this.f32986g;
            if (j10 != -1 && now - j10 <= f32979t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        Set set;
        long j10;
        long now = this.f32994o.now();
        long j11 = f32978s + now;
        if (this.f32992m && this.f32985f.isEmpty()) {
            set = this.f32985f;
        } else if (this.f32992m) {
            set = new HashSet();
        } else {
            set = null;
        }
        try {
            long j12 = 0;
            long j13 = -1;
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            int i12 = 0;
            for (f.a aVar : this.f32989j.h()) {
                i11++;
                j12 += aVar.getSize();
                if (aVar.a() > j11) {
                    i12++;
                    i10 = (int) (((long) i10) + aVar.getSize());
                    j10 = j11;
                    j13 = Math.max(aVar.a() - now, j13);
                    z10 = true;
                } else {
                    j10 = j11;
                    if (this.f32992m) {
                        k.g(set);
                        set.add(aVar.getId());
                    }
                }
                j11 = j10;
            }
            if (z10) {
                this.f32991l.a(a.C0534a.READ_INVALID_ENTRY, f32977r, "Future timestamp found in " + i12 + " files , with a total size of " + i10 + " bytes, and a maximum time delta of " + j13 + "ms", (Throwable) null);
            }
            long j14 = (long) i11;
            if (!(this.f32993n.a() == j14 && this.f32993n.b() == j12)) {
                if (this.f32992m && this.f32985f != set) {
                    k.g(set);
                    this.f32985f.clear();
                    this.f32985f.addAll(set);
                }
                this.f32993n.f(j12, j14);
            }
            this.f32986g = now;
            return true;
        } catch (IOException e10) {
            this.f32991l.a(a.C0534a.GENERIC_IO, f32977r, "calcFileCacheSize: " + e10.getMessage(), e10);
            return false;
        }
    }

    private f.b r(String str, d dVar) {
        o();
        return this.f32989j.e(str, dVar);
    }

    private void s() {
        a.C0578a aVar;
        if (this.f32989j.isExternal()) {
            aVar = a.C0578a.EXTERNAL;
        } else {
            aVar = a.C0578a.INTERNAL;
        }
        if (this.f32988i.f(aVar, this.f32981b - this.f32993n.b())) {
            this.f32983d = this.f32980a;
        } else {
            this.f32983d = this.f32981b;
        }
    }

    public void a() {
        synchronized (this.f32995p) {
            try {
                this.f32989j.a();
                this.f32985f.clear();
                M5.c cVar = this.f32984e;
                if (cVar != null) {
                    cVar.d();
                }
            } catch (IOException | NullPointerException e10) {
                M5.a aVar = this.f32991l;
                a.C0534a aVar2 = a.C0534a.EVICTION;
                Class cls = f32977r;
                aVar.a(aVar2, cls, "clearAll: " + e10.getMessage(), e10);
            }
            this.f32993n.e();
        }
    }

    public boolean b(d dVar) {
        synchronized (this.f32995p) {
            try {
                List b10 = e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    if (this.f32985f.contains((String) b10.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(d dVar) {
        synchronized (this.f32995p) {
            try {
                List b10 = e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    this.f32989j.i(str);
                    this.f32985f.remove(str);
                }
            } catch (IOException e10) {
                M5.a aVar = this.f32991l;
                a.C0534a aVar2 = a.C0534a.DELETE_FILE;
                Class cls = f32977r;
                aVar.a(aVar2, cls, "delete: " + e10.getMessage(), e10);
            }
        }
    }

    public boolean d(d dVar) {
        synchronized (this.f32995p) {
            if (b(dVar)) {
                return true;
            }
            try {
                List b10 = e.b(dVar);
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    String str = (String) b10.get(i10);
                    if (this.f32989j.f(str, dVar)) {
                        this.f32985f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public L5.a e(d dVar, j jVar) {
        String a10;
        f.b r10;
        l d10 = l.a().d(dVar);
        M5.c cVar = this.f32984e;
        if (cVar != null) {
            cVar.g(d10);
        }
        synchronized (this.f32995p) {
            a10 = e.a(dVar);
        }
        d10.j(a10);
        try {
            r10 = r(a10, dVar);
            r10.j(jVar, dVar);
            L5.a l10 = l(r10, dVar, a10);
            d10.i(l10.size()).f(this.f32993n.b());
            M5.c cVar2 = this.f32984e;
            if (cVar2 != null) {
                cVar2.h(d10);
            }
            if (!r10.h()) {
                U5.a.i(f32977r, "Failed to delete temp file");
            }
            d10.b();
            return l10;
        } catch (IOException e10) {
            try {
                d10.h(e10);
                M5.c cVar3 = this.f32984e;
                if (cVar3 != null) {
                    cVar3.b(d10);
                }
                U5.a.j(f32977r, "Failed inserting a file into the cache", e10);
                throw e10;
            } catch (Throwable th2) {
                d10.b();
                throw th2;
            }
        } catch (Throwable th3) {
            if (!r10.h()) {
                U5.a.i(f32977r, "Failed to delete temp file");
            }
            throw th3;
        }
    }

    public boolean f(d dVar) {
        String str;
        IOException e10;
        Throwable th2;
        String str2 = null;
        try {
            synchronized (this.f32995p) {
                try {
                    List b10 = e.b(dVar);
                    int i10 = 0;
                    while (i10 < b10.size()) {
                        String str3 = (String) b10.get(i10);
                        try {
                            if (this.f32989j.c(str3, dVar)) {
                                this.f32985f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (IOException e11) {
                                e10 = e11;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th4) {
                    str = str2;
                    th2 = th4;
                    throw th2;
                }
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
            l h10 = l.a().d(dVar).j(str).h(e10);
            M5.c cVar = this.f32984e;
            if (cVar != null) {
                cVar.e(h10);
            }
            h10.b();
            return false;
        }
    }

    public L5.a g(d dVar) {
        L5.a aVar;
        l d10 = l.a().d(dVar);
        try {
            synchronized (this.f32995p) {
                List b10 = e.b(dVar);
                int i10 = 0;
                String str = null;
                aVar = null;
                while (true) {
                    if (i10 >= b10.size()) {
                        break;
                    }
                    str = (String) b10.get(i10);
                    d10.j(str);
                    aVar = this.f32989j.g(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                    i10++;
                }
                if (aVar == null) {
                    M5.c cVar = this.f32984e;
                    if (cVar != null) {
                        cVar.a(d10);
                    }
                    this.f32985f.remove(str);
                } else {
                    k.g(str);
                    M5.c cVar2 = this.f32984e;
                    if (cVar2 != null) {
                        cVar2.c(d10);
                    }
                    this.f32985f.add(str);
                }
            }
            d10.b();
            return aVar;
        } catch (IOException e10) {
            try {
                this.f32991l.a(a.C0534a.GENERIC_IO, f32977r, "getResource", e10);
                d10.h(e10);
                M5.c cVar3 = this.f32984e;
                if (cVar3 != null) {
                    cVar3.e(d10);
                }
                return null;
            } finally {
                d10.b();
            }
        } catch (Throwable th2) {
            while (true) {
            }
            throw th2;
        }
    }
}
