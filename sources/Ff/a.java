package Ff;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C6496s;

final class a implements GenericArrayType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Type f62876a;

    public a(Type type) {
        C6496s.h(type, "elementType");
        this.f62876a = type;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType) || !C6496s.c(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return false;
        }
        return true;
    }

    public Type getGenericComponentType() {
        return this.f62876a;
    }

    public String getTypeName() {
        return w.h(this.f62876a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
