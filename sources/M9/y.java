package m9;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.revenuecat.purchases.common.UtilsKt;
import ja.C3645a;
import ja.C3648d;
import ja.C3651g;
import ja.M;
import ja.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import k9.C3717q0;
import k9.S0;
import l9.s0;
import m9.C3849g;
import m9.s;
import m9.u;
import m9.z;
import o2.U;

public final class y implements s {

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f46747c0 = false;

    /* renamed from: A  reason: collision with root package name */
    private int f46748A;

    /* renamed from: B  reason: collision with root package name */
    private long f46749B;

    /* renamed from: C  reason: collision with root package name */
    private long f46750C;

    /* renamed from: D  reason: collision with root package name */
    private long f46751D;

    /* renamed from: E  reason: collision with root package name */
    private long f46752E;

    /* renamed from: F  reason: collision with root package name */
    private int f46753F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f46754G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f46755H;

    /* renamed from: I  reason: collision with root package name */
    private long f46756I;

    /* renamed from: J  reason: collision with root package name */
    private float f46757J;

    /* renamed from: K  reason: collision with root package name */
    private C3849g[] f46758K;

    /* renamed from: L  reason: collision with root package name */
    private ByteBuffer[] f46759L;

    /* renamed from: M  reason: collision with root package name */
    private ByteBuffer f46760M;

    /* renamed from: N  reason: collision with root package name */
    private int f46761N;

    /* renamed from: O  reason: collision with root package name */
    private ByteBuffer f46762O;

    /* renamed from: P  reason: collision with root package name */
    private byte[] f46763P;

    /* renamed from: Q  reason: collision with root package name */
    private int f46764Q;

    /* renamed from: R  reason: collision with root package name */
    private int f46765R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f46766S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f46767T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public boolean f46768U;

    /* renamed from: V  reason: collision with root package name */
    private boolean f46769V;

    /* renamed from: W  reason: collision with root package name */
    private int f46770W;

    /* renamed from: X  reason: collision with root package name */
    private v f46771X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f46772Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public long f46773Z;

    /* renamed from: a  reason: collision with root package name */
    private final C3848f f46774a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f46775a0;

    /* renamed from: b  reason: collision with root package name */
    private final c f46776b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f46777b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46778c;

    /* renamed from: d  reason: collision with root package name */
    private final x f46779d;

    /* renamed from: e  reason: collision with root package name */
    private final J f46780e;

    /* renamed from: f  reason: collision with root package name */
    private final C3849g[] f46781f;

    /* renamed from: g  reason: collision with root package name */
    private final C3849g[] f46782g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C3651g f46783h;

    /* renamed from: i  reason: collision with root package name */
    private final u f46784i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque f46785j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f46786k;

    /* renamed from: l  reason: collision with root package name */
    private final int f46787l;

    /* renamed from: m  reason: collision with root package name */
    private l f46788m;

    /* renamed from: n  reason: collision with root package name */
    private final j f46789n;

    /* renamed from: o  reason: collision with root package name */
    private final j f46790o;

    /* renamed from: p  reason: collision with root package name */
    private final d f46791p;

    /* renamed from: q  reason: collision with root package name */
    private s0 f46792q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public s.c f46793r;

    /* renamed from: s  reason: collision with root package name */
    private f f46794s;

    /* renamed from: t  reason: collision with root package name */
    private f f46795t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public AudioTrack f46796u;

    /* renamed from: v  reason: collision with root package name */
    private C3847e f46797v;

    /* renamed from: w  reason: collision with root package name */
    private i f46798w;

    /* renamed from: x  reason: collision with root package name */
    private i f46799x;

    /* renamed from: y  reason: collision with root package name */
    private S0 f46800y;

    /* renamed from: z  reason: collision with root package name */
    private ByteBuffer f46801z;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f46802a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f46802a = audioTrack;
        }

        public void run() {
            try {
                this.f46802a.flush();
                this.f46802a.release();
            } finally {
                y.this.f46783h.e();
            }
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, s0 s0Var) {
            LogSessionId a10 = s0Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a10);
            }
        }
    }

    public interface c {
        long a(long j10);

        C3849g[] b();

        long c();

        boolean d(boolean z10);

        S0 e(S0 s02);
    }

    interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46804a = new z.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C3848f f46805a = C3848f.f46645c;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public c f46806b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f46807c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f46808d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f46809e = 0;

        /* renamed from: f  reason: collision with root package name */
        d f46810f = d.f46804a;

        public y f() {
            if (this.f46806b == null) {
                this.f46806b = new g(new C3849g[0]);
            }
            return new y(this, (a) null);
        }

        public e g(C3848f fVar) {
            C3645a.e(fVar);
            this.f46805a = fVar;
            return this;
        }

        public e h(boolean z10) {
            this.f46808d = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f46807c = z10;
            return this;
        }

        public e j(int i10) {
            this.f46809e = i10;
            return this;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final C3717q0 f46811a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46812b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46813c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46814d;

        /* renamed from: e  reason: collision with root package name */
        public final int f46815e;

        /* renamed from: f  reason: collision with root package name */
        public final int f46816f;

        /* renamed from: g  reason: collision with root package name */
        public final int f46817g;

        /* renamed from: h  reason: collision with root package name */
        public final int f46818h;

        /* renamed from: i  reason: collision with root package name */
        public final C3849g[] f46819i;

        public f(C3717q0 q0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, C3849g[] gVarArr) {
            this.f46811a = q0Var;
            this.f46812b = i10;
            this.f46813c = i11;
            this.f46814d = i12;
            this.f46815e = i13;
            this.f46816f = i14;
            this.f46817g = i15;
            this.f46818h = i16;
            this.f46819i = gVarArr;
        }

        private AudioTrack d(boolean z10, C3847e eVar, int i10) {
            int i11 = M.f44981a;
            if (i11 >= 29) {
                return f(z10, eVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, eVar, i10);
            }
            return g(eVar, i10);
        }

        private AudioTrack e(boolean z10, C3847e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), y.L(this.f46815e, this.f46816f, this.f46817g), this.f46818h, 1, i10);
        }

        private AudioTrack f(boolean z10, C3847e eVar, int i10) {
            AudioFormat B10 = y.L(this.f46815e, this.f46816f, this.f46817g);
            AudioAttributes i11 = i(eVar, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i11).setAudioFormat(B10).setTransferMode(1).setBufferSizeInBytes(this.f46818h).setSessionId(i10);
            if (this.f46813c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        private AudioTrack g(C3847e eVar, int i10) {
            int g02 = M.g0(eVar.f46635c);
            if (i10 == 0) {
                return new AudioTrack(g02, this.f46815e, this.f46816f, this.f46817g, this.f46818h, 1);
            }
            return new AudioTrack(g02, this.f46815e, this.f46816f, this.f46817g, this.f46818h, 1, i10);
        }

        private static AudioAttributes i(C3847e eVar, boolean z10) {
            if (z10) {
                return j();
            }
            return eVar.b().f46639a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, C3847e eVar, int i10) {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new s.b(state, this.f46815e, this.f46816f, this.f46818h, this.f46811a, l(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new s.b(0, this.f46815e, this.f46816f, this.f46818h, this.f46811a, l(), e10);
            }
        }

        public boolean b(f fVar) {
            if (fVar.f46813c == this.f46813c && fVar.f46817g == this.f46817g && fVar.f46815e == this.f46815e && fVar.f46816f == this.f46816f && fVar.f46814d == this.f46814d) {
                return true;
            }
            return false;
        }

        public f c(int i10) {
            return new f(this.f46811a, this.f46812b, this.f46813c, this.f46814d, this.f46815e, this.f46816f, this.f46817g, i10, this.f46819i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / ((long) this.f46815e);
        }

        public long k(long j10) {
            return (j10 * 1000000) / ((long) this.f46811a.f45784z);
        }

        public boolean l() {
            if (this.f46813c == 1) {
                return true;
            }
            return false;
        }
    }

    public static class g implements c {

        /* renamed from: a  reason: collision with root package name */
        private final C3849g[] f46820a;

        /* renamed from: b  reason: collision with root package name */
        private final G f46821b;

        /* renamed from: c  reason: collision with root package name */
        private final I f46822c;

        public g(C3849g... gVarArr) {
            this(gVarArr, new G(), new I());
        }

        public long a(long j10) {
            return this.f46822c.g(j10);
        }

        public C3849g[] b() {
            return this.f46820a;
        }

        public long c() {
            return this.f46821b.p();
        }

        public boolean d(boolean z10) {
            this.f46821b.v(z10);
            return z10;
        }

        public S0 e(S0 s02) {
            this.f46822c.i(s02.f45374a);
            this.f46822c.h(s02.f45375b);
            return s02;
        }

        public g(C3849g[] gVarArr, G g10, I i10) {
            C3849g[] gVarArr2 = new C3849g[(gVarArr.length + 2)];
            this.f46820a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f46821b = g10;
            this.f46822c = i10;
            gVarArr2[gVarArr.length] = g10;
            gVarArr2[gVarArr.length + 1] = i10;
        }
    }

    public static final class h extends RuntimeException {
        /* synthetic */ h(String str, a aVar) {
            this(str);
        }

        private h(String str) {
            super(str);
        }
    }

    private static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final S0 f46823a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46824b;

        /* renamed from: c  reason: collision with root package name */
        public final long f46825c;

        /* renamed from: d  reason: collision with root package name */
        public final long f46826d;

        /* synthetic */ i(S0 s02, boolean z10, long j10, long j11, a aVar) {
            this(s02, z10, j10, j11);
        }

        private i(S0 s02, boolean z10, long j10, long j11) {
            this.f46823a = s02;
            this.f46824b = z10;
            this.f46825c = j10;
            this.f46826d = j11;
        }
    }

    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        private final long f46827a;

        /* renamed from: b  reason: collision with root package name */
        private Exception f46828b;

        /* renamed from: c  reason: collision with root package name */
        private long f46829c;

        public j(long j10) {
            this.f46827a = j10;
        }

        public void a() {
            this.f46828b = null;
        }

        public void b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f46828b == null) {
                this.f46828b = exc;
                this.f46829c = this.f46827a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f46829c) {
                Exception exc2 = this.f46828b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f46828b;
                a();
                throw exc3;
            }
        }
    }

    private final class k implements u.a {
        private k() {
        }

        public void a(int i10, long j10) {
            if (y.this.f46793r != null) {
                y.this.f46793r.e(i10, j10, SystemClock.elapsedRealtime() - y.this.f46773Z);
            }
        }

        public void b(long j10) {
            ja.s.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        public void c(long j10) {
            if (y.this.f46793r != null) {
                y.this.f46793r.c(j10);
            }
        }

        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + y.this.S() + ", " + y.this.T();
            if (!y.f46747c0) {
                ja.s.i("DefaultAudioSink", str);
                return;
            }
            throw new h(str, (a) null);
        }

        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + y.this.S() + ", " + y.this.T();
            if (!y.f46747c0) {
                ja.s.i("DefaultAudioSink", str);
                return;
            }
            throw new h(str, (a) null);
        }

        /* synthetic */ k(y yVar, a aVar) {
            this();
        }
    }

    private final class l {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f46831a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f46832b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f46834a;

            a(y yVar) {
                this.f46834a = yVar;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                boolean z10;
                if (audioTrack == y.this.f46796u) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                if (y.this.f46793r != null && y.this.f46768U) {
                    y.this.f46793r.g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                boolean z10;
                if (audioTrack == y.this.f46796u) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                if (y.this.f46793r != null && y.this.f46768U) {
                    y.this.f46793r.g();
                }
            }
        }

        public l() {
            this.f46832b = new a(y.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f46831a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new U(handler), this.f46832b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f46832b);
            this.f46831a.removeCallbacksAndMessages((Object) null);
        }
    }

    /* synthetic */ y(e eVar, a aVar) {
        this(eVar);
    }

    private void E(long j10) {
        S0 s02;
        boolean z10;
        if (j0()) {
            s02 = this.f46776b.e(M());
        } else {
            s02 = S0.f45372d;
        }
        S0 s03 = s02;
        if (j0()) {
            z10 = this.f46776b.d(R());
        } else {
            z10 = false;
        }
        this.f46785j.add(new i(s03, z10, Math.max(0, j10), this.f46795t.h(T()), (a) null));
        i0();
        s.c cVar = this.f46793r;
        if (cVar != null) {
            cVar.a(z10);
        }
    }

    private long F(long j10) {
        while (!this.f46785j.isEmpty() && j10 >= ((i) this.f46785j.getFirst()).f46826d) {
            this.f46799x = (i) this.f46785j.remove();
        }
        i iVar = this.f46799x;
        long j11 = j10 - iVar.f46826d;
        if (iVar.f46823a.equals(S0.f45372d)) {
            return this.f46799x.f46825c + j11;
        }
        if (this.f46785j.isEmpty()) {
            return this.f46799x.f46825c + this.f46776b.a(j11);
        }
        i iVar2 = (i) this.f46785j.getFirst();
        return iVar2.f46825c - M.a0(iVar2.f46826d - j10, this.f46799x.f46823a.f45374a);
    }

    private long G(long j10) {
        return j10 + this.f46795t.h(this.f46776b.c());
    }

    private AudioTrack H(f fVar) {
        try {
            return fVar.a(this.f46772Y, this.f46797v, this.f46770W);
        } catch (s.b e10) {
            s.c cVar = this.f46793r;
            if (cVar != null) {
                cVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack I() {
        try {
            return H((f) C3645a.e(this.f46795t));
        } catch (s.b e10) {
            f fVar = this.f46795t;
            if (fVar.f46818h > 1000000) {
                f c10 = fVar.c(UtilsKt.MICROS_MULTIPLIER);
                try {
                    AudioTrack H10 = H(c10);
                    this.f46795t = c10;
                    return H10;
                } catch (s.b e11) {
                    e10.addSuppressed(e11);
                    Y();
                    throw e10;
                }
            }
            Y();
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J() {
        /*
            r9 = this;
            int r0 = r9.f46765R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x000b
            r9.f46765R = r2
        L_0x0009:
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            int r4 = r9.f46765R
            m9.g[] r5 = r9.f46758K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.e()
        L_0x001f:
            r9.a0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r0 = r9.f46765R
            int r0 = r0 + r1
            r9.f46765R = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f46762O
            if (r0 == 0) goto L_0x003b
            r9.m0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f46762O
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r9.f46765R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.y.J():boolean");
    }

    private void K() {
        int i10 = 0;
        while (true) {
            C3849g[] gVarArr = this.f46758K;
            if (i10 < gVarArr.length) {
                C3849g gVar = gVarArr[i10];
                gVar.flush();
                this.f46759L[i10] = gVar.c();
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static AudioFormat L(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private S0 M() {
        return P().f46823a;
    }

    private static int N(int i10, int i11, int i12) {
        boolean z10;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        if (minBufferSize != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        return minBufferSize;
    }

    private static int O(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return C3844b.d(byteBuffer);
            case 7:
            case 8:
                return C3840A.e(byteBuffer);
            case 9:
                int m10 = D.m(M.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case StdKeyDeserializer.TYPE_URL:
                int a10 = C3844b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return C3844b.h(byteBuffer, a10) * 16;
            case StdKeyDeserializer.TYPE_CLASS:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C3845c.c(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
        }
    }

    private i P() {
        i iVar = this.f46798w;
        if (iVar != null) {
            return iVar;
        }
        if (!this.f46785j.isEmpty()) {
            return (i) this.f46785j.getLast();
        }
        return this.f46799x;
    }

    private int Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = M.f44981a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        if (i10 != 30 || !M.f44984d.startsWith("Pixel")) {
            return 1;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    public long S() {
        f fVar = this.f46795t;
        if (fVar.f46813c == 0) {
            return this.f46749B / ((long) fVar.f46812b);
        }
        return this.f46750C;
    }

    /* access modifiers changed from: private */
    public long T() {
        f fVar = this.f46795t;
        if (fVar.f46813c == 0) {
            return this.f46751D / ((long) fVar.f46814d);
        }
        return this.f46752E;
    }

    private boolean U() {
        boolean z10;
        s0 s0Var;
        if (!this.f46783h.d()) {
            return false;
        }
        AudioTrack I10 = I();
        this.f46796u = I10;
        if (X(I10)) {
            b0(this.f46796u);
            if (this.f46787l != 3) {
                AudioTrack audioTrack = this.f46796u;
                C3717q0 q0Var = this.f46795t.f46811a;
                audioTrack.setOffloadDelayPadding(q0Var.f45754B, q0Var.f45755C);
            }
        }
        if (M.f44981a >= 31 && (s0Var = this.f46792q) != null) {
            b.a(this.f46796u, s0Var);
        }
        this.f46770W = this.f46796u.getAudioSessionId();
        u uVar = this.f46784i;
        AudioTrack audioTrack2 = this.f46796u;
        f fVar = this.f46795t;
        if (fVar.f46813c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        uVar.s(audioTrack2, z10, fVar.f46817g, fVar.f46814d, fVar.f46818h);
        f0();
        int i10 = this.f46771X.f46736a;
        if (i10 != 0) {
            this.f46796u.attachAuxEffect(i10);
            this.f46796u.setAuxEffectSendLevel(this.f46771X.f46737b);
        }
        this.f46755H = true;
        return true;
    }

    private static boolean V(int i10) {
        if ((M.f44981a < 24 || i10 != -6) && i10 != -32) {
            return false;
        }
        return true;
    }

    private boolean W() {
        if (this.f46796u != null) {
            return true;
        }
        return false;
    }

    private static boolean X(AudioTrack audioTrack) {
        if (M.f44981a < 29 || !audioTrack.isOffloadedPlayback()) {
            return false;
        }
        return true;
    }

    private void Y() {
        if (this.f46795t.l()) {
            this.f46775a0 = true;
        }
    }

    private void Z() {
        if (!this.f46767T) {
            this.f46767T = true;
            this.f46784i.g(T());
            this.f46796u.stop();
            this.f46748A = 0;
        }
    }

    private void a0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.f46758K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f46759L[i10 - 1];
            } else {
                byteBuffer = this.f46760M;
                if (byteBuffer == null) {
                    byteBuffer = C3849g.f46651a;
                }
            }
            if (i10 == length) {
                m0(byteBuffer, j10);
            } else {
                C3849g gVar = this.f46758K[i10];
                if (i10 > this.f46765R) {
                    gVar.d(byteBuffer);
                }
                ByteBuffer c10 = gVar.c();
                this.f46759L[i10] = c10;
                if (c10.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    private void b0(AudioTrack audioTrack) {
        if (this.f46788m == null) {
            this.f46788m = new l();
        }
        this.f46788m.a(audioTrack);
    }

    private void c0() {
        this.f46749B = 0;
        this.f46750C = 0;
        this.f46751D = 0;
        this.f46752E = 0;
        this.f46777b0 = false;
        this.f46753F = 0;
        this.f46799x = new i(M(), R(), 0, 0, (a) null);
        this.f46756I = 0;
        this.f46798w = null;
        this.f46785j.clear();
        this.f46760M = null;
        this.f46761N = 0;
        this.f46762O = null;
        this.f46767T = false;
        this.f46766S = false;
        this.f46765R = -1;
        this.f46801z = null;
        this.f46748A = 0;
        this.f46780e.n();
        K();
    }

    private void d0(S0 s02, boolean z10) {
        i P10 = P();
        if (!s02.equals(P10.f46823a) || z10 != P10.f46824b) {
            i iVar = new i(s02, z10, -9223372036854775807L, -9223372036854775807L, (a) null);
            if (W()) {
                this.f46798w = iVar;
            } else {
                this.f46799x = iVar;
            }
        }
    }

    private void e0(S0 s02) {
        if (W()) {
            try {
                this.f46796u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(s02.f45374a).setPitch(s02.f45375b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                ja.s.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            s02 = new S0(this.f46796u.getPlaybackParams().getSpeed(), this.f46796u.getPlaybackParams().getPitch());
            this.f46784i.t(s02.f45374a);
        }
        this.f46800y = s02;
    }

    private void f0() {
        if (W()) {
            if (M.f44981a >= 21) {
                g0(this.f46796u, this.f46757J);
            } else {
                h0(this.f46796u, this.f46757J);
            }
        }
    }

    private static void g0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void h0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void i0() {
        C3849g[] gVarArr = this.f46795t.f46819i;
        ArrayList arrayList = new ArrayList();
        for (C3849g gVar : gVarArr) {
            if (gVar.a()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.f46758K = (C3849g[]) arrayList.toArray(new C3849g[size]);
        this.f46759L = new ByteBuffer[size];
        K();
    }

    private boolean j0() {
        if (this.f46772Y || !"audio/raw".equals(this.f46795t.f46811a.f45770l) || k0(this.f46795t.f46811a.f45753A)) {
            return false;
        }
        return true;
    }

    private boolean k0(int i10) {
        if (!this.f46778c || !M.u0(i10)) {
            return false;
        }
        return true;
    }

    private boolean l0(C3717q0 q0Var, C3847e eVar) {
        int f10;
        int G10;
        int Q10;
        boolean z10;
        boolean z11;
        if (M.f44981a < 29 || this.f46787l == 0 || (f10 = w.f((String) C3645a.e(q0Var.f45770l), q0Var.f45767i)) == 0 || (G10 = M.G(q0Var.f45783y)) == 0 || (Q10 = Q(L(q0Var.f45784z, G10, f10), eVar.b().f46639a)) == 0) {
            return false;
        }
        if (Q10 == 1) {
            if (q0Var.f45754B == 0 && q0Var.f45755C == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f46787l == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 || !z11) {
                return true;
            }
            return false;
        } else if (Q10 == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void m0(ByteBuffer byteBuffer, long j10) {
        int i10;
        s.c cVar;
        boolean z10;
        boolean z11;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f46762O;
            boolean z12 = true;
            if (byteBuffer2 != null) {
                if (byteBuffer2 == byteBuffer) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.a(z11);
            } else {
                this.f46762O = byteBuffer;
                if (M.f44981a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f46763P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f46763P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f46763P, 0, remaining);
                    byteBuffer.position(position);
                    this.f46764Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (M.f44981a < 21) {
                int c10 = this.f46784i.c(this.f46751D);
                if (c10 > 0) {
                    i10 = this.f46796u.write(this.f46763P, this.f46764Q, Math.min(remaining2, c10));
                    if (i10 > 0) {
                        this.f46764Q += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else if (this.f46772Y) {
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                i10 = o0(this.f46796u, byteBuffer, remaining2, j10);
            } else {
                i10 = n0(this.f46796u, byteBuffer, remaining2);
            }
            this.f46773Z = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                boolean V10 = V(i10);
                if (V10) {
                    Y();
                }
                s.e eVar = new s.e(i10, this.f46795t.f46811a, V10);
                s.c cVar2 = this.f46793r;
                if (cVar2 != null) {
                    cVar2.b(eVar);
                }
                if (!eVar.f46691b) {
                    this.f46790o.b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f46790o.a();
            if (X(this.f46796u)) {
                if (this.f46752E > 0) {
                    this.f46777b0 = false;
                }
                if (this.f46768U && (cVar = this.f46793r) != null && i10 < remaining2 && !this.f46777b0) {
                    cVar.d();
                }
            }
            int i11 = this.f46795t.f46813c;
            if (i11 == 0) {
                this.f46751D += (long) i10;
            }
            if (i10 == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.f46760M) {
                        z12 = false;
                    }
                    C3645a.f(z12);
                    this.f46752E += ((long) this.f46753F) * ((long) this.f46761N);
                }
                this.f46762O = null;
            }
        }
    }

    private static int n0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (M.f44981a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f46801z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f46801z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f46801z.putInt(1431633921);
        }
        if (this.f46748A == 0) {
            this.f46801z.putInt(4, i10);
            this.f46801z.putLong(8, j10 * 1000);
            this.f46801z.position(0);
            this.f46748A = i10;
        }
        int remaining = this.f46801z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f46801z, remaining, 1);
            if (write < 0) {
                this.f46748A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int n02 = n0(audioTrack, byteBuffer, i10);
        if (n02 < 0) {
            this.f46748A = 0;
            return n02;
        }
        this.f46748A -= n02;
        return n02;
    }

    public boolean R() {
        return P().f46824b;
    }

    public boolean a(C3717q0 q0Var) {
        if (t(q0Var) != 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (!W() || (this.f46766S && !d())) {
            return true;
        }
        return false;
    }

    public S0 c() {
        if (this.f46786k) {
            return this.f46800y;
        }
        return M();
    }

    public boolean d() {
        if (!W() || !this.f46784i.h(T())) {
            return false;
        }
        return true;
    }

    public void e(int i10) {
        boolean z10;
        if (this.f46770W != i10) {
            this.f46770W = i10;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f46769V = z10;
            flush();
        }
    }

    public void f(S0 s02) {
        S0 s03 = new S0(M.p(s02.f45374a, 0.1f, 8.0f), M.p(s02.f45375b, 0.1f, 8.0f));
        if (!this.f46786k || M.f44981a < 23) {
            d0(s03, R());
        } else {
            e0(s03);
        }
    }

    public void flush() {
        if (W()) {
            c0();
            if (this.f46784i.i()) {
                this.f46796u.pause();
            }
            if (X(this.f46796u)) {
                ((l) C3645a.e(this.f46788m)).b(this.f46796u);
            }
            AudioTrack audioTrack = this.f46796u;
            this.f46796u = null;
            if (M.f44981a < 21 && !this.f46769V) {
                this.f46770W = 0;
            }
            f fVar = this.f46794s;
            if (fVar != null) {
                this.f46795t = fVar;
                this.f46794s = null;
            }
            this.f46784i.q();
            this.f46783h.c();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f46790o.a();
        this.f46789n.a();
    }

    public void g() {
        if (this.f46772Y) {
            this.f46772Y = false;
            flush();
        }
    }

    public boolean h(ByteBuffer byteBuffer, long j10, int i10) {
        boolean z10;
        boolean z11;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.f46760M;
        if (byteBuffer3 == null || byteBuffer2 == byteBuffer3) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (this.f46794s != null) {
            if (!J()) {
                return false;
            }
            if (!this.f46794s.b(this.f46795t)) {
                Z();
                if (d()) {
                    return false;
                }
                flush();
            } else {
                this.f46795t = this.f46794s;
                this.f46794s = null;
                if (X(this.f46796u) && this.f46787l != 3) {
                    if (this.f46796u.getPlayState() == 3) {
                        this.f46796u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f46796u;
                    C3717q0 q0Var = this.f46795t.f46811a;
                    audioTrack.setOffloadDelayPadding(q0Var.f45754B, q0Var.f45755C);
                    this.f46777b0 = true;
                }
            }
            E(j11);
        }
        if (!W()) {
            try {
                if (!U()) {
                    return false;
                }
            } catch (s.b e10) {
                s.b bVar = e10;
                if (!bVar.f46686b) {
                    this.f46789n.b(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f46789n.a();
        if (this.f46755H) {
            this.f46756I = Math.max(0, j11);
            this.f46754G = false;
            this.f46755H = false;
            if (this.f46786k && M.f44981a >= 23) {
                e0(this.f46800y);
            }
            E(j11);
            if (this.f46768U) {
                l();
            }
        }
        if (!this.f46784i.k(T())) {
            return false;
        }
        if (this.f46760M == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3645a.a(z11);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar = this.f46795t;
            if (fVar.f46813c != 0 && this.f46753F == 0) {
                int O10 = O(fVar.f46817g, byteBuffer2);
                this.f46753F = O10;
                if (O10 == 0) {
                    return true;
                }
            }
            if (this.f46798w != null) {
                if (!J()) {
                    return false;
                }
                E(j11);
                this.f46798w = null;
            }
            long k10 = this.f46756I + this.f46795t.k(S() - this.f46780e.m());
            if (!this.f46754G && Math.abs(k10 - j11) > 200000) {
                this.f46793r.b(new s.d(j11, k10));
                this.f46754G = true;
            }
            if (this.f46754G) {
                if (!J()) {
                    return false;
                }
                long j12 = j11 - k10;
                this.f46756I += j12;
                this.f46754G = false;
                E(j11);
                s.c cVar = this.f46793r;
                if (!(cVar == null || j12 == 0)) {
                    cVar.f();
                }
            }
            if (this.f46795t.f46813c == 0) {
                this.f46749B += (long) byteBuffer.remaining();
            } else {
                this.f46750C += ((long) this.f46753F) * ((long) i11);
            }
            this.f46760M = byteBuffer2;
            this.f46761N = i11;
        }
        a0(j11);
        if (!this.f46760M.hasRemaining()) {
            this.f46760M = null;
            this.f46761N = 0;
            return true;
        } else if (!this.f46784i.j(T())) {
            return false;
        } else {
            ja.s.i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void i() {
        if (!this.f46766S && W() && J()) {
            Z();
            this.f46766S = true;
        }
    }

    public long j(boolean z10) {
        if (!W() || this.f46755H) {
            return Long.MIN_VALUE;
        }
        return G(F(Math.min(this.f46784i.d(z10), this.f46795t.h(T()))));
    }

    public void k() {
        this.f46754G = true;
    }

    public void l() {
        this.f46768U = true;
        if (W()) {
            this.f46784i.u();
            this.f46796u.play();
        }
    }

    public void m(float f10) {
        if (this.f46757J != f10) {
            this.f46757J = f10;
            f0();
        }
    }

    public void n() {
        boolean z10;
        if (M.f44981a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        C3645a.f(this.f46769V);
        if (!this.f46772Y) {
            this.f46772Y = true;
            flush();
        }
    }

    public void o(boolean z10) {
        d0(M(), z10);
    }

    public void p(C3847e eVar) {
        if (!this.f46797v.equals(eVar)) {
            this.f46797v = eVar;
            if (!this.f46772Y) {
                flush();
            }
        }
    }

    public void pause() {
        this.f46768U = false;
        if (W() && this.f46784i.p()) {
            this.f46796u.pause();
        }
    }

    public void q() {
        boolean z10;
        if (M.f44981a < 25) {
            flush();
            return;
        }
        this.f46790o.a();
        this.f46789n.a();
        if (W()) {
            c0();
            if (this.f46784i.i()) {
                this.f46796u.pause();
            }
            this.f46796u.flush();
            this.f46784i.q();
            u uVar = this.f46784i;
            AudioTrack audioTrack = this.f46796u;
            f fVar = this.f46795t;
            if (fVar.f46813c == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            uVar.s(audioTrack, z10, fVar.f46817g, fVar.f46814d, fVar.f46818h);
            this.f46755H = true;
        }
    }

    public void r(v vVar) {
        if (!this.f46771X.equals(vVar)) {
            int i10 = vVar.f46736a;
            float f10 = vVar.f46737b;
            AudioTrack audioTrack = this.f46796u;
            if (audioTrack != null) {
                if (this.f46771X.f46736a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f46796u.setAuxEffectSendLevel(f10);
                }
            }
            this.f46771X = vVar;
        }
    }

    public void reset() {
        flush();
        for (C3849g reset : this.f46781f) {
            reset.reset();
        }
        for (C3849g reset2 : this.f46782g) {
            reset2.reset();
        }
        this.f46768U = false;
        this.f46775a0 = false;
    }

    public void s(C3717q0 q0Var, int i10, int[] iArr) {
        C3849g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        double d10;
        int i19;
        C3849g[] gVarArr2;
        int[] iArr2;
        C3717q0 q0Var2 = q0Var;
        if ("audio/raw".equals(q0Var2.f45770l)) {
            C3645a.a(M.v0(q0Var2.f45753A));
            int e02 = M.e0(q0Var2.f45753A, q0Var2.f45783y);
            if (k0(q0Var2.f45753A)) {
                gVarArr2 = this.f46782g;
            } else {
                gVarArr2 = this.f46781f;
            }
            this.f46780e.o(q0Var2.f45754B, q0Var2.f45755C);
            if (M.f44981a < 21 && q0Var2.f45783y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f46779d.m(iArr2);
            C3849g.a aVar = new C3849g.a(q0Var2.f45784z, q0Var2.f45783y, q0Var2.f45753A);
            int length = gVarArr2.length;
            int i21 = 0;
            while (i21 < length) {
                C3849g gVar = gVarArr2[i21];
                try {
                    C3849g.a f10 = gVar.f(aVar);
                    if (gVar.a()) {
                        aVar = f10;
                    }
                    i21++;
                } catch (C3849g.b e10) {
                    throw new s.a((Throwable) e10, q0Var2);
                }
            }
            int i22 = aVar.f46655c;
            int i23 = aVar.f46653a;
            int G10 = M.G(aVar.f46654b);
            gVarArr = gVarArr2;
            i13 = M.e0(i22, aVar.f46654b);
            i14 = i22;
            i12 = i23;
            i11 = G10;
            i15 = e02;
            i16 = 0;
        } else {
            C3849g[] gVarArr3 = new C3849g[0];
            int i24 = q0Var2.f45784z;
            if (l0(q0Var2, this.f46797v)) {
                i19 = 1;
                gVarArr = gVarArr3;
                i12 = i24;
                i14 = w.f((String) C3645a.e(q0Var2.f45770l), q0Var2.f45767i);
                i15 = -1;
                i13 = -1;
                i11 = M.G(q0Var2.f45783y);
            } else {
                Pair f11 = this.f46774a.f(q0Var2);
                if (f11 != null) {
                    int intValue = ((Integer) f11.first).intValue();
                    i19 = 2;
                    gVarArr = gVarArr3;
                    i12 = i24;
                    i11 = ((Integer) f11.second).intValue();
                    i15 = -1;
                    i13 = -1;
                    i14 = intValue;
                } else {
                    throw new s.a("Unable to configure passthrough for: " + q0Var2, q0Var2);
                }
            }
            i16 = i19;
        }
        if (i10 != 0) {
            i18 = i10;
            i17 = i14;
        } else {
            d dVar = this.f46791p;
            int N10 = N(i12, i11, i14);
            if (this.f46786k) {
                d10 = 8.0d;
            } else {
                d10 = 1.0d;
            }
            i17 = i14;
            i18 = dVar.a(N10, i14, i16, i13, i12, d10);
        }
        if (i17 == 0) {
            throw new s.a("Invalid output encoding (mode=" + i16 + ") for: " + q0Var2, q0Var2);
        } else if (i11 != 0) {
            this.f46775a0 = false;
            f fVar = new f(q0Var, i15, i16, i13, i12, i11, i17, i18, gVarArr);
            if (W()) {
                this.f46794s = fVar;
            } else {
                this.f46795t = fVar;
            }
        } else {
            throw new s.a("Invalid output channel config (mode=" + i16 + ") for: " + q0Var2, q0Var2);
        }
    }

    public int t(C3717q0 q0Var) {
        if ("audio/raw".equals(q0Var.f45770l)) {
            if (!M.v0(q0Var.f45753A)) {
                ja.s.i("DefaultAudioSink", "Invalid PCM encoding: " + q0Var.f45753A);
                return 0;
            }
            int i10 = q0Var.f45753A;
            if (i10 == 2 || (this.f46778c && i10 == 4)) {
                return 2;
            }
            return 1;
        } else if ((this.f46775a0 || !l0(q0Var, this.f46797v)) && !this.f46774a.h(q0Var)) {
            return 0;
        } else {
            return 2;
        }
    }

    public void u(s0 s0Var) {
        this.f46792q = s0Var;
    }

    public void v(s.c cVar) {
        this.f46793r = cVar;
    }

    private y(e eVar) {
        this.f46774a = eVar.f46805a;
        c b10 = eVar.f46806b;
        this.f46776b = b10;
        int i10 = M.f44981a;
        this.f46778c = i10 >= 21 && eVar.f46807c;
        this.f46786k = i10 >= 23 && eVar.f46808d;
        this.f46787l = i10 >= 29 ? eVar.f46809e : 0;
        this.f46791p = eVar.f46810f;
        C3651g gVar = new C3651g(C3648d.f44997a);
        this.f46783h = gVar;
        gVar.e();
        this.f46784i = new u(new k(this, (a) null));
        x xVar = new x();
        this.f46779d = xVar;
        J j10 = new J();
        this.f46780e = j10;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new w[]{new F(), xVar, j10});
        Collections.addAll(arrayList, b10.b());
        this.f46781f = (C3849g[]) arrayList.toArray(new C3849g[0]);
        this.f46782g = new C3849g[]{new C3841B()};
        this.f46757J = 1.0f;
        this.f46797v = C3847e.f46631g;
        this.f46770W = 0;
        this.f46771X = new v(0, 0.0f);
        S0 s02 = S0.f45372d;
        this.f46799x = new i(s02, false, 0, 0, (a) null);
        this.f46800y = s02;
        this.f46765R = -1;
        this.f46758K = new C3849g[0];
        this.f46759L = new ByteBuffer[0];
        this.f46785j = new ArrayDeque();
        this.f46789n = new j(100);
        this.f46790o = new j(100);
    }
}
