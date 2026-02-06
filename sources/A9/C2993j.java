package A9;

import A9.I;
import android.util.SparseArray;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.common.collect.C4770v;
import ja.B;
import ja.C3649e;
import java.util.ArrayList;
import java.util.List;
import k9.C3717q0;

/* renamed from: A9.j  reason: case insensitive filesystem */
public final class C2993j implements I.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f29580a;

    /* renamed from: b  reason: collision with root package name */
    private final List f29581b;

    public C2993j(int i10) {
        this(i10, C4770v.E());
    }

    private D c(I.b bVar) {
        return new D(e(bVar));
    }

    private K d(I.b bVar) {
        return new K(e(bVar));
    }

    private List e(I.b bVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        if (f(32)) {
            return this.f29581b;
        }
        B b10 = new B(bVar.f29504d);
        List list2 = this.f29581b;
        while (b10.a() > 0) {
            int D10 = b10.D();
            int e10 = b10.e() + b10.D();
            if (D10 == 134) {
                list2 = new ArrayList();
                int D11 = b10.D() & 31;
                for (int i11 = 0; i11 < D11; i11++) {
                    String A10 = b10.A(3);
                    int D12 = b10.D();
                    boolean z11 = true;
                    if ((D12 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = D12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte D13 = (byte) b10.D();
                    b10.Q(1);
                    if (z10) {
                        if ((D13 & 64) == 0) {
                            z11 = false;
                        }
                        list = C3649e.b(z11);
                    } else {
                        list = null;
                    }
                    list2.add(new C3717q0.b().e0(str).V(A10).F(i10).T(list).E());
                }
            }
            b10.P(e10);
        }
        return list2;
    }

    private boolean f(int i10) {
        if ((i10 & this.f29580a) != 0) {
            return true;
        }
        return false;
    }

    public SparseArray a() {
        return new SparseArray();
    }

    public I b(int i10, I.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f29502b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 != 27) {
                if (i10 == 36) {
                    return new w(new q(c(bVar)));
                }
                if (i10 == 89) {
                    return new w(new l(bVar.f29503c));
                }
                if (i10 != 138) {
                    if (i10 == 172) {
                        return new w(new C2989f(bVar.f29502b));
                    }
                    if (i10 == 257) {
                        return new C(new v("application/vnd.dvb.ait"));
                    }
                    if (i10 != 134) {
                        if (i10 != 135) {
                            switch (i10) {
                                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new C2992i(false, bVar.f29502b));
                                case 16:
                                    return new w(new o(d(bVar)));
                                case 17:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new s(bVar.f29502b));
                                default:
                                    switch (i10) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new w(new C2986c(bVar.f29502b));
                    } else if (f(16)) {
                        return null;
                    } else {
                        return new C(new v("application/x-scte35"));
                    }
                }
                return new w(new C2994k(bVar.f29502b));
            } else if (f(4)) {
                return null;
            } else {
                return new w(new p(c(bVar), f(1), f(8)));
            }
        }
        return new w(new n(d(bVar)));
    }

    public C2993j(int i10, List list) {
        this.f29580a = i10;
        this.f29581b = list;
    }
}
