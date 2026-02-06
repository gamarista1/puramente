package Lf;

import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.c;
import ng.f;
import sf.C6714a;

public enum r {
    UBYTE(b.a.b(r1, "kotlin/UByte", false, 2, (Object) null)),
    USHORT(b.a.b(r1, "kotlin/UShort", false, 2, (Object) null)),
    UINT(b.a.b(r1, "kotlin/UInt", false, 2, (Object) null)),
    ULONG(b.a.b(r1, "kotlin/ULong", false, 2, (Object) null));
    

    /* renamed from: a  reason: collision with root package name */
    private final b f64062a;

    /* renamed from: b  reason: collision with root package name */
    private final f f64063b;

    /* renamed from: c  reason: collision with root package name */
    private final b f64064c;

    static {
        r[] a10;
        f64061i = C6714a.a(a10);
    }

    private r(b bVar) {
        this.f64062a = bVar;
        f h10 = bVar.h();
        this.f64063b = h10;
        c f10 = bVar.f();
        f i10 = f.i(h10.b() + "Array");
        C6496s.g(i10, "identifier(...)");
        this.f64064c = new b(f10, i10);
    }

    public final b b() {
        return this.f64064c;
    }

    public final b c() {
        return this.f64062a;
    }

    public final f e() {
        return this.f64063b;
    }
}
