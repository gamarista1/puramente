package Eh;

import Bh.j;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62874a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            C6496s.h(x509TrustManager, "trustManager");
            return j.f62626a.g().c(x509TrustManager);
        }

        private a() {
        }
    }

    public abstract List a(List list, String str);
}
