package com.fasterxml.jackson.databind.util;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class BeanUtil {
    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == null || !rawType.isArray() || (packageName = ClassUtil.getPackageName(rawType.getComponentType())) == null || !packageName.contains(".cglib") || (!packageName.startsWith("net.sf.cglib") && !packageName.startsWith("org.hibernate.repackage.cglib") && !packageName.startsWith("org.springframework.cglib"))) {
            return false;
        }
        return true;
    }

    protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == null || rawType.isArray() || (packageName = ClassUtil.getPackageName(rawType)) == null || !packageName.startsWith("groovy.lang")) {
            return false;
        }
        return true;
    }

    protected static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawParameterType(0));
        if (packageName == null || !packageName.startsWith("groovy.lang")) {
            return false;
        }
        return true;
    }

    protected static String legacyManglePropertyName(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char charAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb2.append(str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z10) {
        String name = annotatedMethod.getName();
        String okNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z10);
        return okNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z10) : okNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z10 ? stdManglePropertyName(str, 2) : legacyManglePropertyName(str, 2);
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        String name = annotatedMethod.getName();
        if (!name.startsWith(str)) {
            return null;
        }
        int length = str.length();
        return z10 ? stdManglePropertyName(name, length) : legacyManglePropertyName(name, length);
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        if (!str.startsWith(b.au)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return z10 ? stdManglePropertyName(str, 3) : legacyManglePropertyName(str, 3);
    }

    public static String okNameForSetter(AnnotatedMethod annotatedMethod, boolean z10) {
        String okNameForMutator = okNameForMutator(annotatedMethod, "set", z10);
        if (okNameForMutator == null) {
            return null;
        }
        if (!"metaClass".equals(okNameForMutator) || !isGroovyMetaClassSetter(annotatedMethod)) {
            return okNameForMutator;
        }
        return null;
    }

    protected static String stdManglePropertyName(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append(str, i11, length);
        return sb2.toString();
    }

    @Deprecated
    public static String okNameForSetter(AnnotatedMethod annotatedMethod) {
        return okNameForSetter(annotatedMethod, false);
    }

    @Deprecated
    public static String okNameForGetter(AnnotatedMethod annotatedMethod) {
        return okNameForGetter(annotatedMethod, false);
    }

    @Deprecated
    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str) {
        return okNameForMutator(annotatedMethod, str, false);
    }

    @Deprecated
    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
        return okNameForIsGetter(annotatedMethod, str, false);
    }

    @Deprecated
    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
        return okNameForRegularGetter(annotatedMethod, str, false);
    }
}
