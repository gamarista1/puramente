package Bh;

import Ch.c;
import Ch.d;
import Ch.h;
import Ch.i;
import Ch.k;
import Ch.l;
import Ch.m;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class a extends j {

    /* renamed from: e  reason: collision with root package name */
    public static final C0924a f62596e = new C0924a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f62597f;

    /* renamed from: d  reason: collision with root package name */
    private final List f62598d;

    /* renamed from: Bh.a$a  reason: collision with other inner class name */
    public static final class C0924a {
        public /* synthetic */ C0924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f62597f;
        }

        private C0924a() {
        }
    }

    static {
        boolean z10;
        if (!j.f62626a.h() || Build.VERSION.SDK_INT < 29) {
            z10 = false;
        } else {
            z10 = true;
        }
        f62597f = z10;
    }

    public a() {
        m[] mVarArr = {c.f62637a.a(), new l(h.f62645f.d()), new l(k.f62659a.a()), new l(i.f62653a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C6565s.s(mVarArr)) {
            if (((m) next).a()) {
                arrayList.add(next);
            }
        }
        this.f62598d = arrayList;
    }

    public Eh.c c(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        d a10 = d.f62638d.a(x509TrustManager);
        if (a10 != null) {
            return a10;
        }
        return super.c(x509TrustManager);
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        Iterator it = this.f62598d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).b(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        C6496s.h(sSLSocket, "sslSocket");
        Iterator it = this.f62598d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).b(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sSLSocket);
        }
        return null;
    }

    public boolean j(String str) {
        C6496s.h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
