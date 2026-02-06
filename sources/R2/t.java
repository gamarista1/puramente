package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.media3.exoplayer.C1806d;
import androidx.media3.exoplayer.C1810h;
import androidx.media3.exoplayer.q0;
import com.adjust.sdk.Constants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import f2.C1973h;
import f2.s;
import i2.C2076a;
import i2.F;
import i2.H;
import i2.L;
import i2.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import l2.C2170b;
import l2.f;
import m2.k;
import m2.l;
import m2.w;
import n2.u1;
import o2.X;
import p2.C2391B;
import p2.C2409m;
import r2.C2559F;
import r2.j;

public abstract class t extends C1806d {

    /* renamed from: Z0  reason: collision with root package name */
    private static final byte[] f25666Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A  reason: collision with root package name */
    private final ArrayDeque f25667A;

    /* renamed from: A0  reason: collision with root package name */
    private int f25668A0;

    /* renamed from: B  reason: collision with root package name */
    private final X f25669B;

    /* renamed from: B0  reason: collision with root package name */
    private ByteBuffer f25670B0;

    /* renamed from: C  reason: collision with root package name */
    private s f25671C;

    /* renamed from: C0  reason: collision with root package name */
    private boolean f25672C0;

    /* renamed from: D  reason: collision with root package name */
    private s f25673D;

    /* renamed from: D0  reason: collision with root package name */
    private boolean f25674D0;

    /* renamed from: E  reason: collision with root package name */
    private C2409m f25675E;

    /* renamed from: E0  reason: collision with root package name */
    private boolean f25676E0;

    /* renamed from: F  reason: collision with root package name */
    private C2409m f25677F;

    /* renamed from: F0  reason: collision with root package name */
    private boolean f25678F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public q0.a f25679G;

    /* renamed from: G0  reason: collision with root package name */
    private boolean f25680G0;

    /* renamed from: H  reason: collision with root package name */
    private MediaCrypto f25681H;

    /* renamed from: H0  reason: collision with root package name */
    private boolean f25682H0;

    /* renamed from: I  reason: collision with root package name */
    private long f25683I;

    /* renamed from: I0  reason: collision with root package name */
    private int f25684I0;

    /* renamed from: J0  reason: collision with root package name */
    private int f25685J0;

    /* renamed from: K0  reason: collision with root package name */
    private int f25686K0;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f25687L0;

    /* renamed from: M0  reason: collision with root package name */
    private boolean f25688M0;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f25689N0;

    /* renamed from: O0  reason: collision with root package name */
    private long f25690O0;

    /* renamed from: P0  reason: collision with root package name */
    private long f25691P0;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f25692Q0;

    /* renamed from: R0  reason: collision with root package name */
    private boolean f25693R0;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f25694S0;

    /* renamed from: T0  reason: collision with root package name */
    private boolean f25695T0;

    /* renamed from: U0  reason: collision with root package name */
    private C1810h f25696U0;

    /* renamed from: V0  reason: collision with root package name */
    protected k f25697V0;

    /* renamed from: W0  reason: collision with root package name */
    private f f25698W0;

    /* renamed from: X  reason: collision with root package name */
    private float f25699X;

    /* renamed from: X0  reason: collision with root package name */
    private long f25700X0;

    /* renamed from: Y  reason: collision with root package name */
    private float f25701Y;

    /* renamed from: Y0  reason: collision with root package name */
    private boolean f25702Y0;

    /* renamed from: Z  reason: collision with root package name */
    private j f25703Z;

    /* renamed from: f0  reason: collision with root package name */
    private s f25704f0;

    /* renamed from: g0  reason: collision with root package name */
    private MediaFormat f25705g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f25706h0;

    /* renamed from: i0  reason: collision with root package name */
    private float f25707i0;

    /* renamed from: j0  reason: collision with root package name */
    private ArrayDeque f25708j0;

    /* renamed from: k0  reason: collision with root package name */
    private d f25709k0;

    /* renamed from: l0  reason: collision with root package name */
    private m f25710l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f25711m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f25712n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f25713o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f25714p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f25715q0;

    /* renamed from: r  reason: collision with root package name */
    private final j.b f25716r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f25717r0;

    /* renamed from: s  reason: collision with root package name */
    private final w f25718s;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f25719s0;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f25720t;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f25721t0;

    /* renamed from: u  reason: collision with root package name */
    private final float f25722u;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f25723u0;

    /* renamed from: v  reason: collision with root package name */
    private final l2.f f25724v = l2.f.z();

    /* renamed from: v0  reason: collision with root package name */
    private boolean f25725v0;

    /* renamed from: w  reason: collision with root package name */
    private final l2.f f25726w = new l2.f(0);

    /* renamed from: w0  reason: collision with root package name */
    private boolean f25727w0;

    /* renamed from: x  reason: collision with root package name */
    private final l2.f f25728x = new l2.f(2);

    /* renamed from: x0  reason: collision with root package name */
    private boolean f25729x0;

    /* renamed from: y  reason: collision with root package name */
    private final C2568h f25730y;

    /* renamed from: y0  reason: collision with root package name */
    private long f25731y0;

    /* renamed from: z  reason: collision with root package name */
    private final MediaCodec.BufferInfo f25732z;

    /* renamed from: z0  reason: collision with root package name */
    private int f25733z0;

    private static final class b {
        public static boolean a(j jVar, e eVar) {
            return jVar.n(eVar);
        }
    }

    private static final class c {
        public static void a(j.a aVar, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f25646b.setString("log-session-id", a10.getStringId());
            }
        }
    }

    private final class e implements j.c {
        private e() {
        }

        public void a() {
            if (t.this.f25679G != null) {
                t.this.f25679G.b();
            }
        }

        public void b() {
            if (t.this.f25679G != null) {
                t.this.f25679G.b();
            }
        }
    }

    private static final class f {

        /* renamed from: e  reason: collision with root package name */
        public static final f f25740e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f25741a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25742b;

        /* renamed from: c  reason: collision with root package name */
        public final long f25743c;

        /* renamed from: d  reason: collision with root package name */
        public final F f25744d = new F();

        public f(long j10, long j11, long j12) {
            this.f25741a = j10;
            this.f25742b = j11;
            this.f25743c = j12;
        }
    }

    public t(int i10, j.b bVar, w wVar, boolean z10, float f10) {
        super(i10);
        this.f25716r = bVar;
        this.f25718s = (w) C2076a.e(wVar);
        this.f25720t = z10;
        this.f25722u = f10;
        C2568h hVar = new C2568h();
        this.f25730y = hVar;
        this.f25732z = new MediaCodec.BufferInfo();
        this.f25699X = 1.0f;
        this.f25701Y = 1.0f;
        this.f25683I = -9223372036854775807L;
        this.f25667A = new ArrayDeque();
        this.f25698W0 = f.f25740e;
        hVar.u(0);
        hVar.f23520d.order(ByteOrder.nativeOrder());
        this.f25669B = new X();
        this.f25707i0 = -1.0f;
        this.f25711m0 = 0;
        this.f25684I0 = 0;
        this.f25733z0 = -1;
        this.f25668A0 = -1;
        this.f25731y0 = -9223372036854775807L;
        this.f25690O0 = -9223372036854775807L;
        this.f25691P0 = -9223372036854775807L;
        this.f25700X0 = -9223372036854775807L;
        this.f25685J0 = 0;
        this.f25686K0 = 0;
        this.f25697V0 = new k();
    }

    private static boolean A0(String str) {
        if (L.f22072a != 29 || !"c2.android.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    private void B1() {
        this.f25689N0 = true;
        MediaFormat c10 = ((j) C2076a.e(this.f25703Z)).c();
        if (this.f25711m0 != 0 && c10.getInteger(Snapshot.WIDTH) == 32 && c10.getInteger(Snapshot.HEIGHT) == 32) {
            this.f25725v0 = true;
            return;
        }
        if (this.f25721t0) {
            c10.setInteger("channel-count", 1);
        }
        this.f25705g0 = c10;
        this.f25706h0 = true;
    }

    private void C0() {
        this.f25680G0 = false;
        this.f25730y.i();
        this.f25728x.i();
        this.f25678F0 = false;
        this.f25676E0 = false;
        this.f25669B.d();
    }

    private boolean C1(int i10) {
        w V10 = V();
        this.f25724v.i();
        int m02 = m0(V10, this.f25724v, i10 | 4);
        if (m02 == -5) {
            s1(V10);
            return true;
        } else if (m02 != -4 || !this.f25724v.m()) {
            return false;
        } else {
            this.f25692Q0 = true;
            z1();
            return false;
        }
    }

    private boolean D0() {
        if (this.f25687L0) {
            this.f25685J0 = 1;
            if (this.f25713o0 || this.f25715q0) {
                this.f25686K0 = 3;
                return false;
            }
            this.f25686K0 = 1;
        }
        return true;
    }

    private void D1() {
        E1();
        n1();
    }

    private void E0() {
        if (this.f25687L0) {
            this.f25685J0 = 1;
            this.f25686K0 = 3;
            return;
        }
        D1();
    }

    private boolean F0() {
        if (this.f25687L0) {
            this.f25685J0 = 1;
            if (this.f25713o0 || this.f25715q0) {
                this.f25686K0 = 3;
                return false;
            }
            this.f25686K0 = 2;
        } else {
            W1();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G0(long r20, long r22) {
        /*
            r19 = this;
            r15 = r19
            r2.j r0 = r15.f25703Z
            java.lang.Object r0 = i2.C2076a.e(r0)
            r5 = r0
            r2.j r5 = (r2.j) r5
            boolean r0 = r19.c1()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r15.f25717r0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r15.f25688M0
            if (r0 == 0) goto L_0x002e
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z     // Catch:{ IllegalStateException -> 0x0023 }
            int r0 = r5.k(r0)     // Catch:{ IllegalStateException -> 0x0023 }
            goto L_0x0034
        L_0x0023:
            r19.z1()
            boolean r0 = r15.f25693R0
            if (r0 == 0) goto L_0x002d
            r19.E1()
        L_0x002d:
            return r14
        L_0x002e:
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            int r0 = r5.k(r0)
        L_0x0034:
            if (r0 >= 0) goto L_0x004e
            r1 = -2
            if (r0 != r1) goto L_0x003d
            r19.B1()
            return r16
        L_0x003d:
            boolean r0 = r15.f25727w0
            if (r0 == 0) goto L_0x004d
            boolean r0 = r15.f25692Q0
            if (r0 != 0) goto L_0x004a
            int r0 = r15.f25685J0
            r1 = 2
            if (r0 != r1) goto L_0x004d
        L_0x004a:
            r19.z1()
        L_0x004d:
            return r14
        L_0x004e:
            boolean r1 = r15.f25725v0
            if (r1 == 0) goto L_0x0058
            r15.f25725v0 = r14
            r5.l(r0, r14)
            return r16
        L_0x0058:
            android.media.MediaCodec$BufferInfo r1 = r15.f25732z
            int r2 = r1.size
            if (r2 != 0) goto L_0x0068
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0068
            r19.z1()
            return r14
        L_0x0068:
            r15.f25668A0 = r0
            java.nio.ByteBuffer r0 = r5.m(r0)
            r15.f25670B0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.f25732z
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f25670B0
            android.media.MediaCodec$BufferInfo r1 = r15.f25732z
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.f25719s0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00a8
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            long r3 = r0.presentationTimeUs
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x00a8
            int r3 = r0.flags
            r3 = r3 & 4
            if (r3 == 0) goto L_0x00a8
            long r3 = r15.f25690O0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00a8
            long r3 = r15.f25691P0
            r0.presentationTimeUs = r3
        L_0x00a8:
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            long r3 = r0.presentationTimeUs
            long r6 = r19.X()
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b7
            r0 = r16
            goto L_0x00b8
        L_0x00b7:
            r0 = r14
        L_0x00b8:
            r15.f25672C0 = r0
            long r3 = r15.f25691P0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            long r0 = r0.presentationTimeUs
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00cb
            r0 = r16
            goto L_0x00cc
        L_0x00cb:
            r0 = r14
        L_0x00cc:
            r15.f25674D0 = r0
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            long r0 = r0.presentationTimeUs
            r15.X1(r0)
        L_0x00d5:
            boolean r0 = r15.f25717r0
            if (r0 == 0) goto L_0x0112
            boolean r0 = r15.f25688M0
            if (r0 == 0) goto L_0x0112
            java.nio.ByteBuffer r6 = r15.f25670B0     // Catch:{ IllegalStateException -> 0x0105 }
            int r7 = r15.f25668A0     // Catch:{ IllegalStateException -> 0x0105 }
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z     // Catch:{ IllegalStateException -> 0x0105 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0105 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0105 }
            boolean r12 = r15.f25672C0     // Catch:{ IllegalStateException -> 0x0105 }
            boolean r13 = r15.f25674D0     // Catch:{ IllegalStateException -> 0x0105 }
            f2.s r0 = r15.f25673D     // Catch:{ IllegalStateException -> 0x0105 }
            java.lang.Object r0 = i2.C2076a.e(r0)     // Catch:{ IllegalStateException -> 0x0105 }
            r17 = r0
            f2.s r17 = (f2.s) r17     // Catch:{ IllegalStateException -> 0x0105 }
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            r18 = r14
            r14 = r17
            boolean r0 = r0.A1(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0107 }
            goto L_0x0136
        L_0x0105:
            r18 = r14
        L_0x0107:
            r19.z1()
            boolean r0 = r15.f25693R0
            if (r0 == 0) goto L_0x0111
            r19.E1()
        L_0x0111:
            return r18
        L_0x0112:
            r18 = r14
            java.nio.ByteBuffer r6 = r15.f25670B0
            int r7 = r15.f25668A0
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            int r8 = r0.flags
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f25672C0
            boolean r13 = r15.f25674D0
            f2.s r0 = r15.f25673D
            java.lang.Object r0 = i2.C2076a.e(r0)
            r14 = r0
            f2.s r14 = (f2.s) r14
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.A1(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0136:
            if (r0 == 0) goto L_0x0155
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            long r0 = r0.presentationTimeUs
            r15.v1(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f25732z
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x014a
            r14 = r16
            goto L_0x014c
        L_0x014a:
            r14 = r18
        L_0x014c:
            r19.J1()
            if (r14 != 0) goto L_0x0152
            return r16
        L_0x0152:
            r19.z1()
        L_0x0155:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.t.G0(long, long):boolean");
    }

    private boolean H0(m mVar, s sVar, C2409m mVar2, C2409m mVar3) {
        C2170b d10;
        C2170b d11;
        if (mVar2 == mVar3) {
            return false;
        }
        if (!(mVar3 == null || mVar2 == null || (d10 = mVar3.d()) == null || (d11 = mVar2.d()) == null || !d10.getClass().equals(d11.getClass()))) {
            if (!(d10 instanceof C2391B)) {
                return false;
            }
            if (!mVar3.b().equals(mVar2.b()) || L.f22072a < 23) {
                return true;
            }
            UUID uuid = C1973h.f19976e;
            if (!uuid.equals(mVar2.b()) && !uuid.equals(mVar3.b())) {
                if (mVar.f25660g || !mVar3.f((String) C2076a.e(sVar.f20083n))) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    private boolean I0() {
        int i10;
        if (this.f25703Z == null || (i10 = this.f25685J0) == 2 || this.f25692Q0) {
            return false;
        }
        if (i10 == 0 && R1()) {
            E0();
        }
        j jVar = (j) C2076a.e(this.f25703Z);
        if (this.f25733z0 < 0) {
            int j10 = jVar.j();
            this.f25733z0 = j10;
            if (j10 < 0) {
                return false;
            }
            this.f25726w.f23520d = jVar.e(j10);
            this.f25726w.i();
        }
        if (this.f25685J0 == 1) {
            if (!this.f25727w0) {
                this.f25688M0 = true;
                jVar.a(this.f25733z0, 0, 0, 0, 4);
                I1();
            }
            this.f25685J0 = 2;
            return false;
        } else if (this.f25723u0) {
            this.f25723u0 = false;
            byte[] bArr = f25666Z0;
            ((ByteBuffer) C2076a.e(this.f25726w.f23520d)).put(bArr);
            jVar.a(this.f25733z0, 0, bArr.length, 0, 0);
            I1();
            this.f25687L0 = true;
            return true;
        } else {
            if (this.f25684I0 == 1) {
                for (int i11 = 0; i11 < ((s) C2076a.e(this.f25704f0)).f20086q.size(); i11++) {
                    ((ByteBuffer) C2076a.e(this.f25726w.f23520d)).put((byte[]) this.f25704f0.f20086q.get(i11));
                }
                this.f25684I0 = 2;
            }
            int position = ((ByteBuffer) C2076a.e(this.f25726w.f23520d)).position();
            w V10 = V();
            try {
                int m02 = m0(V10, this.f25726w, 0);
                if (m02 == -3) {
                    if (h()) {
                        this.f25691P0 = this.f25690O0;
                    }
                    return false;
                } else if (m02 == -5) {
                    if (this.f25684I0 == 2) {
                        this.f25726w.i();
                        this.f25684I0 = 1;
                    }
                    s1(V10);
                    return true;
                } else if (this.f25726w.m()) {
                    this.f25691P0 = this.f25690O0;
                    if (this.f25684I0 == 2) {
                        this.f25726w.i();
                        this.f25684I0 = 1;
                    }
                    this.f25692Q0 = true;
                    if (!this.f25687L0) {
                        z1();
                        return false;
                    }
                    try {
                        if (!this.f25727w0) {
                            this.f25688M0 = true;
                            jVar.a(this.f25733z0, 0, 0, 0, 4);
                            I1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw R(e10, this.f25671C, L.V(e10.getErrorCode()));
                    }
                } else if (this.f25687L0 || this.f25726w.p()) {
                    boolean y10 = this.f25726w.y();
                    if (y10) {
                        this.f25726w.f23519c.b(position);
                    }
                    if (this.f25712n0 && !y10) {
                        j2.d.b((ByteBuffer) C2076a.e(this.f25726w.f23520d));
                        if (((ByteBuffer) C2076a.e(this.f25726w.f23520d)).position() == 0) {
                            return true;
                        }
                        this.f25712n0 = false;
                    }
                    long j11 = this.f25726w.f23522f;
                    if (this.f25694S0) {
                        if (!this.f25667A.isEmpty()) {
                            ((f) this.f25667A.peekLast()).f25744d.a(j11, (s) C2076a.e(this.f25671C));
                        } else {
                            this.f25698W0.f25744d.a(j11, (s) C2076a.e(this.f25671C));
                        }
                        this.f25694S0 = false;
                    }
                    this.f25690O0 = Math.max(this.f25690O0, j11);
                    if (h() || this.f25726w.r()) {
                        this.f25691P0 = this.f25690O0;
                    }
                    this.f25726w.x();
                    if (this.f25726w.l()) {
                        b1(this.f25726w);
                    }
                    x1(this.f25726w);
                    int O02 = O0(this.f25726w);
                    if (y10) {
                        try {
                            ((j) C2076a.e(jVar)).g(this.f25733z0, 0, this.f25726w.f23519c, j11, O02);
                        } catch (MediaCodec.CryptoException e11) {
                            throw R(e11, this.f25671C, L.V(e11.getErrorCode()));
                        }
                    } else {
                        ((j) C2076a.e(jVar)).a(this.f25733z0, 0, ((ByteBuffer) C2076a.e(this.f25726w.f23520d)).limit(), j11, O02);
                    }
                    I1();
                    this.f25687L0 = true;
                    this.f25684I0 = 0;
                    this.f25697V0.f23705c++;
                    return true;
                } else {
                    this.f25726w.i();
                    if (this.f25684I0 == 2) {
                        this.f25684I0 = 1;
                    }
                    return true;
                }
            } catch (f.a e12) {
                p1(e12);
                C1(0);
                J0();
                return true;
            }
        }
    }

    private void I1() {
        this.f25733z0 = -1;
        this.f25726w.f23520d = null;
    }

    private void J0() {
        try {
            ((j) C2076a.i(this.f25703Z)).flush();
        } finally {
            G1();
        }
    }

    private void J1() {
        this.f25668A0 = -1;
        this.f25670B0 = null;
    }

    private void K1(C2409m mVar) {
        C2409m.g(this.f25675E, mVar);
        this.f25675E = mVar;
    }

    private void L1(f fVar) {
        this.f25698W0 = fVar;
        long j10 = fVar.f25743c;
        if (j10 != -9223372036854775807L) {
            this.f25702Y0 = true;
            u1(j10);
        }
    }

    private List M0(boolean z10) {
        s sVar = (s) C2076a.e(this.f25671C);
        List T02 = T0(this.f25718s, sVar, z10);
        if (T02.isEmpty() && z10) {
            T02 = T0(this.f25718s, sVar, false);
            if (!T02.isEmpty()) {
                p.h("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f20083n + ", but no secure decoder available. Trying to proceed with " + T02 + ".");
            }
        }
        return T02;
    }

    private void O1(C2409m mVar) {
        C2409m.g(this.f25677F, mVar);
        this.f25677F = mVar;
    }

    private boolean P1(long j10) {
        if (this.f25683I == -9223372036854775807L || T().a() - j10 < this.f25683I) {
            return true;
        }
        return false;
    }

    protected static boolean U1(s sVar) {
        int i10 = sVar.f20068K;
        if (i10 == 0 || i10 == 2) {
            return true;
        }
        return false;
    }

    private boolean V1(s sVar) {
        if (!(L.f22072a < 23 || this.f25703Z == null || this.f25686K0 == 3 || getState() == 0)) {
            float R02 = R0(this.f25701Y, (s) C2076a.e(sVar), Z());
            float f10 = this.f25707i0;
            if (f10 == R02) {
                return true;
            }
            if (R02 == -1.0f) {
                E0();
                return false;
            } else if (f10 == -1.0f && R02 <= this.f25722u) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", R02);
                ((j) C2076a.e(this.f25703Z)).b(bundle);
                this.f25707i0 = R02;
            }
        }
        return true;
    }

    private void W1() {
        C2170b d10 = ((C2409m) C2076a.e(this.f25677F)).d();
        if (d10 instanceof C2391B) {
            try {
                ((MediaCrypto) C2076a.e(this.f25681H)).setMediaDrmSession(((C2391B) d10).f25183b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f25671C, 6006);
            }
        }
        K1(this.f25677F);
        this.f25685J0 = 0;
        this.f25686K0 = 0;
    }

    private boolean c1() {
        if (this.f25668A0 >= 0) {
            return true;
        }
        return false;
    }

    private boolean d1() {
        if (!this.f25730y.H()) {
            return true;
        }
        long X10 = X();
        if (j1(X10, this.f25730y.F()) == j1(X10, this.f25728x.f23522f)) {
            return true;
        }
        return false;
    }

    private void e1(s sVar) {
        C0();
        String str = sVar.f20083n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f25730y.I(32);
        } else {
            this.f25730y.I(1);
        }
        this.f25676E0 = true;
    }

    private void f1(m mVar, MediaCrypto mediaCrypto) {
        float f10;
        boolean z10;
        boolean z11;
        s sVar = (s) C2076a.e(this.f25671C);
        String str = mVar.f25654a;
        int i10 = L.f22072a;
        float f11 = -1.0f;
        if (i10 < 23) {
            f10 = -1.0f;
        } else {
            f10 = R0(this.f25701Y, sVar, Z());
        }
        if (f10 > this.f25722u) {
            f11 = f10;
        }
        y1(sVar);
        long a10 = T().a();
        j.a W02 = W0(mVar, sVar, mediaCrypto, f11);
        if (i10 >= 31) {
            c.a(W02, Y());
        }
        try {
            H.a("createCodec:" + str);
            j a11 = this.f25716r.a(W02);
            this.f25703Z = a11;
            boolean z12 = false;
            if (i10 < 21 || !b.a(a11, new e())) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f25729x0 = z10;
            H.b();
            long a12 = T().a();
            if (!mVar.m(sVar)) {
                p.h("MediaCodecRenderer", L.F("Format exceeds selected codec's capabilities [%s, %s]", s.g(sVar), str));
            }
            this.f25710l0 = mVar;
            this.f25707i0 = f11;
            this.f25704f0 = sVar;
            this.f25711m0 = t0(str);
            this.f25712n0 = u0(str, (s) C2076a.e(this.f25704f0));
            this.f25713o0 = z0(str);
            this.f25714p0 = A0(str);
            this.f25715q0 = w0(str);
            this.f25717r0 = x0(str);
            this.f25719s0 = v0(str);
            this.f25721t0 = false;
            if (y0(mVar) || Q0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25727w0 = z11;
            if (((j) C2076a.e(this.f25703Z)).h()) {
                this.f25682H0 = true;
                this.f25684I0 = 1;
                if (this.f25711m0 != 0) {
                    z12 = true;
                }
                this.f25723u0 = z12;
            }
            if (getState() == 2) {
                this.f25731y0 = T().a() + 1000;
            }
            this.f25697V0.f23703a++;
            q1(str, W02, a12, a12 - a10);
        } catch (Throwable th2) {
            H.b();
            throw th2;
        }
    }

    private boolean g1() {
        boolean z10;
        if (this.f25681H == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        C2409m mVar = this.f25675E;
        C2170b d10 = mVar.d();
        if (C2391B.f25181d && (d10 instanceof C2391B)) {
            int state = mVar.getState();
            if (state == 1) {
                C2409m.a aVar = (C2409m.a) C2076a.e(mVar.a());
                throw R(aVar, this.f25671C, aVar.f25287a);
            } else if (state != 4) {
                return false;
            }
        }
        if (d10 != null) {
            if (d10 instanceof C2391B) {
                C2391B b10 = (C2391B) d10;
                try {
                    this.f25681H = new MediaCrypto(b10.f25182a, b10.f25183b);
                } catch (MediaCryptoException e10) {
                    throw R(e10, this.f25671C, 6006);
                }
            }
            return true;
        } else if (mVar.a() != null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean j1(long j10, long j11) {
        s sVar;
        if (j11 >= j10 || ((sVar = this.f25673D) != null && Objects.equals(sVar.f20083n, "audio/opus") && z2.H.g(j10, j11))) {
            return false;
        }
        return true;
    }

    private static boolean k1(IllegalStateException illegalStateException) {
        if (L.f22072a >= 21 && l1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private static boolean l1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void o1(MediaCrypto mediaCrypto, boolean z10) {
        s sVar = (s) C2076a.e(this.f25671C);
        if (this.f25708j0 == null) {
            try {
                List M02 = M0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f25708j0 = arrayDeque;
                if (this.f25720t) {
                    arrayDeque.addAll(M02);
                } else if (!M02.isEmpty()) {
                    this.f25708j0.add((m) M02.get(0));
                }
                this.f25709k0 = null;
            } catch (C2559F.c e10) {
                throw new d(sVar, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.f25708j0.isEmpty()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) C2076a.e(this.f25708j0);
            while (this.f25703Z == null) {
                m mVar = (m) C2076a.e((m) arrayDeque2.peekFirst());
                if (Q1(mVar)) {
                    try {
                        f1(mVar, mediaCrypto);
                    } catch (Exception e11) {
                        p.i("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e11);
                        arrayDeque2.removeFirst();
                        d dVar = new d(sVar, (Throwable) e11, z10, mVar);
                        p1(dVar);
                        if (this.f25709k0 == null) {
                            this.f25709k0 = dVar;
                        } else {
                            this.f25709k0 = this.f25709k0.c(dVar);
                        }
                        if (arrayDeque2.isEmpty()) {
                            throw this.f25709k0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f25708j0 = null;
            return;
        }
        throw new d(sVar, (Throwable) null, z10, -49999);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q0() {
        /*
            r8 = this;
            boolean r0 = r8.f25692Q0
            r1 = 1
            r0 = r0 ^ r1
            i2.C2076a.g(r0)
            m2.w r0 = r8.V()
            l2.f r2 = r8.f25728x
            r2.i()
        L_0x0010:
            l2.f r2 = r8.f25728x
            r2.i()
            l2.f r2 = r8.f25728x
            r3 = 0
            int r2 = r8.m0(r0, r2, r3)
            r4 = -5
            if (r2 == r4) goto L_0x0105
            r4 = -4
            if (r2 == r4) goto L_0x0036
            r0 = -3
            if (r2 != r0) goto L_0x0030
            boolean r0 = r8.h()
            if (r0 == 0) goto L_0x002f
            long r0 = r8.f25690O0
            r8.f25691P0 = r0
        L_0x002f:
            return
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0036:
            l2.f r2 = r8.f25728x
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x0045
            r8.f25692Q0 = r1
            long r0 = r8.f25690O0
            r8.f25691P0 = r0
            return
        L_0x0045:
            long r4 = r8.f25690O0
            l2.f r2 = r8.f25728x
            long r6 = r2.f23522f
            long r4 = java.lang.Math.max(r4, r6)
            r8.f25690O0 = r4
            boolean r2 = r8.h()
            if (r2 != 0) goto L_0x005f
            l2.f r2 = r8.f25726w
            boolean r2 = r2.r()
            if (r2 == 0) goto L_0x0063
        L_0x005f:
            long r4 = r8.f25690O0
            r8.f25691P0 = r4
        L_0x0063:
            boolean r2 = r8.f25694S0
            java.lang.String r4 = "audio/opus"
            if (r2 == 0) goto L_0x00b1
            f2.s r2 = r8.f25671C
            java.lang.Object r2 = i2.C2076a.e(r2)
            f2.s r2 = (f2.s) r2
            r8.f25673D = r2
            java.lang.String r2 = r2.f20083n
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00a9
            f2.s r2 = r8.f25673D
            java.util.List r2 = r2.f20086q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00a9
            f2.s r2 = r8.f25673D
            java.util.List r2 = r2.f20086q
            java.lang.Object r2 = r2.get(r3)
            byte[] r2 = (byte[]) r2
            int r2 = z2.H.f(r2)
            f2.s r5 = r8.f25673D
            java.lang.Object r5 = i2.C2076a.e(r5)
            f2.s r5 = (f2.s) r5
            f2.s$b r5 = r5.a()
            f2.s$b r2 = r5.V(r2)
            f2.s r2 = r2.K()
            r8.f25673D = r2
        L_0x00a9:
            f2.s r2 = r8.f25673D
            r5 = 0
            r8.t1(r2, r5)
            r8.f25694S0 = r3
        L_0x00b1:
            l2.f r2 = r8.f25728x
            r2.x()
            f2.s r2 = r8.f25673D
            if (r2 == 0) goto L_0x00f2
            java.lang.String r2 = r2.f20083n
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00f2
            l2.f r2 = r8.f25728x
            boolean r2 = r2.l()
            if (r2 == 0) goto L_0x00d3
            l2.f r2 = r8.f25728x
            f2.s r3 = r8.f25673D
            r2.f23518b = r3
            r8.b1(r2)
        L_0x00d3:
            long r2 = r8.X()
            l2.f r4 = r8.f25728x
            long r4 = r4.f23522f
            boolean r2 = z2.H.g(r2, r4)
            if (r2 == 0) goto L_0x00f2
            o2.X r2 = r8.f25669B
            l2.f r3 = r8.f25728x
            f2.s r4 = r8.f25673D
            java.lang.Object r4 = i2.C2076a.e(r4)
            f2.s r4 = (f2.s) r4
            java.util.List r4 = r4.f20086q
            r2.a(r3, r4)
        L_0x00f2:
            boolean r2 = r8.d1()
            if (r2 == 0) goto L_0x0102
            r2.h r2 = r8.f25730y
            l2.f r3 = r8.f25728x
            boolean r2 = r2.C(r3)
            if (r2 != 0) goto L_0x0010
        L_0x0102:
            r8.f25678F0 = r1
            return
        L_0x0105:
            r8.s1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.t.q0():void");
    }

    private boolean r0(long j10, long j11) {
        boolean z10;
        C2076a.g(!this.f25693R0);
        if (this.f25730y.H()) {
            C2568h hVar = this.f25730y;
            if (!A1(j10, j11, (j) null, hVar.f23520d, this.f25668A0, 0, hVar.G(), this.f25730y.E(), j1(X(), this.f25730y.F()), this.f25730y.m(), (s) C2076a.e(this.f25673D))) {
                return false;
            }
            v1(this.f25730y.F());
            this.f25730y.i();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f25692Q0) {
            this.f25693R0 = true;
            return z10;
        }
        if (this.f25678F0) {
            C2076a.g(this.f25730y.C(this.f25728x));
            this.f25678F0 = z10;
        }
        if (this.f25680G0) {
            if (this.f25730y.H()) {
                return true;
            }
            C0();
            this.f25680G0 = z10;
            n1();
            if (!this.f25676E0) {
                return z10;
            }
        }
        q0();
        if (this.f25730y.H()) {
            this.f25730y.x();
        }
        if (this.f25730y.H() || this.f25692Q0 || this.f25680G0) {
            return true;
        }
        return z10;
    }

    private int t0(String str) {
        int i10 = L.f22072a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = L.f22075d;
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
        String str3 = L.f22073b;
        if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
            return 1;
        }
        return 0;
    }

    private static boolean u0(String str, s sVar) {
        if (L.f22072a >= 21 || !sVar.f20086q.isEmpty() || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean v0(String str) {
        if (L.f22072a < 21 && "OMX.SEC.mp3.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(L.f22074c)) {
            String str2 = L.f22073b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean w0(String str) {
        int i10 = L.f22072a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 == 19) {
                String str2 = L.f22073b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean x0(String str) {
        if (L.f22072a != 21 || !"OMX.google.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean y0(m mVar) {
        String str = mVar.f25654a;
        int i10 = L.f22072a;
        if ((i10 > 25 || !"OMX.rk.video_decoder.avc".equals(str)) && ((i10 > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str) && !"OMX.bcm.vdec.avc.tunnel".equals(str) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str) && !"OMX.bcm.vdec.hevc.tunnel".equals(str) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) && (!"Amazon".equals(L.f22074c) || !"AFTS".equals(L.f22075d) || !mVar.f25660g))) {
            return false;
        }
        return true;
    }

    private static boolean z0(String str) {
        if (L.f22072a != 19 || !L.f22075d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str))) {
            return false;
        }
        return true;
    }

    private void z1() {
        int i10 = this.f25686K0;
        if (i10 == 1) {
            J0();
        } else if (i10 == 2) {
            J0();
            W1();
        } else if (i10 != 3) {
            this.f25693R0 = true;
            F1();
        } else {
            D1();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean A1(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar);

    /* access modifiers changed from: protected */
    public l B0(Throwable th2, m mVar) {
        return new l(th2, mVar);
    }

    /* access modifiers changed from: protected */
    public void E1() {
        try {
            j jVar = this.f25703Z;
            if (jVar != null) {
                jVar.release();
                this.f25697V0.f23704b++;
                r1(((m) C2076a.e(this.f25710l0)).f25654a);
            }
            this.f25703Z = null;
            try {
                MediaCrypto mediaCrypto = this.f25681H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f25681H = null;
                K1((C2409m) null);
                H1();
            }
        } catch (Throwable th2) {
            this.f25703Z = null;
            MediaCrypto mediaCrypto2 = this.f25681H;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th2;
        } finally {
            this.f25681H = null;
            K1((C2409m) null);
            H1();
        }
    }

    /* access modifiers changed from: protected */
    public void G1() {
        I1();
        J1();
        this.f25731y0 = -9223372036854775807L;
        this.f25688M0 = false;
        this.f25687L0 = false;
        this.f25723u0 = false;
        this.f25725v0 = false;
        this.f25672C0 = false;
        this.f25674D0 = false;
        this.f25690O0 = -9223372036854775807L;
        this.f25691P0 = -9223372036854775807L;
        this.f25700X0 = -9223372036854775807L;
        this.f25685J0 = 0;
        this.f25686K0 = 0;
        this.f25684I0 = this.f25682H0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void H1() {
        G1();
        this.f25696U0 = null;
        this.f25708j0 = null;
        this.f25710l0 = null;
        this.f25704f0 = null;
        this.f25705g0 = null;
        this.f25706h0 = false;
        this.f25689N0 = false;
        this.f25707i0 = -1.0f;
        this.f25711m0 = 0;
        this.f25712n0 = false;
        this.f25713o0 = false;
        this.f25714p0 = false;
        this.f25715q0 = false;
        this.f25717r0 = false;
        this.f25719s0 = false;
        this.f25721t0 = false;
        this.f25727w0 = false;
        this.f25729x0 = false;
        this.f25682H0 = false;
        this.f25684I0 = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean K0() {
        boolean L02 = L0();
        if (L02) {
            n1();
        }
        return L02;
    }

    /* access modifiers changed from: protected */
    public boolean L0() {
        boolean z10;
        if (this.f25703Z == null) {
            return false;
        }
        int i10 = this.f25686K0;
        if (i10 == 3 || this.f25713o0 || ((this.f25714p0 && !this.f25689N0) || (this.f25715q0 && this.f25688M0))) {
            E1();
            return true;
        }
        if (i10 == 2) {
            int i11 = L.f22072a;
            if (i11 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            if (i11 >= 23) {
                try {
                    W1();
                } catch (C1810h e10) {
                    p.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    E1();
                    return true;
                }
            }
        }
        J0();
        return false;
    }

    public final long M(long j10, long j11) {
        return U0(this.f25729x0, j10, j11);
    }

    /* access modifiers changed from: protected */
    public final void M1() {
        this.f25695T0 = true;
    }

    /* access modifiers changed from: protected */
    public final j N0() {
        return this.f25703Z;
    }

    /* access modifiers changed from: protected */
    public final void N1(C1810h hVar) {
        this.f25696U0 = hVar;
    }

    /* access modifiers changed from: protected */
    public int O0(l2.f fVar) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final m P0() {
        return this.f25710l0;
    }

    /* access modifiers changed from: protected */
    public boolean Q0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean Q1(m mVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract float R0(float f10, s sVar, s[] sVarArr);

    /* access modifiers changed from: protected */
    public boolean R1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat S0() {
        return this.f25705g0;
    }

    /* access modifiers changed from: protected */
    public boolean S1(s sVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract List T0(w wVar, s sVar, boolean z10);

    /* access modifiers changed from: protected */
    public abstract int T1(w wVar, s sVar);

    /* access modifiers changed from: protected */
    public long U0(boolean z10, long j10, long j11) {
        return super.M(j10, j11);
    }

    /* access modifiers changed from: protected */
    public long V0() {
        return this.f25691P0;
    }

    /* access modifiers changed from: protected */
    public abstract j.a W0(m mVar, s sVar, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public final long X0() {
        return this.f25698W0.f25743c;
    }

    /* access modifiers changed from: protected */
    public final void X1(long j10) {
        s sVar = (s) this.f25698W0.f25744d.j(j10);
        if (sVar == null && this.f25702Y0 && this.f25705g0 != null) {
            sVar = (s) this.f25698W0.f25744d.i();
        }
        if (sVar != null) {
            this.f25673D = sVar;
        } else if (!this.f25706h0 || this.f25673D == null) {
            return;
        }
        t1((s) C2076a.e(this.f25673D), this.f25705g0);
        this.f25706h0 = false;
        this.f25702Y0 = false;
    }

    /* access modifiers changed from: protected */
    public final long Y0() {
        return this.f25698W0.f25742b;
    }

    /* access modifiers changed from: protected */
    public float Z0() {
        return this.f25699X;
    }

    public final int a(s sVar) {
        try {
            return T1(this.f25718s, sVar);
        } catch (C2559F.c e10) {
            throw R(e10, sVar, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public final q0.a a1() {
        return this.f25679G;
    }

    public boolean b() {
        return this.f25693R0;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f25671C = null;
        L1(f.f25740e);
        this.f25667A.clear();
        L0();
    }

    /* access modifiers changed from: protected */
    public abstract void b1(l2.f fVar);

    /* access modifiers changed from: protected */
    public void c0(boolean z10, boolean z11) {
        this.f25697V0 = new k();
    }

    public boolean d() {
        if (this.f25671C == null || (!a0() && !c1() && (this.f25731y0 == -9223372036854775807L || T().a() >= this.f25731y0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        this.f25692Q0 = false;
        this.f25693R0 = false;
        this.f25695T0 = false;
        if (this.f25676E0) {
            this.f25730y.i();
            this.f25728x.i();
            this.f25678F0 = false;
            this.f25669B.d();
        } else {
            K0();
        }
        if (this.f25698W0.f25744d.l() > 0) {
            this.f25694S0 = true;
        }
        this.f25698W0.f25744d.c();
        this.f25667A.clear();
    }

    public void g(long j10, long j11) {
        int i10;
        boolean z10 = false;
        if (this.f25695T0) {
            this.f25695T0 = false;
            z1();
        }
        C1810h hVar = this.f25696U0;
        if (hVar == null) {
            try {
                if (this.f25693R0) {
                    F1();
                } else if (this.f25671C != null || C1(2)) {
                    n1();
                    if (this.f25676E0) {
                        H.a("bypassRender");
                        while (r0(j10, j11)) {
                        }
                        H.b();
                    } else if (this.f25703Z != null) {
                        long a10 = T().a();
                        H.a("drainAndFeed");
                        while (G0(j10, j11) && P1(a10)) {
                        }
                        while (I0() && P1(a10)) {
                        }
                        H.b();
                    } else {
                        this.f25697V0.f23706d += o0(j10);
                        C1(1);
                    }
                    this.f25697V0.c();
                }
            } catch (IllegalStateException e10) {
                if (k1(e10)) {
                    p1(e10);
                    if (L.f22072a >= 21 && m1(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        E1();
                    }
                    l B02 = B0(e10, P0());
                    if (B02.f25653c == 1101) {
                        i10 = 4006;
                    } else {
                        i10 = 4003;
                    }
                    throw S(B02, this.f25671C, z10, i10);
                }
                throw e10;
            }
        } else {
            this.f25696U0 = null;
            throw hVar;
        }
    }

    /* access modifiers changed from: protected */
    public void h0() {
        try {
            C0();
            E1();
        } finally {
            O1((C2409m) null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean h1() {
        return this.f25676E0;
    }

    /* access modifiers changed from: protected */
    public final boolean i1(s sVar) {
        if (this.f25677F != null || !S1(sVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r5 >= r1) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k0(f2.s[] r13, long r14, long r16, t2.C2615C.b r18) {
        /*
            r12 = this;
            r0 = r12
            r2.t$f r1 = r0.f25698W0
            long r1 = r1.f25743c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            r2.t$f r1 = new r2.t$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            goto L_0x0065
        L_0x0020:
            java.util.ArrayDeque r1 = r0.f25667A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0055
            long r1 = r0.f25690O0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0038
            long r5 = r0.f25700X0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0055
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0055
        L_0x0038:
            r2.t$f r1 = new r2.t$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            r2.t$f r1 = r0.f25698W0
            long r1 = r1.f25743c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0065
            r12.w1()
            goto L_0x0065
        L_0x0055:
            java.util.ArrayDeque r1 = r0.f25667A
            r2.t$f r9 = new r2.t$f
            long r3 = r0.f25690O0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.t.k0(f2.s[], long, long, t2.C$b):void");
    }

    /* access modifiers changed from: protected */
    public final void n1() {
        s sVar;
        boolean z10;
        if (this.f25703Z == null && !this.f25676E0 && (sVar = this.f25671C) != null) {
            if (i1(sVar)) {
                e1(sVar);
                return;
            }
            K1(this.f25677F);
            if (this.f25675E == null || g1()) {
                try {
                    C2409m mVar = this.f25675E;
                    if (mVar == null || !mVar.f((String) C2076a.i(sVar.f20083n))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    o1(this.f25681H, z10);
                } catch (d e10) {
                    throw R(e10, sVar, 4001);
                }
            }
            MediaCrypto mediaCrypto = this.f25681H;
            if (mediaCrypto != null && this.f25703Z == null) {
                mediaCrypto.release();
                this.f25681H = null;
            }
        }
    }

    public void p(int i10, Object obj) {
        if (i10 == 11) {
            this.f25679G = (q0.a) obj;
        } else {
            super.p(i10, obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void p1(Exception exc);

    /* access modifiers changed from: protected */
    public abstract void q1(String str, j.a aVar, long j10, long j11);

    /* access modifiers changed from: protected */
    public abstract void r1(String str);

    /* access modifiers changed from: protected */
    public abstract l s0(m mVar, s sVar, s sVar2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (F0() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (F0() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0112 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m2.l s1(m2.w r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f25694S0 = r0
            f2.s r1 = r12.f23734b
            java.lang.Object r1 = i2.C2076a.e(r1)
            f2.s r1 = (f2.s) r1
            java.lang.String r2 = r1.f20083n
            if (r2 == 0) goto L_0x0113
            java.lang.String r3 = "video/av01"
            boolean r2 = java.util.Objects.equals(r2, r3)
            r3 = 0
            if (r2 == 0) goto L_0x002c
            java.util.List r2 = r1.f20086q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002c
            f2.s$b r1 = r1.a()
            f2.s$b r1 = r1.b0(r3)
            f2.s r1 = r1.K()
        L_0x002c:
            r7 = r1
            p2.m r12 = r12.f23733a
            r11.O1(r12)
            r11.f25671C = r7
            boolean r12 = r11.f25676E0
            if (r12 == 0) goto L_0x003b
            r11.f25680G0 = r0
            return r3
        L_0x003b:
            r2.j r12 = r11.f25703Z
            if (r12 != 0) goto L_0x0045
            r11.f25708j0 = r3
            r11.n1()
            return r3
        L_0x0045:
            r2.m r1 = r11.f25710l0
            java.lang.Object r1 = i2.C2076a.e(r1)
            r2.m r1 = (r2.m) r1
            f2.s r2 = r11.f25704f0
            java.lang.Object r2 = i2.C2076a.e(r2)
            r6 = r2
            f2.s r6 = (f2.s) r6
            p2.m r2 = r11.f25675E
            p2.m r3 = r11.f25677F
            boolean r2 = r11.H0(r1, r7, r2, r3)
            if (r2 == 0) goto L_0x006f
            r11.E0()
            m2.l r12 = new m2.l
            java.lang.String r5 = r1.f25654a
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            return r12
        L_0x006f:
            p2.m r2 = r11.f25677F
            p2.m r3 = r11.f25675E
            r4 = 0
            if (r2 == r3) goto L_0x0078
            r2 = r0
            goto L_0x0079
        L_0x0078:
            r2 = r4
        L_0x0079:
            if (r2 == 0) goto L_0x0084
            int r3 = i2.L.f22072a
            r5 = 23
            if (r3 < r5) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r3 = r4
            goto L_0x0085
        L_0x0084:
            r3 = r0
        L_0x0085:
            i2.C2076a.g(r3)
            m2.l r3 = r11.s0(r1, r6, r7)
            int r5 = r3.f23718d
            r8 = 3
            if (r5 == 0) goto L_0x00f8
            r9 = 16
            r10 = 2
            if (r5 == r0) goto L_0x00df
            if (r5 == r10) goto L_0x00b3
            if (r5 != r8) goto L_0x00ad
            boolean r0 = r11.V1(r7)
            if (r0 != 0) goto L_0x00a1
            goto L_0x00fc
        L_0x00a1:
            r11.f25704f0 = r7
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r11.F0()
            if (r0 != 0) goto L_0x00fb
        L_0x00ab:
            r9 = r10
            goto L_0x00fc
        L_0x00ad:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00b3:
            boolean r5 = r11.V1(r7)
            if (r5 != 0) goto L_0x00ba
            goto L_0x00fc
        L_0x00ba:
            r11.f25682H0 = r0
            r11.f25684I0 = r0
            int r5 = r11.f25711m0
            if (r5 == r10) goto L_0x00d2
            if (r5 != r0) goto L_0x00d1
            int r5 = r7.f20089t
            int r9 = r6.f20089t
            if (r5 != r9) goto L_0x00d1
            int r5 = r7.f20090u
            int r9 = r6.f20090u
            if (r5 != r9) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r0 = r4
        L_0x00d2:
            r11.f25723u0 = r0
            r11.f25704f0 = r7
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r11.F0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00df:
            boolean r0 = r11.V1(r7)
            if (r0 != 0) goto L_0x00e6
            goto L_0x00fc
        L_0x00e6:
            r11.f25704f0 = r7
            if (r2 == 0) goto L_0x00f1
            boolean r0 = r11.F0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00f1:
            boolean r0 = r11.D0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00f8:
            r11.E0()
        L_0x00fb:
            r9 = r4
        L_0x00fc:
            int r0 = r3.f23718d
            if (r0 == 0) goto L_0x0112
            r2.j r0 = r11.f25703Z
            if (r0 != r12) goto L_0x0108
            int r12 = r11.f25686K0
            if (r12 != r8) goto L_0x0112
        L_0x0108:
            m2.l r12 = new m2.l
            java.lang.String r5 = r1.f25654a
            r8 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            return r12
        L_0x0112:
            return r3
        L_0x0113:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r12.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.h r12 = r11.R(r12, r1, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.t.s1(m2.w):m2.l");
    }

    /* access modifiers changed from: protected */
    public abstract void t1(s sVar, MediaFormat mediaFormat);

    public void v(float f10, float f11) {
        this.f25699X = f10;
        this.f25701Y = f11;
        V1(this.f25704f0);
    }

    /* access modifiers changed from: protected */
    public void v1(long j10) {
        this.f25700X0 = j10;
        while (!this.f25667A.isEmpty() && j10 >= ((f) this.f25667A.peek()).f25741a) {
            L1((f) C2076a.e((f) this.f25667A.poll()));
            w1();
        }
    }

    public final int w() {
        return 8;
    }

    public static class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f25734a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25735b;

        /* renamed from: c  reason: collision with root package name */
        public final m f25736c;

        /* renamed from: d  reason: collision with root package name */
        public final String f25737d;

        /* renamed from: e  reason: collision with root package name */
        public final d f25738e;

        public d(s sVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + sVar, th2, sVar.f20083n, z10, (m) null, b(i10), (d) null);
        }

        private static String b(int i10) {
            String str;
            if (i10 < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "androidx.media3.exoplayer.mediacodec" + ".MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* access modifiers changed from: private */
        public d c(d dVar) {
            return new d(getMessage(), getCause(), this.f25734a, this.f25735b, this.f25736c, this.f25737d, dVar);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public d(s sVar, Throwable th2, boolean z10, m mVar) {
            this("Decoder init failed: " + mVar.f25654a + ", " + sVar, th2, sVar.f20083n, z10, mVar, L.f22072a >= 21 ? d(th2) : null, (d) null);
        }

        private d(String str, Throwable th2, String str2, boolean z10, m mVar, String str3, d dVar) {
            super(str, th2);
            this.f25734a = str2;
            this.f25735b = z10;
            this.f25736c = mVar;
            this.f25737d = str3;
            this.f25738e = dVar;
        }
    }

    /* access modifiers changed from: protected */
    public void F1() {
    }

    /* access modifiers changed from: protected */
    public void i0() {
    }

    /* access modifiers changed from: protected */
    public void j0() {
    }

    /* access modifiers changed from: protected */
    public void w1() {
    }

    /* access modifiers changed from: protected */
    public void u1(long j10) {
    }

    /* access modifiers changed from: protected */
    public void x1(l2.f fVar) {
    }

    /* access modifiers changed from: protected */
    public void y1(s sVar) {
    }
}
