package k4;

import kotlin.jvm.internal.C6496s;
import qf.C6658d;

/* renamed from: k4.f  reason: case insensitive filesystem */
public final class C3664f implements C3668j {

    /* renamed from: b  reason: collision with root package name */
    private final C3667i f45111b;

    public C3664f(C3667i iVar) {
        this.f45111b = iVar;
    }

    public Object b(C6658d dVar) {
        return this.f45111b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3664f) || !C6496s.c(this.f45111b, ((C3664f) obj).f45111b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45111b.hashCode();
    }
}
