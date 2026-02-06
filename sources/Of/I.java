package Of;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;
import ng.f;

public final class I extends r0 {

    /* renamed from: a  reason: collision with root package name */
    private final List f64452a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f64453b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(List list) {
        super((DefaultConstructorMarker) null);
        C6496s.h(list, "underlyingPropertyNamesToTypes");
        this.f64452a = list;
        Map w10 = O.w(c());
        if (w10.size() == c().size()) {
            this.f64453b = w10;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names");
    }

    public boolean a(f fVar) {
        C6496s.h(fVar, "name");
        return this.f64453b.containsKey(fVar);
    }

    public List c() {
        return this.f64452a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
