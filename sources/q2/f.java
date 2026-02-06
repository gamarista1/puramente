package q2;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.C1806d;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.r0;
import f2.s;
import i2.C2076a;
import i2.H;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import m2.w;
import q2.c;

public class f extends C1806d {

    /* renamed from: A  reason: collision with root package name */
    private int f25350A = 1;

    /* renamed from: B  reason: collision with root package name */
    private s f25351B;

    /* renamed from: C  reason: collision with root package name */
    private c f25352C;

    /* renamed from: D  reason: collision with root package name */
    private l2.f f25353D;

    /* renamed from: E  reason: collision with root package name */
    private ImageOutput f25354E;

    /* renamed from: F  reason: collision with root package name */
    private Bitmap f25355F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f25356G;

    /* renamed from: H  reason: collision with root package name */
    private b f25357H;

    /* renamed from: I  reason: collision with root package name */
    private b f25358I;

    /* renamed from: X  reason: collision with root package name */
    private int f25359X;

    /* renamed from: r  reason: collision with root package name */
    private final c.a f25360r;

    /* renamed from: s  reason: collision with root package name */
    private final l2.f f25361s = l2.f.z();

    /* renamed from: t  reason: collision with root package name */
    private final ArrayDeque f25362t = new ArrayDeque();

    /* renamed from: u  reason: collision with root package name */
    private boolean f25363u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f25364v;

    /* renamed from: w  reason: collision with root package name */
    private a f25365w = a.f25369c;

    /* renamed from: x  reason: collision with root package name */
    private long f25366x = -9223372036854775807L;

    /* renamed from: y  reason: collision with root package name */
    private long f25367y = -9223372036854775807L;

    /* renamed from: z  reason: collision with root package name */
    private int f25368z = 0;

    private static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f25369c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f25370a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25371b;

        public a(long j10, long j11) {
            this.f25370a = j10;
            this.f25371b = j11;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f25372a;

        /* renamed from: b  reason: collision with root package name */
        private final long f25373b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap f25374c;

        public b(int i10, long j10) {
            this.f25372a = i10;
            this.f25373b = j10;
        }

        public long a() {
            return this.f25373b;
        }

        public Bitmap b() {
            return this.f25374c;
        }

        public int c() {
            return this.f25372a;
        }

        public boolean d() {
            if (this.f25374c != null) {
                return true;
            }
            return false;
        }

        public void e(Bitmap bitmap) {
            this.f25374c = bitmap;
        }
    }

    public f(c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f25360r = aVar;
        this.f25354E = t0(imageOutput);
    }

    private void A0() {
        this.f25353D = null;
        this.f25368z = 0;
        this.f25367y = -9223372036854775807L;
        c cVar = this.f25352C;
        if (cVar != null) {
            cVar.release();
            this.f25352C = null;
        }
    }

    private void B0(ImageOutput imageOutput) {
        this.f25354E = t0(imageOutput);
    }

    private boolean C0() {
        boolean z10;
        if (getState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f25350A;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean p0(s sVar) {
        int a10 = this.f25360r.a(sVar);
        if (a10 == r0.o(4) || a10 == r0.o(3)) {
            return true;
        }
        return false;
    }

    private Bitmap q0(int i10) {
        C2076a.i(this.f25355F);
        int width = this.f25355F.getWidth() / ((s) C2076a.i(this.f25351B)).f20066I;
        int height = this.f25355F.getHeight() / ((s) C2076a.i(this.f25351B)).f20067J;
        int i11 = this.f25351B.f20066I;
        return Bitmap.createBitmap(this.f25355F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean r0(long j10, long j11) {
        boolean z10;
        Bitmap bitmap;
        if (this.f25355F != null && this.f25357H == null) {
            return false;
        }
        if (this.f25350A == 0 && getState() != 2) {
            return false;
        }
        if (this.f25355F == null) {
            C2076a.i(this.f25352C);
            e a10 = this.f25352C.a();
            if (a10 == null) {
                return false;
            }
            if (((e) C2076a.i(a10)).m()) {
                if (this.f25368z == 3) {
                    A0();
                    C2076a.i(this.f25351B);
                    u0();
                } else {
                    ((e) C2076a.i(a10)).t();
                    if (this.f25362t.isEmpty()) {
                        this.f25364v = true;
                    }
                }
                return false;
            }
            C2076a.j(a10.f25349e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f25355F = a10.f25349e;
            ((e) C2076a.i(a10)).t();
        }
        if (!this.f25356G || this.f25355F == null || this.f25357H == null) {
            return false;
        }
        C2076a.i(this.f25351B);
        s sVar = this.f25351B;
        int i10 = sVar.f20066I;
        if ((i10 == 1 && sVar.f20067J == 1) || i10 == -1 || sVar.f20067J == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f25357H.d()) {
            b bVar = this.f25357H;
            if (z10) {
                bitmap = q0(bVar.c());
            } else {
                bitmap = (Bitmap) C2076a.i(this.f25355F);
            }
            bVar.e(bitmap);
        }
        if (!z0(j10, j11, (Bitmap) C2076a.i(this.f25357H.b()), this.f25357H.a())) {
            return false;
        }
        y0(((b) C2076a.i(this.f25357H)).a());
        this.f25350A = 3;
        if (!z10 || ((b) C2076a.i(this.f25357H)).c() == (((s) C2076a.i(this.f25351B)).f20067J * ((s) C2076a.i(this.f25351B)).f20066I) - 1) {
            this.f25355F = null;
        }
        this.f25357H = this.f25358I;
        this.f25358I = null;
        return true;
    }

    private boolean s0(long j10) {
        boolean z10;
        if (this.f25356G && this.f25357H != null) {
            return false;
        }
        w V10 = V();
        c cVar = this.f25352C;
        if (cVar == null || this.f25368z == 3 || this.f25363u) {
            return false;
        }
        if (this.f25353D == null) {
            l2.f fVar = (l2.f) cVar.d();
            this.f25353D = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f25368z == 2) {
            C2076a.i(this.f25353D);
            this.f25353D.s(4);
            ((c) C2076a.i(this.f25352C)).e(this.f25353D);
            this.f25353D = null;
            this.f25368z = 3;
            return false;
        }
        int m02 = m0(V10, this.f25353D, 0);
        if (m02 == -5) {
            this.f25351B = (s) C2076a.i(V10.f23734b);
            this.f25368z = 2;
            return true;
        } else if (m02 == -4) {
            this.f25353D.x();
            if (((ByteBuffer) C2076a.i(this.f25353D.f23520d)).remaining() > 0 || ((l2.f) C2076a.i(this.f25353D)).m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((c) C2076a.i(this.f25352C)).e((l2.f) C2076a.i(this.f25353D));
                this.f25359X = 0;
            }
            x0(j10, (l2.f) C2076a.i(this.f25353D));
            if (((l2.f) C2076a.i(this.f25353D)).m()) {
                this.f25363u = true;
                this.f25353D = null;
                return false;
            }
            this.f25367y = Math.max(this.f25367y, ((l2.f) C2076a.i(this.f25353D)).f23522f);
            if (z10) {
                this.f25353D = null;
            } else {
                ((l2.f) C2076a.i(this.f25353D)).i();
            }
            return !this.f25356G;
        } else if (m02 == -3) {
            return false;
        } else {
            throw new IllegalStateException();
        }
    }

    private static ImageOutput t0(ImageOutput imageOutput) {
        if (imageOutput == null) {
            return ImageOutput.f17717a;
        }
        return imageOutput;
    }

    private void u0() {
        if (p0(this.f25351B)) {
            c cVar = this.f25352C;
            if (cVar != null) {
                cVar.release();
            }
            this.f25352C = this.f25360r.b();
            return;
        }
        throw R(new d("Provided decoder factory can't create decoder for format."), this.f25351B, 4005);
    }

    private boolean v0(b bVar) {
        if (((s) C2076a.i(this.f25351B)).f20066I == -1 || this.f25351B.f20067J == -1 || bVar.c() == (((s) C2076a.i(this.f25351B)).f20067J * this.f25351B.f20066I) - 1) {
            return true;
        }
        return false;
    }

    private void w0(int i10) {
        this.f25350A = Math.min(this.f25350A, i10);
    }

    private void x0(long j10, l2.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (fVar.m()) {
            this.f25356G = true;
            return;
        }
        b bVar = new b(this.f25359X, fVar.f23522f);
        this.f25358I = bVar;
        this.f25359X++;
        if (!this.f25356G) {
            long a10 = bVar.a();
            if (a10 - 30000 > j10 || j10 > 30000 + a10) {
                z10 = false;
            } else {
                z10 = true;
            }
            b bVar2 = this.f25357H;
            if (bVar2 == null || bVar2.a() > j10 || j10 >= a10) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean v02 = v0((b) C2076a.i(this.f25358I));
            if (!z10 && !z11 && !v02) {
                z12 = false;
            }
            this.f25356G = z12;
            if (z11 && !z10) {
                return;
            }
        }
        this.f25357H = this.f25358I;
        this.f25358I = null;
    }

    private void y0(long j10) {
        this.f25366x = j10;
        while (!this.f25362t.isEmpty() && j10 >= ((a) this.f25362t.peek()).f25370a) {
            this.f25365w = (a) this.f25362t.removeFirst();
        }
    }

    public int a(s sVar) {
        return this.f25360r.a(sVar);
    }

    public boolean b() {
        return this.f25364v;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f25351B = null;
        this.f25365w = a.f25369c;
        this.f25362t.clear();
        A0();
        this.f25354E.a();
    }

    /* access modifiers changed from: protected */
    public void c0(boolean z10, boolean z11) {
        this.f25350A = z11 ? 1 : 0;
    }

    public boolean d() {
        int i10 = this.f25350A;
        if (i10 == 3 || (i10 == 0 && this.f25356G)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        w0(1);
        this.f25364v = false;
        this.f25363u = false;
        this.f25355F = null;
        this.f25357H = null;
        this.f25358I = null;
        this.f25356G = false;
        this.f25353D = null;
        c cVar = this.f25352C;
        if (cVar != null) {
            cVar.flush();
        }
        this.f25362t.clear();
    }

    /* access modifiers changed from: protected */
    public void f0() {
        A0();
    }

    public void g(long j10, long j11) {
        if (!this.f25364v) {
            if (this.f25351B == null) {
                w V10 = V();
                this.f25361s.i();
                int m02 = m0(V10, this.f25361s, 2);
                if (m02 == -5) {
                    this.f25351B = (s) C2076a.i(V10.f23734b);
                    u0();
                } else if (m02 == -4) {
                    C2076a.g(this.f25361s.m());
                    this.f25363u = true;
                    this.f25364v = true;
                    return;
                } else {
                    return;
                }
            }
            try {
                H.a("drainAndFeedDecoder");
                while (r0(j10, j11)) {
                }
                while (s0(j10)) {
                }
                H.b();
            } catch (d e10) {
                throw R(e10, (s) null, 4003);
            }
        }
    }

    public String getName() {
        return "ImageRenderer";
    }

    /* access modifiers changed from: protected */
    public void h0() {
        A0();
        w0(1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r2 >= r5) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k0(f2.s[] r5, long r6, long r8, t2.C2615C.b r10) {
        /*
            r4 = this;
            super.k0(r5, r6, r8, r10)
            q2.f$a r5 = r4.f25365w
            long r5 = r5.f25371b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0036
            java.util.ArrayDeque r5 = r4.f25362t
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0029
            long r5 = r4.f25367y
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            long r2 = r4.f25366x
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0029
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0029
            goto L_0x0036
        L_0x0029:
            java.util.ArrayDeque r5 = r4.f25362t
            q2.f$a r6 = new q2.f$a
            long r0 = r4.f25367y
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L_0x003d
        L_0x0036:
            q2.f$a r5 = new q2.f$a
            r5.<init>(r0, r8)
            r4.f25365w = r5
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.f.k0(f2.s[], long, long, t2.C$b):void");
    }

    public void p(int i10, Object obj) {
        ImageOutput imageOutput;
        if (i10 != 15) {
            super.p(i10, obj);
            return;
        }
        if (obj instanceof ImageOutput) {
            imageOutput = (ImageOutput) obj;
        } else {
            imageOutput = null;
        }
        B0(imageOutput);
    }

    /* access modifiers changed from: protected */
    public boolean z0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!C0() && j13 >= 30000) {
            return false;
        }
        this.f25354E.onImageAvailable(j12 - this.f25365w.f25371b, bitmap);
        return true;
    }
}
