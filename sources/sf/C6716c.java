package sf;

import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sf.c  reason: case insensitive filesystem */
public final class C6716c implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final a f73527b = new a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Class f73528a;

    /* renamed from: sf.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6716c(Enum[] enumArr) {
        C6496s.h(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        C6496s.e(componentType);
        this.f73528a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f73528a.getEnumConstants();
        C6496s.g(enumConstants, "getEnumConstants(...)");
        return C6714a.a((Enum[]) enumConstants);
    }
}
