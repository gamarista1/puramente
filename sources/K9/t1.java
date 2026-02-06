package k9;

import android.content.Context;
import android.os.PowerManager;
import ja.s;

final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f45838a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f45839b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45840c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45841d;

    public t1(Context context) {
        this.f45838a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f45839b;
        if (wakeLock != null) {
            if (!this.f45840c || !this.f45841d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f45839b == null) {
            PowerManager powerManager = this.f45838a;
            if (powerManager == null) {
                s.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f45839b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f45840c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f45841d = z10;
        c();
    }
}
