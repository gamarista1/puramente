package r2;

import android.media.MediaCodecInfo;
import f2.s;
import i2.L;
import java.util.List;
import r2.C2559F;

abstract class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f25665a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List a10 = videoCapabilities.getSupportedPerformancePoints();
            if (a10 == null || a10.isEmpty()) {
                return 0;
            }
            o.a();
            int b10 = b(a10, n.a(i10, i11, (int) d10));
            if (b10 == 1 && s.f25665a == null) {
                Boolean unused = s.f25665a = Boolean.valueOf(c());
                if (s.f25665a.booleanValue()) {
                    return 0;
                }
            }
            return b10;
        }

        private static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (q.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean c() {
            List a10;
            if (L.f22072a >= 35) {
                return false;
            }
            try {
                f2.s K10 = new s.b().o0("video/avc").K();
                if (K10.f20083n != null) {
                    List v10 = C2559F.v(w.f25745a, K10, false, false);
                    int i10 = 0;
                    while (i10 < v10.size()) {
                        if (((m) v10.get(i10)).f25657d == null || ((m) v10.get(i10)).f25657d.getVideoCapabilities() == null || (a10 = ((m) v10.get(i10)).f25657d.getVideoCapabilities().getSupportedPerformancePoints()) == null || a10.isEmpty()) {
                            i10++;
                        } else {
                            o.a();
                            if (b(a10, n.a(1280, 720, 60)) == 1) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            } catch (C2559F.c unused) {
            }
            return true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (L.f22072a < 29) {
            return 0;
        }
        Boolean bool = f25665a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
