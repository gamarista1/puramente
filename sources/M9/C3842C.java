package m9;

import C9.l;
import C9.n;
import C9.o;
import C9.q;
import C9.v;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.M;
import ja.u;
import ja.w;
import java.nio.ByteBuffer;
import java.util.List;
import k9.C3717q0;
import k9.C3718r0;
import k9.S0;
import k9.a1;
import k9.b1;
import m9.r;
import m9.s;
import n9.C3871g;
import n9.C3873i;

/* renamed from: m9.C  reason: case insensitive filesystem */
public class C3842C extends o implements u {

    /* renamed from: Z0  reason: collision with root package name */
    private final Context f46525Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public final r.a f46526a1;

    /* renamed from: b1  reason: collision with root package name */
    private final s f46527b1;

    /* renamed from: c1  reason: collision with root package name */
    private int f46528c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f46529d1;

    /* renamed from: e1  reason: collision with root package name */
    private C3717q0 f46530e1;

    /* renamed from: f1  reason: collision with root package name */
    private long f46531f1;

    /* renamed from: g1  reason: collision with root package name */
    private boolean f46532g1;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f46533h1;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f46534i1;

    /* renamed from: j1  reason: collision with root package name */
    private boolean f46535j1;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public a1.a f46536k1;

    /* renamed from: m9.C$b */
    private final class b implements s.c {
        private b() {
        }

        public void a(boolean z10) {
            C3842C.this.f46526a1.C(z10);
        }

        public void b(Exception exc) {
            ja.s.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C3842C.this.f46526a1.l(exc);
        }

        public void c(long j10) {
            C3842C.this.f46526a1.B(j10);
        }

        public void d() {
            if (C3842C.this.f46536k1 != null) {
                C3842C.this.f46536k1.a();
            }
        }

        public void e(int i10, long j10, long j11) {
            C3842C.this.f46526a1.D(i10, j10, j11);
        }

        public void f() {
            C3842C.this.D1();
        }

        public void g() {
            if (C3842C.this.f46536k1 != null) {
                C3842C.this.f46536k1.b();
            }
        }
    }

    public C3842C(Context context, l.b bVar, q qVar, boolean z10, Handler handler, r rVar, s sVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.f46525Z0 = context.getApplicationContext();
        this.f46527b1 = sVar;
        this.f46526a1 = new r.a(handler, rVar);
        sVar.v(new b());
    }

    private static List B1(q qVar, C3717q0 q0Var, boolean z10, s sVar) {
        n v10;
        String str = q0Var.f45770l;
        if (str == null) {
            return C4770v.E();
        }
        if (sVar.a(q0Var) && (v10 = v.v()) != null) {
            return C4770v.H(v10);
        }
        List a10 = qVar.a(str, z10, false);
        String m10 = v.m(q0Var);
        if (m10 == null) {
            return C4770v.z(a10);
        }
        return C4770v.t().j(a10).j(qVar.a(m10, z10, false)).k();
    }

    private void E1() {
        long j10 = this.f46527b1.j(b());
        if (j10 != Long.MIN_VALUE) {
            if (!this.f46533h1) {
                j10 = Math.max(this.f46531f1, j10);
            }
            this.f46531f1 = j10;
            this.f46533h1 = false;
        }
    }

    private static boolean x1(String str) {
        if (M.f44981a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(M.f44983c)) {
            String str2 = M.f44982b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean y1() {
        if (M.f44981a == 23) {
            String str = M.f44984d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int z1(n nVar, C3717q0 q0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f30166a) || (i10 = M.f44981a) >= 24 || (i10 == 23 && M.y0(this.f46525Z0))) {
            return q0Var.f45771m;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public List A0(q qVar, C3717q0 q0Var, boolean z10) {
        return v.u(B1(qVar, q0Var, z10, this.f46527b1), q0Var);
    }

    /* access modifiers changed from: protected */
    public int A1(n nVar, C3717q0 q0Var, C3717q0[] q0VarArr) {
        int z12 = z1(nVar, q0Var);
        if (q0VarArr.length == 1) {
            return z12;
        }
        for (C3717q0 q0Var2 : q0VarArr) {
            if (nVar.e(q0Var, q0Var2).f46963d != 0) {
                z12 = Math.max(z12, z1(nVar, q0Var2));
            }
        }
        return z12;
    }

    /* access modifiers changed from: protected */
    public l.a C0(n nVar, C3717q0 q0Var, MediaCrypto mediaCrypto, float f10) {
        C3717q0 q0Var2;
        this.f46528c1 = A1(nVar, q0Var, L());
        this.f46529d1 = x1(nVar.f30166a);
        MediaFormat C12 = C1(q0Var, nVar.f30168c, this.f46528c1, f10);
        if (!"audio/raw".equals(nVar.f30167b) || "audio/raw".equals(q0Var.f45770l)) {
            q0Var2 = null;
        } else {
            q0Var2 = q0Var;
        }
        this.f46530e1 = q0Var2;
        return l.a.a(nVar, C12, q0Var, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public MediaFormat C1(C3717q0 q0Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", q0Var.f45783y);
        mediaFormat.setInteger("sample-rate", q0Var.f45784z);
        ja.v.e(mediaFormat, q0Var.f45772n);
        ja.v.d(mediaFormat, "max-input-size", i10);
        int i11 = M.f44981a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !y1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(q0Var.f45770l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f46527b1.t(M.d0(4, q0Var.f45783y, q0Var.f45784z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void D1() {
        this.f46533h1 = true;
    }

    /* access modifiers changed from: protected */
    public void N() {
        this.f46534i1 = true;
        try {
            this.f46527b1.flush();
            try {
                super.N();
            } finally {
                this.f46526a1.o(this.f30207U0);
            }
        } catch (Throwable th2) {
            super.N();
            throw th2;
        } finally {
            this.f46526a1.o(this.f30207U0);
        }
    }

    /* access modifiers changed from: protected */
    public void O(boolean z10, boolean z11) {
        super.O(z10, z11);
        this.f46526a1.p(this.f30207U0);
        if (H().f45520a) {
            this.f46527b1.n();
        } else {
            this.f46527b1.g();
        }
        this.f46527b1.u(K());
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        super.P(j10, z10);
        if (this.f46535j1) {
            this.f46527b1.q();
        } else {
            this.f46527b1.flush();
        }
        this.f46531f1 = j10;
        this.f46532g1 = true;
        this.f46533h1 = true;
    }

    /* access modifiers changed from: protected */
    public void P0(Exception exc) {
        ja.s.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f46526a1.k(exc);
    }

    /* access modifiers changed from: protected */
    public void Q() {
        try {
            super.Q();
        } finally {
            if (this.f46534i1) {
                this.f46534i1 = false;
                this.f46527b1.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void Q0(String str, l.a aVar, long j10, long j11) {
        this.f46526a1.m(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void R() {
        super.R();
        this.f46527b1.l();
    }

    /* access modifiers changed from: protected */
    public void R0(String str) {
        this.f46526a1.n(str);
    }

    /* access modifiers changed from: protected */
    public void S() {
        E1();
        this.f46527b1.pause();
        super.S();
    }

    /* access modifiers changed from: protected */
    public C3873i S0(C3718r0 r0Var) {
        C3873i S02 = super.S0(r0Var);
        this.f46526a1.q(r0Var.f45824b, S02);
        return S02;
    }

    /* access modifiers changed from: protected */
    public void T0(C3717q0 q0Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        C3717q0 q0Var2 = this.f46530e1;
        int[] iArr = null;
        if (q0Var2 != null) {
            q0Var = q0Var2;
        } else if (v0() != null) {
            if ("audio/raw".equals(q0Var.f45770l)) {
                i10 = q0Var.f45753A;
            } else if (M.f44981a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = M.c0(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            C3717q0 E10 = new C3717q0.b().e0("audio/raw").Y(i10).N(q0Var.f45754B).O(q0Var.f45755C).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.f46529d1 && E10.f45783y == 6 && (i11 = q0Var.f45783y) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < q0Var.f45783y; i12++) {
                    iArr[i12] = i12;
                }
            }
            q0Var = E10;
        }
        try {
            this.f46527b1.s(q0Var, 0, iArr);
        } catch (s.a e10) {
            throw F(e10, e10.f46684a, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public void V0() {
        super.V0();
        this.f46527b1.k();
    }

    /* access modifiers changed from: protected */
    public void W0(C3871g gVar) {
        if (this.f46532g1 && !gVar.o()) {
            if (Math.abs(gVar.f46952e - this.f46531f1) > 500000) {
                this.f46531f1 = gVar.f46952e;
            }
            this.f46532g1 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean Y0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C3717q0 q0Var) {
        C3645a.e(byteBuffer);
        if (this.f46530e1 != null && (i11 & 2) != 0) {
            ((l) C3645a.e(lVar)).l(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.l(i10, false);
            }
            this.f30207U0.f46942f += i12;
            this.f46527b1.k();
            return true;
        } else {
            try {
                if (!this.f46527b1.h(byteBuffer, j12, i12)) {
                    return false;
                }
                if (lVar != null) {
                    lVar.l(i10, false);
                }
                this.f30207U0.f46941e += i12;
                return true;
            } catch (s.b e10) {
                throw G(e10, e10.f46687c, e10.f46686b, 5001);
            } catch (s.e e11) {
                throw G(e11, q0Var, e11.f46691b, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public C3873i Z(n nVar, C3717q0 q0Var, C3717q0 q0Var2) {
        int i10;
        C3873i e10 = nVar.e(q0Var, q0Var2);
        int i11 = e10.f46964e;
        if (z1(nVar, q0Var2) > this.f46528c1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = nVar.f30166a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = e10.f46963d;
        }
        return new C3873i(str, q0Var, q0Var2, i10, i12);
    }

    public boolean b() {
        if (!super.b() || !this.f46527b1.b()) {
            return false;
        }
        return true;
    }

    public S0 c() {
        return this.f46527b1.c();
    }

    public boolean d() {
        if (this.f46527b1.d() || super.d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void d1() {
        try {
            this.f46527b1.i();
        } catch (s.e e10) {
            throw G(e10, e10.f46692c, e10.f46691b, 5002);
        }
    }

    public void f(S0 s02) {
        this.f46527b1.f(s02);
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public void p(int i10, Object obj) {
        if (i10 == 2) {
            this.f46527b1.m(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.f46527b1.p((C3847e) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.f46527b1.o(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f46527b1.e(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f46536k1 = (a1.a) obj;
                    return;
                default:
                    super.p(i10, obj);
                    return;
            }
        } else {
            this.f46527b1.r((v) obj);
        }
    }

    /* access modifiers changed from: protected */
    public boolean p1(C3717q0 q0Var) {
        return this.f46527b1.a(q0Var);
    }

    /* access modifiers changed from: protected */
    public int q1(q qVar, C3717q0 q0Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12 = 0;
        if (!w.o(q0Var.f45770l)) {
            return b1.o(0);
        }
        if (M.f44981a >= 21) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        boolean z12 = true;
        if (q0Var.f45757E != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean r12 = o.r1(q0Var);
        int i13 = 8;
        int i14 = 4;
        if (r12 && this.f46527b1.a(q0Var) && (!z10 || v.v() != null)) {
            return b1.C(4, 8, i10);
        }
        if ("audio/raw".equals(q0Var.f45770l) && !this.f46527b1.a(q0Var)) {
            return b1.o(1);
        }
        if (!this.f46527b1.a(M.d0(2, q0Var.f45783y, q0Var.f45784z))) {
            return b1.o(1);
        }
        List B12 = B1(qVar, q0Var, false, this.f46527b1);
        if (B12.isEmpty()) {
            return b1.o(1);
        }
        if (!r12) {
            return b1.o(2);
        }
        n nVar = (n) B12.get(0);
        boolean m10 = nVar.m(q0Var);
        if (!m10) {
            int i15 = 1;
            while (true) {
                if (i15 >= B12.size()) {
                    break;
                }
                n nVar2 = (n) B12.get(i15);
                if (nVar2.m(q0Var)) {
                    z11 = false;
                    nVar = nVar2;
                    break;
                }
                i15++;
            }
        }
        z11 = true;
        z12 = m10;
        if (!z12) {
            i14 = 3;
        }
        if (z12 && nVar.p(q0Var)) {
            i13 = 16;
        }
        if (nVar.f30173h) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = 128;
        }
        return b1.l(i14, i13, i10, i11, i12);
    }

    public long u() {
        if (getState() == 2) {
            E1();
        }
        return this.f46531f1;
    }

    /* access modifiers changed from: protected */
    public float y0(float f10, C3717q0 q0Var, C3717q0[] q0VarArr) {
        int i10 = -1;
        for (C3717q0 q0Var2 : q0VarArr) {
            int i11 = q0Var2.f45784z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    public u A() {
        return this;
    }
}
