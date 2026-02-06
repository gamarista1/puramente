package nd;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;

public class h extends d {

    /* renamed from: j  reason: collision with root package name */
    private final a f61134j = new a();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Network f61135k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public NetworkCapabilities f61136l = null;

    private class a extends ConnectivityManager.NetworkCallback {
        public void onAvailable(Network network) {
            h.this.f61135k = network;
            h.this.q(250);
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.this.f61135k = network;
            h.this.f61136l = networkCapabilities;
            h.this.s();
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (h.this.f61135k != null) {
                h.this.f61135k = network;
            }
            h.this.q(250);
        }

        public void onLosing(Network network, int i10) {
            h.this.f61135k = network;
            h.this.s();
        }

        public void onLost(Network network) {
            h.this.f61135k = null;
            h.this.f61136l = null;
            h.this.s();
        }

        public void onUnavailable() {
            h.this.f61135k = null;
            h.this.f61136l = null;
            h.this.s();
        }

        private a() {
        }
    }

    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public void q(int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(new g(this), (long) i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        try {
            this.f61136l = c().getNetworkCapabilities(this.f61135k);
            s();
        } catch (SecurityException unused) {
        }
    }

    public void g() {
        try {
            this.f61135k = c().getActiveNetwork();
            q(0);
            c().registerDefaultNetworkCallback(this.f61134j);
        } catch (SecurityException unused) {
        }
    }

    public void j() {
        try {
            c().unregisterNetworkCallback(this.f61134j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s() {
        /*
            r10 = this;
            od.b r0 = od.C5123b.UNKNOWN
            android.net.Network r1 = r10.f61135k
            android.net.NetworkCapabilities r2 = r10.f61136l
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x009a
            r5 = 2
            boolean r5 = r2.hasTransport(r5)
            r6 = 4
            r7 = 1
            if (r5 == 0) goto L_0x0016
            od.b r0 = od.C5123b.BLUETOOTH
            goto L_0x003a
        L_0x0016:
            boolean r5 = r2.hasTransport(r4)
            if (r5 == 0) goto L_0x001f
            od.b r0 = od.C5123b.CELLULAR
            goto L_0x003a
        L_0x001f:
            r5 = 3
            boolean r5 = r2.hasTransport(r5)
            if (r5 == 0) goto L_0x0029
            od.b r0 = od.C5123b.ETHERNET
            goto L_0x003a
        L_0x0029:
            boolean r5 = r2.hasTransport(r7)
            if (r5 == 0) goto L_0x0032
            od.b r0 = od.C5123b.WIFI
            goto L_0x003a
        L_0x0032:
            boolean r5 = r2.hasTransport(r6)
            if (r5 == 0) goto L_0x003a
            od.b r0 = od.C5123b.VPN
        L_0x003a:
            if (r1 == 0) goto L_0x0045
            android.net.ConnectivityManager r5 = r10.c()     // Catch:{ SecurityException -> 0x0045 }
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r1)     // Catch:{ SecurityException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r5 = r3
        L_0x0046:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 < r9) goto L_0x0054
            r8 = 21
            boolean r8 = r2.hasCapability(r8)
            r8 = r8 ^ r7
            goto L_0x0067
        L_0x0054:
            if (r1 == 0) goto L_0x0066
            if (r5 == 0) goto L_0x0066
            android.net.NetworkInfo$DetailedState r8 = r5.getDetailedState()
            android.net.NetworkInfo$DetailedState r9 = android.net.NetworkInfo.DetailedState.CONNECTED
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0066
            r8 = r7
            goto L_0x0067
        L_0x0066:
            r8 = r4
        L_0x0067:
            r9 = 12
            boolean r9 = r2.hasCapability(r9)
            if (r9 == 0) goto L_0x007b
            r9 = 16
            boolean r9 = r2.hasCapability(r9)
            if (r9 == 0) goto L_0x007b
            if (r8 != 0) goto L_0x007b
            r8 = r7
            goto L_0x007c
        L_0x007b:
            r8 = r4
        L_0x007c:
            boolean r6 = r2.hasTransport(r6)
            if (r6 == 0) goto L_0x008c
            if (r8 == 0) goto L_0x008d
            int r2 = r2.getLinkDownstreamBandwidthKbps()
            if (r2 == 0) goto L_0x008d
            r4 = r7
            goto L_0x008d
        L_0x008c:
            r4 = r8
        L_0x008d:
            if (r1 == 0) goto L_0x009c
            od.b r1 = od.C5123b.CELLULAR
            if (r0 != r1) goto L_0x009c
            if (r4 == 0) goto L_0x009c
            od.a r3 = od.C5122a.b(r5)
            goto L_0x009c
        L_0x009a:
            od.b r0 = od.C5123b.NONE
        L_0x009c:
            r10.k(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.h.s():void");
    }
}
