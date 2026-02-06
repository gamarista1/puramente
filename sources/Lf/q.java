package Lf;

import ng.b;
import ng.f;
import sf.C6714a;

public enum q {
    UBYTEARRAY(b.a.b(r1, "kotlin/UByteArray", false, 2, (Object) null)),
    USHORTARRAY(b.a.b(r1, "kotlin/UShortArray", false, 2, (Object) null)),
    UINTARRAY(b.a.b(r1, "kotlin/UIntArray", false, 2, (Object) null)),
    ULONGARRAY(b.a.b(r1, "kotlin/ULongArray", false, 2, (Object) null));
    

    /* renamed from: a  reason: collision with root package name */
    private final b f64054a;

    /* renamed from: b  reason: collision with root package name */
    private final f f64055b;

    static {
        q[] a10;
        f64053h = C6714a.a(a10);
    }

    private q(b bVar) {
        this.f64054a = bVar;
        this.f64055b = bVar.h();
    }

    public final f b() {
        return this.f64055b;
    }
}
