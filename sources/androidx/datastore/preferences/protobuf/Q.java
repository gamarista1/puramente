package androidx.datastore.preferences.protobuf;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

abstract class Q {
    private static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof C1734g) {
                return obj.equals(C1734g.f16324b);
            }
            if (obj instanceof O) {
                if (obj == ((O) obj).d()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum)) {
                return false;
            } else {
                if (((Enum) obj).ordinal() == 0) {
                    return true;
                }
                return false;
            }
        }
    }

    static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c10 : (List) obj) {
                c(sb2, i10, str, c10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c11 : ((Map) obj).entrySet()) {
                c(sb2, i10, str, c11);
            }
        } else {
            sb2.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(j0.c((String) obj));
                sb2.append('\"');
            } else if (obj instanceof C1734g) {
                sb2.append(": \"");
                sb2.append(j0.a((C1734g) obj));
                sb2.append('\"');
            } else if (obj instanceof C1749w) {
                sb2.append(" {");
                d((C1749w) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                c(sb2, i13, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
                c(sb2, i13, "value", entry.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    private static void d(O o10, StringBuilder sb2, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : o10.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(b.au)) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst(b.au, "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i10, a(str2), C1749w.w(method2, o10, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), C1749w.w(method3, o10, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey(b.au + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get(b.au + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object w10 = C1749w.w(method4, o10, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) C1749w.w(method5, o10, new Object[0])).booleanValue();
                    } else if (b(w10)) {
                        z10 = false;
                    }
                    if (z10) {
                        c(sb2, i10, a(str4), w10);
                    }
                }
            }
        }
        m0 m0Var = ((C1749w) o10).unknownFields;
        if (m0Var != null) {
            m0Var.m(sb2, i10);
        }
    }

    static String e(O o10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(o10, sb2, 0);
        return sb2.toString();
    }
}
