package androidx.media3.exoplayer;

import android.content.Context;
import android.os.PowerManager;
import i2.p;

final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17814a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f17815b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17816c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17817d;

    public u0(Context context) {
        this.f17814a = context.getApplicationContext();
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f17815b;
        if (wakeLock != null) {
            if (!this.f17816c || !this.f17817d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17815b == null) {
            PowerManager powerManager = (PowerManager) this.f17814a.getSystemService("power");
            if (powerManager == null) {
                p.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f17815b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f17816c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17817d = z10;
        c();
    }
}
