package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import i2.p;

final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17819a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f17820b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17821c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17822d;

    public v0(Context context) {
        this.f17819a = context.getApplicationContext();
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f17820b;
        if (wifiLock != null) {
            if (!this.f17821c || !this.f17822d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17820b == null) {
            WifiManager wifiManager = (WifiManager) this.f17819a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                p.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f17820b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f17821c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17822d = z10;
        c();
    }
}
