package nd;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.models.AttributeType;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Iterator;
import java.util.Locale;
import od.C5122a;
import od.C5123b;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f61124a;

    /* renamed from: b  reason: collision with root package name */
    private final WifiManager f61125b;

    /* renamed from: c  reason: collision with root package name */
    private final TelephonyManager f61126c;

    /* renamed from: d  reason: collision with root package name */
    private final ReactApplicationContext f61127d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f61128e = false;

    /* renamed from: f  reason: collision with root package name */
    private C5123b f61129f = C5123b.UNKNOWN;

    /* renamed from: g  reason: collision with root package name */
    private C5122a f61130g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f61131h = false;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f61132i;

    d(ReactApplicationContext reactApplicationContext) {
        this.f61127d = reactApplicationContext;
        this.f61124a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f61125b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f61126c = (TelephonyManager) reactApplicationContext.getSystemService(AttributeType.PHONE);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:18|19|(1:23)|24|25|(1:27)|28|29|30|31|32|33|34|35|(2:36|37)|38|40|41|(1:43)|44|45|(1:47)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A[Catch:{ Exception -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd A[Catch:{ Exception -> 0x013d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.WritableMap b(java.lang.String r7) {
        /*
            r6 = this;
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            r7.hashCode()
            java.lang.String r1 = "subnet"
            java.lang.String r2 = "ipAddress"
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1419358249: goto L_0x002a;
                case -916596374: goto L_0x001f;
                case 3649301: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0034
        L_0x0014:
            java.lang.String r4 = "wifi"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r3 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r4 = "cellular"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            r3 = 1
            goto L_0x0034
        L_0x002a:
            java.lang.String r4 = "ethernet"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            switch(r3) {
                case 0: goto L_0x0100;
                case 1: goto L_0x00e7;
                case 2: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x013d
        L_0x0039:
            com.facebook.react.bridge.ReactApplicationContext r7 = r6.e()
            boolean r7 = nd.f.b(r7)
            if (r7 == 0) goto L_0x013d
            android.net.wifi.WifiManager r7 = r6.f61125b
            if (r7 == 0) goto L_0x013d
            android.net.wifi.WifiInfo r7 = r7.getConnectionInfo()
            if (r7 == 0) goto L_0x013d
            java.lang.String r3 = r7.getSSID()     // Catch:{ Exception -> 0x0068 }
            if (r3 == 0) goto L_0x0068
            java.lang.String r4 = "<unknown ssid>"
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x0068 }
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "\""
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = "ssid"
            r0.putString(r4, r3)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            java.lang.String r3 = r7.getBSSID()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x0073
            java.lang.String r4 = "bssid"
            r0.putString(r4, r3)     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            int r3 = r7.getRssi()     // Catch:{ Exception -> 0x0082 }
            r4 = 100
            int r3 = android.net.wifi.WifiManager.calculateSignalLevel(r3, r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = "strength"
            r0.putInt(r4, r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            int r3 = r7.getFrequency()     // Catch:{ Exception -> 0x008b }
            java.lang.String r4 = "frequency"
            r0.putInt(r4, r3)     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            int r3 = r7.getIpAddress()     // Catch:{ Exception -> 0x00a6 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00a6 }
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)     // Catch:{ Exception -> 0x00a6 }
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x00a6 }
            nd.f.c(r3)     // Catch:{ Exception -> 0x00a6 }
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r3)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = r3.getHostAddress()     // Catch:{ Exception -> 0x00a6 }
            r0.putString(r2, r3)     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            int r2 = r7.getIpAddress()     // Catch:{ Exception -> 0x00c1 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x00c1 }
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)     // Catch:{ Exception -> 0x00c1 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x00c1 }
            nd.f.c(r2)     // Catch:{ Exception -> 0x00c1 }
            java.net.InetAddress r2 = java.net.InetAddress.getByAddress(r2)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r2 = f(r2)     // Catch:{ Exception -> 0x00c1 }
            r0.putString(r1, r2)     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            int r1 = r7.getLinkSpeed()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r2 = "linkSpeed"
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x00ca }
        L_0x00ca:
            r1 = 29
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00d9 }
            if (r2 < r1) goto L_0x00d9
            int r2 = r7.getRxLinkSpeedMbps()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r3 = "rxLinkSpeed"
            r0.putInt(r3, r2)     // Catch:{ Exception -> 0x00d9 }
        L_0x00d9:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013d }
            if (r2 < r1) goto L_0x013d
            int r7 = r7.getTxLinkSpeedMbps()     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = "txLinkSpeed"
            r0.putInt(r1, r7)     // Catch:{ Exception -> 0x013d }
            goto L_0x013d
        L_0x00e7:
            od.a r7 = r6.f61130g
            if (r7 == 0) goto L_0x00f2
            java.lang.String r1 = "cellularGeneration"
            java.lang.String r7 = r7.f61193a
            r0.putString(r1, r7)
        L_0x00f2:
            android.telephony.TelephonyManager r7 = r6.f61126c
            java.lang.String r7 = r7.getNetworkOperatorName()
            if (r7 == 0) goto L_0x013d
            java.lang.String r1 = "carrier"
            r0.putString(r1, r7)
            goto L_0x013d
        L_0x0100:
            java.util.Enumeration r7 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0139 }
        L_0x0104:
            boolean r3 = r7.hasMoreElements()     // Catch:{ Exception -> 0x0139 }
            if (r3 == 0) goto L_0x013d
            java.lang.Object r3 = r7.nextElement()     // Catch:{ Exception -> 0x0139 }
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch:{ Exception -> 0x0139 }
            java.util.Enumeration r3 = r3.getInetAddresses()     // Catch:{ Exception -> 0x0139 }
        L_0x0114:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x0139 }
            if (r4 == 0) goto L_0x0104
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x0139 }
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch:{ Exception -> 0x0139 }
            boolean r5 = r4.isLoopbackAddress()     // Catch:{ Exception -> 0x0139 }
            if (r5 != 0) goto L_0x0114
            boolean r5 = r4 instanceof java.net.Inet4Address     // Catch:{ Exception -> 0x0139 }
            if (r5 == 0) goto L_0x0114
            java.lang.String r7 = r4.getHostAddress()     // Catch:{ Exception -> 0x0139 }
            r0.putString(r2, r7)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r7 = f(r4)     // Catch:{ Exception -> 0x0139 }
            r0.putString(r1, r7)     // Catch:{ Exception -> 0x0139 }
            return r0
        L_0x0139:
            r7 = move-exception
            r7.printStackTrace()
        L_0x013d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.d.b(java.lang.String):com.facebook.react.bridge.WritableMap");
    }

    private static String f(InetAddress inetAddress) {
        short s10;
        Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                s10 = 0;
                break;
            }
            InterfaceAddress next = it.next();
            if (next.getAddress().getAddress().length == 4) {
                s10 = next.getNetworkPrefixLength();
                break;
            }
        }
        int i10 = -1 << (32 - s10);
        return String.format(Locale.US, "%d.%d.%d.%d", new Object[]{Integer.valueOf((i10 >> 24) & 255), Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf(i10 & 255)});
    }

    /* access modifiers changed from: protected */
    public WritableMap a(String str) {
        String str2;
        boolean z10;
        boolean z11;
        WritableMap createMap = Arguments.createMap();
        boolean z12 = false;
        if (f.b(e())) {
            WifiManager wifiManager = this.f61125b;
            if (wifiManager != null) {
                z11 = wifiManager.isWifiEnabled();
            } else {
                z11 = false;
            }
            createMap.putBoolean("isWifiEnabled", z11);
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = this.f61129f.f61203a;
        }
        createMap.putString("type", str2);
        boolean z13 = true;
        if (this.f61129f.equals(C5123b.NONE) || this.f61129f.equals(C5123b.UNKNOWN)) {
            z10 = false;
        } else {
            z10 = true;
        }
        createMap.putBoolean("isConnected", z10);
        if (this.f61131h && (str == null || str.equals(this.f61129f.f61203a))) {
            z12 = true;
        }
        createMap.putBoolean("isInternetReachable", z12);
        if (str == null) {
            str = this.f61129f.f61203a;
        }
        WritableMap b10 = b(str);
        if (z10) {
            if (c() != null) {
                z13 = c().isActiveNetworkMetered();
            }
            b10.putBoolean("isConnectionExpensive", z13);
        }
        createMap.putMap("details", b10);
        return createMap;
    }

    /* access modifiers changed from: package-private */
    public ConnectivityManager c() {
        return this.f61124a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    /* access modifiers changed from: package-private */
    public ReactApplicationContext e() {
        return this.f61127d;
    }

    public abstract void g();

    /* access modifiers changed from: protected */
    public void h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a((String) null));
    }

    public void i(boolean z10) {
        this.f61132i = Boolean.valueOf(z10);
        k(this.f61129f, this.f61130g, this.f61131h);
    }

    public abstract void j();

    /* access modifiers changed from: package-private */
    public void k(C5123b bVar, C5122a aVar, boolean z10) {
        boolean z11;
        boolean z12;
        Boolean bool = this.f61132i;
        if (bool != null) {
            z10 = bool.booleanValue();
        }
        boolean z13 = false;
        if (bVar != this.f61129f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (aVar != this.f61130g) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != this.f61131h) {
            z13 = true;
        }
        if (z11 || z12 || z13) {
            this.f61129f = bVar;
            this.f61130g = aVar;
            this.f61131h = z10;
            if (this.f61128e) {
                h();
            }
        }
    }
}
