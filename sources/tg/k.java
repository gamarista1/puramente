package tg;

import Fg.C5366d0;
import Fg.S;
import Hg.l;
import Of.C5487e;
import Of.C5506y;
import Of.H;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import ng.b;
import ng.f;
import rg.C6691i;

public final class k extends g {

    /* renamed from: b  reason: collision with root package name */
    private final b f73559b;

    /* renamed from: c  reason: collision with root package name */
    private final f f73560c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(b bVar, f fVar) {
        super(C6502A.a(bVar, fVar));
        C6496s.h(bVar, "enumClassId");
        C6496s.h(fVar, "enumEntryName");
        this.f73559b = bVar;
        this.f73560c = fVar;
    }

    public S a(H h10) {
        C5366d0 p10;
        C6496s.h(h10, "module");
        C5487e b10 = C5506y.b(h10, this.f73559b);
        if (b10 != null) {
            if (!C6691i.A(b10)) {
                b10 = null;
            }
            if (!(b10 == null || (p10 = b10.p()) == null)) {
                return p10;
            }
        }
        return l.d(Hg.k.ERROR_ENUM_TYPE, this.f73559b.toString(), this.f73560c.toString());
    }

    public final f c() {
        return this.f73560c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f73559b.h());
        sb2.append('.');
        sb2.append(this.f73560c);
        return sb2.toString();
    }
}
