package k9;

import android.content.Context;
import android.net.wifi.WifiManager;
import ja.s;

final class u1 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f45846a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f45847b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45848c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45849d;

    public u1(Context context) {
        this.f45846a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f45847b;
        if (wifiLock != null) {
            if (!this.f45848c || !this.f45849d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f45847b == null) {
            WifiManager wifiManager = this.f45846a;
            if (wifiManager == null) {
                s.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f45847b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f45848c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f45849d = z10;
        c();
    }
}
