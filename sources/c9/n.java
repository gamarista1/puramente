package C9;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.w;
import k9.C3717q0;
import n9.C3873i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f30166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30167b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30168c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f30169d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f30170e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30171f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30172g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f30173h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f30174i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f30175j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f30176k;

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f30166a = (String) C3645a.e(str);
        this.f30167b = str2;
        this.f30168c = str3;
        this.f30169d = codecCapabilities;
        this.f30173h = z10;
        this.f30174i = z11;
        this.f30175j = z12;
        this.f30170e = z13;
        this.f30171f = z14;
        this.f30172g = z15;
        this.f30176k = w.s(str2);
    }

    private static boolean A(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = M.f44982b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean B(String str) {
        if (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(M.f44982b)) {
            return true;
        }
        return false;
    }

    public static n C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17;
        if (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (codecCapabilities == null || !s(codecCapabilities)) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z14 || (codecCapabilities != null && q(codecCapabilities))) {
            z17 = true;
        } else {
            z17 = false;
        }
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, z15, z16, z17);
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((M.f44981a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else if ("audio/eac3".equals(str2)) {
            i11 = 16;
        } else {
            i11 = 30;
        }
        s.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(M.l(i10, widthAlignment) * widthAlignment, M.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        int i11;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            i10 = 0;
        } else {
            i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (i10 >= 180000000) {
            i11 = 1024;
        } else if (i10 >= 120000000) {
            i11 = 512;
        } else if (i10 >= 60000000) {
            i11 = 256;
        } else if (i10 >= 30000000) {
            i11 = 128;
        } else if (i10 >= 18000000) {
            i11 = 64;
        } else if (i10 >= 12000000) {
            i11 = 32;
        } else if (i10 >= 7200000) {
            i11 = 16;
        } else if (i10 >= 3600000) {
            i11 = 8;
        } else if (i10 >= 1800000) {
            i11 = 4;
        } else if (i10 >= 800000) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (M.f44981a < 19 || !i(codecCapabilities)) {
            return false;
        }
        return true;
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(C3717q0 q0Var) {
        Pair q10;
        if (q0Var.f45767i == null || (q10 = v.q(q0Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(q0Var.f45770l)) {
            if ("video/avc".equals(this.f30167b)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.f30167b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f30176k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g10 = g();
        if (M.f44981a <= 23 && "video/x-vnd.on2.vp9".equals(this.f30167b) && g10.length == 0) {
            g10 = f(this.f30169d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !A(this.f30167b, intValue)) {
                return true;
            }
        }
        w("codec.profileLevel, " + q0Var.f45767i + ", " + this.f30168c);
        return false;
    }

    private boolean o(C3717q0 q0Var) {
        if (this.f30167b.equals(q0Var.f45770l) || this.f30167b.equals(v.m(q0Var))) {
            return true;
        }
        return false;
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (M.f44981a < 21 || !r(codecCapabilities)) {
            return false;
        }
        return true;
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (M.f44981a < 21 || !t(codecCapabilities)) {
            return false;
        }
        return true;
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        s.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f30166a + ", " + this.f30167b + "] [" + M.f44985e + "]");
    }

    private void w(String str) {
        s.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f30166a + ", " + this.f30167b + "] [" + M.f44985e + "]");
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        if (!M.f44984d.startsWith("SM-T230") || !"OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean z(String str) {
        if (M.f44981a <= 22) {
            String str2 = M.f44984d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f30169d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public C3873i e(C3717q0 q0Var, C3717q0 q0Var2) {
        int i10;
        int i11;
        if (!M.c(q0Var.f45770l, q0Var2.f45770l)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f30176k) {
            if (q0Var.f45778t != q0Var2.f45778t) {
                i10 |= 1024;
            }
            if (!this.f30170e && !(q0Var.f45775q == q0Var2.f45775q && q0Var.f45776r == q0Var2.f45776r)) {
                i10 |= 512;
            }
            if (!M.c(q0Var.f45782x, q0Var2.f45782x)) {
                i10 |= 2048;
            }
            if (y(this.f30166a) && !q0Var.g(q0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str = this.f30166a;
                if (q0Var.g(q0Var2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new C3873i(str, q0Var, q0Var2, i11, 0);
            }
        } else {
            if (q0Var.f45783y != q0Var2.f45783y) {
                i10 |= 4096;
            }
            if (q0Var.f45784z != q0Var2.f45784z) {
                i10 |= 8192;
            }
            if (q0Var.f45753A != q0Var2.f45753A) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f30167b)) {
                Pair q10 = v.q(q0Var);
                Pair q11 = v.q(q0Var2);
                if (!(q10 == null || q11 == null)) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C3873i(this.f30166a, q0Var, q0Var2, 3, 0);
                    }
                }
            }
            if (!q0Var.g(q0Var2)) {
                i10 |= 32;
            }
            if (x(this.f30167b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C3873i(this.f30166a, q0Var, q0Var2, 1, 0);
            }
        }
        return new C3873i(this.f30166a, q0Var, q0Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f30169d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f30169d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        } else if (a(this.f30166a, this.f30167b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            w("channelCount.support, " + i10);
            return false;
        }
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f30169d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            w("sampleRate.support, " + i10);
            return false;
        }
    }

    public boolean m(C3717q0 q0Var) {
        int i10;
        boolean z10 = false;
        if (!o(q0Var) || !l(q0Var)) {
            return false;
        }
        if (this.f30176k) {
            int i11 = q0Var.f45775q;
            if (i11 <= 0 || (i10 = q0Var.f45776r) <= 0) {
                return true;
            }
            if (M.f44981a >= 21) {
                return u(i11, i10, (double) q0Var.f45777s);
            }
            if (i11 * i10 <= v.N()) {
                z10 = true;
            }
            if (!z10) {
                w("legacyFrameSize, " + q0Var.f45775q + "x" + q0Var.f45776r);
            }
            return z10;
        }
        if (M.f44981a >= 21) {
            int i12 = q0Var.f45784z;
            if (i12 != -1 && !k(i12)) {
                return false;
            }
            int i13 = q0Var.f45783y;
            if (i13 != -1 && !j(i13)) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        if (M.f44981a >= 29 && "video/x-vnd.on2.vp9".equals(this.f30167b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(C3717q0 q0Var) {
        if (this.f30176k) {
            return this.f30170e;
        }
        Pair q10 = v.q(q0Var);
        if (q10 == null || ((Integer) q10.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f30166a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f30169d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        } else if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 >= i11 || !B(this.f30166a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
            return true;
        }
    }
}
