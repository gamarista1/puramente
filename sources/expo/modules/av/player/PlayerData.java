package expo.modules.av.player;

import Hd.m;
import Hd.n;
import android.content.Context;
import android.media.audiofx.Visualizer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import lf.C6514M;

public abstract class PlayerData implements m {

    /* renamed from: a  reason: collision with root package name */
    final expo.modules.av.a f60246a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f60247b;

    /* renamed from: c  reason: collision with root package name */
    final Map f60248c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference f60249d;

    /* renamed from: e  reason: collision with root package name */
    private Jd.d f60250e = new Jd.d(new Jd.b());

    /* renamed from: f  reason: collision with root package name */
    private Visualizer f60251f = null;

    /* renamed from: g  reason: collision with root package name */
    private d f60252g = null;

    /* renamed from: h  reason: collision with root package name */
    private g f60253h = null;

    /* renamed from: i  reason: collision with root package name */
    c f60254i = null;

    /* renamed from: j  reason: collision with root package name */
    h f60255j = null;

    /* renamed from: k  reason: collision with root package name */
    private int f60256k = 500;

    /* renamed from: l  reason: collision with root package name */
    boolean f60257l = false;

    /* renamed from: m  reason: collision with root package name */
    float f60258m = 1.0f;
    private final HybridData mHybridData;

    /* renamed from: n  reason: collision with root package name */
    boolean f60259n = false;

    /* renamed from: o  reason: collision with root package name */
    float f60260o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    float f60261p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    boolean f60262q = false;

    class a implements Visualizer.OnDataCaptureListener {
        a() {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i10) {
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i10) {
            PlayerData playerData = PlayerData.this;
            if (playerData.f60257l) {
                playerData.w0(bArr, playerData.z0());
            }
        }
    }

    class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Md.d f60264a;

        b(Md.d dVar) {
            this.f60264a = dVar;
        }

        public void a() {
            Md.d dVar = this.f60264a;
            if (dVar == null) {
                PlayerData.this.s0();
            } else {
                dVar.resolve(PlayerData.this.C0());
            }
        }

        public void b(String str) {
            Md.d dVar = this.f60264a;
            if (dVar == null) {
                PlayerData.this.s0();
            } else {
                dVar.reject("E_AV_SETSTATUS", str);
            }
        }
    }

    public interface c {
        void a(String str);
    }

    public interface d {
        boolean e();

        void setFullscreenMode(boolean z10);
    }

    public interface e {
        void a(String str);

        void b(Bundle bundle);
    }

    interface f {
        void a();

        void b(String str);
    }

    public interface g {
        void a(Bundle bundle);
    }

    public interface h {
        void a(Pair pair);
    }

    PlayerData(expo.modules.av.a aVar, Uri uri, Map map) {
        this.f60248c = map;
        this.f60246a = aVar;
        this.f60247b = uri;
        this.f60249d = new WeakReference((Qd.c) aVar.m().b(Qd.c.class));
        this.mHybridData = initHybrid();
    }

    public static Bundle D0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isLoaded", false);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M H0() {
        s0();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K0(Map map) {
        Yd.b bVar = (Yd.b) map.get("android.permission.RECORD_AUDIO");
        if (bVar != null) {
            if (bVar.b() == Yd.d.GRANTED) {
                J0(true);
            } else if (!bVar.a()) {
                Log.e("PlayerData", "Cannot initialize Sample Data Callback (Visualizer) when RECORD_AUDIO permission is not granted!");
            }
        }
    }

    private native HybridData initHybrid();

    private void u0(Bundle bundle) {
        g gVar = this.f60253h;
        if (gVar != null) {
            gVar.a(bundle);
        }
    }

    public static PlayerData v0(expo.modules.av.a aVar, Context context, Nd.b bVar, Bundle bundle) {
        Map map;
        String string = bVar.getString("uri");
        String str = null;
        if (bVar.h("headers")) {
            map = bVar.getMap("headers");
        } else {
            map = null;
        }
        if (bVar.h("overridingExtension")) {
            str = bVar.getString("overridingExtension");
        }
        String str2 = str;
        Uri parse = Uri.parse(string);
        if (!bundle.containsKey("androidImplementation") || !Objects.equals(bundle.getString("androidImplementation"), "MediaPlayer")) {
            return new h(aVar, context, parse, str2, map);
        }
        return new b(aVar, context, parse, map);
    }

    /* access modifiers changed from: private */
    public void w0(byte[] bArr, double d10) {
        Qd.c cVar = (Qd.c) this.f60249d.get();
        if (cVar != null) {
            cVar.d(new f(this, bArr, d10));
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void A0(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract String B0();

    public final synchronized Bundle C0() {
        if (!F0()) {
            Bundle D02 = D0();
            D02.putString("androidImplementation", B0());
            return D02;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isLoaded", true);
        bundle.putString("androidImplementation", B0());
        bundle.putString("uri", this.f60247b.getPath());
        bundle.putInt("progressUpdateIntervalMillis", this.f60256k);
        bundle.putBoolean("shouldPlay", this.f60257l);
        bundle.putDouble("rate", (double) this.f60258m);
        bundle.putBoolean("shouldCorrectPitch", this.f60259n);
        bundle.putDouble("volume", (double) this.f60260o);
        bundle.putDouble("audioPan", (double) this.f60261p);
        bundle.putBoolean("isMuted", this.f60262q);
        bundle.putBoolean("didJustFinish", false);
        A0(bundle);
        return bundle;
    }

    public abstract Pair E0();

    /* access modifiers changed from: package-private */
    public abstract boolean F0();

    public boolean G0() {
        return this.f60252g.e();
    }

    public abstract void L0(Bundle bundle, e eVar);

    /* access modifiers changed from: package-private */
    public abstract void M0();

    public final void N0(c cVar) {
        this.f60254i = cVar;
    }

    public final void O0(d dVar) {
        this.f60252g = dVar;
    }

    public final void P0(Bundle bundle, Md.d dVar) {
        if (bundle != null) {
            try {
                R0(bundle, new b(dVar));
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.reject("E_AV_SETSTATUS", "Encountered an error while setting status!", th2);
                }
            }
        } else if (dVar != null) {
            dVar.reject("E_AV_SETSTATUS", "Cannot set null status.");
        }
    }

    public final void Q0(g gVar) {
        g gVar2 = this.f60253h;
        this.f60253h = gVar;
        if (gVar != null) {
            r0();
            if (gVar2 == null) {
                s0();
                return;
            }
            return;
        }
        V0();
    }

    /* access modifiers changed from: package-private */
    public final void R0(Bundle bundle, f fVar) {
        Integer num;
        if (bundle.containsKey("progressUpdateIntervalMillis") && this.f60256k != ((int) bundle.getDouble("progressUpdateIntervalMillis"))) {
            this.f60256k = (int) bundle.getDouble("progressUpdateIntervalMillis");
            if (this.f60250e.d()) {
                V0();
                r0();
            }
        }
        Boolean bool = null;
        if (bundle.containsKey("positionMillis")) {
            num = Integer.valueOf((int) bundle.getDouble("positionMillis"));
        } else {
            num = null;
        }
        if (bundle.containsKey("shouldPlay")) {
            this.f60257l = bundle.getBoolean("shouldPlay");
        }
        if (bundle.containsKey("rate")) {
            this.f60258m = (float) bundle.getDouble("rate");
        }
        if (bundle.containsKey("shouldCorrectPitch")) {
            this.f60259n = bundle.getBoolean("shouldCorrectPitch");
        }
        if (bundle.containsKey("volume")) {
            this.f60260o = (float) bundle.getDouble("volume");
        }
        if (bundle.containsKey("audioPan")) {
            this.f60261p = (float) bundle.getDouble("audioPan");
        }
        if (bundle.containsKey("isMuted")) {
            this.f60262q = bundle.getBoolean("isMuted");
        }
        if (bundle.containsKey("isLooping")) {
            bool = Boolean.valueOf(bundle.getBoolean("isLooping"));
        }
        try {
            q0(num, bool);
            this.f60246a.v();
            fVar.a();
        } catch (Throwable th2) {
            this.f60246a.v();
            fVar.b(th2.toString());
        }
    }

    public final void S0(h hVar) {
        this.f60255j = hVar;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean T0();

    /* access modifiers changed from: package-private */
    public final boolean U0() {
        if (!this.f60257l || ((double) this.f60258m) <= 0.0d) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void V0() {
        this.f60250e.i();
    }

    public final void W() {
        if (!this.f60262q) {
            b0();
        }
    }

    public void W0() {
        this.f60252g.setFullscreenMode(!G0());
    }

    public abstract void X0(Surface surface);

    public final void d0() {
        try {
            M0();
        } catch (n unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        Visualizer visualizer = this.f60251f;
        if (visualizer != null) {
            visualizer.release();
            this.f60251f = null;
        }
        this.mHybridData.resetNative();
    }

    public final void onPause() {
        b0();
    }

    public final void onResume() {
        try {
            M0();
        } catch (n unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void q0(Integer num, Boolean bool);

    /* access modifiers changed from: package-private */
    public final void r0() {
        if (T0() && !this.f60250e.d() && this.f60253h != null) {
            this.f60250e.e((long) this.f60256k, new e(this));
        }
    }

    public void release() {
        Visualizer visualizer = this.f60251f;
        if (visualizer != null) {
            visualizer.setDataCaptureListener((Visualizer.OnDataCaptureListener) null, 0, false, false);
            this.f60251f.setEnabled(false);
            this.f60251f.release();
            this.f60251f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void s0() {
        u0(C0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: sampleBufferCallback */
    public native void I0(byte[] bArr, double d10);

    /* access modifiers changed from: package-private */
    /* renamed from: setEnableSampleBufferCallback */
    public void J0(boolean z10) {
        if (!UiThreadUtil.isOnUiThread()) {
            UiThreadUtil.runOnUiThread(new c(this, z10));
        } else if (z10) {
            try {
                if (!this.f60246a.y()) {
                    this.f60246a.d(new d(this));
                    return;
                }
                int x02 = x0();
                Log.i("PlayerData", "Initializing Visualizer for Audio Session #" + x02 + "...");
                Visualizer visualizer = new Visualizer(x02);
                this.f60251f = visualizer;
                visualizer.setEnabled(false);
                this.f60251f.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                int min = Math.min(Visualizer.getMaxCaptureRate(), 10000);
                this.f60251f.setDataCaptureListener(new a(), min, true, false);
                this.f60251f.setEnabled(true);
                Log.i("PlayerData", "Visualizer initialized with a capture rate of " + min);
            } catch (Throwable th2) {
                Log.e("PlayerData", "Failed to initialize Visualizer! " + th2.getLocalizedMessage());
                th2.printStackTrace();
            }
        } else {
            Visualizer visualizer2 = this.f60251f;
            if (visualizer2 != null) {
                visualizer2.setEnabled(false);
                this.f60251f.release();
            }
            this.f60251f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void t0() {
        Bundle C02 = C0();
        C02.putBoolean("didJustFinish", true);
        u0(C02);
    }

    /* access modifiers changed from: package-private */
    public abstract int x0();

    /* access modifiers changed from: package-private */
    public final int y0(Integer num, Integer num2, Integer num3) {
        if (num2 != null && num.intValue() < num2.intValue()) {
            num = num2;
        } else if (num3 != null && num.intValue() > num3.intValue()) {
            num = num3;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public abstract double z0();
}
