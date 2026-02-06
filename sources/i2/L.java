package i2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.api.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.primitives.i;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import f2.C1964E;
import f2.s;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import nb.C5108c;
import nb.C5110e;
import pb.b;
import pb.e;

public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22072a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f22073b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f22074c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f22075d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f22076e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f22077f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f22078g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f22079h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f22080i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f22081j = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f22082k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: l  reason: collision with root package name */
    private static HashMap f22083l;

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f22084m = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f22085n = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f22086o = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f22087p = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f22088q = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, ModuleDescriptor.MODULE_VERSION, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    private static final class a {
        public static Drawable a(Context context, Resources resources, int i10) {
            return resources.getDrawable(i10, context.getTheme());
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f22072a = i10;
        String str = Build.DEVICE;
        f22073b = str;
        String str2 = Build.MANUFACTURER;
        f22074c = str2;
        String str3 = Build.MODEL;
        f22075d = str3;
        f22076e = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    public static Handler A(Handler.Callback callback) {
        return y((Looper) C2076a.i(Looper.myLooper()), callback);
    }

    public static boolean A0(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1487464693:
                if (str.equals(ClipboardModule.MIMETYPE_HEIC)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1487464690:
                if (str.equals(ClipboardModule.MIMETYPE_HEIF)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals(ClipboardModule.MIMETYPE_JPEG)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1487018032:
                if (str.equals(ClipboardModule.MIMETYPE_WEBP)) {
                    c10 = 4;
                    break;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c10 = 5;
                    break;
                }
                break;
            case -879258763:
                if (str.equals(ClipboardModule.MIMETYPE_PNG)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (f22072a >= 34) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                if (f22072a >= 26) {
                    return true;
                }
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static Handler B() {
        return C((Handler.Callback) null);
    }

    public static boolean B0(int i10) {
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return true;
        }
        return false;
    }

    public static Handler C(Handler.Callback callback) {
        return y(R(), callback);
    }

    public static boolean C0(int i10) {
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return true;
        }
        return false;
    }

    private static HashMap D() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f22084m.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f22084m;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean D0(Context context) {
        int i10 = f22072a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = f22075d;
                if (C5108c.a(str, "moto g(20)") || C5108c.a(str, "rmx3231")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static long E(long j10, int i10) {
        return W0(j10, (long) i10, 1000000, RoundingMode.CEILING);
    }

    public static boolean E0(int i10) {
        if (i10 == 10 || i10 == 13) {
            return true;
        }
        return false;
    }

    public static String F(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean F0(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            return true;
        }
        return false;
    }

    public static String G(byte[] bArr) {
        return new String(bArr, C5110e.f61085c);
    }

    public static boolean G0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    public static String H(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, C5110e.f61085c);
    }

    public static boolean H0(Context context) {
        if (f22072a < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return false;
        }
        return true;
    }

    public static int I(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread I0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int J(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        return 25;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return a.e.API_PRIORITY_OTHER;
                }
        }
    }

    public static int J0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static AudioFormat K(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private static String K0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f22085n;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static int L(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                break;
            case 10:
                if (f22072a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
            default:
                return 0;
        }
        return 6396;
    }

    public static long L0(long j10) {
        if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
            return j10;
        }
        return j10 * 1000;
    }

    public static C1964E.b M(C1964E e10, C1964E.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean g10 = e10.g();
        boolean A10 = e10.A();
        boolean w10 = e10.w();
        boolean o10 = e10.o();
        boolean E10 = e10.E();
        boolean q10 = e10.q();
        boolean q11 = e10.s().q();
        C1964E.b.a d10 = new C1964E.b.a().b(bVar).d(4, !g10);
        boolean z16 = false;
        if (!A10 || g10) {
            z10 = false;
        } else {
            z10 = true;
        }
        C1964E.b.a d11 = d10.d(5, z10);
        if (!w10 || g10) {
            z11 = false;
        } else {
            z11 = true;
        }
        C1964E.b.a d12 = d11.d(6, z11);
        if (q11 || ((!w10 && E10 && !A10) || g10)) {
            z12 = false;
        } else {
            z12 = true;
        }
        C1964E.b.a d13 = d12.d(7, z12);
        if (!o10 || g10) {
            z13 = false;
        } else {
            z13 = true;
        }
        C1964E.b.a d14 = d13.d(8, z13);
        if (q11 || ((!o10 && (!E10 || !q10)) || g10)) {
            z14 = false;
        } else {
            z14 = true;
        }
        C1964E.b.a d15 = d14.d(9, z14).d(10, !g10);
        if (!A10 || g10) {
            z15 = false;
        } else {
            z15 = true;
        }
        C1964E.b.a d16 = d15.d(11, z15);
        if (A10 && !g10) {
            z16 = true;
        }
        return d16.d(12, z16).e();
    }

    public static ExecutorService M0(String str) {
        return Executors.newSingleThreadExecutor(new K(str));
    }

    public static int N(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i11;
        }
        return Integer.reverseBytes(i11);
    }

    public static String N0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = C5108c.e(str);
        String str2 = b1(e10, "-")[0];
        if (f22083l == null) {
            f22083l = D();
        }
        String str3 = (String) f22083l.get(str2);
        if (str3 != null) {
            e10 = str3 + e10.substring(str2.length());
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            return K0(e10);
        }
        return e10;
    }

    public static String O(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE)) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C5108c.f(networkCountryIso);
            }
        }
        return C5108c.f(Locale.getDefault().getCountry());
    }

    public static Object[] O0(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static Point P(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            display = ((WindowManager) C2076a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return Q(context, display);
    }

    public static Object[] P0(Object[] objArr, int i10) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static Point Q(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && G0(context)) {
            if (f22072a < 28) {
                str = o0("sys.display-size");
            } else {
                str = o0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] a12 = a1(str.trim(), "x");
                    if (a12.length == 2) {
                        int parseInt = Integer.parseInt(a12[0]);
                        int parseInt2 = Integer.parseInt(a12[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                p.c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(f22074c) && f22075d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f22072a >= 23) {
            T(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static Object[] Q0(Object[] objArr, int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        if (i11 <= objArr.length) {
            z11 = true;
        }
        C2076a.a(z11);
        return Arrays.copyOfRange(objArr, i10, i11);
    }

    public static Looper R() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static boolean R0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Locale S() {
        if (f22072a >= 24) {
            return Locale.getDefault(Locale.Category.DISPLAY);
        }
        return Locale.getDefault();
    }

    public static boolean S0(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    private static void T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long T0(long j10, int i10) {
        return W0(j10, 1000000, (long) i10, RoundingMode.FLOOR);
    }

    public static Drawable U(Context context, Resources resources, int i10) {
        if (f22072a >= 21) {
            return a.a(context, resources, i10);
        }
        return resources.getDrawable(i10);
    }

    public static long U0(long j10, long j11, long j12) {
        return W0(j10, j11, j12, RoundingMode.FLOOR);
    }

    public static int V(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static void V0(long[] jArr, long j10, long j11) {
        Y0(jArr, j10, j11, RoundingMode.FLOOR);
    }

    public static int W(String str) {
        String[] a12;
        int length;
        boolean z10;
        if (str == null || (length = a12.length) < 2) {
            return 0;
        }
        String str2 = a12[length - 1];
        if (length < 3 || !"neg".equals((a12 = a1(str, "_"))[length - 2])) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            int parseInt = Integer.parseInt((String) C2076a.e(str2));
            if (z10) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long W0(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return e.b(j10, e.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return e.d(j10, e.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        if (i11 >= 0 && j12 % j10 == 0) {
            return e.b(j11, e.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 >= 0 || j10 % j12 != 0) {
            return X0(j10, j11, j12, roundingMode);
        }
        return e.d(j11, e.b(j10, j12, RoundingMode.UNNECESSARY));
    }

    public static String X(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static long X0(long j10, long j11, long j12, RoundingMode roundingMode) {
        long d10 = e.d(j10, j11);
        if (d10 != Long.MAX_VALUE && d10 != Long.MIN_VALUE) {
            return e.b(d10, j12, roundingMode);
        }
        long c10 = e.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = e.b(j11, c10, roundingMode2);
        long b11 = e.b(j12, c10, roundingMode2);
        long c11 = e.c(Math.abs(j10), Math.abs(b11));
        long b12 = e.b(j10, c11, roundingMode2);
        long b13 = e.b(b11, c11, roundingMode2);
        long d11 = e.d(b12, b10);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return e.b(d11, b13, roundingMode);
        }
        double d12 = ((double) b12) * (((double) b10) / ((double) b13));
        if (d12 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d12 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return b.c(d12, roundingMode);
    }

    public static String Y(Locale locale) {
        if (f22072a >= 21) {
            return Z(locale);
        }
        return locale.toString();
    }

    public static void Y0(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        long[] jArr2 = jArr;
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        if (j12 == 0) {
            Arrays.fill(jArr2, 0);
            return;
        }
        int i10 = (j13 > j12 ? 1 : (j13 == j12 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j13 % j12 == 0) {
            long b10 = e.b(j13, j12, RoundingMode.UNNECESSARY);
            while (i11 < jArr2.length) {
                jArr2[i11] = e.b(jArr2[i11], b10, roundingMode2);
                i11++;
            }
        } else if (i10 >= 0 || j12 % j13 != 0) {
            for (int i12 = 0; i12 < jArr2.length; i12++) {
                long j14 = jArr2[i12];
                if (j14 != 0) {
                    if (j13 >= j14 && j13 % j14 == 0) {
                        jArr2[i12] = e.b(j12, e.b(j13, j14, RoundingMode.UNNECESSARY), roundingMode2);
                    } else if (j13 >= j14 || j14 % j13 != 0) {
                        jArr2[i12] = X0(j14, j10, j11, roundingMode);
                    } else {
                        jArr2[i12] = e.d(j12, e.b(j14, j13, RoundingMode.UNNECESSARY));
                    }
                }
            }
        } else {
            long b11 = e.b(j12, j13, RoundingMode.UNNECESSARY);
            while (i11 < jArr2.length) {
                jArr2[i11] = e.d(jArr2[i11], b11);
                i11++;
            }
        }
    }

    private static String Z(Locale locale) {
        return locale.toLanguageTag();
    }

    public static boolean Z0(C1964E e10, boolean z10) {
        if (e10 == null || !e10.u() || e10.k() == 1 || e10.k() == 4) {
            return true;
        }
        if (!z10 || e10.r() == 0) {
            return false;
        }
        return true;
    }

    public static int a0(Context context) {
        if (D0(context)) {
            return 1;
        }
        return 5;
    }

    public static String[] a1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long b0(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(((double) j10) * ((double) f10));
    }

    public static String[] b1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static long c0(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static String[] c1(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return a1(str.trim(), "(\\s*,\\s*)");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r1 = r0 + 1
            int r2 = r4.length
            if (r1 >= r2) goto L_0x0015
            r2 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0008
        L_0x0015:
            if (r7 == 0) goto L_0x0019
            r5 = r0
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.L.d(long[], long, boolean, boolean):int");
    }

    public static int d0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 == 24) {
            return 21;
        }
        if (i10 != 32) {
            return 0;
        }
        return 22;
    }

    public static long d1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j13) & (j11 ^ j10)) < 0) {
            return j12;
        }
        return j13;
    }

    public static int e(q qVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = qVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (qVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < qVar.c() && qVar.b(i10) == j10) {
            return i10;
        }
        if (!z11 || c10 != -1) {
            return c10;
        }
        return 0;
    }

    public static s e0(int i10, int i11, int i12) {
        return new s.b().o0("audio/raw").N(i11).p0(i12).i0(i10).K();
    }

    public static String e1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(int[] r3, int r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x0019
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0014
            r2 = r3[r1]
            if (r2 != r4) goto L_0x0014
            r0 = r1
            goto L_0x000a
        L_0x0014:
            if (r5 == 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            if (r6 == 0) goto L_0x0020
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.L.f(int[], int, boolean, boolean):int");
    }

    public static int f0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long f1(int i10, int i11) {
        return g1(i11) | (g1(i10) << 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0016
            r2 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0016
            r0 = r1
            goto L_0x000a
        L_0x0016:
            if (r7 == 0) goto L_0x001a
            r4 = r0
            goto L_0x001b
        L_0x001a:
            r4 = r1
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.L.g(long[], long, boolean, boolean):int");
    }

    public static long g0(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(((double) j10) / ((double) f10));
    }

    public static long g1(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static List h0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static long h1(long j10) {
        if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
            return j10;
        }
        return j10 / 1000;
    }

    public static List i0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static void i1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static int j(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int j0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static long k(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static String k0(StringBuilder sb2, Formatter formatter, long j10) {
        String str;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        if (j13 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j12), Long.valueOf(j11)}).toString();
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String[] l0() {
        String[] m02 = m0();
        for (int i10 = 0; i10 < m02.length; i10++) {
            m02[i10] = N0(m02[i10]);
        }
        return m02;
    }

    public static int m(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    private static String[] m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f22072a >= 24) {
            return n0(configuration);
        }
        return new String[]{Y(configuration.locale)};
    }

    public static float n(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    private static String[] n0(Configuration configuration) {
        return a1(configuration.getLocales().toLanguageTags(), f.f37529a);
    }

    public static int o(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    private static String o0(String str) {
        try {
            Class<?> cls = Class.forName(com.amazon.a.a.o.b.at);
            return (String) cls.getMethod(com.amazon.a.a.o.b.au, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            p.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static long p(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static String p0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return AttributeType.TEXT;
            case 4:
                return AppearanceType.IMAGE;
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static boolean q(SparseArray sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static byte[] q0(String str) {
        return str.getBytes(C5110e.f61085c);
    }

    public static boolean r(Object[] objArr, Object obj) {
        for (Object c10 : objArr) {
            if (c(c10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r0(C1964E e10) {
        if (e10 == null || !e10.L(1)) {
            return false;
        }
        e10.pause();
        return true;
    }

    public static boolean s(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                return true;
            }
            return false;
        } else if (sparseArray2 == null) {
            return false;
        } else {
            if (f22072a >= 31) {
                return sparseArray.contentEquals(sparseArray2);
            }
            int size = sparseArray.size();
            if (size != sparseArray2.size()) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean s0(f2.C1964E r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.k()
            r2 = 1
            if (r1 != r2) goto L_0x0017
            r3 = 2
            boolean r3 = r4.L(r3)
            if (r3 == 0) goto L_0x0017
            r4.j()
        L_0x0015:
            r0 = r2
            goto L_0x0024
        L_0x0017:
            r3 = 4
            if (r1 != r3) goto L_0x0024
            boolean r1 = r4.L(r3)
            if (r1 == 0) goto L_0x0024
            r4.G()
            goto L_0x0015
        L_0x0024:
            boolean r1 = r4.L(r2)
            if (r1 == 0) goto L_0x002e
            r4.l()
            goto L_0x002f
        L_0x002e:
            r2 = r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.L.s0(f2.E):boolean");
    }

    public static int t(SparseArray sparseArray) {
        if (f22072a >= 31) {
            return sparseArray.contentHashCode();
        }
        int i10 = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            i10 = (((i10 * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
        }
        return i10;
    }

    public static boolean t0(C1964E e10, boolean z10) {
        if (Z0(e10, z10)) {
            return s0(e10);
        }
        return r0(e10);
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int b10 = i.b(bArr[i10]);
            i12 = v(b10 & 15, v(b10 >> 4, i12));
            i10++;
        }
        return i12;
    }

    public static int u0(Uri uri) {
        int v02;
        String scheme = uri.getScheme();
        if (scheme != null && C5108c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (v02 = v0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return v02;
        }
        Matcher matcher = f22082k.matcher((CharSequence) C2076a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    private static int v(int i10, int i11) {
        return (f22087p[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    public static int v0(String str) {
        String e10 = C5108c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case 104579:
                if (e10.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (e10.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (e10.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (e10.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f22086o[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int w0(Uri uri, String str) {
        if (str == null) {
            return u0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f22088q[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static boolean x0(C2073A a10, C2073A a11, Inflater inflater) {
        if (a10.a() <= 0) {
            return false;
        }
        if (a11.b() < a10.a()) {
            a11.c(a10.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a10.e(), a10.f(), a10.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(a11.e(), i10, a11.b() - i10);
                if (inflater.finished()) {
                    a11.T(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == a11.b()) {
                    a11.c(a11.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static Handler y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String y0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static Handler z() {
        return A((Handler.Callback) null);
    }

    public static boolean z0(Context context) {
        if (f22072a < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return false;
        }
        return true;
    }

    public static Object h(Object obj) {
        return obj;
    }

    public static Object[] i(Object[] objArr) {
        return objArr;
    }
}
