package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import ja.C3645a;
import ja.M;
import ja.s;

final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f45566a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f45567b;

    /* renamed from: c  reason: collision with root package name */
    private final b f45568c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f45569d;

    /* renamed from: e  reason: collision with root package name */
    private c f45570e;

    /* renamed from: f  reason: collision with root package name */
    private int f45571f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f45572g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45573h;

    public interface b {
        void r(int i10);

        void w(int i10, boolean z10);
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            i1.this.f45567b.post(new j1(i1.this));
        }
    }

    public i1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f45566a = applicationContext;
        this.f45567b = handler;
        this.f45568c = bVar;
        AudioManager audioManager = (AudioManager) C3645a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f45569d = audioManager;
        this.f45572g = f(audioManager, 3);
        this.f45573h = e(audioManager, this.f45571f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f45570e = cVar;
        } catch (RuntimeException e10) {
            s.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (M.f44981a >= 23) {
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
            s.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f45569d, this.f45571f);
        boolean e10 = e(this.f45569d, this.f45571f);
        if (this.f45572g != f10 || this.f45573h != e10) {
            this.f45572g = f10;
            this.f45573h = e10;
            this.f45568c.w(f10, e10);
        }
    }

    public int c() {
        return this.f45569d.getStreamMaxVolume(this.f45571f);
    }

    public int d() {
        if (M.f44981a >= 28) {
            return this.f45569d.getStreamMinVolume(this.f45571f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f45570e;
        if (cVar != null) {
            try {
                this.f45566a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                s.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f45570e = null;
        }
    }

    public void h(int i10) {
        if (this.f45571f != i10) {
            this.f45571f = i10;
            i();
            this.f45568c.r(i10);
        }
    }
}
