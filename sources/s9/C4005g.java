package s9;

import com.google.common.collect.C4770v;
import ja.B;
import ja.M;
import ja.s;
import k9.C3717q0;

/* renamed from: s9.g  reason: case insensitive filesystem */
final class C4005g implements C3999a {

    /* renamed from: a  reason: collision with root package name */
    public final C3717q0 f48155a;

    public C4005g(C3717q0 q0Var) {
        this.f48155a = q0Var;
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

    private static C3999a c(B b10) {
        b10.Q(4);
        int q10 = b10.q();
        int q11 = b10.q();
        b10.Q(4);
        int q12 = b10.q();
        String a10 = a(q12);
        if (a10 == null) {
            s.i("StreamFormatChunk", "Ignoring track with unsupported compression " + q12);
            return null;
        }
        C3717q0.b bVar = new C3717q0.b();
        bVar.j0(q10).Q(q11).e0(a10);
        return new C4005g(bVar.E());
    }

    public static C3999a d(int i10, B b10) {
        if (i10 == 2) {
            return c(b10);
        }
        if (i10 == 1) {
            return e(b10);
        }
        s.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + M.l0(i10));
        return null;
    }

    private static C3999a e(B b10) {
        int v10 = b10.v();
        String b11 = b(v10);
        if (b11 == null) {
            s.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + v10);
            return null;
        }
        int v11 = b10.v();
        int q10 = b10.q();
        b10.Q(6);
        int c02 = M.c0(b10.J());
        int v12 = b10.v();
        byte[] bArr = new byte[v12];
        b10.j(bArr, 0, v12);
        C3717q0.b bVar = new C3717q0.b();
        bVar.e0(b11).H(v11).f0(q10);
        if ("audio/raw".equals(b11) && c02 != 0) {
            bVar.Y(c02);
        }
        if ("audio/mp4a-latm".equals(b11) && v12 > 0) {
            bVar.T(C4770v.H(bArr));
        }
        return new C4005g(bVar.E());
    }

    public int getType() {
        return 1718776947;
    }
}
