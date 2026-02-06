package xf;

import Ff.d;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C6486h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;

/* renamed from: xf.a  reason: case insensitive filesystem */
public abstract class C6781a {
    public static final d a(Annotation annotation) {
        C6496s.h(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        C6496s.g(annotationType, "annotationType(...)");
        d e10 = e(annotationType);
        C6496s.f(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return e10;
    }

    public static final Class b(d dVar) {
        C6496s.h(dVar, "<this>");
        Class f10 = ((C6486h) dVar).f();
        C6496s.f(f10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return f10;
    }

    public static final Class c(d dVar) {
        C6496s.h(dVar, "<this>");
        Class f10 = ((C6486h) dVar).f();
        if (!f10.isPrimitive()) {
            C6496s.f(f10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return f10;
        }
        String name = f10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    f10 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    f10 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    f10 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    f10 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    f10 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    f10 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(AttributeType.BOOLEAN)) {
                    f10 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(AttributeType.FLOAT)) {
                    f10 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    f10 = Short.class;
                    break;
                }
                break;
        }
        C6496s.f(f10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return f10;
    }

    public static final Class d(d dVar) {
        C6496s.h(dVar, "<this>");
        Class f10 = ((C6486h) dVar).f();
        if (f10.isPrimitive()) {
            C6496s.f(f10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return f10;
        }
        String name = f10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final d e(Class cls) {
        C6496s.h(cls, "<this>");
        return O.b(cls);
    }
}
