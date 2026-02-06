package Ff;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import lf.t;
import mf.C6565s;

final class v implements TypeVariable, Type {

    /* renamed from: a  reason: collision with root package name */
    private final q f62902a;

    public v(q qVar) {
        C6496s.h(qVar, "typeParameter");
        this.f62902a = qVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (!C6496s.c(getName(), typeVariable.getName()) || !C6496s.c(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getBounds() {
        Iterable<p> upperBounds = this.f62902a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C6565s.y(upperBounds, 10));
        for (p a10 : upperBounds) {
            arrayList.add(w.c(a10, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new t("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f62902a));
    }

    public String getName() {
        return this.f62902a.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
