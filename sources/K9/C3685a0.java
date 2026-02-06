package k9;

import N9.C3070t;
import N9.O;
import N9.V;
import W9.n;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.C4770v;
import ga.A;
import ga.B;
import ia.C3607e;
import ja.C3645a;
import ja.C3648d;
import ja.C3651g;
import ja.C3656l;
import ja.M;
import ja.o;
import ja.r;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k9.C3686b;
import k9.C3690d;
import k9.C3709m0;
import k9.K0;
import k9.T0;
import k9.W0;
import k9.i1;
import k9.n1;
import ka.j;
import ka.w;
import ka.y;
import l9.C3747a;
import l9.C3748b;
import l9.q0;
import l9.s0;
import la.l;
import m9.C3847e;
import n9.C3869e;
import n9.C3873i;

/* renamed from: k9.a0  reason: case insensitive filesystem */
final class C3685a0 extends C3692e implements T0 {

    /* renamed from: A  reason: collision with root package name */
    private final C3690d f45429A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final i1 f45430B;

    /* renamed from: C  reason: collision with root package name */
    private final t1 f45431C;

    /* renamed from: D  reason: collision with root package name */
    private final u1 f45432D;

    /* renamed from: E  reason: collision with root package name */
    private final long f45433E;

    /* renamed from: F  reason: collision with root package name */
    private int f45434F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f45435G;

    /* renamed from: H  reason: collision with root package name */
    private int f45436H;

    /* renamed from: I  reason: collision with root package name */
    private int f45437I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f45438J;

    /* renamed from: K  reason: collision with root package name */
    private int f45439K;

    /* renamed from: L  reason: collision with root package name */
    private e1 f45440L;

    /* renamed from: M  reason: collision with root package name */
    private O f45441M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f45442N;

    /* renamed from: O  reason: collision with root package name */
    private T0.b f45443O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public D0 f45444P;

    /* renamed from: Q  reason: collision with root package name */
    private D0 f45445Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public C3717q0 f45446R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public C3717q0 f45447S;

    /* renamed from: T  reason: collision with root package name */
    private AudioTrack f45448T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public Object f45449U;

    /* renamed from: V  reason: collision with root package name */
    private Surface f45450V;

    /* renamed from: W  reason: collision with root package name */
    private SurfaceHolder f45451W;

    /* renamed from: X  reason: collision with root package name */
    private l f45452X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public boolean f45453Y;

    /* renamed from: Z  reason: collision with root package name */
    private TextureView f45454Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f45455a0;

    /* renamed from: b  reason: collision with root package name */
    final B f45456b;

    /* renamed from: b0  reason: collision with root package name */
    private int f45457b0;

    /* renamed from: c  reason: collision with root package name */
    final T0.b f45458c;

    /* renamed from: c0  reason: collision with root package name */
    private int f45459c0;

    /* renamed from: d  reason: collision with root package name */
    private final C3651g f45460d;

    /* renamed from: d0  reason: collision with root package name */
    private int f45461d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f45462e;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public C3869e f45463e0;

    /* renamed from: f  reason: collision with root package name */
    private final T0 f45464f;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public C3869e f45465f0;

    /* renamed from: g  reason: collision with root package name */
    private final a1[] f45466g;

    /* renamed from: g0  reason: collision with root package name */
    private int f45467g0;

    /* renamed from: h  reason: collision with root package name */
    private final A f45468h;

    /* renamed from: h0  reason: collision with root package name */
    private C3847e f45469h0;

    /* renamed from: i  reason: collision with root package name */
    private final o f45470i;

    /* renamed from: i0  reason: collision with root package name */
    private float f45471i0;

    /* renamed from: j  reason: collision with root package name */
    private final C3709m0.f f45472j;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public boolean f45473j0;

    /* renamed from: k  reason: collision with root package name */
    private final C3709m0 f45474k;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public W9.e f45475k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final r f45476l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f45477l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet f45478m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f45479m0;

    /* renamed from: n  reason: collision with root package name */
    private final n1.b f45480n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f45481n0;

    /* renamed from: o  reason: collision with root package name */
    private final List f45482o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f45483o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f45484p;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public C3714p f45485p0;

    /* renamed from: q  reason: collision with root package name */
    private final C3070t.a f45486q;
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public y f45487q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C3747a f45488r;
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public D0 f45489r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f45490s;

    /* renamed from: s0  reason: collision with root package name */
    private Q0 f45491s0;

    /* renamed from: t  reason: collision with root package name */
    private final C3607e f45492t;

    /* renamed from: t0  reason: collision with root package name */
    private int f45493t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f45494u;

    /* renamed from: u0  reason: collision with root package name */
    private int f45495u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f45496v;

    /* renamed from: v0  reason: collision with root package name */
    private long f45497v0;

    /* renamed from: w  reason: collision with root package name */
    private final C3648d f45498w;

    /* renamed from: x  reason: collision with root package name */
    private final c f45499x;

    /* renamed from: y  reason: collision with root package name */
    private final d f45500y;

    /* renamed from: z  reason: collision with root package name */
    private final C3686b f45501z;

    /* renamed from: k9.a0$b */
    private static final class b {
        public static s0 a(Context context, C3685a0 a0Var, boolean z10) {
            q0 z02 = q0.z0(context);
            if (z02 == null) {
                s.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new s0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                a0Var.y0(z02);
            }
            return new s0(z02.G0());
        }
    }

    /* renamed from: k9.a0$d */
    private static final class d implements j, la.a, W0.b {

        /* renamed from: a  reason: collision with root package name */
        private j f45503a;

        /* renamed from: b  reason: collision with root package name */
        private la.a f45504b;

        /* renamed from: c  reason: collision with root package name */
        private j f45505c;

        /* renamed from: d  reason: collision with root package name */
        private la.a f45506d;

        private d() {
        }

        public void a(long j10, float[] fArr) {
            la.a aVar = this.f45506d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            la.a aVar2 = this.f45504b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        public void c() {
            la.a aVar = this.f45506d;
            if (aVar != null) {
                aVar.c();
            }
            la.a aVar2 = this.f45504b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        public void f(long j10, long j11, C3717q0 q0Var, MediaFormat mediaFormat) {
            j jVar = this.f45505c;
            if (jVar != null) {
                jVar.f(j10, j11, q0Var, mediaFormat);
            }
            j jVar2 = this.f45503a;
            if (jVar2 != null) {
                jVar2.f(j10, j11, q0Var, mediaFormat);
            }
        }

        public void p(int i10, Object obj) {
            if (i10 == 7) {
                this.f45503a = (j) obj;
            } else if (i10 == 8) {
                this.f45504b = (la.a) obj;
            } else if (i10 == 10000) {
                l lVar = (l) obj;
                if (lVar == null) {
                    this.f45505c = null;
                    this.f45506d = null;
                    return;
                }
                this.f45505c = lVar.getVideoFrameMetadataListener();
                this.f45506d = lVar.getCameraMotionListener();
            }
        }
    }

    /* renamed from: k9.a0$e */
    private static final class e implements I0 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f45507a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public n1 f45508b;

        public e(Object obj, n1 n1Var) {
            this.f45507a = obj;
            this.f45508b = n1Var;
        }

        public Object a() {
            return this.f45507a;
        }

        public n1 b() {
            return this.f45508b;
        }
    }

    static {
        C3711n0.a("goog.exo.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r40v0, types: [k9.T0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3685a0(k9.C3678B r39, k9.T0 r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r38.<init>()
            ja.g r7 = new ja.g
            r7.<init>()
            r1.f45460d = r7
            java.lang.String r8 = "ExoPlayerImpl"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0181 }
            r9.<init>()     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "Init "
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            int r10 = java.lang.System.identityHashCode(r38)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0181 }
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = " ["
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "ExoPlayerLib/2.18.1"
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "] ["
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = ja.M.f44985e     // Catch:{ all -> 0x0181 }
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "]"
            r9.append(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0181 }
            ja.s.f(r8, r9)     // Catch:{ all -> 0x0181 }
            android.content.Context r8 = r0.f45172a     // Catch:{ all -> 0x0181 }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ all -> 0x0181 }
            r1.f45462e = r8     // Catch:{ all -> 0x0181 }
            nb.g r9 = r0.f45180i     // Catch:{ all -> 0x0181 }
            ja.d r10 = r0.f45173b     // Catch:{ all -> 0x0181 }
            java.lang.Object r9 = r9.apply(r10)     // Catch:{ all -> 0x0181 }
            l9.a r9 = (l9.C3747a) r9     // Catch:{ all -> 0x0181 }
            r1.f45488r = r9     // Catch:{ all -> 0x0181 }
            m9.e r10 = r0.f45182k     // Catch:{ all -> 0x0181 }
            r1.f45469h0 = r10     // Catch:{ all -> 0x0181 }
            int r10 = r0.f45187p     // Catch:{ all -> 0x0181 }
            r1.f45455a0 = r10     // Catch:{ all -> 0x0181 }
            int r10 = r0.f45188q     // Catch:{ all -> 0x0181 }
            r1.f45457b0 = r10     // Catch:{ all -> 0x0181 }
            boolean r10 = r0.f45186o     // Catch:{ all -> 0x0181 }
            r1.f45473j0 = r10     // Catch:{ all -> 0x0181 }
            long r10 = r0.f45195x     // Catch:{ all -> 0x0181 }
            r1.f45433E = r10     // Catch:{ all -> 0x0181 }
            k9.a0$c r11 = new k9.a0$c     // Catch:{ all -> 0x0181 }
            r10 = 0
            r11.<init>()     // Catch:{ all -> 0x0181 }
            r1.f45499x = r11     // Catch:{ all -> 0x0181 }
            k9.a0$d r15 = new k9.a0$d     // Catch:{ all -> 0x0181 }
            r15.<init>()     // Catch:{ all -> 0x0181 }
            r1.f45500y = r15     // Catch:{ all -> 0x0181 }
            android.os.Handler r14 = new android.os.Handler     // Catch:{ all -> 0x0181 }
            android.os.Looper r12 = r0.f45181j     // Catch:{ all -> 0x0181 }
            r14.<init>(r12)     // Catch:{ all -> 0x0181 }
            nb.u r12 = r0.f45175d     // Catch:{ all -> 0x0181 }
            java.lang.Object r12 = r12.get()     // Catch:{ all -> 0x0181 }
            k9.d1 r12 = (k9.d1) r12     // Catch:{ all -> 0x0181 }
            r13 = r14
            r3 = r14
            r14 = r11
            r28 = r15
            r15 = r11
            r16 = r11
            r17 = r11
            k9.a1[] r12 = r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0181 }
            r1.f45466g = r12     // Catch:{ all -> 0x0181 }
            int r13 = r12.length     // Catch:{ all -> 0x0181 }
            r15 = 0
            if (r13 <= 0) goto L_0x00a1
            r13 = 1
            goto L_0x00a2
        L_0x00a1:
            r13 = r15
        L_0x00a2:
            ja.C3645a.f(r13)     // Catch:{ all -> 0x0181 }
            nb.u r13 = r0.f45177f     // Catch:{ all -> 0x0181 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x0181 }
            r14 = r13
            ga.A r14 = (ga.A) r14     // Catch:{ all -> 0x0181 }
            r1.f45468h = r14     // Catch:{ all -> 0x0181 }
            nb.u r13 = r0.f45176e     // Catch:{ all -> 0x0181 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x0181 }
            N9.t$a r13 = (N9.C3070t.a) r13     // Catch:{ all -> 0x0181 }
            r1.f45486q = r13     // Catch:{ all -> 0x0181 }
            nb.u r13 = r0.f45179h     // Catch:{ all -> 0x0181 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x0181 }
            ia.e r13 = (ia.C3607e) r13     // Catch:{ all -> 0x0181 }
            r1.f45492t = r13     // Catch:{ all -> 0x0181 }
            boolean r4 = r0.f45189r     // Catch:{ all -> 0x0181 }
            r1.f45484p = r4     // Catch:{ all -> 0x0181 }
            k9.e1 r4 = r0.f45190s     // Catch:{ all -> 0x0181 }
            r1.f45440L = r4     // Catch:{ all -> 0x0181 }
            r29 = r3
            long r2 = r0.f45191t     // Catch:{ all -> 0x0181 }
            r1.f45494u = r2     // Catch:{ all -> 0x0181 }
            long r2 = r0.f45192u     // Catch:{ all -> 0x0181 }
            r1.f45496v = r2     // Catch:{ all -> 0x0181 }
            boolean r2 = r0.f45196y     // Catch:{ all -> 0x0181 }
            r1.f45442N = r2     // Catch:{ all -> 0x0181 }
            android.os.Looper r2 = r0.f45181j     // Catch:{ all -> 0x0181 }
            r1.f45490s = r2     // Catch:{ all -> 0x0181 }
            ja.d r3 = r0.f45173b     // Catch:{ all -> 0x0181 }
            r1.f45498w = r3     // Catch:{ all -> 0x0181 }
            if (r40 != 0) goto L_0x00e6
            r4 = r1
            goto L_0x00e8
        L_0x00e6:
            r4 = r40
        L_0x00e8:
            r1.f45464f = r4     // Catch:{ all -> 0x0181 }
            ja.r r5 = new ja.r     // Catch:{ all -> 0x0181 }
            k9.K r6 = new k9.K     // Catch:{ all -> 0x0181 }
            r6.<init>(r1)     // Catch:{ all -> 0x0181 }
            r5.<init>(r2, r3, r6)     // Catch:{ all -> 0x0181 }
            r1.f45476l = r5     // Catch:{ all -> 0x0181 }
            java.util.concurrent.CopyOnWriteArraySet r5 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x0181 }
            r5.<init>()     // Catch:{ all -> 0x0181 }
            r1.f45478m = r5     // Catch:{ all -> 0x0181 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0181 }
            r5.<init>()     // Catch:{ all -> 0x0181 }
            r1.f45482o = r5     // Catch:{ all -> 0x0181 }
            N9.O$a r5 = new N9.O$a     // Catch:{ all -> 0x0181 }
            r5.<init>(r15)     // Catch:{ all -> 0x0181 }
            r1.f45441M = r5     // Catch:{ all -> 0x0181 }
            ga.B r5 = new ga.B     // Catch:{ all -> 0x0181 }
            int r6 = r12.length     // Catch:{ all -> 0x0181 }
            k9.c1[] r6 = new k9.c1[r6]     // Catch:{ all -> 0x0181 }
            int r15 = r12.length     // Catch:{ all -> 0x0181 }
            ga.r[] r15 = new ga.r[r15]     // Catch:{ all -> 0x0181 }
            r18 = r11
            k9.s1 r11 = k9.s1.f45825b     // Catch:{ all -> 0x0181 }
            r5.<init>(r6, r15, r11, r10)     // Catch:{ all -> 0x0181 }
            r1.f45456b = r5     // Catch:{ all -> 0x0181 }
            k9.n1$b r6 = new k9.n1$b     // Catch:{ all -> 0x0181 }
            r6.<init>()     // Catch:{ all -> 0x0181 }
            r1.f45480n = r6     // Catch:{ all -> 0x0181 }
            k9.T0$b$a r6 = new k9.T0$b$a     // Catch:{ all -> 0x0181 }
            r6.<init>()     // Catch:{ all -> 0x0181 }
            r11 = 21
            int[] r15 = new int[r11]     // Catch:{ all -> 0x0181 }
            r15 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28} // fill-array     // Catch:{ all -> 0x0181 }
            k9.T0$b$a r6 = r6.c(r15)     // Catch:{ all -> 0x0181 }
            boolean r11 = r14.d()     // Catch:{ all -> 0x0181 }
            r15 = 29
            k9.T0$b$a r6 = r6.d(r15, r11)     // Catch:{ all -> 0x0181 }
            k9.T0$b r6 = r6.e()     // Catch:{ all -> 0x0181 }
            r1.f45458c = r6     // Catch:{ all -> 0x0181 }
            k9.T0$b$a r11 = new k9.T0$b$a     // Catch:{ all -> 0x0181 }
            r11.<init>()     // Catch:{ all -> 0x0181 }
            k9.T0$b$a r6 = r11.b(r6)     // Catch:{ all -> 0x0181 }
            r15 = 4
            k9.T0$b$a r6 = r6.a(r15)     // Catch:{ all -> 0x0181 }
            r11 = 10
            k9.T0$b$a r6 = r6.a(r11)     // Catch:{ all -> 0x0181 }
            k9.T0$b r6 = r6.e()     // Catch:{ all -> 0x0181 }
            r1.f45443O = r6     // Catch:{ all -> 0x0181 }
            ja.o r6 = r3.d(r2, r10)     // Catch:{ all -> 0x0181 }
            r1.f45470i = r6     // Catch:{ all -> 0x0181 }
            k9.L r6 = new k9.L     // Catch:{ all -> 0x0181 }
            r6.<init>(r1)     // Catch:{ all -> 0x0181 }
            r1.f45472j = r6     // Catch:{ all -> 0x0181 }
            k9.Q0 r10 = k9.Q0.j(r5)     // Catch:{ all -> 0x0181 }
            r1.f45491s0 = r10     // Catch:{ all -> 0x0181 }
            r9.U(r4, r2)     // Catch:{ all -> 0x0181 }
            int r4 = ja.M.f44981a     // Catch:{ all -> 0x0181 }
            r10 = 31
            if (r4 >= r10) goto L_0x0184
            l9.s0 r10 = new l9.s0     // Catch:{ all -> 0x0181 }
            r10.<init>()     // Catch:{ all -> 0x0181 }
        L_0x017e:
            r27 = r10
            goto L_0x018b
        L_0x0181:
            r0 = move-exception
            goto L_0x02e6
        L_0x0184:
            boolean r10 = r0.f45197z     // Catch:{ all -> 0x0181 }
            l9.s0 r10 = k9.C3685a0.b.a(r8, r1, r10)     // Catch:{ all -> 0x0181 }
            goto L_0x017e
        L_0x018b:
            k9.m0 r10 = new k9.m0     // Catch:{ all -> 0x0181 }
            nb.u r11 = r0.f45178g     // Catch:{ all -> 0x0181 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0181 }
            r16 = r11
            k9.w0 r16 = (k9.C3728w0) r16     // Catch:{ all -> 0x0181 }
            int r11 = r1.f45434F     // Catch:{ all -> 0x0181 }
            r30 = r7
            boolean r7 = r1.f45435G     // Catch:{ all -> 0x0181 }
            r31 = r8
            k9.e1 r8 = r1.f45440L     // Catch:{ all -> 0x0181 }
            r32 = r4
            k9.v0 r4 = r0.f45193v     // Catch:{ all -> 0x0181 }
            r33 = r2
            r25 = r3
            long r2 = r0.f45194w     // Catch:{ all -> 0x0181 }
            boolean r0 = r1.f45442N     // Catch:{ all -> 0x0181 }
            r35 = r10
            r34 = 0
            r10 = r35
            r36 = r18
            r18 = r11
            r11 = r12
            r12 = r14
            r40 = r13
            r13 = r5
            r5 = r14
            r14 = r16
            r37 = r5
            r5 = 0
            r15 = r40
            r16 = r18
            r17 = r7
            r18 = r9
            r19 = r8
            r20 = r4
            r21 = r2
            r23 = r0
            r24 = r33
            r26 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0181 }
            r0 = r35
            r1.f45474k = r0     // Catch:{ all -> 0x0181 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f45471i0 = r2     // Catch:{ all -> 0x0181 }
            r1.f45434F = r5     // Catch:{ all -> 0x0181 }
            k9.D0 r2 = k9.D0.f45199G     // Catch:{ all -> 0x0181 }
            r1.f45444P = r2     // Catch:{ all -> 0x0181 }
            r1.f45445Q = r2     // Catch:{ all -> 0x0181 }
            r1.f45489r0 = r2     // Catch:{ all -> 0x0181 }
            r2 = -1
            r1.f45493t0 = r2     // Catch:{ all -> 0x0181 }
            r2 = r32
            r3 = 21
            if (r2 >= r3) goto L_0x01fb
            int r2 = r1.W0(r5)     // Catch:{ all -> 0x0181 }
            r1.f45467g0 = r2     // Catch:{ all -> 0x0181 }
            goto L_0x0201
        L_0x01fb:
            int r2 = ja.M.F(r31)     // Catch:{ all -> 0x0181 }
            r1.f45467g0 = r2     // Catch:{ all -> 0x0181 }
        L_0x0201:
            W9.e r2 = W9.e.f34962b     // Catch:{ all -> 0x0181 }
            r1.f45475k0 = r2     // Catch:{ all -> 0x0181 }
            r2 = 1
            r1.f45477l0 = r2     // Catch:{ all -> 0x0181 }
            r1.A0(r9)     // Catch:{ all -> 0x0181 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0181 }
            r3 = r33
            r2.<init>(r3)     // Catch:{ all -> 0x0181 }
            r13 = r40
            r13.g(r2, r9)     // Catch:{ all -> 0x0181 }
            r2 = r36
            r1.z0(r2)     // Catch:{ all -> 0x0181 }
            r3 = r39
            long r6 = r3.f45174c     // Catch:{ all -> 0x0181 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0229
            r0.v(r6)     // Catch:{ all -> 0x0181 }
        L_0x0229:
            k9.b r0 = new k9.b     // Catch:{ all -> 0x0181 }
            android.content.Context r4 = r3.f45172a     // Catch:{ all -> 0x0181 }
            r6 = r29
            r0.<init>(r4, r6, r2)     // Catch:{ all -> 0x0181 }
            r1.f45501z = r0     // Catch:{ all -> 0x0181 }
            boolean r4 = r3.f45185n     // Catch:{ all -> 0x0181 }
            r0.b(r4)     // Catch:{ all -> 0x0181 }
            k9.d r0 = new k9.d     // Catch:{ all -> 0x0181 }
            android.content.Context r4 = r3.f45172a     // Catch:{ all -> 0x0181 }
            r0.<init>(r4, r6, r2)     // Catch:{ all -> 0x0181 }
            r1.f45429A = r0     // Catch:{ all -> 0x0181 }
            boolean r4 = r3.f45183l     // Catch:{ all -> 0x0181 }
            if (r4 == 0) goto L_0x0249
            m9.e r10 = r1.f45469h0     // Catch:{ all -> 0x0181 }
            goto L_0x024b
        L_0x0249:
            r10 = r34
        L_0x024b:
            r0.m(r10)     // Catch:{ all -> 0x0181 }
            k9.i1 r0 = new k9.i1     // Catch:{ all -> 0x0181 }
            android.content.Context r4 = r3.f45172a     // Catch:{ all -> 0x0181 }
            r0.<init>(r4, r6, r2)     // Catch:{ all -> 0x0181 }
            r1.f45430B = r0     // Catch:{ all -> 0x0181 }
            m9.e r2 = r1.f45469h0     // Catch:{ all -> 0x0181 }
            int r2 = r2.f46635c     // Catch:{ all -> 0x0181 }
            int r2 = ja.M.g0(r2)     // Catch:{ all -> 0x0181 }
            r0.h(r2)     // Catch:{ all -> 0x0181 }
            k9.t1 r2 = new k9.t1     // Catch:{ all -> 0x0181 }
            android.content.Context r4 = r3.f45172a     // Catch:{ all -> 0x0181 }
            r2.<init>(r4)     // Catch:{ all -> 0x0181 }
            r1.f45431C = r2     // Catch:{ all -> 0x0181 }
            int r4 = r3.f45184m     // Catch:{ all -> 0x0181 }
            if (r4 == 0) goto L_0x0271
            r15 = 1
            goto L_0x0272
        L_0x0271:
            r15 = r5
        L_0x0272:
            r2.a(r15)     // Catch:{ all -> 0x0181 }
            k9.u1 r2 = new k9.u1     // Catch:{ all -> 0x0181 }
            android.content.Context r4 = r3.f45172a     // Catch:{ all -> 0x0181 }
            r2.<init>(r4)     // Catch:{ all -> 0x0181 }
            r1.f45432D = r2     // Catch:{ all -> 0x0181 }
            int r3 = r3.f45184m     // Catch:{ all -> 0x0181 }
            r4 = 2
            if (r3 != r4) goto L_0x0285
            r15 = 1
            goto L_0x0286
        L_0x0285:
            r15 = r5
        L_0x0286:
            r2.a(r15)     // Catch:{ all -> 0x0181 }
            k9.p r0 = D0(r0)     // Catch:{ all -> 0x0181 }
            r1.f45485p0 = r0     // Catch:{ all -> 0x0181 }
            ka.y r0 = ka.y.f46095e     // Catch:{ all -> 0x0181 }
            r1.f45487q0 = r0     // Catch:{ all -> 0x0181 }
            m9.e r0 = r1.f45469h0     // Catch:{ all -> 0x0181 }
            r13 = r37
            r13.h(r0)     // Catch:{ all -> 0x0181 }
            int r0 = r1.f45467g0     // Catch:{ all -> 0x0181 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r2 = 10
            r3 = 1
            r1.E1(r3, r2, r0)     // Catch:{ all -> 0x0181 }
            int r0 = r1.f45467g0     // Catch:{ all -> 0x0181 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r4 = 2
            r1.E1(r4, r2, r0)     // Catch:{ all -> 0x0181 }
            m9.e r0 = r1.f45469h0     // Catch:{ all -> 0x0181 }
            r2 = 3
            r1.E1(r3, r2, r0)     // Catch:{ all -> 0x0181 }
            int r0 = r1.f45455a0     // Catch:{ all -> 0x0181 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r2 = 4
            r1.E1(r4, r2, r0)     // Catch:{ all -> 0x0181 }
            int r0 = r1.f45457b0     // Catch:{ all -> 0x0181 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r2 = 5
            r1.E1(r4, r2, r0)     // Catch:{ all -> 0x0181 }
            boolean r0 = r1.f45473j0     // Catch:{ all -> 0x0181 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r2 = 9
            r3 = 1
            r1.E1(r3, r2, r0)     // Catch:{ all -> 0x0181 }
            r0 = 7
            r2 = r28
            r1.E1(r4, r0, r2)     // Catch:{ all -> 0x0181 }
            r0 = 6
            r3 = 8
            r1.E1(r0, r3, r2)     // Catch:{ all -> 0x0181 }
            r30.e()
            return
        L_0x02e6:
            ja.g r2 = r1.f45460d
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.C3685a0.<init>(k9.B, k9.T0):void");
    }

    private List B0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            K0.c cVar = new K0.c((C3070t) list.get(i11), this.f45484p);
            arrayList.add(cVar);
            this.f45482o.add(i11 + i10, new e(cVar.f45332b, cVar.f45331a.Q()));
        }
        this.f45441M = this.f45441M.h(i10, arrayList.size());
        return arrayList;
    }

    private Q0 B1(int i10, int i11) {
        boolean z10;
        if (i10 < 0 || i11 < i10 || i11 > this.f45482o.size()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.a(z10);
        int B10 = B();
        n1 s10 = s();
        int size = this.f45482o.size();
        this.f45436H++;
        C1(i10, i11);
        n1 E02 = E0();
        Q0 u12 = u1(this.f45491s0, E02, P0(s10, E02));
        int i12 = u12.f45356e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && B10 >= u12.f45352a.t()) {
            u12 = u12.g(4);
        }
        this.f45474k.o0(i10, i11, this.f45441M);
        return u12;
    }

    /* access modifiers changed from: private */
    public D0 C0() {
        n1 s10 = s();
        if (s10.u()) {
            return this.f45489r0;
        }
        return this.f45489r0.b().H(s10.r(B(), this.f45533a).f45730c.f45859e).F();
    }

    private void C1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f45482o.remove(i12);
        }
        this.f45441M = this.f45441M.b(i10, i11);
    }

    /* access modifiers changed from: private */
    public static C3714p D0(i1 i1Var) {
        return new C3714p(0, i1Var.d(), i1Var.c());
    }

    private void D1() {
        if (this.f45452X != null) {
            F0(this.f45500y).n(10000).m((Object) null).l();
            this.f45452X.h(this.f45499x);
            this.f45452X = null;
        }
        TextureView textureView = this.f45454Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f45499x) {
                s.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f45454Z.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f45454Z = null;
        }
        SurfaceHolder surfaceHolder = this.f45451W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f45499x);
            this.f45451W = null;
        }
    }

    private n1 E0() {
        return new X0(this.f45482o, this.f45441M);
    }

    private void E1(int i10, int i11, Object obj) {
        for (a1 a1Var : this.f45466g) {
            if (a1Var.e() == i10) {
                F0(a1Var).n(i11).m(obj).l();
            }
        }
    }

    private W0 F0(W0.b bVar) {
        int N02 = N0();
        C3709m0 m0Var = this.f45474k;
        n1 n1Var = this.f45491s0.f45352a;
        if (N02 == -1) {
            N02 = 0;
        }
        return new W0(m0Var, bVar, n1Var, N02, this.f45498w, m0Var.C());
    }

    /* access modifiers changed from: private */
    public void F1() {
        E1(1, 2, Float.valueOf(this.f45471i0 * this.f45429A.g()));
    }

    private Pair G0(Q0 q02, Q0 q03, boolean z10, int i10, boolean z11) {
        n1 n1Var = q03.f45352a;
        n1 n1Var2 = q02.f45352a;
        if (n1Var2.u() && n1Var.u()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (n1Var2.u() != n1Var.u()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (!n1Var.r(n1Var.l(q03.f45353b.f33285a, this.f45480n).f45715c, this.f45533a).f45728a.equals(n1Var2.r(n1Var2.l(q02.f45353b.f33285a, this.f45480n).f45715c, this.f45533a).f45728a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair(Boolean.TRUE, Integer.valueOf(i11));
        } else if (!z10 || i10 != 0 || q03.f45353b.f33288d >= q02.f45353b.f33288d) {
            return new Pair(Boolean.FALSE, -1);
        } else {
            return new Pair(Boolean.TRUE, 0);
        }
    }

    private void J1(List list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int N02 = N0();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.f45436H++;
        if (!this.f45482o.isEmpty()) {
            C1(0, this.f45482o.size());
        }
        List B02 = B0(0, list);
        n1 E02 = E0();
        if (E02.u() || i12 < E02.t()) {
            long j12 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = E02.e(this.f45435G);
            } else if (i12 == -1) {
                i11 = N02;
                j11 = currentPosition;
            } else {
                i11 = i12;
                j11 = j12;
            }
            Q0 u12 = u1(this.f45491s0, E02, v1(E02, i11, j11));
            int i13 = u12.f45356e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (E02.u() || i11 >= E02.t()) ? 4 : 2;
            }
            Q0 g10 = u12.g(i13);
            this.f45474k.N0(B02, i11, M.C0(j11), this.f45441M);
            if (this.f45491s0.f45353b.f33285a.equals(g10.f45353b.f33285a) || this.f45491s0.f45352a.u()) {
                z11 = false;
            }
            U1(g10, 0, 1, false, z11, 4, M0(g10), -1);
            return;
        }
        throw new C3724u0(E02, i12, j10);
    }

    private long M0(Q0 q02) {
        if (q02.f45352a.u()) {
            return M.C0(this.f45497v0);
        }
        if (q02.f45353b.b()) {
            return q02.f45369r;
        }
        return x1(q02.f45352a, q02.f45353b, q02.f45369r);
    }

    private int N0() {
        if (this.f45491s0.f45352a.u()) {
            return this.f45493t0;
        }
        Q0 q02 = this.f45491s0;
        return q02.f45352a.l(q02.f45353b.f33285a, this.f45480n).f45715c;
    }

    /* access modifiers changed from: private */
    public void N1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        O1(surface);
        this.f45450V = surface;
    }

    /* access modifiers changed from: private */
    public void O1(Object obj) {
        boolean z10;
        ArrayList<W0> arrayList = new ArrayList<>();
        a1[] a1VarArr = this.f45466g;
        int length = a1VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            a1 a1Var = a1VarArr[i10];
            if (a1Var.e() == 2) {
                arrayList.add(F0(a1Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.f45449U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (W0 a10 : arrayList) {
                    a10.a(this.f45433E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f45449U;
            Surface surface = this.f45450V;
            if (obj3 == surface) {
                surface.release();
                this.f45450V = null;
            }
        }
        this.f45449U = obj;
        if (z10) {
            R1(false, r.j(new C3713o0(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    private Pair P0(n1 n1Var, n1 n1Var2) {
        boolean z10;
        long z11 = z();
        int i10 = -1;
        if (n1Var.u() || n1Var2.u()) {
            if (n1Var.u() || !n1Var2.u()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i10 = N0();
            }
            if (z10) {
                z11 = -9223372036854775807L;
            }
            return v1(n1Var2, i10, z11);
        }
        Pair n10 = n1Var.n(this.f45533a, this.f45480n, B(), M.C0(z11));
        Object obj = ((Pair) M.j(n10)).first;
        if (n1Var2.f(obj) != -1) {
            return n10;
        }
        Object z02 = C3709m0.z0(this.f45533a, this.f45480n, this.f45434F, this.f45435G, obj, n1Var, n1Var2);
        if (z02 == null) {
            return v1(n1Var2, -1, -9223372036854775807L);
        }
        n1Var2.l(z02, this.f45480n);
        int i11 = this.f45480n.f45715c;
        return v1(n1Var2, i11, n1Var2.r(i11, this.f45533a).d());
    }

    /* access modifiers changed from: private */
    public static int Q0(boolean z10, int i10) {
        if (!z10 || i10 == 1) {
            return 1;
        }
        return 2;
    }

    private void R1(boolean z10, r rVar) {
        Q0 q02;
        boolean z11;
        if (z10) {
            q02 = B1(0, this.f45482o.size()).e((r) null);
        } else {
            Q0 q03 = this.f45491s0;
            q02 = q03.b(q03.f45353b);
            q02.f45367p = q02.f45369r;
            q02.f45368q = 0;
        }
        Q0 g10 = q02.g(1);
        if (rVar != null) {
            g10 = g10.e(rVar);
        }
        Q0 q04 = g10;
        this.f45436H++;
        this.f45474k.g1();
        if (!q04.f45352a.u() || this.f45491s0.f45352a.u()) {
            z11 = false;
        } else {
            z11 = true;
        }
        U1(q04, 0, 1, false, z11, 4, M0(q04), -1);
    }

    private T0.e S0(long j10) {
        int i10;
        Object obj;
        C3732y0 y0Var;
        Object obj2;
        long j11;
        int B10 = B();
        if (!this.f45491s0.f45352a.u()) {
            Q0 q02 = this.f45491s0;
            Object obj3 = q02.f45353b.f33285a;
            q02.f45352a.l(obj3, this.f45480n);
            int f10 = this.f45491s0.f45352a.f(obj3);
            i10 = f10;
            obj = obj3;
            obj2 = this.f45491s0.f45352a.r(B10, this.f45533a).f45728a;
            y0Var = this.f45533a.f45730c;
        } else {
            y0Var = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        }
        long Z02 = M.Z0(j10);
        if (this.f45491s0.f45353b.b()) {
            j11 = M.Z0(U0(this.f45491s0));
        } else {
            j11 = Z02;
        }
        C3070t.b bVar = this.f45491s0.f45353b;
        return new T0.e(obj2, B10, y0Var, obj, i10, Z02, j11, bVar.f33286b, bVar.f33287c);
    }

    private void S1() {
        T0.b bVar = this.f45443O;
        T0.b H10 = M.H(this.f45464f, this.f45458c);
        this.f45443O = H10;
        if (!H10.equals(bVar)) {
            this.f45476l.i(13, new Q(this));
        }
    }

    private T0.e T0(int i10, Q0 q02, int i11) {
        int i12;
        Object obj;
        C3732y0 y0Var;
        int i13;
        Object obj2;
        long j10;
        long j11;
        Q0 q03 = q02;
        n1.b bVar = new n1.b();
        if (!q03.f45352a.u()) {
            Object obj3 = q03.f45353b.f33285a;
            q03.f45352a.l(obj3, bVar);
            int i14 = bVar.f45715c;
            int f10 = q03.f45352a.f(obj3);
            Object obj4 = q03.f45352a.r(i14, this.f45533a).f45728a;
            y0Var = this.f45533a.f45730c;
            obj = obj3;
            i12 = f10;
            obj2 = obj4;
            i13 = i14;
        } else {
            i13 = i11;
            obj2 = null;
            y0Var = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            if (q03.f45353b.b()) {
                C3070t.b bVar2 = q03.f45353b;
                j11 = bVar.e(bVar2.f33286b, bVar2.f33287c);
                j10 = U0(q02);
                long Z02 = M.Z0(j11);
                long Z03 = M.Z0(j10);
                C3070t.b bVar3 = q03.f45353b;
                return new T0.e(obj2, i13, y0Var, obj, i12, Z02, Z03, bVar3.f33286b, bVar3.f33287c);
            } else if (q03.f45353b.f33289e != -1) {
                j11 = U0(this.f45491s0);
            } else {
                j11 = bVar.f45717e + bVar.f45716d;
            }
        } else if (q03.f45353b.b()) {
            j11 = q03.f45369r;
            j10 = U0(q02);
            long Z022 = M.Z0(j11);
            long Z032 = M.Z0(j10);
            C3070t.b bVar32 = q03.f45353b;
            return new T0.e(obj2, i13, y0Var, obj, i12, Z022, Z032, bVar32.f33286b, bVar32.f33287c);
        } else {
            j11 = bVar.f45717e + q03.f45369r;
        }
        j10 = j11;
        long Z0222 = M.Z0(j11);
        long Z0322 = M.Z0(j10);
        C3070t.b bVar322 = q03.f45353b;
        return new T0.e(obj2, i13, y0Var, obj, i12, Z0222, Z0322, bVar322.f33286b, bVar322.f33287c);
    }

    /* access modifiers changed from: private */
    public void T1(boolean z10, int i10, int i11) {
        boolean z11;
        int i12 = 0;
        if (!z10 || i10 == -1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        Q0 q02 = this.f45491s0;
        if (q02.f45363l != z11 || q02.f45364m != i12) {
            this.f45436H++;
            Q0 d10 = q02.d(z11, i12);
            this.f45474k.Q0(z11, i12);
            U1(d10, 0, i11, false, false, 5, -9223372036854775807L, -1);
        }
    }

    private static long U0(Q0 q02) {
        n1.d dVar = new n1.d();
        n1.b bVar = new n1.b();
        q02.f45352a.l(q02.f45353b.f33285a, bVar);
        if (q02.f45354c == -9223372036854775807L) {
            return q02.f45352a.r(bVar.f45715c, dVar).e();
        }
        return bVar.q() + q02.f45354c;
    }

    private void U1(Q0 q02, int i10, int i11, boolean z10, boolean z11, int i12, long j10, int i13) {
        boolean z12;
        boolean z13;
        boolean z14;
        Q0 q03 = q02;
        int i14 = i12;
        Q0 q04 = this.f45491s0;
        this.f45491s0 = q03;
        Pair G02 = G0(q02, q04, z11, i12, !q04.f45352a.equals(q03.f45352a));
        boolean booleanValue = ((Boolean) G02.first).booleanValue();
        int intValue = ((Integer) G02.second).intValue();
        D0 d02 = this.f45444P;
        C3732y0 y0Var = null;
        if (booleanValue) {
            if (!q03.f45352a.u()) {
                y0Var = q03.f45352a.r(q03.f45352a.l(q03.f45353b.f33285a, this.f45480n).f45715c, this.f45533a).f45730c;
            }
            this.f45489r0 = D0.f45199G;
        }
        if (booleanValue || !q04.f45361j.equals(q03.f45361j)) {
            this.f45489r0 = this.f45489r0.b().J(q03.f45361j).F();
            d02 = C0();
        }
        boolean equals = d02.equals(this.f45444P);
        this.f45444P = d02;
        if (q04.f45363l != q03.f45363l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (q04.f45356e != q03.f45356e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            W1();
        }
        boolean z15 = q04.f45358g;
        boolean z16 = q03.f45358g;
        if (z15 != z16) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            V1(z16);
        }
        if (!q04.f45352a.equals(q03.f45352a)) {
            this.f45476l.i(0, new S(q03, i10));
        }
        if (z11) {
            this.f45476l.i(11, new Y(i14, T0(i14, q04, i13), S0(j10)));
        }
        if (booleanValue) {
            this.f45476l.i(1, new Z(y0Var, intValue));
        }
        if (q04.f45357f != q03.f45357f) {
            this.f45476l.i(10, new C3680D(q03));
            if (q03.f45357f != null) {
                this.f45476l.i(10, new C3681E(q03));
            }
        }
        B b10 = q04.f45360i;
        B b11 = q03.f45360i;
        if (b10 != b11) {
            this.f45468h.e(b11.f43762e);
            this.f45476l.i(2, new C3682F(q03));
        }
        if (!equals) {
            this.f45476l.i(14, new C3683G(this.f45444P));
        }
        if (z14) {
            this.f45476l.i(3, new H(q03));
        }
        if (z13 || z12) {
            this.f45476l.i(-1, new I(q03));
        }
        if (z13) {
            this.f45476l.i(4, new J(q03));
        }
        if (z12) {
            this.f45476l.i(5, new T(q03, i11));
        }
        if (q04.f45364m != q03.f45364m) {
            this.f45476l.i(6, new U(q03));
        }
        if (X0(q04) != X0(q02)) {
            this.f45476l.i(7, new V(q03));
        }
        if (!q04.f45365n.equals(q03.f45365n)) {
            this.f45476l.i(12, new W(q03));
        }
        if (z10) {
            this.f45476l.i(-1, new X());
        }
        S1();
        this.f45476l.f();
        if (q04.f45366o != q03.f45366o) {
            Iterator it = this.f45478m.iterator();
            while (it.hasNext()) {
                ((C3719s) it.next()).z(q03.f45366o);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public void a1(C3709m0.e eVar) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i10 = this.f45436H - eVar.f45685c;
        this.f45436H = i10;
        boolean z12 = true;
        if (eVar.f45686d) {
            this.f45437I = eVar.f45687e;
            this.f45438J = true;
        }
        if (eVar.f45688f) {
            this.f45439K = eVar.f45689g;
        }
        if (i10 == 0) {
            n1 n1Var = eVar.f45684b.f45352a;
            if (!this.f45491s0.f45352a.u() && n1Var.u()) {
                this.f45493t0 = -1;
                this.f45497v0 = 0;
                this.f45495u0 = 0;
            }
            if (!n1Var.u()) {
                List J10 = ((X0) n1Var).J();
                if (J10.size() == this.f45482o.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.f(z11);
                for (int i11 = 0; i11 < J10.size(); i11++) {
                    n1 unused = ((e) this.f45482o.get(i11)).f45508b = (n1) J10.get(i11);
                }
            }
            if (this.f45438J) {
                if (eVar.f45684b.f45353b.equals(this.f45491s0.f45353b) && eVar.f45684b.f45355d == this.f45491s0.f45369r) {
                    z12 = false;
                }
                if (z12) {
                    if (n1Var.u() || eVar.f45684b.f45353b.b()) {
                        j11 = eVar.f45684b.f45355d;
                    } else {
                        Q0 q02 = eVar.f45684b;
                        j11 = x1(n1Var, q02.f45353b, q02.f45355d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z12;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f45438J = false;
            U1(eVar.f45684b, 1, this.f45439K, false, z10, this.f45437I, j10, -1);
        }
    }

    private int W0(int i10) {
        AudioTrack audioTrack = this.f45448T;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.f45448T.release();
            this.f45448T = null;
        }
        if (this.f45448T == null) {
            this.f45448T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f45448T.getAudioSessionId();
    }

    /* access modifiers changed from: private */
    public void W1() {
        int k10 = k();
        boolean z10 = true;
        if (k10 != 1) {
            if (k10 == 2 || k10 == 3) {
                boolean H02 = H0();
                t1 t1Var = this.f45431C;
                if (!u() || H02) {
                    z10 = false;
                }
                t1Var.b(z10);
                this.f45432D.b(u());
                return;
            } else if (k10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f45431C.b(false);
        this.f45432D.b(false);
    }

    private static boolean X0(Q0 q02) {
        if (q02.f45356e == 3 && q02.f45363l && q02.f45364m == 0) {
            return true;
        }
        return false;
    }

    private void X1() {
        IllegalStateException illegalStateException;
        this.f45460d.b();
        if (Thread.currentThread() != I0().getThread()) {
            String C10 = M.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), I0().getThread().getName());
            if (!this.f45477l0) {
                if (this.f45479m0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                s.j("ExoPlayerImpl", C10, illegalStateException);
                this.f45479m0 = true;
                return;
            }
            throw new IllegalStateException(C10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z0(T0.d dVar, C3656l lVar) {
        dVar.T(this.f45464f, new T0.c(lVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b1(C3709m0.e eVar) {
        this.f45470i.f(new P(this, eVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f1(T0.d dVar) {
        dVar.l0(this.f45443O);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h1(int i10, T0.e eVar, T0.e eVar2, T0.d dVar) {
        dVar.E(i10);
        dVar.Q(eVar, eVar2, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n1(Q0 q02, T0.d dVar) {
        dVar.t(q02.f45358g);
        dVar.F(q02.f45358g);
    }

    private Q0 u1(Q0 q02, n1 n1Var, Pair pair) {
        boolean z10;
        C3070t.b bVar;
        V v10;
        B b10;
        List list;
        int i10;
        long j10;
        n1 n1Var2 = n1Var;
        Pair pair2 = pair;
        if (n1Var.u() || pair2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        n1 n1Var3 = q02.f45352a;
        Q0 i11 = q02.i(n1Var);
        if (n1Var.u()) {
            C3070t.b k10 = Q0.k();
            long C02 = M.C0(this.f45497v0);
            Q0 b11 = i11.c(k10, C02, C02, C02, 0, V.f33194d, this.f45456b, C4770v.E()).b(k10);
            b11.f45367p = b11.f45369r;
            return b11;
        }
        Object obj = i11.f45353b.f33285a;
        boolean equals = obj.equals(((Pair) M.j(pair)).first);
        if (!equals) {
            bVar = new C3070t.b(pair2.first);
        } else {
            bVar = i11.f45353b;
        }
        C3070t.b bVar2 = bVar;
        long longValue = ((Long) pair2.second).longValue();
        long C03 = M.C0(z());
        if (!n1Var3.u()) {
            C03 -= n1Var3.l(obj, this.f45480n).q();
        }
        if (!equals || longValue < C03) {
            C3070t.b bVar3 = bVar2;
            C3645a.f(!bVar3.b());
            if (!equals) {
                v10 = V.f33194d;
            } else {
                v10 = i11.f45359h;
            }
            V v11 = v10;
            C3070t.b bVar4 = bVar3;
            if (!equals) {
                b10 = this.f45456b;
            } else {
                b10 = i11.f45360i;
            }
            B b12 = b10;
            if (!equals) {
                list = C4770v.E();
            } else {
                list = i11.f45361j;
            }
            Q0 b13 = i11.c(bVar4, longValue, longValue, longValue, 0, v11, b12, list).b(bVar4);
            b13.f45367p = longValue;
            return b13;
        }
        if (i10 == 0) {
            int f10 = n1Var2.f(i11.f45362k.f33285a);
            if (f10 == -1 || n1Var2.j(f10, this.f45480n).f45715c != n1Var2.l(bVar2.f33285a, this.f45480n).f45715c) {
                n1Var2.l(bVar2.f33285a, this.f45480n);
                if (bVar2.b()) {
                    j10 = this.f45480n.e(bVar2.f33286b, bVar2.f33287c);
                } else {
                    j10 = this.f45480n.f45716d;
                }
                i11 = i11.c(bVar2, i11.f45369r, i11.f45369r, i11.f45355d, j10 - i11.f45369r, i11.f45359h, i11.f45360i, i11.f45361j).b(bVar2);
                i11.f45367p = j10;
            }
        } else {
            C3070t.b bVar5 = bVar2;
            C3645a.f(!bVar5.b());
            long max = Math.max(0, i11.f45368q - (longValue - C03));
            long j11 = i11.f45367p;
            if (i11.f45362k.equals(i11.f45353b)) {
                j11 = longValue + max;
            }
            i11 = i11.c(bVar5, longValue, longValue, longValue, max, i11.f45359h, i11.f45360i, i11.f45361j);
            i11.f45367p = j11;
        }
        return i11;
    }

    private Pair v1(n1 n1Var, int i10, long j10) {
        if (n1Var.u()) {
            this.f45493t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f45497v0 = j10;
            this.f45495u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= n1Var.t()) {
            i10 = n1Var.e(this.f45435G);
            j10 = n1Var.r(i10, this.f45533a).d();
        }
        return n1Var.n(this.f45533a, this.f45480n, i10, M.C0(j10));
    }

    /* access modifiers changed from: private */
    public void w1(int i10, int i11) {
        if (i10 != this.f45459c0 || i11 != this.f45461d0) {
            this.f45459c0 = i10;
            this.f45461d0 = i11;
            this.f45476l.k(24, new O(i10, i11));
        }
    }

    private long x1(n1 n1Var, C3070t.b bVar, long j10) {
        n1Var.l(bVar.f33285a, this.f45480n);
        return j10 + this.f45480n.q();
    }

    public void A0(T0.d dVar) {
        C3645a.e(dVar);
        this.f45476l.c(dVar);
    }

    public void A1() {
        AudioTrack audioTrack;
        s.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.18.1" + "] [" + M.f44985e + "] [" + C3711n0.b() + "]");
        X1();
        if (M.f44981a < 21 && (audioTrack = this.f45448T) != null) {
            audioTrack.release();
            this.f45448T = null;
        }
        this.f45501z.b(false);
        this.f45430B.g();
        this.f45431C.b(false);
        this.f45432D.b(false);
        this.f45429A.i();
        if (!this.f45474k.l0()) {
            this.f45476l.k(10, new C3679C());
        }
        this.f45476l.j();
        this.f45470i.d((Object) null);
        this.f45492t.h(this.f45488r);
        Q0 g10 = this.f45491s0.g(1);
        this.f45491s0 = g10;
        Q0 b10 = g10.b(g10.f45353b);
        this.f45491s0 = b10;
        b10.f45367p = b10.f45369r;
        this.f45491s0.f45368q = 0;
        this.f45488r.release();
        this.f45468h.f();
        D1();
        Surface surface = this.f45450V;
        if (surface != null) {
            surface.release();
            this.f45450V = null;
        }
        if (!this.f45481n0) {
            this.f45475k0 = W9.e.f34962b;
            this.f45483o0 = true;
            return;
        }
        android.support.v4.media.session.c.a(C3645a.e((Object) null));
        throw null;
    }

    public int B() {
        X1();
        int N02 = N0();
        if (N02 == -1) {
            return 0;
        }
        return N02;
    }

    public boolean D() {
        X1();
        return this.f45435G;
    }

    public void G1(C3070t tVar) {
        X1();
        H1(Collections.singletonList(tVar));
    }

    public boolean H0() {
        X1();
        return this.f45491s0.f45366o;
    }

    public void H1(List list) {
        X1();
        I1(list, true);
    }

    public Looper I0() {
        return this.f45490s;
    }

    public void I1(List list, boolean z10) {
        X1();
        J1(list, -1, -9223372036854775807L, z10);
    }

    public int J0() {
        X1();
        return this.f45467g0;
    }

    public long K0() {
        X1();
        if (!g()) {
            return L0();
        }
        Q0 q02 = this.f45491s0;
        if (q02.f45362k.equals(q02.f45353b)) {
            return M.Z0(this.f45491s0.f45367p);
        }
        return O0();
    }

    public void K1(boolean z10) {
        X1();
        int p10 = this.f45429A.p(z10, k());
        T1(z10, p10, Q0(z10, p10));
    }

    public long L0() {
        X1();
        if (this.f45491s0.f45352a.u()) {
            return this.f45497v0;
        }
        Q0 q02 = this.f45491s0;
        if (q02.f45362k.f33288d != q02.f45353b.f33288d) {
            return q02.f45352a.r(B(), this.f45533a).f();
        }
        long j10 = q02.f45367p;
        if (this.f45491s0.f45362k.b()) {
            Q0 q03 = this.f45491s0;
            n1.b l10 = q03.f45352a.l(q03.f45362k.f33285a, this.f45480n);
            long i10 = l10.i(this.f45491s0.f45362k.f33286b);
            if (i10 == Long.MIN_VALUE) {
                j10 = l10.f45716d;
            } else {
                j10 = i10;
            }
        }
        Q0 q04 = this.f45491s0;
        return M.Z0(x1(q04.f45352a, q04.f45362k, j10));
    }

    public void L1(S0 s02) {
        X1();
        if (s02 == null) {
            s02 = S0.f45372d;
        }
        if (!this.f45491s0.f45365n.equals(s02)) {
            Q0 f10 = this.f45491s0.f(s02);
            this.f45436H++;
            this.f45474k.S0(s02);
            U1(f10, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void M1(int i10) {
        X1();
        if (this.f45434F != i10) {
            this.f45434F = i10;
            this.f45474k.U0(i10);
            this.f45476l.i(8, new M(i10));
            S1();
            this.f45476l.f();
        }
    }

    public long O0() {
        X1();
        if (!g()) {
            return a();
        }
        Q0 q02 = this.f45491s0;
        C3070t.b bVar = q02.f45353b;
        q02.f45352a.l(bVar.f33285a, this.f45480n);
        return M.Z0(this.f45480n.e(bVar.f33286b, bVar.f33287c));
    }

    public void P1(Surface surface) {
        int i10;
        X1();
        D1();
        O1(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        w1(i10, i10);
    }

    public void Q1(float f10) {
        X1();
        float p10 = M.p(f10, 0.0f, 1.0f);
        if (this.f45471i0 != p10) {
            this.f45471i0 = p10;
            F1();
            this.f45476l.k(22, new N(p10));
        }
    }

    /* renamed from: R0 */
    public r i() {
        X1();
        return this.f45491s0.f45357f;
    }

    public boolean g() {
        X1();
        return this.f45491s0.f45353b.b();
    }

    public long getCurrentPosition() {
        X1();
        return M.Z0(M0(this.f45491s0));
    }

    public long h() {
        X1();
        return M.Z0(this.f45491s0.f45368q);
    }

    public int k() {
        X1();
        return this.f45491s0.f45356e;
    }

    public s1 m() {
        X1();
        return this.f45491s0.f45360i.f43761d;
    }

    public int n() {
        X1();
        return this.f45434F;
    }

    public int p() {
        X1();
        if (g()) {
            return this.f45491s0.f45353b.f33286b;
        }
        return -1;
    }

    public int r() {
        X1();
        return this.f45491s0.f45364m;
    }

    public n1 s() {
        X1();
        return this.f45491s0.f45352a;
    }

    public void t(int i10, long j10) {
        X1();
        this.f45488r.x();
        n1 n1Var = this.f45491s0.f45352a;
        if (i10 < 0 || (!n1Var.u() && i10 >= n1Var.t())) {
            throw new C3724u0(n1Var, i10, j10);
        }
        int i11 = 1;
        this.f45436H++;
        if (g()) {
            s.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C3709m0.e eVar = new C3709m0.e(this.f45491s0);
            eVar.b(1);
            this.f45472j.a(eVar);
            return;
        }
        if (k() != 1) {
            i11 = 2;
        }
        int B10 = B();
        Q0 u12 = u1(this.f45491s0.g(i11), n1Var, v1(n1Var, i10, j10));
        this.f45474k.B0(n1Var, i10, M.C0(j10));
        U1(u12, 0, 1, true, true, 1, M0(u12), B10);
    }

    public boolean u() {
        X1();
        return this.f45491s0.f45363l;
    }

    public int v() {
        X1();
        if (this.f45491s0.f45352a.u()) {
            return this.f45495u0;
        }
        Q0 q02 = this.f45491s0;
        return q02.f45352a.f(q02.f45353b.f33285a);
    }

    public int x() {
        X1();
        if (g()) {
            return this.f45491s0.f45353b.f33287c;
        }
        return -1;
    }

    public void y0(C3748b bVar) {
        C3645a.e(bVar);
        this.f45488r.O(bVar);
    }

    public void y1() {
        X1();
        boolean u10 = u();
        int i10 = 2;
        int p10 = this.f45429A.p(u10, 2);
        T1(u10, p10, Q0(u10, p10));
        Q0 q02 = this.f45491s0;
        if (q02.f45356e == 1) {
            Q0 e10 = q02.e((r) null);
            if (e10.f45352a.u()) {
                i10 = 4;
            }
            Q0 g10 = e10.g(i10);
            this.f45436H++;
            this.f45474k.j0();
            U1(g10, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public long z() {
        X1();
        if (!g()) {
            return getCurrentPosition();
        }
        Q0 q02 = this.f45491s0;
        q02.f45352a.l(q02.f45353b.f33285a, this.f45480n);
        Q0 q03 = this.f45491s0;
        if (q03.f45354c == -9223372036854775807L) {
            return q03.f45352a.r(B(), this.f45533a).d();
        }
        return this.f45480n.p() + M.Z0(this.f45491s0.f45354c);
    }

    public void z0(C3719s sVar) {
        this.f45478m.add(sVar);
    }

    public void z1(C3070t tVar) {
        X1();
        G1(tVar);
        y1();
    }

    /* renamed from: k9.a0$c */
    private final class c implements w, m9.r, n, D9.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C3690d.b, C3686b.C0691b, i1.b, C3719s {
        private c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void R(T0.d dVar) {
            dVar.Z(C3685a0.this.f45444P);
        }

        public void A(C3869e eVar) {
            C3685a0.this.f45488r.A(eVar);
            C3717q0 unused = C3685a0.this.f45446R = null;
            C3869e unused2 = C3685a0.this.f45463e0 = null;
        }

        public void B(C3869e eVar) {
            C3869e unused = C3685a0.this.f45465f0 = eVar;
            C3685a0.this.f45488r.B(eVar);
        }

        public void D(C3869e eVar) {
            C3685a0.this.f45488r.D(eVar);
            C3717q0 unused = C3685a0.this.f45447S = null;
            C3869e unused2 = C3685a0.this.f45465f0 = null;
        }

        public void G(C3717q0 q0Var, C3873i iVar) {
            C3717q0 unused = C3685a0.this.f45447S = q0Var;
            C3685a0.this.f45488r.G(q0Var, iVar);
        }

        public void I(C3869e eVar) {
            C3869e unused = C3685a0.this.f45463e0 = eVar;
            C3685a0.this.f45488r.I(eVar);
        }

        public void J(W9.e eVar) {
            W9.e unused = C3685a0.this.f45475k0 = eVar;
            C3685a0.this.f45476l.k(27, new C3689c0(eVar));
        }

        public void a(boolean z10) {
            if (C3685a0.this.f45473j0 != z10) {
                boolean unused = C3685a0.this.f45473j0 = z10;
                C3685a0.this.f45476l.k(23, new C3703j0(z10));
            }
        }

        public void b(Exception exc) {
            C3685a0.this.f45488r.b(exc);
        }

        public void c(String str) {
            C3685a0.this.f45488r.c(str);
        }

        public void d(String str, long j10, long j11) {
            C3685a0.this.f45488r.d(str, j10, j11);
        }

        public void e(String str) {
            C3685a0.this.f45488r.e(str);
        }

        public void f(String str, long j10, long j11) {
            C3685a0.this.f45488r.f(str, j10, j11);
        }

        public void g(List list) {
            C3685a0.this.f45476l.k(27, new C3687b0(list));
        }

        public void h(long j10) {
            C3685a0.this.f45488r.h(j10);
        }

        public void i(Exception exc) {
            C3685a0.this.f45488r.i(exc);
        }

        public void j(int i10, long j10) {
            C3685a0.this.f45488r.j(i10, j10);
        }

        public void k(Object obj, long j10) {
            C3685a0.this.f45488r.k(obj, j10);
            if (C3685a0.this.f45449U == obj) {
                C3685a0.this.f45476l.k(26, new C3699h0());
            }
        }

        public void l(Exception exc) {
            C3685a0.this.f45488r.l(exc);
        }

        public void m(int i10, long j10, long j11) {
            C3685a0.this.f45488r.m(i10, j10, j11);
        }

        public void n(long j10, int i10) {
            C3685a0.this.f45488r.n(j10, i10);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C3685a0.this.N1(surfaceTexture);
            C3685a0.this.w1(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C3685a0.this.O1((Object) null);
            C3685a0.this.w1(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C3685a0.this.w1(i10, i11);
        }

        public void p(y yVar) {
            y unused = C3685a0.this.f45487q0 = yVar;
            C3685a0.this.f45476l.k(25, new C3701i0(yVar));
        }

        public void q(C3717q0 q0Var, C3873i iVar) {
            C3717q0 unused = C3685a0.this.f45446R = q0Var;
            C3685a0.this.f45488r.q(q0Var, iVar);
        }

        public void r(int i10) {
            C3714p n02 = C3685a0.D0(C3685a0.this.f45430B);
            if (!n02.equals(C3685a0.this.f45485p0)) {
                C3714p unused = C3685a0.this.f45485p0 = n02;
                C3685a0.this.f45476l.k(29, new C3697g0(n02));
            }
        }

        public void s() {
            C3685a0.this.T1(false, -1, 3);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C3685a0.this.w1(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C3685a0.this.f45453Y) {
                C3685a0.this.O1(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C3685a0.this.f45453Y) {
                C3685a0.this.O1((Object) null);
            }
            C3685a0.this.w1(0, 0);
        }

        public void t(Surface surface) {
            C3685a0.this.O1((Object) null);
        }

        public void u(D9.a aVar) {
            C3685a0 a0Var = C3685a0.this;
            D0 unused = a0Var.f45489r0 = a0Var.f45489r0.b().I(aVar).F();
            D0 c02 = C3685a0.this.C0();
            if (!c02.equals(C3685a0.this.f45444P)) {
                D0 unused2 = C3685a0.this.f45444P = c02;
                C3685a0.this.f45476l.i(14, new C3691d0(this));
            }
            C3685a0.this.f45476l.i(28, new C3693e0(aVar));
            C3685a0.this.f45476l.f();
        }

        public void v(Surface surface) {
            C3685a0.this.O1(surface);
        }

        public void w(int i10, boolean z10) {
            C3685a0.this.f45476l.k(30, new C3695f0(i10, z10));
        }

        public void x(float f10) {
            C3685a0.this.F1();
        }

        public void y(int i10) {
            boolean u10 = C3685a0.this.u();
            C3685a0.this.T1(u10, i10, C3685a0.Q0(u10, i10));
        }

        public void z(boolean z10) {
            C3685a0.this.W1();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    private void V1(boolean z10) {
    }
}
