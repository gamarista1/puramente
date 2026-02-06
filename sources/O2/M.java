package o2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.C4770v;
import com.google.common.collect.g0;
import com.revenuecat.purchases.common.UtilsKt;
import f2.C1960A;
import f2.C1963D;
import f2.C1968c;
import f2.C1971f;
import f2.s;
import g2.C2009a;
import g2.b;
import i2.C2076a;
import i2.C2078c;
import i2.C2081f;
import i2.L;
import i2.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import n2.u1;
import o2.C2351A;
import o2.C2378y;
import o2.V;

public final class M implements C2378y {

    /* renamed from: n0  reason: collision with root package name */
    public static boolean f24819n0 = false;

    /* renamed from: o0  reason: collision with root package name */
    private static final Object f24820o0 = new Object();

    /* renamed from: p0  reason: collision with root package name */
    private static ExecutorService f24821p0;

    /* renamed from: q0  reason: collision with root package name */
    private static int f24822q0;

    /* renamed from: A  reason: collision with root package name */
    private k f24823A;

    /* renamed from: B  reason: collision with root package name */
    private C1968c f24824B;

    /* renamed from: C  reason: collision with root package name */
    private j f24825C;

    /* renamed from: D  reason: collision with root package name */
    private j f24826D;

    /* renamed from: E  reason: collision with root package name */
    private C1963D f24827E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f24828F;

    /* renamed from: G  reason: collision with root package name */
    private ByteBuffer f24829G;

    /* renamed from: H  reason: collision with root package name */
    private int f24830H;

    /* renamed from: I  reason: collision with root package name */
    private long f24831I;

    /* renamed from: J  reason: collision with root package name */
    private long f24832J;

    /* renamed from: K  reason: collision with root package name */
    private long f24833K;

    /* renamed from: L  reason: collision with root package name */
    private long f24834L;

    /* renamed from: M  reason: collision with root package name */
    private int f24835M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f24836N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f24837O;

    /* renamed from: P  reason: collision with root package name */
    private long f24838P;

    /* renamed from: Q  reason: collision with root package name */
    private float f24839Q;

    /* renamed from: R  reason: collision with root package name */
    private ByteBuffer f24840R;

    /* renamed from: S  reason: collision with root package name */
    private int f24841S;

    /* renamed from: T  reason: collision with root package name */
    private ByteBuffer f24842T;

    /* renamed from: U  reason: collision with root package name */
    private byte[] f24843U;

    /* renamed from: V  reason: collision with root package name */
    private int f24844V;

    /* renamed from: W  reason: collision with root package name */
    private boolean f24845W;

    /* renamed from: X  reason: collision with root package name */
    private boolean f24846X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public boolean f24847Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public boolean f24848Z;

    /* renamed from: a  reason: collision with root package name */
    private final Context f24849a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f24850a0;

    /* renamed from: b  reason: collision with root package name */
    private final g2.c f24851b;

    /* renamed from: b0  reason: collision with root package name */
    private int f24852b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24853c;

    /* renamed from: c0  reason: collision with root package name */
    private C1971f f24854c0;

    /* renamed from: d  reason: collision with root package name */
    private final C2352B f24855d;

    /* renamed from: d0  reason: collision with root package name */
    private C2364j f24856d0;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24857e;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f24858e0;

    /* renamed from: f  reason: collision with root package name */
    private final C4770v f24859f;

    /* renamed from: f0  reason: collision with root package name */
    private long f24860f0;

    /* renamed from: g  reason: collision with root package name */
    private final C4770v f24861g;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public long f24862g0;

    /* renamed from: h  reason: collision with root package name */
    private final C2081f f24863h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f24864h0;

    /* renamed from: i  reason: collision with root package name */
    private final C2351A f24865i;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f24866i0;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque f24867j;

    /* renamed from: j0  reason: collision with root package name */
    private Looper f24868j0;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f24869k;

    /* renamed from: k0  reason: collision with root package name */
    private long f24870k0;

    /* renamed from: l  reason: collision with root package name */
    private int f24871l;

    /* renamed from: l0  reason: collision with root package name */
    private long f24872l0;

    /* renamed from: m  reason: collision with root package name */
    private n f24873m;

    /* renamed from: m0  reason: collision with root package name */
    private Handler f24874m0;

    /* renamed from: n  reason: collision with root package name */
    private final l f24875n;

    /* renamed from: o  reason: collision with root package name */
    private final l f24876o;

    /* renamed from: p  reason: collision with root package name */
    private final e f24877p;

    /* renamed from: q  reason: collision with root package name */
    private final d f24878q;

    /* renamed from: r  reason: collision with root package name */
    private final ExoPlayer.a f24879r;

    /* renamed from: s  reason: collision with root package name */
    private u1 f24880s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C2378y.d f24881t;

    /* renamed from: u  reason: collision with root package name */
    private g f24882u;

    /* renamed from: v  reason: collision with root package name */
    private g f24883v;

    /* renamed from: w  reason: collision with root package name */
    private C2009a f24884w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public AudioTrack f24885x;

    /* renamed from: y  reason: collision with root package name */
    private C2359e f24886y;

    /* renamed from: z  reason: collision with root package name */
    private C2363i f24887z;

    private static final class b {
        public static void a(AudioTrack audioTrack, C2364j jVar) {
            AudioDeviceInfo audioDeviceInfo;
            if (jVar == null) {
                audioDeviceInfo = null;
            } else {
                audioDeviceInfo = jVar.f25011a;
            }
            audioTrack.setPreferredDevice(audioDeviceInfo);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a10);
            }
        }
    }

    public interface d {
        C2365k a(s sVar, C1968c cVar);
    }

    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f24888a = new V.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f24889a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C2359e f24890b = C2359e.f24987c;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public g2.c f24891c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f24892d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f24893e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24894f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public e f24895g = e.f24888a;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public d f24896h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public ExoPlayer.a f24897i;

        public f(Context context) {
            this.f24889a = context;
        }

        public M i() {
            C2076a.g(!this.f24894f);
            this.f24894f = true;
            if (this.f24891c == null) {
                this.f24891c = new h(new g2.b[0]);
            }
            if (this.f24896h == null) {
                this.f24896h = new C2354D(this.f24889a);
            }
            return new M(this);
        }

        public f j(boolean z10) {
            this.f24893e = z10;
            return this;
        }

        public f k(boolean z10) {
            this.f24892d = z10;
            return this;
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final s f24898a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24899b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24900c;

        /* renamed from: d  reason: collision with root package name */
        public final int f24901d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24902e;

        /* renamed from: f  reason: collision with root package name */
        public final int f24903f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24904g;

        /* renamed from: h  reason: collision with root package name */
        public final int f24905h;

        /* renamed from: i  reason: collision with root package name */
        public final C2009a f24906i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f24907j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f24908k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f24909l;

        public g(s sVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, C2009a aVar, boolean z10, boolean z11, boolean z12) {
            this.f24898a = sVar;
            this.f24899b = i10;
            this.f24900c = i11;
            this.f24901d = i12;
            this.f24902e = i13;
            this.f24903f = i14;
            this.f24904g = i15;
            this.f24905h = i16;
            this.f24906i = aVar;
            this.f24907j = z10;
            this.f24908k = z11;
            this.f24909l = z12;
        }

        private AudioTrack e(C1968c cVar, int i10) {
            int i11 = L.f22072a;
            if (i11 >= 29) {
                return g(cVar, i10);
            }
            if (i11 >= 21) {
                return f(cVar, i10);
            }
            return h(cVar, i10);
        }

        private AudioTrack f(C1968c cVar, int i10) {
            return new AudioTrack(j(cVar, this.f24909l), L.K(this.f24902e, this.f24903f, this.f24904g), this.f24905h, 1, i10);
        }

        private AudioTrack g(C1968c cVar, int i10) {
            AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(j(cVar, this.f24909l)).setAudioFormat(L.K(this.f24902e, this.f24903f, this.f24904g));
            boolean z10 = true;
            AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f24905h).setSessionId(i10);
            if (this.f24900c != 1) {
                z10 = false;
            }
            return sessionId.setOffloadedPlayback(z10).build();
        }

        private AudioTrack h(C1968c cVar, int i10) {
            int j02 = L.j0(cVar.f19959c);
            if (i10 == 0) {
                return new AudioTrack(j02, this.f24902e, this.f24903f, this.f24904g, this.f24905h, 1);
            }
            return new AudioTrack(j02, this.f24902e, this.f24903f, this.f24904g, this.f24905h, 1, i10);
        }

        private static AudioAttributes j(C1968c cVar, boolean z10) {
            if (z10) {
                return k();
            }
            return cVar.a().f19963a;
        }

        private static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(C1968c cVar, int i10) {
            try {
                AudioTrack e10 = e(cVar, i10);
                int state = e10.getState();
                if (state == 1) {
                    return e10;
                }
                try {
                    e10.release();
                } catch (Exception unused) {
                }
                throw new C2378y.c(state, this.f24902e, this.f24903f, this.f24905h, this.f24898a, m(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e11) {
                throw new C2378y.c(0, this.f24902e, this.f24903f, this.f24905h, this.f24898a, m(), e11);
            }
        }

        public C2378y.a b() {
            int i10 = this.f24904g;
            int i11 = this.f24902e;
            int i12 = this.f24903f;
            boolean z10 = this.f24909l;
            boolean z11 = true;
            if (this.f24900c != 1) {
                z11 = false;
            }
            return new C2378y.a(i10, i11, i12, z10, z11, this.f24905h);
        }

        public boolean c(g gVar) {
            if (gVar.f24900c == this.f24900c && gVar.f24904g == this.f24904g && gVar.f24902e == this.f24902e && gVar.f24903f == this.f24903f && gVar.f24901d == this.f24901d && gVar.f24907j == this.f24907j && gVar.f24908k == this.f24908k) {
                return true;
            }
            return false;
        }

        public g d(int i10) {
            return new g(this.f24898a, this.f24899b, this.f24900c, this.f24901d, this.f24902e, this.f24903f, this.f24904g, i10, this.f24906i, this.f24907j, this.f24908k, this.f24909l);
        }

        public long i(long j10) {
            return L.T0(j10, this.f24902e);
        }

        public long l(long j10) {
            return L.T0(j10, this.f24898a.f20060C);
        }

        public boolean m() {
            if (this.f24900c == 1) {
                return true;
            }
            return false;
        }
    }

    public static class h implements g2.c {

        /* renamed from: a  reason: collision with root package name */
        private final g2.b[] f24910a;

        /* renamed from: b  reason: collision with root package name */
        private final Y f24911b;

        /* renamed from: c  reason: collision with root package name */
        private final g2.f f24912c;

        public h(g2.b... bVarArr) {
            this(bVarArr, new Y(), new g2.f());
        }

        public long a(long j10) {
            if (this.f24912c.a()) {
                return this.f24912c.g(j10);
            }
            return j10;
        }

        public g2.b[] b() {
            return this.f24910a;
        }

        public long c() {
            return this.f24911b.u();
        }

        public boolean d(boolean z10) {
            this.f24911b.D(z10);
            return z10;
        }

        public C1963D e(C1963D d10) {
            this.f24912c.i(d10.f19709a);
            this.f24912c.h(d10.f19710b);
            return d10;
        }

        public h(g2.b[] bVarArr, Y y10, g2.f fVar) {
            g2.b[] bVarArr2 = new g2.b[(bVarArr.length + 2)];
            this.f24910a = bVarArr2;
            System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
            this.f24911b = y10;
            this.f24912c = fVar;
            bVarArr2[bVarArr.length] = y10;
            bVarArr2[bVarArr.length + 1] = fVar;
        }
    }

    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        public final C1963D f24913a;

        /* renamed from: b  reason: collision with root package name */
        public final long f24914b;

        /* renamed from: c  reason: collision with root package name */
        public final long f24915c;

        private j(C1963D d10, long j10, long j11) {
            this.f24913a = d10;
            this.f24914b = j10;
            this.f24915c = j11;
        }
    }

    private static final class k {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f24916a;

        /* renamed from: b  reason: collision with root package name */
        private final C2363i f24917b;

        /* renamed from: c  reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f24918c = new Q(this);

        public k(AudioTrack audioTrack, C2363i iVar) {
            this.f24916a = audioTrack;
            this.f24917b = iVar;
            audioTrack.addOnRoutingChangedListener(this.f24918c, new Handler(Looper.myLooper()));
        }

        /* access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f24918c != null && audioRouting.getRoutedDevice() != null) {
                this.f24917b.i(audioRouting.getRoutedDevice());
            }
        }

        public void c() {
            this.f24916a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) C2076a.e(this.f24918c));
            this.f24918c = null;
        }
    }

    private static final class l {

        /* renamed from: a  reason: collision with root package name */
        private final long f24919a;

        /* renamed from: b  reason: collision with root package name */
        private Exception f24920b;

        /* renamed from: c  reason: collision with root package name */
        private long f24921c;

        public l(long j10) {
            this.f24919a = j10;
        }

        public void a() {
            this.f24920b = null;
        }

        public void b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f24920b == null) {
                this.f24920b = exc;
                this.f24921c = this.f24919a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f24921c) {
                Exception exc2 = this.f24920b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f24920b;
                a();
                throw exc3;
            }
        }
    }

    private final class m implements C2351A.a {
        private m() {
        }

        public void a(int i10, long j10) {
            if (M.this.f24881t != null) {
                M.this.f24881t.e(i10, j10, SystemClock.elapsedRealtime() - M.this.f24862g0);
            }
        }

        public void b(long j10) {
            p.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        public void c(long j10) {
            if (M.this.f24881t != null) {
                M.this.f24881t.c(j10);
            }
        }

        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + M.this.T() + ", " + M.this.U();
            if (!M.f24819n0) {
                p.h("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }

        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + M.this.T() + ", " + M.this.U();
            if (!M.f24819n0) {
                p.h("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }
    }

    private final class n {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f24923a = new Handler(Looper.myLooper());

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f24924b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ M f24926a;

            a(M m10) {
                this.f24926a = m10;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(M.this.f24885x) && M.this.f24881t != null && M.this.f24848Z) {
                    M.this.f24881t.g();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f24885x)) {
                    boolean unused = M.this.f24847Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f24885x) && M.this.f24881t != null && M.this.f24848Z) {
                    M.this.f24881t.g();
                }
            }
        }

        public n() {
            this.f24924b = new a(M.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f24923a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new U(handler), this.f24924b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f24924b);
            this.f24923a.removeCallbacksAndMessages((Object) null);
        }
    }

    private void L(long j10) {
        C1963D d10;
        boolean z10;
        if (!t0()) {
            if (r0()) {
                d10 = this.f24851b.e(this.f24827E);
            } else {
                d10 = C1963D.f19706d;
            }
            this.f24827E = d10;
        } else {
            d10 = C1963D.f19706d;
        }
        C1963D d11 = d10;
        if (r0()) {
            z10 = this.f24851b.d(this.f24828F);
        } else {
            z10 = false;
        }
        this.f24828F = z10;
        this.f24867j.add(new j(d11, Math.max(0, j10), this.f24883v.i(U())));
        q0();
        C2378y.d dVar = this.f24881t;
        if (dVar != null) {
            dVar.a(this.f24828F);
        }
    }

    private long M(long j10) {
        while (!this.f24867j.isEmpty() && j10 >= ((j) this.f24867j.getFirst()).f24915c) {
            this.f24826D = (j) this.f24867j.remove();
        }
        long j11 = j10 - this.f24826D.f24915c;
        if (this.f24867j.isEmpty()) {
            return this.f24826D.f24914b + this.f24851b.a(j11);
        }
        j jVar = (j) this.f24867j.getFirst();
        return jVar.f24914b - L.b0(jVar.f24915c - j10, this.f24826D.f24913a.f19709a);
    }

    private long N(long j10) {
        long c10 = this.f24851b.c();
        long i10 = j10 + this.f24883v.i(c10);
        long j11 = this.f24870k0;
        if (c10 > j11) {
            long i11 = this.f24883v.i(c10 - j11);
            this.f24870k0 = c10;
            V(i11);
        }
        return i10;
    }

    private AudioTrack O(g gVar) {
        try {
            AudioTrack a10 = gVar.a(this.f24824B, this.f24852b0);
            ExoPlayer.a aVar = this.f24879r;
            if (aVar != null) {
                aVar.z(Z(a10));
            }
            return a10;
        } catch (C2378y.c e10) {
            C2378y.d dVar = this.f24881t;
            if (dVar != null) {
                dVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack P() {
        try {
            return O((g) C2076a.e(this.f24883v));
        } catch (C2378y.c e10) {
            g gVar = this.f24883v;
            if (gVar.f24905h > 1000000) {
                g d10 = gVar.d(UtilsKt.MICROS_MULTIPLIER);
                try {
                    AudioTrack O10 = O(d10);
                    this.f24883v = d10;
                    return O10;
                } catch (C2378y.c e11) {
                    e10.addSuppressed(e11);
                    c0();
                    throw e10;
                }
            }
            c0();
            throw e10;
        }
    }

    private boolean Q() {
        if (!this.f24884w.f()) {
            ByteBuffer byteBuffer = this.f24842T;
            if (byteBuffer == null) {
                return true;
            }
            u0(byteBuffer, Long.MIN_VALUE);
            if (this.f24842T == null) {
                return true;
            }
            return false;
        }
        this.f24884w.h();
        h0(Long.MIN_VALUE);
        if (!this.f24884w.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f24842T;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            return true;
        }
        return false;
    }

    private static int R(int i10, int i11, int i12) {
        boolean z10;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        if (minBufferSize != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        return minBufferSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return z2.C2958b.e(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int S(int r2, java.nio.ByteBuffer r3) {
        /*
            r0 = 20
            if (r2 == r0) goto L_0x0063
            r0 = 30
            if (r2 == r0) goto L_0x005e
            r0 = -1
            r1 = 1024(0x400, float:1.435E-42)
            switch(r2) {
                case 5: goto L_0x0059;
                case 6: goto L_0x0059;
                case 7: goto L_0x005e;
                case 8: goto L_0x005e;
                case 9: goto L_0x0044;
                case 10: goto L_0x0043;
                case 11: goto L_0x0040;
                case 12: goto L_0x0040;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r2) {
                case 14: goto L_0x0031;
                case 15: goto L_0x002e;
                case 16: goto L_0x002d;
                case 17: goto L_0x0028;
                case 18: goto L_0x0059;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected audio encoding: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L_0x0028:
            int r2 = z2.C2959c.c(r3)
            return r2
        L_0x002d:
            return r1
        L_0x002e:
            r2 = 512(0x200, float:7.175E-43)
            return r2
        L_0x0031:
            int r2 = z2.C2958b.b(r3)
            if (r2 != r0) goto L_0x0039
            r2 = 0
            goto L_0x003f
        L_0x0039:
            int r2 = z2.C2958b.i(r3, r2)
            int r2 = r2 * 16
        L_0x003f:
            return r2
        L_0x0040:
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L_0x0043:
            return r1
        L_0x0044:
            int r2 = r3.position()
            int r2 = i2.L.N(r3, r2)
            int r2 = z2.F.m(r2)
            if (r2 == r0) goto L_0x0053
            return r2
        L_0x0053:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L_0x0059:
            int r2 = z2.C2958b.e(r3)
            return r2
        L_0x005e:
            int r2 = z2.C2971o.f(r3)
            return r2
        L_0x0063:
            int r2 = z2.H.h(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.M.S(int, java.nio.ByteBuffer):int");
    }

    /* access modifiers changed from: private */
    public long T() {
        g gVar = this.f24883v;
        if (gVar.f24900c == 0) {
            return this.f24831I / ((long) gVar.f24899b);
        }
        return this.f24832J;
    }

    /* access modifiers changed from: private */
    public long U() {
        g gVar = this.f24883v;
        if (gVar.f24900c == 0) {
            return L.k(this.f24833K, (long) gVar.f24901d);
        }
        return this.f24834L;
    }

    private void V(long j10) {
        this.f24872l0 += j10;
        if (this.f24874m0 == null) {
            this.f24874m0 = new Handler(Looper.myLooper());
        }
        this.f24874m0.removeCallbacksAndMessages((Object) null);
        this.f24874m0.postDelayed(new J(this), 100);
    }

    private boolean W() {
        boolean z10;
        C2363i iVar;
        u1 u1Var;
        if (!this.f24863h.d()) {
            return false;
        }
        AudioTrack P10 = P();
        this.f24885x = P10;
        if (Z(P10)) {
            i0(this.f24885x);
            g gVar = this.f24883v;
            if (gVar.f24908k) {
                AudioTrack audioTrack = this.f24885x;
                s sVar = gVar.f24898a;
                audioTrack.setOffloadDelayPadding(sVar.f20062E, sVar.f20063F);
            }
        }
        int i10 = L.f22072a;
        if (i10 >= 31 && (u1Var = this.f24880s) != null) {
            c.a(this.f24885x, u1Var);
        }
        this.f24852b0 = this.f24885x.getAudioSessionId();
        C2351A a10 = this.f24865i;
        AudioTrack audioTrack2 = this.f24885x;
        g gVar2 = this.f24883v;
        if (gVar2.f24900c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a10.s(audioTrack2, z10, gVar2.f24904g, gVar2.f24901d, gVar2.f24905h);
        n0();
        int i11 = this.f24854c0.f19969a;
        if (i11 != 0) {
            this.f24885x.attachAuxEffect(i11);
            this.f24885x.setAuxEffectSendLevel(this.f24854c0.f19970b);
        }
        C2364j jVar = this.f24856d0;
        if (jVar != null && i10 >= 23) {
            b.a(this.f24885x, jVar);
            C2363i iVar2 = this.f24887z;
            if (iVar2 != null) {
                iVar2.i(this.f24856d0.f25011a);
            }
        }
        if (i10 >= 24 && (iVar = this.f24887z) != null) {
            this.f24823A = new k(this.f24885x, iVar);
        }
        this.f24837O = true;
        C2378y.d dVar = this.f24881t;
        if (dVar != null) {
            dVar.q(this.f24883v.b());
        }
        return true;
    }

    private static boolean X(int i10) {
        if ((L.f22072a < 24 || i10 != -6) && i10 != -32) {
            return false;
        }
        return true;
    }

    private boolean Y() {
        if (this.f24885x != null) {
            return true;
        }
        return false;
    }

    private static boolean Z(AudioTrack audioTrack) {
        if (L.f22072a < 29 || !audioTrack.isOffloadedPlayback()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b0(AudioTrack audioTrack, C2378y.d dVar, Handler handler, C2378y.a aVar, C2081f fVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new L(dVar, aVar));
            }
            fVar.e();
            synchronized (f24820o0) {
                try {
                    int i10 = f24822q0 - 1;
                    f24822q0 = i10;
                    if (i10 == 0) {
                        f24821p0.shutdown();
                        f24821p0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new L(dVar, aVar));
            }
            fVar.e();
            synchronized (f24820o0) {
                int i11 = f24822q0 - 1;
                f24822q0 = i11;
                if (i11 == 0) {
                    f24821p0.shutdown();
                    f24821p0 = null;
                }
                throw th3;
            }
        } finally {
            while (true) {
            }
        }
    }

    private void c0() {
        if (this.f24883v.m()) {
            this.f24864h0 = true;
        }
    }

    /* access modifiers changed from: private */
    public void d0() {
        if (this.f24872l0 >= 300000) {
            this.f24881t.h();
            this.f24872l0 = 0;
        }
    }

    private void e0() {
        if (this.f24887z == null && this.f24849a != null) {
            this.f24868j0 = Looper.myLooper();
            C2363i iVar = new C2363i(this.f24849a, new K(this), this.f24824B, this.f24856d0);
            this.f24887z = iVar;
            this.f24886y = iVar.g();
        }
    }

    private void g0() {
        if (!this.f24846X) {
            this.f24846X = true;
            this.f24865i.g(U());
            if (Z(this.f24885x)) {
                this.f24847Y = false;
            }
            this.f24885x.stop();
            this.f24830H = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = r2.f24840R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.hasRemaining() != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r2.f24884w.i(r2.f24840R);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h0(long r3) {
        /*
            r2 = this;
            g2.a r0 = r2.f24884w
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0013
            java.nio.ByteBuffer r0 = r2.f24840R
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.nio.ByteBuffer r0 = g2.b.f20997a
        L_0x000f:
            r2.u0(r0, r3)
            return
        L_0x0013:
            g2.a r0 = r2.f24884w
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0044
        L_0x001b:
            g2.a r0 = r2.f24884w
            java.nio.ByteBuffer r0 = r0.d()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x0031
            r2.u0(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x001b
            return
        L_0x0031:
            java.nio.ByteBuffer r0 = r2.f24840R
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            g2.a r0 = r2.f24884w
            java.nio.ByteBuffer r1 = r2.f24840R
            r0.i(r1)
            goto L_0x0013
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.M.h0(long):void");
    }

    private void i0(AudioTrack audioTrack) {
        if (this.f24873m == null) {
            this.f24873m = new n();
        }
        this.f24873m.a(audioTrack);
    }

    private static void j0(AudioTrack audioTrack, C2081f fVar, C2378y.d dVar, C2378y.a aVar) {
        fVar.c();
        Handler handler = new Handler(Looper.myLooper());
        synchronized (f24820o0) {
            try {
                if (f24821p0 == null) {
                    f24821p0 = L.M0("ExoPlayer:AudioTrackReleaseThread");
                }
                f24822q0++;
                f24821p0.execute(new I(audioTrack, dVar, handler, aVar, fVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k0() {
        this.f24831I = 0;
        this.f24832J = 0;
        this.f24833K = 0;
        this.f24834L = 0;
        this.f24866i0 = false;
        this.f24835M = 0;
        this.f24826D = new j(this.f24827E, 0, 0);
        this.f24838P = 0;
        this.f24825C = null;
        this.f24867j.clear();
        this.f24840R = null;
        this.f24841S = 0;
        this.f24842T = null;
        this.f24846X = false;
        this.f24845W = false;
        this.f24847Y = false;
        this.f24829G = null;
        this.f24830H = 0;
        this.f24857e.n();
        q0();
    }

    private void l0(C1963D d10) {
        j jVar = new j(d10, -9223372036854775807L, -9223372036854775807L);
        if (Y()) {
            this.f24825C = jVar;
        } else {
            this.f24826D = jVar;
        }
    }

    private void m0() {
        if (Y()) {
            try {
                this.f24885x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f24827E.f19709a).setPitch(this.f24827E.f19710b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C1963D d10 = new C1963D(this.f24885x.getPlaybackParams().getSpeed(), this.f24885x.getPlaybackParams().getPitch());
            this.f24827E = d10;
            this.f24865i.t(d10.f19709a);
        }
    }

    private void n0() {
        if (Y()) {
            if (L.f22072a >= 21) {
                o0(this.f24885x, this.f24839Q);
            } else {
                p0(this.f24885x, this.f24839Q);
            }
        }
    }

    private static void o0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void p0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void q0() {
        C2009a aVar = this.f24883v.f24906i;
        this.f24884w = aVar;
        aVar.b();
    }

    private boolean r0() {
        if (!this.f24858e0) {
            g gVar = this.f24883v;
            if (gVar.f24900c != 0 || s0(gVar.f24898a.f20061D)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean s0(int i10) {
        if (!this.f24853c || !L.B0(i10)) {
            return false;
        }
        return true;
    }

    private boolean t0() {
        g gVar = this.f24883v;
        if (gVar == null || !gVar.f24907j || L.f22072a < 23) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u0(java.nio.ByteBuffer r13, long r14) {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.f24842T
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = r2
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            i2.C2076a.a(r0)
            goto L_0x003b
        L_0x0018:
            r12.f24842T = r13
            int r0 = i2.L.f22072a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.f24843U
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.f24843U = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.f24843U
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.f24844V = r3
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = i2.L.f22072a
            if (r4 >= r1) goto L_0x006d
            o2.A r14 = r12.f24865i
            long r4 = r12.f24833K
            int r14 = r14.c(r4)
            if (r14 <= 0) goto L_0x006b
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f24885x
            byte[] r1 = r12.f24843U
            int r4 = r12.f24844V
            int r14 = r15.write(r1, r4, r14)
            if (r14 <= 0) goto L_0x009d
            int r15 = r12.f24844V
            int r15 = r15 + r14
            r12.f24844V = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L_0x009d
        L_0x006b:
            r14 = r3
            goto L_0x009d
        L_0x006d:
            boolean r1 = r12.f24858e0
            if (r1 == 0) goto L_0x0097
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x007c
            r1 = r2
            goto L_0x007d
        L_0x007c:
            r1 = r3
        L_0x007d:
            i2.C2076a.g(r1)
            r4 = -9223372036854775808
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            long r14 = r12.f24860f0
        L_0x0088:
            r10 = r14
            goto L_0x008d
        L_0x008a:
            r12.f24860f0 = r14
            goto L_0x0088
        L_0x008d:
            android.media.AudioTrack r7 = r12.f24885x
            r6 = r12
            r8 = r13
            r9 = r0
            int r14 = r6.w0(r7, r8, r9, r10)
            goto L_0x009d
        L_0x0097:
            android.media.AudioTrack r14 = r12.f24885x
            int r14 = v0(r14, r13, r0)
        L_0x009d:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r12.f24862g0 = r4
            r4 = 0
            if (r14 >= 0) goto L_0x00e2
            boolean r13 = X(r14)
            if (r13 == 0) goto L_0x00c2
            long r0 = r12.U()
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b6
            goto L_0x00c3
        L_0x00b6:
            android.media.AudioTrack r13 = r12.f24885x
            boolean r13 = Z(r13)
            if (r13 == 0) goto L_0x00c2
            r12.c0()
            goto L_0x00c3
        L_0x00c2:
            r2 = r3
        L_0x00c3:
            o2.y$f r13 = new o2.y$f
            o2.M$g r15 = r12.f24883v
            f2.s r15 = r15.f24898a
            r13.<init>(r14, r15, r2)
            o2.y$d r14 = r12.f24881t
            if (r14 == 0) goto L_0x00d3
            r14.b(r13)
        L_0x00d3:
            boolean r14 = r13.f25063b
            if (r14 != 0) goto L_0x00dd
            o2.M$l r14 = r12.f24876o
            r14.b(r13)
            return
        L_0x00dd:
            o2.e r14 = o2.C2359e.f24987c
            r12.f24886y = r14
            throw r13
        L_0x00e2:
            o2.M$l r15 = r12.f24876o
            r15.a()
            android.media.AudioTrack r15 = r12.f24885x
            boolean r15 = Z(r15)
            if (r15 == 0) goto L_0x0108
            long r6 = r12.f24834L
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f7
            r12.f24866i0 = r3
        L_0x00f7:
            boolean r15 = r12.f24848Z
            if (r15 == 0) goto L_0x0108
            o2.y$d r15 = r12.f24881t
            if (r15 == 0) goto L_0x0108
            if (r14 >= r0) goto L_0x0108
            boolean r1 = r12.f24866i0
            if (r1 != 0) goto L_0x0108
            r15.d()
        L_0x0108:
            o2.M$g r15 = r12.f24883v
            int r15 = r15.f24900c
            if (r15 != 0) goto L_0x0114
            long r4 = r12.f24833K
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.f24833K = r4
        L_0x0114:
            if (r14 != r0) goto L_0x0130
            if (r15 == 0) goto L_0x012d
            java.nio.ByteBuffer r14 = r12.f24840R
            if (r13 != r14) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r2 = r3
        L_0x011e:
            i2.C2076a.g(r2)
            long r13 = r12.f24834L
            int r15 = r12.f24835M
            long r0 = (long) r15
            int r15 = r12.f24841S
            long r2 = (long) r15
            long r0 = r0 * r2
            long r13 = r13 + r0
            r12.f24834L = r13
        L_0x012d:
            r13 = 0
            r12.f24842T = r13
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.M.u0(java.nio.ByteBuffer, long):void");
    }

    private static int v0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (L.f22072a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f24829G == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f24829G = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f24829G.putInt(1431633921);
        }
        if (this.f24830H == 0) {
            this.f24829G.putInt(4, i10);
            this.f24829G.putLong(8, j10 * 1000);
            this.f24829G.position(0);
            this.f24830H = i10;
        }
        int remaining = this.f24829G.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f24829G, remaining, 1);
            if (write < 0) {
                this.f24830H = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int v02 = v0(audioTrack, byteBuffer, i10);
        if (v02 < 0) {
            this.f24830H = 0;
            return v02;
        }
        this.f24830H -= v02;
        return v02;
    }

    public C2365k A(s sVar) {
        if (this.f24864h0) {
            return C2365k.f25012d;
        }
        return this.f24878q.a(sVar, this.f24824B);
    }

    public boolean a(s sVar) {
        if (u(sVar) != 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (!Y() || (this.f24845W && !d())) {
            return true;
        }
        return false;
    }

    public C1963D c() {
        return this.f24827E;
    }

    public boolean d() {
        if (!Y() || ((L.f22072a >= 29 && this.f24885x.isOffloadedPlayback() && this.f24847Y) || !this.f24865i.h(U()))) {
            return false;
        }
        return true;
    }

    public void e(int i10) {
        boolean z10;
        if (this.f24852b0 != i10) {
            this.f24852b0 = i10;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24850a0 = z10;
            flush();
        }
    }

    public void f(C1963D d10) {
        this.f24827E = new C1963D(L.n(d10.f19709a, 0.1f, 8.0f), L.n(d10.f19710b, 0.1f, 8.0f));
        if (t0()) {
            m0();
        } else {
            l0(d10);
        }
    }

    public void f0(C2359e eVar) {
        String str;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f24868j0;
        if (looper != myLooper) {
            String str2 = "null";
            if (looper == null) {
                str = str2;
            } else {
                str = looper.getThread().getName();
            }
            if (myLooper != null) {
                str2 = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str2 + ") is not the playback looper (" + str + ")");
        } else if (!eVar.equals(this.f24886y)) {
            this.f24886y = eVar;
            C2378y.d dVar = this.f24881t;
            if (dVar != null) {
                dVar.i();
            }
        }
    }

    public void flush() {
        k kVar;
        if (Y()) {
            k0();
            if (this.f24865i.i()) {
                this.f24885x.pause();
            }
            if (Z(this.f24885x)) {
                ((n) C2076a.e(this.f24873m)).b(this.f24885x);
            }
            int i10 = L.f22072a;
            if (i10 < 21 && !this.f24850a0) {
                this.f24852b0 = 0;
            }
            C2378y.a b10 = this.f24883v.b();
            g gVar = this.f24882u;
            if (gVar != null) {
                this.f24883v = gVar;
                this.f24882u = null;
            }
            this.f24865i.q();
            if (i10 >= 24 && (kVar = this.f24823A) != null) {
                kVar.c();
                this.f24823A = null;
            }
            j0(this.f24885x, this.f24863h, this.f24881t, b10);
            this.f24885x = null;
        }
        this.f24876o.a();
        this.f24875n.a();
        this.f24870k0 = 0;
        this.f24872l0 = 0;
        Handler handler = this.f24874m0;
        if (handler != null) {
            ((Handler) C2076a.e(handler)).removeCallbacksAndMessages((Object) null);
        }
    }

    public void g() {
        if (this.f24858e0) {
            this.f24858e0 = false;
            flush();
        }
    }

    public boolean h(ByteBuffer byteBuffer, long j10, int i10) {
        boolean z10;
        boolean z11;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.f24840R;
        if (byteBuffer3 == null || byteBuffer2 == byteBuffer3) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        if (this.f24882u != null) {
            if (!Q()) {
                return false;
            }
            if (!this.f24882u.c(this.f24883v)) {
                g0();
                if (d()) {
                    return false;
                }
                flush();
            } else {
                this.f24883v = this.f24882u;
                this.f24882u = null;
                AudioTrack audioTrack = this.f24885x;
                if (audioTrack != null && Z(audioTrack) && this.f24883v.f24908k) {
                    if (this.f24885x.getPlayState() == 3) {
                        this.f24885x.setOffloadEndOfStream();
                        this.f24865i.a();
                    }
                    AudioTrack audioTrack2 = this.f24885x;
                    s sVar = this.f24883v.f24898a;
                    audioTrack2.setOffloadDelayPadding(sVar.f20062E, sVar.f20063F);
                    this.f24866i0 = true;
                }
            }
            L(j11);
        }
        if (!Y()) {
            try {
                if (!W()) {
                    return false;
                }
            } catch (C2378y.c e10) {
                C2378y.c cVar = e10;
                if (!cVar.f25058b) {
                    this.f24875n.b(cVar);
                    return false;
                }
                throw cVar;
            }
        }
        this.f24875n.a();
        if (this.f24837O) {
            this.f24838P = Math.max(0, j11);
            this.f24836N = false;
            this.f24837O = false;
            if (t0()) {
                m0();
            }
            L(j11);
            if (this.f24848Z) {
                l();
            }
        }
        if (!this.f24865i.k(U())) {
            return false;
        }
        if (this.f24840R == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.a(z11);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f24883v;
            if (gVar.f24900c != 0 && this.f24835M == 0) {
                int S10 = S(gVar.f24904g, byteBuffer2);
                this.f24835M = S10;
                if (S10 == 0) {
                    return true;
                }
            }
            if (this.f24825C != null) {
                if (!Q()) {
                    return false;
                }
                L(j11);
                this.f24825C = null;
            }
            long l10 = this.f24838P + this.f24883v.l(T() - this.f24857e.m());
            if (!this.f24836N && Math.abs(l10 - j11) > 200000) {
                C2378y.d dVar = this.f24881t;
                if (dVar != null) {
                    dVar.b(new C2378y.e(j11, l10));
                }
                this.f24836N = true;
            }
            if (this.f24836N) {
                if (!Q()) {
                    return false;
                }
                long j12 = j11 - l10;
                this.f24838P += j12;
                this.f24836N = false;
                L(j11);
                C2378y.d dVar2 = this.f24881t;
                if (!(dVar2 == null || j12 == 0)) {
                    dVar2.f();
                }
            }
            if (this.f24883v.f24900c == 0) {
                this.f24831I += (long) byteBuffer.remaining();
            } else {
                this.f24832J += ((long) this.f24835M) * ((long) i11);
            }
            this.f24840R = byteBuffer2;
            this.f24841S = i11;
        }
        h0(j11);
        if (!this.f24840R.hasRemaining()) {
            this.f24840R = null;
            this.f24841S = 0;
            return true;
        } else if (!this.f24865i.j(U())) {
            return false;
        } else {
            p.h("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void i() {
        if (!this.f24845W && Y() && Q()) {
            g0();
            this.f24845W = true;
        }
    }

    public long j(boolean z10) {
        if (!Y() || this.f24837O) {
            return Long.MIN_VALUE;
        }
        return N(M(Math.min(this.f24865i.d(z10), this.f24883v.i(U()))));
    }

    public void k() {
        this.f24836N = true;
    }

    public void l() {
        this.f24848Z = true;
        if (Y()) {
            this.f24865i.v();
            this.f24885x.play();
        }
    }

    public void m(float f10) {
        if (this.f24839Q != f10) {
            this.f24839Q = f10;
            n0();
        }
    }

    public void n() {
        boolean z10;
        if (L.f22072a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        C2076a.g(this.f24850a0);
        if (!this.f24858e0) {
            this.f24858e0 = true;
            flush();
        }
    }

    public void o(boolean z10) {
        C1963D d10;
        this.f24828F = z10;
        if (t0()) {
            d10 = C1963D.f19706d;
        } else {
            d10 = this.f24827E;
        }
        l0(d10);
    }

    public void p(AudioDeviceInfo audioDeviceInfo) {
        C2364j jVar;
        if (audioDeviceInfo == null) {
            jVar = null;
        } else {
            jVar = new C2364j(audioDeviceInfo);
        }
        this.f24856d0 = jVar;
        C2363i iVar = this.f24887z;
        if (iVar != null) {
            iVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f24885x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f24856d0);
        }
    }

    public void pause() {
        this.f24848Z = false;
        if (!Y()) {
            return;
        }
        if (this.f24865i.p() || Z(this.f24885x)) {
            this.f24885x.pause();
        }
    }

    public void q(int i10) {
        boolean z10;
        if (L.f22072a >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f24871l = i10;
    }

    public void r(C2078c cVar) {
        this.f24865i.u(cVar);
    }

    public void release() {
        C2363i iVar = this.f24887z;
        if (iVar != null) {
            iVar.j();
        }
    }

    public void reset() {
        flush();
        g0 m10 = this.f24859f.iterator();
        while (m10.hasNext()) {
            ((g2.b) m10.next()).reset();
        }
        g0 m11 = this.f24861g.iterator();
        while (m11.hasNext()) {
            ((g2.b) m11.next()).reset();
        }
        C2009a aVar = this.f24884w;
        if (aVar != null) {
            aVar.j();
        }
        this.f24848Z = false;
        this.f24864h0 = false;
    }

    public void s(C1971f fVar) {
        if (!this.f24854c0.equals(fVar)) {
            int i10 = fVar.f19969a;
            float f10 = fVar.f19970b;
            AudioTrack audioTrack = this.f24885x;
            if (audioTrack != null) {
                if (this.f24854c0.f19969a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f24885x.setAuxEffectSendLevel(f10);
                }
            }
            this.f24854c0 = fVar;
        }
    }

    public void t(u1 u1Var) {
        this.f24880s = u1Var;
    }

    public int u(s sVar) {
        e0();
        if ("audio/raw".equals(sVar.f20083n)) {
            if (!L.C0(sVar.f20061D)) {
                p.h("DefaultAudioSink", "Invalid PCM encoding: " + sVar.f20061D);
                return 0;
            }
            int i10 = sVar.f20061D;
            if (i10 == 2 || (this.f24853c && i10 == 4)) {
                return 2;
            }
            return 1;
        } else if (this.f24886y.k(sVar, this.f24824B)) {
            return 2;
        } else {
            return 0;
        }
    }

    public void v(int i10, int i11) {
        g gVar;
        AudioTrack audioTrack = this.f24885x;
        if (audioTrack != null && Z(audioTrack) && (gVar = this.f24883v) != null && gVar.f24908k) {
            this.f24885x.setOffloadDelayPadding(i10, i11);
        }
    }

    public void x(C1968c cVar) {
        if (!this.f24824B.equals(cVar)) {
            this.f24824B = cVar;
            if (!this.f24858e0) {
                C2363i iVar = this.f24887z;
                if (iVar != null) {
                    iVar.h(cVar);
                }
                flush();
            }
        }
    }

    public void y(s sVar, int i10, int[] iArr) {
        boolean z10;
        boolean z11;
        C2009a aVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        double d10;
        C2365k kVar;
        int[] iArr2;
        s sVar2 = sVar;
        e0();
        if ("audio/raw".equals(sVar2.f20083n)) {
            C2076a.a(L.C0(sVar2.f20061D));
            i16 = L.f0(sVar2.f20061D, sVar2.f20059B);
            C4770v.a aVar2 = new C4770v.a();
            if (s0(sVar2.f20061D)) {
                aVar2.j(this.f24861g);
            } else {
                aVar2.j(this.f24859f);
                aVar2.i(this.f24851b.b());
            }
            C2009a aVar3 = new C2009a(aVar2.k());
            if (aVar3.equals(this.f24884w)) {
                aVar3 = this.f24884w;
            }
            this.f24857e.o(sVar2.f20062E, sVar2.f20063F);
            if (L.f22072a < 21 && sVar2.f20059B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i23 = 0; i23 < 6; i23++) {
                    iArr2[i23] = i23;
                }
            } else {
                iArr2 = iArr;
            }
            this.f24855d.m(iArr2);
            try {
                b.a a10 = aVar3.a(new b.a(sVar2));
                int i24 = a10.f21001c;
                int i25 = a10.f20999a;
                int L10 = L.L(a10.f21000b);
                i11 = 0;
                z10 = false;
                i13 = L.f0(i24, a10.f21000b);
                aVar = aVar3;
                i12 = i25;
                i14 = L10;
                z11 = this.f24869k;
                i15 = i24;
            } catch (b.C0349b e10) {
                throw new C2378y.b((Throwable) e10, sVar2);
            }
        } else {
            C2009a aVar4 = new C2009a(C4770v.E());
            int i26 = sVar2.f20060C;
            if (this.f24871l != 0) {
                kVar = A(sVar);
            } else {
                kVar = C2365k.f25012d;
            }
            if (this.f24871l == 0 || !kVar.f25013a) {
                Pair i27 = this.f24886y.i(sVar2, this.f24824B);
                if (i27 != null) {
                    int intValue = ((Integer) i27.first).intValue();
                    aVar = aVar4;
                    i16 = -1;
                    i13 = -1;
                    z10 = false;
                    i12 = i26;
                    i14 = ((Integer) i27.second).intValue();
                    i15 = intValue;
                    z11 = this.f24869k;
                    i11 = 2;
                } else {
                    throw new C2378y.b("Unable to configure passthrough for: " + sVar2, sVar2);
                }
            } else {
                int d11 = C1960A.d((String) C2076a.e(sVar2.f20083n), sVar2.f20079j);
                int L11 = L.L(sVar2.f20059B);
                aVar = aVar4;
                i16 = -1;
                i13 = -1;
                i11 = 1;
                z11 = true;
                i12 = i26;
                z10 = kVar.f25014b;
                i15 = d11;
                i14 = L11;
            }
        }
        if (i15 == 0) {
            throw new C2378y.b("Invalid output encoding (mode=" + i11 + ") for: " + sVar2, sVar2);
        } else if (i14 != 0) {
            int i28 = sVar2.f20078i;
            if ("audio/vnd.dts.hd;profile=lbr".equals(sVar2.f20083n) && i28 == -1) {
                i28 = 768000;
            }
            int i29 = i28;
            if (i10 != 0) {
                i21 = i10;
                i19 = i15;
                i18 = i14;
                i17 = i13;
                i20 = i12;
            } else {
                e eVar = this.f24877p;
                int R10 = R(i12, i14, i15);
                if (i13 != -1) {
                    i22 = i13;
                } else {
                    i22 = 1;
                }
                if (z11) {
                    d10 = 8.0d;
                } else {
                    d10 = 1.0d;
                }
                i19 = i15;
                i18 = i14;
                int i30 = i29;
                i17 = i13;
                i20 = i12;
                i21 = eVar.a(R10, i15, i11, i22, i12, i30, d10);
            }
            this.f24864h0 = false;
            g gVar = r2;
            g gVar2 = new g(sVar, i16, i11, i17, i20, i18, i19, i21, aVar, z11, z10, this.f24858e0);
            if (Y()) {
                this.f24882u = gVar;
            } else {
                this.f24883v = gVar;
            }
        } else {
            throw new C2378y.b("Invalid output channel config (mode=" + i11 + ") for: " + sVar2, sVar2);
        }
    }

    public void z(C2378y.d dVar) {
        this.f24881t = dVar;
    }

    private M(f fVar) {
        C2359e eVar;
        Context a10 = fVar.f24889a;
        this.f24849a = a10;
        C1968c cVar = C1968c.f19951g;
        this.f24824B = cVar;
        if (a10 != null) {
            eVar = C2359e.e(a10, cVar, (AudioDeviceInfo) null);
        } else {
            eVar = fVar.f24890b;
        }
        this.f24886y = eVar;
        this.f24851b = fVar.f24891c;
        int i10 = L.f22072a;
        boolean z10 = true;
        this.f24853c = i10 >= 21 && fVar.f24892d;
        this.f24869k = (i10 < 23 || !fVar.f24893e) ? false : z10;
        this.f24871l = 0;
        this.f24877p = fVar.f24895g;
        this.f24878q = (d) C2076a.e(fVar.f24896h);
        C2081f fVar2 = new C2081f(C2078c.f22089a);
        this.f24863h = fVar2;
        fVar2.e();
        this.f24865i = new C2351A(new m());
        C2352B b10 = new C2352B();
        this.f24855d = b10;
        a0 a0Var = new a0();
        this.f24857e = a0Var;
        this.f24859f = C4770v.N(new g2.g(), b10, a0Var);
        this.f24861g = C4770v.H(new Z());
        this.f24839Q = 1.0f;
        this.f24852b0 = 0;
        this.f24854c0 = new C1971f(0, 0.0f);
        C1963D d10 = C1963D.f19706d;
        this.f24826D = new j(d10, 0, 0);
        this.f24827E = d10;
        this.f24828F = false;
        this.f24867j = new ArrayDeque();
        this.f24875n = new l(100);
        this.f24876o = new l(100);
        this.f24879r = fVar.f24897i;
    }
}
