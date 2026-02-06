package W2;

import W2.s;
import Y2.a;
import a3.b;
import b3.C1885a;
import c3.d;
import d3.C1927a;
import e3.C1945a;
import e3.C1951g;
import java.util.Objects;

public final class h implements s.a {
    public boolean a(f2.s sVar) {
        String str = sVar.f20083n;
        if (Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml")) {
            return true;
        }
        return false;
    }

    public s b(f2.s sVar) {
        String str = sVar.f20083n;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new a(sVar.f20086q);
                case 1:
                    return new Z2.a();
                case 2:
                    return new C1945a();
                case 3:
                    return new C1951g();
                case 4:
                    return new C1927a(sVar.f20086q);
                case 5:
                    return new b(sVar.f20086q);
                case 6:
                    return new C1885a();
                case 7:
                    return new d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    public int c(f2.s sVar) {
        String str = sVar.f20083n;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                case 6:
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
