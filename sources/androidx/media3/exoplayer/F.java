package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C1803a;
import androidx.media3.exoplayer.C1805c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.S;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.s0;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.C4770v;
import f2.C1963D;
import f2.C1964E;
import f2.C1968c;
import f2.C1972g;
import f2.C1978m;
import f2.H;
import f2.K;
import f2.P;
import f2.r;
import f2.s;
import f2.w;
import f2.x;
import f2.y;
import f2.z;
import h2.C2031b;
import i2.C2075C;
import i2.C2076a;
import i2.C2078c;
import i2.C2081f;
import i2.C2087l;
import i2.L;
import i2.o;
import i2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import m2.C2190B;
import m2.k;
import m2.u;
import m2.v;
import n2.C2280a;
import n2.C2282b;
import n2.s1;
import n2.u1;
import o2.C2377x;
import o2.C2378y;
import s2.C2591b;
import t2.C2615C;
import t2.C2660z;
import t2.b0;
import t2.j0;
import u2.C2704h;
import v2.C;
import v2.D;
import w2.C2822d;
import x2.C2900D;
import x2.n;
import y2.C2935a;
import y2.l;

final class F extends C1972g implements ExoPlayer {

    /* renamed from: A  reason: collision with root package name */
    private final C1803a f17363A;

    /* renamed from: B  reason: collision with root package name */
    private final C1805c f17364B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final s0 f17365C;

    /* renamed from: D  reason: collision with root package name */
    private final u0 f17366D;

    /* renamed from: E  reason: collision with root package name */
    private final v0 f17367E;

    /* renamed from: F  reason: collision with root package name */
    private final long f17368F;

    /* renamed from: G  reason: collision with root package name */
    private AudioManager f17369G;

    /* renamed from: H  reason: collision with root package name */
    private final boolean f17370H;

    /* renamed from: I  reason: collision with root package name */
    private int f17371I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f17372J;

    /* renamed from: K  reason: collision with root package name */
    private int f17373K;

    /* renamed from: L  reason: collision with root package name */
    private int f17374L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f17375M;

    /* renamed from: N  reason: collision with root package name */
    private C2190B f17376N;

    /* renamed from: O  reason: collision with root package name */
    private b0 f17377O;

    /* renamed from: P  reason: collision with root package name */
    private ExoPlayer.c f17378P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f17379Q;

    /* renamed from: R  reason: collision with root package name */
    private C1964E.b f17380R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public y f17381S;

    /* renamed from: T  reason: collision with root package name */
    private y f17382T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public s f17383U;
    /* access modifiers changed from: private */

    /* renamed from: V  reason: collision with root package name */
    public s f17384V;

    /* renamed from: W  reason: collision with root package name */
    private AudioTrack f17385W;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public Object f17386X;

    /* renamed from: Y  reason: collision with root package name */
    private Surface f17387Y;

    /* renamed from: Z  reason: collision with root package name */
    private SurfaceHolder f17388Z;

    /* renamed from: a0  reason: collision with root package name */
    private l f17389a0;

    /* renamed from: b  reason: collision with root package name */
    final D f17390b;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public boolean f17391b0;

    /* renamed from: c  reason: collision with root package name */
    final C1964E.b f17392c;

    /* renamed from: c0  reason: collision with root package name */
    private TextureView f17393c0;

    /* renamed from: d  reason: collision with root package name */
    private final C2081f f17394d;

    /* renamed from: d0  reason: collision with root package name */
    private int f17395d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f17396e;

    /* renamed from: e0  reason: collision with root package name */
    private int f17397e0;

    /* renamed from: f  reason: collision with root package name */
    private final C1964E f17398f;

    /* renamed from: f0  reason: collision with root package name */
    private C2075C f17399f0;

    /* renamed from: g  reason: collision with root package name */
    private final q0[] f17400g;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public k f17401g0;

    /* renamed from: h  reason: collision with root package name */
    private final C f17402h;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public k f17403h0;

    /* renamed from: i  reason: collision with root package name */
    private final C2087l f17404i;

    /* renamed from: i0  reason: collision with root package name */
    private int f17405i0;

    /* renamed from: j  reason: collision with root package name */
    private final S.f f17406j;

    /* renamed from: j0  reason: collision with root package name */
    private C1968c f17407j0;

    /* renamed from: k  reason: collision with root package name */
    private final S f17408k;

    /* renamed from: k0  reason: collision with root package name */
    private float f17409k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final o f17410l;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public boolean f17411l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet f17412m;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public C2031b f17413m0;

    /* renamed from: n  reason: collision with root package name */
    private final H.b f17414n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f17415n0;

    /* renamed from: o  reason: collision with root package name */
    private final List f17416o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f17417o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f17418p;

    /* renamed from: p0  reason: collision with root package name */
    private int f17419p0;

    /* renamed from: q  reason: collision with root package name */
    private final C2615C.a f17420q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f17421q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C2280a f17422r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f17423r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f17424s;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public C1978m f17425s0;

    /* renamed from: t  reason: collision with root package name */
    private final C2822d f17426t;
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public P f17427t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f17428u;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public y f17429u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f17430v;
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public n0 f17431v0;

    /* renamed from: w  reason: collision with root package name */
    private final long f17432w;

    /* renamed from: w0  reason: collision with root package name */
    private int f17433w0;

    /* renamed from: x  reason: collision with root package name */
    private final C2078c f17434x;

    /* renamed from: x0  reason: collision with root package name */
    private int f17435x0;

    /* renamed from: y  reason: collision with root package name */
    private final d f17436y;

    /* renamed from: y0  reason: collision with root package name */
    private long f17437y0;

    /* renamed from: z  reason: collision with root package name */
    private final e f17438z;

    private static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!L.H0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = L.f22072a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    private static final class c {
        public static u1 a(Context context, F f10, boolean z10, String str) {
            s1 u02 = s1.u0(context);
            if (u02 == null) {
                p.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new u1(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z10) {
                f10.q1(u02);
            }
            return new u1(u02.B0(), str);
        }
    }

    private final class d implements C2900D, C2377x, C2704h, C2591b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C1805c.b, C1803a.b, s0.b, ExoPlayer.a {
        private d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void S(C1964E.d dVar) {
            dVar.R(F.this.f17381S);
        }

        public void A(s sVar, m2.l lVar) {
            s unused = F.this.f17384V = sVar;
            F.this.f17422r.A(sVar, lVar);
        }

        public void B(boolean z10) {
            F.this.G2();
        }

        public void D(k kVar) {
            k unused = F.this.f17401g0 = kVar;
            F.this.f17422r.D(kVar);
        }

        public void G(k kVar) {
            F.this.f17422r.G(kVar);
            s unused = F.this.f17384V = null;
            k unused2 = F.this.f17403h0 = null;
        }

        public void I(z zVar) {
            F f10 = F.this;
            y unused = f10.f17429u0 = f10.f17429u0.a().L(zVar).I();
            y S02 = F.this.t1();
            if (!S02.equals(F.this.f17381S)) {
                y unused2 = F.this.f17381S = S02;
                F.this.f17410l.i(14, new H(this));
            }
            F.this.f17410l.i(28, new I(zVar));
            F.this.f17410l.f();
        }

        public void J(k kVar) {
            k unused = F.this.f17403h0 = kVar;
            F.this.f17422r.J(kVar);
        }

        public void K(C2031b bVar) {
            C2031b unused = F.this.f17413m0 = bVar;
            F.this.f17410l.l(27, new G(bVar));
        }

        public void M(k kVar) {
            F.this.f17422r.M(kVar);
            s unused = F.this.f17383U = null;
            k unused2 = F.this.f17401g0 = null;
        }

        public void a(boolean z10) {
            if (F.this.f17411l0 != z10) {
                boolean unused = F.this.f17411l0 = z10;
                F.this.f17410l.l(23, new N(z10));
            }
        }

        public void b(Exception exc) {
            F.this.f17422r.b(exc);
        }

        public void c(String str) {
            F.this.f17422r.c(str);
        }

        public void d(String str, long j10, long j11) {
            F.this.f17422r.d(str, j10, j11);
        }

        public void e(String str) {
            F.this.f17422r.e(str);
        }

        public void f(String str, long j10, long j11) {
            F.this.f17422r.f(str, j10, j11);
        }

        public void g(List list) {
            F.this.f17410l.l(27, new J(list));
        }

        public void h(long j10) {
            F.this.f17422r.h(j10);
        }

        public void i(Exception exc) {
            F.this.f17422r.i(exc);
        }

        public void j(int i10, long j10) {
            F.this.f17422r.j(i10, j10);
        }

        public void k(Object obj, long j10) {
            F.this.f17422r.k(obj, j10);
            if (F.this.f17386X == obj) {
                F.this.f17410l.l(26, new u());
            }
        }

        public void l(Exception exc) {
            F.this.f17422r.l(exc);
        }

        public void m(int i10, long j10, long j11) {
            F.this.f17422r.m(i10, j10, j11);
        }

        public void n(long j10, int i10) {
            F.this.f17422r.n(j10, i10);
        }

        public void o(C2378y.a aVar) {
            F.this.f17422r.o(aVar);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            F.this.x2(surfaceTexture);
            F.this.n2(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            F.this.y2((Object) null);
            F.this.n2(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            F.this.n2(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(P p10) {
            P unused = F.this.f17427t0 = p10;
            F.this.f17410l.l(25, new M(p10));
        }

        public void q(C2378y.a aVar) {
            F.this.f17422r.q(aVar);
        }

        public void r(int i10) {
            C1978m d12 = F.x1(F.this.f17365C);
            if (!d12.equals(F.this.f17425s0)) {
                C1978m unused = F.this.f17425s0 = d12;
                F.this.f17410l.l(29, new K(d12));
            }
        }

        public void s() {
            F.this.C2(false, -1, 3);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            F.this.n2(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (F.this.f17391b0) {
                F.this.y2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (F.this.f17391b0) {
                F.this.y2((Object) null);
            }
            F.this.n2(0, 0);
        }

        public void t(Surface surface) {
            F.this.y2((Object) null);
        }

        public void u(s sVar, m2.l lVar) {
            s unused = F.this.f17383U = sVar;
            F.this.f17422r.u(sVar, lVar);
        }

        public void v(Surface surface) {
            F.this.y2(surface);
        }

        public void w(int i10, boolean z10) {
            F.this.f17410l.l(30, new L(i10, z10));
        }

        public void x(float f10) {
            F.this.t2();
        }

        public void y(int i10) {
            F.this.C2(F.this.u(), i10, F.F1(i10));
        }
    }

    private static final class e implements x2.o, C2935a, o0.b {

        /* renamed from: a  reason: collision with root package name */
        private x2.o f17440a;

        /* renamed from: b  reason: collision with root package name */
        private C2935a f17441b;

        /* renamed from: c  reason: collision with root package name */
        private x2.o f17442c;

        /* renamed from: d  reason: collision with root package name */
        private C2935a f17443d;

        private e() {
        }

        public void a(long j10, float[] fArr) {
            C2935a aVar = this.f17443d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            C2935a aVar2 = this.f17441b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        public void c() {
            C2935a aVar = this.f17443d;
            if (aVar != null) {
                aVar.c();
            }
            C2935a aVar2 = this.f17441b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        public void f(long j10, long j11, s sVar, MediaFormat mediaFormat) {
            x2.o oVar = this.f17442c;
            if (oVar != null) {
                oVar.f(j10, j11, sVar, mediaFormat);
            }
            x2.o oVar2 = this.f17440a;
            if (oVar2 != null) {
                oVar2.f(j10, j11, sVar, mediaFormat);
            }
        }

        public void p(int i10, Object obj) {
            if (i10 == 7) {
                this.f17440a = (x2.o) obj;
            } else if (i10 == 8) {
                this.f17441b = (C2935a) obj;
            } else if (i10 == 10000) {
                l lVar = (l) obj;
                if (lVar == null) {
                    this.f17442c = null;
                    this.f17443d = null;
                    return;
                }
                this.f17442c = lVar.getVideoFrameMetadataListener();
                this.f17443d = lVar.getCameraMotionListener();
            }
        }
    }

    private static final class f implements Z {

        /* renamed from: a  reason: collision with root package name */
        private final Object f17444a;

        /* renamed from: b  reason: collision with root package name */
        private final C2615C f17445b;

        /* renamed from: c  reason: collision with root package name */
        private H f17446c;

        public f(Object obj, C2660z zVar) {
            this.f17444a = obj;
            this.f17445b = zVar;
            this.f17446c = zVar.V();
        }

        public Object a() {
            return this.f17444a;
        }

        public H b() {
            return this.f17446c;
        }

        public void c(H h10) {
            this.f17446c = h10;
        }
    }

    private final class g extends AudioDeviceCallback {
        private g() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (F.this.L1() && F.this.f17431v0.f17767n == 3) {
                F f10 = F.this;
                f10.E2(f10.f17431v0.f17765l, 1, 0);
            }
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!F.this.L1()) {
                F f10 = F.this;
                f10.E2(f10.f17431v0.f17765l, 1, 3);
            }
        }
    }

    static {
        x.a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r44v0, types: [f2.E] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F(androidx.media3.exoplayer.ExoPlayer.b r43, f2.C1964E r44) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            r42.<init>()
            i2.f r9 = new i2.f
            r9.<init>()
            r1.f17394d = r9
            java.lang.String r10 = "ExoPlayerImpl"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r11.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = "Init "
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            int r12 = java.lang.System.identityHashCode(r42)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x01c2 }
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = " ["
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = "AndroidXMedia3/1.4.1"
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = "] ["
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = i2.L.f22076e     // Catch:{ all -> 0x01c2 }
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = "]"
            r11.append(r12)     // Catch:{ all -> 0x01c2 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01c2 }
            i2.p.f(r10, r11)     // Catch:{ all -> 0x01c2 }
            android.content.Context r10 = r0.f17335a     // Catch:{ all -> 0x01c2 }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x01c2 }
            r1.f17396e = r10     // Catch:{ all -> 0x01c2 }
            nb.g r11 = r0.f17343i     // Catch:{ all -> 0x01c2 }
            i2.c r12 = r0.f17336b     // Catch:{ all -> 0x01c2 }
            java.lang.Object r11 = r11.apply(r12)     // Catch:{ all -> 0x01c2 }
            n2.a r11 = (n2.C2280a) r11     // Catch:{ all -> 0x01c2 }
            r1.f17422r = r11     // Catch:{ all -> 0x01c2 }
            int r12 = r0.f17345k     // Catch:{ all -> 0x01c2 }
            r1.f17419p0 = r12     // Catch:{ all -> 0x01c2 }
            f2.c r12 = r0.f17346l     // Catch:{ all -> 0x01c2 }
            r1.f17407j0 = r12     // Catch:{ all -> 0x01c2 }
            int r12 = r0.f17352r     // Catch:{ all -> 0x01c2 }
            r1.f17395d0 = r12     // Catch:{ all -> 0x01c2 }
            int r12 = r0.f17353s     // Catch:{ all -> 0x01c2 }
            r1.f17397e0 = r12     // Catch:{ all -> 0x01c2 }
            boolean r12 = r0.f17350p     // Catch:{ all -> 0x01c2 }
            r1.f17411l0 = r12     // Catch:{ all -> 0x01c2 }
            long r12 = r0.f17327A     // Catch:{ all -> 0x01c2 }
            r1.f17368F = r12     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.F$d r13 = new androidx.media3.exoplayer.F$d     // Catch:{ all -> 0x01c2 }
            r12 = 0
            r13.<init>()     // Catch:{ all -> 0x01c2 }
            r1.f17436y = r13     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.F$e r15 = new androidx.media3.exoplayer.F$e     // Catch:{ all -> 0x01c2 }
            r15.<init>()     // Catch:{ all -> 0x01c2 }
            r1.f17438z = r15     // Catch:{ all -> 0x01c2 }
            android.os.Handler r14 = new android.os.Handler     // Catch:{ all -> 0x01c2 }
            android.os.Looper r5 = r0.f17344j     // Catch:{ all -> 0x01c2 }
            r14.<init>(r5)     // Catch:{ all -> 0x01c2 }
            nb.u r5 = r0.f17338d     // Catch:{ all -> 0x01c2 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01c2 }
            m2.A r5 = (m2.C2189A) r5     // Catch:{ all -> 0x01c2 }
            r33 = r14
            r14 = r5
            r5 = r15
            r15 = r33
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            androidx.media3.exoplayer.q0[] r14 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01c2 }
            r1.f17400g = r14     // Catch:{ all -> 0x01c2 }
            int r15 = r14.length     // Catch:{ all -> 0x01c2 }
            r6 = 0
            if (r15 <= 0) goto L_0x00a9
            r15 = 1
            goto L_0x00aa
        L_0x00a9:
            r15 = r6
        L_0x00aa:
            i2.C2076a.g(r15)     // Catch:{ all -> 0x01c2 }
            nb.u r15 = r0.f17340f     // Catch:{ all -> 0x01c2 }
            java.lang.Object r15 = r15.get()     // Catch:{ all -> 0x01c2 }
            v2.C r15 = (v2.C) r15     // Catch:{ all -> 0x01c2 }
            r1.f17402h = r15     // Catch:{ all -> 0x01c2 }
            nb.u r7 = r0.f17339e     // Catch:{ all -> 0x01c2 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x01c2 }
            t2.C$a r7 = (t2.C2615C.a) r7     // Catch:{ all -> 0x01c2 }
            r1.f17420q = r7     // Catch:{ all -> 0x01c2 }
            nb.u r7 = r0.f17342h     // Catch:{ all -> 0x01c2 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x01c2 }
            w2.d r7 = (w2.C2822d) r7     // Catch:{ all -> 0x01c2 }
            r1.f17426t = r7     // Catch:{ all -> 0x01c2 }
            boolean r8 = r0.f17354t     // Catch:{ all -> 0x01c2 }
            r1.f17418p = r8     // Catch:{ all -> 0x01c2 }
            m2.B r8 = r0.f17355u     // Catch:{ all -> 0x01c2 }
            r1.f17376N = r8     // Catch:{ all -> 0x01c2 }
            r34 = r5
            long r4 = r0.f17356v     // Catch:{ all -> 0x01c2 }
            r1.f17428u = r4     // Catch:{ all -> 0x01c2 }
            long r4 = r0.f17357w     // Catch:{ all -> 0x01c2 }
            r1.f17430v = r4     // Catch:{ all -> 0x01c2 }
            long r4 = r0.f17358x     // Catch:{ all -> 0x01c2 }
            r1.f17432w = r4     // Catch:{ all -> 0x01c2 }
            boolean r4 = r0.f17328B     // Catch:{ all -> 0x01c2 }
            r1.f17379Q = r4     // Catch:{ all -> 0x01c2 }
            android.os.Looper r4 = r0.f17344j     // Catch:{ all -> 0x01c2 }
            r1.f17424s = r4     // Catch:{ all -> 0x01c2 }
            i2.c r5 = r0.f17336b     // Catch:{ all -> 0x01c2 }
            r1.f17434x = r5     // Catch:{ all -> 0x01c2 }
            if (r44 != 0) goto L_0x00f1
            r8 = r1
            goto L_0x00f3
        L_0x00f1:
            r8 = r44
        L_0x00f3:
            r1.f17398f = r8     // Catch:{ all -> 0x01c2 }
            boolean r2 = r0.f17332F     // Catch:{ all -> 0x01c2 }
            r1.f17370H = r2     // Catch:{ all -> 0x01c2 }
            i2.o r3 = new i2.o     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.q r12 = new androidx.media3.exoplayer.q     // Catch:{ all -> 0x01c2 }
            r12.<init>(r1)     // Catch:{ all -> 0x01c2 }
            r3.<init>(r4, r5, r12)     // Catch:{ all -> 0x01c2 }
            r1.f17410l = r3     // Catch:{ all -> 0x01c2 }
            java.util.concurrent.CopyOnWriteArraySet r3 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x01c2 }
            r3.<init>()     // Catch:{ all -> 0x01c2 }
            r1.f17412m = r3     // Catch:{ all -> 0x01c2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01c2 }
            r3.<init>()     // Catch:{ all -> 0x01c2 }
            r1.f17416o = r3     // Catch:{ all -> 0x01c2 }
            t2.b0$a r3 = new t2.b0$a     // Catch:{ all -> 0x01c2 }
            r3.<init>(r6)     // Catch:{ all -> 0x01c2 }
            r1.f17377O = r3     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.ExoPlayer$c r3 = androidx.media3.exoplayer.ExoPlayer.c.f17361b     // Catch:{ all -> 0x01c2 }
            r1.f17378P = r3     // Catch:{ all -> 0x01c2 }
            v2.D r3 = new v2.D     // Catch:{ all -> 0x01c2 }
            int r12 = r14.length     // Catch:{ all -> 0x01c2 }
            m2.z[] r12 = new m2.z[r12]     // Catch:{ all -> 0x01c2 }
            int r6 = r14.length     // Catch:{ all -> 0x01c2 }
            v2.x[] r6 = new v2.x[r6]     // Catch:{ all -> 0x01c2 }
            r19 = r13
            f2.L r13 = f2.L.f19893b     // Catch:{ all -> 0x01c2 }
            r35 = r9
            r9 = 0
            r3.<init>(r12, r6, r13, r9)     // Catch:{ all -> 0x01c2 }
            r1.f17390b = r3     // Catch:{ all -> 0x01c2 }
            f2.H$b r6 = new f2.H$b     // Catch:{ all -> 0x01c2 }
            r6.<init>()     // Catch:{ all -> 0x01c2 }
            r1.f17414n = r6     // Catch:{ all -> 0x01c2 }
            f2.E$b$a r6 = new f2.E$b$a     // Catch:{ all -> 0x01c2 }
            r6.<init>()     // Catch:{ all -> 0x01c2 }
            r9 = 20
            int[] r9 = new int[r9]     // Catch:{ all -> 0x01c2 }
            r9 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32} // fill-array     // Catch:{ all -> 0x01c2 }
            f2.E$b$a r6 = r6.c(r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r15.h()     // Catch:{ all -> 0x01c2 }
            r12 = 29
            f2.E$b$a r6 = r6.d(r12, r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r0.f17351q     // Catch:{ all -> 0x01c2 }
            r13 = 23
            f2.E$b$a r6 = r6.d(r13, r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r0.f17351q     // Catch:{ all -> 0x01c2 }
            r12 = 25
            f2.E$b$a r6 = r6.d(r12, r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r0.f17351q     // Catch:{ all -> 0x01c2 }
            r12 = 33
            f2.E$b$a r6 = r6.d(r12, r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r0.f17351q     // Catch:{ all -> 0x01c2 }
            r12 = 26
            f2.E$b$a r6 = r6.d(r12, r9)     // Catch:{ all -> 0x01c2 }
            boolean r9 = r0.f17351q     // Catch:{ all -> 0x01c2 }
            r12 = 34
            f2.E$b$a r6 = r6.d(r12, r9)     // Catch:{ all -> 0x01c2 }
            f2.E$b r6 = r6.e()     // Catch:{ all -> 0x01c2 }
            r1.f17392c = r6     // Catch:{ all -> 0x01c2 }
            f2.E$b$a r9 = new f2.E$b$a     // Catch:{ all -> 0x01c2 }
            r9.<init>()     // Catch:{ all -> 0x01c2 }
            f2.E$b$a r6 = r9.b(r6)     // Catch:{ all -> 0x01c2 }
            r9 = 4
            f2.E$b$a r6 = r6.a(r9)     // Catch:{ all -> 0x01c2 }
            r12 = 10
            f2.E$b$a r6 = r6.a(r12)     // Catch:{ all -> 0x01c2 }
            f2.E$b r6 = r6.e()     // Catch:{ all -> 0x01c2 }
            r1.f17380R = r6     // Catch:{ all -> 0x01c2 }
            r6 = 0
            i2.l r12 = r5.d(r4, r6)     // Catch:{ all -> 0x01c2 }
            r1.f17404i = r12     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.r r12 = new androidx.media3.exoplayer.r     // Catch:{ all -> 0x01c2 }
            r12.<init>(r1)     // Catch:{ all -> 0x01c2 }
            r1.f17406j = r12     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.n0 r6 = androidx.media3.exoplayer.n0.k(r3)     // Catch:{ all -> 0x01c2 }
            r1.f17431v0 = r6     // Catch:{ all -> 0x01c2 }
            r11.k0(r8, r4)     // Catch:{ all -> 0x01c2 }
            int r6 = i2.L.f22072a     // Catch:{ all -> 0x01c2 }
            r8 = 31
            if (r6 >= r8) goto L_0x01c5
            n2.u1 r8 = new n2.u1     // Catch:{ all -> 0x01c2 }
            java.lang.String r13 = r0.f17333G     // Catch:{ all -> 0x01c2 }
            r8.<init>(r13)     // Catch:{ all -> 0x01c2 }
        L_0x01bf:
            r30 = r8
            goto L_0x01ce
        L_0x01c2:
            r0 = move-exception
            goto L_0x0362
        L_0x01c5:
            boolean r8 = r0.f17329C     // Catch:{ all -> 0x01c2 }
            java.lang.String r13 = r0.f17333G     // Catch:{ all -> 0x01c2 }
            n2.u1 r8 = androidx.media3.exoplayer.F.c.a(r10, r1, r8, r13)     // Catch:{ all -> 0x01c2 }
            goto L_0x01bf
        L_0x01ce:
            androidx.media3.exoplayer.S r8 = new androidx.media3.exoplayer.S     // Catch:{ all -> 0x01c2 }
            nb.u r13 = r0.f17341g     // Catch:{ all -> 0x01c2 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x01c2 }
            r17 = r13
            androidx.media3.exoplayer.T r17 = (androidx.media3.exoplayer.T) r17     // Catch:{ all -> 0x01c2 }
            int r13 = r1.f17371I     // Catch:{ all -> 0x01c2 }
            boolean r9 = r1.f17372J     // Catch:{ all -> 0x01c2 }
            r36 = r2
            m2.B r2 = r1.f17376N     // Catch:{ all -> 0x01c2 }
            r37 = r10
            m2.x r10 = r0.f17359y     // Catch:{ all -> 0x01c2 }
            r28 = r5
            r38 = r6
            long r5 = r0.f17360z     // Catch:{ all -> 0x01c2 }
            r39 = r4
            boolean r4 = r1.f17379Q     // Catch:{ all -> 0x01c2 }
            r25 = r4
            boolean r4 = r0.f17334H     // Catch:{ all -> 0x01c2 }
            r26 = r4
            android.os.Looper r4 = r0.f17330D     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.ExoPlayer$c r0 = r1.f17378P     // Catch:{ all -> 0x01c2 }
            r29 = r12
            r12 = r8
            r18 = r13
            r40 = r19
            r13 = r14
            r14 = r15
            r41 = r15
            r15 = r3
            r16 = r17
            r17 = r7
            r19 = r9
            r20 = r11
            r21 = r2
            r22 = r10
            r23 = r5
            r27 = r39
            r31 = r4
            r32 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x01c2 }
            r1.f17408k = r8     // Catch:{ all -> 0x01c2 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f17409k0 = r0     // Catch:{ all -> 0x01c2 }
            r0 = 0
            r1.f17371I = r0     // Catch:{ all -> 0x01c2 }
            f2.y r0 = f2.y.f20291H     // Catch:{ all -> 0x01c2 }
            r1.f17381S = r0     // Catch:{ all -> 0x01c2 }
            r1.f17382T = r0     // Catch:{ all -> 0x01c2 }
            r1.f17429u0 = r0     // Catch:{ all -> 0x01c2 }
            r0 = -1
            r1.f17433w0 = r0     // Catch:{ all -> 0x01c2 }
            r0 = r38
            r2 = 21
            if (r0 >= r2) goto L_0x023f
            r2 = 0
            int r3 = r1.M1(r2)     // Catch:{ all -> 0x01c2 }
            r1.f17405i0 = r3     // Catch:{ all -> 0x01c2 }
            goto L_0x0246
        L_0x023f:
            r2 = 0
            int r3 = i2.L.I(r37)     // Catch:{ all -> 0x01c2 }
            r1.f17405i0 = r3     // Catch:{ all -> 0x01c2 }
        L_0x0246:
            h2.b r3 = h2.C2031b.f21224c     // Catch:{ all -> 0x01c2 }
            r1.f17413m0 = r3     // Catch:{ all -> 0x01c2 }
            r3 = 1
            r1.f17415n0 = r3     // Catch:{ all -> 0x01c2 }
            r1.e0(r11)     // Catch:{ all -> 0x01c2 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x01c2 }
            r4 = r39
            r3.<init>(r4)     // Catch:{ all -> 0x01c2 }
            r7.c(r3, r11)     // Catch:{ all -> 0x01c2 }
            r3 = r40
            r1.r1(r3)     // Catch:{ all -> 0x01c2 }
            r5 = r43
            long r6 = r5.f17337c     // Catch:{ all -> 0x01c2 }
            r9 = 0
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x026c
            r8.y(r6)     // Catch:{ all -> 0x01c2 }
        L_0x026c:
            androidx.media3.exoplayer.a r6 = new androidx.media3.exoplayer.a     // Catch:{ all -> 0x01c2 }
            android.content.Context r7 = r5.f17335a     // Catch:{ all -> 0x01c2 }
            r8 = r33
            r6.<init>(r7, r8, r3)     // Catch:{ all -> 0x01c2 }
            r1.f17363A = r6     // Catch:{ all -> 0x01c2 }
            boolean r7 = r5.f17349o     // Catch:{ all -> 0x01c2 }
            r6.b(r7)     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.c r6 = new androidx.media3.exoplayer.c     // Catch:{ all -> 0x01c2 }
            android.content.Context r7 = r5.f17335a     // Catch:{ all -> 0x01c2 }
            r6.<init>(r7, r8, r3)     // Catch:{ all -> 0x01c2 }
            r1.f17364B = r6     // Catch:{ all -> 0x01c2 }
            boolean r7 = r5.f17347m     // Catch:{ all -> 0x01c2 }
            if (r7 == 0) goto L_0x028c
            f2.c r12 = r1.f17407j0     // Catch:{ all -> 0x01c2 }
            goto L_0x028d
        L_0x028c:
            r12 = 0
        L_0x028d:
            r6.m(r12)     // Catch:{ all -> 0x01c2 }
            if (r36 == 0) goto L_0x02b1
            r6 = 23
            if (r0 < r6) goto L_0x02b1
            java.lang.String r0 = "audio"
            r6 = r37
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ all -> 0x01c2 }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ all -> 0x01c2 }
            r1.f17369G = r0     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.F$g r6 = new androidx.media3.exoplayer.F$g     // Catch:{ all -> 0x01c2 }
            r7 = 0
            r6.<init>()     // Catch:{ all -> 0x01c2 }
            android.os.Handler r9 = new android.os.Handler     // Catch:{ all -> 0x01c2 }
            r9.<init>(r4)     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.F.b.b(r0, r6, r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x02b2
        L_0x02b1:
            r7 = 0
        L_0x02b2:
            boolean r0 = r5.f17351q     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x02cb
            androidx.media3.exoplayer.s0 r0 = new androidx.media3.exoplayer.s0     // Catch:{ all -> 0x01c2 }
            android.content.Context r4 = r5.f17335a     // Catch:{ all -> 0x01c2 }
            r0.<init>(r4, r8, r3)     // Catch:{ all -> 0x01c2 }
            r1.f17365C = r0     // Catch:{ all -> 0x01c2 }
            f2.c r3 = r1.f17407j0     // Catch:{ all -> 0x01c2 }
            int r3 = r3.f19959c     // Catch:{ all -> 0x01c2 }
            int r3 = i2.L.j0(r3)     // Catch:{ all -> 0x01c2 }
            r0.h(r3)     // Catch:{ all -> 0x01c2 }
            goto L_0x02cd
        L_0x02cb:
            r1.f17365C = r7     // Catch:{ all -> 0x01c2 }
        L_0x02cd:
            androidx.media3.exoplayer.u0 r0 = new androidx.media3.exoplayer.u0     // Catch:{ all -> 0x01c2 }
            android.content.Context r3 = r5.f17335a     // Catch:{ all -> 0x01c2 }
            r0.<init>(r3)     // Catch:{ all -> 0x01c2 }
            r1.f17366D = r0     // Catch:{ all -> 0x01c2 }
            int r3 = r5.f17348n     // Catch:{ all -> 0x01c2 }
            if (r3 == 0) goto L_0x02dc
            r3 = 1
            goto L_0x02dd
        L_0x02dc:
            r3 = r2
        L_0x02dd:
            r0.a(r3)     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.v0 r0 = new androidx.media3.exoplayer.v0     // Catch:{ all -> 0x01c2 }
            android.content.Context r3 = r5.f17335a     // Catch:{ all -> 0x01c2 }
            r0.<init>(r3)     // Catch:{ all -> 0x01c2 }
            r1.f17367E = r0     // Catch:{ all -> 0x01c2 }
            int r3 = r5.f17348n     // Catch:{ all -> 0x01c2 }
            r4 = 2
            if (r3 != r4) goto L_0x02f0
            r6 = 1
            goto L_0x02f1
        L_0x02f0:
            r6 = r2
        L_0x02f1:
            r0.a(r6)     // Catch:{ all -> 0x01c2 }
            androidx.media3.exoplayer.s0 r0 = r1.f17365C     // Catch:{ all -> 0x01c2 }
            f2.m r0 = x1(r0)     // Catch:{ all -> 0x01c2 }
            r1.f17425s0 = r0     // Catch:{ all -> 0x01c2 }
            f2.P r0 = f2.P.f19906e     // Catch:{ all -> 0x01c2 }
            r1.f17427t0 = r0     // Catch:{ all -> 0x01c2 }
            i2.C r0 = i2.C2075C.f22055c     // Catch:{ all -> 0x01c2 }
            r1.f17399f0 = r0     // Catch:{ all -> 0x01c2 }
            f2.c r0 = r1.f17407j0     // Catch:{ all -> 0x01c2 }
            r15 = r41
            r15.l(r0)     // Catch:{ all -> 0x01c2 }
            int r0 = r1.f17405i0     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r2 = 10
            r3 = 1
            r1.r2(r3, r2, r0)     // Catch:{ all -> 0x01c2 }
            int r0 = r1.f17405i0     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r4 = 2
            r1.r2(r4, r2, r0)     // Catch:{ all -> 0x01c2 }
            f2.c r0 = r1.f17407j0     // Catch:{ all -> 0x01c2 }
            r2 = 3
            r1.r2(r3, r2, r0)     // Catch:{ all -> 0x01c2 }
            int r0 = r1.f17395d0     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r2 = 4
            r1.r2(r4, r2, r0)     // Catch:{ all -> 0x01c2 }
            int r0 = r1.f17397e0     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r2 = 5
            r1.r2(r4, r2, r0)     // Catch:{ all -> 0x01c2 }
            boolean r0 = r1.f17411l0     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r2 = 9
            r3 = 1
            r1.r2(r3, r2, r0)     // Catch:{ all -> 0x01c2 }
            r0 = 7
            r2 = r34
            r1.r2(r4, r0, r2)     // Catch:{ all -> 0x01c2 }
            r0 = 6
            r3 = 8
            r1.r2(r0, r3, r2)     // Catch:{ all -> 0x01c2 }
            int r0 = r1.f17419p0     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c2 }
            r2 = 16
            r1.s2(r2, r0)     // Catch:{ all -> 0x01c2 }
            r35.e()
            return
        L_0x0362:
            i2.f r2 = r1.f17394d
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.F.<init>(androidx.media3.exoplayer.ExoPlayer$b, f2.E):void");
    }

    private o0 A1(o0.b bVar) {
        int E12 = E1(this.f17431v0);
        S s10 = this.f17408k;
        H h10 = this.f17431v0.f17754a;
        if (E12 == -1) {
            E12 = 0;
        }
        return new o0(s10, bVar, h10, E12, this.f17434x, s10.G());
    }

    private void A2(C1810h hVar) {
        n0 n0Var = this.f17431v0;
        n0 c10 = n0Var.c(n0Var.f17755b);
        c10.f17770q = c10.f17772s;
        c10.f17771r = 0;
        n0 h10 = c10.h(1);
        if (hVar != null) {
            h10 = h10.f(hVar);
        }
        this.f17373K++;
        this.f17408k.q1();
        D2(h10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private Pair B1(n0 n0Var, n0 n0Var2, boolean z10, int i10, boolean z11, boolean z12) {
        H h10 = n0Var2.f17754a;
        H h11 = n0Var.f17754a;
        if (h11.q() && h10.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (h11.q() != h10.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (!h10.n(h10.h(n0Var2.f17755b.f25960a, this.f17414n).f19746c, this.f19971a).f19767a.equals(h11.n(h11.h(n0Var.f17755b.f25960a, this.f17414n).f19746c, this.f19971a).f19767a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair(Boolean.TRUE, Integer.valueOf(i11));
        } else if (z10 && i10 == 0 && n0Var2.f17755b.f25963d < n0Var.f17755b.f25963d) {
            return new Pair(Boolean.TRUE, 0);
        } else {
            if (!z10 || i10 != 1 || !z12) {
                return new Pair(Boolean.FALSE, -1);
            }
            return new Pair(Boolean.TRUE, 2);
        }
    }

    private void B2() {
        C1964E.b bVar = this.f17380R;
        C1964E.b M10 = L.M(this.f17398f, this.f17392c);
        this.f17380R = M10;
        if (!M10.equals(bVar)) {
            this.f17410l.i(13, new C1823v(this));
        }
    }

    private long C1(n0 n0Var) {
        if (!n0Var.f17755b.b()) {
            return L.h1(D1(n0Var));
        }
        n0Var.f17754a.h(n0Var.f17755b.f25960a, this.f17414n);
        if (n0Var.f17756c == -9223372036854775807L) {
            return n0Var.f17754a.n(E1(n0Var), this.f19971a).b();
        }
        return this.f17414n.m() + L.h1(n0Var.f17756c);
    }

    /* access modifiers changed from: private */
    public void C2(boolean z10, int i10, int i11) {
        boolean z11;
        if (!z10 || i10 == -1) {
            z11 = false;
        } else {
            z11 = true;
        }
        int w12 = w1(z11, i10);
        n0 n0Var = this.f17431v0;
        if (n0Var.f17765l != z11 || n0Var.f17767n != w12 || n0Var.f17766m != i11) {
            E2(z11, i11, w12);
        }
    }

    private long D1(n0 n0Var) {
        long j10;
        if (n0Var.f17754a.q()) {
            return L.L0(this.f17437y0);
        }
        if (n0Var.f17769p) {
            j10 = n0Var.m();
        } else {
            j10 = n0Var.f17772s;
        }
        if (n0Var.f17755b.b()) {
            return j10;
        }
        return o2(n0Var.f17754a, n0Var.f17755b, j10);
    }

    private void D2(n0 n0Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        n0 n0Var2 = n0Var;
        int i13 = i11;
        n0 n0Var3 = this.f17431v0;
        this.f17431v0 = n0Var2;
        boolean equals = n0Var3.f17754a.equals(n0Var2.f17754a);
        Pair B12 = B1(n0Var, n0Var3, z10, i11, !equals, z11);
        boolean booleanValue = ((Boolean) B12.first).booleanValue();
        int intValue = ((Integer) B12.second).intValue();
        w wVar = null;
        if (booleanValue) {
            if (!n0Var2.f17754a.q()) {
                wVar = n0Var2.f17754a.n(n0Var2.f17754a.h(n0Var2.f17755b.f25960a, this.f17414n).f19746c, this.f19971a).f19769c;
            }
            this.f17429u0 = y.f20291H;
        }
        if (booleanValue || !n0Var3.f17763j.equals(n0Var2.f17763j)) {
            this.f17429u0 = this.f17429u0.a().M(n0Var2.f17763j).I();
        }
        y t12 = t1();
        boolean equals2 = t12.equals(this.f17381S);
        this.f17381S = t12;
        if (n0Var3.f17765l != n0Var2.f17765l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (n0Var3.f17758e != n0Var2.f17758e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            G2();
        }
        boolean z15 = n0Var3.f17760g;
        boolean z16 = n0Var2.f17760g;
        if (z15 != z16) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            F2(z16);
        }
        if (!equals) {
            this.f17410l.i(0, new C1811i(n0Var2, i10));
        }
        if (z10) {
            this.f17410l.i(11, new A(i13, I1(i13, n0Var3, i12), H1(j10)));
        }
        if (booleanValue) {
            this.f17410l.i(1, new B(wVar, intValue));
        }
        if (n0Var3.f17759f != n0Var2.f17759f) {
            this.f17410l.i(10, new C(n0Var2));
            if (n0Var2.f17759f != null) {
                this.f17410l.i(10, new D(n0Var2));
            }
        }
        D d10 = n0Var3.f17762i;
        D d11 = n0Var2.f17762i;
        if (d10 != d11) {
            this.f17402h.i(d11.f26969e);
            this.f17410l.i(2, new E(n0Var2));
        }
        if (!equals2) {
            this.f17410l.i(14, new C1812j(this.f17381S));
        }
        if (z14) {
            this.f17410l.i(3, new C1813k(n0Var2));
        }
        if (z13 || z12) {
            this.f17410l.i(-1, new C1814l(n0Var2));
        }
        if (z13) {
            this.f17410l.i(4, new C1815m(n0Var2));
        }
        if (z12 || n0Var3.f17766m != n0Var2.f17766m) {
            this.f17410l.i(5, new C1821t(n0Var2));
        }
        if (n0Var3.f17767n != n0Var2.f17767n) {
            this.f17410l.i(6, new C1825x(n0Var2));
        }
        if (n0Var3.n() != n0Var.n()) {
            this.f17410l.i(7, new C1826y(n0Var2));
        }
        if (!n0Var3.f17768o.equals(n0Var2.f17768o)) {
            this.f17410l.i(12, new C1827z(n0Var2));
        }
        B2();
        this.f17410l.f();
        if (n0Var3.f17769p != n0Var2.f17769p) {
            Iterator it = this.f17412m.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.a) it.next()).B(n0Var2.f17769p);
            }
        }
    }

    private int E1(n0 n0Var) {
        if (n0Var.f17754a.q()) {
            return this.f17433w0;
        }
        return n0Var.f17754a.h(n0Var.f17755b.f25960a, this.f17414n).f19746c;
    }

    /* access modifiers changed from: private */
    public void E2(boolean z10, int i10, int i11) {
        this.f17373K++;
        n0 n0Var = this.f17431v0;
        if (n0Var.f17769p) {
            n0Var = n0Var.a();
        }
        n0 e10 = n0Var.e(z10, i10, i11);
        this.f17408k.Y0(z10, i10, i11);
        D2(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* access modifiers changed from: private */
    public static int F1(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    private void F2(boolean z10) {
    }

    /* access modifiers changed from: private */
    public void G2() {
        int k10 = k();
        boolean z10 = true;
        if (k10 != 1) {
            if (k10 == 2 || k10 == 3) {
                boolean N12 = N1();
                u0 u0Var = this.f17366D;
                if (!u() || N12) {
                    z10 = false;
                }
                u0Var.b(z10);
                this.f17367E.b(u());
                return;
            } else if (k10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f17366D.b(false);
        this.f17367E.b(false);
    }

    private C1964E.e H1(long j10) {
        int i10;
        Object obj;
        w wVar;
        Object obj2;
        long j11;
        int B10 = B();
        if (!this.f17431v0.f17754a.q()) {
            n0 n0Var = this.f17431v0;
            Object obj3 = n0Var.f17755b.f25960a;
            n0Var.f17754a.h(obj3, this.f17414n);
            int b10 = this.f17431v0.f17754a.b(obj3);
            i10 = b10;
            obj = obj3;
            obj2 = this.f17431v0.f17754a.n(B10, this.f19971a).f19767a;
            wVar = this.f19971a.f19769c;
        } else {
            wVar = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        }
        long h12 = L.h1(j10);
        if (this.f17431v0.f17755b.b()) {
            j11 = L.h1(J1(this.f17431v0));
        } else {
            j11 = h12;
        }
        C2615C.b bVar = this.f17431v0.f17755b;
        return new C1964E.e(obj2, B10, wVar, obj, i10, h12, j11, bVar.f25961b, bVar.f25962c);
    }

    private void H2() {
        IllegalStateException illegalStateException;
        this.f17394d.b();
        if (Thread.currentThread() != M().getThread()) {
            String F10 = L.F("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), M().getThread().getName());
            if (!this.f17415n0) {
                if (this.f17417o0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                p.i("ExoPlayerImpl", F10, illegalStateException);
                this.f17417o0 = true;
                return;
            }
            throw new IllegalStateException(F10);
        }
    }

    private C1964E.e I1(int i10, n0 n0Var, int i11) {
        int i12;
        Object obj;
        w wVar;
        int i13;
        Object obj2;
        long j10;
        long j11;
        n0 n0Var2 = n0Var;
        H.b bVar = new H.b();
        if (!n0Var2.f17754a.q()) {
            Object obj3 = n0Var2.f17755b.f25960a;
            n0Var2.f17754a.h(obj3, bVar);
            int i14 = bVar.f19746c;
            int b10 = n0Var2.f17754a.b(obj3);
            Object obj4 = n0Var2.f17754a.n(i14, this.f19971a).f19767a;
            wVar = this.f19971a.f19769c;
            obj = obj3;
            i12 = b10;
            obj2 = obj4;
            i13 = i14;
        } else {
            i13 = i11;
            obj2 = null;
            wVar = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            if (n0Var2.f17755b.b()) {
                C2615C.b bVar2 = n0Var2.f17755b;
                j11 = bVar.b(bVar2.f25961b, bVar2.f25962c);
                j10 = J1(n0Var);
                long h12 = L.h1(j11);
                long h13 = L.h1(j10);
                C2615C.b bVar3 = n0Var2.f17755b;
                return new C1964E.e(obj2, i13, wVar, obj, i12, h12, h13, bVar3.f25961b, bVar3.f25962c);
            } else if (n0Var2.f17755b.f25964e != -1) {
                j11 = J1(this.f17431v0);
            } else {
                j11 = bVar.f19748e + bVar.f19747d;
            }
        } else if (n0Var2.f17755b.b()) {
            j11 = n0Var2.f17772s;
            j10 = J1(n0Var);
            long h122 = L.h1(j11);
            long h132 = L.h1(j10);
            C2615C.b bVar32 = n0Var2.f17755b;
            return new C1964E.e(obj2, i13, wVar, obj, i12, h122, h132, bVar32.f25961b, bVar32.f25962c);
        } else {
            j11 = bVar.f19748e + n0Var2.f17772s;
        }
        j10 = j11;
        long h1222 = L.h1(j11);
        long h1322 = L.h1(j10);
        C2615C.b bVar322 = n0Var2.f17755b;
        return new C1964E.e(obj2, i13, wVar, obj, i12, h1222, h1322, bVar322.f25961b, bVar322.f25962c);
    }

    private static long J1(n0 n0Var) {
        H.c cVar = new H.c();
        H.b bVar = new H.b();
        n0Var.f17754a.h(n0Var.f17755b.f25960a, bVar);
        if (n0Var.f17756c == -9223372036854775807L) {
            return n0Var.f17754a.n(bVar.f19746c, cVar).c();
        }
        return bVar.n() + n0Var.f17756c;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public void Q1(S.e eVar) {
        long j10;
        boolean z10;
        int i10 = this.f17373K - eVar.f17522c;
        this.f17373K = i10;
        boolean z11 = true;
        if (eVar.f17523d) {
            this.f17374L = eVar.f17524e;
            this.f17375M = true;
        }
        if (i10 == 0) {
            H h10 = eVar.f17521b.f17754a;
            if (!this.f17431v0.f17754a.q() && h10.q()) {
                this.f17433w0 = -1;
                this.f17437y0 = 0;
                this.f17435x0 = 0;
            }
            if (!h10.q()) {
                List F10 = ((p0) h10).F();
                if (F10.size() == this.f17416o.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C2076a.g(z10);
                for (int i11 = 0; i11 < F10.size(); i11++) {
                    ((f) this.f17416o.get(i11)).c((H) F10.get(i11));
                }
            }
            long j11 = -9223372036854775807L;
            if (this.f17375M) {
                if (eVar.f17521b.f17755b.equals(this.f17431v0.f17755b) && eVar.f17521b.f17757d == this.f17431v0.f17772s) {
                    z11 = false;
                }
                if (z11) {
                    if (h10.q() || eVar.f17521b.f17755b.b()) {
                        j10 = eVar.f17521b.f17757d;
                    } else {
                        n0 n0Var = eVar.f17521b;
                        j10 = o2(h10, n0Var.f17755b, n0Var.f17757d);
                    }
                    j11 = j10;
                }
            } else {
                z11 = false;
            }
            this.f17375M = false;
            D2(eVar.f17521b, 1, z11, this.f17374L, j11, -1, false);
        }
    }

    /* access modifiers changed from: private */
    public boolean L1() {
        AudioManager audioManager = this.f17369G;
        if (audioManager == null || L.f22072a < 23) {
            return true;
        }
        return b.a(this.f17396e, audioManager.getDevices(2));
    }

    private int M1(int i10) {
        AudioTrack audioTrack = this.f17385W;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.f17385W.release();
            this.f17385W = null;
        }
        if (this.f17385W == null) {
            this.f17385W = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f17385W.getAudioSessionId();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P1(C1964E.d dVar, r rVar) {
        dVar.h0(this.f17398f, new C1964E.c(rVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R1(S.e eVar) {
        this.f17404i.f(new C1820s(this, eVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W1(C1964E.d dVar) {
        dVar.n0(this.f17380R);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y1(int i10, C1964E.e eVar, C1964E.e eVar2, C1964E.d dVar) {
        dVar.E(i10);
        dVar.U(eVar, eVar2, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e2(n0 n0Var, C1964E.d dVar) {
        dVar.t(n0Var.f17760g);
        dVar.F(n0Var.f17760g);
    }

    private n0 l2(n0 n0Var, H h10, Pair pair) {
        boolean z10;
        C2615C.b bVar;
        j0 j0Var;
        D d10;
        List list;
        int i10;
        long j10;
        H h11 = h10;
        Pair pair2 = pair;
        if (h10.q() || pair2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        H h12 = n0Var.f17754a;
        long C12 = C1(n0Var);
        n0 j11 = n0Var.j(h10);
        if (h10.q()) {
            C2615C.b l10 = n0.l();
            long L02 = L.L0(this.f17437y0);
            n0 c10 = j11.d(l10, L02, L02, L02, 0, j0.f26269d, this.f17390b, C4770v.E()).c(l10);
            c10.f17770q = c10.f17772s;
            return c10;
        }
        Object obj = j11.f17755b.f25960a;
        boolean equals = obj.equals(((Pair) L.h(pair)).first);
        if (!equals) {
            bVar = new C2615C.b(pair2.first);
        } else {
            bVar = j11.f17755b;
        }
        C2615C.b bVar2 = bVar;
        long longValue = ((Long) pair2.second).longValue();
        long L03 = L.L0(C12);
        if (!h12.q()) {
            L03 -= h12.h(obj, this.f17414n).n();
        }
        if (!equals || longValue < L03) {
            long j12 = longValue;
            C2615C.b bVar3 = bVar2;
            C2076a.g(!bVar3.b());
            if (!equals) {
                j0Var = j0.f26269d;
            } else {
                j0Var = j11.f17761h;
            }
            j0 j0Var2 = j0Var;
            C2615C.b bVar4 = bVar3;
            if (!equals) {
                d10 = this.f17390b;
            } else {
                d10 = j11.f17762i;
            }
            D d11 = d10;
            if (!equals) {
                list = C4770v.E();
            } else {
                list = j11.f17763j;
            }
            n0 c11 = j11.d(bVar4, j12, j12, j12, 0, j0Var2, d11, list).c(bVar4);
            c11.f17770q = j12;
            return c11;
        }
        if (i10 == 0) {
            int b10 = h11.b(j11.f17764k.f25960a);
            if (b10 == -1 || h11.f(b10, this.f17414n).f19746c != h11.h(bVar2.f25960a, this.f17414n).f19746c) {
                h11.h(bVar2.f25960a, this.f17414n);
                if (bVar2.b()) {
                    j10 = this.f17414n.b(bVar2.f25961b, bVar2.f25962c);
                } else {
                    j10 = this.f17414n.f19747d;
                }
                j11 = j11.d(bVar2, j11.f17772s, j11.f17772s, j11.f17757d, j10 - j11.f17772s, j11.f17761h, j11.f17762i, j11.f17763j).c(bVar2);
                j11.f17770q = j10;
            }
        } else {
            C2615C.b bVar5 = bVar2;
            C2076a.g(!bVar5.b());
            long max = Math.max(0, j11.f17771r - (longValue - L03));
            long j13 = j11.f17770q;
            if (j11.f17764k.equals(j11.f17755b)) {
                j13 = longValue + max;
            }
            j11 = j11.d(bVar5, longValue, longValue, longValue, max, j11.f17761h, j11.f17762i, j11.f17763j);
            j11.f17770q = j13;
        }
        return j11;
    }

    private Pair m2(H h10, int i10, long j10) {
        if (h10.q()) {
            this.f17433w0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f17437y0 = j10;
            this.f17435x0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= h10.p()) {
            i10 = h10.a(this.f17372J);
            j10 = h10.n(i10, this.f19971a).b();
        }
        return h10.j(this.f19971a, this.f17414n, i10, L.L0(j10));
    }

    /* access modifiers changed from: private */
    public void n2(int i10, int i11) {
        if (i10 != this.f17399f0.b() || i11 != this.f17399f0.a()) {
            this.f17399f0 = new C2075C(i10, i11);
            this.f17410l.l(24, new C1816n(i10, i11));
            r2(2, 14, new C2075C(i10, i11));
        }
    }

    private long o2(H h10, C2615C.b bVar, long j10) {
        h10.h(bVar.f25960a, this.f17414n);
        return j10 + this.f17414n.n();
    }

    private void p2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f17416o.remove(i12);
        }
        this.f17377O = this.f17377O.b(i10, i11);
    }

    private void q2() {
        if (this.f17389a0 != null) {
            A1(this.f17438z).n(10000).m((Object) null).l();
            this.f17389a0.i(this.f17436y);
            this.f17389a0 = null;
        }
        TextureView textureView = this.f17393c0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f17436y) {
                p.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f17393c0.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f17393c0 = null;
        }
        SurfaceHolder surfaceHolder = this.f17388Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f17436y);
            this.f17388Z = null;
        }
    }

    private void r2(int i10, int i11, Object obj) {
        for (q0 q0Var : this.f17400g) {
            if (i10 == -1 || q0Var.e() == i10) {
                A1(q0Var).n(i11).m(obj).l();
            }
        }
    }

    private List s1(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            m0.c cVar = new m0.c((C2615C) list.get(i11), this.f17418p);
            arrayList.add(cVar);
            this.f17416o.add(i11 + i10, new f(cVar.f17747b, cVar.f17746a));
        }
        this.f17377O = this.f17377O.h(i10, arrayList.size());
        return arrayList;
    }

    private void s2(int i10, Object obj) {
        r2(-1, i10, obj);
    }

    /* access modifiers changed from: private */
    public y t1() {
        H s10 = s();
        if (s10.q()) {
            return this.f17429u0;
        }
        return this.f17429u0.a().K(s10.n(B(), this.f19971a).f19769c.f20160e).I();
    }

    /* access modifiers changed from: private */
    public void t2() {
        r2(1, 2, Float.valueOf(this.f17409k0 * this.f17364B.g()));
    }

    private void v2(List list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int E12 = E1(this.f17431v0);
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.f17373K++;
        if (!this.f17416o.isEmpty()) {
            p2(0, this.f17416o.size());
        }
        List s12 = s1(0, list);
        H y12 = y1();
        if (y12.q() || i12 < y12.p()) {
            long j12 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = y12.a(this.f17372J);
            } else if (i12 == -1) {
                i11 = E12;
                j11 = currentPosition;
            } else {
                i11 = i12;
                j11 = j12;
            }
            n0 l22 = l2(this.f17431v0, y12, m2(y12, i11, j11));
            int i13 = l22.f17758e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (y12.q() || i11 >= y12.p()) ? 4 : 2;
            }
            n0 h10 = l22.h(i13);
            this.f17408k.V0(s12, i11, L.L0(j11), this.f17377O);
            if (this.f17431v0.f17755b.f25960a.equals(h10.f17755b.f25960a) || this.f17431v0.f17754a.q()) {
                z11 = false;
            }
            D2(h10, 0, z11, 4, D1(h10), -1, false);
            return;
        }
        throw new f2.u(y12, i12, j10);
    }

    private int w1(boolean z10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (!this.f17370H) {
            return 0;
        }
        if (z10 && !L1()) {
            return 3;
        }
        if (z10 || this.f17431v0.f17767n != 3) {
            return 0;
        }
        return 3;
    }

    private void w2(SurfaceHolder surfaceHolder) {
        this.f17391b0 = false;
        this.f17388Z = surfaceHolder;
        surfaceHolder.addCallback(this.f17436y);
        Surface surface = this.f17388Z.getSurface();
        if (surface == null || !surface.isValid()) {
            n2(0, 0);
            return;
        }
        Rect surfaceFrame = this.f17388Z.getSurfaceFrame();
        n2(surfaceFrame.width(), surfaceFrame.height());
    }

    /* access modifiers changed from: private */
    public static C1978m x1(s0 s0Var) {
        int i10;
        int i11 = 0;
        C1978m.b bVar = new C1978m.b(0);
        if (s0Var != null) {
            i10 = s0Var.d();
        } else {
            i10 = 0;
        }
        C1978m.b g10 = bVar.g(i10);
        if (s0Var != null) {
            i11 = s0Var.c();
        }
        return g10.f(i11).e();
    }

    /* access modifiers changed from: private */
    public void x2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        y2(surface);
        this.f17387Y = surface;
    }

    private H y1() {
        return new p0(this.f17416o, this.f17377O);
    }

    /* access modifiers changed from: private */
    public void y2(Object obj) {
        ArrayList<o0> arrayList = new ArrayList<>();
        boolean z10 = false;
        for (q0 q0Var : this.f17400g) {
            if (q0Var.e() == 2) {
                arrayList.add(A1(q0Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f17386X;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                for (o0 a10 : arrayList) {
                    a10.a(this.f17368F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.f17386X;
            Surface surface = this.f17387Y;
            if (obj3 == surface) {
                surface.release();
                this.f17387Y = null;
            }
        }
        this.f17386X = obj;
        if (z10) {
            A2(C1810h.d(new v(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    private List z1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f17420q.d((w) list.get(i10)));
        }
        return arrayList;
    }

    public int B() {
        H2();
        int E12 = E1(this.f17431v0);
        if (E12 == -1) {
            return 0;
        }
        return E12;
    }

    public void C(int i10) {
        H2();
        if (this.f17371I != i10) {
            this.f17371I = i10;
            this.f17408k.d1(i10);
            this.f17410l.i(8, new C1818p(i10));
            B2();
            this.f17410l.f();
        }
    }

    public boolean D() {
        H2();
        return this.f17372J;
    }

    public void F(C1964E.d dVar) {
        H2();
        this.f17410l.k((C1964E.d) C2076a.e(dVar));
    }

    /* renamed from: G1 */
    public C1810h i() {
        H2();
        return this.f17431v0.f17759f;
    }

    public void H(List list, boolean z10) {
        H2();
        u2(z1(list), z10);
    }

    public void I(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        H2();
        if (surfaceView instanceof n) {
            q2();
            y2(surfaceView);
            w2(surfaceView.getHolder());
        } else if (surfaceView instanceof l) {
            q2();
            this.f17389a0 = (l) surfaceView;
            A1(this.f17438z).n(10000).m(this.f17389a0).l();
            this.f17389a0.d(this.f17436y);
            y2(this.f17389a0.getVideoSurface());
            w2(surfaceView.getHolder());
        } else {
            if (surfaceView == null) {
                surfaceHolder = null;
            } else {
                surfaceHolder = surfaceView.getHolder();
            }
            z2(surfaceHolder);
        }
    }

    public void K(boolean z10) {
        H2();
        int p10 = this.f17364B.p(z10, k());
        C2(z10, p10, F1(p10));
    }

    public Looper M() {
        return this.f17424s;
    }

    public K N() {
        H2();
        return this.f17402h.b();
    }

    public boolean N1() {
        H2();
        return this.f17431v0.f17769p;
    }

    public void P(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        H2();
        if (textureView == null) {
            u1();
            return;
        }
        q2();
        this.f17393c0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            p.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f17436y);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            y2((Object) null);
            n2(0, 0);
            return;
        }
        x2(surfaceTexture);
        n2(textureView.getWidth(), textureView.getHeight());
    }

    public C1964E.b Q() {
        H2();
        return this.f17380R;
    }

    public void R(boolean z10) {
        H2();
        if (this.f17372J != z10) {
            this.f17372J = z10;
            this.f17408k.g1(z10);
            this.f17410l.i(9, new C1822u(z10));
            B2();
            this.f17410l.f();
        }
    }

    public long S() {
        H2();
        return this.f17432w;
    }

    public void U(TextureView textureView) {
        H2();
        if (textureView != null && textureView == this.f17393c0) {
            u1();
        }
    }

    public P V() {
        H2();
        return this.f17427t0;
    }

    public long X() {
        H2();
        return this.f17430v;
    }

    public void Y(K k10) {
        H2();
        if (this.f17402h.h() && !k10.equals(this.f17402h.b())) {
            this.f17402h.m(k10);
            this.f17410l.l(19, new C1824w(k10));
        }
    }

    public void Z(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        H2();
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        v1(surfaceHolder);
    }

    public long a0() {
        H2();
        if (this.f17431v0.f17754a.q()) {
            return this.f17437y0;
        }
        n0 n0Var = this.f17431v0;
        if (n0Var.f17764k.f25963d != n0Var.f17755b.f25963d) {
            return n0Var.f17754a.n(B(), this.f19971a).d();
        }
        long j10 = n0Var.f17770q;
        if (this.f17431v0.f17764k.b()) {
            n0 n0Var2 = this.f17431v0;
            H.b h10 = n0Var2.f17754a.h(n0Var2.f17764k.f25960a, this.f17414n);
            long f10 = h10.f(this.f17431v0.f17764k.f25961b);
            if (f10 == Long.MIN_VALUE) {
                j10 = h10.f19747d;
            } else {
                j10 = f10;
            }
        }
        n0 n0Var3 = this.f17431v0;
        return L.h1(o2(n0Var3.f17754a, n0Var3.f17764k, j10));
    }

    public C1963D c() {
        H2();
        return this.f17431v0.f17768o;
    }

    public y d0() {
        H2();
        return this.f17381S;
    }

    public void e0(C1964E.d dVar) {
        this.f17410l.c((C1964E.d) C2076a.e(dVar));
    }

    public void f(C1963D d10) {
        H2();
        if (d10 == null) {
            d10 = C1963D.f19706d;
        }
        if (!this.f17431v0.f17768o.equals(d10)) {
            n0 g10 = this.f17431v0.g(d10);
            this.f17373K++;
            this.f17408k.a1(d10);
            D2(g10, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public long f0() {
        H2();
        return this.f17428u;
    }

    public boolean g() {
        H2();
        return this.f17431v0.f17755b.b();
    }

    public long getCurrentPosition() {
        H2();
        return L.h1(D1(this.f17431v0));
    }

    public long getDuration() {
        H2();
        if (!g()) {
            return T();
        }
        n0 n0Var = this.f17431v0;
        C2615C.b bVar = n0Var.f17755b;
        n0Var.f17754a.h(bVar.f25960a, this.f17414n);
        return L.h1(this.f17414n.b(bVar.f25961b, bVar.f25962c));
    }

    public long h() {
        H2();
        return L.h1(this.f17431v0.f17771r);
    }

    public void h0(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        H2();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.a(z11);
            H h10 = this.f17431v0.f17754a;
            if (h10.q() || i10 < h10.p()) {
                this.f17422r.x();
                this.f17373K++;
                if (g()) {
                    p.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    S.e eVar = new S.e(this.f17431v0);
                    eVar.b(1);
                    this.f17406j.a(eVar);
                    return;
                }
                n0 n0Var = this.f17431v0;
                int i12 = n0Var.f17758e;
                if (i12 == 3 || (i12 == 4 && !h10.q())) {
                    n0Var = this.f17431v0.h(2);
                }
                int B10 = B();
                n0 l22 = l2(n0Var, h10, m2(h10, i10, j10));
                this.f17408k.I0(h10, i10, L.L0(j10));
                D2(l22, 0, true, 1, D1(l22), B10, z10);
            }
        }
    }

    public void j() {
        H2();
        boolean u10 = u();
        int i10 = 2;
        int p10 = this.f17364B.p(u10, 2);
        C2(u10, p10, F1(p10));
        n0 n0Var = this.f17431v0;
        if (n0Var.f17758e == 1) {
            n0 f10 = n0Var.f((C1810h) null);
            if (f10.f17754a.q()) {
                i10 = 4;
            }
            n0 h10 = f10.h(i10);
            this.f17373K++;
            this.f17408k.p0();
            D2(h10, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public int k() {
        H2();
        return this.f17431v0.f17758e;
    }

    public f2.L m() {
        H2();
        return this.f17431v0.f17762i.f26968d;
    }

    public int n() {
        H2();
        return this.f17371I;
    }

    public int p() {
        H2();
        if (g()) {
            return this.f17431v0.f17755b.f25961b;
        }
        return -1;
    }

    public void q1(C2282b bVar) {
        this.f17422r.o0((C2282b) C2076a.e(bVar));
    }

    public int r() {
        H2();
        return this.f17431v0.f17767n;
    }

    public void r1(ExoPlayer.a aVar) {
        this.f17412m.add(aVar);
    }

    public void release() {
        AudioTrack audioTrack;
        p.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "AndroidXMedia3/1.4.1" + "] [" + L.f22076e + "] [" + x.b() + "]");
        H2();
        if (L.f22072a < 21 && (audioTrack = this.f17385W) != null) {
            audioTrack.release();
            this.f17385W = null;
        }
        this.f17363A.b(false);
        s0 s0Var = this.f17365C;
        if (s0Var != null) {
            s0Var.g();
        }
        this.f17366D.b(false);
        this.f17367E.b(false);
        this.f17364B.i();
        if (!this.f17408k.r0()) {
            this.f17410l.l(10, new C1817o());
        }
        this.f17410l.j();
        this.f17404i.d((Object) null);
        this.f17426t.d(this.f17422r);
        n0 n0Var = this.f17431v0;
        if (n0Var.f17769p) {
            this.f17431v0 = n0Var.a();
        }
        n0 h10 = this.f17431v0.h(1);
        this.f17431v0 = h10;
        n0 c10 = h10.c(h10.f17755b);
        this.f17431v0 = c10;
        c10.f17770q = c10.f17772s;
        this.f17431v0.f17771r = 0;
        this.f17422r.release();
        this.f17402h.j();
        q2();
        Surface surface = this.f17387Y;
        if (surface != null) {
            surface.release();
            this.f17387Y = null;
        }
        if (!this.f17421q0) {
            this.f17413m0 = C2031b.f21224c;
            this.f17423r0 = true;
            return;
        }
        android.support.v4.media.session.c.a(C2076a.e((Object) null));
        throw null;
    }

    public H s() {
        H2();
        return this.f17431v0.f17754a;
    }

    public void setImageOutput(ImageOutput imageOutput) {
        H2();
        r2(4, 15, imageOutput);
    }

    public boolean u() {
        H2();
        return this.f17431v0.f17765l;
    }

    public void u1() {
        H2();
        q2();
        y2((Object) null);
        n2(0, 0);
    }

    public void u2(List list, boolean z10) {
        H2();
        v2(list, -1, -9223372036854775807L, z10);
    }

    public int v() {
        H2();
        if (this.f17431v0.f17754a.q()) {
            return this.f17435x0;
        }
        n0 n0Var = this.f17431v0;
        return n0Var.f17754a.b(n0Var.f17755b.f25960a);
    }

    public void v1(SurfaceHolder surfaceHolder) {
        H2();
        if (surfaceHolder != null && surfaceHolder == this.f17388Z) {
            u1();
        }
    }

    public int x() {
        H2();
        if (g()) {
            return this.f17431v0.f17755b.f25962c;
        }
        return -1;
    }

    public long z() {
        H2();
        return C1(this.f17431v0);
    }

    public void z2(SurfaceHolder surfaceHolder) {
        H2();
        if (surfaceHolder == null) {
            u1();
            return;
        }
        q2();
        this.f17391b0 = true;
        this.f17388Z = surfaceHolder;
        surfaceHolder.addCallback(this.f17436y);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            y2((Object) null);
            n2(0, 0);
            return;
        }
        y2(surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        n2(surfaceFrame.width(), surfaceFrame.height());
    }
}
