package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import i2.C2076a;
import i2.L;
import i2.p;

final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17802a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17803b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17804c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f17805d;

    /* renamed from: e  reason: collision with root package name */
    private c f17806e;

    /* renamed from: f  reason: collision with root package name */
    private int f17807f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f17808g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17809h;

    public interface b {
        void r(int i10);

        void w(int i10, boolean z10);
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            s0.this.f17803b.post(new t0(s0.this));
        }
    }

    public s0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f17802a = applicationContext;
        this.f17803b = handler;
        this.f17804c = bVar;
        AudioManager audioManager = (AudioManager) C2076a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f17805d = audioManager;
        this.f17808g = f(audioManager, 3);
        this.f17809h = e(audioManager, this.f17807f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f17806e = cVar;
        } catch (RuntimeException e10) {
            p.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (L.f22072a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        if (f(audioManager, i10) == 0) {
            return true;
        }
        return false;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            p.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f17805d, this.f17807f);
        boolean e10 = e(this.f17805d, this.f17807f);
        if (this.f17808g != f10 || this.f17809h != e10) {
            this.f17808g = f10;
            this.f17809h = e10;
            this.f17804c.w(f10, e10);
        }
    }

    public int c() {
        return this.f17805d.getStreamMaxVolume(this.f17807f);
    }

    public int d() {
        if (L.f22072a >= 28) {
            return this.f17805d.getStreamMinVolume(this.f17807f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f17806e;
        if (cVar != null) {
            try {
                this.f17802a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                p.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f17806e = null;
        }
    }

    public void h(int i10) {
        if (this.f17807f != i10) {
            this.f17807f = i10;
            i();
            this.f17804c.r(i10);
        }
    }
}
