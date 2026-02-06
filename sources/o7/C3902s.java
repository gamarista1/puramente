package o7;

import Sg.p;
import com.facebook.I;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3905v;

/* renamed from: o7.s  reason: case insensitive filesystem */
public final class C3902s {

    /* renamed from: a  reason: collision with root package name */
    public static final C3902s f47290a = new C3902s();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f47291b = new HashMap();

    /* renamed from: o7.s$a */
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: o7.s$b */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(16843785),
        BannedParamFiltering(16843786),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        GPSARATriggers(393216),
        GPSPACAProcessing(458752),
        GPSTopicsObservation(524288),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432);
        

        /* renamed from: b  reason: collision with root package name */
        public static final a f47304b = null;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f47339a;

        /* renamed from: o7.s$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i10) {
                for (b bVar : b.values()) {
                    if (bVar.f47339a == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }

            private a() {
            }
        }

        /* renamed from: o7.s$b$b  reason: collision with other inner class name */
        public /* synthetic */ class C0710b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f47340a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(90:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(2:87|88)|89|91) */
            /* JADX WARNING: Can't wrap try/catch for region: R(91:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|91) */
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
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    o7.s$b[] r0 = o7.C3902s.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    o7.s$b r1 = o7.C3902s.b.Core     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    o7.s$b r1 = o7.C3902s.b.AppEvents     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    o7.s$b r1 = o7.C3902s.b.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    o7.s$b r1 = o7.C3902s.b.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    o7.s$b r1 = o7.C3902s.b.Instrument     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    o7.s$b r1 = o7.C3902s.b.CrashReport     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    o7.s$b r1 = o7.C3902s.b.CrashShield     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    o7.s$b r1 = o7.C3902s.b.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    o7.s$b r1 = o7.C3902s.b.ErrorReport     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    o7.s$b r1 = o7.C3902s.b.AnrReport     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    o7.s$b r1 = o7.C3902s.b.AAM     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    o7.s$b r1 = o7.C3902s.b.CloudBridge     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    o7.s$b r1 = o7.C3902s.b.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    o7.s$b r1 = o7.C3902s.b.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    o7.s$b r1 = o7.C3902s.b.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    o7.s$b r1 = o7.C3902s.b.StdParamEnforcement     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    o7.s$b r1 = o7.C3902s.b.ProtectedMode     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    o7.s$b r1 = o7.C3902s.b.BannedParamFiltering     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    o7.s$b r1 = o7.C3902s.b.MACARuleMatching     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    o7.s$b r1 = o7.C3902s.b.BlocklistEvents     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    o7.s$b r1 = o7.C3902s.b.FilterRedactedEvents     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    o7.s$b r1 = o7.C3902s.b.FilterSensitiveParams     // Catch:{ NoSuchFieldError -> 0x00dc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                    r2 = 22
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                L_0x00dc:
                    o7.s$b r1 = o7.C3902s.b.ModelRequest     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    r2 = 23
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                L_0x00e6:
                    o7.s$b r1 = o7.C3902s.b.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    r2 = 24
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                L_0x00f0:
                    o7.s$b r1 = o7.C3902s.b.OnDeviceEventProcessing     // Catch:{ NoSuchFieldError -> 0x00fa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                    r2 = 25
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                L_0x00fa:
                    o7.s$b r1 = o7.C3902s.b.OnDevicePostInstallEventProcessing     // Catch:{ NoSuchFieldError -> 0x0104 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                    r2 = 26
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                L_0x0104:
                    o7.s$b r1 = o7.C3902s.b.IapLogging     // Catch:{ NoSuchFieldError -> 0x010e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                    r2 = 27
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                L_0x010e:
                    o7.s$b r1 = o7.C3902s.b.IapLoggingLib2     // Catch:{ NoSuchFieldError -> 0x0118 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                    r2 = 28
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                L_0x0118:
                    o7.s$b r1 = o7.C3902s.b.IapLoggingLib5To7     // Catch:{ NoSuchFieldError -> 0x0122 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                    r2 = 29
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                L_0x0122:
                    o7.s$b r1 = o7.C3902s.b.AndroidManualImplicitPurchaseDedupe     // Catch:{ NoSuchFieldError -> 0x012c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                    r2 = 30
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                L_0x012c:
                    o7.s$b r1 = o7.C3902s.b.AndroidManualImplicitSubsDedupe     // Catch:{ NoSuchFieldError -> 0x0136 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                    r2 = 31
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
                L_0x0136:
                    o7.s$b r1 = o7.C3902s.b.AndroidIAPSubscriptionAutoLogging     // Catch:{ NoSuchFieldError -> 0x0140 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                    r2 = 32
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
                L_0x0140:
                    o7.s$b r1 = o7.C3902s.b.Monitoring     // Catch:{ NoSuchFieldError -> 0x014a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                    r2 = 33
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
                L_0x014a:
                    o7.s$b r1 = o7.C3902s.b.Megatron     // Catch:{ NoSuchFieldError -> 0x0154 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                    r2 = 34
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
                L_0x0154:
                    o7.s$b r1 = o7.C3902s.b.Elora     // Catch:{ NoSuchFieldError -> 0x015e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                    r2 = 35
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
                L_0x015e:
                    o7.s$b r1 = o7.C3902s.b.GPSARATriggers     // Catch:{ NoSuchFieldError -> 0x0168 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                    r2 = 36
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
                L_0x0168:
                    o7.s$b r1 = o7.C3902s.b.GPSPACAProcessing     // Catch:{ NoSuchFieldError -> 0x0172 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                    r2 = 37
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
                L_0x0172:
                    o7.s$b r1 = o7.C3902s.b.GPSTopicsObservation     // Catch:{ NoSuchFieldError -> 0x017c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                    r2 = 38
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
                L_0x017c:
                    o7.s$b r1 = o7.C3902s.b.ServiceUpdateCompliance     // Catch:{ NoSuchFieldError -> 0x0186 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                    r2 = 39
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
                L_0x0186:
                    o7.s$b r1 = o7.C3902s.b.Login     // Catch:{ NoSuchFieldError -> 0x0190 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                    r2 = 40
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
                L_0x0190:
                    o7.s$b r1 = o7.C3902s.b.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x019a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                    r2 = 41
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
                L_0x019a:
                    o7.s$b r1 = o7.C3902s.b.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    r2 = 42
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
                L_0x01a4:
                    o7.s$b r1 = o7.C3902s.b.BypassAppSwitch     // Catch:{ NoSuchFieldError -> 0x01ae }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                    r2 = 43
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
                L_0x01ae:
                    o7.s$b r1 = o7.C3902s.b.Share     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    r2 = 44
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
                L_0x01b8:
                    f47340a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o7.C3902s.b.C0710b.<clinit>():void");
            }
        }

        static {
            f47304b = new a((DefaultConstructorMarker) null);
        }

        private b(int i10) {
            this.f47339a = i10;
        }

        public final b c() {
            int i10 = this.f47339a;
            if ((i10 & 255) > 0) {
                return f47304b.a(i10 & -256);
            }
            if ((65280 & i10) > 0) {
                return f47304b.a(i10 & -65536);
            }
            if ((16711680 & i10) > 0) {
                return f47304b.a(i10 & -16777216);
            }
            return f47304b.a(0);
        }

        public final String e() {
            return "FBSDKFeature" + this;
        }

        public String toString() {
            switch (C0710b.f47340a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case StdKeyDeserializer.TYPE_URL:
                    return "SuggestedEvents";
                case StdKeyDeserializer.TYPE_CLASS:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case 28:
                    return "IAPLoggingLib2";
                case 29:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case 31:
                    return "AndroidManualImplicitSubsDedupe";
                case com.amazon.c.a.a.c.f37660h:
                    return "AndroidIAPSubscriptionAutoLogging";
                case CharsToNameCanonicalizer.HASH_MULT:
                    return "Monitoring";
                case 34:
                    return "Megatron";
                case 35:
                    return "Elora";
                case 36:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "GPSTopicsObservation";
                case 39:
                    return "ServiceUpdateCompliance";
                case 40:
                    return "LoginKit";
                case 41:
                    return "ChromeCustomTabsPrefetching";
                case 42:
                    return "IgnoreAppSwitchToLoggedOut";
                case 43:
                    return "BypassAppSwitch";
                case Carousel.ENTITY_TYPE /*44*/:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: o7.s$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:71|72)|73|75) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                o7.s$b[] r0 = o7.C3902s.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                o7.s$b r1 = o7.C3902s.b.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                o7.s$b r1 = o7.C3902s.b.Instrument     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                o7.s$b r1 = o7.C3902s.b.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                o7.s$b r1 = o7.C3902s.b.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                o7.s$b r1 = o7.C3902s.b.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                o7.s$b r1 = o7.C3902s.b.ErrorReport     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                o7.s$b r1 = o7.C3902s.b.AnrReport     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                o7.s$b r1 = o7.C3902s.b.AAM     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                o7.s$b r1 = o7.C3902s.b.CloudBridge     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                o7.s$b r1 = o7.C3902s.b.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                o7.s$b r1 = o7.C3902s.b.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                o7.s$b r1 = o7.C3902s.b.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                o7.s$b r1 = o7.C3902s.b.ModelRequest     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                o7.s$b r1 = o7.C3902s.b.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                o7.s$b r1 = o7.C3902s.b.OnDeviceEventProcessing     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                o7.s$b r1 = o7.C3902s.b.OnDevicePostInstallEventProcessing     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                o7.s$b r1 = o7.C3902s.b.IapLogging     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                o7.s$b r1 = o7.C3902s.b.IapLoggingLib2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                o7.s$b r1 = o7.C3902s.b.IapLoggingLib5To7     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                o7.s$b r1 = o7.C3902s.b.AndroidManualImplicitPurchaseDedupe     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                o7.s$b r1 = o7.C3902s.b.AndroidManualImplicitSubsDedupe     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                o7.s$b r1 = o7.C3902s.b.AndroidIAPSubscriptionAutoLogging     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                o7.s$b r1 = o7.C3902s.b.BannedParamFiltering     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                o7.s$b r1 = o7.C3902s.b.ProtectedMode     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                o7.s$b r1 = o7.C3902s.b.StdParamEnforcement     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                o7.s$b r1 = o7.C3902s.b.MACARuleMatching     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                o7.s$b r1 = o7.C3902s.b.BlocklistEvents     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                o7.s$b r1 = o7.C3902s.b.FilterRedactedEvents     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                o7.s$b r1 = o7.C3902s.b.FilterSensitiveParams     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                o7.s$b r1 = o7.C3902s.b.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                o7.s$b r1 = o7.C3902s.b.Monitoring     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                o7.s$b r1 = o7.C3902s.b.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                o7.s$b r1 = o7.C3902s.b.BypassAppSwitch     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                o7.s$b r1 = o7.C3902s.b.GPSARATriggers     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                o7.s$b r1 = o7.C3902s.b.GPSPACAProcessing     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                o7.s$b r1 = o7.C3902s.b.GPSTopicsObservation     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                f47341a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.C3902s.c.<clinit>():void");
        }
    }

    /* renamed from: o7.s$d */
    public static final class d implements C3905v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f47342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f47343b;

        d(a aVar, b bVar) {
            this.f47342a = aVar;
            this.f47343b = bVar;
        }

        public void a() {
            this.f47342a.a(C3902s.g(this.f47343b));
        }
    }

    private C3902s() {
    }

    public static final void a(b bVar, a aVar) {
        C6496s.h(bVar, "feature");
        C6496s.h(aVar, "callback");
        C3905v.h(new d(aVar, bVar));
    }

    private final boolean b(b bVar) {
        switch (c.f47341a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b bVar) {
        C6496s.h(bVar, "feature");
        I.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.e(), I.B()).apply();
    }

    public static final b d(String str) {
        C6496s.h(str, "className");
        f47290a.f();
        for (Map.Entry entry : f47291b.entrySet()) {
            b bVar = (b) entry.getKey();
            String[] strArr = (String[]) entry.getValue();
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (p.J(str, strArr[i10], false, 2, (Object) null)) {
                        return bVar;
                    }
                    i10++;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        return C3905v.d(bVar.e(), I.m(), b(bVar));
    }

    private final synchronized void f() {
        Map map = f47291b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(b.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(b.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            map.put(b.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
            map.put(b.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
            map.put(b.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
        }
    }

    public static final boolean g(b bVar) {
        C6496s.h(bVar, "feature");
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        String string = I.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.e(), (String) null);
        if (string != null && C6496s.c(string, I.B())) {
            return false;
        }
        b c10 = bVar.c();
        if (c10 == bVar) {
            return f47290a.e(bVar);
        }
        if (!g(c10) || !f47290a.e(bVar)) {
            return false;
        }
        return true;
    }
}
