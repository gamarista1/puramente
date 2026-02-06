package ja;

import android.support.v4.media.session.c;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f45059a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f45060b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f45061a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45062b;

        public a(int i10, int i11) {
            this.f45061a = i10;
            this.f45062b = i11;
        }

        public int a() {
            int i10 = this.f45062b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 == 22) {
                return 1073741824;
            }
            if (i10 != 23) {
                return 0;
            }
            return 15;
        }
    }

    public static boolean a(String str, String str2) {
        a i10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return false;
                }
                int a10 = i10.a();
                if (a10 == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        if (d(str, str2) != null) {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : M.T0(str)) {
            String g11 = g(g10);
            if (g11 != null && o(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] T02 = M.T0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : T02) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(f.f37529a);
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String e(String str) {
        ArrayList arrayList = f45059a;
        if (arrayList.size() <= 0) {
            return null;
        }
        c.a(arrayList.get(0));
        throw null;
    }

    public static int f(String str, String str2) {
        a i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return i10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        a i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e10 = C5108c.e(str.trim());
        if (e10.startsWith("avc1") || e10.startsWith("avc3")) {
            return "video/avc";
        }
        if (e10.startsWith("hev1") || e10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e10.startsWith("dvav") || e10.startsWith("dva1") || e10.startsWith("dvhe") || e10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e10.startsWith("av01")) {
            return "video/av01";
        }
        if (e10.startsWith("vp9") || e10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e10.startsWith("vp8") || e10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e10.startsWith("mp4a")) {
            if (e10.startsWith("mp4a.") && (i10 = i(e10)) != null) {
                str2 = h(i10.f45061a);
            }
            if (str2 == null) {
                return "audio/mp4a-latm";
            }
            return str2;
        } else if (e10.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (e10.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (e10.startsWith("ac-3") || e10.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (e10.startsWith("ec-3") || e10.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (e10.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (e10.startsWith("ac-4") || e10.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (e10.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (e10.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (e10.startsWith("dtsh") || e10.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (e10.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (e10.startsWith("opus")) {
                return "audio/opus";
            }
            if (e10.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (e10.startsWith("flac")) {
                return "audio/flac";
            }
            if (e10.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (e10.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (e10.contains("cea708")) {
                return "application/cea-708";
            }
            if (e10.contains("eia608") || e10.contains("cea608")) {
                return "application/cea-608";
            }
            return e(e10);
        }
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static a i(String str) {
        int i10;
        Matcher matcher = f45060b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C3645a.e(matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            } else {
                i10 = 0;
            }
            return new a(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if (p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    private static int l(String str) {
        ArrayList arrayList = f45059a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        c.a(arrayList.get(0));
        throw null;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : M.T0(str)) {
            String g11 = g(g10);
            if (g11 != null && s(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str) {
        return AppearanceType.IMAGE.equals(j(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    public static boolean r(String str) {
        if (AttributeType.TEXT.equals(j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean s(String str) {
        return "video".equals(j(str));
    }

    public static String t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
