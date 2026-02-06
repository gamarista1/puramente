package D9;

import E9.b;
import I9.h;
import k9.C3717q0;

public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30614a = new a();

    class a implements c {
        a() {
        }

        public boolean a(C3717q0 q0Var) {
            String str = q0Var.f45770l;
            if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                return true;
            }
            return false;
        }

        public b b(C3717q0 q0Var) {
            String str = q0Var.f45770l;
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
                        return new H9.a();
                    case 2:
                        return new h();
                    case 3:
                        return new F9.b();
                    case 4:
                        return new K9.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C3717q0 q0Var);

    b b(C3717q0 q0Var);
}
