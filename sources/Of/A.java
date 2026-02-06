package Of;

import Jg.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

public final class A extends r0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f64441a;

    /* renamed from: b  reason: collision with root package name */
    private final j f64442b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A(f fVar, j jVar) {
        super((DefaultConstructorMarker) null);
        C6496s.h(fVar, "underlyingPropertyName");
        C6496s.h(jVar, "underlyingType");
        this.f64441a = fVar;
        this.f64442b = jVar;
    }

    public boolean a(f fVar) {
        C6496s.h(fVar, "name");
        return C6496s.c(this.f64441a, fVar);
    }

    public final f c() {
        return this.f64441a;
    }

    public final j d() {
        return this.f64442b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f64441a + ", underlyingType=" + this.f64442b + ')';
    }
}
