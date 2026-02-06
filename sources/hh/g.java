package Hh;

import Gh.C5404e;
import Gh.C5414o;
import Gh.W;
import java.io.IOException;
import kotlin.jvm.internal.C6496s;

public final class g extends C5414o {

    /* renamed from: b  reason: collision with root package name */
    private final long f63488b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63489c;

    /* renamed from: d  reason: collision with root package name */
    private long f63490d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(W w10, long j10, boolean z10) {
        super(w10);
        C6496s.h(w10, "delegate");
        this.f63488b = j10;
        this.f63489c = z10;
    }

    private final void b(C5404e eVar, long j10) {
        C5404e eVar2 = new C5404e();
        eVar2.K(eVar);
        eVar.P(eVar2, j10);
        eVar2.a();
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        long j11 = this.f63490d;
        long j12 = this.f63488b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f63489c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1;
            }
            j10 = Math.min(j10, j13);
        }
        long y12 = super.y1(eVar, j10);
        int i10 = (y12 > -1 ? 1 : (y12 == -1 ? 0 : -1));
        if (i10 != 0) {
            this.f63490d += y12;
        }
        long j14 = this.f63490d;
        long j15 = this.f63488b;
        if ((j14 >= j15 || i10 != 0) && j14 <= j15) {
            return y12;
        }
        if (y12 > 0 && j14 > j15) {
            b(eVar, eVar.B0() - (this.f63490d - this.f63488b));
        }
        throw new IOException("expected " + this.f63488b + " bytes but got " + this.f63490d);
    }
}
