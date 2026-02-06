package Ff;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class x implements WildcardType, Type {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62905c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final x f62906d = new x((Type) null, (Type) null);

    /* renamed from: a  reason: collision with root package name */
    private final Type f62907a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f62908b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return x.f62906d;
        }

        private a() {
        }
    }

    public x(Type type, Type type2) {
        this.f62907a = type;
        this.f62908b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (!Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) || !Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getLowerBounds() {
        Type type = this.f62908b;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        if (this.f62908b != null) {
            return "? super " + w.h(this.f62908b);
        }
        Type type = this.f62907a;
        if (type == null || C6496s.c(type, Object.class)) {
            return "?";
        }
        return "? extends " + w.h(this.f62907a);
    }

    public Type[] getUpperBounds() {
        Type type = this.f62907a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
