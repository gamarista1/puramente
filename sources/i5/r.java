package i5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import i5.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o5.f;
import o5.l;

final class r {

    /* renamed from: d  reason: collision with root package name */
    private static volatile r f44225d;

    /* renamed from: a  reason: collision with root package name */
    private final c f44226a;

    /* renamed from: b  reason: collision with root package name */
    final Set f44227b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f44228c;

    class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f44229a;

        a(Context context) {
            this.f44229a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f44229a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        public void a(boolean z10) {
            ArrayList<b.a> arrayList;
            l.b();
            synchronized (r.this) {
                arrayList = new ArrayList<>(r.this.f44227b);
            }
            for (b.a a10 : arrayList) {
                a10.a(z10);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        boolean f44232a;

        /* renamed from: b  reason: collision with root package name */
        final b.a f44233b;

        /* renamed from: c  reason: collision with root package name */
        private final f.b f44234c;

        /* renamed from: d  reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f44235d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: i5.r$d$a$a  reason: collision with other inner class name */
            class C0680a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f44237a;

                C0680a(boolean z10) {
                    this.f44237a = z10;
                }

                public void run() {
                    a.this.a(this.f44237a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                l.v(new C0680a(z10));
            }

            /* access modifiers changed from: package-private */
            public void a(boolean z10) {
                l.b();
                d dVar = d.this;
                boolean z11 = dVar.f44232a;
                dVar.f44232a = z10;
                if (z11 != z10) {
                    dVar.f44233b.a(z10);
                }
            }

            public void onAvailable(Network network) {
                b(true);
            }

            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f44234c = bVar;
            this.f44233b = aVar;
        }

        public void a() {
            ((ConnectivityManager) this.f44234c.get()).unregisterNetworkCallback(this.f44235d);
        }

        public boolean b() {
            boolean z10;
            if (((ConnectivityManager) this.f44234c.get()).getActiveNetwork() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44232a = z10;
            try {
                ((ConnectivityManager) this.f44234c.get()).registerDefaultNetworkCallback(this.f44235d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f44226a = new d(f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f44225d == null) {
            synchronized (r.class) {
                try {
                    if (f44225d == null) {
                        f44225d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f44225d;
    }

    private void b() {
        if (!this.f44228c && !this.f44227b.isEmpty()) {
            this.f44228c = this.f44226a.b();
        }
    }

    private void c() {
        if (this.f44228c && this.f44227b.isEmpty()) {
            this.f44226a.a();
            this.f44228c = false;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(b.a aVar) {
        this.f44227b.add(aVar);
        b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(b.a aVar) {
        this.f44227b.remove(aVar);
        c();
    }
}
