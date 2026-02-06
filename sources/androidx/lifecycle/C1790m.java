package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.lifecycle.m  reason: case insensitive filesystem */
public abstract class C1790m {

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference f17238a = new AtomicReference((Object) null);

    /* renamed from: androidx.lifecycle.m$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0305a Companion = null;

        /* renamed from: androidx.lifecycle.m$a$a  reason: collision with other inner class name */
        public static final class C0305a {

            /* renamed from: androidx.lifecycle.m$a$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0306a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f17239a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.m$b[] r0 = androidx.lifecycle.C1790m.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f17239a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1790m.a.C0305a.C0306a.<clinit>():void");
                }
            }

            public /* synthetic */ C0305a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b bVar) {
                C6496s.h(bVar, "state");
                int i10 = C0306a.f17239a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                C6496s.h(bVar, "state");
                int i10 = C0306a.f17239a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                C6496s.h(bVar, "state");
                int i10 = C0306a.f17239a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0305a() {
            }
        }

        /* renamed from: androidx.lifecycle.m$a$b */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17240a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.m$a[] r0 = androidx.lifecycle.C1790m.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f17240a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1790m.a.b.<clinit>():void");
            }
        }

        static {
            Companion = new C0305a((DefaultConstructorMarker) null);
        }

        public static final a b(b bVar) {
            return Companion.a(bVar);
        }

        public static final a e(b bVar) {
            return Companion.c(bVar);
        }

        public final b c() {
            switch (b.f17240a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.m$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean b(b bVar) {
            C6496s.h(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    public abstract void a(C1797u uVar);

    public abstract b b();

    public final AtomicReference c() {
        return this.f17238a;
    }

    public abstract void d(C1797u uVar);
}
