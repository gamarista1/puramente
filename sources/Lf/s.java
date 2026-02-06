package Lf;

import Fg.J0;
import Fg.S;
import Of.C5490h;
import Of.C5495m;
import Of.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import ng.b;
import ng.f;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f64065a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final Set f64066b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set f64067c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f64068d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap f64069e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap f64070f = O.k(C6502A.a(q.UBYTEARRAY, f.i("ubyteArrayOf")), C6502A.a(q.USHORTARRAY, f.i("ushortArrayOf")), C6502A.a(q.UINTARRAY, f.i("uintArrayOf")), C6502A.a(q.ULONGARRAY, f.i("ulongArrayOf")));

    /* renamed from: g  reason: collision with root package name */
    private static final Set f64071g;

    static {
        r[] values = r.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (r e10 : values) {
            arrayList.add(e10.e());
        }
        f64066b = C6565s.j1(arrayList);
        q[] values2 = q.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (q b10 : values2) {
            arrayList2.add(b10.b());
        }
        f64067c = C6565s.j1(arrayList2);
        r[] values3 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r b11 : values3) {
            linkedHashSet.add(b11.b().h());
        }
        f64071g = linkedHashSet;
        for (r rVar : r.values()) {
            f64068d.put(rVar.b(), rVar.c());
            f64069e.put(rVar.c(), rVar.b());
        }
    }

    private s() {
    }

    public static final boolean d(S s10) {
        C5490h o10;
        C6496s.h(s10, "type");
        if (!J0.w(s10) && (o10 = s10.N0().o()) != null) {
            return f64065a.c(o10);
        }
        return false;
    }

    public final b a(b bVar) {
        C6496s.h(bVar, "arrayClassId");
        return (b) f64068d.get(bVar);
    }

    public final boolean b(f fVar) {
        C6496s.h(fVar, "name");
        return f64071g.contains(fVar);
    }

    public final boolean c(C5495m mVar) {
        C6496s.h(mVar, "descriptor");
        C5495m b10 = mVar.b();
        if (!(b10 instanceof N) || !C6496s.c(((N) b10).f(), o.f63920A) || !f64066b.contains(mVar.getName())) {
            return false;
        }
        return true;
    }
}
