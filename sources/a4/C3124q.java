package a4;

import Ef.m;
import Gh.C5404e;
import Gh.C5407h;
import Gh.C5414o;
import Gh.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6504C;

/* renamed from: a4.q  reason: case insensitive filesystem */
public final class C3124q extends C5414o {

    /* renamed from: c  reason: collision with root package name */
    private static final a f36079c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final C5407h f36080d = C5407h.f63295d.b("0021F904");

    /* renamed from: b  reason: collision with root package name */
    private final C5404e f36081b = new C5404e();

    /* renamed from: a4.q$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3124q(W w10) {
        super(w10);
    }

    private final long N0(C5407h hVar) {
        long j10 = -1;
        while (true) {
            j10 = this.f36081b.M(hVar.j(0), j10 + 1);
            if (j10 == -1 || (e0((long) hVar.O()) && this.f36081b.F0(j10, hVar))) {
                return j10;
            }
        }
        return j10;
    }

    private final long b(C5404e eVar, long j10) {
        return m.e(this.f36081b.y1(eVar, j10), 0);
    }

    private final boolean e0(long j10) {
        if (this.f36081b.B0() >= j10) {
            return true;
        }
        long B02 = j10 - this.f36081b.B0();
        if (super.y1(this.f36081b, B02) == B02) {
            return true;
        }
        return false;
    }

    public long y1(C5404e eVar, long j10) {
        e0(j10);
        if (this.f36081b.B0() != 0) {
            long j11 = 0;
            while (true) {
                long N02 = N0(f36080d);
                if (N02 == -1) {
                    break;
                }
                j11 += b(eVar, N02 + ((long) 4));
                if (e0(5) && this.f36081b.I(4) == 0 && (((C6504C.b(this.f36081b.I(2)) & 255) << 8) | (C6504C.b(this.f36081b.I(1)) & 255)) < 2) {
                    eVar.K0(this.f36081b.I(0));
                    eVar.K0(10);
                    eVar.K0(0);
                    this.f36081b.skip(3);
                }
            }
            if (j11 < j10) {
                j11 += b(eVar, j10 - j11);
            }
            if (j11 == 0) {
                return -1;
            }
            return j11;
        } else if (j10 == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
