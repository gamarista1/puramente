package androidx.lifecycle;

import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
public final class C1782e implements C1795s {

    /* renamed from: a  reason: collision with root package name */
    private final DefaultLifecycleObserver f17213a;

    /* renamed from: b  reason: collision with root package name */
    private final C1795s f17214b;

    /* renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17215a;

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
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
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
                f17215a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1782e.a.<clinit>():void");
        }
    }

    public C1782e(DefaultLifecycleObserver defaultLifecycleObserver, C1795s sVar) {
        C6496s.h(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f17213a = defaultLifecycleObserver;
        this.f17214b = sVar;
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        switch (a.f17215a[aVar.ordinal()]) {
            case 1:
                this.f17213a.onCreate(vVar);
                break;
            case 2:
                this.f17213a.onStart(vVar);
                break;
            case 3:
                this.f17213a.onResume(vVar);
                break;
            case 4:
                this.f17213a.onPause(vVar);
                break;
            case 5:
                this.f17213a.onStop(vVar);
                break;
            case 6:
                this.f17213a.onDestroy(vVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1795s sVar = this.f17214b;
        if (sVar != null) {
            sVar.f(vVar, aVar);
        }
    }
}
