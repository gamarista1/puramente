package o2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import f2.C1968c;
import i2.C2076a;
import i2.L;

/* renamed from: o2.i  reason: case insensitive filesystem */
public final class C2363i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f24996a;

    /* renamed from: b  reason: collision with root package name */
    private final f f24997b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f24998c;

    /* renamed from: d  reason: collision with root package name */
    private final c f24999d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f25000e;

    /* renamed from: f  reason: collision with root package name */
    private final d f25001f;

    /* renamed from: g  reason: collision with root package name */
    private C2359e f25002g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C2364j f25003h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public C1968c f25004i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f25005j;

    /* renamed from: o2.i$b */
    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) C2076a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) C2076a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: o2.i$c */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C2363i iVar = C2363i.this;
            iVar.f(C2359e.g(iVar.f24996a, C2363i.this.f25004i, C2363i.this.f25003h));
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (L.r(audioDeviceInfoArr, C2363i.this.f25003h)) {
                C2364j unused = C2363i.this.f25003h = null;
            }
            C2363i iVar = C2363i.this;
            iVar.f(C2359e.g(iVar.f24996a, C2363i.this.f25004i, C2363i.this.f25003h));
        }
    }

    /* renamed from: o2.i$d */
    private final class d extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f25007a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f25008b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f25007a = contentResolver;
            this.f25008b = uri;
        }

        public void a() {
            this.f25007a.registerContentObserver(this.f25008b, false, this);
        }

        public void b() {
            this.f25007a.unregisterContentObserver(this);
        }

        public void onChange(boolean z10) {
            C2363i iVar = C2363i.this;
            iVar.f(C2359e.g(iVar.f24996a, C2363i.this.f25004i, C2363i.this.f25003h));
        }
    }

    /* renamed from: o2.i$e */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                C2363i iVar = C2363i.this;
                iVar.f(C2359e.f(context, intent, iVar.f25004i, C2363i.this.f25003h));
            }
        }
    }

    /* renamed from: o2.i$f */
    public interface f {
        void a(C2359e eVar);
    }

    C2363i(Context context, f fVar, C1968c cVar, C2364j jVar) {
        c cVar2;
        e eVar;
        Context applicationContext = context.getApplicationContext();
        this.f24996a = applicationContext;
        this.f24997b = (f) C2076a.e(fVar);
        this.f25004i = cVar;
        this.f25003h = jVar;
        Handler B10 = L.B();
        this.f24998c = B10;
        int i10 = L.f22072a;
        d dVar = null;
        if (i10 >= 23) {
            cVar2 = new c();
        } else {
            cVar2 = null;
        }
        this.f24999d = cVar2;
        if (i10 >= 21) {
            eVar = new e();
        } else {
            eVar = null;
        }
        this.f25000e = eVar;
        Uri j10 = C2359e.j();
        this.f25001f = j10 != null ? new d(B10, applicationContext.getContentResolver(), j10) : dVar;
    }

    /* access modifiers changed from: private */
    public void f(C2359e eVar) {
        if (this.f25005j && !eVar.equals(this.f25002g)) {
            this.f25002g = eVar;
            this.f24997b.a(eVar);
        }
    }

    public C2359e g() {
        c cVar;
        if (this.f25005j) {
            return (C2359e) C2076a.e(this.f25002g);
        }
        this.f25005j = true;
        d dVar = this.f25001f;
        if (dVar != null) {
            dVar.a();
        }
        if (L.f22072a >= 23 && (cVar = this.f24999d) != null) {
            b.a(this.f24996a, cVar, this.f24998c);
        }
        Intent intent = null;
        if (this.f25000e != null) {
            intent = this.f24996a.registerReceiver(this.f25000e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.f24998c);
        }
        C2359e f10 = C2359e.f(this.f24996a, intent, this.f25004i, this.f25003h);
        this.f25002g = f10;
        return f10;
    }

    public void h(C1968c cVar) {
        this.f25004i = cVar;
        f(C2359e.g(this.f24996a, cVar, this.f25003h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        C2364j jVar = this.f25003h;
        C2364j jVar2 = null;
        if (jVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = jVar.f25011a;
        }
        if (!L.c(audioDeviceInfo, audioDeviceInfo2)) {
            if (audioDeviceInfo != null) {
                jVar2 = new C2364j(audioDeviceInfo);
            }
            this.f25003h = jVar2;
            f(C2359e.g(this.f24996a, this.f25004i, jVar2));
        }
    }

    public void j() {
        c cVar;
        if (this.f25005j) {
            this.f25002g = null;
            if (L.f22072a >= 23 && (cVar = this.f24999d) != null) {
                b.b(this.f24996a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f25000e;
            if (broadcastReceiver != null) {
                this.f24996a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f25001f;
            if (dVar != null) {
                dVar.b();
            }
            this.f25005j = false;
        }
    }
}
