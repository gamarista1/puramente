package s2;

import I2.a;
import J2.b;
import N2.h;
import P2.c;
import f2.s;

/* renamed from: s2.a  reason: case insensitive filesystem */
public interface C2590a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2590a f25887a = new C0434a();

    /* renamed from: s2.a$a  reason: collision with other inner class name */
    class C0434a implements C2590a {
        C0434a() {
        }

        public boolean a(s sVar) {
            String str = sVar.f20083n;
            if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                return true;
            }
            return false;
        }

        public a b(s sVar) {
            String str = sVar.f20083n;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new b();
                    case 1:
                        return new M2.a();
                    case 2:
                        return new h();
                    case 3:
                        return new K2.b();
                    case 4:
                        return new c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(s sVar);

    a b(s sVar);
}
