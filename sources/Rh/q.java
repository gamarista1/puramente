package rh;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73454a = a.f73456a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f73455b = new a.C1065a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f73456a = new a();

        /* renamed from: rh.q$a$a  reason: collision with other inner class name */
        private static final class C1065a implements q {
            public List a(String str) {
                C6496s.h(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C6496s.g(allByName, "getAllByName(hostname)");
                    return C6559l.n1(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
