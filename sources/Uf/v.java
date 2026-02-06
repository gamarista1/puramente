package Uf;

import eg.C5836m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.b;
import ng.f;

public final class v extends C5555h implements C5836m {

    /* renamed from: c  reason: collision with root package name */
    private final Enum f65268c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(f fVar, Enum enumR) {
        super(fVar, (DefaultConstructorMarker) null);
        C6496s.h(enumR, "value");
        this.f65268c = enumR;
    }

    public b d() {
        Class<?> cls = this.f65268c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C6496s.e(cls);
        return C5553f.e(cls);
    }

    public f e() {
        return f.i(this.f65268c.name());
    }
}
