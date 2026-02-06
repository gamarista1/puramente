package Z3;

import X3.g;
import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10467a;

    /* renamed from: b  reason: collision with root package name */
    private final p f10468b;

    /* renamed from: c  reason: collision with root package name */
    private final g f10469c;

    public i(Object obj, p pVar, g gVar) {
        this.f10467a = obj;
        this.f10468b = pVar;
        this.f10469c = gVar;
    }

    public final g a() {
        return this.f10469c;
    }

    public final Object b() {
        return this.f10467a;
    }

    public final p c() {
        return this.f10468b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (!this.f10468b.d(this.f10467a, iVar.f10467a) || !C6496s.c(this.f10469c, iVar.f10469c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f10468b.c(this.f10467a) * 31) + this.f10469c.hashCode();
    }
}
