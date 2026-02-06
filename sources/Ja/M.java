package ja;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import k9.C3717q0;
import k9.L0;
import k9.T0;
import nb.C5108c;
import nb.C5110e;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public static final int f44981a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f44982b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f44983c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f44984d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f44985e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f44986f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f44987g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f44988h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f44989i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f44990j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k  reason: collision with root package name */
    private static HashMap f44991k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f44992l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f44993m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f44994n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f44995o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, ModuleDescriptor.MODULE_VERSION, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f44981a = i10;
        String str = Build.DEVICE;
        f44982b = str;
        String str2 = Build.MANUFACTURER;
        f44983c = str2;
        String str3 = Build.MODEL;
        f44984d = str3;
        f44985e = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    private static HashMap A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f44992l.length);
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
            String[] strArr = f44992l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int A0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static Uri B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f44990j.matcher(path);
        if (!matcher.matches() || matcher.group(1) != null) {
            return uri;
        }
        return Uri.withAppendedPath(uri, "Manifest");
    }

    private static String B0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f44993m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static String C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long C0(long j10) {
        if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
            return j10;
        }
        return j10 * 1000;
    }

    public static String D(byte[] bArr) {
        return new String(bArr, C5110e.f61085c);
    }

    public static ExecutorService D0(String str) {
        return Executors.newSingleThreadExecutor(new L(str));
    }

    public static String E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, C5110e.f61085c);
    }

    public static String E0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = C5108c.e(str);
        String str2 = S0(e10, "-")[0];
        if (f44991k == null) {
            f44991k = A();
        }
        String str3 = (String) f44991k.get(str2);
        if (str3 != null) {
            e10 = str3 + e10.substring(str2.length());
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            return B0(e10);
        }
        return e10;
    }

    public static int F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static Object[] F0(Object[] objArr, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        copyOf[objArr.length] = obj;
        return k(copyOf);
    }

    public static int G(int i10) {
        if (i10 != 12) {
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
                    int i11 = f44981a;
                    if (i11 < 23 && i11 < 21) {
                        return 0;
                    }
                    return 6396;
                default:
                    return 0;
            }
        } else if (f44981a >= 32) {
            return 743676;
        } else {
            return 0;
        }
    }

    public static Object[] G0(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static T0.b H(T0 t02, T0.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean g10 = t02.g();
        boolean A10 = t02.A();
        boolean w10 = t02.w();
        boolean o10 = t02.o();
        boolean E10 = t02.E();
        boolean q10 = t02.q();
        boolean u10 = t02.s().u();
        T0.b.a d10 = new T0.b.a().b(bVar).d(4, !g10);
        boolean z16 = false;
        if (!A10 || g10) {
            z10 = false;
        } else {
            z10 = true;
        }
        T0.b.a d11 = d10.d(5, z10);
        if (!w10 || g10) {
            z11 = false;
        } else {
            z11 = true;
        }
        T0.b.a d12 = d11.d(6, z11);
        if (u10 || ((!w10 && E10 && !A10) || g10)) {
            z12 = false;
        } else {
            z12 = true;
        }
        T0.b.a d13 = d12.d(7, z12);
        if (!o10 || g10) {
            z13 = false;
        } else {
            z13 = true;
        }
        T0.b.a d14 = d13.d(8, z13);
        if (u10 || ((!o10 && (!E10 || !q10)) || g10)) {
            z14 = false;
        } else {
            z14 = true;
        }
        T0.b.a d15 = d14.d(9, z14).d(10, !g10);
        if (!A10 || g10) {
            z15 = false;
        } else {
            z15 = true;
        }
        T0.b.a d16 = d15.d(11, z15);
        if (A10 && !g10) {
            z16 = true;
        }
        return d16.d(12, z16).e();
    }

    public static Object[] H0(Object[] objArr, int i10) {
        boolean z10;
        if (i10 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        return Arrays.copyOf(objArr, i10);
    }

    public static int I(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i11;
        }
        return Integer.reverseBytes(i11);
    }

    public static Object[] I0(Object[] objArr, int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (i11 <= objArr.length) {
            z11 = true;
        }
        C3645a.a(z11);
        return Arrays.copyOfRange(objArr, i10, i11);
    }

    public static byte[] J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static long J0(String str) {
        Matcher matcher = f44987g.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i10 != 0) {
                return timeInMillis - (((long) i10) * 60000);
            }
            return timeInMillis;
        }
        throw L0.a("Invalid date/time format: " + str, (Throwable) null);
    }

    public static int K(String str, int i10) {
        int i11 = 0;
        for (String m10 : T0(str)) {
            if (i10 == w.m(m10)) {
                i11++;
            }
        }
        return i11;
    }

    public static long K0(String str) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        Matcher matcher = f44988h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d15 = 0.0d;
        if (group != null) {
            d10 = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d10 = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d11 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d11 = 0.0d;
        }
        double d16 = d10 + d11;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d12 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d12 = 0.0d;
        }
        double d17 = d16 + d12;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d13 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d13 = 0.0d;
        }
        double d18 = d17 + d13;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d14 = Double.parseDouble(group5) * 60.0d;
        } else {
            d14 = 0.0d;
        }
        double d19 = d18 + d14;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d15 = Double.parseDouble(group6);
        }
        long j10 = (long) ((d19 + d15) * 1000.0d);
        if (!isEmpty) {
            return -j10;
        }
        return j10;
    }

    public static String L(String str, int i10) {
        String[] T02 = T0(str);
        if (T02.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T02) {
            if (i10 == w.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(f.f37529a);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static boolean L0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static boolean M0(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static String N(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE)) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C5108c.f(networkCountryIso);
            }
        }
        return C5108c.f(Locale.getDefault().getCountry());
    }

    public static void N0(List list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        } else if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static Point O(Context context) {
        Display display;
        DisplayManager displayManager;
        if (f44981a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            display = null;
        } else {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            display = ((WindowManager) C3645a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return P(context, display);
    }

    public static long O0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (((double) j10) * (((double) j11) / ((double) j12)));
    }

    public static Point P(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && y0(context)) {
            if (f44981a < 28) {
                str = k0("sys.display-size");
            } else {
                str = k0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] R02 = R0(str.trim(), "x");
                    if (R02.length == 2) {
                        int parseInt = Integer.parseInt(R02[0]);
                        int parseInt2 = Integer.parseInt(R02[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                s.c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(f44983c) && f44984d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f44981a;
        if (i10 >= 23) {
            U(display, point);
        } else if (i10 >= 17) {
            T(display, point);
        } else {
            S(display, point);
        }
        return point;
    }

    public static long[] P0(List list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < size) {
                jArr[i11] = ((Long) list.get(i11)).longValue() / j12;
                i11++;
            }
        } else if (i10 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i11 < size) {
                jArr[i11] = (long) (((double) ((Long) list.get(i11)).longValue()) * d10);
                i11++;
            }
        } else {
            long j13 = j10 / j11;
            while (i11 < size) {
                jArr[i11] = ((Long) list.get(i11)).longValue() * j13;
                i11++;
            }
        }
        return jArr;
    }

    public static Looper Q() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static void Q0(long[] jArr, long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j12;
                i11++;
            }
        } else if (i10 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i11 < jArr.length) {
                jArr[i11] = (long) (((double) jArr[i11]) * d10);
                i11++;
            }
        } else {
            long j13 = j10 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j13;
                i11++;
            }
        }
    }

    public static Locale R() {
        if (f44981a >= 24) {
            return Locale.getDefault(Locale.Category.DISPLAY);
        }
        return Locale.getDefault();
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void S(Display display, Point point) {
        display.getSize(point);
    }

    public static String[] S0(String str, String str2) {
        return str.split(str2, 2);
    }

    private static void T(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] T0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return R0(str.trim(), "(\\s*,\\s*)");
    }

    private static void U(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long U0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j13) & (j11 ^ j10)) < 0) {
            return j12;
        }
        return j13;
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
            case StdKeyDeserializer.TYPE_CLASS:
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

    public static byte[] V0(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int W(String str) {
        String[] R02;
        int length;
        boolean z10;
        if (str == null || (length = R02.length) < 2) {
            return 0;
        }
        String str2 = R02[length - 1];
        if (length < 3 || !"neg".equals((R02 = R0(str, "_"))[length - 2])) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            int parseInt = Integer.parseInt((String) C3645a.e(str2));
            if (z10) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long W0(int i10, int i11) {
        return X0(i11) | (X0(i10) << 32);
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

    public static long X0(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static String Y(Locale locale) {
        if (f44981a >= 21) {
            return Z(locale);
        }
        return locale.toString();
    }

    public static CharSequence Y0(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence;
        }
        return charSequence.subSequence(0, i10);
    }

    private static String Z(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long Z0(long j10) {
        if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
            return j10;
        }
        return j10 / 1000;
    }

    public static long a0(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(((double) j10) * ((double) f10));
    }

    public static void a1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long b0(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
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

    public static int c0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 == 24) {
            return 536870912;
        }
        if (i10 != 32) {
            return 0;
        }
        return 805306368;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(java.util.List r4, java.lang.Comparable r5, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Collections.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r4.size()
        L_0x000c:
            int r2 = r0 + 1
            if (r2 >= r1) goto L_0x001e
            java.lang.Object r3 = r4.get(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r3.compareTo(r5)
            if (r3 != 0) goto L_0x001e
            r0 = r2
            goto L_0x000c
        L_0x001e:
            if (r6 == 0) goto L_0x0022
            r5 = r0
            goto L_0x0023
        L_0x0022:
            r5 = r2
        L_0x0023:
            if (r7 == 0) goto L_0x002f
            int r4 = r4.size()
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x002f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.M.d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static C3717q0 d0(int i10, int i11, int i12) {
        return new C3717q0.b().e0("audio/raw").H(i11).f0(i12).Y(i10).E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(long[] r4, long r5, boolean r7, boolean r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: ja.M.e(long[], long, boolean, boolean):int");
    }

    public static int e0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static int f(t tVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = tVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (tVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < tVar.c() && tVar.b(i10) == j10) {
            return i10;
        }
        if (!z11 || c10 != -1) {
            return c10;
        }
        return 0;
    }

    public static long f0(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(((double) j10) / ((double) f10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(java.util.List r3, java.lang.Comparable r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x0021
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x001c
            java.lang.Object r2 = r3.get(r1)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001c
            r0 = r1
            goto L_0x000a
        L_0x001c:
            if (r5 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r6 == 0) goto L_0x0028
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.M.g(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int g0(int i10) {
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(int[] r3, int r4, boolean r5, boolean r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ja.M.h(int[], int, boolean, boolean):int");
    }

    public static String[] h0() {
        String[] i02 = i0();
        for (int i10 = 0; i10 < i02.length; i10++) {
            i02[i10] = E0(i02[i10]);
        }
        return i02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(long[] r4, long r5, boolean r7, boolean r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: ja.M.i(long[], long, boolean, boolean):int");
    }

    private static String[] i0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f44981a >= 24) {
            return j0(configuration);
        }
        return new String[]{Y(configuration.locale)};
    }

    private static String[] j0(Configuration configuration) {
        return R0(configuration.getLocales().toLanguageTags(), f.f37529a);
    }

    private static String k0(String str) {
        try {
            Class<?> cls = Class.forName(b.at);
            return (String) cls.getMethod(b.au, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            s.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static String l0(int i10) {
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

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static String m0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.18.1";
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] n0(String str) {
        return str.getBytes(C5110e.f61085c);
    }

    public static int o(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    public static int o0(Uri uri) {
        int q02;
        String scheme = uri.getScheme();
        if (scheme != null && C5108c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (q02 = q0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return q02;
        }
        Matcher matcher = f44990j.matcher((CharSequence) C3645a.e(uri.getPath()));
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

    public static float p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int p0(String str) {
        return o0(Uri.parse("file:///" + str));
    }

    public static int q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int q0(String str) {
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

    public static long r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static int r0(Uri uri, String str) {
        if (str == null) {
            return o0(uri);
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

    public static boolean s(Object[] objArr, Object obj) {
        for (Object c10 : objArr) {
            if (c(c10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(B b10, B b11, Inflater inflater) {
        if (b10.a() <= 0) {
            return false;
        }
        if (b11.b() < b10.a()) {
            b11.c(b10.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(b10.d(), b10.e(), b10.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(b11.d(), i10, b11.b() - i10);
                if (inflater.finished()) {
                    b11.O(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == b11.b()) {
                    b11.c(b11.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static int t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f44994n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean t0(Context context) {
        if (f44981a < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return false;
        }
        return true;
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f44995o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static boolean u0(int i10) {
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return true;
        }
        return false;
    }

    public static Handler v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean v0(int i10) {
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return true;
        }
        return false;
    }

    public static Handler w() {
        return x((Handler.Callback) null);
    }

    public static boolean w0(int i10) {
        if (i10 == 10 || i10 == 13) {
            return true;
        }
        return false;
    }

    public static Handler x(Handler.Callback callback) {
        return v((Looper) C3645a.h(Looper.myLooper()), callback);
    }

    public static boolean x0(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            return true;
        }
        return false;
    }

    public static Handler y() {
        return z((Handler.Callback) null);
    }

    public static boolean y0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    public static Handler z(Handler.Callback callback) {
        return v(Q(), callback);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread z0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Object j(Object obj) {
        return obj;
    }

    public static Object[] k(Object[] objArr) {
        return objArr;
    }
}
