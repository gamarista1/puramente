package B2;

import com.google.common.collect.C4770v;
import f2.s;
import i2.C2073A;
import i2.L;
import i2.p;

final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final s f822a;

    public g(s sVar) {
        this.f822a = sVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(C2073A a10) {
        a10.V(4);
        int u10 = a10.u();
        int u11 = a10.u();
        a10.V(4);
        int u12 = a10.u();
        String a11 = a(u12);
        if (a11 == null) {
            p.h("StreamFormatChunk", "Ignoring track with unsupported compression " + u12);
            return null;
        }
        s.b bVar = new s.b();
        bVar.t0(u10).Y(u11).o0(a11);
        return new g(bVar.K());
    }

    public static a d(int i10, C2073A a10) {
        if (i10 == 2) {
            return c(a10);
        }
        if (i10 == 1) {
            return e(a10);
        }
        p.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + L.p0(i10));
        return null;
    }

    private static a e(C2073A a10) {
        int i10;
        int z10 = a10.z();
        String b10 = b(z10);
        if (b10 == null) {
            p.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + z10);
            return null;
        }
        int z11 = a10.z();
        int u10 = a10.u();
        a10.V(6);
        int d02 = L.d0(a10.z());
        if (a10.a() > 0) {
            i10 = a10.z();
        } else {
            i10 = 0;
        }
        byte[] bArr = new byte[i10];
        a10.l(bArr, 0, i10);
        s.b bVar = new s.b();
        bVar.o0(b10).N(z11).p0(u10);
        if ("audio/raw".equals(b10) && d02 != 0) {
            bVar.i0(d02);
        }
        if ("audio/mp4a-latm".equals(b10) && i10 > 0) {
            bVar.b0(C4770v.H(bArr));
        }
        return new g(bVar.K());
    }

    public int getType() {
        return 1718776947;
    }
}
