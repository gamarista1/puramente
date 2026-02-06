package Nh;

import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f64345a = String.valueOf('.');

    /* renamed from: b  reason: collision with root package name */
    public static final String f64346b = String.valueOf('$');

    /* renamed from: c  reason: collision with root package name */
    private static final Map f64347c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f64348d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Map f64349e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Map f64350f = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f64347c = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        for (Class cls2 : hashMap.keySet()) {
            Class cls3 = (Class) f64347c.get(cls2);
            if (!cls2.equals(cls3)) {
                f64348d.put(cls3, cls2);
            }
        }
        a("int", "I");
        a(AttributeType.BOOLEAN, "Z");
        a(AttributeType.FLOAT, "F");
        a(Constants.LONG, "J");
        a("short", "S");
        a("byte", "B");
        a("double", "D");
        a("char", "C");
    }

    private static void a(String str, String str2) {
        f64349e.put(str, str2);
        f64350f.put(str2, str);
    }

    public static String b(Class cls) {
        if (cls == null) {
            return "";
        }
        return c(cls.getName());
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb2.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
        }
        Map map = f64350f;
        if (map.containsKey(str)) {
            str = (String) map.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i10 = lastIndexOf + 1;
        }
        int indexOf = str.indexOf(36, i10);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + sb2;
    }
}
