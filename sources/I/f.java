package I;

import c1.t;
import kotlin.jvm.internal.C6496s;
import q0.C2416b;
import q0.C2423i;
import q0.C2426l;
import q0.C2428n;
import r0.O1;

public final class f extends a {
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    public O1 c(long j10, float f10, float f11, float f12, float f13, t tVar) {
        float f14;
        float f15;
        float f16;
        float f17;
        t tVar2 = tVar;
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new O1.b(C2428n.c(j10));
        }
        C2423i c10 = C2428n.c(j10);
        t tVar3 = t.Ltr;
        if (tVar2 == tVar3) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        long b10 = C2416b.b(f14, 0.0f, 2, (Object) null);
        if (tVar2 == tVar3) {
            f15 = f11;
        } else {
            f15 = f10;
        }
        long b11 = C2416b.b(f15, 0.0f, 2, (Object) null);
        if (tVar2 == tVar3) {
            f16 = f12;
        } else {
            f16 = f13;
        }
        long b12 = C2416b.b(f16, 0.0f, 2, (Object) null);
        if (tVar2 == tVar3) {
            f17 = f13;
        } else {
            f17 = f12;
        }
        return new O1.c(C2426l.b(c10, b10, b11, b12, C2416b.b(f17, 0.0f, 2, (Object) null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (C6496s.c(g(), fVar.g()) && C6496s.c(f(), fVar.f()) && C6496s.c(d(), fVar.d()) && C6496s.c(e(), fVar.e())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public f a(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public int hashCode() {
        return (((((g().hashCode() * 31) + f().hashCode()) * 31) + d().hashCode()) * 31) + e().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + g() + ", topEnd = " + f() + ", bottomEnd = " + d() + ", bottomStart = " + e() + ')';
    }
}
