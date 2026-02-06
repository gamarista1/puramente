package mh;

import kotlin.jvm.internal.C6496s;
import lf.C6504C;
import lf.C6506E;
import lf.C6508G;
import lf.C6511J;

/* renamed from: mh.u  reason: case insensitive filesystem */
public final class C6603u extends C6596m {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72221c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6603u(C6608z zVar, boolean z10) {
        super(zVar);
        C6496s.h(zVar, "writer");
        this.f72221c = z10;
    }

    public void e(byte b10) {
        boolean z10 = this.f72221c;
        String f10 = C6504C.f(C6504C.b(b10));
        if (z10) {
            n(f10);
        } else {
            k(f10);
        }
    }

    public void i(int i10) {
        boolean z10 = this.f72221c;
        int b10 = C6506E.b(i10);
        if (z10) {
            n(Long.toString(((long) b10) & 4294967295L, 10));
        } else {
            k(Long.toString(((long) b10) & 4294967295L, 10));
        }
    }

    public void j(long j10) {
        boolean z10 = this.f72221c;
        long b10 = C6508G.b(j10);
        if (z10) {
            n(C6601s.a(b10, 10));
        } else {
            k(C6602t.a(b10, 10));
        }
    }

    public void l(short s10) {
        boolean z10 = this.f72221c;
        String f10 = C6511J.f(C6511J.b(s10));
        if (z10) {
            n(f10);
        } else {
            k(f10);
        }
    }
}
