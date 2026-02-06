package Y;

import androidx.collection.C;
import androidx.collection.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import yf.C6787a;

final class A0 {

    /* renamed from: a  reason: collision with root package name */
    private final List f9746a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9747b;

    /* renamed from: c  reason: collision with root package name */
    private int f9748c;

    /* renamed from: d  reason: collision with root package name */
    private final List f9749d;

    /* renamed from: e  reason: collision with root package name */
    private final C f9750e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f9751f;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A0 f9752a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A0 a02) {
            super(0);
            this.f9752a = a02;
        }

        public final K a() {
            K j10 = C1506p.I(this.f9752a.b().size());
            A0 a02 = this.f9752a;
            int size = a02.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C1472b0 b0Var = (C1472b0) a02.b().get(i10);
                C1509q0.f(j10, C1506p.A(b0Var), b0Var);
            }
            return j10;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C1509q0.a(a());
        }
    }

    public A0(List list, int i10) {
        boolean z10;
        this.f9746a = list;
        this.f9747b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("Invalid start index");
        }
        this.f9749d = new ArrayList();
        C c10 = new C(0, 1, (DefaultConstructorMarker) null);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C1472b0 b0Var = (C1472b0) this.f9746a.get(i12);
            c10.t(b0Var.b(), new S(i12, i11, b0Var.c()));
            i11 += b0Var.c();
        }
        this.f9750e = c10;
        this.f9751f = C6531o.b(new a(this));
    }

    public final int a() {
        return this.f9748c;
    }

    public final List b() {
        return this.f9746a;
    }

    public final K c() {
        return ((C1509q0) this.f9751f.getValue()).h();
    }

    public final C1472b0 d(int i10, Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = new C1469a0(Integer.valueOf(i10), obj);
        } else {
            obj2 = Integer.valueOf(i10);
        }
        return (C1472b0) C1509q0.e(c(), obj2);
    }

    public final int e() {
        return this.f9747b;
    }

    public final List f() {
        return this.f9749d;
    }

    public final int g(C1472b0 b0Var) {
        S s10 = (S) this.f9750e.c(b0Var.b());
        if (s10 != null) {
            return s10.b();
        }
        return -1;
    }

    public final boolean h(C1472b0 b0Var) {
        return this.f9749d.add(b0Var);
    }

    public final void i(C1472b0 b0Var, int i10) {
        this.f9750e.t(b0Var.b(), new S(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i13 > i14) {
            C c11 = this.f9750e;
            Object[] objArr = c11.f12190c;
            long[] jArr = c11.f12188a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr[i15];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & 255) < 128) {
                                S s10 = (S) objArr[(i15 << 3) + i17];
                                int b10 = s10.b();
                                if (i13 <= b10 && b10 < i13 + i12) {
                                    s10.e((b10 - i13) + i14);
                                } else if (i14 <= b10 && b10 < i13) {
                                    s10.e(b10 + i12);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            return;
                        }
                    }
                    if (i15 != length) {
                        i15++;
                        j10 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i14 > i13) {
            C c12 = this.f9750e;
            Object[] objArr2 = c12.f12190c;
            long[] jArr2 = c12.f12188a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j12 = jArr2[i18];
                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j12 & 255) < 128) {
                                S s11 = (S) objArr2[(i18 << 3) + i20];
                                int b11 = s11.b();
                                if (i13 <= b11 && b11 < i13 + i12) {
                                    s11.e((b11 - i13) + i14);
                                } else if (i13 + 1 <= b11 && b11 < i14) {
                                    s11.e(b11 - i12);
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i19 != 8) {
                            return;
                        }
                    }
                    if (i18 != length2) {
                        i18++;
                        c10 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = i10;
        int i13 = i11;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i12 > i13) {
            C c11 = this.f9750e;
            Object[] objArr = c11.f12190c;
            long[] jArr = c11.f12188a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j11 = jArr[i14];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j11 & 255) < 128) {
                                S s10 = (S) objArr[(i14 << 3) + i16];
                                int c12 = s10.c();
                                if (c12 == i12) {
                                    s10.f(i13);
                                } else if (i13 <= c12 && c12 < i12) {
                                    s10.f(c12 + 1);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i15 != 8) {
                            return;
                        }
                    }
                    if (i14 != length) {
                        i14++;
                        j10 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i13 > i12) {
            C c13 = this.f9750e;
            Object[] objArr2 = c13.f12190c;
            long[] jArr2 = c13.f12188a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j12 = jArr2[i17];
                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j12 & 255) < 128) {
                                S s11 = (S) objArr2[(i17 << 3) + i19];
                                int c14 = s11.c();
                                if (c14 == i12) {
                                    s11.f(i13);
                                } else if (i12 + 1 <= c14 && c14 < i13) {
                                    s11.f(c14 - 1);
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length2) {
                        i17++;
                        c10 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void l(int i10) {
        this.f9748c = i10;
    }

    public final int m(C1472b0 b0Var) {
        S s10 = (S) this.f9750e.c(b0Var.b());
        if (s10 != null) {
            return s10.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int b10;
        int i12 = i11;
        S s10 = (S) this.f9750e.c(i10);
        if (s10 == null) {
            return false;
        }
        int b11 = s10.b();
        int a10 = i12 - s10.a();
        s10.d(i12);
        if (a10 == 0) {
            return true;
        }
        C c10 = this.f9750e;
        Object[] objArr = c10.f12190c;
        long[] jArr = c10.f12188a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j10) < 128) {
                        S s11 = (S) objArr[(i13 << 3) + i15];
                        if (s11.b() >= b11 && !C6496s.c(s11, s10) && (b10 = s11.b() + a10) >= 0) {
                            s11.e(b10);
                        }
                    }
                    j10 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final int o(C1472b0 b0Var) {
        S s10 = (S) this.f9750e.c(b0Var.b());
        if (s10 != null) {
            return s10.a();
        }
        return b0Var.c();
    }
}
