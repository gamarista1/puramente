package u2;

import W2.b;
import W2.e;
import W2.l;
import W2.m;
import W2.p;
import W2.q;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.C1806d;
import androidx.media3.exoplayer.r0;
import com.google.common.collect.C4770v;
import f2.C1960A;
import f2.s;
import h2.C2031b;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;
import java.util.Objects;
import l2.f;
import m2.w;
import t2.C2615C;

/* renamed from: u2.i  reason: case insensitive filesystem */
public final class C2705i extends C1806d implements Handler.Callback {

    /* renamed from: A  reason: collision with root package name */
    private q f26561A;

    /* renamed from: B  reason: collision with root package name */
    private int f26562B;

    /* renamed from: C  reason: collision with root package name */
    private final Handler f26563C;

    /* renamed from: D  reason: collision with root package name */
    private final C2704h f26564D;

    /* renamed from: E  reason: collision with root package name */
    private final w f26565E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f26566F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f26567G;

    /* renamed from: H  reason: collision with root package name */
    private s f26568H;

    /* renamed from: I  reason: collision with root package name */
    private long f26569I;

    /* renamed from: X  reason: collision with root package name */
    private long f26570X;

    /* renamed from: Y  reason: collision with root package name */
    private long f26571Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f26572Z;

    /* renamed from: r  reason: collision with root package name */
    private final b f26573r;

    /* renamed from: s  reason: collision with root package name */
    private final f f26574s;

    /* renamed from: t  reason: collision with root package name */
    private C2697a f26575t;

    /* renamed from: u  reason: collision with root package name */
    private final C2703g f26576u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f26577v;

    /* renamed from: w  reason: collision with root package name */
    private int f26578w;

    /* renamed from: x  reason: collision with root package name */
    private l f26579x;

    /* renamed from: y  reason: collision with root package name */
    private p f26580y;

    /* renamed from: z  reason: collision with root package name */
    private q f26581z;

    public C2705i(C2704h hVar, Looper looper) {
        this(hVar, looper, C2703g.f26559a);
    }

    private void A0() {
        z0();
        ((l) C2076a.e(this.f26579x)).release();
        this.f26579x = null;
        this.f26578w = 0;
    }

    private void B0(long j10) {
        boolean y02 = y0(j10);
        long c10 = this.f26575t.c(this.f26570X);
        int i10 = (c10 > Long.MIN_VALUE ? 1 : (c10 == Long.MIN_VALUE ? 0 : -1));
        if (i10 == 0 && this.f26566F && !y02) {
            this.f26567G = true;
        }
        if (i10 != 0 && c10 <= j10) {
            y02 = true;
        }
        if (y02) {
            C4770v a10 = this.f26575t.a(j10);
            long b10 = this.f26575t.b(j10);
            F0(new C2031b(a10, t0(b10)));
            this.f26575t.e(b10);
        }
        this.f26570X = j10;
    }

    private void C0(long j10) {
        boolean z10;
        this.f26570X = j10;
        if (this.f26561A == null) {
            ((l) C2076a.e(this.f26579x)).b(j10);
            try {
                this.f26561A = (q) ((l) C2076a.e(this.f26579x)).a();
            } catch (m e10) {
                u0(e10);
                return;
            }
        }
        if (getState() == 2) {
            if (this.f26581z != null) {
                long s02 = s0();
                z10 = false;
                while (s02 <= j10) {
                    this.f26562B++;
                    s02 = s0();
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            q qVar = this.f26561A;
            if (qVar != null) {
                if (qVar.m()) {
                    if (!z10 && s0() == Long.MAX_VALUE) {
                        if (this.f26578w == 2) {
                            D0();
                        } else {
                            z0();
                            this.f26567G = true;
                        }
                    }
                } else if (qVar.f23528b <= j10) {
                    q qVar2 = this.f26581z;
                    if (qVar2 != null) {
                        qVar2.t();
                    }
                    this.f26562B = qVar.a(j10);
                    this.f26581z = qVar;
                    this.f26561A = null;
                    z10 = true;
                }
            }
            if (z10) {
                C2076a.e(this.f26581z);
                F0(new C2031b(this.f26581z.b(j10), t0(r0(j10))));
            }
            if (this.f26578w != 2) {
                while (!this.f26566F) {
                    try {
                        p pVar = this.f26580y;
                        if (pVar == null) {
                            pVar = (p) ((l) C2076a.e(this.f26579x)).d();
                            if (pVar != null) {
                                this.f26580y = pVar;
                            } else {
                                return;
                            }
                        }
                        if (this.f26578w == 1) {
                            pVar.s(4);
                            ((l) C2076a.e(this.f26579x)).c(pVar);
                            this.f26580y = null;
                            this.f26578w = 2;
                            return;
                        }
                        int m02 = m0(this.f26565E, pVar, 0);
                        if (m02 == -4) {
                            if (pVar.m()) {
                                this.f26566F = true;
                                this.f26577v = false;
                            } else {
                                s sVar = this.f26565E.f23734b;
                                if (sVar != null) {
                                    pVar.f8660j = sVar.f20088s;
                                    pVar.x();
                                    this.f26577v &= !pVar.p();
                                } else {
                                    return;
                                }
                            }
                            if (!this.f26577v) {
                                ((l) C2076a.e(this.f26579x)).c(pVar);
                                this.f26580y = null;
                            }
                        } else if (m02 == -3) {
                            return;
                        }
                    } catch (m e11) {
                        u0(e11);
                        return;
                    }
                }
            }
        }
    }

    private void D0() {
        A0();
        v0();
    }

    private void F0(C2031b bVar) {
        Handler handler = this.f26563C;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            w0(bVar);
        }
    }

    private void p0() {
        boolean z10;
        if (this.f26572Z || Objects.equals(this.f26568H.f20083n, "application/cea-608") || Objects.equals(this.f26568H.f20083n, "application/x-mp4-cea-608") || Objects.equals(this.f26568H.f20083n, "application/cea-708")) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.h(z10, "Legacy decoding is disabled, can't handle " + this.f26568H.f20083n + " samples (expected " + "application/x-media3-cues" + ").");
    }

    private void q0() {
        F0(new C2031b(C4770v.E(), t0(this.f26570X)));
    }

    private long r0(long j10) {
        int a10 = this.f26581z.a(j10);
        if (a10 == 0 || this.f26581z.e() == 0) {
            return this.f26581z.f23528b;
        }
        if (a10 != -1) {
            return this.f26581z.c(a10 - 1);
        }
        q qVar = this.f26581z;
        return qVar.c(qVar.e() - 1);
    }

    private long s0() {
        if (this.f26562B == -1) {
            return Long.MAX_VALUE;
        }
        C2076a.e(this.f26581z);
        if (this.f26562B >= this.f26581z.e()) {
            return Long.MAX_VALUE;
        }
        return this.f26581z.c(this.f26562B);
    }

    private long t0(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f26569I != -9223372036854775807L) {
            z11 = true;
        }
        C2076a.g(z11);
        return j10 - this.f26569I;
    }

    private void u0(m mVar) {
        i2.p.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f26568H, mVar);
        q0();
        D0();
    }

    private void v0() {
        this.f26577v = true;
        l b10 = this.f26576u.b((s) C2076a.e(this.f26568H));
        this.f26579x = b10;
        b10.f(X());
    }

    private void w0(C2031b bVar) {
        this.f26564D.g(bVar.f21227a);
        this.f26564D.K(bVar);
    }

    private static boolean x0(s sVar) {
        return Objects.equals(sVar.f20083n, "application/x-media3-cues");
    }

    private boolean y0(long j10) {
        if (this.f26566F || m0(this.f26565E, this.f26574s, 0) != -4) {
            return false;
        }
        if (this.f26574s.m()) {
            this.f26566F = true;
            return false;
        }
        this.f26574s.x();
        ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(this.f26574s.f23520d);
        e a10 = this.f26573r.a(this.f26574s.f23522f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f26574s.i();
        return this.f26575t.d(a10, j10);
    }

    private void z0() {
        this.f26580y = null;
        this.f26562B = -1;
        q qVar = this.f26581z;
        if (qVar != null) {
            qVar.t();
            this.f26581z = null;
        }
        q qVar2 = this.f26561A;
        if (qVar2 != null) {
            qVar2.t();
            this.f26561A = null;
        }
    }

    public void E0(long j10) {
        C2076a.g(r());
        this.f26571Y = j10;
    }

    public int a(s sVar) {
        int i10;
        if (x0(sVar) || this.f26576u.a(sVar)) {
            if (sVar.f20068K == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return r0.o(i10);
        } else if (C1960A.n(sVar.f20083n)) {
            return r0.o(1);
        } else {
            return r0.o(0);
        }
    }

    public boolean b() {
        return this.f26567G;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f26568H = null;
        this.f26571Y = -9223372036854775807L;
        q0();
        this.f26569I = -9223372036854775807L;
        this.f26570X = -9223372036854775807L;
        if (this.f26579x != null) {
            A0();
        }
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        this.f26570X = j10;
        C2697a aVar = this.f26575t;
        if (aVar != null) {
            aVar.clear();
        }
        q0();
        this.f26566F = false;
        this.f26567G = false;
        this.f26571Y = -9223372036854775807L;
        s sVar = this.f26568H;
        if (sVar != null && !x0(sVar)) {
            if (this.f26578w != 0) {
                D0();
                return;
            }
            z0();
            l lVar = (l) C2076a.e(this.f26579x);
            lVar.flush();
            lVar.f(X());
        }
    }

    public void g(long j10, long j11) {
        if (r()) {
            long j12 = this.f26571Y;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                z0();
                this.f26567G = true;
            }
        }
        if (!this.f26567G) {
            if (x0((s) C2076a.e(this.f26568H))) {
                C2076a.e(this.f26575t);
                B0(j10);
                return;
            }
            p0();
            C0(j10);
        }
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            w0((C2031b) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void k0(s[] sVarArr, long j10, long j11, C2615C.b bVar) {
        C2697a aVar;
        this.f26569I = j11;
        s sVar = sVarArr[0];
        this.f26568H = sVar;
        if (!x0(sVar)) {
            p0();
            if (this.f26579x != null) {
                this.f26578w = 1;
            } else {
                v0();
            }
        } else {
            if (this.f26568H.f20065H == 1) {
                aVar = new C2701e();
            } else {
                aVar = new C2702f();
            }
            this.f26575t = aVar;
        }
    }

    public C2705i(C2704h hVar, Looper looper, C2703g gVar) {
        super(3);
        Handler handler;
        this.f26564D = (C2704h) C2076a.e(hVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = L.y(looper, this);
        }
        this.f26563C = handler;
        this.f26576u = gVar;
        this.f26573r = new b();
        this.f26574s = new f(1);
        this.f26565E = new w();
        this.f26571Y = -9223372036854775807L;
        this.f26569I = -9223372036854775807L;
        this.f26570X = -9223372036854775807L;
        this.f26572Z = false;
    }
}
