package V;

import Q0.T;
import X.H;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import yf.C6787a;

public abstract class Z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f7178a = C1521x.f(a.f7179a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7179a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Y0 invoke() {
            return new Y0((T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, (T) null, 32767, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7180a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                X.H[] r0 = X.H.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                X.H r1 = X.H.DisplayLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                X.H r1 = X.H.DisplayMedium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                X.H r1 = X.H.DisplaySmall     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                X.H r1 = X.H.HeadlineLarge     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                X.H r1 = X.H.HeadlineMedium     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                X.H r1 = X.H.HeadlineSmall     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                X.H r1 = X.H.TitleLarge     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                X.H r1 = X.H.TitleMedium     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                X.H r1 = X.H.TitleSmall     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                X.H r1 = X.H.BodyLarge     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                X.H r1 = X.H.BodyMedium     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                X.H r1 = X.H.BodySmall     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                X.H r1 = X.H.LabelLarge     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                X.H r1 = X.H.LabelMedium     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                X.H r1 = X.H.LabelSmall     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                f7180a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.Z0.b.<clinit>():void");
        }
    }

    private static final T a(Y0 y02, H h10) {
        switch (b.f7180a[h10.ordinal()]) {
            case 1:
                return y02.f();
            case 2:
                return y02.g();
            case 3:
                return y02.h();
            case 4:
                return y02.i();
            case 5:
                return y02.j();
            case 6:
                return y02.k();
            case 7:
                return y02.o();
            case 8:
                return y02.p();
            case 9:
                return y02.q();
            case 10:
                return y02.c();
            case 11:
                return y02.d();
            case 12:
                return y02.e();
            case 13:
                return y02.l();
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return y02.m();
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return y02.n();
            default:
                throw new C6535s();
        }
    }

    public static final I0 b() {
        return f7178a;
    }

    public static final T c(H h10, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1049072145, i10, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        T a10 = a(X.f7146a.c(mVar, 6), h10);
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }
}
