package Ff;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import yf.C6798l;

final class u implements ParameterizedType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Class f62898a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f62899b;

    /* renamed from: c  reason: collision with root package name */
    private final Type[] f62900c;

    /* synthetic */ class a extends C6494p implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62901a = new a();

        a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* renamed from: i */
        public final String invoke(Type type) {
            C6496s.h(type, "p0");
            return w.h(type);
        }
    }

    public u(Class cls, Type type, List list) {
        C6496s.h(cls, "rawType");
        C6496s.h(list, "typeArguments");
        this.f62898a = cls;
        this.f62899b = type;
        this.f62900c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!C6496s.c(this.f62898a, parameterizedType.getRawType()) || !C6496s.c(this.f62899b, parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getActualTypeArguments() {
        return this.f62900c;
    }

    public Type getOwnerType() {
        return this.f62899b;
    }

    public Type getRawType() {
        return this.f62898a;
    }

    public String getTypeName() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f62899b;
        if (type != null) {
            sb2.append(w.h(type));
            sb2.append("$");
            sb2.append(this.f62898a.getSimpleName());
        } else {
            sb2.append(w.h(this.f62898a));
        }
        Type[] typeArr = this.f62900c;
        if (typeArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C6559l.z0(typeArr, sb2, (CharSequence) null, "<", ">", 0, (CharSequence) null, a.f62901a, 50, (Object) null);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f62898a.hashCode();
        Type type = this.f62899b;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return (hashCode ^ i10) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
