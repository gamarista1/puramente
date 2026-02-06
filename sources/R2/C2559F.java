package r2;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.collect.C4770v;
import f2.C1960A;
import f2.C1974i;
import f2.s;
import i2.L;
import i2.p;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;

/* renamed from: r2.F  reason: case insensitive filesystem */
public abstract class C2559F {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f25582a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f25583b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static int f25584c = -1;

    /* renamed from: r2.F$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f25585a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25586b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f25587c;

        public b(String str, boolean z10, boolean z11) {
            this.f25585a = str;
            this.f25586b = z10;
            this.f25587c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.f25585a, bVar.f25585a) && this.f25586b == bVar.f25586b && this.f25587c == bVar.f25587c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = (this.f25585a.hashCode() + 31) * 31;
            int i11 = 1237;
            if (this.f25586b) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            int i12 = (hashCode + i10) * 31;
            if (this.f25587c) {
                i11 = 1231;
            }
            return i12 + i11;
        }
    }

    /* renamed from: r2.F$c */
    public static class c extends Exception {
        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* renamed from: r2.F$d */
    private interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* renamed from: r2.F$e */
    private static final class e implements d {
        private e() {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
                return false;
            }
            return true;
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public int d() {
            return MediaCodecList.getCodecCount();
        }

        public boolean e() {
            return false;
        }
    }

    /* renamed from: r2.F$f */
    private static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f25588a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f25589b;

        public f(boolean z10, boolean z11) {
            int i10;
            if (z10 || z11) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f25588a = i10;
        }

        private void f() {
            if (this.f25589b == null) {
                this.f25589b = new MediaCodecList(this.f25588a).getCodecInfos();
            }
        }

        public MediaCodecInfo a(int i10) {
            f();
            return this.f25589b[i10];
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public int d() {
            f();
            return this.f25589b.length;
        }

        public boolean e() {
            return true;
        }
    }

    /* renamed from: r2.F$g */
    private interface g {
        int a(Object obj);
    }

    private static Pair A(String str, String[] strArr) {
        if (strArr.length < 3) {
            p.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int T10 = T(parseInt);
            if (T10 == -1) {
                p.h("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int S10 = S(parseInt2);
            if (S10 != -1) {
                return new Pair(Integer.valueOf(T10), Integer.valueOf(S10));
            }
            p.h("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            p.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer B(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return 524288;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (L.f22072a < 29 || !D(mediaCodecInfo)) {
            return false;
        }
        return true;
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = L.f22072a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(L.f22074c))) {
            String str3 = L.f22073b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i10 == 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(L.f22074c)) {
            String str4 = L.f22073b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i10 == 19 && L.f22073b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        if (L.f22072a >= 29) {
            return G(mediaCodecInfo);
        }
        return !H(mediaCodecInfo, str);
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (L.f22072a >= 29) {
            return I(mediaCodecInfo);
        }
        if (C1960A.l(str)) {
            return true;
        }
        String e10 = C5108c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        if (e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) {
            return true;
        }
        if (e10.startsWith("omx.") || e10.startsWith("c2.")) {
            return false;
        }
        return true;
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (L.f22072a >= 29) {
            return K(mediaCodecInfo);
        }
        String e10 = C5108c.e(mediaCodecInfo.getName());
        if (e10.startsWith("omx.google.") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) {
            return false;
        }
        return true;
    }

    private static boolean K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int L(m mVar) {
        String str = mVar.f25654a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (L.f22072a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int M(m mVar) {
        return mVar.f25654a.startsWith("OMX.google") ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int N(s sVar, m mVar) {
        return mVar.l(sVar) ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int O(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int P() {
        int i10;
        if (f25584c == -1) {
            int i11 = 0;
            m s10 = s("video/avc", false, false);
            if (s10 != null) {
                MediaCodecInfo.CodecProfileLevel[] g10 = s10.g();
                int length = g10.length;
                int i12 = 0;
                while (i11 < length) {
                    i12 = Math.max(h(g10[i11].level), i12);
                    i11++;
                }
                if (L.f22072a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i11 = Math.max(i12, i10);
            }
            f25584c = i11;
        }
        return f25584c;
    }

    private static int Q(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static void R(List list, g gVar) {
        Collections.sort(list, new C2558E(gVar));
    }

    private static int S(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return -1;
        }
        return 8;
    }

    private static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (L.f22072a < 26 && L.f22073b.equals("R9") && list.size() == 1 && ((m) list.get(0)).f25654a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(m.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            R(list, new C2555B());
        }
        int i10 = L.f22072a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = ((m) list.get(0)).f25654a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                R(list, new C2556C());
            }
        }
        if (i10 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((m) list.get(0)).f25654a)) {
            list.add((m) list.remove(0));
        }
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return 16384;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case com.amazon.c.a.a.c.f37660h /*32*/:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case com.amazon.c.a.a.c.f37660h /*32*/:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 == 122) {
            return 32;
        }
        if (i10 != 244) {
            return -1;
        }
        return 64;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            default:
                return null;
        }
    }

    private static Pair l(String str, String[] strArr) {
        int Q10;
        if (strArr.length != 3) {
            p.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C1960A.f(Integer.parseInt(strArr[1], 16))) && (Q10 = Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(Q10), 0);
            }
        } catch (NumberFormatException unused) {
            p.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(s sVar) {
        Pair r10;
        if ("audio/eac3-joc".equals(sVar.f20083n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(sVar.f20083n) || (r10 = r(sVar)) == null) {
            return null;
        }
        int intValue = ((Integer) r10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static List n(w wVar, s sVar, boolean z10, boolean z11) {
        String m10 = m(sVar);
        if (m10 == null) {
            return C4770v.E();
        }
        return wVar.a(m10, z10, z11);
    }

    private static Pair o(String str, String[] strArr, C1974i iVar) {
        int i10;
        if (strArr.length < 4) {
            p.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i11 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                p.h("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    if (iVar == null || !(iVar.f19988d != null || (i10 = iVar.f19987c) == 7 || i10 == 6)) {
                        i11 = 2;
                    } else {
                        i11 = 4096;
                    }
                }
                int f10 = f(parseInt2);
                if (f10 != -1) {
                    return new Pair(Integer.valueOf(i11), Integer.valueOf(f10));
                }
                p.h("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                return null;
            } else {
                p.h("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
        } catch (NumberFormatException unused) {
            p.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair p(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            p.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = parseInt;
            } else {
                p.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                p.h("MediaCodecUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int g10 = g(i10);
            if (g10 != -1) {
                return new Pair(Integer.valueOf(i12), Integer.valueOf(g10));
            }
            p.h("MediaCodecUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            p.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair r(f2.s r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.f20079j
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r6.f20083n
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x001e
            java.lang.String r6 = r6.f20079j
            android.util.Pair r6 = y(r6, r1)
            return r6
        L_0x001e:
            r3 = r1[r0]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = r4
            goto L_0x0078
        L_0x002d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r0 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r0 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r0 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r0 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r0 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r0 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0093;
                case 2: goto L_0x0093;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r2
        L_0x007c:
            java.lang.String r6 = r6.f20079j
            android.util.Pair r6 = A(r6, r1)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f20079j
            android.util.Pair r6 = l(r6, r1)
            return r6
        L_0x008a:
            java.lang.String r0 = r6.f20079j
            f2.i r6 = r6.f20058A
            android.util.Pair r6 = z(r0, r1, r6)
            return r6
        L_0x0093:
            java.lang.String r6 = r6.f20079j
            android.util.Pair r6 = p(r6, r1)
            return r6
        L_0x009a:
            java.lang.String r0 = r6.f20079j
            f2.i r6 = r6.f20058A
            android.util.Pair r6 = o(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C2559F.r(f2.s):android.util.Pair");
    }

    public static m s(String str, boolean z10, boolean z11) {
        List t10 = t(str, z10, z11);
        if (t10.isEmpty()) {
            return null;
        }
        return (m) t10.get(0);
    }

    public static synchronized List t(String str, boolean z10, boolean z11) {
        d dVar;
        synchronized (C2559F.class) {
            try {
                b bVar = new b(str, z10, z11);
                HashMap hashMap = f25583b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i10 = L.f22072a;
                if (i10 >= 21) {
                    dVar = new f(z10, z11);
                } else {
                    dVar = new e();
                }
                ArrayList u10 = u(bVar, dVar);
                if (z10 && u10.isEmpty() && 21 <= i10 && i10 <= 23) {
                    u10 = u(bVar, new e());
                    if (!u10.isEmpty()) {
                        p.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) u10.get(0)).f25654a);
                    }
                }
                e(str, u10);
                C4770v z12 = C4770v.z(u10);
                hashMap.put(bVar, z12);
                return z12;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r1.f25586b == false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0105 A[SYNTHETIC, Splitter:B:60:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0130 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList u(r2.C2559F.b r24, r2.C2559F.d r25) {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012e }
            r5.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r15 = r1.f25585a     // Catch:{ Exception -> 0x012e }
            int r14 = r25.d()     // Catch:{ Exception -> 0x012e }
            boolean r13 = r25.e()     // Catch:{ Exception -> 0x012e }
            r0 = 0
            r12 = r0
        L_0x0019:
            if (r12 >= r14) goto L_0x0154
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x012e }
            boolean r6 = C(r0)     // Catch:{ Exception -> 0x012e }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0124
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x012e }
            boolean r6 = E(r0, r11, r13, r15)     // Catch:{ Exception -> 0x012e }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = q(r0, r11, r15)     // Catch:{ Exception -> 0x012e }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x007c }
            boolean r6 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r7 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r8 = r1.f25587c     // Catch:{ Exception -> 0x007c }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r8 = r1.f25586b     // Catch:{ Exception -> 0x007c }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = F(r0, r15)     // Catch:{ Exception -> 0x007c }
            boolean r17 = H(r0, r15)     // Catch:{ Exception -> 0x007c }
            boolean r0 = J(r0)     // Catch:{ Exception -> 0x007c }
            if (r13 == 0) goto L_0x0088
            boolean r7 = r1.f25586b     // Catch:{ Exception -> 0x007c }
            if (r7 == r6) goto L_0x008e
            goto L_0x0088
        L_0x007c:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00fd
        L_0x0088:
            if (r13 != 0) goto L_0x00b5
            boolean r7 = r1.f25586b     // Catch:{ Exception -> 0x00c0 }
            if (r7 != 0) goto L_0x00b5
        L_0x008e:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            r2.m r0 = r2.m.C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00b1 }
            r5.add(r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0124
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r1 = r21
            goto L_0x00fd
        L_0x00b5:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00cc
        L_0x00c0:
            r0 = move-exception
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00b2
        L_0x00cc:
            if (r23 != 0) goto L_0x0124
            if (r6 == 0) goto L_0x0124
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r6.<init>()     // Catch:{ Exception -> 0x00b1 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00fb }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            r2.m r0 = r2.m.C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00f9 }
            r5.add(r0)     // Catch:{ Exception -> 0x00f9 }
            return r5
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fd
        L_0x00fb:
            r0 = move-exception
            r1 = r14
        L_0x00fd:
            int r6 = i2.L.f22072a     // Catch:{ Exception -> 0x012e }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0130
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x012e }
            if (r6 != 0) goto L_0x0130
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r0.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x012e }
            r0.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012e }
            i2.p.c(r8, r0)     // Catch:{ Exception -> 0x012e }
        L_0x0124:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012e:
            r0 = move-exception
            goto L_0x0155
        L_0x0130:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r2.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x012e }
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x012e }
            i2.p.c(r8, r1)     // Catch:{ Exception -> 0x012e }
            throw r0     // Catch:{ Exception -> 0x012e }
        L_0x0154:
            return r5
        L_0x0155:
            r2.F$c r1 = new r2.F$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C2559F.u(r2.F$b, r2.F$d):java.util.ArrayList");
    }

    public static List v(w wVar, s sVar, boolean z10, boolean z11) {
        List a10 = wVar.a(sVar.f20083n, z10, z11);
        return C4770v.t().j(a10).j(n(wVar, sVar, z10, z11)).k();
    }

    public static List w(List list, s sVar) {
        ArrayList arrayList = new ArrayList(list);
        R(arrayList, new C2557D(sVar));
        return arrayList;
    }

    public static m x() {
        return s("audio/raw", false, false);
    }

    private static Pair y(String str, String[] strArr) {
        if (strArr.length < 3) {
            p.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f25582a.matcher(strArr[1]);
        if (!matcher.matches()) {
            p.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k10 = k(group);
        if (k10 == null) {
            p.h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j10 = j(str2);
        if (j10 != null) {
            return new Pair(k10, j10);
        }
        p.h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair z(String str, String[] strArr, C1974i iVar) {
        if (strArr.length < 4) {
            p.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f25582a.matcher(strArr[1]);
        if (!matcher.matches()) {
            p.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                p.h("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            } else if (iVar == null || iVar.f19987c != 6) {
                i10 = 2;
            } else {
                i10 = 4096;
            }
        }
        String str2 = strArr[3];
        Integer B10 = B(str2);
        if (B10 != null) {
            return new Pair(Integer.valueOf(i10), B10);
        }
        p.h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
