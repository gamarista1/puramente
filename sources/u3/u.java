package u3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;
import mf.Y;
import o.C2335c;
import v3.C2756b;
import y3.h;
import y3.j;
import y3.k;
import yf.C6798l;
import z3.C2981f;

public abstract class u {

    /* renamed from: o  reason: collision with root package name */
    public static final c f26711o = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: protected */

    /* renamed from: a  reason: collision with root package name */
    public volatile y3.g f26712a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f26713b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f26714c;

    /* renamed from: d  reason: collision with root package name */
    private y3.h f26715d;

    /* renamed from: e  reason: collision with root package name */
    private final o f26716e = g();

    /* renamed from: f  reason: collision with root package name */
    private boolean f26717f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26718g;
    /* access modifiers changed from: protected */

    /* renamed from: h  reason: collision with root package name */
    public List f26719h;

    /* renamed from: i  reason: collision with root package name */
    private Map f26720i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final ReentrantReadWriteLock f26721j = new ReentrantReadWriteLock();

    /* renamed from: k  reason: collision with root package name */
    private C2711c f26722k;

    /* renamed from: l  reason: collision with root package name */
    private final ThreadLocal f26723l = new ThreadLocal();

    /* renamed from: m  reason: collision with root package name */
    private final Map f26724m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f26725n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f26726a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f26727b;

        /* renamed from: c  reason: collision with root package name */
        private final String f26728c;

        /* renamed from: d  reason: collision with root package name */
        private final List f26729d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final List f26730e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private List f26731f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private Executor f26732g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f26733h;

        /* renamed from: i  reason: collision with root package name */
        private h.c f26734i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f26735j;

        /* renamed from: k  reason: collision with root package name */
        private d f26736k = d.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        private Intent f26737l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f26738m = true;

        /* renamed from: n  reason: collision with root package name */
        private boolean f26739n;

        /* renamed from: o  reason: collision with root package name */
        private long f26740o = -1;

        /* renamed from: p  reason: collision with root package name */
        private TimeUnit f26741p;

        /* renamed from: q  reason: collision with root package name */
        private final e f26742q = new e();

        /* renamed from: r  reason: collision with root package name */
        private Set f26743r = new LinkedHashSet();

        /* renamed from: s  reason: collision with root package name */
        private Set f26744s;

        /* renamed from: t  reason: collision with root package name */
        private String f26745t;

        /* renamed from: u  reason: collision with root package name */
        private File f26746u;

        /* renamed from: v  reason: collision with root package name */
        private Callable f26747v;

        public a(Context context, Class cls, String str) {
            C6496s.h(context, "context");
            C6496s.h(cls, "klass");
            this.f26726a = context;
            this.f26727b = cls;
            this.f26728c = str;
        }

        public a a(b bVar) {
            C6496s.h(bVar, "callback");
            this.f26729d.add(bVar);
            return this;
        }

        public a b(C2756b... bVarArr) {
            C6496s.h(bVarArr, "migrations");
            if (this.f26744s == null) {
                this.f26744s = new HashSet();
            }
            for (C2756b bVar : bVarArr) {
                Set set = this.f26744s;
                C6496s.e(set);
                set.add(Integer.valueOf(bVar.f27145a));
                Set set2 = this.f26744s;
                C6496s.e(set2);
                set2.add(Integer.valueOf(bVar.f27146b));
            }
            this.f26742q.b((C2756b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a c() {
            this.f26735j = true;
            return this;
        }

        public u d() {
            int i10;
            int i11;
            Executor executor = this.f26732g;
            if (executor == null && this.f26733h == null) {
                Executor f10 = C2335c.f();
                this.f26733h = f10;
                this.f26732g = f10;
            } else if (executor != null && this.f26733h == null) {
                this.f26733h = executor;
            } else if (executor == null) {
                this.f26732g = this.f26733h;
            }
            Set<Number> set = this.f26744s;
            if (set != null) {
                C6496s.e(set);
                for (Number intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (this.f26743r.contains(Integer.valueOf(intValue2))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            C2713e eVar = this.f26734i;
            if (eVar == null) {
                eVar = new C2981f();
            }
            if (eVar != null) {
                if (this.f26740o > 0) {
                    if (this.f26728c != null) {
                        long j10 = this.f26740o;
                        TimeUnit timeUnit = this.f26741p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f26732g;
                            if (executor2 != null) {
                                eVar = new C2713e(eVar, new C2711c(j10, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.f26745t;
                if (!(str == null && this.f26746u == null && this.f26747v == null)) {
                    if (this.f26728c != null) {
                        int i12 = 0;
                        if (str == null) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        File file = this.f26746u;
                        if (file == null) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        Callable callable = this.f26747v;
                        if (callable != null) {
                            i12 = 1;
                        }
                        if (i10 + i11 + i12 == 1) {
                            eVar = new z(str, file, callable, eVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
            } else {
                eVar = null;
            }
            z zVar = eVar;
            if (zVar != null) {
                Context context = this.f26726a;
                String str2 = this.f26728c;
                e eVar2 = this.f26742q;
                List list = this.f26729d;
                boolean z10 = this.f26735j;
                d c10 = this.f26736k.c(context);
                Executor executor3 = this.f26732g;
                if (executor3 != null) {
                    Executor executor4 = this.f26733h;
                    if (executor4 != null) {
                        C2714f fVar = new C2714f(context, str2, zVar, eVar2, list, z10, c10, executor3, executor4, this.f26737l, this.f26738m, this.f26739n, this.f26743r, this.f26745t, this.f26746u, this.f26747v, (f) null, this.f26730e, this.f26731f);
                        u uVar = (u) t.b(this.f26727b, "_Impl");
                        uVar.r(fVar);
                        return uVar;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public a e() {
            this.f26738m = false;
            this.f26739n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f26734i = cVar;
            return this;
        }

        public a g(Executor executor) {
            C6496s.h(executor, "executor");
            this.f26732g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(y3.g gVar) {
            C6496s.h(gVar, "db");
        }

        public void b(y3.g gVar) {
            C6496s.h(gVar, "db");
        }

        public void c(y3.g gVar) {
            C6496s.h(gVar, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean b(ActivityManager activityManager) {
            return y3.c.b(activityManager);
        }

        public final d c(Context context) {
            C6496s.h(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            C6496s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!b((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Map f26752a = new LinkedHashMap();

        private final void a(C2756b bVar) {
            int i10 = bVar.f27145a;
            int i11 = bVar.f27146b;
            Map map = this.f26752a;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        private final List e(List list, boolean z10, int i10, int i11) {
            Set set;
            boolean z11;
            Integer num;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f26752a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                if (z10) {
                    set = treeMap.descendingKeySet();
                } else {
                    set = treeMap.keySet();
                }
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        continue;
                        break;
                    }
                    num = (Integer) it.next();
                    if (!z10) {
                        C6496s.g(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i11 <= intValue && intValue < i10) {
                            break;
                        }
                    } else {
                        int i12 = i10 + 1;
                        C6496s.g(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i12 <= intValue2 && intValue2 <= i11) {
                            break;
                        }
                    }
                }
                Object obj = treeMap.get(num);
                C6496s.e(obj);
                list.add(obj);
                i10 = num.intValue();
                z11 = true;
                continue;
            } while (z11);
            return null;
        }

        public void b(C2756b... bVarArr) {
            C6496s.h(bVarArr, "migrations");
            for (C2756b a10 : bVarArr) {
                a(a10);
            }
        }

        public final boolean c(int i10, int i11) {
            Map f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map map = (Map) f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = O.i();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            boolean z10;
            if (i10 == i11) {
                return C6565s.n();
            }
            if (i11 > i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            return e(new ArrayList(), z10, i10, i11);
        }

        public Map f() {
            return this.f26752a;
        }
    }

    public static abstract class f {
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f26753a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(u uVar) {
            super(1);
            this.f26753a = uVar;
        }

        /* renamed from: a */
        public final Object invoke(y3.g gVar) {
            C6496s.h(gVar, "it");
            this.f26753a.s();
            return null;
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f26754a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(u uVar) {
            super(1);
            this.f26754a = uVar;
        }

        /* renamed from: a */
        public final Object invoke(y3.g gVar) {
            C6496s.h(gVar, "it");
            this.f26754a.t();
            return null;
        }
    }

    public u() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C6496s.g(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f26724m = synchronizedMap;
        this.f26725n = new LinkedHashMap();
    }

    private final Object B(Class cls, y3.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof C2715g) {
            return B(cls, ((C2715g) hVar).a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void s() {
        c();
        y3.g X02 = m().X0();
        l().t(X02);
        if (X02.q1()) {
            X02.S();
        } else {
            X02.g();
        }
    }

    /* access modifiers changed from: private */
    public final void t() {
        m().X0().k();
        if (!q()) {
            l().l();
        }
    }

    public static /* synthetic */ Cursor y(u uVar, j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                cancellationSignal = null;
            }
            return uVar.x(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public void A() {
        m().X0().j();
    }

    public void c() {
        if (!this.f26717f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f26723l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C2711c cVar = this.f26722k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new g(this));
        }
    }

    public k f(String str) {
        C6496s.h(str, "sql");
        c();
        d();
        return m().X0().G0(str);
    }

    /* access modifiers changed from: protected */
    public abstract o g();

    /* access modifiers changed from: protected */
    public abstract y3.h h(C2714f fVar);

    public void i() {
        C2711c cVar = this.f26722k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new h(this));
        }
    }

    public List j(Map map) {
        C6496s.h(map, "autoMigrationSpecs");
        return C6565s.n();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f26721j.readLock();
        C6496s.g(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.f26716e;
    }

    public y3.h m() {
        y3.h hVar = this.f26715d;
        if (hVar != null) {
            return hVar;
        }
        C6496s.v("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f26713b;
        if (executor != null) {
            return executor;
        }
        C6496s.v("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        return O.i();
    }

    public boolean q() {
        return m().X0().o1();
    }

    public void r(C2714f fVar) {
        boolean z10;
        C6496s.h(fVar, "configuration");
        this.f26715d = h(fVar);
        Set o10 = o();
        BitSet bitSet = new BitSet();
        Iterator it = o10.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = fVar.f26652r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(fVar.f26652r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 >= 0) {
                    this.f26720i.put(cls, fVar.f26652r.get(i10));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = fVar.f26652r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        } else if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (C2756b bVar : j(this.f26720i)) {
                    if (!fVar.f26638d.c(bVar.f27145a, bVar.f27146b)) {
                        fVar.f26638d.b(bVar);
                    }
                }
                y yVar = (y) B(y.class, m());
                if (yVar != null) {
                    yVar.n(fVar);
                }
                C2712d dVar = (C2712d) B(C2712d.class, m());
                if (dVar != null) {
                    this.f26722k = dVar.f26608b;
                    l().o(dVar.f26608b);
                }
                if (fVar.f26641g == d.WRITE_AHEAD_LOGGING) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m().setWriteAheadLoggingEnabled(z10);
                this.f26719h = fVar.f26639e;
                this.f26713b = fVar.f26642h;
                this.f26714c = new C2708C(fVar.f26643i);
                this.f26717f = fVar.f26640f;
                this.f26718g = z10;
                if (fVar.f26644j != null) {
                    if (fVar.f26636b != null) {
                        l().p(fVar.f26635a, fVar.f26636b, fVar.f26644j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Map p10 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : p10.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls3 = (Class) it2.next();
                            int size3 = fVar.f26651q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (cls3.isAssignableFrom(fVar.f26651q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i13 < 0) {
                                        break;
                                    } else {
                                        size3 = i13;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                this.f26725n.put(cls3, fVar.f26651q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = fVar.f26651q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i14 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + fVar.f26651q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i14 >= 0) {
                            size4 = i14;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void u(y3.g gVar) {
        C6496s.h(gVar, "db");
        l().i(gVar);
    }

    public final boolean v() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        C2711c cVar = this.f26722k;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            y3.g gVar = this.f26712a;
            if (gVar != null) {
                isOpen = gVar.isOpen();
            } else {
                bool = null;
                return C6496s.c(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return C6496s.c(bool, Boolean.TRUE);
    }

    public Cursor x(j jVar, CancellationSignal cancellationSignal) {
        C6496s.h(jVar, "query");
        c();
        d();
        if (cancellationSignal != null) {
            return m().X0().b0(jVar, cancellationSignal);
        }
        return m().X0().j1(jVar);
    }

    public Object z(Callable callable) {
        C6496s.h(callable, "body");
        e();
        try {
            Object call = callable.call();
            A();
            return call;
        } finally {
            i();
        }
    }
}
