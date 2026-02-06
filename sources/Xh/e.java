package xh;

import Bh.j;
import Gh.C5404e;
import Gh.C5407h;
import Sg.p;
import com.amazon.a.a.o.b.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;
import rh.C6711h;
import rh.E;
import rh.m;
import rh.n;
import rh.u;
import rh.v;
import sh.C6726e;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final C5407h f73880a;

    /* renamed from: b  reason: collision with root package name */
    private static final C5407h f73881b;

    static {
        C5407h.a aVar = C5407h.f63295d;
        f73880a = aVar.d("\"\\");
        f73881b = aVar.d("\t ,=");
    }

    public static final List a(u uVar, String str) {
        C6496s.h(uVar, "<this>");
        C6496s.h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p.v(str, uVar.g(i10), true)) {
                try {
                    c(new C5404e().X(uVar.x(i10)), arrayList);
                } catch (EOFException e10) {
                    j.f62626a.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(E e10) {
        C6496s.h(e10, "<this>");
        if (C6496s.c(e10.g0().h(), "HEAD")) {
            return false;
        }
        int o10 = e10.o();
        if (((o10 >= 100 && o10 < 200) || o10 == 204 || o10 == 304) && C6726e.v(e10) == -1 && !p.v("chunked", E.E(e10, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void c(C5404e eVar, List list) {
        String e10;
        int L10;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    g(eVar);
                    str2 = e(eVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean g10 = g(eVar);
                e10 = e(eVar);
                if (e10 != null) {
                    L10 = C6726e.L(eVar, (byte) 61);
                    boolean g11 = g(eVar);
                    if (g10 || (!g11 && !eVar.J0())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int L11 = L10 + C6726e.L(eVar, (byte) 61);
                        while (true) {
                            if (e10 == null) {
                                e10 = e(eVar);
                                if (g(eVar)) {
                                    continue;
                                    break;
                                }
                                L11 = C6726e.L(eVar, (byte) 61);
                            }
                            if (L11 == 0) {
                                continue;
                                break;
                            } else if (L11 <= 1 && !g(eVar)) {
                                if (h(eVar, (byte) 34)) {
                                    str = d(eVar);
                                } else {
                                    str = e(eVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(e10, str)) != null) {
                                    return;
                                }
                                if (g(eVar) || eVar.J0()) {
                                    e10 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C6711h(str2, linkedHashMap));
                        str2 = e10;
                    }
                } else if (eVar.J0()) {
                    list.add(new C6711h(str2, O.i()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e10 + p.z(f.f37530b, L10));
            C6496s.g(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new C6711h(str2, singletonMap));
        }
    }

    private static final String d(C5404e eVar) {
        if (eVar.readByte() == 34) {
            C5404e eVar2 = new C5404e();
            while (true) {
                long Z10 = eVar.Z(f73880a);
                if (Z10 == -1) {
                    return null;
                }
                if (eVar.I(Z10) == 34) {
                    eVar2.P(eVar, Z10);
                    eVar.readByte();
                    return eVar2.p1();
                } else if (eVar.B0() == Z10 + 1) {
                    return null;
                } else {
                    eVar2.P(eVar, Z10);
                    eVar.readByte();
                    eVar2.P(eVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String e(C5404e eVar) {
        long Z10 = eVar.Z(f73881b);
        if (Z10 == -1) {
            Z10 = eVar.B0();
        }
        if (Z10 != 0) {
            return eVar.z0(Z10);
        }
        return null;
    }

    public static final void f(n nVar, v vVar, u uVar) {
        C6496s.h(nVar, "<this>");
        C6496s.h(vVar, "url");
        C6496s.h(uVar, "headers");
        if (nVar != n.f73444b) {
            List e10 = m.f73420j.e(vVar, uVar);
            if (!e10.isEmpty()) {
                nVar.d(vVar, e10);
            }
        }
    }

    private static final boolean g(C5404e eVar) {
        boolean z10 = false;
        while (!eVar.J0()) {
            byte I10 = eVar.I(0);
            if (I10 == 44) {
                eVar.readByte();
                z10 = true;
            } else if (I10 != 32 && I10 != 9) {
                break;
            } else {
                eVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C5404e eVar, byte b10) {
        if (eVar.J0() || eVar.I(0) != b10) {
            return false;
        }
        return true;
    }
}
