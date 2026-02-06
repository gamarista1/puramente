package J;

import B0.c;
import B0.d;
import P.F;
import P.G;
import P.J;
import W0.C1433a;
import W0.C1439g;
import W0.C1441i;
import W0.C1443k;
import W0.C1446n;
import W0.I;
import W0.r;
import android.view.KeyEvent;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final C1228y f2903a;

    /* renamed from: b  reason: collision with root package name */
    private final G f2904b;

    /* renamed from: c  reason: collision with root package name */
    private final W0.Q f2905c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2906d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2907e;

    /* renamed from: f  reason: collision with root package name */
    private final J f2908f;

    /* renamed from: g  reason: collision with root package name */
    private final I f2909g;

    /* renamed from: h  reason: collision with root package name */
    private final l0 f2910h;

    /* renamed from: i  reason: collision with root package name */
    private final C1214j f2911i;

    /* renamed from: j  reason: collision with root package name */
    private final r f2912j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C6798l f2913k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int f2914l;

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1220p f2916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f2917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f2918c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f2919a = new a();

            a() {
                super(1);
            }

            public final void a(F f10) {
                f10.A();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((F) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: J.Q$b$b  reason: collision with other inner class name */
        static final class C0053b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0053b f2920a = new C0053b();

            C0053b() {
                super(1);
            }

            public final void a(F f10) {
                f10.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((F) obj);
                return C6514M.f71813a;
            }
        }

        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final c f2921a = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                return new C1439g(Q0.Q.i(f10.u()) - f10.q(), 0);
            }
        }

        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final d f2922a = new d();

            d() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                int l10 = f10.l();
                if (l10 != -1) {
                    return new C1439g(0, l10 - Q0.Q.i(f10.u()));
                }
                return null;
            }
        }

        static final class e extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final e f2923a = new e();

            e() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                Integer t10 = f10.t();
                if (t10 == null) {
                    return null;
                }
                return new C1439g(Q0.Q.i(f10.u()) - t10.intValue(), 0);
            }
        }

        static final class f extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final f f2924a = new f();

            f() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                Integer m10 = f10.m();
                if (m10 != null) {
                    return new C1439g(0, m10.intValue() - Q0.Q.i(f10.u()));
                }
                return null;
            }
        }

        static final class g extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final g f2925a = new g();

            g() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                Integer i10 = f10.i();
                if (i10 == null) {
                    return null;
                }
                return new C1439g(Q0.Q.i(f10.u()) - i10.intValue(), 0);
            }
        }

        static final class h extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final h f2926a = new h();

            h() {
                super(1);
            }

            /* renamed from: a */
            public final C1441i invoke(F f10) {
                Integer f11 = f10.f();
                if (f11 != null) {
                    return new C1439g(0, f11.intValue() - Q0.Q.i(f10.u()));
                }
                return null;
            }
        }

        public /* synthetic */ class i {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f2927a;

            /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(2:95|96)|97|99) */
            /* JADX WARNING: Can't wrap try/catch for region: R(99:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|99) */
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
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01ae */
            /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01b8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01c2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01cc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    J.p[] r0 = J.C1220p.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    J.p r1 = J.C1220p.COPY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    J.p r1 = J.C1220p.PASTE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    J.p r1 = J.C1220p.CUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    J.p r1 = J.C1220p.LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    J.p r1 = J.C1220p.RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    J.p r1 = J.C1220p.LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    J.p r1 = J.C1220p.RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    J.p r1 = J.C1220p.PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    J.p r1 = J.C1220p.NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    J.p r1 = J.C1220p.UP     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    J.p r1 = J.C1220p.DOWN     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    J.p r1 = J.C1220p.PAGE_UP     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    J.p r1 = J.C1220p.PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    J.p r1 = J.C1220p.LINE_START     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    J.p r1 = J.C1220p.LINE_END     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    J.p r1 = J.C1220p.LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    J.p r1 = J.C1220p.LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    J.p r1 = J.C1220p.HOME     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    J.p r1 = J.C1220p.END     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    J.p r1 = J.C1220p.DELETE_PREV_CHAR     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    J.p r1 = J.C1220p.DELETE_NEXT_CHAR     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    J.p r1 = J.C1220p.DELETE_PREV_WORD     // Catch:{ NoSuchFieldError -> 0x00dc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                    r2 = 22
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                L_0x00dc:
                    J.p r1 = J.C1220p.DELETE_NEXT_WORD     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    r2 = 23
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                L_0x00e6:
                    J.p r1 = J.C1220p.DELETE_FROM_LINE_START     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    r2 = 24
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                L_0x00f0:
                    J.p r1 = J.C1220p.DELETE_TO_LINE_END     // Catch:{ NoSuchFieldError -> 0x00fa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                    r2 = 25
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                L_0x00fa:
                    J.p r1 = J.C1220p.NEW_LINE     // Catch:{ NoSuchFieldError -> 0x0104 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                    r2 = 26
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                L_0x0104:
                    J.p r1 = J.C1220p.TAB     // Catch:{ NoSuchFieldError -> 0x010e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                    r2 = 27
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                L_0x010e:
                    J.p r1 = J.C1220p.SELECT_ALL     // Catch:{ NoSuchFieldError -> 0x0118 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                    r2 = 28
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                L_0x0118:
                    J.p r1 = J.C1220p.SELECT_LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x0122 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                    r2 = 29
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                L_0x0122:
                    J.p r1 = J.C1220p.SELECT_RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x012c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                    r2 = 30
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                L_0x012c:
                    J.p r1 = J.C1220p.SELECT_LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x0136 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                    r2 = 31
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
                L_0x0136:
                    J.p r1 = J.C1220p.SELECT_RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0140 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                    r2 = 32
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
                L_0x0140:
                    J.p r1 = J.C1220p.SELECT_PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x014a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                    r2 = 33
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
                L_0x014a:
                    J.p r1 = J.C1220p.SELECT_NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0154 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                    r2 = 34
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
                L_0x0154:
                    J.p r1 = J.C1220p.SELECT_LINE_START     // Catch:{ NoSuchFieldError -> 0x015e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                    r2 = 35
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
                L_0x015e:
                    J.p r1 = J.C1220p.SELECT_LINE_END     // Catch:{ NoSuchFieldError -> 0x0168 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                    r2 = 36
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
                L_0x0168:
                    J.p r1 = J.C1220p.SELECT_LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x0172 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                    r2 = 37
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
                L_0x0172:
                    J.p r1 = J.C1220p.SELECT_LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x017c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                    r2 = 38
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
                L_0x017c:
                    J.p r1 = J.C1220p.SELECT_UP     // Catch:{ NoSuchFieldError -> 0x0186 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                    r2 = 39
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
                L_0x0186:
                    J.p r1 = J.C1220p.SELECT_DOWN     // Catch:{ NoSuchFieldError -> 0x0190 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                    r2 = 40
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
                L_0x0190:
                    J.p r1 = J.C1220p.SELECT_PAGE_UP     // Catch:{ NoSuchFieldError -> 0x019a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                    r2 = 41
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
                L_0x019a:
                    J.p r1 = J.C1220p.SELECT_PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    r2 = 42
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
                L_0x01a4:
                    J.p r1 = J.C1220p.SELECT_HOME     // Catch:{ NoSuchFieldError -> 0x01ae }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                    r2 = 43
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
                L_0x01ae:
                    J.p r1 = J.C1220p.SELECT_END     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    r2 = 44
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
                L_0x01b8:
                    J.p r1 = J.C1220p.DESELECT     // Catch:{ NoSuchFieldError -> 0x01c2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                    r2 = 45
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
                L_0x01c2:
                    J.p r1 = J.C1220p.UNDO     // Catch:{ NoSuchFieldError -> 0x01cc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                    r2 = 46
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cc }
                L_0x01cc:
                    J.p r1 = J.C1220p.REDO     // Catch:{ NoSuchFieldError -> 0x01d6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                    r2 = 47
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d6 }
                L_0x01d6:
                    J.p r1 = J.C1220p.CHARACTER_PALETTE     // Catch:{ NoSuchFieldError -> 0x01e0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                    r2 = 48
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
                L_0x01e0:
                    f2927a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: J.Q.b.i.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1220p pVar, Q q10, kotlin.jvm.internal.J j10) {
            super(1);
            this.f2916a = pVar;
            this.f2917b = q10;
            this.f2918c = j10;
        }

        public final void a(F f10) {
            W0.Q g10;
            W0.Q c10;
            switch (i.f2927a[this.f2916a.ordinal()]) {
                case 1:
                    this.f2917b.h().o(false);
                    return;
                case 2:
                    this.f2917b.h().T();
                    return;
                case 3:
                    this.f2917b.h().s();
                    return;
                case 4:
                    f10.b(a.f2919a);
                    return;
                case 5:
                    f10.c(C0053b.f2920a);
                    return;
                case 6:
                    f10.B();
                    return;
                case 7:
                    f10.J();
                    return;
                case 8:
                    f10.G();
                    return;
                case 9:
                    f10.D();
                    return;
                case 10:
                    f10.Q();
                    return;
                case 11:
                    f10.z();
                    return;
                case 12:
                    f10.c0();
                    return;
                case 13:
                    f10.b0();
                    return;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    f10.P();
                    return;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    f10.M();
                    return;
                case 16:
                    f10.N();
                    return;
                case 17:
                    f10.O();
                    return;
                case 18:
                    f10.L();
                    return;
                case 19:
                    f10.K();
                    return;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    List Y10 = f10.Y(c.f2921a);
                    if (Y10 != null) {
                        this.f2917b.f(Y10);
                        return;
                    }
                    return;
                case 21:
                    List Y11 = f10.Y(d.f2922a);
                    if (Y11 != null) {
                        this.f2917b.f(Y11);
                        return;
                    }
                    return;
                case 22:
                    List Y12 = f10.Y(e.f2923a);
                    if (Y12 != null) {
                        this.f2917b.f(Y12);
                        return;
                    }
                    return;
                case 23:
                    List Y13 = f10.Y(f.f2924a);
                    if (Y13 != null) {
                        this.f2917b.f(Y13);
                        return;
                    }
                    return;
                case 24:
                    List Y14 = f10.Y(g.f2925a);
                    if (Y14 != null) {
                        this.f2917b.f(Y14);
                        return;
                    }
                    return;
                case 25:
                    List Y15 = f10.Y(h.f2926a);
                    if (Y15 != null) {
                        this.f2917b.f(Y15);
                        return;
                    }
                    return;
                case 26:
                    if (!this.f2917b.i()) {
                        this.f2917b.e(new C1433a("\n", 1));
                        return;
                    } else {
                        this.f2917b.j().l().invoke(r.j(this.f2917b.f2914l));
                        return;
                    }
                case 27:
                    if (!this.f2917b.i()) {
                        this.f2917b.e(new C1433a("\t", 1));
                        return;
                    } else {
                        this.f2918c.f71755a = false;
                        return;
                    }
                case 28:
                    f10.R();
                    return;
                case 29:
                    ((F) f10.A()).S();
                    return;
                case 30:
                    ((F) f10.I()).S();
                    return;
                case 31:
                    ((F) f10.B()).S();
                    return;
                case com.amazon.c.a.a.c.f37660h /*32*/:
                    ((F) f10.J()).S();
                    return;
                case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                    ((F) f10.G()).S();
                    return;
                case 34:
                    ((F) f10.D()).S();
                    return;
                case 35:
                    ((F) f10.P()).S();
                    return;
                case 36:
                    ((F) f10.M()).S();
                    return;
                case 37:
                    ((F) f10.N()).S();
                    return;
                case 38:
                    ((F) f10.O()).S();
                    return;
                case 39:
                    ((F) f10.Q()).S();
                    return;
                case 40:
                    ((F) f10.z()).S();
                    return;
                case 41:
                    f10.c0().S();
                    return;
                case 42:
                    f10.b0().S();
                    return;
                case 43:
                    ((F) f10.L()).S();
                    return;
                case Carousel.ENTITY_TYPE /*44*/:
                    ((F) f10.K()).S();
                    return;
                case 45:
                    f10.d();
                    return;
                case 46:
                    l0 k10 = this.f2917b.k();
                    if (k10 != null) {
                        k10.b(f10.Z());
                    }
                    l0 k11 = this.f2917b.k();
                    if (k11 != null && (g10 = k11.g()) != null) {
                        this.f2917b.f2913k.invoke(g10);
                        return;
                    }
                    return;
                case 47:
                    l0 k12 = this.f2917b.k();
                    if (k12 != null && (c10 = k12.c()) != null) {
                        this.f2917b.f2913k.invoke(c10);
                        return;
                    }
                    return;
                case 48:
                    C1221q.b();
                    return;
                default:
                    return;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ Q(C1228y yVar, G g10, W0.Q q10, boolean z10, boolean z11, J j10, I i10, l0 l0Var, C1214j jVar, r rVar, C6798l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, g10, q10, z10, z11, j10, i10, l0Var, jVar, rVar, lVar, i11);
    }

    /* access modifiers changed from: private */
    public final void e(C1441i iVar) {
        f(C6565s.e(iVar));
    }

    /* access modifiers changed from: private */
    public final void f(List list) {
        C1443k n10 = this.f2903a.n();
        List h12 = C6565s.h1(list);
        h12.add(0, new C1446n());
        this.f2913k.invoke(n10.b(h12));
    }

    private final void g(C6798l lVar) {
        F f10 = new F(this.f2905c, this.f2909g, this.f2903a.j(), this.f2908f);
        lVar.invoke(f10);
        if (!Q0.Q.g(f10.u(), this.f2905c.g()) || !C6496s.c(f10.e(), this.f2905c.e())) {
            this.f2913k.invoke(f10.Z());
        }
    }

    private final C1433a m(KeyEvent keyEvent) {
        Integer a10;
        if (!T.a(keyEvent) || (a10 = this.f2911i.a(keyEvent)) == null) {
            return null;
        }
        return new C1433a(F.a(new StringBuilder(), a10.intValue()).toString(), 1);
    }

    public final G h() {
        return this.f2904b;
    }

    public final boolean i() {
        return this.f2907e;
    }

    public final C1228y j() {
        return this.f2903a;
    }

    public final l0 k() {
        return this.f2910h;
    }

    public final boolean l(KeyEvent keyEvent) {
        C1220p a10;
        C1433a m10 = m(keyEvent);
        if (m10 != null) {
            if (!this.f2906d) {
                return false;
            }
            e(m10);
            this.f2908f.b();
            return true;
        } else if (!c.e(d.b(keyEvent), c.f765a.a()) || (a10 = this.f2912j.a(keyEvent)) == null || (a10.b() && !this.f2906d)) {
            return false;
        } else {
            kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
            j10.f71755a = true;
            g(new b(a10, this, j10));
            l0 l0Var = this.f2910h;
            if (l0Var != null) {
                l0Var.a();
            }
            return j10.f71755a;
        }
    }

    private Q(C1228y yVar, G g10, W0.Q q10, boolean z10, boolean z11, J j10, I i10, l0 l0Var, C1214j jVar, r rVar, C6798l lVar, int i11) {
        this.f2903a = yVar;
        this.f2904b = g10;
        this.f2905c = q10;
        this.f2906d = z10;
        this.f2907e = z11;
        this.f2908f = j10;
        this.f2909g = i10;
        this.f2910h = l0Var;
        this.f2911i = jVar;
        this.f2912j = rVar;
        this.f2913k = lVar;
        this.f2914l = i11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Q(J.C1228y r24, P.G r25, W0.Q r26, boolean r27, boolean r28, P.J r29, W0.I r30, J.l0 r31, J.C1214j r32, J.r r33, yf.C6798l r34, int r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r23 = this;
            r0 = r36
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            W0.Q r1 = new W0.Q
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (Q0.Q) r6, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r26
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = r1
            goto L_0x001f
        L_0x001d:
            r13 = r27
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r28
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            W0.I$a r1 = W0.I.f8482a
            W0.I r1 = r1.a()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r30
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r31
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            J.r r1 = J.C1223t.a()
            r19 = r1
            goto L_0x004e
        L_0x004c:
            r19 = r33
        L_0x004e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            J.Q$a r0 = J.Q.a.f2915a
            r20 = r0
            goto L_0x0059
        L_0x0057:
            r20 = r34
        L_0x0059:
            r22 = 0
            r9 = r23
            r10 = r24
            r11 = r25
            r15 = r29
            r18 = r32
            r21 = r35
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.Q.<init>(J.y, P.G, W0.Q, boolean, boolean, P.J, W0.I, J.l0, J.j, J.r, yf.l, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2915a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W0.Q) obj);
            return C6514M.f71813a;
        }

        public final void a(W0.Q q10) {
        }
    }
}
