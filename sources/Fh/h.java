package Fh;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5407h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.C6496s;

public final class h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63160a;

    /* renamed from: b  reason: collision with root package name */
    private final C5405f f63161b;

    /* renamed from: c  reason: collision with root package name */
    private final Random f63162c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63163d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f63164e;

    /* renamed from: f  reason: collision with root package name */
    private final long f63165f;

    /* renamed from: g  reason: collision with root package name */
    private final C5404e f63166g = new C5404e();

    /* renamed from: h  reason: collision with root package name */
    private final C5404e f63167h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f63168i;

    /* renamed from: j  reason: collision with root package name */
    private a f63169j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f63170k;

    /* renamed from: l  reason: collision with root package name */
    private final C5404e.a f63171l;

    public h(boolean z10, C5405f fVar, Random random, boolean z11, boolean z12, long j10) {
        byte[] bArr;
        C6496s.h(fVar, "sink");
        C6496s.h(random, "random");
        this.f63160a = z10;
        this.f63161b = fVar;
        this.f63162c = random;
        this.f63163d = z11;
        this.f63164e = z12;
        this.f63165f = j10;
        this.f63167h = fVar.i();
        C5404e.a aVar = null;
        if (z10) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f63170k = bArr;
        this.f63171l = z10 ? new C5404e.a() : aVar;
    }

    private final void b(int i10, C5407h hVar) {
        if (!this.f63168i) {
            int O10 = hVar.O();
            if (((long) O10) <= 125) {
                this.f63167h.K0(i10 | 128);
                if (this.f63160a) {
                    this.f63167h.K0(O10 | 128);
                    Random random = this.f63162c;
                    byte[] bArr = this.f63170k;
                    C6496s.e(bArr);
                    random.nextBytes(bArr);
                    this.f63167h.n0(this.f63170k);
                    if (O10 > 0) {
                        long B02 = this.f63167h.B0();
                        this.f63167h.k0(hVar);
                        C5404e eVar = this.f63167h;
                        C5404e.a aVar = this.f63171l;
                        C6496s.e(aVar);
                        eVar.g0(aVar);
                        this.f63171l.n(B02);
                        f.f63143a.b(this.f63171l, this.f63170k);
                        this.f63171l.close();
                    }
                } else {
                    this.f63167h.K0(O10);
                    this.f63167h.k0(hVar);
                }
                this.f63161b.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    public final void a(int i10, C5407h hVar) {
        C5407h hVar2 = C5407h.f63296e;
        if (!(i10 == 0 && hVar == null)) {
            if (i10 != 0) {
                f.f63143a.c(i10);
            }
            C5404e eVar = new C5404e();
            eVar.D0(i10);
            if (hVar != null) {
                eVar.k0(hVar);
            }
            hVar2 = eVar.o0();
        }
        try {
            b(8, hVar2);
        } finally {
            this.f63168i = true;
        }
    }

    public void close() {
        a aVar = this.f63169j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void f(int i10, C5407h hVar) {
        int i11;
        C6496s.h(hVar, "data");
        if (!this.f63168i) {
            this.f63166g.k0(hVar);
            int i12 = i10 | 128;
            if (this.f63163d && ((long) hVar.O()) >= this.f63165f) {
                a aVar = this.f63169j;
                if (aVar == null) {
                    aVar = new a(this.f63164e);
                    this.f63169j = aVar;
                }
                aVar.a(this.f63166g);
                i12 = i10 | 192;
            }
            long B02 = this.f63166g.B0();
            this.f63167h.K0(i12);
            if (this.f63160a) {
                i11 = 128;
            } else {
                i11 = 0;
            }
            if (B02 <= 125) {
                this.f63167h.K0(i11 | ((int) B02));
            } else if (B02 <= 65535) {
                this.f63167h.K0(i11 | 126);
                this.f63167h.D0((int) B02);
            } else {
                this.f63167h.K0(i11 | 127);
                this.f63167h.C1(B02);
            }
            if (this.f63160a) {
                Random random = this.f63162c;
                byte[] bArr = this.f63170k;
                C6496s.e(bArr);
                random.nextBytes(bArr);
                this.f63167h.n0(this.f63170k);
                if (B02 > 0) {
                    C5404e eVar = this.f63166g;
                    C5404e.a aVar2 = this.f63171l;
                    C6496s.e(aVar2);
                    eVar.g0(aVar2);
                    this.f63171l.n(0);
                    f.f63143a.b(this.f63171l, this.f63170k);
                    this.f63171l.close();
                }
            }
            this.f63167h.P(this.f63166g, B02);
            this.f63161b.A();
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    public final void n(C5407h hVar) {
        C6496s.h(hVar, "payload");
        b(9, hVar);
    }

    public final void o(C5407h hVar) {
        C6496s.h(hVar, "payload");
        b(10, hVar);
    }
}
