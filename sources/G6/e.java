package G6;

import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f31520b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final e[] f31521c = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f31531a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31532a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                G6.e[] r0 = G6.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                G6.e r1 = G6.e.REQUESTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                G6.e r1 = G6.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                G6.e r1 = G6.e.INTERMEDIATE_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                G6.e r1 = G6.e.ERROR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                G6.e r1 = G6.e.RELEASED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f31532a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G6.e.b.<clinit>():void");
        }
    }

    static {
        e[] a10;
        f31530l = C6714a.a(a10);
        f31520b = new a((DefaultConstructorMarker) null);
        f31521c = values();
    }

    private e(int i10) {
        this.f31531a = i10;
    }

    public String toString() {
        int i10 = b.f31532a[ordinal()];
        if (i10 == 1) {
            return MetricTracker.Action.REQUESTED;
        }
        if (i10 == 2) {
            return com.amazon.device.simplesignin.a.a.a.f38020s;
        }
        if (i10 == 3) {
            return "intermediate_available";
        }
        if (i10 == 4) {
            return RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR;
        }
        if (i10 != 5) {
            return "unknown";
        }
        return "released";
    }
}
