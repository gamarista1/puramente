package Hh;

import Gh.C5404e;
import Gh.C5407h;
import Gh.M;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C5407h f63480a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5407h f63481b;

    /* renamed from: c  reason: collision with root package name */
    private static final C5407h f63482c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C5407h f63483d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5407h f63484e;

    static {
        C5407h.a aVar = C5407h.f63295d;
        f63480a = aVar.d("/");
        f63481b = aVar.d("\\");
        f63482c = aVar.d("/\\");
        f63483d = aVar.d(".");
        f63484e = aVar.d("..");
    }

    public static final M j(M m10, M m11, boolean z10) {
        C6496s.h(m10, "<this>");
        C6496s.h(m11, "child");
        if (m11.f() || m11.u() != null) {
            return m11;
        }
        C5407h m12 = m(m10);
        if (m12 == null && (m12 = m(m11)) == null) {
            m12 = s(M.f63224c);
        }
        C5404e eVar = new C5404e();
        eVar.k0(m10.b());
        if (eVar.B0() > 0) {
            eVar.k0(m12);
        }
        eVar.k0(m11.b());
        return q(eVar, z10);
    }

    public static final M k(String str, boolean z10) {
        C6496s.h(str, "<this>");
        return q(new C5404e().X(str), z10);
    }

    /* access modifiers changed from: private */
    public static final int l(M m10) {
        int C10 = C5407h.C(m10.b(), f63480a, 0, 2, (Object) null);
        if (C10 != -1) {
            return C10;
        }
        return C5407h.C(m10.b(), f63481b, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C5407h m(M m10) {
        C5407h b10 = m10.b();
        C5407h hVar = f63480a;
        if (C5407h.u(b10, hVar, 0, 2, (Object) null) != -1) {
            return hVar;
        }
        C5407h b11 = m10.b();
        C5407h hVar2 = f63481b;
        if (C5407h.u(b11, hVar2, 0, 2, (Object) null) != -1) {
            return hVar2;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean n(M m10) {
        if (!m10.b().i(f63484e) || (m10.b().O() != 2 && !m10.b().F(m10.b().O() - 3, f63480a, 0, 1) && !m10.b().F(m10.b().O() - 3, f63481b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final int o(M m10) {
        if (m10.b().O() == 0) {
            return -1;
        }
        if (m10.b().j(0) == 47) {
            return 1;
        }
        if (m10.b().j(0) != 92) {
            if (m10.b().O() > 2 && m10.b().j(1) == 58 && m10.b().j(2) == 92) {
                char j10 = (char) m10.b().j(0);
                if ('a' <= j10 && j10 < '{') {
                    return 3;
                }
                if ('A' > j10 || j10 >= '[') {
                    return -1;
                }
                return 3;
            }
            return -1;
        } else if (m10.b().O() <= 2 || m10.b().j(1) != 92) {
            return 1;
        } else {
            int s10 = m10.b().s(f63481b, 2);
            if (s10 == -1) {
                return m10.b().O();
            }
            return s10;
        }
    }

    private static final boolean p(C5404e eVar, C5407h hVar) {
        if (!C6496s.c(hVar, f63481b) || eVar.B0() < 2 || eVar.I(1) != 58) {
            return false;
        }
        char I10 = (char) eVar.I(0);
        if (('a' > I10 || I10 >= '{') && ('A' > I10 || I10 >= '[')) {
            return false;
        }
        return true;
    }

    public static final M q(C5404e eVar, boolean z10) {
        C5407h hVar;
        boolean z11;
        boolean z12;
        C5407h hVar2;
        C5404e eVar2 = eVar;
        C6496s.h(eVar2, "<this>");
        C5404e eVar3 = new C5404e();
        C5407h hVar3 = null;
        int i10 = 0;
        while (true) {
            if (!eVar2.F0(0, f63480a)) {
                hVar = f63481b;
                if (!eVar2.F0(0, hVar)) {
                    break;
                }
            }
            byte readByte = eVar.readByte();
            if (hVar3 == null) {
                hVar3 = r(readByte);
            }
            i10++;
        }
        if (i10 < 2 || !C6496s.c(hVar3, hVar)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            C6496s.e(hVar3);
            eVar3.k0(hVar3);
            eVar3.k0(hVar3);
        } else if (i10 > 0) {
            C6496s.e(hVar3);
            eVar3.k0(hVar3);
        } else {
            long Z10 = eVar2.Z(f63482c);
            if (hVar3 == null) {
                if (Z10 == -1) {
                    hVar3 = s(M.f63224c);
                } else {
                    hVar3 = r(eVar2.I(Z10));
                }
            }
            if (p(eVar2, hVar3)) {
                if (Z10 == 2) {
                    eVar3.P(eVar2, 3);
                } else {
                    eVar3.P(eVar2, 2);
                }
            }
        }
        if (eVar3.B0() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!eVar.J0()) {
            long Z11 = eVar2.Z(f63482c);
            if (Z11 == -1) {
                hVar2 = eVar.o0();
            } else {
                hVar2 = eVar2.A0(Z11);
                eVar.readByte();
            }
            C5407h hVar4 = f63484e;
            if (C6496s.c(hVar2, hVar4)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || C6496s.c(C6565s.z0(arrayList), hVar4)))) {
                        arrayList.add(hVar2);
                    } else if (!z11 || arrayList.size() != 1) {
                        C6565s.O(arrayList);
                    }
                }
            } else if (!C6496s.c(hVar2, f63483d) && !C6496s.c(hVar2, C5407h.f63296e)) {
                arrayList.add(hVar2);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar3.k0(hVar3);
            }
            eVar3.k0((C5407h) arrayList.get(i11));
        }
        if (eVar3.B0() == 0) {
            eVar3.k0(f63483d);
        }
        return new M(eVar3.o0());
    }

    private static final C5407h r(byte b10) {
        if (b10 == 47) {
            return f63480a;
        }
        if (b10 == 92) {
            return f63481b;
        }
        throw new IllegalArgumentException("not a directory separator: " + b10);
    }

    /* access modifiers changed from: private */
    public static final C5407h s(String str) {
        if (C6496s.c(str, "/")) {
            return f63480a;
        }
        if (C6496s.c(str, "\\")) {
            return f63481b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
