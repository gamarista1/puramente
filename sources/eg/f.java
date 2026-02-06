package Eg;

import Sg.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import yf.C6787a;
import yf.C6798l;

public class f implements n {

    /* renamed from: d  reason: collision with root package name */
    private static final String f62841d = p.c1(f.class.getCanonicalName(), ".", "");

    /* renamed from: e  reason: collision with root package name */
    public static final n f62842e = new a("NO_LOCKS", C0930f.f62851a, e.f62840b);

    /* renamed from: a  reason: collision with root package name */
    protected final k f62843a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0930f f62844b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62845c;

    static class a extends f {
        a(String str, C0930f fVar, k kVar) {
            super(str, fVar, kVar, (a) null);
        }

        private static /* synthetic */ void j(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 1) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 1) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i10 != 1) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        /* access modifiers changed from: protected */
        public o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o a10 = o.a();
            if (a10 == null) {
                j(1);
            }
            return a10;
        }
    }

    class b extends j {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f62846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, C6787a aVar, Object obj) {
            super(fVar, aVar);
            this.f62846d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"}));
        }

        /* access modifiers changed from: protected */
        public o c(boolean z10) {
            o d10 = o.d(this.f62846d);
            if (d10 == null) {
                a(0);
            }
            return d10;
        }
    }

    class c extends k {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f62848e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f62849f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C6787a aVar, C6798l lVar, C6798l lVar2) {
            super(fVar, aVar);
            this.f62848e = lVar;
            this.f62849f = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 2) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i10 != 2) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        /* access modifiers changed from: protected */
        public o c(boolean z10) {
            C6798l lVar = this.f62848e;
            if (lVar == null) {
                o c10 = super.c(z10);
                if (c10 == null) {
                    a(0);
                }
                return c10;
            }
            o d10 = o.d(lVar.invoke(Boolean.valueOf(z10)));
            if (d10 == null) {
                a(1);
            }
            return d10;
        }

        /* access modifiers changed from: protected */
        public void e(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f62849f.invoke(obj);
        }
    }

    private static class d extends e implements a {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 3) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        public Object a(Object obj, C6787a aVar) {
            if (aVar == null) {
                b(2);
            }
            Object a10 = super.a(obj, aVar);
            if (a10 == null) {
                b(3);
            }
            return a10;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, (a) null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    private static class e extends l implements b {

        class a implements C6798l {
            a() {
            }

            /* renamed from: a */
            public Object invoke(g gVar) {
                return gVar.f62853b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, C6787a aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(obj, aVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: Eg.f$f  reason: collision with other inner class name */
    public interface C0930f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0930f f62851a = new a();

        /* renamed from: Eg.f$f$a */
        static class a implements C0930f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw Pg.d.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        private final Object f62852a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6787a f62853b;

        public g(Object obj, C6787a aVar) {
            this.f62852a = obj;
            this.f62853b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !this.f62852a.equals(((g) obj).f62852a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f62852a.hashCode();
        }
    }

    private static abstract class i extends h {

        /* renamed from: d  reason: collision with root package name */
        private volatile l f62857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(f fVar, C6787a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f62857d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* access modifiers changed from: protected */
        public final void b(Object obj) {
            this.f62857d = new l(obj);
            try {
                e(obj);
            } finally {
                this.f62857d = null;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void e(Object obj);

        public Object invoke() {
            l lVar = this.f62857d;
            if (lVar == null || !lVar.b()) {
                return super.invoke();
            }
            return lVar.a();
        }
    }

    private static class j extends h implements i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(f fVar, C6787a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 2) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    private static abstract class k extends i implements i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(f fVar, C6787a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 2) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    private static class l implements h {

        /* renamed from: a  reason: collision with root package name */
        private final f f62858a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap f62859b;

        /* renamed from: c  reason: collision with root package name */
        private final C6798l f62860c;

        public l(f fVar, ConcurrentMap concurrentMap, C6798l lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f62858a = fVar;
            this.f62859b = concurrentMap;
            this.f62860c = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 == 3 || i10 == 4) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i10 == 3 || i10 == 4) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i10 == 3 || i10 == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3 || i10 == 4) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        private AssertionError c(Object obj, Object obj2) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f62858a));
        }

        private AssertionError e(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f62858a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError i(Object obj, Throwable th2) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + obj + " under " + this.f62858a, th2));
        }

        /* access modifiers changed from: protected */
        public o h(Object obj, boolean z10) {
            o p10 = this.f62858a.p("", obj);
            if (p10 == null) {
                b(3);
            }
            return p10;
        }

        public Object invoke(Object obj) {
            Object d10;
            Object obj2 = this.f62859b.get(obj);
            if (obj2 != null && obj2 != n.COMPUTING) {
                return Pg.m.d(obj2);
            }
            this.f62858a.f62843a.lock();
            try {
                Object obj3 = this.f62859b.get(obj);
                n nVar = n.COMPUTING;
                if (obj3 == nVar) {
                    obj3 = n.RECURSION_WAS_DETECTED;
                    o h10 = h(obj, true);
                    if (!h10.c()) {
                        d10 = h10.b();
                        this.f62858a.f62843a.unlock();
                        return d10;
                    }
                }
                if (obj3 == n.RECURSION_WAS_DETECTED) {
                    o h11 = h(obj, false);
                    if (!h11.c()) {
                        d10 = h11.b();
                        this.f62858a.f62843a.unlock();
                        return d10;
                    }
                }
                if (obj3 != null) {
                    d10 = Pg.m.d(obj3);
                    this.f62858a.f62843a.unlock();
                    return d10;
                }
                this.f62859b.put(obj, nVar);
                Object invoke = this.f62860c.invoke(obj);
                Object put = this.f62859b.put(obj, Pg.m.b(invoke));
                if (put == nVar) {
                    this.f62858a.f62843a.unlock();
                    return invoke;
                }
                throw e(obj, put);
            } catch (Throwable th2) {
                throw i(obj, th2);
            }
        }

        public boolean n(Object obj) {
            Object obj2 = this.f62859b.get(obj);
            if (obj2 == null || obj2 == n.COMPUTING) {
                return false;
            }
            return true;
        }
    }

    private static class m extends l implements g {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, C6798l lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 3) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        public Object invoke(Object obj) {
            Object invoke = super.invoke(obj);
            if (invoke == null) {
                b(3);
            }
            return invoke;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private final Object f62865a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f62866b;

        private o(Object obj, boolean z10) {
            this.f62865a = obj;
            this.f62866b = z10;
        }

        public static o a() {
            return new o((Object) null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f62865a;
        }

        public boolean c() {
            return this.f62866b;
        }

        public String toString() {
            if (c()) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f62865a);
        }
    }

    /* synthetic */ f(String str, C0930f fVar, k kVar, a aVar) {
        this(str, fVar, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void j(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = r5
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "compute"
            java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r9
            goto L_0x0069
        L_0x005d:
            r7[r11] = r8
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "createMemoizedFunction"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "sanitizeStackTrace"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r9
            goto L_0x0082
        L_0x007a:
            r7[r10] = r12
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r5
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r12
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r8
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Eg.f.j(int):void");
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* access modifiers changed from: private */
    public static Throwable q(Throwable th2) {
        if (th2 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!stackTrace[i10].getClassName().startsWith(f62841d)) {
                break;
            } else {
                i10++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        th2.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return th2;
    }

    public a a() {
        return new d(this, m(), (a) null);
    }

    public i b(C6787a aVar, Object obj) {
        if (aVar == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, aVar, obj);
    }

    public h c(C6798l lVar) {
        if (lVar == null) {
            j(19);
        }
        h o10 = o(lVar, m());
        if (o10 == null) {
            j(20);
        }
        return o10;
    }

    public j d(C6787a aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    public b e() {
        return new e(this, m(), (a) null);
    }

    public Object f(C6787a aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f62843a.lock();
        try {
            Object invoke = aVar.invoke();
            this.f62843a.unlock();
            return invoke;
        } catch (Throwable th2) {
            this.f62843a.unlock();
            throw th2;
        }
    }

    public i g(C6787a aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    public g h(C6798l lVar) {
        if (lVar == null) {
            j(9);
        }
        g n10 = n(lVar, m());
        if (n10 == null) {
            j(10);
        }
        return n10;
    }

    public i i(C6787a aVar, C6798l lVar, C6798l lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    public g n(C6798l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public h o(C6798l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    /* access modifiers changed from: protected */
    public o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f62845c + ")";
    }

    private f(String str, C0930f fVar, k kVar) {
        if (str == null) {
            j(4);
        }
        if (fVar == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f62843a = kVar;
        this.f62844b = fVar;
        this.f62845c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (C6798l) null);
    }

    public f(String str, Runnable runnable, C6798l lVar) {
        this(str, C0930f.f62851a, (k) k.f62867a.a(runnable, lVar));
    }

    private static class h implements j {

        /* renamed from: a  reason: collision with root package name */
        private final f f62854a;

        /* renamed from: b  reason: collision with root package name */
        private final C6787a f62855b;

        /* renamed from: c  reason: collision with root package name */
        private volatile Object f62856c;

        public h(f fVar, C6787a aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f62856c = n.NOT_COMPUTED;
            this.f62854a = fVar;
            this.f62855b = aVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 == 2 || i10 == 3) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i10 == 2 || i10 == 3) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i10 == 2 || i10 == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2 || i10 == 3) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        /* access modifiers changed from: protected */
        public o c(boolean z10) {
            o p10 = this.f62854a.p("in a lazy value", (Object) null);
            if (p10 == null) {
                a(2);
            }
            return p10;
        }

        public Object invoke() {
            Object invoke;
            Object obj = this.f62856c;
            if (!(obj instanceof n)) {
                return Pg.m.f(obj);
            }
            this.f62854a.f62843a.lock();
            try {
                Object obj2 = this.f62856c;
                if (!(obj2 instanceof n)) {
                    invoke = Pg.m.f(obj2);
                } else {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f62856c = n.RECURSION_WAS_DETECTED;
                        o c10 = c(true);
                        if (!c10.c()) {
                            invoke = c10.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o c11 = c(false);
                        if (!c11.c()) {
                            invoke = c11.b();
                        }
                    }
                    this.f62856c = nVar;
                    invoke = this.f62855b.invoke();
                    b(invoke);
                    this.f62856c = invoke;
                }
                this.f62854a.f62843a.unlock();
                return invoke;
            } catch (Throwable th2) {
                this.f62854a.f62843a.unlock();
                throw th2;
            }
        }

        public boolean k() {
            if (this.f62856c == n.NOT_COMPUTED || this.f62856c == n.COMPUTING) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public void b(Object obj) {
        }
    }
}
