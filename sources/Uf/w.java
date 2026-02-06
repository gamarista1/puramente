package Uf;

import Uf.E;
import eg.C5837n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C6496s;

public final class w extends y implements C5837n {

    /* renamed from: a  reason: collision with root package name */
    private final Field f65269a;

    public w(Field field) {
        C6496s.h(field, "member");
        this.f65269a = field;
    }

    public boolean K() {
        return S().isEnumConstant();
    }

    public boolean P() {
        return false;
    }

    /* renamed from: U */
    public Field S() {
        return this.f65269a;
    }

    /* renamed from: V */
    public E getType() {
        E.a aVar = E.f65217a;
        Type genericType = S().getGenericType();
        C6496s.g(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
