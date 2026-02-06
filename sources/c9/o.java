package C9;

import C9.l;
import C9.v;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ja.C3645a;
import ja.H;
import ja.J;
import ja.M;
import ja.s;
import ja.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k9.C3694f;
import k9.C3702j;
import k9.C3717q0;
import k9.C3718r0;
import k9.r;
import l9.s0;
import n9.C3866b;
import n9.C3869e;
import n9.C3871g;
import n9.C3873i;
import o9.C3913C;
import o9.n;

public abstract class o extends C3694f {

    /* renamed from: Y0  reason: collision with root package name */
    private static final byte[] f30177Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A  reason: collision with root package name */
    private final long[] f30178A;

    /* renamed from: A0  reason: collision with root package name */
    private ByteBuffer f30179A0;

    /* renamed from: B  reason: collision with root package name */
    private C3717q0 f30180B;

    /* renamed from: B0  reason: collision with root package name */
    private boolean f30181B0;

    /* renamed from: C  reason: collision with root package name */
    private C3717q0 f30182C;

    /* renamed from: C0  reason: collision with root package name */
    private boolean f30183C0;

    /* renamed from: D  reason: collision with root package name */
    private n f30184D;

    /* renamed from: D0  reason: collision with root package name */
    private boolean f30185D0;

    /* renamed from: E  reason: collision with root package name */
    private n f30186E;

    /* renamed from: E0  reason: collision with root package name */
    private boolean f30187E0;

    /* renamed from: F  reason: collision with root package name */
    private MediaCrypto f30188F;

    /* renamed from: F0  reason: collision with root package name */
    private boolean f30189F0;

    /* renamed from: G  reason: collision with root package name */
    private boolean f30190G;

    /* renamed from: G0  reason: collision with root package name */
    private boolean f30191G0;

    /* renamed from: H  reason: collision with root package name */
    private long f30192H;

    /* renamed from: H0  reason: collision with root package name */
    private int f30193H0;

    /* renamed from: I  reason: collision with root package name */
    private float f30194I;

    /* renamed from: I0  reason: collision with root package name */
    private int f30195I0;

    /* renamed from: J0  reason: collision with root package name */
    private int f30196J0;

    /* renamed from: K0  reason: collision with root package name */
    private boolean f30197K0;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f30198L0;

    /* renamed from: M0  reason: collision with root package name */
    private boolean f30199M0;

    /* renamed from: N0  reason: collision with root package name */
    private long f30200N0;

    /* renamed from: O0  reason: collision with root package name */
    private long f30201O0;

    /* renamed from: P0  reason: collision with root package name */
    private boolean f30202P0;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f30203Q0;

    /* renamed from: R0  reason: collision with root package name */
    private boolean f30204R0;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f30205S0;

    /* renamed from: T0  reason: collision with root package name */
    private r f30206T0;

    /* renamed from: U0  reason: collision with root package name */
    protected C3869e f30207U0;

    /* renamed from: V0  reason: collision with root package name */
    private long f30208V0;

    /* renamed from: W0  reason: collision with root package name */
    private long f30209W0;

    /* renamed from: X  reason: collision with root package name */
    private float f30210X;

    /* renamed from: X0  reason: collision with root package name */
    private int f30211X0;

    /* renamed from: Y  reason: collision with root package name */
    private l f30212Y;

    /* renamed from: Z  reason: collision with root package name */
    private C3717q0 f30213Z;

    /* renamed from: f0  reason: collision with root package name */
    private MediaFormat f30214f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f30215g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f30216h0;

    /* renamed from: i0  reason: collision with root package name */
    private ArrayDeque f30217i0;

    /* renamed from: j0  reason: collision with root package name */
    private b f30218j0;

    /* renamed from: k0  reason: collision with root package name */
    private n f30219k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f30220l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f30221m0;

    /* renamed from: n  reason: collision with root package name */
    private final l.b f30222n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f30223n0;

    /* renamed from: o  reason: collision with root package name */
    private final q f30224o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f30225o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f30226p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f30227p0;

    /* renamed from: q  reason: collision with root package name */
    private final float f30228q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f30229q0;

    /* renamed from: r  reason: collision with root package name */
    private final C3871g f30230r = C3871g.A();

    /* renamed from: r0  reason: collision with root package name */
    private boolean f30231r0;

    /* renamed from: s  reason: collision with root package name */
    private final C3871g f30232s = new C3871g(0);

    /* renamed from: s0  reason: collision with root package name */
    private boolean f30233s0;

    /* renamed from: t  reason: collision with root package name */
    private final C3871g f30234t = new C3871g(2);

    /* renamed from: t0  reason: collision with root package name */
    private boolean f30235t0;

    /* renamed from: u  reason: collision with root package name */
    private final h f30236u;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f30237u0;

    /* renamed from: v  reason: collision with root package name */
    private final H f30238v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f30239v0;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList f30240w;

    /* renamed from: w0  reason: collision with root package name */
    private i f30241w0;

    /* renamed from: x  reason: collision with root package name */
    private final MediaCodec.BufferInfo f30242x;

    /* renamed from: x0  reason: collision with root package name */
    private long f30243x0;

    /* renamed from: y  reason: collision with root package name */
    private final long[] f30244y;

    /* renamed from: y0  reason: collision with root package name */
    private int f30245y0;

    /* renamed from: z  reason: collision with root package name */
    private final long[] f30246z;

    /* renamed from: z0  reason: collision with root package name */
    private int f30247z0;

    private static final class a {
        public static void a(l.a aVar, s0 s0Var) {
            LogSessionId a10 = s0Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f30159b.setString("log-session-id", a10.getStringId());
            }
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.f30222n = bVar;
        this.f30224o = (q) C3645a.e(qVar);
        this.f30226p = z10;
        this.f30228q = f10;
        h hVar = new h();
        this.f30236u = hVar;
        this.f30238v = new H();
        this.f30240w = new ArrayList();
        this.f30242x = new MediaCodec.BufferInfo();
        this.f30194I = 1.0f;
        this.f30210X = 1.0f;
        this.f30192H = -9223372036854775807L;
        this.f30244y = new long[10];
        this.f30246z = new long[10];
        this.f30178A = new long[10];
        this.f30208V0 = -9223372036854775807L;
        this.f30209W0 = -9223372036854775807L;
        hVar.x(0);
        hVar.f46950c.order(ByteOrder.nativeOrder());
        this.f30216h0 = -1.0f;
        this.f30220l0 = 0;
        this.f30193H0 = 0;
        this.f30245y0 = -1;
        this.f30247z0 = -1;
        this.f30243x0 = -9223372036854775807L;
        this.f30200N0 = -9223372036854775807L;
        this.f30201O0 = -9223372036854775807L;
        this.f30195I0 = 0;
        this.f30196J0 = 0;
    }

    private C3913C B0(n nVar) {
        C3866b d10 = nVar.d();
        if (d10 == null || (d10 instanceof C3913C)) {
            return (C3913C) d10;
        }
        throw F(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + d10), this.f30180B, 6001);
    }

    private boolean G0() {
        if (this.f30247z0 >= 0) {
            return true;
        }
        return false;
    }

    private void H0(C3717q0 q0Var) {
        k0();
        String str = q0Var.f45770l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f30236u.J(32);
        } else {
            this.f30236u.J(1);
        }
        this.f30185D0 = true;
    }

    /* JADX INFO: finally extract failed */
    private void I0(n nVar, MediaCrypto mediaCrypto) {
        float f10;
        boolean z10;
        String str = nVar.f30166a;
        int i10 = M.f44981a;
        float f11 = -1.0f;
        if (i10 < 23) {
            f10 = -1.0f;
        } else {
            f10 = y0(this.f30210X, this.f30180B, L());
        }
        if (f10 > this.f30228q) {
            f11 = f10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a C02 = C0(nVar, this.f30180B, mediaCrypto, f11);
        if (i10 >= 31) {
            a.a(C02, K());
        }
        try {
            J.a("createCodec:" + str);
            this.f30212Y = this.f30222n.a(C02);
            J.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f30219k0 = nVar;
            this.f30216h0 = f11;
            this.f30213Z = this.f30180B;
            this.f30220l0 = a0(str);
            this.f30221m0 = b0(str, this.f30213Z);
            this.f30223n0 = g0(str);
            this.f30225o0 = i0(str);
            this.f30227p0 = d0(str);
            this.f30229q0 = e0(str);
            this.f30231r0 = c0(str);
            this.f30233s0 = h0(str, this.f30213Z);
            boolean z11 = false;
            if (f0(nVar) || x0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30239v0 = z10;
            if (this.f30212Y.h()) {
                this.f30191G0 = true;
                this.f30193H0 = 1;
                if (this.f30220l0 != 0) {
                    z11 = true;
                }
                this.f30235t0 = z11;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f30166a)) {
                this.f30241w0 = new i();
            }
            if (getState() == 2) {
                this.f30243x0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f30207U0.f46937a++;
            Q0(str, C02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th2) {
            J.c();
            throw th2;
        }
    }

    private boolean J0(long j10) {
        int size = this.f30240w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Long) this.f30240w.get(i10)).longValue() == j10) {
                this.f30240w.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean K0(IllegalStateException illegalStateException) {
        if (M.f44981a >= 21 && L0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private static boolean L0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean M0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void O0(MediaCrypto mediaCrypto, boolean z10) {
        if (this.f30217i0 == null) {
            try {
                List u02 = u0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f30217i0 = arrayDeque;
                if (this.f30226p) {
                    arrayDeque.addAll(u02);
                } else if (!u02.isEmpty()) {
                    this.f30217i0.add((n) u02.get(0));
                }
                this.f30218j0 = null;
            } catch (v.c e10) {
                throw new b(this.f30180B, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.f30217i0.isEmpty()) {
            n nVar = (n) this.f30217i0.peekFirst();
            while (this.f30212Y == null) {
                n nVar2 = (n) this.f30217i0.peekFirst();
                if (n1(nVar2)) {
                    try {
                        I0(nVar2, mediaCrypto);
                    } catch (Exception e11) {
                        if (nVar2 == nVar) {
                            s.i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50);
                            I0(nVar2, mediaCrypto);
                        } else {
                            throw e11;
                        }
                    } catch (Exception e12) {
                        s.j("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e12);
                        this.f30217i0.removeFirst();
                        b bVar = new b(this.f30180B, (Throwable) e12, z10, nVar2);
                        P0(bVar);
                        b bVar2 = this.f30218j0;
                        if (bVar2 == null) {
                            this.f30218j0 = bVar;
                        } else {
                            this.f30218j0 = bVar2.c(bVar);
                        }
                        if (this.f30217i0.isEmpty()) {
                            throw this.f30218j0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f30217i0 = null;
            return;
        }
        throw new b(this.f30180B, (Throwable) null, z10, -49999);
    }

    private void X() {
        C3645a.f(!this.f30202P0);
        C3718r0 I10 = I();
        this.f30234t.i();
        do {
            this.f30234t.i();
            int U10 = U(I10, this.f30234t, 0);
            if (U10 == -5) {
                S0(I10);
                return;
            } else if (U10 != -4) {
                if (U10 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f30234t.p()) {
                this.f30202P0 = true;
                return;
            } else {
                if (this.f30204R0) {
                    C3717q0 q0Var = (C3717q0) C3645a.e(this.f30180B);
                    this.f30182C = q0Var;
                    T0(q0Var, (MediaFormat) null);
                    this.f30204R0 = false;
                }
                this.f30234t.y();
            }
        } while (this.f30236u.D(this.f30234t));
        this.f30187E0 = true;
    }

    private void X0() {
        int i10 = this.f30196J0;
        if (i10 == 1) {
            r0();
        } else if (i10 == 2) {
            r0();
            t1();
        } else if (i10 != 3) {
            this.f30203Q0 = true;
            d1();
        } else {
            b1();
        }
    }

    private boolean Y(long j10, long j11) {
        boolean z10;
        C3645a.f(!this.f30203Q0);
        if (this.f30236u.I()) {
            h hVar = this.f30236u;
            if (!Y0(j10, j11, (l) null, hVar.f46950c, this.f30247z0, 0, hVar.H(), this.f30236u.F(), this.f30236u.o(), this.f30236u.p(), this.f30182C)) {
                return false;
            }
            U0(this.f30236u.G());
            this.f30236u.i();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f30202P0) {
            this.f30203Q0 = true;
            return z10;
        }
        if (this.f30187E0) {
            C3645a.f(this.f30236u.D(this.f30234t));
            this.f30187E0 = z10;
        }
        if (this.f30189F0) {
            if (this.f30236u.I()) {
                return true;
            }
            k0();
            this.f30189F0 = z10;
            N0();
            if (!this.f30185D0) {
                return z10;
            }
        }
        X();
        if (this.f30236u.I()) {
            this.f30236u.y();
        }
        if (this.f30236u.I() || this.f30202P0 || this.f30189F0) {
            return true;
        }
        return z10;
    }

    private void Z0() {
        this.f30199M0 = true;
        MediaFormat c10 = this.f30212Y.c();
        if (this.f30220l0 != 0 && c10.getInteger(Snapshot.WIDTH) == 32 && c10.getInteger(Snapshot.HEIGHT) == 32) {
            this.f30237u0 = true;
            return;
        }
        if (this.f30233s0) {
            c10.setInteger("channel-count", 1);
        }
        this.f30214f0 = c10;
        this.f30215g0 = true;
    }

    private int a0(String str) {
        int i10 = M.f44981a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = M.f44984d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = M.f44982b;
        if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
            return 1;
        }
        return 0;
    }

    private boolean a1(int i10) {
        C3718r0 I10 = I();
        this.f30230r.i();
        int U10 = U(I10, this.f30230r, i10 | 4);
        if (U10 == -5) {
            S0(I10);
            return true;
        } else if (U10 != -4 || !this.f30230r.p()) {
            return false;
        } else {
            this.f30202P0 = true;
            X0();
            return false;
        }
    }

    private static boolean b0(String str, C3717q0 q0Var) {
        if (M.f44981a >= 21 || !q0Var.f45772n.isEmpty() || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return false;
        }
        return true;
    }

    private void b1() {
        c1();
        N0();
    }

    private static boolean c0(String str) {
        if (M.f44981a < 21 && "OMX.SEC.mp3.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(M.f44983c)) {
            String str2 = M.f44982b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean d0(String str) {
        int i10 = M.f44981a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = M.f44982b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean e0(String str) {
        if (M.f44981a != 21 || !"OMX.google.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean f0(n nVar) {
        String str = nVar.f30166a;
        int i10 = M.f44981a;
        if ((i10 > 25 || !"OMX.rk.video_decoder.avc".equals(str)) && ((i10 > 17 || !"OMX.allwinner.video.decoder.avc".equals(str)) && ((i10 > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str))) && (!"Amazon".equals(M.f44983c) || !"AFTS".equals(M.f44984d) || !nVar.f30172g)))) {
            return false;
        }
        return true;
    }

    private static boolean g0(String str) {
        int i10 = M.f44981a;
        if (i10 < 18 || ((i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && M.f44984d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    private void g1() {
        this.f30245y0 = -1;
        this.f30232s.f46950c = null;
    }

    private static boolean h0(String str, C3717q0 q0Var) {
        if (M.f44981a > 18 || q0Var.f45783y != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    private void h1() {
        this.f30247z0 = -1;
        this.f30179A0 = null;
    }

    private static boolean i0(String str) {
        if (M.f44981a != 29 || !"c2.android.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    private void i1(n nVar) {
        n.h(this.f30184D, nVar);
        this.f30184D = nVar;
    }

    private void k0() {
        this.f30189F0 = false;
        this.f30236u.i();
        this.f30234t.i();
        this.f30187E0 = false;
        this.f30185D0 = false;
    }

    private boolean l0() {
        if (this.f30197K0) {
            this.f30195I0 = 1;
            if (this.f30223n0 || this.f30227p0) {
                this.f30196J0 = 3;
                return false;
            }
            this.f30196J0 = 1;
        }
        return true;
    }

    private void l1(n nVar) {
        n.h(this.f30186E, nVar);
        this.f30186E = nVar;
    }

    private void m0() {
        if (this.f30197K0) {
            this.f30195I0 = 1;
            this.f30196J0 = 3;
            return;
        }
        b1();
    }

    private boolean m1(long j10) {
        if (this.f30192H == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f30192H) {
            return true;
        }
        return false;
    }

    private boolean n0() {
        if (this.f30197K0) {
            this.f30195I0 = 1;
            if (this.f30223n0 || this.f30227p0) {
                this.f30196J0 = 3;
                return false;
            }
            this.f30196J0 = 2;
        } else {
            t1();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean o0(long r20, long r22) {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.G0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.f30229q0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r15.f30198L0
            if (r0 == 0) goto L_0x0027
            C9.l r0 = r15.f30212Y     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f30242x     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.k(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x002f
        L_0x001c:
            r19.X0()
            boolean r0 = r15.f30203Q0
            if (r0 == 0) goto L_0x0026
            r19.c1()
        L_0x0026:
            return r14
        L_0x0027:
            C9.l r0 = r15.f30212Y
            android.media.MediaCodec$BufferInfo r1 = r15.f30242x
            int r0 = r0.k(r1)
        L_0x002f:
            if (r0 >= 0) goto L_0x0049
            r1 = -2
            if (r0 != r1) goto L_0x0038
            r19.Z0()
            return r16
        L_0x0038:
            boolean r0 = r15.f30239v0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r15.f30202P0
            if (r0 != 0) goto L_0x0045
            int r0 = r15.f30195I0
            r1 = 2
            if (r0 != r1) goto L_0x0048
        L_0x0045:
            r19.X0()
        L_0x0048:
            return r14
        L_0x0049:
            boolean r1 = r15.f30237u0
            if (r1 == 0) goto L_0x0055
            r15.f30237u0 = r14
            C9.l r1 = r15.f30212Y
            r1.l(r0, r14)
            return r16
        L_0x0055:
            android.media.MediaCodec$BufferInfo r1 = r15.f30242x
            int r2 = r1.size
            if (r2 != 0) goto L_0x0065
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0065
            r19.X0()
            return r14
        L_0x0065:
            r15.f30247z0 = r0
            C9.l r1 = r15.f30212Y
            java.nio.ByteBuffer r0 = r1.m(r0)
            r15.f30179A0 = r0
            if (r0 == 0) goto L_0x0084
            android.media.MediaCodec$BufferInfo r1 = r15.f30242x
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f30179A0
            android.media.MediaCodec$BufferInfo r1 = r15.f30242x
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0084:
            boolean r0 = r15.f30231r0
            if (r0 == 0) goto L_0x00a5
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00a5
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a5
            long r1 = r15.f30200N0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00a5
            r0.presentationTimeUs = r1
        L_0x00a5:
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.J0(r0)
            r15.f30181B0 = r0
            long r0 = r15.f30201O0
            android.media.MediaCodec$BufferInfo r2 = r15.f30242x
            long r2 = r2.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            r0 = r16
            goto L_0x00bd
        L_0x00bc:
            r0 = r14
        L_0x00bd:
            r15.f30183C0 = r0
            r15.u1(r2)
        L_0x00c2:
            boolean r0 = r15.f30229q0
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r15.f30198L0
            if (r0 == 0) goto L_0x00fe
            C9.l r5 = r15.f30212Y     // Catch:{ IllegalStateException -> 0x00f1 }
            java.nio.ByteBuffer r6 = r15.f30179A0     // Catch:{ IllegalStateException -> 0x00f1 }
            int r7 = r15.f30247z0     // Catch:{ IllegalStateException -> 0x00f1 }
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x     // Catch:{ IllegalStateException -> 0x00f1 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f1 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f1 }
            boolean r12 = r15.f30181B0     // Catch:{ IllegalStateException -> 0x00f1 }
            boolean r13 = r15.f30183C0     // Catch:{ IllegalStateException -> 0x00f1 }
            k9.q0 r9 = r15.f30182C     // Catch:{ IllegalStateException -> 0x00f1 }
            r17 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            r18 = r9
            r9 = r17
            r17 = r14
            r14 = r18
            boolean r0 = r0.Y0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00f3 }
            goto L_0x011d
        L_0x00f1:
            r17 = r14
        L_0x00f3:
            r19.X0()
            boolean r0 = r15.f30203Q0
            if (r0 == 0) goto L_0x00fd
            r19.c1()
        L_0x00fd:
            return r17
        L_0x00fe:
            r17 = r14
            C9.l r5 = r15.f30212Y
            java.nio.ByteBuffer r6 = r15.f30179A0
            int r7 = r15.f30247z0
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x
            int r8 = r0.flags
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f30181B0
            boolean r13 = r15.f30183C0
            k9.q0 r14 = r15.f30182C
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.Y0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011d:
            if (r0 == 0) goto L_0x013c
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x
            long r0 = r0.presentationTimeUs
            r15.U0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f30242x
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0131
            r14 = r16
            goto L_0x0133
        L_0x0131:
            r14 = r17
        L_0x0133:
            r19.h1()
            if (r14 != 0) goto L_0x0139
            return r16
        L_0x0139:
            r19.X0()
        L_0x013c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.o.o0(long, long):boolean");
    }

    private boolean p0(n nVar, C3717q0 q0Var, n nVar2, n nVar3) {
        C3913C B02;
        boolean z10;
        if (nVar2 == nVar3) {
            return false;
        }
        if (nVar3 == null || nVar2 == null || M.f44981a < 23) {
            return true;
        }
        UUID uuid = C3702j.f45579e;
        if (uuid.equals(nVar2.b()) || uuid.equals(nVar3.b()) || (B02 = B0(nVar3)) == null) {
            return true;
        }
        if (B02.f47418c) {
            z10 = false;
        } else {
            z10 = nVar3.f(q0Var.f45770l);
        }
        if (nVar.f30172g || !z10) {
            return false;
        }
        return true;
    }

    private boolean q0() {
        int i10;
        if (this.f30212Y == null || (i10 = this.f30195I0) == 2 || this.f30202P0) {
            return false;
        }
        if (i10 == 0 && o1()) {
            m0();
        }
        if (this.f30245y0 < 0) {
            int j10 = this.f30212Y.j();
            this.f30245y0 = j10;
            if (j10 < 0) {
                return false;
            }
            this.f30232s.f46950c = this.f30212Y.e(j10);
            this.f30232s.i();
        }
        if (this.f30195I0 == 1) {
            if (!this.f30239v0) {
                this.f30198L0 = true;
                this.f30212Y.a(this.f30245y0, 0, 0, 0, 4);
                g1();
            }
            this.f30195I0 = 2;
            return false;
        } else if (this.f30235t0) {
            this.f30235t0 = false;
            ByteBuffer byteBuffer = this.f30232s.f46950c;
            byte[] bArr = f30177Y0;
            byteBuffer.put(bArr);
            this.f30212Y.a(this.f30245y0, 0, bArr.length, 0, 0);
            g1();
            this.f30197K0 = true;
            return true;
        } else {
            if (this.f30193H0 == 1) {
                for (int i11 = 0; i11 < this.f30213Z.f45772n.size(); i11++) {
                    this.f30232s.f46950c.put((byte[]) this.f30213Z.f45772n.get(i11));
                }
                this.f30193H0 = 2;
            }
            int position = this.f30232s.f46950c.position();
            C3718r0 I10 = I();
            try {
                int U10 = U(I10, this.f30232s, 0);
                if (h()) {
                    this.f30201O0 = this.f30200N0;
                }
                if (U10 == -3) {
                    return false;
                }
                if (U10 == -5) {
                    if (this.f30193H0 == 2) {
                        this.f30232s.i();
                        this.f30193H0 = 1;
                    }
                    S0(I10);
                    return true;
                } else if (this.f30232s.p()) {
                    if (this.f30193H0 == 2) {
                        this.f30232s.i();
                        this.f30193H0 = 1;
                    }
                    this.f30202P0 = true;
                    if (!this.f30197K0) {
                        X0();
                        return false;
                    }
                    try {
                        if (!this.f30239v0) {
                            this.f30198L0 = true;
                            this.f30212Y.a(this.f30245y0, 0, 0, 0, 4);
                            g1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw F(e10, this.f30180B, M.V(e10.getErrorCode()));
                    }
                } else if (this.f30197K0 || this.f30232s.s()) {
                    boolean z10 = this.f30232s.z();
                    if (z10) {
                        this.f30232s.f46949b.b(position);
                    }
                    if (this.f30221m0 && !z10) {
                        x.b(this.f30232s.f46950c);
                        if (this.f30232s.f46950c.position() == 0) {
                            return true;
                        }
                        this.f30221m0 = false;
                    }
                    C3871g gVar = this.f30232s;
                    long j11 = gVar.f46952e;
                    i iVar = this.f30241w0;
                    if (iVar != null) {
                        j11 = iVar.d(this.f30180B, gVar);
                        this.f30200N0 = Math.max(this.f30200N0, this.f30241w0.b(this.f30180B));
                    }
                    long j12 = j11;
                    if (this.f30232s.o()) {
                        this.f30240w.add(Long.valueOf(j12));
                    }
                    if (this.f30204R0) {
                        this.f30238v.a(j12, this.f30180B);
                        this.f30204R0 = false;
                    }
                    this.f30200N0 = Math.max(this.f30200N0, j12);
                    this.f30232s.y();
                    if (this.f30232s.m()) {
                        F0(this.f30232s);
                    }
                    W0(this.f30232s);
                    if (z10) {
                        try {
                            this.f30212Y.o(this.f30245y0, 0, this.f30232s.f46949b, j12, 0);
                        } catch (MediaCodec.CryptoException e11) {
                            throw F(e11, this.f30180B, M.V(e11.getErrorCode()));
                        }
                    } else {
                        this.f30212Y.a(this.f30245y0, 0, this.f30232s.f46950c.limit(), j12, 0);
                    }
                    g1();
                    this.f30197K0 = true;
                    this.f30193H0 = 0;
                    this.f30207U0.f46939c++;
                    return true;
                } else {
                    this.f30232s.i();
                    if (this.f30193H0 == 2) {
                        this.f30193H0 = 1;
                    }
                    return true;
                }
            } catch (C3871g.a e12) {
                P0(e12);
                a1(0);
                r0();
                return true;
            }
        }
    }

    private void r0() {
        try {
            this.f30212Y.flush();
        } finally {
            e1();
        }
    }

    protected static boolean r1(C3717q0 q0Var) {
        int i10 = q0Var.f45757E;
        if (i10 == 0 || i10 == 2) {
            return true;
        }
        return false;
    }

    private boolean s1(C3717q0 q0Var) {
        if (!(M.f44981a < 23 || this.f30212Y == null || this.f30196J0 == 3 || getState() == 0)) {
            float y02 = y0(this.f30210X, q0Var, L());
            float f10 = this.f30216h0;
            if (f10 == y02) {
                return true;
            }
            if (y02 == -1.0f) {
                m0();
                return false;
            } else if (f10 == -1.0f && y02 <= this.f30228q) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", y02);
                this.f30212Y.b(bundle);
                this.f30216h0 = y02;
            }
        }
        return true;
    }

    private void t1() {
        try {
            this.f30188F.setMediaDrmSession(B0(this.f30186E).f47417b);
            i1(this.f30186E);
            this.f30195I0 = 0;
            this.f30196J0 = 0;
        } catch (MediaCryptoException e10) {
            throw F(e10, this.f30180B, 6006);
        }
    }

    private List u0(boolean z10) {
        List A02 = A0(this.f30224o, this.f30180B, z10);
        if (A02.isEmpty() && z10) {
            A02 = A0(this.f30224o, this.f30180B, false);
            if (!A02.isEmpty()) {
                s.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f30180B.f45770l + ", but no secure decoder available. Trying to proceed with " + A02 + ".");
            }
        }
        return A02;
    }

    /* access modifiers changed from: protected */
    public abstract List A0(q qVar, C3717q0 q0Var, boolean z10);

    /* access modifiers changed from: protected */
    public abstract l.a C0(n nVar, C3717q0 q0Var, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public final long D0() {
        return this.f30209W0;
    }

    /* access modifiers changed from: protected */
    public float E0() {
        return this.f30194I;
    }

    /* access modifiers changed from: protected */
    public void N() {
        this.f30180B = null;
        this.f30208V0 = -9223372036854775807L;
        this.f30209W0 = -9223372036854775807L;
        this.f30211X0 = 0;
        t0();
    }

    /* access modifiers changed from: protected */
    public final void N0() {
        C3717q0 q0Var;
        boolean z10;
        if (this.f30212Y == null && !this.f30185D0 && (q0Var = this.f30180B) != null) {
            if (this.f30186E != null || !p1(q0Var)) {
                i1(this.f30186E);
                String str = this.f30180B.f45770l;
                n nVar = this.f30184D;
                if (nVar != null) {
                    if (this.f30188F == null) {
                        C3913C B02 = B0(nVar);
                        if (B02 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(B02.f47416a, B02.f47417b);
                                this.f30188F = mediaCrypto;
                                if (B02.f47418c || !mediaCrypto.requiresSecureDecoderComponent(str)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f30190G = z10;
                            } catch (MediaCryptoException e10) {
                                throw F(e10, this.f30180B, 6006);
                            }
                        } else if (this.f30184D.a() == null) {
                            return;
                        }
                    }
                    if (C3913C.f47415d) {
                        int state = this.f30184D.getState();
                        if (state == 1) {
                            n.a aVar = (n.a) C3645a.e(this.f30184D.a());
                            throw F(aVar, this.f30180B, aVar.f47527a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    O0(this.f30188F, this.f30190G);
                } catch (b e11) {
                    throw F(e11, this.f30180B, 4001);
                }
            } else {
                H0(this.f30180B);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void O(boolean z10, boolean z11) {
        this.f30207U0 = new C3869e();
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        this.f30202P0 = false;
        this.f30203Q0 = false;
        this.f30205S0 = false;
        if (this.f30185D0) {
            this.f30236u.i();
            this.f30234t.i();
            this.f30187E0 = false;
        } else {
            s0();
        }
        if (this.f30238v.l() > 0) {
            this.f30204R0 = true;
        }
        this.f30238v.c();
        int i10 = this.f30211X0;
        if (i10 != 0) {
            this.f30209W0 = this.f30246z[i10 - 1];
            this.f30208V0 = this.f30244y[i10 - 1];
            this.f30211X0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void P0(Exception exc);

    /* access modifiers changed from: protected */
    public void Q() {
        try {
            k0();
            c1();
        } finally {
            l1((n) null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void Q0(String str, l.a aVar, long j10, long j11);

    /* access modifiers changed from: protected */
    public abstract void R0(String str);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (n0() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b4, code lost:
        if (n0() == false) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ea A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n9.C3873i S0(k9.C3718r0 r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f30204R0 = r0
            k9.q0 r1 = r12.f45824b
            java.lang.Object r1 = ja.C3645a.e(r1)
            r5 = r1
            k9.q0 r5 = (k9.C3717q0) r5
            java.lang.String r1 = r5.f45770l
            if (r1 == 0) goto L_0x00eb
            o9.n r12 = r12.f45823a
            r11.l1(r12)
            r11.f30180B = r5
            boolean r12 = r11.f30185D0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f30189F0 = r0
            return r1
        L_0x001f:
            C9.l r12 = r11.f30212Y
            if (r12 != 0) goto L_0x0029
            r11.f30217i0 = r1
            r11.N0()
            return r1
        L_0x0029:
            C9.n r1 = r11.f30219k0
            k9.q0 r4 = r11.f30213Z
            o9.n r2 = r11.f30184D
            o9.n r3 = r11.f30186E
            boolean r2 = r11.p0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.m0()
            n9.i r12 = new n9.i
            java.lang.String r3 = r1.f30166a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            o9.n r2 = r11.f30186E
            o9.n r3 = r11.f30184D
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = r0
            goto L_0x0050
        L_0x004f:
            r2 = r6
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = ja.M.f44981a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = r6
            goto L_0x005c
        L_0x005b:
            r3 = r0
        L_0x005c:
            ja.C3645a.f(r3)
            n9.i r3 = r11.Z(r1, r4, r5)
            int r7 = r3.f46963d
            r8 = 3
            if (r7 == 0) goto L_0x00d0
            r9 = 16
            r10 = 2
            if (r7 == r0) goto L_0x00b7
            if (r7 == r10) goto L_0x008b
            if (r7 != r8) goto L_0x0085
            boolean r0 = r11.s1(r5)
            if (r0 != 0) goto L_0x0079
        L_0x0077:
            r7 = r9
            goto L_0x00d4
        L_0x0079:
            r11.f30213Z = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.n0()
            if (r0 != 0) goto L_0x00d3
        L_0x0083:
            r7 = r10
            goto L_0x00d4
        L_0x0085:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x008b:
            boolean r7 = r11.s1(r5)
            if (r7 != 0) goto L_0x0092
            goto L_0x0077
        L_0x0092:
            r11.f30191G0 = r0
            r11.f30193H0 = r0
            int r7 = r11.f30220l0
            if (r7 == r10) goto L_0x00aa
            if (r7 != r0) goto L_0x00a9
            int r7 = r5.f45775q
            int r9 = r4.f45775q
            if (r7 != r9) goto L_0x00a9
            int r7 = r5.f45776r
            int r9 = r4.f45776r
            if (r7 != r9) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r0 = r6
        L_0x00aa:
            r11.f30235t0 = r0
            r11.f30213Z = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.n0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x0083
        L_0x00b7:
            boolean r0 = r11.s1(r5)
            if (r0 != 0) goto L_0x00be
            goto L_0x0077
        L_0x00be:
            r11.f30213Z = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.n0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x0083
        L_0x00c9:
            boolean r0 = r11.l0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x0083
        L_0x00d0:
            r11.m0()
        L_0x00d3:
            r7 = r6
        L_0x00d4:
            int r0 = r3.f46963d
            if (r0 == 0) goto L_0x00ea
            C9.l r0 = r11.f30212Y
            if (r0 != r12) goto L_0x00e0
            int r12 = r11.f30196J0
            if (r12 != r8) goto L_0x00ea
        L_0x00e0:
            n9.i r12 = new n9.i
            java.lang.String r3 = r1.f30166a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00ea:
            return r3
        L_0x00eb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            k9.r r12 = r11.F(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.o.S0(k9.r0):n9.i");
    }

    /* access modifiers changed from: protected */
    public void T(C3717q0[] q0VarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.f30209W0 == -9223372036854775807L) {
            if (this.f30208V0 != -9223372036854775807L) {
                z10 = false;
            }
            C3645a.f(z10);
            this.f30208V0 = j10;
            this.f30209W0 = j11;
            return;
        }
        int i10 = this.f30211X0;
        if (i10 == this.f30246z.length) {
            s.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f30246z[this.f30211X0 - 1]);
        } else {
            this.f30211X0 = i10 + 1;
        }
        long[] jArr = this.f30244y;
        int i11 = this.f30211X0;
        jArr[i11 - 1] = j10;
        this.f30246z[i11 - 1] = j11;
        this.f30178A[i11 - 1] = this.f30200N0;
    }

    /* access modifiers changed from: protected */
    public abstract void T0(C3717q0 q0Var, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void U0(long j10) {
        while (true) {
            int i10 = this.f30211X0;
            if (i10 != 0 && j10 >= this.f30178A[0]) {
                long[] jArr = this.f30244y;
                this.f30208V0 = jArr[0];
                this.f30209W0 = this.f30246z[0];
                int i11 = i10 - 1;
                this.f30211X0 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.f30246z;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f30211X0);
                long[] jArr3 = this.f30178A;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f30211X0);
                V0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void W0(C3871g gVar);

    /* access modifiers changed from: protected */
    public abstract boolean Y0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C3717q0 q0Var);

    /* access modifiers changed from: protected */
    public abstract C3873i Z(n nVar, C3717q0 q0Var, C3717q0 q0Var2);

    public final int a(C3717q0 q0Var) {
        try {
            return q1(this.f30224o, q0Var);
        } catch (v.c e10) {
            throw F(e10, q0Var, 4002);
        }
    }

    public boolean b() {
        return this.f30203Q0;
    }

    /* access modifiers changed from: protected */
    public void c1() {
        try {
            l lVar = this.f30212Y;
            if (lVar != null) {
                lVar.release();
                this.f30207U0.f46938b++;
                R0(this.f30219k0.f30166a);
            }
            this.f30212Y = null;
            try {
                MediaCrypto mediaCrypto = this.f30188F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f30188F = null;
                i1((n) null);
                f1();
            }
        } catch (Throwable th2) {
            this.f30212Y = null;
            MediaCrypto mediaCrypto2 = this.f30188F;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th2;
        } finally {
            this.f30188F = null;
            i1((n) null);
            f1();
        }
    }

    public boolean d() {
        if (this.f30180B == null || (!M() && !G0() && (this.f30243x0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f30243x0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void e1() {
        g1();
        h1();
        this.f30243x0 = -9223372036854775807L;
        this.f30198L0 = false;
        this.f30197K0 = false;
        this.f30235t0 = false;
        this.f30237u0 = false;
        this.f30181B0 = false;
        this.f30183C0 = false;
        this.f30240w.clear();
        this.f30200N0 = -9223372036854775807L;
        this.f30201O0 = -9223372036854775807L;
        i iVar = this.f30241w0;
        if (iVar != null) {
            iVar.c();
        }
        this.f30195I0 = 0;
        this.f30196J0 = 0;
        this.f30193H0 = this.f30191G0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void f1() {
        e1();
        this.f30206T0 = null;
        this.f30241w0 = null;
        this.f30217i0 = null;
        this.f30219k0 = null;
        this.f30213Z = null;
        this.f30214f0 = null;
        this.f30215g0 = false;
        this.f30199M0 = false;
        this.f30216h0 = -1.0f;
        this.f30220l0 = 0;
        this.f30221m0 = false;
        this.f30223n0 = false;
        this.f30225o0 = false;
        this.f30227p0 = false;
        this.f30229q0 = false;
        this.f30231r0 = false;
        this.f30233s0 = false;
        this.f30239v0 = false;
        this.f30191G0 = false;
        this.f30193H0 = 0;
        this.f30190G = false;
    }

    public void g(long j10, long j11) {
        boolean z10 = false;
        if (this.f30205S0) {
            this.f30205S0 = false;
            X0();
        }
        r rVar = this.f30206T0;
        if (rVar == null) {
            try {
                if (this.f30203Q0) {
                    d1();
                } else if (this.f30180B != null || a1(2)) {
                    N0();
                    if (this.f30185D0) {
                        J.a("bypassRender");
                        while (Y(j10, j11)) {
                        }
                        J.c();
                    } else if (this.f30212Y != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        J.a("drainAndFeed");
                        while (o0(j10, j11) && m1(elapsedRealtime)) {
                        }
                        while (q0() && m1(elapsedRealtime)) {
                        }
                        J.c();
                    } else {
                        this.f30207U0.f46940d += W(j10);
                        a1(1);
                    }
                    this.f30207U0.c();
                }
            } catch (IllegalStateException e10) {
                if (K0(e10)) {
                    P0(e10);
                    if (M.f44981a >= 21 && M0(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        c1();
                    }
                    throw G(j0(e10, w0()), this.f30180B, z10, 4003);
                }
                throw e10;
            }
        } else {
            this.f30206T0 = null;
            throw rVar;
        }
    }

    /* access modifiers changed from: protected */
    public m j0(Throwable th2, n nVar) {
        return new m(th2, nVar);
    }

    /* access modifiers changed from: protected */
    public final void j1() {
        this.f30205S0 = true;
    }

    /* access modifiers changed from: protected */
    public final void k1(r rVar) {
        this.f30206T0 = rVar;
    }

    /* access modifiers changed from: protected */
    public boolean n1(n nVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean o1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean p1(C3717q0 q0Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int q1(q qVar, C3717q0 q0Var);

    /* access modifiers changed from: protected */
    public final boolean s0() {
        boolean t02 = t0();
        if (t02) {
            N0();
        }
        return t02;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        boolean z10;
        if (this.f30212Y == null) {
            return false;
        }
        int i10 = this.f30196J0;
        if (i10 == 3 || this.f30223n0 || ((this.f30225o0 && !this.f30199M0) || (this.f30227p0 && this.f30198L0))) {
            c1();
            return true;
        }
        if (i10 == 2) {
            int i11 = M.f44981a;
            if (i11 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            if (i11 >= 23) {
                try {
                    t1();
                } catch (r e10) {
                    s.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    c1();
                    return true;
                }
            }
        }
        r0();
        return false;
    }

    /* access modifiers changed from: protected */
    public final void u1(long j10) {
        C3717q0 q0Var = (C3717q0) this.f30238v.j(j10);
        if (q0Var == null && this.f30215g0) {
            q0Var = (C3717q0) this.f30238v.i();
        }
        if (q0Var != null) {
            this.f30182C = q0Var;
        } else if (!this.f30215g0 || this.f30182C == null) {
            return;
        }
        T0(this.f30182C, this.f30214f0);
        this.f30215g0 = false;
    }

    public void v(float f10, float f11) {
        this.f30194I = f10;
        this.f30210X = f11;
        s1(this.f30213Z);
    }

    /* access modifiers changed from: protected */
    public final l v0() {
        return this.f30212Y;
    }

    public final int w() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public final n w0() {
        return this.f30219k0;
    }

    /* access modifiers changed from: protected */
    public boolean x0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float y0(float f10, C3717q0 q0Var, C3717q0[] q0VarArr);

    /* access modifiers changed from: protected */
    public final MediaFormat z0() {
        return this.f30214f0;
    }

    public static class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f30248a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30249b;

        /* renamed from: c  reason: collision with root package name */
        public final n f30250c;

        /* renamed from: d  reason: collision with root package name */
        public final String f30251d;

        /* renamed from: e  reason: collision with root package name */
        public final b f30252e;

        public b(C3717q0 q0Var, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + q0Var, th2, q0Var.f45770l, z10, (n) null, b(i10), (b) null);
        }

        private static String b(int i10) {
            String str;
            if (i10 < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f30248a, this.f30249b, this.f30250c, this.f30251d, bVar);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(C3717q0 q0Var, Throwable th2, boolean z10, n nVar) {
            this("Decoder init failed: " + nVar.f30166a + ", " + q0Var, th2, q0Var.f45770l, z10, nVar, M.f44981a >= 21 ? d(th2) : null, (b) null);
        }

        private b(String str, Throwable th2, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th2);
            this.f30248a = str2;
            this.f30249b = z10;
            this.f30250c = nVar;
            this.f30251d = str3;
            this.f30252e = bVar;
        }
    }

    /* access modifiers changed from: protected */
    public void R() {
    }

    /* access modifiers changed from: protected */
    public void S() {
    }

    /* access modifiers changed from: protected */
    public void V0() {
    }

    /* access modifiers changed from: protected */
    public void d1() {
    }

    /* access modifiers changed from: protected */
    public void F0(C3871g gVar) {
    }
}
