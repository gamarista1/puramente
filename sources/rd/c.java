package Rd;

import com.amazon.a.a.o.b;
import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import sf.C6714a;

public enum c {
    Trace("trace"),
    Timer("timer"),
    Stacktrace("stacktrace"),
    Debug(b.ar),
    Info("info"),
    Warn("warn"),
    Error(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR),
    Fatal("fatal");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f52339b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f52350a;

    public static final class a {

        /* renamed from: Rd.c$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0802a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f52351a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Rd.c[] r0 = Rd.c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Rd.c r1 = Rd.c.Trace     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Rd.c r1 = Rd.c.Timer     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Rd.c r1 = Rd.c.Stacktrace     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Rd.c r1 = Rd.c.Debug     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Rd.c r1 = Rd.c.Info     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Rd.c r1 = Rd.c.Warn     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Rd.c r1 = Rd.c.Error     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    Rd.c r1 = Rd.c.Fatal     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    f52351a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Rd.c.a.C0802a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(c cVar) {
            C6496s.h(cVar, "type");
            switch (C0802a.f52351a[cVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    throw new C6535s();
            }
        }

        private a() {
        }
    }

    static {
        c[] a10;
        f52349l = C6714a.a(a10);
        f52339b = new a((DefaultConstructorMarker) null);
    }

    private c(String str) {
        this.f52350a = str;
    }

    public final String b() {
        return this.f52350a;
    }
}
