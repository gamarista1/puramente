package expo.modules.av;

import Hd.k;
import Hd.m;
import Hd.n;
import Hd.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import expo.modules.av.f;
import expo.modules.av.player.PlayerData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class AVManager implements Pd.e, AudioManager.OnAudioFocusChangeListener, MediaRecorder.OnInfoListener, a, Pd.c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f60126a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Context f60127b;

    /* renamed from: c  reason: collision with root package name */
    private e f60128c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60129d = true;

    /* renamed from: e  reason: collision with root package name */
    private final AudioManager f60130e;

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f60131f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f60132g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f60133h = false;

    /* renamed from: i  reason: collision with root package name */
    private j f60134i = j.DUCK_OTHERS;

    /* renamed from: j  reason: collision with root package name */
    private boolean f60135j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f60136k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f60137l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f60138m = 0;
    private final HybridData mHybridData;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Map f60139n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private final Set f60140o = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    private MediaRecorder f60141p = null;

    /* renamed from: q  reason: collision with root package name */
    private String f60142q = null;

    /* renamed from: r  reason: collision with root package name */
    private long f60143r = 0;

    /* renamed from: s  reason: collision with root package name */
    private long f60144s = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f60145t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f60146u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f60147v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f60148w = false;

    /* renamed from: x  reason: collision with root package name */
    private Md.b f60149x;

    /* renamed from: y  reason: collision with root package name */
    private o f60150y = new o();

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                AVManager.this.T();
            }
        }
    }

    class b implements PlayerData.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f60152a;

        b(int i10) {
            this.f60152a = i10;
        }

        public void a(String str) {
            AVManager.this.l0(Integer.valueOf(this.f60152a));
        }
    }

    class c implements PlayerData.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Md.d f60154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f60155b;

        c(Md.d dVar, int i10) {
            this.f60154a = dVar;
            this.f60155b = i10;
        }

        public void a(String str) {
            AVManager.this.f60139n.remove(Integer.valueOf(this.f60155b));
            this.f60154a.reject("E_LOAD_ERROR", str, (Throwable) null);
        }

        public void b(Bundle bundle) {
            this.f60154a.resolve(Arrays.asList(new Object[]{Integer.valueOf(this.f60155b), bundle}));
        }
    }

    class d implements PlayerData.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f60157a;

        d(int i10) {
            this.f60157a = i10;
        }

        public void a(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(SubscriberAttributeKt.JSON_NAME_KEY, this.f60157a);
            bundle2.putBundle("status", bundle);
            AVManager.this.m0("didUpdatePlaybackStatus", bundle2);
        }
    }

    class e implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Nd.b f60159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Nd.b f60160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Md.d f60161c;

        e(Nd.b bVar, Nd.b bVar2, Md.d dVar) {
            this.f60159a = bVar;
            this.f60160b = bVar2;
            this.f60161c = dVar;
        }

        public void a(expo.modules.av.video.g gVar) {
            gVar.J(this.f60159a, this.f60160b, this.f60161c);
        }
    }

    class f implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Md.d f60163a;

        f(Md.d dVar) {
            this.f60163a = dVar;
        }

        public void a(expo.modules.av.video.g gVar) {
            gVar.J((Nd.b) null, (Nd.b) null, this.f60163a);
        }
    }

    class g implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Nd.b f60165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Md.d f60166b;

        g(Nd.b bVar, Md.d dVar) {
            this.f60165a = bVar;
            this.f60166b = dVar;
        }

        public void a(expo.modules.av.video.g gVar) {
            gVar.K(this.f60165a, this.f60166b);
        }
    }

    class h implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Nd.b f60168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Md.d f60169b;

        h(Nd.b bVar, Md.d dVar) {
            this.f60168a = bVar;
            this.f60169b = dVar;
        }

        public void a(expo.modules.av.video.g gVar) {
            gVar.K(this.f60168a, this.f60169b);
        }
    }

    class i implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Md.d f60171a;

        i(Md.d dVar) {
            this.f60171a = dVar;
        }

        public void a(expo.modules.av.video.g gVar) {
            this.f60171a.resolve(gVar.getStatus());
        }
    }

    private enum j {
        DO_NOT_MIX,
        DUCK_OTHERS
    }

    static {
        System.loadLibrary("expo-av");
    }

    public AVManager(Context context) {
        this.f60127b = context;
        this.f60130e = (AudioManager) context.getSystemService("audio");
        a aVar = new a();
        this.f60131f = aVar;
        context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        this.f60147v = true;
        this.mHybridData = initHybrid();
    }

    /* access modifiers changed from: private */
    public void T() {
        for (m mVar : W()) {
            if (mVar.w()) {
                mVar.b0();
            }
        }
        this.f60132g = false;
        this.f60130e.abandonAudioFocus(this);
    }

    private boolean U(Md.d dVar) {
        if (this.f60141p == null && dVar != null) {
            dVar.reject("E_AUDIO_NORECORDER", "Recorder does not exist.");
        }
        if (this.f60141p != null) {
            return true;
        }
        return false;
    }

    private static File V(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    private Set W() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f60140o);
        hashSet.addAll(this.f60139n.values());
        return hashSet;
    }

    private long X() {
        if (this.f60141p == null) {
            return 0;
        }
        long j10 = this.f60144s;
        if (!this.f60145t || this.f60143r <= 0) {
            return j10;
        }
        return j10 + (SystemClock.uptimeMillis() - this.f60143r);
    }

    private int Y() {
        int maxAmplitude;
        MediaRecorder mediaRecorder = this.f60141p;
        if (mediaRecorder == null || !this.f60148w || (maxAmplitude = mediaRecorder.getMaxAmplitude()) == 0) {
            return -160;
        }
        return (int) (Math.log(((double) maxAmplitude) / 32767.0d) * 20.0d);
    }

    private Bundle Z() {
        Bundle bundle = new Bundle();
        if (this.f60141p != null) {
            bundle.putBoolean("canRecord", true);
            bundle.putBoolean("isRecording", this.f60145t);
            bundle.putInt("durationMillis", (int) X());
            if (this.f60148w) {
                bundle.putInt("metering", Y());
            }
        }
        return bundle;
    }

    private AudioDeviceInfo a0(String str) {
        int intValue = Integer.valueOf(str).intValue();
        for (AudioDeviceInfo audioDeviceInfo : this.f60130e.getDevices(1)) {
            if (audioDeviceInfo.getId() == intValue) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    private Bundle b0(AudioDeviceInfo audioDeviceInfo) {
        Bundle bundle = new Bundle();
        int type = audioDeviceInfo.getType();
        String valueOf = String.valueOf(type);
        if (type == 15) {
            valueOf = "MicrophoneBuiltIn";
        } else if (type == 7) {
            valueOf = "BluetoothSCO";
        } else if (type == 8) {
            valueOf = "BluetoothA2DP";
        } else if (type == 18) {
            valueOf = "Telephony";
        } else if (type == 3) {
            valueOf = "MicrophoneWired";
        }
        bundle.putString("name", audioDeviceInfo.getProductName().toString());
        bundle.putString("type", valueOf);
        bundle.putString("uid", String.valueOf(audioDeviceInfo.getId()));
        return bundle;
    }

    private Qd.c c0() {
        return (Qd.c) this.f60149x.b(Qd.c.class);
    }

    /* access modifiers changed from: private */
    public void d0() {
        Pd.d dVar = (Pd.d) this.f60149x.b(Pd.d.class);
        long f10 = dVar.f();
        if (f10 != 0) {
            Log.e("AVManager", "Cannot install JSI bindings for AV module because JS context is not available");
            return;
        }
        CallInvokerHolderImpl jSCallInvokerHolder = dVar.getJSCallInvokerHolder();
        if (jSCallInvokerHolder == null) {
            Log.e("AVManager", "Cannot install JSI bindings for AV module because JS call invoker holder is not available");
            return;
        }
        try {
            installJSIBindings(f10, jSCallInvokerHolder);
        } catch (Exception e10) {
            Log.e("AVManager", "Cannot install JSI bindings for AV module", e10);
        }
    }

    private boolean e0() {
        return !y();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f0(Integer num, Md.d dVar) {
        PlayerData n02 = n0(num, dVar);
        if (n02 != null) {
            dVar.resolve(n02.C0());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0(Nd.b bVar, Nd.b bVar2, Md.d dVar) {
        int i10 = this.f60138m;
        this.f60138m = i10 + 1;
        PlayerData v02 = PlayerData.v0(this, this.f60127b, bVar, bVar2.e());
        v02.N0(new b(i10));
        this.f60139n.put(Integer.valueOf(i10), v02);
        v02.L0(bVar2.e(), new c(dVar, i10));
        v02.Q0(new d(i10));
    }

    private PlayerData getMediaPlayerById(int i10) {
        return (PlayerData) this.f60139n.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0(Integer num, Md.d dVar, Nd.b bVar) {
        PlayerData n02 = n0(num, dVar);
        if (n02 != null) {
            n02.P0(bVar.e(), dVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i0(Integer num, Md.d dVar, Nd.b bVar) {
        PlayerData n02 = n0(num, dVar);
        if (n02 != null) {
            n02.P0(bVar.e(), dVar);
        }
    }

    private native HybridData initHybrid();

    private native void installJSIBindings(long j10, CallInvokerHolderImpl callInvokerHolderImpl);

    /* access modifiers changed from: private */
    public /* synthetic */ void j0(Integer num, Md.d dVar) {
        if (n0(num, dVar) != null) {
            l0(num);
            dVar.resolve(PlayerData.D0());
        }
    }

    private void k0() {
        MediaRecorder mediaRecorder = this.f60141p;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (RuntimeException unused) {
            }
            this.f60141p.release();
            this.f60141p = null;
        }
        this.f60142q = null;
        this.f60145t = false;
        this.f60146u = false;
        this.f60144s = 0;
        this.f60143r = 0;
    }

    /* access modifiers changed from: private */
    public void l0(Integer num) {
        PlayerData playerData = (PlayerData) this.f60139n.remove(num);
        if (playerData != null) {
            playerData.release();
            v();
        }
    }

    /* access modifiers changed from: private */
    public void m0(String str, Bundle bundle) {
        e eVar = this.f60128c;
        if (eVar != null) {
            eVar.a(str, bundle);
        }
    }

    private PlayerData n0(Integer num, Md.d dVar) {
        PlayerData playerData = (PlayerData) this.f60139n.get(num);
        if (playerData == null && dVar != null) {
            dVar.reject("E_AUDIO_NOPLAYER", "Player does not exist.");
        }
        return playerData;
    }

    /* access modifiers changed from: private */
    public void o0() {
        for (m M10 : W()) {
            M10.M();
        }
    }

    private void p0(boolean z10) {
        int i10;
        AudioManager audioManager = this.f60130e;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        audioManager.setMode(i10);
        this.f60130e.setSpeakerphoneOn(!z10);
    }

    public void A(Nd.b bVar) {
        boolean z10 = bVar.getBoolean("shouldDuckAndroid");
        this.f60135j = z10;
        if (!z10) {
            this.f60136k = false;
            c0().e(new k(this));
        }
        if (bVar.h("playThroughEarpieceAndroid")) {
            boolean z11 = bVar.getBoolean("playThroughEarpieceAndroid");
            this.f60126a = z11;
            p0(z11);
        }
        if (bVar.getInt("interruptionModeAndroid") != 1) {
            this.f60134i = j.DUCK_OTHERS;
        } else {
            this.f60134i = j.DO_NOT_MIX;
        }
        this.f60137l = bVar.getBoolean("staysActiveInBackground");
    }

    public void B(e eVar) {
        this.f60128c = eVar;
    }

    public void C(String str, Md.d dVar) {
        boolean z10;
        AudioDeviceInfo a02 = a0(str);
        if (Build.VERSION.SDK_INT >= 28) {
            if (a02 == null || a02.getType() != 7) {
                this.f60130e.stopBluetoothSco();
            } else {
                this.f60130e.startBluetoothSco();
            }
            z10 = this.f60141p.setPreferredDevice(a02);
        } else {
            dVar.reject("E_AUDIO_VERSIONINCOMPATIBLE", "Setting input is not supported on devices running Android version lower than Android 9.0");
            z10 = false;
        }
        if (z10) {
            dVar.resolve(Boolean.valueOf(z10));
        } else {
            dVar.reject("E_AUDIO_SETINPUTFAIL", "Could not set preferred device input.");
        }
    }

    public void D(Md.d dVar) {
        if (U(dVar)) {
            dVar.resolve(Z());
        }
    }

    public float E(boolean z10, float f10) {
        if (!this.f60132g || z10) {
            return 0.0f;
        }
        if (this.f60136k) {
            return f10 / 2.0f;
        }
        return f10;
    }

    public void F(Integer num, Nd.b bVar, Md.d dVar) {
        f.c(this.f60149x, num.intValue(), new h(bVar, dVar), dVar);
    }

    public void G(Nd.b bVar, Md.d dVar) {
        if (e0()) {
            dVar.reject("E_MISSING_PERMISSION", "Missing audio recording permissions.");
            return;
        }
        this.f60148w = bVar.getBoolean("isMeteringEnabled");
        k0();
        Nd.b d10 = bVar.d("android");
        String str = "recording-" + UUID.randomUUID().toString() + d10.getString("extension");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f60127b.getCacheDir());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("Audio");
            File file = new File(sb2.toString());
            V(file);
            this.f60142q = file + str2 + str;
        } catch (IOException unused) {
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f60141p = mediaRecorder;
        mediaRecorder.setAudioSource(0);
        this.f60141p.setOutputFormat(d10.getInt("outputFormat"));
        this.f60141p.setAudioEncoder(d10.getInt("audioEncoder"));
        if (d10.h("sampleRate")) {
            this.f60141p.setAudioSamplingRate(d10.getInt("sampleRate"));
        }
        if (d10.h("numberOfChannels")) {
            this.f60141p.setAudioChannels(d10.getInt("numberOfChannels"));
        }
        if (d10.h("bitRate")) {
            this.f60141p.setAudioEncodingBitRate(d10.getInt("bitRate"));
        }
        this.f60141p.setOutputFile(this.f60142q);
        if (d10.h("maxFileSize")) {
            this.f60141p.setMaxFileSize((long) d10.getInt("maxFileSize"));
            this.f60141p.setOnInfoListener(this);
        }
        try {
            this.f60141p.prepare();
            Bundle bundle = new Bundle();
            bundle.putString("uri", Uri.fromFile(new File(this.f60142q)).toString());
            bundle.putBundle("status", Z());
            dVar.resolve(bundle);
        } catch (Exception e10) {
            dVar.reject("E_AUDIO_RECORDERNOTCREATED", "Prepare encountered an error: recorder not prepared", e10);
            k0();
        }
    }

    public o a() {
        return this.f60150y;
    }

    public void b(Integer num, Nd.b bVar, Nd.b bVar2, Md.d dVar) {
        f.c(this.f60149x, num.intValue(), new e(bVar, bVar2, dVar), dVar);
    }

    public void c(Integer num, Nd.b bVar, Md.d dVar) {
        c0().e(new Hd.f(this, num, dVar, bVar));
    }

    public void d(Yd.c cVar) {
        ((Yd.a) this.f60149x.b(Yd.a.class)).e(cVar, "android.permission.RECORD_AUDIO");
    }

    public void e(expo.modules.av.video.g gVar) {
        this.f60140o.add(gVar);
    }

    public void f(Boolean bool) {
        this.f60129d = bool.booleanValue();
        if (!bool.booleanValue()) {
            c0().e(new Hd.j(this));
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        this.mHybridData.resetNative();
    }

    public void g(Integer num, Md.d dVar) {
        f.c(this.f60149x, num.intValue(), new i(dVar), dVar);
    }

    public Context getContext() {
        return this.f60127b;
    }

    public void h(Integer num, Md.d dVar) {
        c0().e(new Hd.i(this, num, dVar));
    }

    public void i(Md.d dVar) {
        if (Build.VERSION.SDK_INT < 28) {
            dVar.reject("E_AUDIO_VERSIONINCOMPATIBLE", "Getting current audio input is not supported on devices running Android version lower than Android 9.0");
            return;
        }
        try {
            AudioDeviceInfo unused = this.f60141p.getRoutedDevice();
        } catch (Exception unused2) {
        }
        AudioDeviceInfo a10 = this.f60141p.getPreferredDevice();
        if (a10 == null) {
            AudioDeviceInfo[] devices = this.f60130e.getDevices(1);
            int i10 = 0;
            while (true) {
                if (i10 >= devices.length) {
                    break;
                }
                AudioDeviceInfo audioDeviceInfo = devices[i10];
                if (audioDeviceInfo.getType() == 15) {
                    boolean unused3 = this.f60141p.setPreferredDevice(audioDeviceInfo);
                    a10 = audioDeviceInfo;
                    break;
                }
                i10++;
            }
        }
        if (a10 != null) {
            dVar.resolve(b0(a10));
        } else {
            dVar.reject("E_AUDIO_DEVICENOTFOUND", "Cannot get current input, AudioDeviceInfo not found.");
        }
    }

    public void j(Md.d dVar) {
        if (U(dVar)) {
            k0();
            dVar.resolve((Object) null);
        }
    }

    public void k(Md.d dVar) {
        if (U(dVar)) {
            try {
                this.f60141p.stop();
                this.f60144s = X();
                this.f60145t = false;
                this.f60146u = false;
                dVar.resolve(Z());
            } catch (RuntimeException e10) {
                this.f60146u = false;
                if (!this.f60145t) {
                    dVar.reject("E_AUDIO_RECORDINGSTOP", "Stop encountered an error: recording not started", e10);
                    return;
                }
                this.f60145t = false;
                dVar.reject("E_AUDIO_NODATA", "Stop encountered an error: no valid audio data has been received", e10);
            }
        }
    }

    public void l(Md.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : this.f60130e.getDevices(1)) {
            int type = audioDeviceInfo.getType();
            if (type == 15 || type == 7 || type == 3) {
                arrayList.add(b0(audioDeviceInfo));
            }
        }
        dVar.resolve(arrayList);
    }

    public Md.b m() {
        return this.f60149x;
    }

    public void n(Integer num, Nd.b bVar, Md.d dVar) {
        c0().e(new Hd.h(this, num, dVar, bVar));
    }

    public List o() {
        return Collections.singletonList(a.class);
    }

    public void onAudioFocusChange(int i10) {
        if (i10 != -3) {
            if (!(i10 == -2 || i10 == -1)) {
                if (i10 == 1) {
                    this.f60136k = false;
                    this.f60132g = true;
                    for (m d02 : W()) {
                        d02.d0();
                    }
                    return;
                }
                return;
            }
        } else if (this.f60135j) {
            this.f60136k = true;
            this.f60132g = true;
            o0();
            return;
        }
        this.f60136k = false;
        this.f60132g = false;
        for (m W10 : W()) {
            W10.W();
        }
    }

    public void onHostDestroy() {
        if (this.f60147v) {
            this.f60127b.unregisterReceiver(this.f60131f);
            this.f60147v = false;
        }
        Iterator it = this.f60139n.values().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            it.remove();
            if (playerData != null) {
                playerData.release();
            }
        }
        for (expo.modules.av.video.g O10 : this.f60140o) {
            O10.O();
        }
        k0();
        T();
        this.mHybridData.resetNative();
        c0().b(this);
    }

    public void onHostPause() {
        if (!this.f60133h) {
            this.f60133h = true;
            if (!this.f60137l) {
                for (m onPause : W()) {
                    onPause.onPause();
                }
                T();
                if (this.f60126a) {
                    p0(false);
                }
            }
        }
    }

    public void onHostResume() {
        if (this.f60133h) {
            this.f60133h = false;
            if (!this.f60137l) {
                for (m onResume : W()) {
                    onResume.onResume();
                }
                if (this.f60126a) {
                    p0(true);
                }
            }
        }
    }

    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) {
        if (i10 == 801) {
            k0();
            m0("Expo.Recording.recorderUnloaded", new Bundle());
        }
    }

    public void p(Md.b bVar) {
        if (this.f60149x != null) {
            c0().b(this);
        }
        this.f60149x = bVar;
        if (bVar != null) {
            Qd.c c02 = c0();
            c02.c(this);
            c02.d(new Hd.e(this));
        }
    }

    public void q(Integer num, Nd.b bVar, Md.d dVar) {
        f.c(this.f60149x, num.intValue(), new g(bVar, dVar), dVar);
    }

    public void r(Md.d dVar) {
        if (U(dVar)) {
            try {
                this.f60141p.pause();
                this.f60144s = X();
                this.f60145t = false;
                this.f60146u = true;
                dVar.resolve(Z());
            } catch (IllegalStateException e10) {
                dVar.reject("E_AUDIO_RECORDINGPAUSE", "Pause encountered an error: recording not paused", e10);
            }
        }
    }

    public void s(Integer num, Md.d dVar) {
        f.c(this.f60149x, num.intValue(), new f(dVar), dVar);
    }

    public void t(Nd.b bVar, Nd.b bVar2, Md.d dVar) {
        c0().e(new Hd.d(this, bVar, bVar2, dVar));
    }

    public void u(expo.modules.av.video.g gVar) {
        this.f60140o.remove(gVar);
    }

    public void v() {
        for (m w10 : W()) {
            if (w10.w()) {
                return;
            }
        }
        T();
    }

    public void w(Integer num, Md.d dVar) {
        c0().e(new Hd.g(this, num, dVar));
    }

    public void x() {
        int i10;
        if (!this.f60129d) {
            throw new n("Expo Audio is disabled, so audio focus could not be acquired.");
        } else if (this.f60133h && !this.f60137l) {
            throw new n("This experience is currently in the background, so audio focus could not be acquired.");
        } else if (!this.f60132g) {
            boolean z10 = true;
            if (this.f60134i == j.DO_NOT_MIX) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            if (this.f60130e.requestAudioFocus(this, 3, i10) != 1) {
                z10 = false;
            }
            this.f60132g = z10;
            if (!z10) {
                throw new n("Audio focus could not be acquired from the OS at this time.");
            }
        }
    }

    public boolean y() {
        return ((Yd.a) this.f60149x.b(Yd.a.class)).f("android.permission.RECORD_AUDIO");
    }

    public void z(Md.d dVar) {
        if (e0()) {
            dVar.reject("E_MISSING_PERMISSION", "Missing audio recording permissions.");
        } else if (U(dVar)) {
            try {
                if (this.f60146u) {
                    this.f60141p.resume();
                } else {
                    this.f60141p.start();
                }
                this.f60143r = SystemClock.uptimeMillis();
                this.f60145t = true;
                this.f60146u = false;
                dVar.resolve(Z());
            } catch (IllegalStateException e10) {
                dVar.reject("E_AUDIO_RECORDING", "Start encountered an error: recording not started", e10);
            }
        }
    }
}
