package mg;

import ig.c;
import ig.d;
import ig.i;
import ig.l;
import ig.n;
import ig.q;
import ig.u;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C6435b;
import kg.C6436c;
import kg.e;
import kg.f;
import kg.g;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lg.C6536a;
import mf.C6565s;
import mg.C6576d;
import pg.C6645g;
import pg.C6647i;
import yf.C6798l;

/* renamed from: mg.i  reason: case insensitive filesystem */
public final class C6581i {

    /* renamed from: a  reason: collision with root package name */
    public static final C6581i f72110a = new C6581i();

    /* renamed from: b  reason: collision with root package name */
    private static final C6645g f72111b;

    static {
        C6645g d10 = C6645g.d();
        C6536a.a(d10);
        C6496s.g(d10, "apply(...)");
        f72111b = d10;
    }

    private C6581i() {
    }

    public static /* synthetic */ C6576d.a d(C6581i iVar, n nVar, C6436c cVar, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(nVar, cVar, gVar, z10);
    }

    public static final boolean f(n nVar) {
        C6496s.h(nVar, "proto");
        C6435b.C1024b a10 = C6575c.f72088a.a();
        Object u10 = nVar.u(C6536a.f71859e);
        C6496s.g(u10, "getExtension(...)");
        Boolean f10 = a10.d(((Number) u10).intValue());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    private final String g(q qVar, C6436c cVar) {
        if (qVar.m0()) {
            return C6574b.b(cVar.b(qVar.W()));
        }
        return null;
    }

    public static final Pair h(byte[] bArr, String[] strArr) {
        C6496s.h(bArr, "bytes");
        C6496s.h(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(f72110a.k(byteArrayInputStream, strArr), c.x1(byteArrayInputStream, f72111b));
    }

    public static final Pair i(String[] strArr, String[] strArr2) {
        C6496s.h(strArr, "data");
        C6496s.h(strArr2, "strings");
        byte[] e10 = C6573a.e(strArr);
        C6496s.g(e10, "decodeBytes(...)");
        return h(e10, strArr2);
    }

    public static final Pair j(String[] strArr, String[] strArr2) {
        C6496s.h(strArr, "data");
        C6496s.h(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C6573a.e(strArr));
        return new Pair(f72110a.k(byteArrayInputStream, strArr2), i.F0(byteArrayInputStream, f72111b));
    }

    private final C6578f k(InputStream inputStream, String[] strArr) {
        C6536a.e D10 = C6536a.e.D(inputStream, f72111b);
        C6496s.g(D10, "parseDelimitedFrom(...)");
        return new C6578f(D10, strArr);
    }

    public static final Pair l(byte[] bArr, String[] strArr) {
        C6496s.h(bArr, "bytes");
        C6496s.h(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(f72110a.k(byteArrayInputStream, strArr), l.d0(byteArrayInputStream, f72111b));
    }

    public static final Pair m(String[] strArr, String[] strArr2) {
        C6496s.h(strArr, "data");
        C6496s.h(strArr2, "strings");
        byte[] e10 = C6573a.e(strArr);
        C6496s.g(e10, "decodeBytes(...)");
        return l(e10, strArr2);
    }

    public final C6645g a() {
        return f72111b;
    }

    public final C6576d.b b(d dVar, C6436c cVar, g gVar) {
        String str;
        String str2;
        C6496s.h(dVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6647i.f fVar = C6536a.f71855a;
        C6496s.g(fVar, "constructorSignature");
        C6536a.c cVar2 = (C6536a.c) e.a(dVar, fVar);
        if (cVar2 == null || !cVar2.z()) {
            str = "<init>";
        } else {
            str = cVar.getString(cVar2.x());
        }
        if (cVar2 == null || !cVar2.y()) {
            List M10 = dVar.M();
            C6496s.g(M10, "getValueParameterList(...)");
            Iterable<u> iterable = M10;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (u uVar : iterable) {
                C6581i iVar = f72110a;
                C6496s.e(uVar);
                String g10 = iVar.g(f.q(uVar, gVar), cVar);
                if (g10 == null) {
                    return null;
                }
                arrayList.add(g10);
            }
            str2 = C6565s.x0(arrayList, "", "(", ")V", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
        } else {
            str2 = cVar.getString(cVar2.w());
        }
        return new C6576d.b(str, str2);
    }

    public final C6576d.a c(n nVar, C6436c cVar, g gVar, boolean z10) {
        C6536a.b bVar;
        int i10;
        String str;
        C6496s.h(nVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6647i.f fVar = C6536a.f71858d;
        C6496s.g(fVar, "propertySignature");
        C6536a.d dVar = (C6536a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (dVar.F()) {
            bVar = dVar.A();
        } else {
            bVar = null;
        }
        if (bVar == null && z10) {
            return null;
        }
        if (bVar == null || !bVar.z()) {
            i10 = nVar.c0();
        } else {
            i10 = bVar.x();
        }
        if (bVar == null || !bVar.y()) {
            str = g(f.n(nVar, gVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.getString(bVar.w());
        }
        return new C6576d.a(cVar.getString(i10), str);
    }

    public final C6576d.b e(i iVar, C6436c cVar, g gVar) {
        int i10;
        String str;
        i iVar2 = iVar;
        C6436c cVar2 = cVar;
        g gVar2 = gVar;
        C6496s.h(iVar2, "proto");
        C6496s.h(cVar2, "nameResolver");
        C6496s.h(gVar2, "typeTable");
        C6647i.f fVar = C6536a.f71856b;
        C6496s.g(fVar, "methodSignature");
        C6536a.c cVar3 = (C6536a.c) e.a(iVar2, fVar);
        if (cVar3 == null || !cVar3.z()) {
            i10 = iVar.d0();
        } else {
            i10 = cVar3.x();
        }
        if (cVar3 == null || !cVar3.y()) {
            Collection r10 = C6565s.r(f.k(iVar2, gVar2));
            List q02 = iVar.q0();
            C6496s.g(q02, "getValueParameterList(...)");
            Iterable<u> iterable = q02;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (u uVar : iterable) {
                C6496s.e(uVar);
                arrayList.add(f.q(uVar, gVar2));
            }
            Iterable<q> K02 = C6565s.K0(r10, arrayList);
            ArrayList arrayList2 = new ArrayList(C6565s.y(K02, 10));
            for (q g10 : K02) {
                String g11 = f72110a.g(g10, cVar2);
                if (g11 == null) {
                    return null;
                }
                arrayList2.add(g11);
            }
            String g12 = g(f.m(iVar2, gVar2), cVar2);
            if (g12 == null) {
                return null;
            }
            str = C6565s.x0(arrayList2, "", "(", ")", 0, (CharSequence) null, (C6798l) null, 56, (Object) null) + g12;
        } else {
            str = cVar2.getString(cVar3.w());
        }
        return new C6576d.b(cVar2.getString(i10), str);
    }
}
