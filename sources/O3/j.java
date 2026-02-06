package O3;

import M3.c;
import Q3.m;
import Q3.o;
import R3.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public final class j extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f4746f;

    /* renamed from: g  reason: collision with root package name */
    private final a f4747g = new a(this);

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f4748a;

        a(j jVar) {
            this.f4748a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C6496s.h(network, "network");
            C6496s.h(networkCapabilities, "capabilities");
            s e10 = s.e();
            String b10 = k.f4749a;
            e10.a(b10, "Network capabilities changed: " + networkCapabilities);
            j jVar = this.f4748a;
            jVar.g(k.c(jVar.f4746f));
        }

        public void onLost(Network network) {
            C6496s.h(network, "network");
            s.e().a(k.f4749a, "Network connection lost");
            j jVar = this.f4748a;
            jVar.g(k.c(jVar.f4746f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, b bVar) {
        super(context, bVar);
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        C6496s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f4746f = (ConnectivityManager) systemService;
    }

    public void h() {
        try {
            s.e().a(k.f4749a, "Registering network callback");
            o.a(this.f4746f, this.f4747g);
        } catch (IllegalArgumentException e10) {
            s.e().d(k.f4749a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            s.e().d(k.f4749a, "Received exception while registering network callback", e11);
        }
    }

    public void i() {
        try {
            s.e().a(k.f4749a, "Unregistering network callback");
            m.c(this.f4746f, this.f4747g);
        } catch (IllegalArgumentException e10) {
            s.e().d(k.f4749a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            s.e().d(k.f4749a, "Received exception while unregistering network callback", e11);
        }
    }

    /* renamed from: k */
    public c e() {
        return k.c(this.f4746f);
    }
}
