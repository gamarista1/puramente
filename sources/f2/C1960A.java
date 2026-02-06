package f2;

import android.support.v4.media.session.c;
import android.text.TextUtils;
import com.reactnativecommunity.clipboard.ClipboardModule;
import i2.C2076a;
import i2.L;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

/* renamed from: f2.A  reason: case insensitive filesystem */
public abstract class C1960A {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f19691a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f19692b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: f2.A$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19693a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19694b;

        public a(int i10, int i11) {
            this.f19693a = i10;
            this.f19694b = i11;
        }

        public int a() {
            int i10 = this.f19694b;
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
        a g10;
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
                if (str2 == null || (g10 = g(str2)) == null) {
                    return false;
                }
                int a10 = g10.a();
                if (a10 == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String e10 : L.c1(str)) {
            String e11 = e(e10);
            if (e11 != null && l(e11)) {
                return e11;
            }
        }
        return null;
    }

    private static String c(String str) {
        ArrayList arrayList = f19691a;
        if (arrayList.size() <= 0) {
            return null;
        }
        c.a(arrayList.get(0));
        throw null;
    }

    public static int d(String str, String str2) {
        a g10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
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
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
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
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (g10 = g(str2)) == null) {
                    return 0;
                }
                return g10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        a g10;
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
            if (e10.startsWith("mp4a.") && (g10 = g(e10)) != null) {
                str2 = f(g10.f19693a);
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
            return c(e10);
        }
    }

    public static String f(int i10) {
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
        if (i10 == 221) {
            return "audio/vorbis";
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
            case 108:
                return ClipboardModule.MIMETYPE_JPEG;
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

    static a g(String str) {
        int i10;
        Matcher matcher = f19692b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C2076a.e(matcher.group(1));
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

    private static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return j(str);
    }

    private static int j(String str) {
        ArrayList arrayList = f19691a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        c.a(arrayList.get(0));
        throw null;
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        for (String e10 : L.c1(str)) {
            String e11 = e(e10);
            if (e11 != null && o(e11)) {
                return e11;
            }
        }
        return null;
    }

    public static boolean l(String str) {
        return "audio".equals(h(str));
    }

    public static boolean m(String str) {
        if (AppearanceType.IMAGE.equals(h(str)) || "application/x-image-uri".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean n(String str) {
        if (AttributeType.TEXT.equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String e10 = C5108c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1007807498:
                if (e10.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -979095690:
                if (e10.equals("application/x-mpegurl")) {
                    c10 = 1;
                    break;
                }
                break;
            case -586683234:
                if (e10.equals("audio/x-wav")) {
                    c10 = 2;
                    break;
                }
                break;
            case -432836268:
                if (e10.equals("audio/mpeg-l1")) {
                    c10 = 3;
                    break;
                }
                break;
            case -432836267:
                if (e10.equals("audio/mpeg-l2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187090231:
                if (e10.equals("audio/mp3")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return e10;
        }
    }
}
