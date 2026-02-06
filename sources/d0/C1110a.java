package D0;

import kotlin.jvm.internal.C6496s;

/* renamed from: D0.a  reason: case insensitive filesystem */
public final class C1110a implements C1130v {

    /* renamed from: b  reason: collision with root package name */
    private final int f1452b;

    public C1110a(int i10) {
        this.f1452b = i10;
    }

    public final int a() {
        return this.f1452b;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(C1110a.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f1452b != ((C1110a) obj).f1452b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f1452b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f1452b + ')';
    }
}
