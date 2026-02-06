package o2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import com.adjust.sdk.Constants;
import com.google.common.collect.C4770v;
import f2.C1960A;
import f2.C1963D;
import f2.C1968c;
import f2.C1971f;
import f2.s;
import i2.C2076a;
import i2.L;
import i2.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import l2.f;
import m2.l;
import m2.y;
import o2.C2377x;
import o2.C2378y;
import r2.C2559F;
import r2.j;
import r2.m;
import r2.t;
import r2.w;
import z2.S;

public class W extends t implements y {

    /* renamed from: a1  reason: collision with root package name */
    private final Context f24944a1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public final C2377x.a f24945b1;

    /* renamed from: c1  reason: collision with root package name */
    private final C2378y f24946c1;

    /* renamed from: d1  reason: collision with root package name */
    private int f24947d1;

    /* renamed from: e1  reason: collision with root package name */
    private boolean f24948e1;

    /* renamed from: f1  reason: collision with root package name */
    private boolean f24949f1;

    /* renamed from: g1  reason: collision with root package name */
    private s f24950g1;

    /* renamed from: h1  reason: collision with root package name */
    private s f24951h1;

    /* renamed from: i1  reason: collision with root package name */
    private long f24952i1;

    /* renamed from: j1  reason: collision with root package name */
    private boolean f24953j1;

    /* renamed from: k1  reason: collision with root package name */
    private boolean f24954k1;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public boolean f24955l1;

    /* renamed from: m1  reason: collision with root package name */
    private int f24956m1 = -1000;

    /* renamed from: n1  reason: collision with root package name */
    private boolean f24957n1;

    /* renamed from: o1  reason: collision with root package name */
    private long f24958o1;

    private static final class b {
        public static void a(C2378y yVar, Object obj) {
            yVar.p((AudioDeviceInfo) obj);
        }
    }

    private final class c implements C2378y.d {
        private c() {
        }

        public void a(boolean z10) {
            W.this.f24945b1.I(z10);
        }

        public void b(Exception exc) {
            p.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            W.this.f24945b1.n(exc);
        }

        public void c(long j10) {
            W.this.f24945b1.H(j10);
        }

        public void d() {
            q0.a b22 = W.this.a1();
            if (b22 != null) {
                b22.a();
            }
        }

        public void e(int i10, long j10, long j11) {
            W.this.f24945b1.J(i10, j10, j11);
        }

        public void f() {
            W.this.l2();
        }

        public void g() {
            q0.a a22 = W.this.a1();
            if (a22 != null) {
                a22.b();
            }
        }

        public void h() {
            boolean unused = W.this.f24955l1 = true;
        }

        public void i() {
            W.this.g0();
        }

        public void o(C2378y.a aVar) {
            W.this.f24945b1.p(aVar);
        }

        public void q(C2378y.a aVar) {
            W.this.f24945b1.o(aVar);
        }
    }

    public W(Context context, j.b bVar, w wVar, boolean z10, Handler handler, C2377x xVar, C2378y yVar) {
        super(1, bVar, wVar, z10, 44100.0f);
        this.f24944a1 = context.getApplicationContext();
        this.f24946c1 = yVar;
        this.f24945b1 = new C2377x.a(handler, xVar);
        this.f24958o1 = -9223372036854775807L;
        yVar.z(new c());
    }

    private static boolean d2(String str) {
        if (L.f22072a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(L.f22074c)) {
            String str2 = L.f22073b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean e2(String str) {
        if (str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder")) {
            return true;
        }
        return false;
    }

    private static boolean f2() {
        if (L.f22072a == 23) {
            String str = L.f22075d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int g2(s sVar) {
        int i10;
        C2365k A10 = this.f24946c1.A(sVar);
        if (!A10.f25013a) {
            return 0;
        }
        if (A10.f25014b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (A10.f25015c) {
            return i10 | 2048;
        }
        return i10;
    }

    private int h2(m mVar, s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(mVar.f25654a) || (i10 = L.f22072a) >= 24 || (i10 == 23 && L.G0(this.f24944a1))) {
            return sVar.f20084o;
        }
        return -1;
    }

    private static List j2(w wVar, s sVar, boolean z10, C2378y yVar) {
        m x10;
        if (sVar.f20083n == null) {
            return C4770v.E();
        }
        if (!yVar.a(sVar) || (x10 = C2559F.x()) == null) {
            return C2559F.v(wVar, sVar, z10, false);
        }
        return C4770v.H(x10);
    }

    private void m2() {
        j N02 = N0();
        if (N02 != null && L.f22072a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f24956m1));
            N02.b(bundle);
        }
    }

    private void n2() {
        long j10 = this.f24946c1.j(b());
        if (j10 != Long.MIN_VALUE) {
            if (!this.f24953j1) {
                j10 = Math.max(this.f24952i1, j10);
            }
            this.f24952i1 = j10;
            this.f24953j1 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean A1(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar) {
        int i13;
        int i14;
        C2076a.e(byteBuffer);
        this.f24958o1 = -9223372036854775807L;
        if (this.f24951h1 != null && (i11 & 2) != 0) {
            ((j) C2076a.e(jVar)).l(i10, false);
            return true;
        } else if (z10) {
            if (jVar != null) {
                jVar.l(i10, false);
            }
            this.f25697V0.f23708f += i12;
            this.f24946c1.k();
            return true;
        } else {
            try {
                if (this.f24946c1.h(byteBuffer, j12, i12)) {
                    if (jVar != null) {
                        jVar.l(i10, false);
                    }
                    this.f25697V0.f23707e += i12;
                    return true;
                }
                this.f24958o1 = j12;
                return false;
            } catch (C2378y.c e10) {
                s sVar2 = this.f24950g1;
                boolean z12 = e10.f25058b;
                if (!h1() || U().f23736a == 0) {
                    i13 = 5001;
                } else {
                    i13 = 5004;
                }
                throw S(e10, sVar2, z12, i13);
            } catch (C2378y.f e11) {
                boolean z13 = e11.f25063b;
                if (!h1() || U().f23736a == 0) {
                    i14 = 5002;
                } else {
                    i14 = 5003;
                }
                throw S(e11, sVar, z13, i14);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void F1() {
        int i10;
        try {
            this.f24946c1.i();
            if (V0() != -9223372036854775807L) {
                this.f24958o1 = V0();
            }
        } catch (C2378y.f e10) {
            s sVar = e10.f25064c;
            boolean z10 = e10.f25063b;
            if (h1()) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw S(e10, sVar, z10, i10);
        }
    }

    public boolean H() {
        boolean z10 = this.f24955l1;
        this.f24955l1 = false;
        return z10;
    }

    /* access modifiers changed from: protected */
    public float R0(float f10, s sVar, s[] sVarArr) {
        int i10 = -1;
        for (s sVar2 : sVarArr) {
            int i11 = sVar2.f20060C;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    /* access modifiers changed from: protected */
    public boolean S1(s sVar) {
        if (U().f23736a != 0) {
            int g22 = g2(sVar);
            if ((g22 & 512) != 0) {
                if (U().f23736a == 2 || (g22 & 1024) != 0) {
                    return true;
                }
                if (sVar.f20062E == 0 && sVar.f20063F == 0) {
                    return true;
                }
            }
        }
        return this.f24946c1.a(sVar);
    }

    /* access modifiers changed from: protected */
    public List T0(w wVar, s sVar, boolean z10) {
        return C2559F.w(j2(wVar, sVar, z10, this.f24946c1), sVar);
    }

    /* access modifiers changed from: protected */
    public int T1(w wVar, s sVar) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (!C1960A.l(sVar.f20083n)) {
            return r0.o(0);
        }
        if (L.f22072a >= 21) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        boolean z12 = true;
        if (sVar.f20068K != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean U12 = t.U1(sVar);
        if (!U12 || (z10 && C2559F.x() == null)) {
            i11 = 0;
        } else {
            int g22 = g2(sVar);
            if (this.f24946c1.a(sVar)) {
                return r0.F(4, 8, i10, g22);
            }
            i11 = g22;
        }
        if ("audio/raw".equals(sVar.f20083n) && !this.f24946c1.a(sVar)) {
            return r0.o(1);
        }
        if (!this.f24946c1.a(L.e0(2, sVar.f20059B, sVar.f20060C))) {
            return r0.o(1);
        }
        List j22 = j2(wVar, sVar, false, this.f24946c1);
        if (j22.isEmpty()) {
            return r0.o(1);
        }
        if (!U12) {
            return r0.o(2);
        }
        m mVar = (m) j22.get(0);
        boolean m10 = mVar.m(sVar);
        if (!m10) {
            int i16 = 1;
            while (true) {
                if (i16 >= j22.size()) {
                    break;
                }
                m mVar2 = (m) j22.get(i16);
                if (mVar2.m(sVar)) {
                    z11 = false;
                    mVar = mVar2;
                    break;
                }
                i16++;
            }
        }
        z11 = true;
        z12 = m10;
        if (z12) {
            i12 = 4;
        } else {
            i12 = 3;
        }
        if (!z12 || !mVar.p(sVar)) {
            i13 = 8;
        } else {
            i13 = 16;
        }
        if (mVar.f25661h) {
            i14 = 64;
        } else {
            i14 = 0;
        }
        if (z11) {
            i15 = 128;
        }
        return r0.L(i12, i13, i10, i14, i15, i11);
    }

    public long U0(boolean z10, long j10, long j11) {
        float f10;
        long j12 = this.f24958o1;
        if (j12 == -9223372036854775807L) {
            return super.U0(z10, j10, j11);
        }
        float f11 = (float) (j12 - j10);
        if (c() != null) {
            f10 = c().f19709a;
        } else {
            f10 = 1.0f;
        }
        long j13 = (long) ((f11 / f10) / 2.0f);
        if (this.f24957n1) {
            j13 -= L.L0(T().a()) - j11;
        }
        return Math.max(10000, j13);
    }

    /* access modifiers changed from: protected */
    public j.a W0(m mVar, s sVar, MediaCrypto mediaCrypto, float f10) {
        s sVar2;
        this.f24947d1 = i2(mVar, sVar, Z());
        this.f24948e1 = d2(mVar.f25654a);
        this.f24949f1 = e2(mVar.f25654a);
        MediaFormat k22 = k2(sVar, mVar.f25656c, this.f24947d1, f10);
        if (!"audio/raw".equals(mVar.f25655b) || "audio/raw".equals(sVar.f20083n)) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        this.f24951h1 = sVar2;
        return j.a.a(mVar, k22, sVar, mediaCrypto);
    }

    public boolean b() {
        if (!super.b() || !this.f24946c1.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f24954k1 = true;
        this.f24950g1 = null;
        try {
            this.f24946c1.flush();
            try {
                super.b0();
            } finally {
                this.f24945b1.s(this.f25697V0);
            }
        } catch (Throwable th2) {
            super.b0();
            throw th2;
        } finally {
            this.f24945b1.s(this.f25697V0);
        }
    }

    /* access modifiers changed from: protected */
    public void b1(f fVar) {
        s sVar;
        if (L.f22072a >= 29 && (sVar = fVar.f23518b) != null && Objects.equals(sVar.f20083n, "audio/opus") && h1()) {
            ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(fVar.f23523g);
            int i10 = ((s) C2076a.e(fVar.f23518b)).f20062E;
            if (byteBuffer.remaining() == 8) {
                this.f24946c1.v(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    public C1963D c() {
        return this.f24946c1.c();
    }

    /* access modifiers changed from: protected */
    public void c0(boolean z10, boolean z11) {
        super.c0(z10, z11);
        this.f24945b1.t(this.f25697V0);
        if (U().f23737b) {
            this.f24946c1.n();
        } else {
            this.f24946c1.g();
        }
        this.f24946c1.t(Y());
        this.f24946c1.r(T());
    }

    public boolean d() {
        if (this.f24946c1.d() || super.d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        super.e0(j10, z10);
        this.f24946c1.flush();
        this.f24952i1 = j10;
        this.f24955l1 = false;
        this.f24953j1 = true;
    }

    public void f(C1963D d10) {
        this.f24946c1.f(d10);
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f24946c1.release();
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    /* access modifiers changed from: protected */
    public void h0() {
        this.f24955l1 = false;
        try {
            super.h0();
        } finally {
            if (this.f24954k1) {
                this.f24954k1 = false;
                this.f24946c1.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i0() {
        super.i0();
        this.f24946c1.l();
        this.f24957n1 = true;
    }

    /* access modifiers changed from: protected */
    public int i2(m mVar, s sVar, s[] sVarArr) {
        int h22 = h2(mVar, sVar);
        if (sVarArr.length == 1) {
            return h22;
        }
        for (s sVar2 : sVarArr) {
            if (mVar.e(sVar, sVar2).f23718d != 0) {
                h22 = Math.max(h22, h2(mVar, sVar2));
            }
        }
        return h22;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        n2();
        this.f24957n1 = false;
        this.f24946c1.pause();
        super.j0();
    }

    /* access modifiers changed from: protected */
    public MediaFormat k2(s sVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", sVar.f20059B);
        mediaFormat.setInteger("sample-rate", sVar.f20060C);
        i2.s.e(mediaFormat, sVar.f20086q);
        i2.s.d(mediaFormat, "max-input-size", i10);
        int i11 = L.f22072a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !f2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(sVar.f20083n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f24946c1.u(L.e0(4, sVar.f20059B, sVar.f20060C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f24956m1));
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void l2() {
        this.f24953j1 = true;
    }

    public void p(int i10, Object obj) {
        if (i10 == 2) {
            this.f24946c1.m(((Float) C2076a.e(obj)).floatValue());
        } else if (i10 == 3) {
            this.f24946c1.x((C1968c) C2076a.e((C1968c) obj));
        } else if (i10 == 6) {
            this.f24946c1.s((C1971f) C2076a.e((C1971f) obj));
        } else if (i10 != 12) {
            if (i10 == 16) {
                this.f24956m1 = ((Integer) C2076a.e(obj)).intValue();
                m2();
            } else if (i10 == 9) {
                this.f24946c1.o(((Boolean) C2076a.e(obj)).booleanValue());
            } else if (i10 != 10) {
                super.p(i10, obj);
            } else {
                this.f24946c1.e(((Integer) C2076a.e(obj)).intValue());
            }
        } else if (L.f22072a >= 23) {
            b.a(this.f24946c1, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void p1(Exception exc) {
        p.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f24945b1.m(exc);
    }

    /* access modifiers changed from: protected */
    public void q1(String str, j.a aVar, long j10, long j11) {
        this.f24945b1.q(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void r1(String str) {
        this.f24945b1.r(str);
    }

    /* access modifiers changed from: protected */
    public l s0(m mVar, s sVar, s sVar2) {
        int i10;
        l e10 = mVar.e(sVar, sVar2);
        int i11 = e10.f23719e;
        if (i1(sVar2)) {
            i11 |= 32768;
        }
        if (h2(mVar, sVar2) > this.f24947d1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = mVar.f25654a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f23718d;
        }
        return new l(str, sVar, sVar2, i10, i12);
    }

    /* access modifiers changed from: protected */
    public l s1(m2.w wVar) {
        s sVar = (s) C2076a.e(wVar.f23734b);
        this.f24950g1 = sVar;
        l s12 = super.s1(wVar);
        this.f24945b1.u(sVar, s12);
        return s12;
    }

    /* access modifiers changed from: protected */
    public void t1(s sVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        s sVar2 = this.f24951h1;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (N0() != null) {
            C2076a.e(mediaFormat);
            if ("audio/raw".equals(sVar.f20083n)) {
                i10 = sVar.f20061D;
            } else if (L.f22072a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = L.d0(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            s K10 = new s.b().o0("audio/raw").i0(i10).V(sVar.f20062E).W(sVar.f20063F).h0(sVar.f20080k).T(sVar.f20081l).a0(sVar.f20070a).c0(sVar.f20071b).d0(sVar.f20072c).e0(sVar.f20073d).q0(sVar.f20074e).m0(sVar.f20075f).N(mediaFormat.getInteger("channel-count")).p0(mediaFormat.getInteger("sample-rate")).K();
            if (this.f24948e1 && K10.f20059B == 6 && (i11 = sVar.f20059B) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < sVar.f20059B; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f24949f1) {
                iArr = S.a(K10.f20059B);
            }
            sVar = K10;
        }
        try {
            if (L.f22072a >= 29) {
                if (!h1() || U().f23736a == 0) {
                    this.f24946c1.q(0);
                } else {
                    this.f24946c1.q(U().f23736a);
                }
            }
            this.f24946c1.y(sVar, 0, iArr);
        } catch (C2378y.b e10) {
            throw R(e10, e10.f25056a, 5001);
        }
    }

    public long u() {
        if (getState() == 2) {
            n2();
        }
        return this.f24952i1;
    }

    /* access modifiers changed from: protected */
    public void u1(long j10) {
        this.f24946c1.w(j10);
    }

    /* access modifiers changed from: protected */
    public void w1() {
        super.w1();
        this.f24946c1.k();
    }

    public y A() {
        return this;
    }
}
